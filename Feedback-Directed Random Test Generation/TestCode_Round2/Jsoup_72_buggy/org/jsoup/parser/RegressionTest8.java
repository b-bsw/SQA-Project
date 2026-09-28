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
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.consumeTagName();
        characterReader1.advance();
        boolean boolean11 = characterReader1.rangeEquals(32768, (int) (short) 10, "hi");
        char char12 = characterReader1.current();
        java.lang.String str13 = characterReader1.consumeDigitSequence();
        boolean boolean15 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str16 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str19 = characterReader18.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str23 = characterReader21.consumeTo('4');
        characterReader21.rewindToMark();
        java.lang.String str25 = characterReader21.consumeData();
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str29 = characterReader27.consumeTo('4');
        characterReader27.rewindToMark();
        boolean boolean34 = characterReader27.rangeEquals(32768, 32768, "hi!");
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("");
        characterReader36.advance();
        boolean boolean39 = characterReader36.containsIgnoreCase("hi!");
        java.lang.String str40 = characterReader36.consumeToEnd();
        java.lang.String str41 = characterReader36.toString();
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("");
        characterReader43.advance();
        characterReader43.mark();
        boolean boolean47 = characterReader43.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str51 = characterReader49.consumeTo('a');
        char[] charArray53 = new char[] { '#' };
        java.lang.String str54 = characterReader49.consumeToAnySorted(charArray53);
        java.lang.String str55 = characterReader43.consumeToAny(charArray53);
        boolean boolean56 = characterReader36.matchesAnySorted(charArray53);
        java.lang.String str57 = characterReader27.consumeToAny(charArray53);
        boolean boolean58 = characterReader21.matchesAny(charArray53);
        java.lang.String str59 = characterReader18.consumeToAnySorted(charArray53);
        boolean boolean60 = characterReader1.matchesAnySorted(charArray53);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        java.lang.String str7 = characterReader1.consumeHexSequence();
        java.lang.String str8 = characterReader1.consumeData();
        char[] charArray11 = new char[] { '#', '4' };
        boolean boolean12 = characterReader1.matchesAnySorted(charArray11);
        char char13 = characterReader1.current();
        java.lang.String str14 = characterReader1.consumeToEnd();
        java.lang.String str15 = characterReader1.consumeLetterSequence();
        int int17 = characterReader1.nextIndexOf('a');
        java.lang.String str18 = characterReader1.consumeLetterThenDigitSequence();
        characterReader1.advance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matchConsumeIgnoreCase("");
        int int5 = characterReader1.nextIndexOf('#');
        boolean boolean7 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean9 = characterReader1.matchesIgnoreCase("i!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        boolean boolean10 = characterReader1.rangeEquals((int) (short) 100, (-1), "i!");
        boolean boolean11 = characterReader1.isEmpty();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("");
        characterReader3.advance();
        characterReader3.mark();
        boolean boolean7 = characterReader3.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str11 = characterReader9.consumeTo('a');
        char[] charArray13 = new char[] { '#' };
        java.lang.String str14 = characterReader9.consumeToAnySorted(charArray13);
        java.lang.String str15 = characterReader3.consumeToAny(charArray13);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray13);
        java.lang.String str17 = characterReader1.consumeToEnd();
        java.lang.String str18 = characterReader1.consumeData();
        java.lang.String str19 = characterReader1.consumeLetterSequence();
        boolean boolean20 = characterReader1.matchesDigit();
        characterReader1.rewindToMark();
        java.lang.String str22 = characterReader1.consumeLetterSequence();
        characterReader1.mark();
        java.lang.String str24 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        boolean boolean5 = characterReader1.isEmpty();
        java.lang.String str7 = characterReader1.consumeTo('\uffff');
        int int9 = characterReader1.nextIndexOf(' ');
        boolean boolean10 = characterReader1.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean14 = characterReader12.matchesIgnoreCase("");
        int int16 = characterReader12.nextIndexOf('a');
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("");
        characterReader18.advance();
        boolean boolean21 = characterReader18.containsIgnoreCase("hi!");
        char[] charArray27 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean28 = characterReader18.matchesAny(charArray27);
        boolean boolean29 = characterReader12.matchesAnySorted(charArray27);
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("");
        characterReader31.advance();
        characterReader31.mark();
        boolean boolean35 = characterReader31.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str39 = characterReader37.consumeTo('a');
        char[] charArray41 = new char[] { '#' };
        java.lang.String str42 = characterReader37.consumeToAnySorted(charArray41);
        java.lang.String str43 = characterReader31.consumeToAny(charArray41);
        boolean boolean44 = characterReader12.matchesAny(charArray41);
        java.lang.String str45 = characterReader1.consumeToAny(charArray41);
        boolean boolean46 = characterReader1.matchesLetter();
        boolean boolean47 = characterReader1.matchesDigit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.toString();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str9 = characterReader1.consumeData();
        int int11 = characterReader1.nextIndexOf('#');
        boolean boolean13 = characterReader1.matchConsume("");
        int int15 = characterReader1.nextIndexOf((java.lang.CharSequence) "!");
        boolean boolean17 = characterReader1.matchConsumeIgnoreCase("h");
        char char18 = characterReader1.current();
        characterReader1.unconsume();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\uffff' + "'", char18 == '\uffff');
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeData();
        char[] charArray6 = new char[] {};
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        boolean boolean11 = characterReader1.rangeEquals((int) (byte) 1, 1, "");
        int int13 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        boolean boolean17 = characterReader1.rangeEquals(32768, 10, "hi");
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        characterReader19.advance();
        boolean boolean22 = characterReader19.containsIgnoreCase("hi!");
        java.lang.String str23 = characterReader19.consumeData();
        java.lang.String str25 = characterReader19.consumeTo(' ');
        java.lang.String str27 = characterReader19.consumeTo("hi");
        java.lang.String str28 = characterReader19.consumeTagName();
        boolean boolean30 = characterReader19.matches("hi");
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        characterReader32.advance();
        characterReader32.mark();
        characterReader32.mark();
        java.lang.String str36 = characterReader32.consumeHexSequence();
        java.lang.String str37 = characterReader32.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("");
        characterReader39.advance();
        boolean boolean42 = characterReader39.containsIgnoreCase("hi!");
        java.lang.String str43 = characterReader39.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        characterReader45.advance();
        characterReader45.mark();
        boolean boolean49 = characterReader45.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str53 = characterReader51.consumeTo('a');
        char[] charArray55 = new char[] { '#' };
        java.lang.String str56 = characterReader51.consumeToAnySorted(charArray55);
        java.lang.String str57 = characterReader45.consumeToAny(charArray55);
        boolean boolean58 = characterReader39.matchesAnySorted(charArray55);
        boolean boolean59 = characterReader39.matchesDigit();
        boolean boolean63 = characterReader39.rangeEquals((int) (short) 100, (int) (short) 10, "");
        org.jsoup.parser.CharacterReader characterReader65 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str67 = characterReader65.consumeTo('4');
        characterReader65.rewindToMark();
        int int69 = characterReader65.pos();
        boolean boolean71 = characterReader65.matches(' ');
        int int73 = characterReader65.nextIndexOf((java.lang.CharSequence) "hi!");
        org.jsoup.parser.CharacterReader characterReader75 = new org.jsoup.parser.CharacterReader("");
        characterReader75.advance();
        boolean boolean78 = characterReader75.containsIgnoreCase("hi!");
        char[] charArray84 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean85 = characterReader75.matchesAny(charArray84);
        java.lang.String str86 = characterReader65.consumeToAnySorted(charArray84);
        java.lang.String str87 = characterReader39.consumeToAny(charArray84);
        boolean boolean91 = org.jsoup.parser.CharacterReader.rangeEquals(charArray84, (int) (short) 0, (int) (short) -1, "");
        boolean boolean92 = characterReader32.matchesAny(charArray84);
        java.lang.String str93 = characterReader19.consumeToAny(charArray84);
        boolean boolean94 = characterReader1.matchesAny(charArray84);
        int int96 = characterReader1.nextIndexOf('a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertArrayEquals(charArray84, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean8 = characterReader1.rangeEquals(1, (int) (byte) 0, "hi!");
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str12 = characterReader10.consumeTo('4');
        characterReader10.rewindToMark();
        java.lang.String str14 = characterReader10.consumeData();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str18 = characterReader16.consumeTo('4');
        characterReader16.rewindToMark();
        boolean boolean23 = characterReader16.rangeEquals(32768, 32768, "hi!");
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        characterReader25.advance();
        boolean boolean28 = characterReader25.containsIgnoreCase("hi!");
        java.lang.String str29 = characterReader25.consumeToEnd();
        java.lang.String str30 = characterReader25.toString();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        characterReader32.advance();
        characterReader32.mark();
        boolean boolean36 = characterReader32.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str40 = characterReader38.consumeTo('a');
        char[] charArray42 = new char[] { '#' };
        java.lang.String str43 = characterReader38.consumeToAnySorted(charArray42);
        java.lang.String str44 = characterReader32.consumeToAny(charArray42);
        boolean boolean45 = characterReader25.matchesAnySorted(charArray42);
        java.lang.String str46 = characterReader16.consumeToAny(charArray42);
        boolean boolean47 = characterReader10.matchesAny(charArray42);
        boolean boolean48 = characterReader1.matchesAnySorted(charArray42);
        java.lang.String str49 = characterReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeToEnd();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str4 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        int int7 = characterReader1.nextIndexOf((java.lang.CharSequence) "!");
        boolean boolean9 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str11 = characterReader1.consumeTo('#');
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = characterReader1.containsIgnoreCase("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        boolean boolean7 = characterReader1.matchConsume("hi!");
        boolean boolean8 = characterReader1.matchesLetter();
        int int10 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str14 = characterReader12.consumeTo('a');
        char[] charArray16 = new char[] { '#' };
        java.lang.String str17 = characterReader12.consumeToAnySorted(charArray16);
        java.lang.String str18 = characterReader12.consumeLetterSequence();
        characterReader12.mark();
        characterReader12.advance();
        boolean boolean24 = characterReader12.rangeEquals((int) (byte) 1, (int) (short) 1, "");
        char char25 = characterReader12.consume();
        characterReader12.unconsume();
        boolean boolean28 = characterReader12.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str32 = characterReader30.consumeTo('a');
        char[] charArray34 = new char[] { '#' };
        java.lang.String str35 = characterReader30.consumeToAnySorted(charArray34);
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str39 = characterReader37.consumeTo('a');
        java.lang.String str40 = characterReader37.consumeLetterSequence();
        boolean boolean41 = characterReader37.isEmpty();
        int int43 = characterReader37.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str44 = characterReader37.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader46 = new org.jsoup.parser.CharacterReader("");
        characterReader46.advance();
        char char48 = characterReader46.consume();
        java.lang.String str49 = characterReader46.consumeTagName();
        int int50 = characterReader46.pos();
        org.jsoup.parser.CharacterReader characterReader52 = new org.jsoup.parser.CharacterReader("");
        characterReader52.advance();
        boolean boolean55 = characterReader52.containsIgnoreCase("hi!");
        boolean boolean57 = characterReader52.matches("hi");
        java.lang.String str58 = characterReader52.consumeTagName();
        char[] charArray61 = new char[] { '4', ' ' };
        java.lang.String str62 = characterReader52.consumeToAnySorted(charArray61);
        boolean boolean63 = characterReader46.matchesAnySorted(charArray61);
        java.lang.String str64 = characterReader37.consumeToAny(charArray61);
        boolean boolean65 = characterReader30.matchesAny(charArray61);
        java.lang.String str66 = characterReader30.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader68 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str70 = characterReader68.consumeTo('a');
        char[] charArray72 = new char[] { '#' };
        java.lang.String str73 = characterReader68.consumeToAnySorted(charArray72);
        boolean boolean77 = org.jsoup.parser.CharacterReader.rangeEquals(charArray72, (int) '\uffff', (int) 'h', "hi");
        boolean boolean78 = characterReader30.matchesAny(charArray72);
        boolean boolean79 = characterReader12.matchesAnySorted(charArray72);
        boolean boolean80 = characterReader1.matchesAnySorted(charArray72);
        boolean boolean82 = characterReader1.matches('h');
        boolean boolean84 = characterReader1.matchConsume("i");
        char char85 = characterReader1.consume();
        int int87 = characterReader1.nextIndexOf((java.lang.CharSequence) "i");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\uffff' + "'", char25 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + char48 + "' != '" + '\uffff' + "'", char48 == '\uffff');
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + char85 + "' != '" + '\uffff' + "'", char85 == '\uffff');
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str3 = characterReader1.consumeTo('4');
        characterReader1.rewindToMark();
        int int5 = characterReader1.pos();
        java.lang.String str6 = characterReader1.consumeToEnd();
        boolean boolean8 = characterReader1.matches("");
        java.lang.String str9 = characterReader1.consumeHexSequence();
        boolean boolean13 = characterReader1.rangeEquals((int) '!', 0, "h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        char char3 = characterReader1.consume();
        java.lang.String str4 = characterReader1.consumeTagName();
        int int5 = characterReader1.pos();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        characterReader7.advance();
        boolean boolean10 = characterReader7.containsIgnoreCase("hi!");
        boolean boolean12 = characterReader7.matches("hi");
        java.lang.String str13 = characterReader7.consumeTagName();
        char[] charArray16 = new char[] { '4', ' ' };
        java.lang.String str17 = characterReader7.consumeToAnySorted(charArray16);
        boolean boolean18 = characterReader1.matchesAnySorted(charArray16);
        characterReader1.mark();
        char char20 = characterReader1.current();
        boolean boolean24 = characterReader1.rangeEquals(10, 100, "hi!");
        boolean boolean26 = characterReader1.matches('#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\uffff' + "'", char20 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.matchesIgnoreCase("!");
        boolean boolean6 = characterReader1.containsIgnoreCase("!");
        boolean boolean10 = characterReader1.rangeEquals(0, (int) (byte) 10, "");
        boolean boolean12 = characterReader1.matchConsumeIgnoreCase("!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean6 = characterReader1.matches("hi");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeHexSequence();
        java.lang.String str9 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean11 = characterReader1.matches('4');
        java.lang.String str12 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str3 = characterReader1.consumeTo('4');
        characterReader1.rewindToMark();
        int int5 = characterReader1.pos();
        boolean boolean6 = characterReader1.matchesDigit();
        char char7 = characterReader1.current();
        java.lang.String str8 = characterReader1.consumeTagName();
        int int10 = characterReader1.nextIndexOf('h');
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str14 = characterReader12.consumeTo('a');
        char[] charArray16 = new char[] { '#' };
        java.lang.String str17 = characterReader12.consumeToAnySorted(charArray16);
        java.lang.String str18 = characterReader12.consumeLetterSequence();
        characterReader12.mark();
        characterReader12.advance();
        boolean boolean24 = characterReader12.rangeEquals((int) (byte) 1, (int) (short) 1, "");
        boolean boolean26 = characterReader12.matchesIgnoreCase("");
        java.lang.String str27 = characterReader12.consumeHexSequence();
        java.lang.String str29 = characterReader12.consumeTo('\uffff');
        java.lang.String str30 = characterReader12.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str34 = characterReader32.consumeTo('a');
        char[] charArray36 = new char[] { '#' };
        java.lang.String str37 = characterReader32.consumeToAnySorted(charArray36);
        char char38 = characterReader32.current();
        boolean boolean40 = characterReader32.matchConsume("");
        characterReader32.advance();
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("");
        characterReader43.advance();
        boolean boolean46 = characterReader43.containsIgnoreCase("hi!");
        java.lang.String str47 = characterReader43.consumeToEnd();
        boolean boolean49 = characterReader43.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("");
        characterReader51.advance();
        boolean boolean54 = characterReader51.containsIgnoreCase("hi!");
        char[] charArray60 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean61 = characterReader51.matchesAny(charArray60);
        boolean boolean62 = characterReader43.matchesAnySorted(charArray60);
        boolean boolean63 = characterReader32.matchesAnySorted(charArray60);
        boolean boolean64 = characterReader12.matchesAnySorted(charArray60);
        java.lang.String str65 = characterReader1.consumeToAny(charArray60);
        boolean boolean69 = org.jsoup.parser.CharacterReader.rangeEquals(charArray60, (int) (short) 1, (int) (short) 1, "!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'h' + "'", char7 == 'h');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + '\uffff' + "'", char38 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = characterReader1.consumeToAnySorted(charArray5);
        java.lang.String str7 = characterReader1.consumeLetterSequence();
        characterReader1.mark();
        characterReader1.advance();
        boolean boolean13 = characterReader1.rangeEquals((int) (byte) 1, (int) (short) 1, "");
        boolean boolean15 = characterReader1.matchesIgnoreCase("");
        java.lang.String str16 = characterReader1.consumeHexSequence();
        java.lang.String str18 = characterReader1.consumeTo('\uffff');
        boolean boolean22 = characterReader1.rangeEquals(0, (int) '4', "hi!");
        int int23 = characterReader1.pos();
        java.lang.String str24 = characterReader1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        characterReader8.advance();
        boolean boolean11 = characterReader8.containsIgnoreCase("hi!");
        char[] charArray17 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean18 = characterReader8.matchesAny(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        char char20 = characterReader1.current();
        boolean boolean21 = characterReader1.isEmpty();
        java.lang.String str22 = characterReader1.toString();
        java.lang.String str23 = characterReader1.consumeData();
        java.lang.String str24 = characterReader1.consumeData();
        boolean boolean26 = characterReader1.matches("!");
        characterReader1.rewindToMark();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\uffff' + "'", char20 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        boolean boolean5 = characterReader1.isEmpty();
        char[] charArray12 = new char[] { ' ', '\uffff', ' ', '4', '4', 'a' };
        java.lang.String str13 = characterReader1.consumeToAny(charArray12);
        java.lang.String str14 = characterReader1.consumeData();
        boolean boolean15 = characterReader1.matchesDigit();
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', '\uffff', ' ', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeData();
        char[] charArray6 = new char[] {};
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray10 = new char[] { '4', '#' };
        java.lang.String str11 = characterReader1.consumeToAny(charArray10);
        boolean boolean13 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 1, count -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        boolean boolean5 = characterReader1.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str9 = characterReader7.consumeTo('a');
        char[] charArray11 = new char[] { '#' };
        java.lang.String str12 = characterReader7.consumeToAnySorted(charArray11);
        java.lang.String str13 = characterReader1.consumeToAny(charArray11);
        boolean boolean17 = characterReader1.rangeEquals((int) (short) 1, 0, "");
        boolean boolean18 = characterReader1.matchesLetter();
        java.lang.String str19 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean23 = characterReader21.matchesIgnoreCase("");
        int int25 = characterReader21.nextIndexOf('a');
        java.lang.String str26 = characterReader21.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        characterReader28.advance();
        boolean boolean31 = characterReader28.containsIgnoreCase("hi!");
        java.lang.String str32 = characterReader28.consumeToEnd();
        java.lang.String str33 = characterReader28.toString();
        int int35 = characterReader28.nextIndexOf((java.lang.CharSequence) "hi");
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("");
        characterReader37.advance();
        characterReader37.mark();
        boolean boolean41 = characterReader37.matchesIgnoreCase("");
        java.lang.String str42 = characterReader37.toString();
        org.jsoup.parser.CharacterReader characterReader44 = new org.jsoup.parser.CharacterReader("");
        characterReader44.advance();
        characterReader44.mark();
        characterReader44.mark();
        boolean boolean48 = characterReader44.isEmpty();
        boolean boolean50 = characterReader44.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader52 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader54 = new org.jsoup.parser.CharacterReader("");
        characterReader54.advance();
        characterReader54.mark();
        boolean boolean58 = characterReader54.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader60 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str62 = characterReader60.consumeTo('a');
        char[] charArray64 = new char[] { '#' };
        java.lang.String str65 = characterReader60.consumeToAnySorted(charArray64);
        java.lang.String str66 = characterReader54.consumeToAny(charArray64);
        boolean boolean67 = characterReader52.matchesAnySorted(charArray64);
        java.lang.String str68 = characterReader44.consumeToAny(charArray64);
        boolean boolean69 = characterReader37.matchesAnySorted(charArray64);
        boolean boolean70 = characterReader28.matchesAnySorted(charArray64);
        boolean boolean74 = org.jsoup.parser.CharacterReader.rangeEquals(charArray64, (int) (short) 1, (int) (short) -1, "hi");
        java.lang.String str75 = characterReader21.consumeToAnySorted(charArray64);
        java.lang.String str76 = characterReader1.consumeToAnySorted(charArray64);
        boolean boolean80 = characterReader1.rangeEquals(100, (int) (short) -1, "hi");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi" + "'", str26, "hi");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "!" + "'", str75, "!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        boolean boolean5 = characterReader1.isEmpty();
        characterReader1.rewindToMark();
        java.lang.String str8 = characterReader1.consumeTo('4');
        boolean boolean10 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean12 = characterReader1.matchConsume("hi!");
        java.lang.String str13 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str17 = characterReader15.consumeTo('a');
        java.lang.String str18 = characterReader15.consumeLetterSequence();
        boolean boolean19 = characterReader15.isEmpty();
        java.lang.String str21 = characterReader15.consumeTo('\uffff');
        int int23 = characterReader15.nextIndexOf(' ');
        boolean boolean24 = characterReader15.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean28 = characterReader26.matchesIgnoreCase("");
        int int30 = characterReader26.nextIndexOf('a');
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        characterReader32.advance();
        boolean boolean35 = characterReader32.containsIgnoreCase("hi!");
        char[] charArray41 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean42 = characterReader32.matchesAny(charArray41);
        boolean boolean43 = characterReader26.matchesAnySorted(charArray41);
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        characterReader45.advance();
        characterReader45.mark();
        boolean boolean49 = characterReader45.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str53 = characterReader51.consumeTo('a');
        char[] charArray55 = new char[] { '#' };
        java.lang.String str56 = characterReader51.consumeToAnySorted(charArray55);
        java.lang.String str57 = characterReader45.consumeToAny(charArray55);
        boolean boolean58 = characterReader26.matchesAny(charArray55);
        java.lang.String str59 = characterReader15.consumeToAny(charArray55);
        boolean boolean60 = characterReader1.matchesAnySorted(charArray55);
        org.jsoup.parser.CharacterReader characterReader62 = new org.jsoup.parser.CharacterReader("");
        characterReader62.advance();
        boolean boolean65 = characterReader62.containsIgnoreCase("hi!");
        boolean boolean67 = characterReader62.matches("hi");
        int int68 = characterReader62.pos();
        java.lang.String str69 = characterReader62.consumeHexSequence();
        boolean boolean71 = characterReader62.matchesIgnoreCase("");
        java.lang.String str72 = characterReader62.toString();
        org.jsoup.parser.CharacterReader characterReader74 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean76 = characterReader74.matchesIgnoreCase("");
        boolean boolean78 = characterReader74.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader80 = new org.jsoup.parser.CharacterReader("");
        characterReader80.advance();
        boolean boolean83 = characterReader80.containsIgnoreCase("hi!");
        boolean boolean85 = characterReader80.matches("hi");
        java.lang.String str86 = characterReader80.consumeTagName();
        char[] charArray89 = new char[] { '4', ' ' };
        java.lang.String str90 = characterReader80.consumeToAnySorted(charArray89);
        java.lang.String str91 = characterReader74.consumeToAny(charArray89);
        java.lang.String str92 = characterReader62.consumeToAny(charArray89);
        java.lang.String str93 = characterReader1.consumeToAnySorted(charArray89);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(charArray89);
        org.junit.Assert.assertArrayEquals(charArray89, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "hi!" + "'", str91, "hi!");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        char char3 = characterReader1.consume();
        java.lang.String str4 = characterReader1.consumeTagName();
        int int5 = characterReader1.pos();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        characterReader7.advance();
        boolean boolean10 = characterReader7.containsIgnoreCase("hi!");
        boolean boolean12 = characterReader7.matches("hi");
        java.lang.String str13 = characterReader7.consumeTagName();
        char[] charArray16 = new char[] { '4', ' ' };
        java.lang.String str17 = characterReader7.consumeToAnySorted(charArray16);
        boolean boolean18 = characterReader1.matchesAnySorted(charArray16);
        boolean boolean20 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean21 = characterReader1.matchesDigit();
        java.lang.String str22 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str23 = characterReader1.consumeLetterSequence();
        char char24 = characterReader1.current();
        int int26 = characterReader1.nextIndexOf((java.lang.CharSequence) "h");
        java.lang.String str27 = characterReader1.consumeDigitSequence();
        boolean boolean28 = characterReader1.isEmpty();
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str32 = characterReader30.consumeTo('a');
        java.lang.String str33 = characterReader30.consumeLetterSequence();
        boolean boolean34 = characterReader30.isEmpty();
        char[] charArray41 = new char[] { ' ', '\uffff', ' ', '4', '4', 'a' };
        java.lang.String str42 = characterReader30.consumeToAny(charArray41);
        java.lang.String str43 = characterReader30.consumeData();
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean47 = characterReader45.matchesIgnoreCase("");
        int int49 = characterReader45.nextIndexOf('a');
        char char50 = characterReader45.current();
        boolean boolean52 = characterReader45.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader54 = new org.jsoup.parser.CharacterReader("");
        characterReader54.advance();
        characterReader54.mark();
        characterReader54.mark();
        java.lang.String str58 = characterReader54.consumeHexSequence();
        java.lang.String str59 = characterReader54.consumeLetterSequence();
        java.lang.String str60 = characterReader54.consumeHexSequence();
        java.lang.String str61 = characterReader54.consumeData();
        char[] charArray64 = new char[] { '#', '4' };
        boolean boolean65 = characterReader54.matchesAnySorted(charArray64);
        boolean boolean69 = org.jsoup.parser.CharacterReader.rangeEquals(charArray64, (-1), 0, "");
        java.lang.String str70 = characterReader45.consumeToAnySorted(charArray64);
        boolean boolean71 = characterReader30.matchesAnySorted(charArray64);
        boolean boolean72 = characterReader1.matchesAnySorted(charArray64);
        java.lang.String str73 = characterReader1.consumeLetterThenDigitSequence();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\uffff' + "'", char24 == '\uffff');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { ' ', '\uffff', ' ', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + char50 + "' != '" + 'h' + "'", char50 == 'h');
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.toString();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str9 = characterReader1.consumeData();
        java.lang.String str10 = characterReader1.toString();
        characterReader1.rewindToMark();
        java.lang.String str13 = characterReader1.consumeTo('#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str3 = characterReader1.consumeTo('4');
        characterReader1.rewindToMark();
        int int5 = characterReader1.pos();
        boolean boolean7 = characterReader1.matches(' ');
        int int9 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        boolean boolean13 = characterReader1.rangeEquals(100, (int) '#', "hi!");
        int int15 = characterReader1.nextIndexOf(' ');
        boolean boolean17 = characterReader1.matches("");
        java.lang.String str18 = characterReader1.consumeDigitSequence();
        boolean boolean20 = characterReader1.matches('i');
        char char21 = characterReader1.consume();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + 'h' + "'", char21 == 'h');
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matchesIgnoreCase("");
        boolean boolean5 = characterReader1.matchesIgnoreCase("");
        java.lang.String str6 = characterReader1.consumeLetterThenDigitSequence();
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.toString();
        boolean boolean10 = characterReader1.matches("i");
        java.lang.String str11 = characterReader1.consumeLetterSequence();
        characterReader1.mark();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi" + "'", str6, "hi");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!" + "'", str8, "!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        boolean boolean5 = characterReader1.isEmpty();
        boolean boolean7 = characterReader1.matches("hi!");
        java.lang.String str8 = characterReader1.consumeHexSequence();
        boolean boolean9 = characterReader1.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str13 = characterReader11.consumeTo('a');
        java.lang.String str14 = characterReader11.consumeLetterSequence();
        boolean boolean15 = characterReader11.isEmpty();
        char[] charArray22 = new char[] { ' ', '\uffff', ' ', '4', '4', 'a' };
        java.lang.String str23 = characterReader11.consumeToAny(charArray22);
        java.lang.String str24 = characterReader1.consumeToAny(charArray22);
        java.lang.String str25 = characterReader1.consumeData();
        boolean boolean27 = characterReader1.matches("h");
        java.lang.String str28 = characterReader1.consumeData();
        boolean boolean30 = characterReader1.matchConsume("h");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { ' ', '\uffff', ' ', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        boolean boolean5 = characterReader1.isEmpty();
        char[] charArray12 = new char[] { ' ', '\uffff', ' ', '4', '4', 'a' };
        java.lang.String str13 = characterReader1.consumeToAny(charArray12);
        java.lang.String str14 = characterReader1.consumeData();
        boolean boolean15 = characterReader1.matchesDigit();
        java.lang.String str17 = characterReader1.consumeTo('#');
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str21 = characterReader19.consumeTo('a');
        char[] charArray23 = new char[] { '#' };
        java.lang.String str24 = characterReader19.consumeToAnySorted(charArray23);
        boolean boolean26 = characterReader19.matchesIgnoreCase("hi!");
        boolean boolean28 = characterReader19.containsIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        characterReader30.advance();
        boolean boolean33 = characterReader30.containsIgnoreCase("hi!");
        java.lang.String str34 = characterReader30.consumeToEnd();
        java.lang.String str35 = characterReader30.toString();
        int int37 = characterReader30.nextIndexOf((java.lang.CharSequence) "hi");
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("");
        characterReader39.advance();
        characterReader39.mark();
        characterReader39.mark();
        java.lang.String str43 = characterReader39.consumeHexSequence();
        java.lang.String str44 = characterReader39.consumeLetterSequence();
        java.lang.String str45 = characterReader39.consumeHexSequence();
        java.lang.String str46 = characterReader39.consumeData();
        char[] charArray49 = new char[] { '#', '4' };
        boolean boolean50 = characterReader39.matchesAnySorted(charArray49);
        char char51 = characterReader39.current();
        java.lang.String str52 = characterReader39.consumeToEnd();
        java.lang.String str53 = characterReader39.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader55 = new org.jsoup.parser.CharacterReader("");
        characterReader55.advance();
        characterReader55.mark();
        characterReader55.mark();
        boolean boolean59 = characterReader55.isEmpty();
        boolean boolean61 = characterReader55.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader65 = new org.jsoup.parser.CharacterReader("");
        characterReader65.advance();
        characterReader65.mark();
        boolean boolean69 = characterReader65.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader71 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str73 = characterReader71.consumeTo('a');
        char[] charArray75 = new char[] { '#' };
        java.lang.String str76 = characterReader71.consumeToAnySorted(charArray75);
        java.lang.String str77 = characterReader65.consumeToAny(charArray75);
        boolean boolean78 = characterReader63.matchesAnySorted(charArray75);
        java.lang.String str79 = characterReader55.consumeToAny(charArray75);
        boolean boolean80 = characterReader39.matchesAny(charArray75);
        java.lang.String str81 = characterReader30.consumeToAnySorted(charArray75);
        java.lang.String str82 = characterReader19.consumeToAnySorted(charArray75);
        boolean boolean86 = org.jsoup.parser.CharacterReader.rangeEquals(charArray75, 32768, 10, "!");
        boolean boolean90 = org.jsoup.parser.CharacterReader.rangeEquals(charArray75, (int) (short) 10, (int) (byte) 1, "hi!");
        java.lang.String str91 = characterReader1.consumeToAny(charArray75);
        boolean boolean92 = characterReader1.matchesDigit();
        java.lang.String str93 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', '\uffff', ' ', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + char51 + "' != '" + '\uffff' + "'", char51 == '\uffff');
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        char[] charArray3 = null;
        boolean boolean4 = characterReader1.matchesAny(charArray3);
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("");
        characterReader6.advance();
        boolean boolean9 = characterReader6.containsIgnoreCase("hi!");
        boolean boolean13 = characterReader6.rangeEquals(1, (int) (byte) 0, "hi!");
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str17 = characterReader15.consumeTo('4');
        characterReader15.rewindToMark();
        java.lang.String str19 = characterReader15.consumeData();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str23 = characterReader21.consumeTo('4');
        characterReader21.rewindToMark();
        boolean boolean28 = characterReader21.rangeEquals(32768, 32768, "hi!");
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        characterReader30.advance();
        boolean boolean33 = characterReader30.containsIgnoreCase("hi!");
        java.lang.String str34 = characterReader30.consumeToEnd();
        java.lang.String str35 = characterReader30.toString();
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("");
        characterReader37.advance();
        characterReader37.mark();
        boolean boolean41 = characterReader37.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str45 = characterReader43.consumeTo('a');
        char[] charArray47 = new char[] { '#' };
        java.lang.String str48 = characterReader43.consumeToAnySorted(charArray47);
        java.lang.String str49 = characterReader37.consumeToAny(charArray47);
        boolean boolean50 = characterReader30.matchesAnySorted(charArray47);
        java.lang.String str51 = characterReader21.consumeToAny(charArray47);
        boolean boolean52 = characterReader15.matchesAny(charArray47);
        boolean boolean53 = characterReader6.matchesAnySorted(charArray47);
        java.lang.String str54 = characterReader1.consumeToAny(charArray47);
        characterReader1.rewindToMark();
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str57 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("");
        characterReader3.advance();
        char char5 = characterReader3.consume();
        java.lang.String str6 = characterReader3.consumeTagName();
        int int7 = characterReader3.pos();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        characterReader9.advance();
        boolean boolean12 = characterReader9.containsIgnoreCase("hi!");
        boolean boolean14 = characterReader9.matches("hi");
        java.lang.String str15 = characterReader9.consumeTagName();
        char[] charArray18 = new char[] { '4', ' ' };
        java.lang.String str19 = characterReader9.consumeToAnySorted(charArray18);
        boolean boolean20 = characterReader3.matchesAnySorted(charArray18);
        boolean boolean21 = characterReader3.isEmpty();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str25 = characterReader23.consumeTo('4');
        characterReader23.rewindToMark();
        boolean boolean30 = characterReader23.rangeEquals(32768, 32768, "hi!");
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        characterReader32.advance();
        boolean boolean35 = characterReader32.containsIgnoreCase("hi!");
        java.lang.String str36 = characterReader32.consumeToEnd();
        java.lang.String str37 = characterReader32.toString();
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("");
        characterReader39.advance();
        characterReader39.mark();
        boolean boolean43 = characterReader39.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str47 = characterReader45.consumeTo('a');
        char[] charArray49 = new char[] { '#' };
        java.lang.String str50 = characterReader45.consumeToAnySorted(charArray49);
        java.lang.String str51 = characterReader39.consumeToAny(charArray49);
        boolean boolean52 = characterReader32.matchesAnySorted(charArray49);
        java.lang.String str53 = characterReader23.consumeToAny(charArray49);
        java.lang.String str54 = characterReader3.consumeToAny(charArray49);
        boolean boolean55 = characterReader1.matchesAnySorted(charArray49);
        boolean boolean57 = characterReader1.containsIgnoreCase("!");
        characterReader1.advance();
        char char59 = characterReader1.consume();
        characterReader1.mark();
        java.lang.String str61 = characterReader1.consumeTagName();
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\uffff' + "'", char5 == '\uffff');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + char59 + "' != '" + 'i' + "'", char59 == 'i');
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "!" + "'", str61, "!");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("");
        characterReader3.advance();
        characterReader3.mark();
        boolean boolean7 = characterReader3.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str11 = characterReader9.consumeTo('a');
        char[] charArray13 = new char[] { '#' };
        java.lang.String str14 = characterReader9.consumeToAnySorted(charArray13);
        java.lang.String str15 = characterReader3.consumeToAny(charArray13);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray13);
        java.lang.String str17 = characterReader1.consumeToEnd();
        java.lang.String str18 = characterReader1.toString();
        java.lang.String str19 = characterReader1.consumeLetterSequence();
        char char20 = characterReader1.current();
        java.lang.String str21 = characterReader1.consumeData();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\uffff' + "'", char20 == '\uffff');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        characterReader7.advance();
        characterReader7.mark();
        boolean boolean11 = characterReader7.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str15 = characterReader13.consumeTo('a');
        char[] charArray17 = new char[] { '#' };
        java.lang.String str18 = characterReader13.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader7.consumeToAny(charArray17);
        boolean boolean20 = characterReader1.matchesAnySorted(charArray17);
        boolean boolean21 = characterReader1.matchesDigit();
        boolean boolean23 = characterReader1.matchConsumeIgnoreCase("");
        int int25 = characterReader1.nextIndexOf('a');
        boolean boolean26 = characterReader1.matchesLetter();
        characterReader1.advance();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str30 = characterReader29.consumeToEnd();
        char char31 = characterReader29.current();
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str35 = characterReader33.consumeTo('4');
        characterReader33.rewindToMark();
        boolean boolean40 = characterReader33.rangeEquals(32768, 32768, "hi!");
        int int41 = characterReader33.pos();
        java.lang.String str43 = characterReader33.consumeTo('\uffff');
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        characterReader45.advance();
        characterReader45.mark();
        characterReader45.mark();
        java.lang.String str49 = characterReader45.consumeHexSequence();
        characterReader45.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader52 = new org.jsoup.parser.CharacterReader("");
        characterReader52.advance();
        boolean boolean55 = characterReader52.containsIgnoreCase("hi!");
        char[] charArray61 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean62 = characterReader52.matchesAny(charArray61);
        java.lang.String str63 = characterReader45.consumeToAny(charArray61);
        org.jsoup.parser.CharacterReader characterReader65 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean67 = characterReader65.matchesIgnoreCase("");
        int int69 = characterReader65.nextIndexOf('a');
        org.jsoup.parser.CharacterReader characterReader71 = new org.jsoup.parser.CharacterReader("");
        characterReader71.advance();
        boolean boolean74 = characterReader71.containsIgnoreCase("hi!");
        char[] charArray80 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean81 = characterReader71.matchesAny(charArray80);
        boolean boolean82 = characterReader65.matchesAnySorted(charArray80);
        boolean boolean83 = characterReader45.matchesAnySorted(charArray80);
        java.lang.String str84 = characterReader33.consumeToAny(charArray80);
        java.lang.String str85 = characterReader29.consumeToAny(charArray80);
        boolean boolean89 = org.jsoup.parser.CharacterReader.rangeEquals(charArray80, (int) (short) 10, (int) (byte) 0, "hi");
        boolean boolean90 = characterReader1.matchesAny(charArray80);
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\uffff' + "'", char31 == '\uffff');
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertArrayEquals(charArray80, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        java.lang.String str8 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        characterReader10.advance();
        characterReader10.mark();
        characterReader10.mark();
        java.lang.String str14 = characterReader10.consumeHexSequence();
        characterReader10.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        characterReader17.advance();
        boolean boolean20 = characterReader17.containsIgnoreCase("hi!");
        char[] charArray26 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean27 = characterReader17.matchesAny(charArray26);
        java.lang.String str28 = characterReader10.consumeToAny(charArray26);
        java.lang.String str29 = characterReader1.consumeToAny(charArray26);
        boolean boolean33 = characterReader1.rangeEquals((int) ' ', 0, "hi");
        boolean boolean35 = characterReader1.matches("hi");
        char char36 = characterReader1.consume();
        boolean boolean38 = characterReader1.matches('h');
        java.lang.String str39 = characterReader1.consumeTagName();
        boolean boolean41 = characterReader1.matchesIgnoreCase("");
        boolean boolean43 = characterReader1.matches("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + '\uffff' + "'", char36 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi");
        java.lang.String str2 = characterReader1.consumeHexSequence();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        java.lang.String str6 = characterReader1.consumeTo('#');
        java.lang.String str7 = characterReader1.consumeTagName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi" + "'", str6, "hi");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str3 = characterReader1.consumeTo('4');
        org.jsoup.parser.CharacterReader characterReader5 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str7 = characterReader5.consumeTo('4');
        characterReader5.rewindToMark();
        java.lang.String str9 = characterReader5.consumeData();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str13 = characterReader11.consumeTo('4');
        characterReader11.rewindToMark();
        boolean boolean18 = characterReader11.rangeEquals(32768, 32768, "hi!");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        characterReader20.advance();
        boolean boolean23 = characterReader20.containsIgnoreCase("hi!");
        java.lang.String str24 = characterReader20.consumeToEnd();
        java.lang.String str25 = characterReader20.toString();
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        characterReader27.advance();
        characterReader27.mark();
        boolean boolean31 = characterReader27.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str35 = characterReader33.consumeTo('a');
        char[] charArray37 = new char[] { '#' };
        java.lang.String str38 = characterReader33.consumeToAnySorted(charArray37);
        java.lang.String str39 = characterReader27.consumeToAny(charArray37);
        boolean boolean40 = characterReader20.matchesAnySorted(charArray37);
        java.lang.String str41 = characterReader11.consumeToAny(charArray37);
        boolean boolean42 = characterReader5.matchesAny(charArray37);
        java.lang.String str43 = characterReader1.consumeToAnySorted(charArray37);
        boolean boolean45 = characterReader1.matches('#');
        characterReader1.advance();
        java.lang.String str47 = characterReader1.consumeLetterSequence();
        boolean boolean49 = characterReader1.matchConsume("!");
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count -1, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeToEnd();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str4 = characterReader1.consumeTagName();
        characterReader1.unconsume();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        java.lang.String str4 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        char char6 = characterReader1.current();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        java.lang.String str5 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        characterReader7.advance();
        boolean boolean10 = characterReader7.containsIgnoreCase("hi!");
        boolean boolean12 = characterReader7.matches("hi");
        java.lang.String str13 = characterReader7.consumeLetterThenDigitSequence();
        boolean boolean14 = characterReader7.matchesDigit();
        boolean boolean16 = characterReader7.matchConsumeIgnoreCase("hi");
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str20 = characterReader18.consumeTo('a');
        char[] charArray22 = new char[] { '#' };
        java.lang.String str23 = characterReader18.consumeToAnySorted(charArray22);
        char char24 = characterReader18.current();
        boolean boolean26 = characterReader18.matchConsume("");
        characterReader18.advance();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        characterReader29.advance();
        boolean boolean32 = characterReader29.containsIgnoreCase("hi!");
        java.lang.String str33 = characterReader29.consumeToEnd();
        boolean boolean35 = characterReader29.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("");
        characterReader37.advance();
        boolean boolean40 = characterReader37.containsIgnoreCase("hi!");
        char[] charArray46 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean47 = characterReader37.matchesAny(charArray46);
        boolean boolean48 = characterReader29.matchesAnySorted(charArray46);
        boolean boolean49 = characterReader18.matchesAnySorted(charArray46);
        boolean boolean53 = org.jsoup.parser.CharacterReader.rangeEquals(charArray46, 0, (int) (short) 1, "!");
        boolean boolean54 = characterReader7.matchesAnySorted(charArray46);
        java.lang.String str55 = characterReader1.consumeToAnySorted(charArray46);
        java.lang.String str56 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str58 = characterReader1.consumeTo(' ');
        boolean boolean62 = characterReader1.rangeEquals((int) 'a', (int) (byte) -1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\uffff' + "'", char24 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = characterReader1.consumeToAnySorted(charArray5);
        boolean boolean8 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean10 = characterReader1.containsIgnoreCase("hi!");
        int int12 = characterReader1.nextIndexOf((java.lang.CharSequence) "!");
        boolean boolean13 = characterReader1.matchesDigit();
        characterReader1.rewindToMark();
        java.lang.String str15 = characterReader1.consumeToEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        characterReader8.advance();
        boolean boolean11 = characterReader8.containsIgnoreCase("hi!");
        char[] charArray17 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean18 = characterReader8.matchesAny(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str20 = characterReader1.consumeLetterSequence();
        boolean boolean22 = characterReader1.matches(' ');
        java.lang.String str23 = characterReader1.toString();
        boolean boolean25 = characterReader1.matches('#');
        characterReader1.mark();
        characterReader1.rewindToMark();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeData();
        char[] charArray6 = new char[] {};
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        boolean boolean11 = characterReader1.rangeEquals((int) (byte) 1, 1, "");
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        characterReader13.advance();
        characterReader13.mark();
        characterReader13.mark();
        java.lang.String str17 = characterReader13.consumeHexSequence();
        java.lang.String str18 = characterReader13.consumeLetterSequence();
        java.lang.String str19 = characterReader13.consumeHexSequence();
        java.lang.String str20 = characterReader13.consumeData();
        char[] charArray23 = new char[] { '#', '4' };
        boolean boolean24 = characterReader13.matchesAnySorted(charArray23);
        boolean boolean25 = characterReader1.matchesAnySorted(charArray23);
        boolean boolean27 = characterReader1.matches('#');
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        characterReader29.advance();
        boolean boolean32 = characterReader29.containsIgnoreCase("hi!");
        boolean boolean34 = characterReader29.matches("hi");
        java.lang.String str35 = characterReader29.consumeTagName();
        char[] charArray38 = new char[] { '4', ' ' };
        java.lang.String str39 = characterReader29.consumeToAnySorted(charArray38);
        boolean boolean40 = characterReader1.matchesAnySorted(charArray38);
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("");
        characterReader42.advance();
        boolean boolean45 = characterReader42.containsIgnoreCase("hi!");
        java.lang.String str46 = characterReader42.consumeData();
        char[] charArray47 = new char[] {};
        java.lang.String str48 = characterReader42.consumeToAnySorted(charArray47);
        boolean boolean52 = org.jsoup.parser.CharacterReader.rangeEquals(charArray47, (int) 'h', (int) (short) 10, "hi");
        java.lang.String str53 = characterReader1.consumeToAnySorted(charArray47);
        boolean boolean55 = characterReader1.matchConsume("i!");
        characterReader1.rewindToMark();
        java.lang.Class<?> wildcardClass57 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] {});
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        java.lang.String str7 = characterReader1.consumeHexSequence();
        java.lang.String str8 = characterReader1.consumeData();
        char char9 = characterReader1.current();
        java.lang.String str10 = characterReader1.consumeDigitSequence();
        int int12 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        characterReader14.advance();
        characterReader14.mark();
        characterReader14.mark();
        boolean boolean18 = characterReader14.isEmpty();
        boolean boolean20 = characterReader14.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        characterReader22.advance();
        char char24 = characterReader22.consume();
        java.lang.String str25 = characterReader22.consumeTagName();
        int int26 = characterReader22.pos();
        java.lang.String str27 = characterReader22.consumeLetterThenDigitSequence();
        java.lang.String str29 = characterReader22.consumeTo("!");
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str33 = characterReader31.consumeTo('a');
        char[] charArray35 = new char[] { '#' };
        java.lang.String str36 = characterReader31.consumeToAnySorted(charArray35);
        char char37 = characterReader31.current();
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("");
        characterReader39.advance();
        boolean boolean42 = characterReader39.containsIgnoreCase("hi!");
        java.lang.String str43 = characterReader39.consumeToEnd();
        java.lang.String str44 = characterReader39.toString();
        int int46 = characterReader39.nextIndexOf((java.lang.CharSequence) "hi");
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("");
        characterReader48.advance();
        characterReader48.mark();
        boolean boolean52 = characterReader48.matchesIgnoreCase("");
        java.lang.String str53 = characterReader48.toString();
        org.jsoup.parser.CharacterReader characterReader55 = new org.jsoup.parser.CharacterReader("");
        characterReader55.advance();
        characterReader55.mark();
        characterReader55.mark();
        boolean boolean59 = characterReader55.isEmpty();
        boolean boolean61 = characterReader55.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader65 = new org.jsoup.parser.CharacterReader("");
        characterReader65.advance();
        characterReader65.mark();
        boolean boolean69 = characterReader65.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader71 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str73 = characterReader71.consumeTo('a');
        char[] charArray75 = new char[] { '#' };
        java.lang.String str76 = characterReader71.consumeToAnySorted(charArray75);
        java.lang.String str77 = characterReader65.consumeToAny(charArray75);
        boolean boolean78 = characterReader63.matchesAnySorted(charArray75);
        java.lang.String str79 = characterReader55.consumeToAny(charArray75);
        boolean boolean80 = characterReader48.matchesAnySorted(charArray75);
        boolean boolean81 = characterReader39.matchesAnySorted(charArray75);
        boolean boolean82 = characterReader31.matchesAny(charArray75);
        boolean boolean83 = characterReader22.matchesAnySorted(charArray75);
        boolean boolean84 = characterReader14.matchesAnySorted(charArray75);
        boolean boolean85 = characterReader1.matchesAny(charArray75);
        java.lang.String str86 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\uffff' + "'", char24 == '\uffff');
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '\uffff' + "'", char37 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        boolean boolean5 = characterReader1.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str9 = characterReader7.consumeTo('a');
        char[] charArray11 = new char[] { '#' };
        java.lang.String str12 = characterReader7.consumeToAnySorted(charArray11);
        java.lang.String str13 = characterReader1.consumeToAny(charArray11);
        boolean boolean17 = characterReader1.rangeEquals((int) (short) 1, 0, "");
        boolean boolean18 = characterReader1.matchesLetter();
        int int19 = characterReader1.pos();
        java.lang.String str20 = characterReader1.consumeDigitSequence();
        char char21 = characterReader1.current();
        java.lang.String str22 = characterReader1.toString();
        char char23 = characterReader1.current();
        boolean boolean27 = characterReader1.rangeEquals((int) 'h', (int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\uffff' + "'", char21 == '\uffff');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\uffff' + "'", char23 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        char char3 = characterReader1.consume();
        java.lang.String str4 = characterReader1.consumeData();
        boolean boolean6 = characterReader1.matchConsume("hi");
        java.lang.String str8 = characterReader1.consumeTo("hi!");
        java.lang.String str9 = characterReader1.consumeDigitSequence();
        characterReader1.mark();
        java.lang.String str12 = characterReader1.consumeTo("hi!");
        boolean boolean16 = characterReader1.rangeEquals((int) 'i', (int) (byte) 10, "i!");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        characterReader7.advance();
        characterReader7.mark();
        boolean boolean11 = characterReader7.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str15 = characterReader13.consumeTo('a');
        char[] charArray17 = new char[] { '#' };
        java.lang.String str18 = characterReader13.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader7.consumeToAny(charArray17);
        boolean boolean20 = characterReader1.matchesAnySorted(charArray17);
        boolean boolean21 = characterReader1.matchesDigit();
        java.lang.String str23 = characterReader1.consumeTo('!');
        boolean boolean25 = characterReader1.matchesIgnoreCase("hi!");
        char char26 = characterReader1.consume();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        characterReader28.advance();
        boolean boolean31 = characterReader28.containsIgnoreCase("hi!");
        boolean boolean35 = characterReader28.rangeEquals(1, (int) (byte) 0, "hi!");
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str39 = characterReader37.consumeTo('4');
        characterReader37.rewindToMark();
        java.lang.String str41 = characterReader37.consumeData();
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str45 = characterReader43.consumeTo('4');
        characterReader43.rewindToMark();
        boolean boolean50 = characterReader43.rangeEquals(32768, 32768, "hi!");
        org.jsoup.parser.CharacterReader characterReader52 = new org.jsoup.parser.CharacterReader("");
        characterReader52.advance();
        boolean boolean55 = characterReader52.containsIgnoreCase("hi!");
        java.lang.String str56 = characterReader52.consumeToEnd();
        java.lang.String str57 = characterReader52.toString();
        org.jsoup.parser.CharacterReader characterReader59 = new org.jsoup.parser.CharacterReader("");
        characterReader59.advance();
        characterReader59.mark();
        boolean boolean63 = characterReader59.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader65 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str67 = characterReader65.consumeTo('a');
        char[] charArray69 = new char[] { '#' };
        java.lang.String str70 = characterReader65.consumeToAnySorted(charArray69);
        java.lang.String str71 = characterReader59.consumeToAny(charArray69);
        boolean boolean72 = characterReader52.matchesAnySorted(charArray69);
        java.lang.String str73 = characterReader43.consumeToAny(charArray69);
        boolean boolean74 = characterReader37.matchesAny(charArray69);
        boolean boolean75 = characterReader28.matchesAnySorted(charArray69);
        boolean boolean79 = org.jsoup.parser.CharacterReader.rangeEquals(charArray69, (int) '4', (int) (short) 10, "h");
        boolean boolean80 = characterReader1.matchesAny(charArray69);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\uffff' + "'", char26 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeToEnd();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str4 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean9 = characterReader7.matchesIgnoreCase("");
        int int11 = characterReader7.nextIndexOf('a');
        int int13 = characterReader7.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str14 = characterReader7.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        characterReader16.advance();
        characterReader16.mark();
        characterReader16.mark();
        java.lang.String str20 = characterReader16.consumeHexSequence();
        java.lang.String str21 = characterReader16.consumeLetterSequence();
        java.lang.String str22 = characterReader16.consumeHexSequence();
        java.lang.String str23 = characterReader16.consumeData();
        char[] charArray26 = new char[] { '#', '4' };
        boolean boolean27 = characterReader16.matchesAnySorted(charArray26);
        char char28 = characterReader16.current();
        java.lang.String str29 = characterReader16.consumeToEnd();
        java.lang.String str30 = characterReader16.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        characterReader32.advance();
        char char34 = characterReader32.consume();
        java.lang.String str35 = characterReader32.consumeTagName();
        int int36 = characterReader32.pos();
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        characterReader38.advance();
        boolean boolean41 = characterReader38.containsIgnoreCase("hi!");
        boolean boolean43 = characterReader38.matches("hi");
        java.lang.String str44 = characterReader38.consumeTagName();
        char[] charArray47 = new char[] { '4', ' ' };
        java.lang.String str48 = characterReader38.consumeToAnySorted(charArray47);
        boolean boolean49 = characterReader32.matchesAnySorted(charArray47);
        boolean boolean50 = characterReader16.matchesAny(charArray47);
        boolean boolean51 = characterReader7.matchesAny(charArray47);
        java.lang.String str52 = characterReader1.consumeToAny(charArray47);
        org.jsoup.parser.CharacterReader characterReader54 = new org.jsoup.parser.CharacterReader("");
        characterReader54.advance();
        boolean boolean57 = characterReader54.containsIgnoreCase("hi!");
        boolean boolean59 = characterReader54.matches("hi");
        int int60 = characterReader54.pos();
        boolean boolean62 = characterReader54.matchConsumeIgnoreCase("");
        java.lang.String str63 = characterReader54.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader65 = new org.jsoup.parser.CharacterReader("");
        characterReader65.advance();
        boolean boolean68 = characterReader65.containsIgnoreCase("hi!");
        java.lang.String str69 = characterReader65.consumeData();
        char[] charArray70 = new char[] {};
        java.lang.String str71 = characterReader65.consumeToAnySorted(charArray70);
        java.lang.String str72 = characterReader54.consumeToAny(charArray70);
        java.lang.String str73 = characterReader1.consumeToAnySorted(charArray70);
        boolean boolean75 = characterReader1.matchesIgnoreCase("i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\uffff' + "'", char28 == '\uffff');
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\uffff' + "'", char34 == '\uffff');
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] {});
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        char char3 = characterReader1.consume();
        java.lang.String str4 = characterReader1.consumeTagName();
        int int5 = characterReader1.pos();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        characterReader7.advance();
        boolean boolean10 = characterReader7.containsIgnoreCase("hi!");
        boolean boolean12 = characterReader7.matches("hi");
        java.lang.String str13 = characterReader7.consumeTagName();
        char[] charArray16 = new char[] { '4', ' ' };
        java.lang.String str17 = characterReader7.consumeToAnySorted(charArray16);
        boolean boolean18 = characterReader1.matchesAnySorted(charArray16);
        boolean boolean19 = characterReader1.isEmpty();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str23 = characterReader21.consumeTo('4');
        characterReader21.rewindToMark();
        boolean boolean28 = characterReader21.rangeEquals(32768, 32768, "hi!");
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        characterReader30.advance();
        boolean boolean33 = characterReader30.containsIgnoreCase("hi!");
        java.lang.String str34 = characterReader30.consumeToEnd();
        java.lang.String str35 = characterReader30.toString();
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("");
        characterReader37.advance();
        characterReader37.mark();
        boolean boolean41 = characterReader37.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str45 = characterReader43.consumeTo('a');
        char[] charArray47 = new char[] { '#' };
        java.lang.String str48 = characterReader43.consumeToAnySorted(charArray47);
        java.lang.String str49 = characterReader37.consumeToAny(charArray47);
        boolean boolean50 = characterReader30.matchesAnySorted(charArray47);
        java.lang.String str51 = characterReader21.consumeToAny(charArray47);
        java.lang.String str52 = characterReader1.consumeToAny(charArray47);
        int int54 = characterReader1.nextIndexOf((java.lang.CharSequence) "i");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = characterReader1.containsIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeData();
        boolean boolean6 = characterReader1.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str10 = characterReader8.consumeTo('a');
        char[] charArray12 = new char[] { '#' };
        java.lang.String str13 = characterReader8.consumeToAnySorted(charArray12);
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str17 = characterReader15.consumeTo('a');
        java.lang.String str18 = characterReader15.consumeLetterSequence();
        boolean boolean19 = characterReader15.isEmpty();
        int int21 = characterReader15.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str22 = characterReader15.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        characterReader24.advance();
        char char26 = characterReader24.consume();
        java.lang.String str27 = characterReader24.consumeTagName();
        int int28 = characterReader24.pos();
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        characterReader30.advance();
        boolean boolean33 = characterReader30.containsIgnoreCase("hi!");
        boolean boolean35 = characterReader30.matches("hi");
        java.lang.String str36 = characterReader30.consumeTagName();
        char[] charArray39 = new char[] { '4', ' ' };
        java.lang.String str40 = characterReader30.consumeToAnySorted(charArray39);
        boolean boolean41 = characterReader24.matchesAnySorted(charArray39);
        java.lang.String str42 = characterReader15.consumeToAny(charArray39);
        boolean boolean43 = characterReader8.matchesAny(charArray39);
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str47 = characterReader45.consumeTo('a');
        char[] charArray49 = new char[] { '#' };
        java.lang.String str50 = characterReader45.consumeToAnySorted(charArray49);
        org.jsoup.parser.CharacterReader characterReader52 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str54 = characterReader52.consumeTo('a');
        java.lang.String str55 = characterReader52.consumeLetterSequence();
        boolean boolean56 = characterReader52.isEmpty();
        int int58 = characterReader52.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str59 = characterReader52.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader61 = new org.jsoup.parser.CharacterReader("");
        characterReader61.advance();
        char char63 = characterReader61.consume();
        java.lang.String str64 = characterReader61.consumeTagName();
        int int65 = characterReader61.pos();
        org.jsoup.parser.CharacterReader characterReader67 = new org.jsoup.parser.CharacterReader("");
        characterReader67.advance();
        boolean boolean70 = characterReader67.containsIgnoreCase("hi!");
        boolean boolean72 = characterReader67.matches("hi");
        java.lang.String str73 = characterReader67.consumeTagName();
        char[] charArray76 = new char[] { '4', ' ' };
        java.lang.String str77 = characterReader67.consumeToAnySorted(charArray76);
        boolean boolean78 = characterReader61.matchesAnySorted(charArray76);
        java.lang.String str79 = characterReader52.consumeToAny(charArray76);
        boolean boolean80 = characterReader45.matchesAny(charArray76);
        java.lang.String str81 = characterReader8.consumeToAnySorted(charArray76);
        boolean boolean82 = characterReader1.matchesAnySorted(charArray76);
        java.lang.String str83 = characterReader1.consumeTagName();
        characterReader1.unconsume();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\uffff' + "'", char26 == '\uffff');
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + char63 + "' != '" + '\uffff' + "'", char63 == '\uffff');
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertArrayEquals(charArray76, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        char char3 = characterReader1.consume();
        java.lang.String str4 = characterReader1.consumeData();
        boolean boolean6 = characterReader1.matchConsumeIgnoreCase("!");
        boolean boolean7 = characterReader1.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str11 = characterReader9.consumeTo('4');
        characterReader9.rewindToMark();
        int int13 = characterReader9.pos();
        java.lang.String str14 = characterReader9.consumeToEnd();
        boolean boolean16 = characterReader9.matches("");
        java.lang.String str17 = characterReader9.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        characterReader19.advance();
        characterReader19.mark();
        characterReader19.mark();
        boolean boolean23 = characterReader19.isEmpty();
        characterReader19.rewindToMark();
        java.lang.String str25 = characterReader19.consumeData();
        boolean boolean27 = characterReader19.matchConsumeIgnoreCase("");
        boolean boolean29 = characterReader19.matchConsume("i");
        boolean boolean30 = characterReader19.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        characterReader32.advance();
        boolean boolean35 = characterReader32.containsIgnoreCase("hi!");
        java.lang.String str36 = characterReader32.consumeData();
        char[] charArray37 = new char[] {};
        java.lang.String str38 = characterReader32.consumeToAnySorted(charArray37);
        boolean boolean42 = characterReader32.rangeEquals((int) (byte) 1, 1, "");
        java.lang.String str43 = characterReader32.consumeData();
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        characterReader45.advance();
        boolean boolean48 = characterReader45.containsIgnoreCase("hi!");
        java.lang.String str49 = characterReader45.consumeToEnd();
        java.lang.String str50 = characterReader45.toString();
        int int52 = characterReader45.nextIndexOf((java.lang.CharSequence) "hi");
        org.jsoup.parser.CharacterReader characterReader54 = new org.jsoup.parser.CharacterReader("");
        characterReader54.advance();
        characterReader54.mark();
        boolean boolean58 = characterReader54.matchesIgnoreCase("");
        java.lang.String str59 = characterReader54.toString();
        org.jsoup.parser.CharacterReader characterReader61 = new org.jsoup.parser.CharacterReader("");
        characterReader61.advance();
        characterReader61.mark();
        characterReader61.mark();
        boolean boolean65 = characterReader61.isEmpty();
        boolean boolean67 = characterReader61.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader69 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader71 = new org.jsoup.parser.CharacterReader("");
        characterReader71.advance();
        characterReader71.mark();
        boolean boolean75 = characterReader71.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader77 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str79 = characterReader77.consumeTo('a');
        char[] charArray81 = new char[] { '#' };
        java.lang.String str82 = characterReader77.consumeToAnySorted(charArray81);
        java.lang.String str83 = characterReader71.consumeToAny(charArray81);
        boolean boolean84 = characterReader69.matchesAnySorted(charArray81);
        java.lang.String str85 = characterReader61.consumeToAny(charArray81);
        boolean boolean86 = characterReader54.matchesAnySorted(charArray81);
        boolean boolean87 = characterReader45.matchesAnySorted(charArray81);
        boolean boolean91 = org.jsoup.parser.CharacterReader.rangeEquals(charArray81, (int) (short) 1, (int) (short) -1, "hi");
        java.lang.String str92 = characterReader32.consumeToAny(charArray81);
        java.lang.String str93 = characterReader19.consumeToAny(charArray81);
        boolean boolean94 = characterReader9.matchesAny(charArray81);
        java.lang.String str95 = characterReader1.consumeToAnySorted(charArray81);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertArrayEquals(charArray81, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeData();
        java.lang.String str7 = characterReader1.consumeTo(' ');
        boolean boolean8 = characterReader1.matchesLetter();
        characterReader1.mark();
        java.lang.String str10 = characterReader1.consumeHexSequence();
        int int11 = characterReader1.pos();
        boolean boolean13 = characterReader1.matchConsumeIgnoreCase("hi");
        java.lang.String str14 = characterReader1.consumeToEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("");
        characterReader3.advance();
        characterReader3.mark();
        boolean boolean7 = characterReader3.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str11 = characterReader9.consumeTo('a');
        char[] charArray13 = new char[] { '#' };
        java.lang.String str14 = characterReader9.consumeToAnySorted(charArray13);
        java.lang.String str15 = characterReader3.consumeToAny(charArray13);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray13);
        boolean boolean20 = characterReader1.rangeEquals((int) (short) 0, (int) 'h', "");
        java.lang.String str21 = characterReader1.consumeDigitSequence();
        char char22 = characterReader1.consume();
        boolean boolean24 = characterReader1.matches("i!");
        java.lang.String str25 = characterReader1.consumeLetterThenDigitSequence();
        int int26 = characterReader1.pos();
        boolean boolean28 = characterReader1.matchesIgnoreCase("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + 'h' + "'", char22 == 'h');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "i" + "'", str25, "i");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        char char3 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeLetterThenDigitSequence();
        characterReader1.unconsume();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        characterReader7.advance();
        characterReader7.mark();
        characterReader7.mark();
        java.lang.String str11 = characterReader7.consumeHexSequence();
        java.lang.String str12 = characterReader7.consumeLetterSequence();
        java.lang.String str13 = characterReader7.consumeHexSequence();
        java.lang.String str14 = characterReader7.consumeData();
        char[] charArray17 = new char[] { '#', '4' };
        boolean boolean18 = characterReader7.matchesAnySorted(charArray17);
        char char19 = characterReader7.current();
        java.lang.String str20 = characterReader7.consumeToEnd();
        java.lang.String str21 = characterReader7.consumeLetterSequence();
        int int23 = characterReader7.nextIndexOf('a');
        java.lang.String str25 = characterReader7.consumeTo(' ');
        int int27 = characterReader7.nextIndexOf('a');
        characterReader7.rewindToMark();
        java.lang.String str29 = characterReader7.consumeDigitSequence();
        boolean boolean31 = characterReader7.containsIgnoreCase("i");
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("");
        characterReader33.advance();
        characterReader33.mark();
        characterReader33.mark();
        boolean boolean37 = characterReader33.isEmpty();
        boolean boolean39 = characterReader33.matches("hi!");
        int int41 = characterReader33.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str42 = characterReader33.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader44 = new org.jsoup.parser.CharacterReader("");
        characterReader44.advance();
        boolean boolean47 = characterReader44.containsIgnoreCase("hi!");
        java.lang.String str48 = characterReader44.consumeToEnd();
        java.lang.String str49 = characterReader44.toString();
        int int51 = characterReader44.nextIndexOf((java.lang.CharSequence) "hi");
        org.jsoup.parser.CharacterReader characterReader53 = new org.jsoup.parser.CharacterReader("");
        characterReader53.advance();
        characterReader53.mark();
        boolean boolean57 = characterReader53.matchesIgnoreCase("");
        java.lang.String str58 = characterReader53.toString();
        org.jsoup.parser.CharacterReader characterReader60 = new org.jsoup.parser.CharacterReader("");
        characterReader60.advance();
        characterReader60.mark();
        characterReader60.mark();
        boolean boolean64 = characterReader60.isEmpty();
        boolean boolean66 = characterReader60.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader68 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader70 = new org.jsoup.parser.CharacterReader("");
        characterReader70.advance();
        characterReader70.mark();
        boolean boolean74 = characterReader70.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader76 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str78 = characterReader76.consumeTo('a');
        char[] charArray80 = new char[] { '#' };
        java.lang.String str81 = characterReader76.consumeToAnySorted(charArray80);
        java.lang.String str82 = characterReader70.consumeToAny(charArray80);
        boolean boolean83 = characterReader68.matchesAnySorted(charArray80);
        java.lang.String str84 = characterReader60.consumeToAny(charArray80);
        boolean boolean85 = characterReader53.matchesAnySorted(charArray80);
        boolean boolean86 = characterReader44.matchesAnySorted(charArray80);
        java.lang.String str87 = characterReader33.consumeToAnySorted(charArray80);
        java.lang.String str88 = characterReader7.consumeToAny(charArray80);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str89 = characterReader1.consumeToAny(charArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\uffff' + "'", char19 == '\uffff');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertArrayEquals(charArray80, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        char char3 = characterReader1.consume();
        java.lang.String str4 = characterReader1.consumeTagName();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        boolean boolean7 = characterReader1.matches("");
        boolean boolean9 = characterReader1.containsIgnoreCase("hi");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = characterReader1.consumeToAnySorted(charArray5);
        char char7 = characterReader1.current();
        boolean boolean9 = characterReader1.matchConsume("");
        characterReader1.advance();
        characterReader1.advance();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matchesIgnoreCase("");
        int int5 = characterReader1.nextIndexOf('a');
        int int7 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str8 = characterReader1.consumeHexSequence();
        java.lang.String str10 = characterReader1.consumeTo(' ');
        boolean boolean11 = characterReader1.matchesLetter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        boolean boolean5 = characterReader1.matchesIgnoreCase("");
        java.lang.String str6 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        characterReader8.advance();
        characterReader8.mark();
        characterReader8.mark();
        boolean boolean12 = characterReader8.isEmpty();
        boolean boolean14 = characterReader8.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("");
        characterReader18.advance();
        characterReader18.mark();
        boolean boolean22 = characterReader18.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str26 = characterReader24.consumeTo('a');
        char[] charArray28 = new char[] { '#' };
        java.lang.String str29 = characterReader24.consumeToAnySorted(charArray28);
        java.lang.String str30 = characterReader18.consumeToAny(charArray28);
        boolean boolean31 = characterReader16.matchesAnySorted(charArray28);
        java.lang.String str32 = characterReader8.consumeToAny(charArray28);
        boolean boolean33 = characterReader1.matchesAnySorted(charArray28);
        java.lang.String str34 = characterReader1.consumeToEnd();
        java.lang.String str35 = characterReader1.consumeHexSequence();
        characterReader1.mark();
        boolean boolean37 = characterReader1.isEmpty();
        boolean boolean41 = characterReader1.rangeEquals((-1), (-1), "!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        java.lang.String str7 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        characterReader9.advance();
        characterReader9.mark();
        java.lang.String str12 = characterReader9.consumeLetterThenDigitSequence();
        boolean boolean14 = characterReader9.matchConsumeIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        characterReader16.advance();
        boolean boolean19 = characterReader16.containsIgnoreCase("hi!");
        char[] charArray25 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean26 = characterReader16.matchesAny(charArray25);
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        characterReader28.advance();
        boolean boolean31 = characterReader28.containsIgnoreCase("hi!");
        java.lang.String str32 = characterReader28.consumeToEnd();
        java.lang.String str33 = characterReader28.toString();
        org.jsoup.parser.CharacterReader characterReader35 = new org.jsoup.parser.CharacterReader("");
        characterReader35.advance();
        characterReader35.mark();
        boolean boolean39 = characterReader35.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str43 = characterReader41.consumeTo('a');
        char[] charArray45 = new char[] { '#' };
        java.lang.String str46 = characterReader41.consumeToAnySorted(charArray45);
        java.lang.String str47 = characterReader35.consumeToAny(charArray45);
        boolean boolean48 = characterReader28.matchesAnySorted(charArray45);
        java.lang.String str49 = characterReader16.consumeToAny(charArray45);
        java.lang.String str50 = characterReader9.consumeToAnySorted(charArray45);
        boolean boolean51 = characterReader1.matchesAny(charArray45);
        java.lang.String str52 = characterReader1.toString();
        characterReader1.mark();
        org.jsoup.parser.CharacterReader characterReader55 = new org.jsoup.parser.CharacterReader("");
        characterReader55.advance();
        characterReader55.mark();
        boolean boolean59 = characterReader55.matchesIgnoreCase("");
        java.lang.String str60 = characterReader55.toString();
        org.jsoup.parser.CharacterReader characterReader62 = new org.jsoup.parser.CharacterReader("");
        characterReader62.advance();
        characterReader62.mark();
        characterReader62.mark();
        boolean boolean66 = characterReader62.isEmpty();
        boolean boolean68 = characterReader62.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader70 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader72 = new org.jsoup.parser.CharacterReader("");
        characterReader72.advance();
        characterReader72.mark();
        boolean boolean76 = characterReader72.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader78 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str80 = characterReader78.consumeTo('a');
        char[] charArray82 = new char[] { '#' };
        java.lang.String str83 = characterReader78.consumeToAnySorted(charArray82);
        java.lang.String str84 = characterReader72.consumeToAny(charArray82);
        boolean boolean85 = characterReader70.matchesAnySorted(charArray82);
        java.lang.String str86 = characterReader62.consumeToAny(charArray82);
        boolean boolean87 = characterReader55.matchesAnySorted(charArray82);
        java.lang.String str88 = characterReader1.consumeToAnySorted(charArray82);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertArrayEquals(charArray82, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("");
        characterReader3.advance();
        characterReader3.mark();
        boolean boolean7 = characterReader3.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str11 = characterReader9.consumeTo('a');
        char[] charArray13 = new char[] { '#' };
        java.lang.String str14 = characterReader9.consumeToAnySorted(charArray13);
        java.lang.String str15 = characterReader3.consumeToAny(charArray13);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray13);
        java.lang.String str17 = characterReader1.consumeToEnd();
        java.lang.String str18 = characterReader1.consumeHexSequence();
        boolean boolean19 = characterReader1.matchesDigit();
        boolean boolean21 = characterReader1.matches('a');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = characterReader1.consumeToAnySorted(charArray5);
        boolean boolean8 = characterReader1.matchesIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.consumeLetterThenDigitSequence();
        char char10 = characterReader1.current();
        int int12 = characterReader1.nextIndexOf('!');
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        characterReader14.advance();
        characterReader14.mark();
        characterReader14.mark();
        java.lang.String str18 = characterReader14.consumeHexSequence();
        java.lang.String str19 = characterReader14.consumeLetterSequence();
        characterReader14.rewindToMark();
        java.lang.String str21 = characterReader14.consumeLetterThenDigitSequence();
        java.lang.String str22 = characterReader14.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean26 = characterReader24.matchesIgnoreCase("");
        int int28 = characterReader24.nextIndexOf('a');
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        characterReader30.advance();
        characterReader30.mark();
        characterReader30.mark();
        java.lang.String str34 = characterReader30.consumeHexSequence();
        java.lang.String str35 = characterReader30.consumeLetterSequence();
        java.lang.String str36 = characterReader30.consumeHexSequence();
        java.lang.String str37 = characterReader30.consumeData();
        char[] charArray40 = new char[] { '#', '4' };
        boolean boolean41 = characterReader30.matchesAnySorted(charArray40);
        boolean boolean45 = org.jsoup.parser.CharacterReader.rangeEquals(charArray40, (-1), 0, "");
        boolean boolean46 = characterReader24.matchesAnySorted(charArray40);
        java.lang.String str47 = characterReader14.consumeToAnySorted(charArray40);
        boolean boolean48 = characterReader1.matchesAnySorted(charArray40);
        java.lang.String str49 = characterReader1.consumeLetterSequence();
        java.lang.String str50 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        boolean boolean5 = characterReader1.matchesIgnoreCase("");
        java.lang.String str6 = characterReader1.toString();
        characterReader1.mark();
        boolean boolean9 = characterReader1.containsIgnoreCase("!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeTo("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean6 = characterReader1.matches("hi");
        java.lang.String str7 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean8 = characterReader1.matchesDigit();
        boolean boolean10 = characterReader1.matchConsumeIgnoreCase("hi");
        boolean boolean11 = characterReader1.matchesLetter();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.consumeTagName();
        java.lang.String str8 = characterReader1.consumeTo("hi");
        boolean boolean10 = characterReader1.matchesIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        characterReader14.advance();
        characterReader14.mark();
        boolean boolean18 = characterReader14.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str22 = characterReader20.consumeTo('a');
        char[] charArray24 = new char[] { '#' };
        java.lang.String str25 = characterReader20.consumeToAnySorted(charArray24);
        java.lang.String str26 = characterReader14.consumeToAny(charArray24);
        boolean boolean27 = characterReader12.matchesAnySorted(charArray24);
        java.lang.String str28 = characterReader12.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        characterReader30.advance();
        boolean boolean33 = characterReader30.containsIgnoreCase("hi!");
        char[] charArray39 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean40 = characterReader30.matchesAny(charArray39);
        boolean boolean41 = characterReader12.matchesAny(charArray39);
        boolean boolean42 = characterReader1.matchesAny(charArray39);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str3 = characterReader1.consumeTo('4');
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean6 = characterReader1.matchesDigit();
        java.lang.String str7 = characterReader1.consumeHexSequence();
        boolean boolean9 = characterReader1.matchConsumeIgnoreCase("");
        boolean boolean13 = characterReader1.rangeEquals((int) (short) 100, (-1), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi" + "'", str5, "hi");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        char char3 = characterReader1.consume();
        java.lang.String str4 = characterReader1.consumeTagName();
        int int5 = characterReader1.pos();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        characterReader7.advance();
        boolean boolean10 = characterReader7.containsIgnoreCase("hi!");
        boolean boolean12 = characterReader7.matches("hi");
        java.lang.String str13 = characterReader7.consumeTagName();
        char[] charArray16 = new char[] { '4', ' ' };
        java.lang.String str17 = characterReader7.consumeToAnySorted(charArray16);
        boolean boolean18 = characterReader1.matchesAnySorted(charArray16);
        characterReader1.mark();
        char char20 = characterReader1.current();
        boolean boolean22 = characterReader1.matchConsumeIgnoreCase("!");
        java.lang.String str24 = characterReader1.consumeTo("hi");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\uffff' + "'", char20 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeData();
        char[] charArray6 = new char[] {};
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        boolean boolean11 = characterReader1.rangeEquals((int) (byte) 1, 1, "");
        java.lang.String str12 = characterReader1.consumeData();
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        characterReader14.advance();
        boolean boolean17 = characterReader14.containsIgnoreCase("hi!");
        java.lang.String str18 = characterReader14.consumeToEnd();
        java.lang.String str19 = characterReader14.toString();
        int int21 = characterReader14.nextIndexOf((java.lang.CharSequence) "hi");
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        characterReader23.advance();
        characterReader23.mark();
        boolean boolean27 = characterReader23.matchesIgnoreCase("");
        java.lang.String str28 = characterReader23.toString();
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        characterReader30.advance();
        characterReader30.mark();
        characterReader30.mark();
        boolean boolean34 = characterReader30.isEmpty();
        boolean boolean36 = characterReader30.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("");
        characterReader40.advance();
        characterReader40.mark();
        boolean boolean44 = characterReader40.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader46 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str48 = characterReader46.consumeTo('a');
        char[] charArray50 = new char[] { '#' };
        java.lang.String str51 = characterReader46.consumeToAnySorted(charArray50);
        java.lang.String str52 = characterReader40.consumeToAny(charArray50);
        boolean boolean53 = characterReader38.matchesAnySorted(charArray50);
        java.lang.String str54 = characterReader30.consumeToAny(charArray50);
        boolean boolean55 = characterReader23.matchesAnySorted(charArray50);
        boolean boolean56 = characterReader14.matchesAnySorted(charArray50);
        boolean boolean60 = org.jsoup.parser.CharacterReader.rangeEquals(charArray50, (int) (short) 1, (int) (short) -1, "hi");
        java.lang.String str61 = characterReader1.consumeToAny(charArray50);
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("");
        characterReader63.advance();
        characterReader63.mark();
        characterReader63.mark();
        java.lang.String str67 = characterReader63.consumeHexSequence();
        java.lang.String str68 = characterReader63.consumeLetterSequence();
        java.lang.String str69 = characterReader63.consumeHexSequence();
        java.lang.String str70 = characterReader63.consumeData();
        char[] charArray73 = new char[] { '#', '4' };
        boolean boolean74 = characterReader63.matchesAnySorted(charArray73);
        boolean boolean78 = org.jsoup.parser.CharacterReader.rangeEquals(charArray73, (-1), 0, "");
        boolean boolean82 = org.jsoup.parser.CharacterReader.rangeEquals(charArray73, 32768, (-1), "hi!");
        java.lang.String str83 = characterReader1.consumeToAny(charArray73);
        java.lang.String str84 = characterReader1.toString();
        char char85 = characterReader1.current();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertArrayEquals(charArray73, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + char85 + "' != '" + '\uffff' + "'", char85 == '\uffff');
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        characterReader8.advance();
        boolean boolean11 = characterReader8.containsIgnoreCase("hi!");
        char[] charArray17 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean18 = characterReader8.matchesAny(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        char char20 = characterReader1.current();
        boolean boolean21 = characterReader1.isEmpty();
        java.lang.String str22 = characterReader1.toString();
        java.lang.String str23 = characterReader1.consumeData();
        java.lang.String str25 = characterReader1.consumeTo("i");
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str29 = characterReader27.consumeTo('a');
        char[] charArray31 = new char[] { '#' };
        java.lang.String str32 = characterReader27.consumeToAnySorted(charArray31);
        char char33 = characterReader27.current();
        boolean boolean34 = characterReader27.matchesLetter();
        boolean boolean35 = characterReader27.matchesLetter();
        java.lang.String str36 = characterReader27.consumeToEnd();
        char char37 = characterReader27.current();
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("");
        characterReader39.advance();
        boolean boolean42 = characterReader39.containsIgnoreCase("hi!");
        boolean boolean46 = characterReader39.rangeEquals(1, (int) (byte) 0, "hi!");
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str50 = characterReader48.consumeTo('4');
        characterReader48.rewindToMark();
        java.lang.String str52 = characterReader48.consumeData();
        org.jsoup.parser.CharacterReader characterReader54 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str56 = characterReader54.consumeTo('4');
        characterReader54.rewindToMark();
        boolean boolean61 = characterReader54.rangeEquals(32768, 32768, "hi!");
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("");
        characterReader63.advance();
        boolean boolean66 = characterReader63.containsIgnoreCase("hi!");
        java.lang.String str67 = characterReader63.consumeToEnd();
        java.lang.String str68 = characterReader63.toString();
        org.jsoup.parser.CharacterReader characterReader70 = new org.jsoup.parser.CharacterReader("");
        characterReader70.advance();
        characterReader70.mark();
        boolean boolean74 = characterReader70.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader76 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str78 = characterReader76.consumeTo('a');
        char[] charArray80 = new char[] { '#' };
        java.lang.String str81 = characterReader76.consumeToAnySorted(charArray80);
        java.lang.String str82 = characterReader70.consumeToAny(charArray80);
        boolean boolean83 = characterReader63.matchesAnySorted(charArray80);
        java.lang.String str84 = characterReader54.consumeToAny(charArray80);
        boolean boolean85 = characterReader48.matchesAny(charArray80);
        boolean boolean86 = characterReader39.matchesAnySorted(charArray80);
        boolean boolean90 = org.jsoup.parser.CharacterReader.rangeEquals(charArray80, (int) '4', (int) (short) 10, "h");
        boolean boolean91 = characterReader27.matchesAny(charArray80);
        java.lang.String str92 = characterReader1.consumeToAny(charArray80);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\uffff' + "'", char20 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\uffff' + "'", char33 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '\uffff' + "'", char37 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertArrayEquals(charArray80, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str3 = characterReader1.consumeTo('4');
        characterReader1.rewindToMark();
        boolean boolean8 = characterReader1.rangeEquals(32768, 32768, "hi!");
        int int9 = characterReader1.pos();
        boolean boolean11 = characterReader1.matchConsumeIgnoreCase("hi");
        char char12 = characterReader1.current();
        boolean boolean14 = characterReader1.matchesIgnoreCase("i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '!' + "'", char12 == '!');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        java.lang.String str4 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str5 = characterReader1.toString();
        boolean boolean6 = characterReader1.matchesLetter();
        char char7 = characterReader1.current();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeData();
        java.lang.String str7 = characterReader1.consumeTo(' ');
        boolean boolean8 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        characterReader10.advance();
        characterReader10.mark();
        boolean boolean14 = characterReader10.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str18 = characterReader16.consumeTo('a');
        char[] charArray20 = new char[] { '#' };
        java.lang.String str21 = characterReader16.consumeToAnySorted(charArray20);
        java.lang.String str22 = characterReader10.consumeToAny(charArray20);
        boolean boolean26 = characterReader10.rangeEquals((int) (short) 1, 0, "");
        boolean boolean27 = characterReader10.matchesLetter();
        java.lang.String str28 = characterReader10.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean32 = characterReader30.matchesIgnoreCase("");
        int int34 = characterReader30.nextIndexOf('a');
        java.lang.String str35 = characterReader30.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("");
        characterReader37.advance();
        boolean boolean40 = characterReader37.containsIgnoreCase("hi!");
        java.lang.String str41 = characterReader37.consumeToEnd();
        java.lang.String str42 = characterReader37.toString();
        int int44 = characterReader37.nextIndexOf((java.lang.CharSequence) "hi");
        org.jsoup.parser.CharacterReader characterReader46 = new org.jsoup.parser.CharacterReader("");
        characterReader46.advance();
        characterReader46.mark();
        boolean boolean50 = characterReader46.matchesIgnoreCase("");
        java.lang.String str51 = characterReader46.toString();
        org.jsoup.parser.CharacterReader characterReader53 = new org.jsoup.parser.CharacterReader("");
        characterReader53.advance();
        characterReader53.mark();
        characterReader53.mark();
        boolean boolean57 = characterReader53.isEmpty();
        boolean boolean59 = characterReader53.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader61 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("");
        characterReader63.advance();
        characterReader63.mark();
        boolean boolean67 = characterReader63.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader69 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str71 = characterReader69.consumeTo('a');
        char[] charArray73 = new char[] { '#' };
        java.lang.String str74 = characterReader69.consumeToAnySorted(charArray73);
        java.lang.String str75 = characterReader63.consumeToAny(charArray73);
        boolean boolean76 = characterReader61.matchesAnySorted(charArray73);
        java.lang.String str77 = characterReader53.consumeToAny(charArray73);
        boolean boolean78 = characterReader46.matchesAnySorted(charArray73);
        boolean boolean79 = characterReader37.matchesAnySorted(charArray73);
        boolean boolean83 = org.jsoup.parser.CharacterReader.rangeEquals(charArray73, (int) (short) 1, (int) (short) -1, "hi");
        java.lang.String str84 = characterReader30.consumeToAnySorted(charArray73);
        java.lang.String str85 = characterReader10.consumeToAnySorted(charArray73);
        java.lang.String str86 = characterReader1.consumeToAny(charArray73);
        boolean boolean88 = characterReader1.matchConsumeIgnoreCase("h");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi" + "'", str35, "hi");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertArrayEquals(charArray73, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "!" + "'", str84, "!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str6 = characterReader1.consumeTo('a');
        boolean boolean10 = characterReader1.rangeEquals((int) (short) -1, 2, "");
        java.lang.String str11 = characterReader1.consumeToEnd();
        java.lang.String str13 = characterReader1.consumeTo("i!");
        characterReader1.mark();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = characterReader1.consumeToAnySorted(charArray5);
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str10 = characterReader8.consumeTo('a');
        java.lang.String str11 = characterReader8.consumeLetterSequence();
        boolean boolean12 = characterReader8.isEmpty();
        int int14 = characterReader8.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str15 = characterReader8.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        characterReader17.advance();
        char char19 = characterReader17.consume();
        java.lang.String str20 = characterReader17.consumeTagName();
        int int21 = characterReader17.pos();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        characterReader23.advance();
        boolean boolean26 = characterReader23.containsIgnoreCase("hi!");
        boolean boolean28 = characterReader23.matches("hi");
        java.lang.String str29 = characterReader23.consumeTagName();
        char[] charArray32 = new char[] { '4', ' ' };
        java.lang.String str33 = characterReader23.consumeToAnySorted(charArray32);
        boolean boolean34 = characterReader17.matchesAnySorted(charArray32);
        java.lang.String str35 = characterReader8.consumeToAny(charArray32);
        boolean boolean36 = characterReader1.matchesAny(charArray32);
        java.lang.String str37 = characterReader1.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("");
        characterReader39.advance();
        characterReader39.mark();
        characterReader39.mark();
        java.lang.String str43 = characterReader39.consumeHexSequence();
        java.lang.String str44 = characterReader39.consumeLetterSequence();
        java.lang.String str45 = characterReader39.consumeHexSequence();
        java.lang.String str46 = characterReader39.consumeData();
        char[] charArray49 = new char[] { '#', '4' };
        boolean boolean50 = characterReader39.matchesAnySorted(charArray49);
        boolean boolean54 = org.jsoup.parser.CharacterReader.rangeEquals(charArray49, (int) '4', 10, "");
        boolean boolean58 = org.jsoup.parser.CharacterReader.rangeEquals(charArray49, 0, (int) (short) 10, "!");
        boolean boolean59 = characterReader1.matchesAnySorted(charArray49);
        boolean boolean61 = characterReader1.matchConsumeIgnoreCase("hi!");
        characterReader1.rewindToMark();
        java.lang.String str63 = characterReader1.consumeLetterSequence();
        boolean boolean64 = characterReader1.matchesDigit();
        characterReader1.rewindToMark();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\uffff' + "'", char19 == '\uffff');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        java.lang.String str8 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        characterReader10.advance();
        characterReader10.mark();
        characterReader10.mark();
        java.lang.String str14 = characterReader10.consumeHexSequence();
        characterReader10.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        characterReader17.advance();
        boolean boolean20 = characterReader17.containsIgnoreCase("hi!");
        char[] charArray26 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean27 = characterReader17.matchesAny(charArray26);
        java.lang.String str28 = characterReader10.consumeToAny(charArray26);
        java.lang.String str29 = characterReader1.consumeToAny(charArray26);
        boolean boolean33 = characterReader1.rangeEquals((int) ' ', 0, "hi");
        boolean boolean35 = characterReader1.matches("hi");
        boolean boolean37 = characterReader1.matchesIgnoreCase("h");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.toString();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str9 = characterReader1.consumeData();
        java.lang.String str10 = characterReader1.toString();
        characterReader1.rewindToMark();
        boolean boolean13 = characterReader1.matchConsumeIgnoreCase("i!");
        char[] charArray14 = null;
        java.lang.String str15 = characterReader1.consumeToAnySorted(charArray14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        char char3 = characterReader1.consume();
        int int5 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        characterReader1.advance();
        boolean boolean7 = characterReader1.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean11 = characterReader9.matchesIgnoreCase("");
        int int13 = characterReader9.nextIndexOf('a');
        char char14 = characterReader9.current();
        boolean boolean15 = characterReader9.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        characterReader17.advance();
        boolean boolean20 = characterReader17.containsIgnoreCase("hi!");
        java.lang.String str22 = characterReader17.consumeTo('a');
        boolean boolean24 = characterReader17.matchConsumeIgnoreCase("hi!");
        boolean boolean25 = characterReader17.matchesLetter();
        java.lang.String str26 = characterReader17.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        characterReader28.advance();
        characterReader28.mark();
        characterReader28.mark();
        boolean boolean32 = characterReader28.isEmpty();
        boolean boolean34 = characterReader28.matches('4');
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("");
        characterReader36.advance();
        boolean boolean39 = characterReader36.containsIgnoreCase("hi!");
        java.lang.String str40 = characterReader36.consumeData();
        char[] charArray41 = new char[] {};
        java.lang.String str42 = characterReader36.consumeToAnySorted(charArray41);
        boolean boolean46 = characterReader36.rangeEquals((int) (byte) 1, 1, "");
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("");
        characterReader48.advance();
        characterReader48.mark();
        characterReader48.mark();
        java.lang.String str52 = characterReader48.consumeHexSequence();
        java.lang.String str53 = characterReader48.consumeLetterSequence();
        java.lang.String str54 = characterReader48.consumeHexSequence();
        java.lang.String str55 = characterReader48.consumeData();
        char[] charArray58 = new char[] { '#', '4' };
        boolean boolean59 = characterReader48.matchesAnySorted(charArray58);
        boolean boolean60 = characterReader36.matchesAnySorted(charArray58);
        java.lang.String str61 = characterReader28.consumeToAny(charArray58);
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("");
        characterReader63.advance();
        boolean boolean66 = characterReader63.containsIgnoreCase("hi!");
        boolean boolean68 = characterReader63.matches("hi!");
        boolean boolean69 = characterReader63.isEmpty();
        org.jsoup.parser.CharacterReader characterReader71 = new org.jsoup.parser.CharacterReader("");
        characterReader71.advance();
        characterReader71.mark();
        boolean boolean75 = characterReader71.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader77 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str79 = characterReader77.consumeTo('a');
        char[] charArray81 = new char[] { '#' };
        java.lang.String str82 = characterReader77.consumeToAnySorted(charArray81);
        java.lang.String str83 = characterReader71.consumeToAny(charArray81);
        boolean boolean84 = characterReader63.matchesAny(charArray81);
        boolean boolean85 = characterReader28.matchesAny(charArray81);
        java.lang.String str86 = characterReader17.consumeToAny(charArray81);
        java.lang.String str87 = characterReader9.consumeToAnySorted(charArray81);
        java.lang.String str88 = characterReader1.consumeToAnySorted(charArray81);
        boolean boolean92 = org.jsoup.parser.CharacterReader.rangeEquals(charArray81, (-1), 2, "!");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'h' + "'", char14 == 'h');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertArrayEquals(charArray81, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        java.lang.String str4 = characterReader1.consumeToEnd();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        boolean boolean7 = characterReader1.matchConsume("!");
        java.lang.String str8 = characterReader1.consumeData();
        characterReader1.rewindToMark();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        java.lang.String str7 = characterReader1.consumeData();
        boolean boolean8 = characterReader1.isEmpty();
        java.lang.Class<?> wildcardClass9 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        java.lang.String str8 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        characterReader10.advance();
        characterReader10.mark();
        characterReader10.mark();
        java.lang.String str14 = characterReader10.consumeHexSequence();
        characterReader10.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        characterReader17.advance();
        boolean boolean20 = characterReader17.containsIgnoreCase("hi!");
        char[] charArray26 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean27 = characterReader17.matchesAny(charArray26);
        java.lang.String str28 = characterReader10.consumeToAny(charArray26);
        java.lang.String str29 = characterReader1.consumeToAny(charArray26);
        boolean boolean33 = characterReader1.rangeEquals((int) ' ', 0, "hi");
        boolean boolean35 = characterReader1.matches("hi");
        char char36 = characterReader1.consume();
        boolean boolean38 = characterReader1.matches('h');
        java.lang.String str39 = characterReader1.consumeTagName();
        java.lang.String str40 = characterReader1.consumeLetterSequence();
        boolean boolean41 = characterReader1.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("");
        characterReader43.advance();
        boolean boolean46 = characterReader43.containsIgnoreCase("hi!");
        java.lang.String str47 = characterReader43.consumeToEnd();
        java.lang.String str48 = characterReader43.consumeTagName();
        characterReader43.advance();
        boolean boolean50 = characterReader43.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader52 = new org.jsoup.parser.CharacterReader("");
        characterReader52.advance();
        characterReader52.mark();
        characterReader52.mark();
        java.lang.String str56 = characterReader52.consumeHexSequence();
        java.lang.String str57 = characterReader52.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader59 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str61 = characterReader59.consumeTo('4');
        characterReader59.rewindToMark();
        int int63 = characterReader59.pos();
        boolean boolean65 = characterReader59.matches(' ');
        int int67 = characterReader59.nextIndexOf((java.lang.CharSequence) "hi!");
        org.jsoup.parser.CharacterReader characterReader69 = new org.jsoup.parser.CharacterReader("");
        characterReader69.advance();
        boolean boolean72 = characterReader69.containsIgnoreCase("hi!");
        char[] charArray78 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean79 = characterReader69.matchesAny(charArray78);
        java.lang.String str80 = characterReader59.consumeToAnySorted(charArray78);
        java.lang.String str81 = characterReader52.consumeToAnySorted(charArray78);
        boolean boolean82 = characterReader43.matchesAny(charArray78);
        boolean boolean86 = org.jsoup.parser.CharacterReader.rangeEquals(charArray78, 32768, (int) 'h', "");
        java.lang.String str87 = characterReader1.consumeToAny(charArray78);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + '\uffff' + "'", char36 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertArrayEquals(charArray78, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.toString();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str9 = characterReader1.consumeData();
        int int11 = characterReader1.nextIndexOf('#');
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        characterReader1.advance();
        boolean boolean14 = characterReader1.isEmpty();
        java.lang.String str15 = characterReader1.consumeData();
        boolean boolean16 = characterReader1.matchesLetter();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.matchesIgnoreCase("!");
        boolean boolean6 = characterReader1.containsIgnoreCase("!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeTo("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        boolean boolean5 = characterReader1.isEmpty();
        char[] charArray12 = new char[] { ' ', '\uffff', ' ', '4', '4', 'a' };
        java.lang.String str13 = characterReader1.consumeToAny(charArray12);
        java.lang.String str14 = characterReader1.consumeData();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str18 = characterReader16.consumeTo('4');
        characterReader16.rewindToMark();
        int int20 = characterReader16.pos();
        boolean boolean22 = characterReader16.matches(' ');
        int int24 = characterReader16.nextIndexOf((java.lang.CharSequence) "hi!");
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("");
        characterReader26.advance();
        boolean boolean29 = characterReader26.containsIgnoreCase("hi!");
        char[] charArray35 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean36 = characterReader26.matchesAny(charArray35);
        java.lang.String str37 = characterReader16.consumeToAnySorted(charArray35);
        java.lang.String str38 = characterReader1.consumeToAnySorted(charArray35);
        boolean boolean39 = characterReader1.matchesDigit();
        boolean boolean43 = characterReader1.rangeEquals((int) (short) 1, (int) (short) 10, "");
        boolean boolean45 = characterReader1.matches('h');
        boolean boolean46 = characterReader1.matchesLetter();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', '\uffff', ' ', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        boolean boolean5 = characterReader1.isEmpty();
        boolean boolean7 = characterReader1.matches('4');
        java.lang.String str8 = characterReader1.consumeDigitSequence();
        java.lang.String str9 = characterReader1.consumeDigitSequence();
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        characterReader1.mark();
        boolean boolean13 = characterReader1.matches("h");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str6 = characterReader1.consumeTo('a');
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        characterReader10.advance();
        characterReader10.mark();
        characterReader10.mark();
        boolean boolean14 = characterReader10.isEmpty();
        boolean boolean16 = characterReader10.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        characterReader20.advance();
        characterReader20.mark();
        boolean boolean24 = characterReader20.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str28 = characterReader26.consumeTo('a');
        char[] charArray30 = new char[] { '#' };
        java.lang.String str31 = characterReader26.consumeToAnySorted(charArray30);
        java.lang.String str32 = characterReader20.consumeToAny(charArray30);
        boolean boolean33 = characterReader18.matchesAnySorted(charArray30);
        java.lang.String str34 = characterReader10.consumeToAny(charArray30);
        boolean boolean35 = characterReader1.matchesAnySorted(charArray30);
        boolean boolean39 = org.jsoup.parser.CharacterReader.rangeEquals(charArray30, (int) 'a', 32768, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        boolean boolean7 = characterReader1.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        characterReader9.advance();
        boolean boolean12 = characterReader9.containsIgnoreCase("hi!");
        char[] charArray18 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean19 = characterReader9.matchesAny(charArray18);
        boolean boolean20 = characterReader1.matchesAnySorted(charArray18);
        java.lang.String str21 = characterReader1.consumeToEnd();
        int int22 = characterReader1.pos();
        java.lang.String str23 = characterReader1.toString();
        java.lang.String str24 = characterReader1.consumeDigitSequence();
        boolean boolean25 = characterReader1.matchesDigit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        boolean boolean5 = characterReader1.isEmpty();
        characterReader1.rewindToMark();
        java.lang.String str8 = characterReader1.consumeTo('4');
        boolean boolean10 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str11 = characterReader1.consumeToEnd();
        boolean boolean13 = characterReader1.matches(' ');
        char char14 = characterReader1.current();
        int int15 = characterReader1.pos();
        java.lang.String str16 = characterReader1.consumeToEnd();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = characterReader1.rangeEquals((int) (byte) 100, 3, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\uffff' + "'", char14 == '\uffff');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeData();
        boolean boolean7 = characterReader1.matchesDigit();
        java.lang.String str8 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        characterReader10.advance();
        characterReader10.mark();
        boolean boolean14 = characterReader10.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str18 = characterReader16.consumeTo('a');
        char[] charArray20 = new char[] { '#' };
        java.lang.String str21 = characterReader16.consumeToAnySorted(charArray20);
        java.lang.String str22 = characterReader10.consumeToAny(charArray20);
        java.lang.String str23 = characterReader10.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str27 = characterReader25.consumeTo('a');
        java.lang.String str28 = characterReader25.consumeLetterSequence();
        boolean boolean29 = characterReader25.isEmpty();
        char[] charArray36 = new char[] { ' ', '\uffff', ' ', '4', '4', 'a' };
        java.lang.String str37 = characterReader25.consumeToAny(charArray36);
        java.lang.String str38 = characterReader10.consumeToAnySorted(charArray36);
        java.lang.String str39 = characterReader1.consumeToAny(charArray36);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', '\uffff', ' ', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeData();
        char[] charArray6 = new char[] {};
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        boolean boolean11 = characterReader1.rangeEquals((int) (byte) 1, 1, "");
        java.lang.String str12 = characterReader1.consumeData();
        java.lang.String str13 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str14 = characterReader1.consumeToEnd();
        java.lang.String str16 = characterReader1.consumeTo('\uffff');
        java.lang.String str17 = characterReader1.consumeData();
        boolean boolean18 = characterReader1.isEmpty();
        java.lang.String str19 = characterReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        java.lang.String str4 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        characterReader1.advance();
        java.lang.String str8 = characterReader1.consumeData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeTo("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        boolean boolean5 = characterReader1.matchesIgnoreCase("");
        java.lang.String str6 = characterReader1.toString();
        characterReader1.mark();
        char char8 = characterReader1.current();
        java.lang.String str9 = characterReader1.consumeTagName();
        java.lang.String str10 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.consumeTagName();
        characterReader1.advance();
        boolean boolean8 = characterReader1.matchesDigit();
        boolean boolean10 = characterReader1.matches(' ');
        boolean boolean11 = characterReader1.matchesLetter();
        java.lang.String str12 = characterReader1.consumeHexSequence();
        boolean boolean14 = characterReader1.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        characterReader16.advance();
        characterReader16.mark();
        characterReader16.mark();
        java.lang.String str20 = characterReader16.consumeHexSequence();
        java.lang.String str21 = characterReader16.consumeLetterSequence();
        java.lang.String str22 = characterReader16.consumeHexSequence();
        java.lang.String str23 = characterReader16.consumeData();
        char[] charArray26 = new char[] { '#', '4' };
        boolean boolean27 = characterReader16.matchesAnySorted(charArray26);
        boolean boolean31 = org.jsoup.parser.CharacterReader.rangeEquals(charArray26, (int) '4', 10, "");
        boolean boolean35 = org.jsoup.parser.CharacterReader.rangeEquals(charArray26, (int) (short) 1, 32768, "hi");
        java.lang.String str36 = characterReader1.consumeToAny(charArray26);
        characterReader1.advance();
        int int39 = characterReader1.nextIndexOf((java.lang.CharSequence) "i!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        boolean boolean5 = characterReader1.isEmpty();
        boolean boolean7 = characterReader1.matches("hi!");
        java.lang.String str8 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        characterReader1.mark();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        characterReader12.advance();
        boolean boolean15 = characterReader12.containsIgnoreCase("hi!");
        java.lang.String str16 = characterReader12.consumeToEnd();
        java.lang.String str17 = characterReader12.consumeTagName();
        int int18 = characterReader12.pos();
        char char19 = characterReader12.current();
        java.lang.String str20 = characterReader12.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        characterReader22.advance();
        boolean boolean25 = characterReader22.containsIgnoreCase("hi!");
        java.lang.String str26 = characterReader22.consumeToEnd();
        java.lang.String str27 = characterReader22.toString();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        characterReader29.advance();
        characterReader29.mark();
        boolean boolean33 = characterReader29.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader35 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str37 = characterReader35.consumeTo('a');
        char[] charArray39 = new char[] { '#' };
        java.lang.String str40 = characterReader35.consumeToAnySorted(charArray39);
        java.lang.String str41 = characterReader29.consumeToAny(charArray39);
        boolean boolean42 = characterReader22.matchesAnySorted(charArray39);
        java.lang.String str43 = characterReader12.consumeToAny(charArray39);
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        characterReader45.advance();
        boolean boolean48 = characterReader45.containsIgnoreCase("hi!");
        java.lang.String str49 = characterReader45.consumeToEnd();
        java.lang.String str50 = characterReader45.consumeTagName();
        characterReader45.advance();
        boolean boolean52 = characterReader45.matchesDigit();
        boolean boolean54 = characterReader45.matches(' ');
        boolean boolean55 = characterReader45.matchesLetter();
        java.lang.String str56 = characterReader45.consumeHexSequence();
        boolean boolean58 = characterReader45.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader60 = new org.jsoup.parser.CharacterReader("");
        characterReader60.advance();
        characterReader60.mark();
        characterReader60.mark();
        java.lang.String str64 = characterReader60.consumeHexSequence();
        java.lang.String str65 = characterReader60.consumeLetterSequence();
        java.lang.String str66 = characterReader60.consumeHexSequence();
        java.lang.String str67 = characterReader60.consumeData();
        char[] charArray70 = new char[] { '#', '4' };
        boolean boolean71 = characterReader60.matchesAnySorted(charArray70);
        boolean boolean75 = org.jsoup.parser.CharacterReader.rangeEquals(charArray70, (int) '4', 10, "");
        boolean boolean79 = org.jsoup.parser.CharacterReader.rangeEquals(charArray70, (int) (short) 1, 32768, "hi");
        java.lang.String str80 = characterReader45.consumeToAny(charArray70);
        java.lang.String str81 = characterReader12.consumeToAnySorted(charArray70);
        java.lang.String str82 = characterReader1.consumeToAnySorted(charArray70);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\uffff' + "'", char19 == '\uffff');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        char[] charArray10 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        characterReader1.advance();
        boolean boolean14 = characterReader1.matches('#');
        java.lang.String str15 = characterReader1.consumeDigitSequence();
        java.lang.String str16 = characterReader1.consumeLetterSequence();
        java.lang.String str18 = characterReader1.consumeTo('#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = characterReader1.consumeToAnySorted(charArray5);
        characterReader1.mark();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        characterReader9.advance();
        characterReader9.mark();
        characterReader9.mark();
        java.lang.String str13 = characterReader9.consumeHexSequence();
        characterReader9.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        characterReader16.advance();
        boolean boolean19 = characterReader16.containsIgnoreCase("hi!");
        char[] charArray25 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean26 = characterReader16.matchesAny(charArray25);
        java.lang.String str27 = characterReader9.consumeToAny(charArray25);
        char char28 = characterReader9.current();
        boolean boolean29 = characterReader9.isEmpty();
        java.lang.String str30 = characterReader9.toString();
        java.lang.String str31 = characterReader9.consumeLetterSequence();
        java.lang.String str32 = characterReader9.consumeData();
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("");
        characterReader36.advance();
        characterReader36.mark();
        boolean boolean40 = characterReader36.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str44 = characterReader42.consumeTo('a');
        char[] charArray46 = new char[] { '#' };
        java.lang.String str47 = characterReader42.consumeToAnySorted(charArray46);
        java.lang.String str48 = characterReader36.consumeToAny(charArray46);
        boolean boolean49 = characterReader34.matchesAnySorted(charArray46);
        java.lang.String str50 = characterReader9.consumeToAnySorted(charArray46);
        java.lang.String str51 = characterReader1.consumeToAnySorted(charArray46);
        java.lang.String str52 = characterReader1.consumeTagName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\uffff' + "'", char28 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.toString();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str9 = characterReader1.consumeData();
        int int11 = characterReader1.nextIndexOf('#');
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        characterReader1.advance();
        boolean boolean14 = characterReader1.isEmpty();
        boolean boolean16 = characterReader1.containsIgnoreCase("!");
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("hi!");
        int int20 = characterReader18.nextIndexOf((java.lang.CharSequence) "hi");
        int int22 = characterReader18.nextIndexOf('!');
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str26 = characterReader24.consumeTo('a');
        char[] charArray28 = new char[] { '#' };
        java.lang.String str29 = characterReader24.consumeToAnySorted(charArray28);
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str33 = characterReader31.consumeTo('a');
        java.lang.String str34 = characterReader31.consumeLetterSequence();
        boolean boolean35 = characterReader31.isEmpty();
        int int37 = characterReader31.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str38 = characterReader31.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("");
        characterReader40.advance();
        char char42 = characterReader40.consume();
        java.lang.String str43 = characterReader40.consumeTagName();
        int int44 = characterReader40.pos();
        org.jsoup.parser.CharacterReader characterReader46 = new org.jsoup.parser.CharacterReader("");
        characterReader46.advance();
        boolean boolean49 = characterReader46.containsIgnoreCase("hi!");
        boolean boolean51 = characterReader46.matches("hi");
        java.lang.String str52 = characterReader46.consumeTagName();
        char[] charArray55 = new char[] { '4', ' ' };
        java.lang.String str56 = characterReader46.consumeToAnySorted(charArray55);
        boolean boolean57 = characterReader40.matchesAnySorted(charArray55);
        java.lang.String str58 = characterReader31.consumeToAny(charArray55);
        boolean boolean59 = characterReader24.matchesAny(charArray55);
        java.lang.String str60 = characterReader24.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader62 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str64 = characterReader62.consumeTo('a');
        char[] charArray66 = new char[] { '#' };
        java.lang.String str67 = characterReader62.consumeToAnySorted(charArray66);
        boolean boolean71 = org.jsoup.parser.CharacterReader.rangeEquals(charArray66, (int) '\uffff', (int) 'h', "hi");
        boolean boolean72 = characterReader24.matchesAny(charArray66);
        java.lang.String str73 = characterReader18.consumeToAny(charArray66);
        boolean boolean77 = org.jsoup.parser.CharacterReader.rangeEquals(charArray66, (int) (byte) 0, (int) (short) 1, "hi");
        java.lang.String str78 = characterReader1.consumeToAnySorted(charArray66);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + '\uffff' + "'", char42 == '\uffff');
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        characterReader7.advance();
        characterReader7.mark();
        boolean boolean11 = characterReader7.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str15 = characterReader13.consumeTo('a');
        char[] charArray17 = new char[] { '#' };
        java.lang.String str18 = characterReader13.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader7.consumeToAny(charArray17);
        boolean boolean20 = characterReader1.matchesAnySorted(charArray17);
        boolean boolean21 = characterReader1.matchesDigit();
        boolean boolean23 = characterReader1.matchConsumeIgnoreCase("");
        int int25 = characterReader1.nextIndexOf('a');
        boolean boolean26 = characterReader1.matchesLetter();
        characterReader1.advance();
        boolean boolean29 = characterReader1.matchConsumeIgnoreCase("hi");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        characterReader7.advance();
        characterReader7.mark();
        boolean boolean11 = characterReader7.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str15 = characterReader13.consumeTo('a');
        char[] charArray17 = new char[] { '#' };
        java.lang.String str18 = characterReader13.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader7.consumeToAny(charArray17);
        boolean boolean20 = characterReader1.matchesAnySorted(charArray17);
        boolean boolean21 = characterReader1.matchesDigit();
        boolean boolean25 = characterReader1.rangeEquals((int) (short) 100, (int) (short) 10, "");
        java.lang.String str26 = characterReader1.consumeHexSequence();
        boolean boolean27 = characterReader1.isEmpty();
        char char28 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 1, count -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\uffff' + "'", char28 == '\uffff');
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        characterReader8.advance();
        boolean boolean11 = characterReader8.containsIgnoreCase("hi!");
        char[] charArray17 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean18 = characterReader8.matchesAny(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        char char20 = characterReader1.current();
        boolean boolean21 = characterReader1.isEmpty();
        java.lang.String str22 = characterReader1.toString();
        java.lang.String str23 = characterReader1.consumeData();
        java.lang.String str24 = characterReader1.consumeData();
        java.lang.String str25 = characterReader1.consumeDigitSequence();
        java.lang.String str26 = characterReader1.consumeData();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\uffff' + "'", char20 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        boolean boolean5 = characterReader1.isEmpty();
        boolean boolean7 = characterReader1.matches("hi!");
        java.lang.String str8 = characterReader1.consumeHexSequence();
        boolean boolean9 = characterReader1.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str13 = characterReader11.consumeTo('a');
        java.lang.String str14 = characterReader11.consumeLetterSequence();
        boolean boolean15 = characterReader11.isEmpty();
        char[] charArray22 = new char[] { ' ', '\uffff', ' ', '4', '4', 'a' };
        java.lang.String str23 = characterReader11.consumeToAny(charArray22);
        java.lang.String str24 = characterReader1.consumeToAny(charArray22);
        int int26 = characterReader1.nextIndexOf('a');
        java.lang.String str27 = characterReader1.consumeData();
        int int28 = characterReader1.pos();
        java.lang.String str29 = characterReader1.consumeTagName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { ' ', '\uffff', ' ', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeData();
        char[] charArray6 = new char[] {};
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        boolean boolean11 = characterReader1.rangeEquals((int) (byte) 1, 1, "");
        java.lang.String str12 = characterReader1.consumeData();
        boolean boolean14 = characterReader1.matchesIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        characterReader16.advance();
        characterReader16.mark();
        characterReader16.mark();
        java.lang.String str20 = characterReader16.consumeHexSequence();
        java.lang.String str21 = characterReader16.consumeLetterSequence();
        java.lang.String str22 = characterReader16.consumeHexSequence();
        java.lang.String str23 = characterReader16.consumeData();
        char[] charArray26 = new char[] { '#', '4' };
        boolean boolean27 = characterReader16.matchesAnySorted(charArray26);
        char char28 = characterReader16.current();
        java.lang.String str29 = characterReader16.consumeToEnd();
        java.lang.String str30 = characterReader16.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        characterReader32.advance();
        char char34 = characterReader32.consume();
        java.lang.String str35 = characterReader32.consumeTagName();
        int int36 = characterReader32.pos();
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        characterReader38.advance();
        boolean boolean41 = characterReader38.containsIgnoreCase("hi!");
        boolean boolean43 = characterReader38.matches("hi");
        java.lang.String str44 = characterReader38.consumeTagName();
        char[] charArray47 = new char[] { '4', ' ' };
        java.lang.String str48 = characterReader38.consumeToAnySorted(charArray47);
        boolean boolean49 = characterReader32.matchesAnySorted(charArray47);
        boolean boolean50 = characterReader16.matchesAny(charArray47);
        java.lang.String str51 = characterReader1.consumeToAny(charArray47);
        boolean boolean52 = characterReader1.isEmpty();
        characterReader1.advance();
        boolean boolean55 = characterReader1.matchConsume("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\uffff' + "'", char28 == '\uffff');
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\uffff' + "'", char34 == '\uffff');
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        java.lang.String str7 = characterReader1.consumeHexSequence();
        java.lang.String str8 = characterReader1.consumeData();
        int int10 = characterReader1.nextIndexOf('4');
        boolean boolean12 = characterReader1.matches('h');
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str16 = characterReader14.consumeTo('a');
        java.lang.String str17 = characterReader14.consumeLetterSequence();
        boolean boolean18 = characterReader14.isEmpty();
        int int20 = characterReader14.nextIndexOf((java.lang.CharSequence) "hi");
        char char21 = characterReader14.consume();
        boolean boolean22 = characterReader14.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str26 = characterReader24.consumeTo('a');
        char[] charArray28 = new char[] { '#' };
        java.lang.String str29 = characterReader24.consumeToAnySorted(charArray28);
        java.lang.String str30 = characterReader14.consumeToAny(charArray28);
        boolean boolean31 = characterReader1.matchesAny(charArray28);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\uffff' + "'", char21 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean6 = characterReader1.matches("hi");
        java.lang.String str7 = characterReader1.consumeTagName();
        char[] charArray10 = new char[] { '4', ' ' };
        java.lang.String str11 = characterReader1.consumeToAnySorted(charArray10);
        characterReader1.rewindToMark();
        java.lang.String str13 = characterReader1.consumeTagName();
        boolean boolean14 = characterReader1.isEmpty();
        java.lang.String str15 = characterReader1.consumeData();
        int int17 = characterReader1.nextIndexOf('!');
        boolean boolean19 = characterReader1.containsIgnoreCase("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        int int8 = characterReader1.nextIndexOf('h');
        characterReader1.mark();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        boolean boolean7 = characterReader1.matchConsume("hi!");
        boolean boolean9 = characterReader1.matchConsume("!");
        java.lang.String str10 = characterReader1.toString();
        char char11 = characterReader1.current();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str3 = characterReader1.consumeTo('4');
        characterReader1.rewindToMark();
        int int5 = characterReader1.pos();
        boolean boolean6 = characterReader1.matchesDigit();
        char char7 = characterReader1.current();
        java.lang.String str8 = characterReader1.consumeTagName();
        int int10 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        boolean boolean12 = characterReader1.matchConsume("i!");
        char char13 = characterReader1.current();
        java.lang.String str14 = characterReader1.consumeLetterSequence();
        int int15 = characterReader1.pos();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'h' + "'", char7 == 'h');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeData();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        characterReader1.mark();
        java.lang.String str9 = characterReader1.consumeTo('h');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.consumeTagName();
        int int7 = characterReader1.pos();
        char char8 = characterReader1.current();
        java.lang.String str9 = characterReader1.consumeTagName();
        boolean boolean10 = characterReader1.matchesDigit();
        boolean boolean12 = characterReader1.matchConsumeIgnoreCase("!");
        boolean boolean14 = characterReader1.matchesIgnoreCase("");
        java.lang.String str16 = characterReader1.consumeTo('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = characterReader1.consumeTo("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        char char3 = characterReader1.consume();
        java.lang.String str4 = characterReader1.consumeTagName();
        int int5 = characterReader1.pos();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        characterReader7.advance();
        boolean boolean10 = characterReader7.containsIgnoreCase("hi!");
        boolean boolean12 = characterReader7.matches("hi");
        java.lang.String str13 = characterReader7.consumeTagName();
        char[] charArray16 = new char[] { '4', ' ' };
        java.lang.String str17 = characterReader7.consumeToAnySorted(charArray16);
        boolean boolean18 = characterReader1.matchesAnySorted(charArray16);
        boolean boolean20 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean21 = characterReader1.matchesDigit();
        java.lang.String str22 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str23 = characterReader1.consumeLetterSequence();
        java.lang.String str24 = characterReader1.consumeLetterThenDigitSequence();
        characterReader1.advance();
        java.lang.String str26 = characterReader1.consumeToEnd();
        boolean boolean27 = characterReader1.isEmpty();
        int int28 = characterReader1.pos();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        boolean boolean5 = characterReader1.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str9 = characterReader7.consumeTo('a');
        char[] charArray11 = new char[] { '#' };
        java.lang.String str12 = characterReader7.consumeToAnySorted(charArray11);
        java.lang.String str13 = characterReader1.consumeToAny(charArray11);
        boolean boolean14 = characterReader1.matchesDigit();
        characterReader1.advance();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        characterReader17.advance();
        boolean boolean20 = characterReader17.containsIgnoreCase("hi!");
        boolean boolean22 = characterReader17.matches("hi");
        java.lang.String str23 = characterReader17.consumeLetterThenDigitSequence();
        java.lang.String str25 = characterReader17.consumeTo(' ');
        boolean boolean29 = characterReader17.rangeEquals((int) (byte) 100, (int) (byte) 100, "hi");
        java.lang.String str30 = characterReader17.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        characterReader32.advance();
        characterReader32.mark();
        boolean boolean36 = characterReader32.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str40 = characterReader38.consumeTo('a');
        char[] charArray42 = new char[] { '#' };
        java.lang.String str43 = characterReader38.consumeToAnySorted(charArray42);
        java.lang.String str44 = characterReader32.consumeToAny(charArray42);
        boolean boolean48 = characterReader32.rangeEquals((int) (short) 1, 0, "");
        boolean boolean49 = characterReader32.matchesLetter();
        int int50 = characterReader32.pos();
        java.lang.String str51 = characterReader32.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader53 = new org.jsoup.parser.CharacterReader("");
        characterReader53.advance();
        boolean boolean56 = characterReader53.containsIgnoreCase("hi!");
        boolean boolean58 = characterReader53.matches("hi!");
        boolean boolean59 = characterReader53.isEmpty();
        org.jsoup.parser.CharacterReader characterReader61 = new org.jsoup.parser.CharacterReader("");
        characterReader61.advance();
        characterReader61.mark();
        boolean boolean65 = characterReader61.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader67 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str69 = characterReader67.consumeTo('a');
        char[] charArray71 = new char[] { '#' };
        java.lang.String str72 = characterReader67.consumeToAnySorted(charArray71);
        java.lang.String str73 = characterReader61.consumeToAny(charArray71);
        boolean boolean74 = characterReader53.matchesAny(charArray71);
        boolean boolean78 = org.jsoup.parser.CharacterReader.rangeEquals(charArray71, (int) ' ', (int) (byte) 100, "hi");
        boolean boolean79 = characterReader32.matchesAnySorted(charArray71);
        boolean boolean80 = characterReader17.matchesAnySorted(charArray71);
        boolean boolean81 = characterReader1.matchesAnySorted(charArray71);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertArrayEquals(charArray71, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        char char3 = characterReader1.consume();
        java.lang.String str4 = characterReader1.consumeTagName();
        java.lang.String str5 = characterReader1.consumeToEnd();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int3 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        boolean boolean4 = characterReader1.matchesLetter();
        int int5 = characterReader1.pos();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean9 = characterReader7.matchConsumeIgnoreCase("");
        java.lang.String str10 = characterReader7.consumeToEnd();
        boolean boolean12 = characterReader7.matchesIgnoreCase("h");
        characterReader7.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str17 = characterReader15.consumeTo('a');
        java.lang.String str18 = characterReader15.consumeToEnd();
        characterReader15.mark();
        boolean boolean20 = characterReader15.isEmpty();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        characterReader22.advance();
        boolean boolean25 = characterReader22.containsIgnoreCase("hi!");
        java.lang.String str26 = characterReader22.consumeData();
        java.lang.String str28 = characterReader22.consumeTo(' ');
        int int29 = characterReader22.pos();
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("");
        characterReader31.advance();
        boolean boolean34 = characterReader31.containsIgnoreCase("hi!");
        java.lang.String str35 = characterReader31.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("");
        characterReader37.advance();
        characterReader37.mark();
        boolean boolean41 = characterReader37.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str45 = characterReader43.consumeTo('a');
        char[] charArray47 = new char[] { '#' };
        java.lang.String str48 = characterReader43.consumeToAnySorted(charArray47);
        java.lang.String str49 = characterReader37.consumeToAny(charArray47);
        boolean boolean50 = characterReader31.matchesAnySorted(charArray47);
        boolean boolean51 = characterReader31.matchesDigit();
        boolean boolean55 = characterReader31.rangeEquals((int) (short) 100, (int) (short) 10, "");
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str59 = characterReader57.consumeTo('4');
        characterReader57.rewindToMark();
        int int61 = characterReader57.pos();
        boolean boolean63 = characterReader57.matches(' ');
        int int65 = characterReader57.nextIndexOf((java.lang.CharSequence) "hi!");
        org.jsoup.parser.CharacterReader characterReader67 = new org.jsoup.parser.CharacterReader("");
        characterReader67.advance();
        boolean boolean70 = characterReader67.containsIgnoreCase("hi!");
        char[] charArray76 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean77 = characterReader67.matchesAny(charArray76);
        java.lang.String str78 = characterReader57.consumeToAnySorted(charArray76);
        java.lang.String str79 = characterReader31.consumeToAny(charArray76);
        boolean boolean83 = org.jsoup.parser.CharacterReader.rangeEquals(charArray76, (int) (short) 0, (int) (short) -1, "");
        boolean boolean84 = characterReader22.matchesAnySorted(charArray76);
        java.lang.String str85 = characterReader15.consumeToAny(charArray76);
        java.lang.String str86 = characterReader7.consumeToAnySorted(charArray76);
        java.lang.String str87 = characterReader1.consumeToAnySorted(charArray76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertArrayEquals(charArray76, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        java.lang.String str4 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean8 = characterReader1.rangeEquals((int) ' ', 3, "");
        characterReader1.advance();
        boolean boolean11 = characterReader1.matches('a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        boolean boolean5 = characterReader1.isEmpty();
        int int7 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str8 = characterReader1.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        characterReader10.advance();
        char char12 = characterReader10.consume();
        java.lang.String str13 = characterReader10.consumeTagName();
        int int14 = characterReader10.pos();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        characterReader16.advance();
        boolean boolean19 = characterReader16.containsIgnoreCase("hi!");
        boolean boolean21 = characterReader16.matches("hi");
        java.lang.String str22 = characterReader16.consumeTagName();
        char[] charArray25 = new char[] { '4', ' ' };
        java.lang.String str26 = characterReader16.consumeToAnySorted(charArray25);
        boolean boolean27 = characterReader10.matchesAnySorted(charArray25);
        java.lang.String str28 = characterReader1.consumeToAny(charArray25);
        java.lang.String str29 = characterReader1.consumeTagName();
        java.lang.String str31 = characterReader1.consumeTo('\uffff');
        boolean boolean32 = characterReader1.matchesLetter();
        characterReader1.rewindToMark();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.consumeTagName();
        characterReader1.advance();
        boolean boolean8 = characterReader1.matchesDigit();
        boolean boolean10 = characterReader1.matches(' ');
        boolean boolean12 = characterReader1.matches("i!");
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        characterReader14.advance();
        boolean boolean17 = characterReader14.containsIgnoreCase("hi!");
        java.lang.String str18 = characterReader14.consumeToEnd();
        java.lang.String str19 = characterReader14.toString();
        int int21 = characterReader14.nextIndexOf((java.lang.CharSequence) "hi");
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        characterReader23.advance();
        characterReader23.mark();
        characterReader23.mark();
        java.lang.String str27 = characterReader23.consumeHexSequence();
        java.lang.String str28 = characterReader23.consumeLetterSequence();
        java.lang.String str29 = characterReader23.consumeHexSequence();
        java.lang.String str30 = characterReader23.consumeData();
        char[] charArray33 = new char[] { '#', '4' };
        boolean boolean34 = characterReader23.matchesAnySorted(charArray33);
        char char35 = characterReader23.current();
        java.lang.String str36 = characterReader23.consumeToEnd();
        java.lang.String str37 = characterReader23.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("");
        characterReader39.advance();
        characterReader39.mark();
        characterReader39.mark();
        boolean boolean43 = characterReader39.isEmpty();
        boolean boolean45 = characterReader39.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader47 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("");
        characterReader49.advance();
        characterReader49.mark();
        boolean boolean53 = characterReader49.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader55 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str57 = characterReader55.consumeTo('a');
        char[] charArray59 = new char[] { '#' };
        java.lang.String str60 = characterReader55.consumeToAnySorted(charArray59);
        java.lang.String str61 = characterReader49.consumeToAny(charArray59);
        boolean boolean62 = characterReader47.matchesAnySorted(charArray59);
        java.lang.String str63 = characterReader39.consumeToAny(charArray59);
        boolean boolean64 = characterReader23.matchesAny(charArray59);
        java.lang.String str65 = characterReader14.consumeToAnySorted(charArray59);
        boolean boolean66 = characterReader1.matchesAny(charArray59);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + '\uffff' + "'", char35 == '\uffff');
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str6 = characterReader1.consumeTo('a');
        boolean boolean10 = characterReader1.rangeEquals((int) (short) -1, 2, "");
        boolean boolean12 = characterReader1.matchConsume("");
        int int14 = characterReader1.nextIndexOf('a');
        java.lang.String str15 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str17 = characterReader1.consumeTo('a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeData();
        boolean boolean7 = characterReader1.matchesDigit();
        java.lang.String str8 = characterReader1.consumeDigitSequence();
        boolean boolean9 = characterReader1.isEmpty();
        java.lang.String str10 = characterReader1.consumeLetterSequence();
        boolean boolean12 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean13 = characterReader1.isEmpty();
        characterReader1.advance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        boolean boolean5 = characterReader1.isEmpty();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        characterReader7.advance();
        boolean boolean10 = characterReader7.containsIgnoreCase("hi!");
        char[] charArray16 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean17 = characterReader7.matchesAny(charArray16);
        boolean boolean18 = characterReader1.matchesAny(charArray16);
        java.lang.String str19 = characterReader1.toString();
        boolean boolean21 = characterReader1.matchConsume("");
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        characterReader23.advance();
        boolean boolean26 = characterReader23.containsIgnoreCase("hi!");
        java.lang.String str27 = characterReader23.consumeToEnd();
        java.lang.String str28 = characterReader23.toString();
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        characterReader30.advance();
        characterReader30.mark();
        boolean boolean34 = characterReader30.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str38 = characterReader36.consumeTo('a');
        char[] charArray40 = new char[] { '#' };
        java.lang.String str41 = characterReader36.consumeToAnySorted(charArray40);
        java.lang.String str42 = characterReader30.consumeToAny(charArray40);
        boolean boolean43 = characterReader23.matchesAnySorted(charArray40);
        java.lang.String str44 = characterReader1.consumeToAny(charArray40);
        boolean boolean48 = characterReader1.rangeEquals((int) 'h', (int) (byte) 100, "i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        characterReader7.advance();
        characterReader7.mark();
        boolean boolean11 = characterReader7.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str15 = characterReader13.consumeTo('a');
        char[] charArray17 = new char[] { '#' };
        java.lang.String str18 = characterReader13.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader7.consumeToAny(charArray17);
        boolean boolean20 = characterReader1.matchesAnySorted(charArray17);
        boolean boolean21 = characterReader1.matchesDigit();
        boolean boolean25 = characterReader1.rangeEquals((int) (short) 100, (int) (short) 10, "");
        java.lang.String str26 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str30 = characterReader28.consumeTo('a');
        char[] charArray32 = new char[] { '#' };
        java.lang.String str33 = characterReader28.consumeToAnySorted(charArray32);
        char char34 = characterReader28.current();
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("");
        characterReader36.advance();
        boolean boolean39 = characterReader36.containsIgnoreCase("hi!");
        java.lang.String str40 = characterReader36.consumeToEnd();
        java.lang.String str41 = characterReader36.toString();
        int int43 = characterReader36.nextIndexOf((java.lang.CharSequence) "hi");
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        characterReader45.advance();
        characterReader45.mark();
        boolean boolean49 = characterReader45.matchesIgnoreCase("");
        java.lang.String str50 = characterReader45.toString();
        org.jsoup.parser.CharacterReader characterReader52 = new org.jsoup.parser.CharacterReader("");
        characterReader52.advance();
        characterReader52.mark();
        characterReader52.mark();
        boolean boolean56 = characterReader52.isEmpty();
        boolean boolean58 = characterReader52.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader60 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader62 = new org.jsoup.parser.CharacterReader("");
        characterReader62.advance();
        characterReader62.mark();
        boolean boolean66 = characterReader62.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader68 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str70 = characterReader68.consumeTo('a');
        char[] charArray72 = new char[] { '#' };
        java.lang.String str73 = characterReader68.consumeToAnySorted(charArray72);
        java.lang.String str74 = characterReader62.consumeToAny(charArray72);
        boolean boolean75 = characterReader60.matchesAnySorted(charArray72);
        java.lang.String str76 = characterReader52.consumeToAny(charArray72);
        boolean boolean77 = characterReader45.matchesAnySorted(charArray72);
        boolean boolean78 = characterReader36.matchesAnySorted(charArray72);
        boolean boolean79 = characterReader28.matchesAny(charArray72);
        java.lang.String str80 = characterReader1.consumeToAnySorted(charArray72);
        characterReader1.rewindToMark();
        boolean boolean85 = characterReader1.rangeEquals((int) ' ', (int) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\uffff' + "'", char34 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = characterReader1.consumeToAnySorted(charArray5);
        boolean boolean8 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean10 = characterReader1.matchConsumeIgnoreCase("hi");
        java.lang.String str11 = characterReader1.consumeLetterSequence();
        boolean boolean12 = characterReader1.isEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        java.lang.String str4 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str5 = characterReader1.toString();
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean9 = characterReader1.matchConsume("");
        boolean boolean11 = characterReader1.matches("i!");
        boolean boolean13 = characterReader1.matches("!");
        boolean boolean15 = characterReader1.matches("i");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = characterReader1.consumeToAnySorted(charArray5);
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str10 = characterReader8.consumeTo('a');
        java.lang.String str11 = characterReader8.consumeLetterSequence();
        boolean boolean12 = characterReader8.isEmpty();
        int int14 = characterReader8.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str15 = characterReader8.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        characterReader17.advance();
        char char19 = characterReader17.consume();
        java.lang.String str20 = characterReader17.consumeTagName();
        int int21 = characterReader17.pos();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        characterReader23.advance();
        boolean boolean26 = characterReader23.containsIgnoreCase("hi!");
        boolean boolean28 = characterReader23.matches("hi");
        java.lang.String str29 = characterReader23.consumeTagName();
        char[] charArray32 = new char[] { '4', ' ' };
        java.lang.String str33 = characterReader23.consumeToAnySorted(charArray32);
        boolean boolean34 = characterReader17.matchesAnySorted(charArray32);
        java.lang.String str35 = characterReader8.consumeToAny(charArray32);
        boolean boolean36 = characterReader1.matchesAny(charArray32);
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str40 = characterReader38.consumeTo('a');
        char[] charArray42 = new char[] { '#' };
        java.lang.String str43 = characterReader38.consumeToAnySorted(charArray42);
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str47 = characterReader45.consumeTo('a');
        java.lang.String str48 = characterReader45.consumeLetterSequence();
        boolean boolean49 = characterReader45.isEmpty();
        int int51 = characterReader45.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str52 = characterReader45.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader54 = new org.jsoup.parser.CharacterReader("");
        characterReader54.advance();
        char char56 = characterReader54.consume();
        java.lang.String str57 = characterReader54.consumeTagName();
        int int58 = characterReader54.pos();
        org.jsoup.parser.CharacterReader characterReader60 = new org.jsoup.parser.CharacterReader("");
        characterReader60.advance();
        boolean boolean63 = characterReader60.containsIgnoreCase("hi!");
        boolean boolean65 = characterReader60.matches("hi");
        java.lang.String str66 = characterReader60.consumeTagName();
        char[] charArray69 = new char[] { '4', ' ' };
        java.lang.String str70 = characterReader60.consumeToAnySorted(charArray69);
        boolean boolean71 = characterReader54.matchesAnySorted(charArray69);
        java.lang.String str72 = characterReader45.consumeToAny(charArray69);
        boolean boolean73 = characterReader38.matchesAny(charArray69);
        java.lang.String str74 = characterReader1.consumeToAnySorted(charArray69);
        int int76 = characterReader1.nextIndexOf((java.lang.CharSequence) "!");
        boolean boolean78 = characterReader1.matchConsumeIgnoreCase("i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\uffff' + "'", char19 == '\uffff');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + char56 + "' != '" + '\uffff' + "'", char56 == '\uffff');
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        char char3 = characterReader1.consume();
        int int5 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        characterReader1.advance();
        characterReader1.unconsume();
        boolean boolean9 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean11 = characterReader1.matches('!');
        java.lang.String str13 = characterReader1.consumeTo("!");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        char[] charArray10 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        boolean boolean13 = characterReader1.matchConsume("");
        java.lang.String str14 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str18 = characterReader16.consumeTo('a');
        char[] charArray20 = new char[] { '#' };
        java.lang.String str21 = characterReader16.consumeToAnySorted(charArray20);
        char char22 = characterReader16.current();
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        characterReader24.advance();
        boolean boolean27 = characterReader24.containsIgnoreCase("hi!");
        java.lang.String str28 = characterReader24.consumeToEnd();
        java.lang.String str29 = characterReader24.toString();
        int int31 = characterReader24.nextIndexOf((java.lang.CharSequence) "hi");
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("");
        characterReader33.advance();
        characterReader33.mark();
        boolean boolean37 = characterReader33.matchesIgnoreCase("");
        java.lang.String str38 = characterReader33.toString();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("");
        characterReader40.advance();
        characterReader40.mark();
        characterReader40.mark();
        boolean boolean44 = characterReader40.isEmpty();
        boolean boolean46 = characterReader40.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("");
        characterReader50.advance();
        characterReader50.mark();
        boolean boolean54 = characterReader50.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader56 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str58 = characterReader56.consumeTo('a');
        char[] charArray60 = new char[] { '#' };
        java.lang.String str61 = characterReader56.consumeToAnySorted(charArray60);
        java.lang.String str62 = characterReader50.consumeToAny(charArray60);
        boolean boolean63 = characterReader48.matchesAnySorted(charArray60);
        java.lang.String str64 = characterReader40.consumeToAny(charArray60);
        boolean boolean65 = characterReader33.matchesAnySorted(charArray60);
        boolean boolean66 = characterReader24.matchesAnySorted(charArray60);
        boolean boolean67 = characterReader16.matchesAny(charArray60);
        java.lang.String str68 = characterReader1.consumeToAny(charArray60);
        int int70 = characterReader1.nextIndexOf('a');
        java.lang.String str71 = characterReader1.consumeLetterSequence();
        java.lang.String str72 = characterReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\uffff' + "'", char22 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        char char3 = characterReader1.consume();
        java.lang.String str4 = characterReader1.consumeData();
        boolean boolean6 = characterReader1.matchConsume("hi");
        java.lang.String str7 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean9 = characterReader1.matchConsume("hi!");
        java.lang.String str11 = characterReader1.consumeTo("hi");
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        characterReader13.advance();
        boolean boolean16 = characterReader13.containsIgnoreCase("hi!");
        boolean boolean18 = characterReader13.matches("hi");
        java.lang.String str19 = characterReader13.consumeTagName();
        char[] charArray22 = new char[] { '4', ' ' };
        java.lang.String str23 = characterReader13.consumeToAnySorted(charArray22);
        boolean boolean24 = characterReader1.matchesAnySorted(charArray22);
        boolean boolean25 = characterReader1.isEmpty();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        boolean boolean5 = characterReader1.isEmpty();
        int int7 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str8 = characterReader1.consumeHexSequence();
        boolean boolean9 = characterReader1.isEmpty();
        characterReader1.advance();
        boolean boolean12 = characterReader1.matchesIgnoreCase("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = characterReader1.consumeToAnySorted(charArray5);
        char char7 = characterReader1.current();
        boolean boolean9 = characterReader1.matchConsume("");
        characterReader1.advance();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        characterReader12.advance();
        boolean boolean15 = characterReader12.containsIgnoreCase("hi!");
        java.lang.String str16 = characterReader12.consumeToEnd();
        boolean boolean18 = characterReader12.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        characterReader20.advance();
        boolean boolean23 = characterReader20.containsIgnoreCase("hi!");
        char[] charArray29 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean30 = characterReader20.matchesAny(charArray29);
        boolean boolean31 = characterReader12.matchesAnySorted(charArray29);
        boolean boolean32 = characterReader1.matchesAnySorted(charArray29);
        java.lang.String str33 = characterReader1.consumeData();
        characterReader1.mark();
        int int36 = characterReader1.nextIndexOf('\uffff');
        java.lang.String str37 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("");
        characterReader3.advance();
        characterReader3.mark();
        boolean boolean7 = characterReader3.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str11 = characterReader9.consumeTo('a');
        char[] charArray13 = new char[] { '#' };
        java.lang.String str14 = characterReader9.consumeToAnySorted(charArray13);
        java.lang.String str15 = characterReader3.consumeToAny(charArray13);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray13);
        java.lang.String str17 = characterReader1.consumeToEnd();
        boolean boolean19 = characterReader1.matchConsume("hi!");
        boolean boolean21 = characterReader1.matches("i");
        boolean boolean22 = characterReader1.matchesLetter();
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = characterReader1.consumeToAnySorted(charArray5);
        char char7 = characterReader1.current();
        boolean boolean9 = characterReader1.matchConsume("");
        characterReader1.advance();
        int int12 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        characterReader1.unconsume();
        boolean boolean15 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean16 = characterReader1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("");
        characterReader3.advance();
        characterReader3.mark();
        boolean boolean7 = characterReader3.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str11 = characterReader9.consumeTo('a');
        char[] charArray13 = new char[] { '#' };
        java.lang.String str14 = characterReader9.consumeToAnySorted(charArray13);
        java.lang.String str15 = characterReader3.consumeToAny(charArray13);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray13);
        java.lang.String str17 = characterReader1.consumeToEnd();
        boolean boolean19 = characterReader1.matchConsume("hi!");
        boolean boolean20 = characterReader1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = characterReader1.consumeTo("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = characterReader1.consumeToAnySorted(charArray5);
        boolean boolean8 = characterReader1.matchesIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.toString();
        java.lang.String str11 = characterReader1.consumeTo('a');
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = characterReader1.matchesDigit();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str3 = characterReader1.consumeTo('4');
        characterReader1.rewindToMark();
        int int5 = characterReader1.pos();
        java.lang.String str6 = characterReader1.consumeToEnd();
        characterReader1.advance();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str11 = characterReader9.consumeTo('4');
        characterReader9.rewindToMark();
        java.lang.String str13 = characterReader9.consumeData();
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str17 = characterReader15.consumeTo('4');
        characterReader15.rewindToMark();
        boolean boolean22 = characterReader15.rangeEquals(32768, 32768, "hi!");
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        characterReader24.advance();
        boolean boolean27 = characterReader24.containsIgnoreCase("hi!");
        java.lang.String str28 = characterReader24.consumeToEnd();
        java.lang.String str29 = characterReader24.toString();
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("");
        characterReader31.advance();
        characterReader31.mark();
        boolean boolean35 = characterReader31.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str39 = characterReader37.consumeTo('a');
        char[] charArray41 = new char[] { '#' };
        java.lang.String str42 = characterReader37.consumeToAnySorted(charArray41);
        java.lang.String str43 = characterReader31.consumeToAny(charArray41);
        boolean boolean44 = characterReader24.matchesAnySorted(charArray41);
        java.lang.String str45 = characterReader15.consumeToAny(charArray41);
        boolean boolean46 = characterReader9.matchesAny(charArray41);
        boolean boolean47 = characterReader1.matchesAnySorted(charArray41);
        java.lang.String str48 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str49 = characterReader1.consumeTagName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count -1, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matchesIgnoreCase("");
        int int5 = characterReader1.nextIndexOf('a');
        char char6 = characterReader1.current();
        java.lang.String str7 = characterReader1.consumeLetterSequence();
        boolean boolean11 = characterReader1.rangeEquals((int) (short) -1, (int) '4', "hi");
        java.lang.String str12 = characterReader1.toString();
        char char13 = characterReader1.consume();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'h' + "'", char6 == 'h');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi" + "'", str7, "hi");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "!" + "'", str12, "!");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '!' + "'", char13 == '!');
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.toString();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str9 = characterReader1.toString();
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        char char3 = characterReader1.consume();
        java.lang.String str4 = characterReader1.consumeTagName();
        int int5 = characterReader1.pos();
        boolean boolean7 = characterReader1.matchesIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.consumeTo('i');
        characterReader1.advance();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str14 = characterReader12.consumeTo('a');
        char[] charArray16 = new char[] { '#' };
        java.lang.String str17 = characterReader12.consumeToAnySorted(charArray16);
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str21 = characterReader19.consumeTo('a');
        java.lang.String str22 = characterReader19.consumeLetterSequence();
        boolean boolean23 = characterReader19.isEmpty();
        int int25 = characterReader19.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str26 = characterReader19.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        characterReader28.advance();
        char char30 = characterReader28.consume();
        java.lang.String str31 = characterReader28.consumeTagName();
        int int32 = characterReader28.pos();
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("");
        characterReader34.advance();
        boolean boolean37 = characterReader34.containsIgnoreCase("hi!");
        boolean boolean39 = characterReader34.matches("hi");
        java.lang.String str40 = characterReader34.consumeTagName();
        char[] charArray43 = new char[] { '4', ' ' };
        java.lang.String str44 = characterReader34.consumeToAnySorted(charArray43);
        boolean boolean45 = characterReader28.matchesAnySorted(charArray43);
        java.lang.String str46 = characterReader19.consumeToAny(charArray43);
        boolean boolean47 = characterReader12.matchesAny(charArray43);
        java.lang.String str48 = characterReader12.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("");
        characterReader50.advance();
        characterReader50.mark();
        characterReader50.mark();
        java.lang.String str54 = characterReader50.consumeHexSequence();
        java.lang.String str55 = characterReader50.consumeLetterSequence();
        java.lang.String str56 = characterReader50.consumeHexSequence();
        java.lang.String str57 = characterReader50.consumeData();
        char[] charArray60 = new char[] { '#', '4' };
        boolean boolean61 = characterReader50.matchesAnySorted(charArray60);
        boolean boolean65 = org.jsoup.parser.CharacterReader.rangeEquals(charArray60, (int) '4', 10, "");
        boolean boolean69 = org.jsoup.parser.CharacterReader.rangeEquals(charArray60, 0, (int) (short) 10, "!");
        boolean boolean70 = characterReader12.matchesAnySorted(charArray60);
        boolean boolean74 = org.jsoup.parser.CharacterReader.rangeEquals(charArray60, (int) 'a', (int) (byte) 0, "");
        boolean boolean78 = org.jsoup.parser.CharacterReader.rangeEquals(charArray60, (int) '4', (int) (byte) 0, "i");
        boolean boolean79 = characterReader1.matchesAnySorted(charArray60);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\uffff' + "'", char30 == '\uffff');
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str3 = characterReader1.consumeTo('4');
        characterReader1.rewindToMark();
        java.lang.String str5 = characterReader1.consumeData();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str9 = characterReader7.consumeTo('4');
        characterReader7.rewindToMark();
        boolean boolean14 = characterReader7.rangeEquals(32768, 32768, "hi!");
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        characterReader16.advance();
        boolean boolean19 = characterReader16.containsIgnoreCase("hi!");
        java.lang.String str20 = characterReader16.consumeToEnd();
        java.lang.String str21 = characterReader16.toString();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        characterReader23.advance();
        characterReader23.mark();
        boolean boolean27 = characterReader23.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str31 = characterReader29.consumeTo('a');
        char[] charArray33 = new char[] { '#' };
        java.lang.String str34 = characterReader29.consumeToAnySorted(charArray33);
        java.lang.String str35 = characterReader23.consumeToAny(charArray33);
        boolean boolean36 = characterReader16.matchesAnySorted(charArray33);
        java.lang.String str37 = characterReader7.consumeToAny(charArray33);
        boolean boolean38 = characterReader1.matchesAny(charArray33);
        int int40 = characterReader1.nextIndexOf('h');
        boolean boolean42 = characterReader1.matchesIgnoreCase("h");
        boolean boolean44 = characterReader1.matchConsume("hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        java.lang.String str4 = characterReader1.consumeDigitSequence();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        boolean boolean7 = characterReader1.matchConsume("hi");
        int int9 = characterReader1.nextIndexOf('h');
        boolean boolean11 = characterReader1.containsIgnoreCase("i!");
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeData();
        java.lang.String str7 = characterReader1.consumeTo(' ');
        boolean boolean8 = characterReader1.matchesLetter();
        characterReader1.mark();
        java.lang.String str10 = characterReader1.consumeHexSequence();
        int int11 = characterReader1.pos();
        boolean boolean13 = characterReader1.matchConsumeIgnoreCase("hi");
        java.lang.String str14 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        java.lang.String str17 = characterReader1.consumeTo('!');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        boolean boolean5 = characterReader1.isEmpty();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        characterReader7.advance();
        boolean boolean10 = characterReader7.containsIgnoreCase("hi!");
        char[] charArray16 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean17 = characterReader7.matchesAny(charArray16);
        boolean boolean18 = characterReader1.matchesAny(charArray16);
        java.lang.String str19 = characterReader1.toString();
        boolean boolean21 = characterReader1.matchConsume("");
        java.lang.String str23 = characterReader1.consumeTo('!');
        java.lang.String str24 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeToEnd();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str4 = characterReader1.consumeDigitSequence();
        characterReader1.rewindToMark();
        int int7 = characterReader1.nextIndexOf((java.lang.CharSequence) "!");
        char char8 = characterReader1.consume();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str12 = characterReader10.consumeTo('a');
        char[] charArray14 = new char[] { '#' };
        java.lang.String str15 = characterReader10.consumeToAnySorted(charArray14);
        char char16 = characterReader10.current();
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("");
        characterReader18.advance();
        boolean boolean21 = characterReader18.containsIgnoreCase("hi!");
        java.lang.String str22 = characterReader18.consumeToEnd();
        java.lang.String str23 = characterReader18.toString();
        int int25 = characterReader18.nextIndexOf((java.lang.CharSequence) "hi");
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        characterReader27.advance();
        characterReader27.mark();
        boolean boolean31 = characterReader27.matchesIgnoreCase("");
        java.lang.String str32 = characterReader27.toString();
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("");
        characterReader34.advance();
        characterReader34.mark();
        characterReader34.mark();
        boolean boolean38 = characterReader34.isEmpty();
        boolean boolean40 = characterReader34.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader44 = new org.jsoup.parser.CharacterReader("");
        characterReader44.advance();
        characterReader44.mark();
        boolean boolean48 = characterReader44.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str52 = characterReader50.consumeTo('a');
        char[] charArray54 = new char[] { '#' };
        java.lang.String str55 = characterReader50.consumeToAnySorted(charArray54);
        java.lang.String str56 = characterReader44.consumeToAny(charArray54);
        boolean boolean57 = characterReader42.matchesAnySorted(charArray54);
        java.lang.String str58 = characterReader34.consumeToAny(charArray54);
        boolean boolean59 = characterReader27.matchesAnySorted(charArray54);
        boolean boolean60 = characterReader18.matchesAnySorted(charArray54);
        boolean boolean61 = characterReader10.matchesAny(charArray54);
        boolean boolean63 = characterReader10.matchesIgnoreCase("hi");
        boolean boolean64 = characterReader10.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader66 = new org.jsoup.parser.CharacterReader("");
        characterReader66.advance();
        boolean boolean69 = characterReader66.containsIgnoreCase("hi!");
        java.lang.String str70 = characterReader66.consumeToEnd();
        java.lang.String str71 = characterReader66.toString();
        org.jsoup.parser.CharacterReader characterReader73 = new org.jsoup.parser.CharacterReader("");
        characterReader73.advance();
        characterReader73.mark();
        boolean boolean77 = characterReader73.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader79 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str81 = characterReader79.consumeTo('a');
        char[] charArray83 = new char[] { '#' };
        java.lang.String str84 = characterReader79.consumeToAnySorted(charArray83);
        java.lang.String str85 = characterReader73.consumeToAny(charArray83);
        boolean boolean86 = characterReader66.matchesAnySorted(charArray83);
        boolean boolean87 = characterReader10.matchesAnySorted(charArray83);
        boolean boolean88 = characterReader1.matchesAny(charArray83);
        boolean boolean92 = org.jsoup.parser.CharacterReader.rangeEquals(charArray83, (int) 'h', (int) 'i', "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\uffff' + "'", char16 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertArrayEquals(charArray83, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        boolean boolean5 = characterReader1.isEmpty();
        char[] charArray12 = new char[] { ' ', '\uffff', ' ', '4', '4', 'a' };
        java.lang.String str13 = characterReader1.consumeToAny(charArray12);
        java.lang.String str14 = characterReader1.consumeData();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str18 = characterReader16.consumeTo('4');
        characterReader16.rewindToMark();
        int int20 = characterReader16.pos();
        boolean boolean22 = characterReader16.matches(' ');
        int int24 = characterReader16.nextIndexOf((java.lang.CharSequence) "hi!");
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("");
        characterReader26.advance();
        boolean boolean29 = characterReader26.containsIgnoreCase("hi!");
        char[] charArray35 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean36 = characterReader26.matchesAny(charArray35);
        java.lang.String str37 = characterReader16.consumeToAnySorted(charArray35);
        java.lang.String str38 = characterReader1.consumeToAnySorted(charArray35);
        boolean boolean39 = characterReader1.matchesDigit();
        boolean boolean40 = characterReader1.matchesLetter();
        java.lang.String str42 = characterReader1.consumeTo('!');
        java.lang.String str43 = characterReader1.consumeToEnd();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', '\uffff', ' ', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = characterReader1.consumeToAnySorted(charArray5);
        char char7 = characterReader1.current();
        boolean boolean9 = characterReader1.matchConsume("");
        characterReader1.advance();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        characterReader12.advance();
        boolean boolean15 = characterReader12.containsIgnoreCase("hi!");
        java.lang.String str16 = characterReader12.consumeToEnd();
        boolean boolean18 = characterReader12.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        characterReader20.advance();
        boolean boolean23 = characterReader20.containsIgnoreCase("hi!");
        char[] charArray29 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean30 = characterReader20.matchesAny(charArray29);
        boolean boolean31 = characterReader12.matchesAnySorted(charArray29);
        boolean boolean32 = characterReader1.matchesAnySorted(charArray29);
        char char33 = characterReader1.current();
        int int34 = characterReader1.pos();
        java.lang.String str35 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\uffff' + "'", char33 == '\uffff');
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = characterReader1.consumeToAnySorted(charArray5);
        char char7 = characterReader1.current();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        characterReader9.advance();
        boolean boolean12 = characterReader9.containsIgnoreCase("hi!");
        java.lang.String str13 = characterReader9.consumeToEnd();
        java.lang.String str14 = characterReader9.toString();
        int int16 = characterReader9.nextIndexOf((java.lang.CharSequence) "hi");
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("");
        characterReader18.advance();
        characterReader18.mark();
        boolean boolean22 = characterReader18.matchesIgnoreCase("");
        java.lang.String str23 = characterReader18.toString();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        characterReader25.advance();
        characterReader25.mark();
        characterReader25.mark();
        boolean boolean29 = characterReader25.isEmpty();
        boolean boolean31 = characterReader25.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader35 = new org.jsoup.parser.CharacterReader("");
        characterReader35.advance();
        characterReader35.mark();
        boolean boolean39 = characterReader35.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str43 = characterReader41.consumeTo('a');
        char[] charArray45 = new char[] { '#' };
        java.lang.String str46 = characterReader41.consumeToAnySorted(charArray45);
        java.lang.String str47 = characterReader35.consumeToAny(charArray45);
        boolean boolean48 = characterReader33.matchesAnySorted(charArray45);
        java.lang.String str49 = characterReader25.consumeToAny(charArray45);
        boolean boolean50 = characterReader18.matchesAnySorted(charArray45);
        boolean boolean51 = characterReader9.matchesAnySorted(charArray45);
        boolean boolean52 = characterReader1.matchesAny(charArray45);
        int int53 = characterReader1.pos();
        java.lang.String str54 = characterReader1.consumeToEnd();
        characterReader1.mark();
        java.lang.String str56 = characterReader1.consumeData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        char char3 = characterReader1.consume();
        java.lang.String str4 = characterReader1.consumeData();
        boolean boolean6 = characterReader1.matchConsume("hi");
        java.lang.String str7 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean11 = characterReader1.rangeEquals(2, 0, "!");
        java.lang.String str12 = characterReader1.toString();
        java.lang.String str13 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("");
        characterReader15.advance();
        boolean boolean18 = characterReader15.containsIgnoreCase("hi!");
        java.lang.String str19 = characterReader15.consumeData();
        int int21 = characterReader15.nextIndexOf(' ');
        int int23 = characterReader15.nextIndexOf(' ');
        java.lang.String str24 = characterReader15.consumeTagName();
        int int26 = characterReader15.nextIndexOf('h');
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str30 = characterReader28.consumeTo('a');
        char[] charArray32 = new char[] { '#' };
        java.lang.String str33 = characterReader28.consumeToAnySorted(charArray32);
        char char34 = characterReader28.current();
        java.lang.String str36 = characterReader28.consumeTo("!");
        boolean boolean38 = characterReader28.matchConsume("");
        characterReader28.advance();
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("");
        characterReader41.advance();
        characterReader41.mark();
        characterReader41.mark();
        java.lang.String str45 = characterReader41.consumeHexSequence();
        java.lang.String str46 = characterReader41.consumeLetterSequence();
        java.lang.String str47 = characterReader41.consumeHexSequence();
        java.lang.String str48 = characterReader41.consumeData();
        char[] charArray51 = new char[] { '#', '4' };
        boolean boolean52 = characterReader41.matchesAnySorted(charArray51);
        boolean boolean56 = org.jsoup.parser.CharacterReader.rangeEquals(charArray51, (int) '4', 10, "");
        boolean boolean60 = org.jsoup.parser.CharacterReader.rangeEquals(charArray51, 1, (int) (short) 1, "hi");
        boolean boolean61 = characterReader28.matchesAny(charArray51);
        boolean boolean62 = characterReader15.matchesAny(charArray51);
        java.lang.String str63 = characterReader1.consumeToAny(charArray51);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\uffff' + "'", char34 == '\uffff');
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str3 = characterReader1.consumeTo('4');
        boolean boolean5 = characterReader1.matches("hi!");
        boolean boolean7 = characterReader1.matchesIgnoreCase("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str6 = characterReader1.consumeTo('a');
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean10 = characterReader1.matches("");
        boolean boolean14 = characterReader1.rangeEquals(10, (int) (byte) 0, "!");
        java.lang.String str15 = characterReader1.consumeToEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.toString();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str9 = characterReader1.toString();
        int int10 = characterReader1.pos();
        java.lang.String str11 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str12 = characterReader1.consumeData();
        boolean boolean14 = characterReader1.matchConsume("!");
        boolean boolean18 = characterReader1.rangeEquals(2, 100, "!");
        java.lang.String str19 = characterReader1.consumeData();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.consumeTagName();
        characterReader1.advance();
        boolean boolean8 = characterReader1.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        characterReader10.advance();
        characterReader10.mark();
        characterReader10.mark();
        java.lang.String str14 = characterReader10.consumeHexSequence();
        java.lang.String str15 = characterReader10.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str19 = characterReader17.consumeTo('4');
        characterReader17.rewindToMark();
        int int21 = characterReader17.pos();
        boolean boolean23 = characterReader17.matches(' ');
        int int25 = characterReader17.nextIndexOf((java.lang.CharSequence) "hi!");
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        characterReader27.advance();
        boolean boolean30 = characterReader27.containsIgnoreCase("hi!");
        char[] charArray36 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean37 = characterReader27.matchesAny(charArray36);
        java.lang.String str38 = characterReader17.consumeToAnySorted(charArray36);
        java.lang.String str39 = characterReader10.consumeToAnySorted(charArray36);
        boolean boolean40 = characterReader1.matchesAny(charArray36);
        java.lang.String str41 = characterReader1.consumeLetterSequence();
        java.lang.String str42 = characterReader1.consumeData();
        java.lang.String str43 = characterReader1.consumeLetterSequence();
        char char44 = characterReader1.current();
        boolean boolean46 = characterReader1.matchConsumeIgnoreCase("");
        int int48 = characterReader1.nextIndexOf((java.lang.CharSequence) "h");
        boolean boolean50 = characterReader1.matchConsume("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + char44 + "' != '" + '\uffff' + "'", char44 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        boolean boolean5 = characterReader1.isEmpty();
        characterReader1.rewindToMark();
        java.lang.String str8 = characterReader1.consumeTo('4');
        boolean boolean10 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean12 = characterReader1.matchConsume("hi!");
        boolean boolean13 = characterReader1.isEmpty();
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        java.lang.String str5 = characterReader1.consumeTo('h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        java.lang.String str4 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str6 = characterReader1.consumeTo("hi");
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str9 = characterReader1.consumeHexSequence();
        java.lang.String str10 = characterReader1.consumeLetterThenDigitSequence();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        boolean boolean5 = characterReader1.isEmpty();
        int int7 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        char char8 = characterReader1.consume();
        java.lang.String str9 = characterReader1.consumeLetterSequence();
        int int11 = characterReader1.nextIndexOf('h');
        boolean boolean13 = characterReader1.matchConsumeIgnoreCase("hi");
        java.lang.String str14 = characterReader1.consumeData();
        java.lang.String str16 = characterReader1.consumeTo("i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = characterReader1.consumeToAnySorted(charArray5);
        char char7 = characterReader1.current();
        boolean boolean9 = characterReader1.matchConsume("");
        characterReader1.advance();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        characterReader12.advance();
        boolean boolean15 = characterReader12.containsIgnoreCase("hi!");
        java.lang.String str16 = characterReader12.consumeToEnd();
        boolean boolean18 = characterReader12.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        characterReader20.advance();
        boolean boolean23 = characterReader20.containsIgnoreCase("hi!");
        char[] charArray29 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean30 = characterReader20.matchesAny(charArray29);
        boolean boolean31 = characterReader12.matchesAnySorted(charArray29);
        boolean boolean32 = characterReader1.matchesAnySorted(charArray29);
        java.lang.String str33 = characterReader1.consumeDigitSequence();
        boolean boolean35 = characterReader1.matches(' ');
        java.lang.String str36 = characterReader1.consumeData();
        java.lang.String str37 = characterReader1.consumeData();
        java.lang.String str38 = characterReader1.consumeTagName();
        characterReader1.rewindToMark();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.toString();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str9 = characterReader1.toString();
        int int10 = characterReader1.pos();
        boolean boolean12 = characterReader1.matches('a');
        int int13 = characterReader1.pos();
        java.lang.String str14 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean16 = characterReader1.matchConsume("i!");
        java.lang.String str17 = characterReader1.consumeToEnd();
        boolean boolean19 = characterReader1.matches('!');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str6 = characterReader1.consumeTo('a');
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean9 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str13 = characterReader11.consumeTo('4');
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str17 = characterReader15.consumeTo('4');
        characterReader15.rewindToMark();
        java.lang.String str19 = characterReader15.consumeData();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str23 = characterReader21.consumeTo('4');
        characterReader21.rewindToMark();
        boolean boolean28 = characterReader21.rangeEquals(32768, 32768, "hi!");
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        characterReader30.advance();
        boolean boolean33 = characterReader30.containsIgnoreCase("hi!");
        java.lang.String str34 = characterReader30.consumeToEnd();
        java.lang.String str35 = characterReader30.toString();
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("");
        characterReader37.advance();
        characterReader37.mark();
        boolean boolean41 = characterReader37.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str45 = characterReader43.consumeTo('a');
        char[] charArray47 = new char[] { '#' };
        java.lang.String str48 = characterReader43.consumeToAnySorted(charArray47);
        java.lang.String str49 = characterReader37.consumeToAny(charArray47);
        boolean boolean50 = characterReader30.matchesAnySorted(charArray47);
        java.lang.String str51 = characterReader21.consumeToAny(charArray47);
        boolean boolean52 = characterReader15.matchesAny(charArray47);
        java.lang.String str53 = characterReader11.consumeToAnySorted(charArray47);
        boolean boolean57 = org.jsoup.parser.CharacterReader.rangeEquals(charArray47, 1, (int) (byte) 1, "");
        java.lang.String str58 = characterReader1.consumeToAny(charArray47);
        boolean boolean62 = org.jsoup.parser.CharacterReader.rangeEquals(charArray47, 1, 100, "hi");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.consumeTagName();
        java.lang.String str8 = characterReader1.consumeTo('\uffff');
        boolean boolean9 = characterReader1.isEmpty();
        java.lang.String str11 = characterReader1.consumeTo("i!");
        boolean boolean13 = characterReader1.matchConsume("hi");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeData();
        char[] charArray6 = new char[] {};
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        char[] charArray10 = new char[] { '4', '#' };
        java.lang.String str11 = characterReader1.consumeToAny(charArray10);
        java.lang.String str12 = characterReader1.consumeLetterSequence();
        java.lang.String str13 = characterReader1.consumeData();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeData();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean7 = characterReader1.matchesLetter();
        char char8 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 1, count -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = characterReader1.consumeToAnySorted(charArray5);
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str10 = characterReader8.consumeTo('a');
        java.lang.String str11 = characterReader8.consumeLetterSequence();
        boolean boolean12 = characterReader8.isEmpty();
        int int14 = characterReader8.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str15 = characterReader8.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        characterReader17.advance();
        char char19 = characterReader17.consume();
        java.lang.String str20 = characterReader17.consumeTagName();
        int int21 = characterReader17.pos();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        characterReader23.advance();
        boolean boolean26 = characterReader23.containsIgnoreCase("hi!");
        boolean boolean28 = characterReader23.matches("hi");
        java.lang.String str29 = characterReader23.consumeTagName();
        char[] charArray32 = new char[] { '4', ' ' };
        java.lang.String str33 = characterReader23.consumeToAnySorted(charArray32);
        boolean boolean34 = characterReader17.matchesAnySorted(charArray32);
        java.lang.String str35 = characterReader8.consumeToAny(charArray32);
        boolean boolean36 = characterReader1.matchesAny(charArray32);
        java.lang.String str37 = characterReader1.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str41 = characterReader39.consumeTo('a');
        char[] charArray43 = new char[] { '#' };
        java.lang.String str44 = characterReader39.consumeToAnySorted(charArray43);
        boolean boolean48 = org.jsoup.parser.CharacterReader.rangeEquals(charArray43, (int) '\uffff', (int) 'h', "hi");
        boolean boolean49 = characterReader1.matchesAny(charArray43);
        java.lang.String str50 = characterReader1.consumeLetterSequence();
        boolean boolean51 = characterReader1.isEmpty();
        org.jsoup.parser.CharacterReader characterReader53 = new org.jsoup.parser.CharacterReader("");
        characterReader53.advance();
        characterReader53.mark();
        boolean boolean57 = characterReader53.matchesIgnoreCase("");
        java.lang.String str58 = characterReader53.toString();
        org.jsoup.parser.CharacterReader characterReader60 = new org.jsoup.parser.CharacterReader("");
        characterReader60.advance();
        characterReader60.mark();
        characterReader60.mark();
        boolean boolean64 = characterReader60.isEmpty();
        boolean boolean66 = characterReader60.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader68 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader70 = new org.jsoup.parser.CharacterReader("");
        characterReader70.advance();
        characterReader70.mark();
        boolean boolean74 = characterReader70.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader76 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str78 = characterReader76.consumeTo('a');
        char[] charArray80 = new char[] { '#' };
        java.lang.String str81 = characterReader76.consumeToAnySorted(charArray80);
        java.lang.String str82 = characterReader70.consumeToAny(charArray80);
        boolean boolean83 = characterReader68.matchesAnySorted(charArray80);
        java.lang.String str84 = characterReader60.consumeToAny(charArray80);
        boolean boolean85 = characterReader53.matchesAnySorted(charArray80);
        boolean boolean89 = org.jsoup.parser.CharacterReader.rangeEquals(charArray80, (int) (short) 10, 0, "hi!");
        java.lang.String str90 = characterReader1.consumeToAny(charArray80);
        boolean boolean92 = characterReader1.matchesIgnoreCase("i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\uffff' + "'", char19 == '\uffff');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertArrayEquals(charArray80, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        characterReader8.advance();
        boolean boolean11 = characterReader8.containsIgnoreCase("hi!");
        char[] charArray17 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean18 = characterReader8.matchesAny(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean23 = characterReader21.matchesIgnoreCase("");
        int int25 = characterReader21.nextIndexOf('a');
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        characterReader27.advance();
        boolean boolean30 = characterReader27.containsIgnoreCase("hi!");
        char[] charArray36 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean37 = characterReader27.matchesAny(charArray36);
        boolean boolean38 = characterReader21.matchesAnySorted(charArray36);
        boolean boolean39 = characterReader1.matchesAnySorted(charArray36);
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str43 = characterReader41.consumeTo('a');
        char[] charArray45 = new char[] { '#' };
        java.lang.String str46 = characterReader41.consumeToAnySorted(charArray45);
        java.lang.String str47 = characterReader41.consumeLetterSequence();
        characterReader41.mark();
        characterReader41.advance();
        boolean boolean53 = characterReader41.rangeEquals((int) (byte) 1, (int) (short) 1, "");
        org.jsoup.parser.CharacterReader characterReader55 = new org.jsoup.parser.CharacterReader("");
        characterReader55.advance();
        boolean boolean58 = characterReader55.containsIgnoreCase("hi!");
        java.lang.String str59 = characterReader55.consumeData();
        char[] charArray60 = new char[] {};
        java.lang.String str61 = characterReader55.consumeToAnySorted(charArray60);
        boolean boolean65 = org.jsoup.parser.CharacterReader.rangeEquals(charArray60, (int) 'h', (int) (short) 10, "hi");
        boolean boolean66 = characterReader41.matchesAnySorted(charArray60);
        java.lang.String str67 = characterReader1.consumeToAnySorted(charArray60);
        boolean boolean69 = characterReader1.containsIgnoreCase("i!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] {});
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str3 = characterReader1.consumeTo('4');
        characterReader1.rewindToMark();
        boolean boolean8 = characterReader1.rangeEquals(32768, 32768, "hi!");
        java.lang.String str9 = characterReader1.consumeData();
        java.lang.String str10 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        characterReader12.advance();
        characterReader12.mark();
        characterReader12.mark();
        boolean boolean16 = characterReader12.isEmpty();
        boolean boolean18 = characterReader12.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        characterReader22.advance();
        characterReader22.mark();
        boolean boolean26 = characterReader22.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str30 = characterReader28.consumeTo('a');
        char[] charArray32 = new char[] { '#' };
        java.lang.String str33 = characterReader28.consumeToAnySorted(charArray32);
        java.lang.String str34 = characterReader22.consumeToAny(charArray32);
        boolean boolean35 = characterReader20.matchesAnySorted(charArray32);
        java.lang.String str36 = characterReader12.consumeToAny(charArray32);
        characterReader12.rewindToMark();
        java.lang.String str38 = characterReader12.consumeDigitSequence();
        int int40 = characterReader12.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str41 = characterReader12.consumeDigitSequence();
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str45 = characterReader43.consumeTo('a');
        char[] charArray47 = new char[] { '#' };
        java.lang.String str48 = characterReader43.consumeToAnySorted(charArray47);
        char char49 = characterReader43.current();
        java.lang.String str51 = characterReader43.consumeTo("!");
        boolean boolean53 = characterReader43.matchConsume("");
        characterReader43.advance();
        org.jsoup.parser.CharacterReader characterReader56 = new org.jsoup.parser.CharacterReader("");
        characterReader56.advance();
        characterReader56.mark();
        characterReader56.mark();
        java.lang.String str60 = characterReader56.consumeHexSequence();
        java.lang.String str61 = characterReader56.consumeLetterSequence();
        java.lang.String str62 = characterReader56.consumeHexSequence();
        java.lang.String str63 = characterReader56.consumeData();
        char[] charArray66 = new char[] { '#', '4' };
        boolean boolean67 = characterReader56.matchesAnySorted(charArray66);
        boolean boolean71 = org.jsoup.parser.CharacterReader.rangeEquals(charArray66, (int) '4', 10, "");
        boolean boolean75 = org.jsoup.parser.CharacterReader.rangeEquals(charArray66, 1, (int) (short) 1, "hi");
        boolean boolean76 = characterReader43.matchesAny(charArray66);
        boolean boolean80 = org.jsoup.parser.CharacterReader.rangeEquals(charArray66, (int) '#', 100, "i!");
        boolean boolean84 = org.jsoup.parser.CharacterReader.rangeEquals(charArray66, 1, 1, "i!");
        java.lang.String str85 = characterReader12.consumeToAny(charArray66);
        java.lang.String str86 = characterReader1.consumeToAnySorted(charArray66);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + char49 + "' != '" + '\uffff' + "'", char49 == '\uffff');
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeDigitSequence();
        char char3 = characterReader1.consume();
        org.jsoup.parser.CharacterReader characterReader5 = new org.jsoup.parser.CharacterReader("");
        characterReader5.advance();
        boolean boolean8 = characterReader5.matchesIgnoreCase("!");
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean12 = characterReader10.matchesIgnoreCase("");
        int int14 = characterReader10.nextIndexOf('a');
        char char15 = characterReader10.current();
        boolean boolean17 = characterReader10.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        characterReader19.advance();
        characterReader19.mark();
        characterReader19.mark();
        java.lang.String str23 = characterReader19.consumeHexSequence();
        java.lang.String str24 = characterReader19.consumeLetterSequence();
        java.lang.String str25 = characterReader19.consumeHexSequence();
        java.lang.String str26 = characterReader19.consumeData();
        char[] charArray29 = new char[] { '#', '4' };
        boolean boolean30 = characterReader19.matchesAnySorted(charArray29);
        boolean boolean34 = org.jsoup.parser.CharacterReader.rangeEquals(charArray29, (-1), 0, "");
        java.lang.String str35 = characterReader10.consumeToAnySorted(charArray29);
        boolean boolean36 = characterReader5.matchesAny(charArray29);
        boolean boolean37 = characterReader1.matchesAnySorted(charArray29);
        boolean boolean41 = org.jsoup.parser.CharacterReader.rangeEquals(charArray29, (int) 'a', (int) (short) 0, "hi");
        boolean boolean45 = org.jsoup.parser.CharacterReader.rangeEquals(charArray29, 2, 4, "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        characterReader8.advance();
        boolean boolean11 = characterReader8.containsIgnoreCase("hi!");
        char[] charArray17 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean18 = characterReader8.matchesAny(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean23 = characterReader21.matchesIgnoreCase("");
        int int25 = characterReader21.nextIndexOf('a');
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        characterReader27.advance();
        boolean boolean30 = characterReader27.containsIgnoreCase("hi!");
        char[] charArray36 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean37 = characterReader27.matchesAny(charArray36);
        boolean boolean38 = characterReader21.matchesAnySorted(charArray36);
        boolean boolean39 = characterReader1.matchesAnySorted(charArray36);
        java.lang.String str40 = characterReader1.consumeToEnd();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        boolean boolean7 = characterReader1.matchesDigit();
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeTo('\uffff');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        char[] charArray10 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        boolean boolean13 = characterReader1.matchConsume("");
        boolean boolean14 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        characterReader16.advance();
        boolean boolean19 = characterReader16.containsIgnoreCase("hi!");
        java.lang.String str20 = characterReader16.consumeToEnd();
        java.lang.String str21 = characterReader16.toString();
        int int23 = characterReader16.nextIndexOf((java.lang.CharSequence) "hi");
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        characterReader25.advance();
        characterReader25.mark();
        characterReader25.mark();
        java.lang.String str29 = characterReader25.consumeHexSequence();
        java.lang.String str30 = characterReader25.consumeLetterSequence();
        java.lang.String str31 = characterReader25.consumeHexSequence();
        java.lang.String str32 = characterReader25.consumeData();
        char[] charArray35 = new char[] { '#', '4' };
        boolean boolean36 = characterReader25.matchesAnySorted(charArray35);
        char char37 = characterReader25.current();
        java.lang.String str38 = characterReader25.consumeToEnd();
        java.lang.String str39 = characterReader25.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("");
        characterReader41.advance();
        characterReader41.mark();
        characterReader41.mark();
        boolean boolean45 = characterReader41.isEmpty();
        boolean boolean47 = characterReader41.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("");
        characterReader51.advance();
        characterReader51.mark();
        boolean boolean55 = characterReader51.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str59 = characterReader57.consumeTo('a');
        char[] charArray61 = new char[] { '#' };
        java.lang.String str62 = characterReader57.consumeToAnySorted(charArray61);
        java.lang.String str63 = characterReader51.consumeToAny(charArray61);
        boolean boolean64 = characterReader49.matchesAnySorted(charArray61);
        java.lang.String str65 = characterReader41.consumeToAny(charArray61);
        boolean boolean66 = characterReader25.matchesAny(charArray61);
        java.lang.String str67 = characterReader16.consumeToAnySorted(charArray61);
        boolean boolean68 = characterReader1.matchesAny(charArray61);
        boolean boolean72 = org.jsoup.parser.CharacterReader.rangeEquals(charArray61, 0, (int) '\uffff', "h");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '\uffff' + "'", char37 == '\uffff');
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeDigitSequence();
        char char3 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchConsume("hi");
        boolean boolean6 = characterReader1.matchesDigit();
        char char7 = characterReader1.current();
        char char8 = characterReader1.consume();
        boolean boolean10 = characterReader1.matches('i');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        boolean boolean5 = characterReader1.matchesIgnoreCase("");
        java.lang.String str6 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        char[] charArray10 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        characterReader13.advance();
        boolean boolean16 = characterReader13.containsIgnoreCase("hi!");
        java.lang.String str17 = characterReader13.consumeToEnd();
        java.lang.String str18 = characterReader13.toString();
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        characterReader20.advance();
        characterReader20.mark();
        boolean boolean24 = characterReader20.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str28 = characterReader26.consumeTo('a');
        char[] charArray30 = new char[] { '#' };
        java.lang.String str31 = characterReader26.consumeToAnySorted(charArray30);
        java.lang.String str32 = characterReader20.consumeToAny(charArray30);
        boolean boolean33 = characterReader13.matchesAnySorted(charArray30);
        java.lang.String str34 = characterReader1.consumeToAny(charArray30);
        boolean boolean35 = characterReader1.matchesLetter();
        java.lang.String str36 = characterReader1.consumeData();
        boolean boolean38 = characterReader1.matches('\uffff');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        boolean boolean5 = characterReader1.isEmpty();
        boolean boolean7 = characterReader1.matches('4');
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        characterReader9.advance();
        boolean boolean12 = characterReader9.containsIgnoreCase("hi!");
        java.lang.String str13 = characterReader9.consumeData();
        char[] charArray14 = new char[] {};
        java.lang.String str15 = characterReader9.consumeToAnySorted(charArray14);
        boolean boolean19 = characterReader9.rangeEquals((int) (byte) 1, 1, "");
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("");
        characterReader21.advance();
        characterReader21.mark();
        characterReader21.mark();
        java.lang.String str25 = characterReader21.consumeHexSequence();
        java.lang.String str26 = characterReader21.consumeLetterSequence();
        java.lang.String str27 = characterReader21.consumeHexSequence();
        java.lang.String str28 = characterReader21.consumeData();
        char[] charArray31 = new char[] { '#', '4' };
        boolean boolean32 = characterReader21.matchesAnySorted(charArray31);
        boolean boolean33 = characterReader9.matchesAnySorted(charArray31);
        java.lang.String str34 = characterReader1.consumeToAny(charArray31);
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean38 = characterReader36.matchesIgnoreCase("");
        boolean boolean40 = characterReader36.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("");
        characterReader42.advance();
        boolean boolean45 = characterReader42.containsIgnoreCase("hi!");
        boolean boolean47 = characterReader42.matches("hi");
        java.lang.String str48 = characterReader42.consumeTagName();
        char[] charArray51 = new char[] { '4', ' ' };
        java.lang.String str52 = characterReader42.consumeToAnySorted(charArray51);
        java.lang.String str53 = characterReader36.consumeToAny(charArray51);
        boolean boolean54 = characterReader1.matchesAny(charArray51);
        boolean boolean56 = characterReader1.matches("i!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.consumeTagName();
        int int7 = characterReader1.pos();
        char char8 = characterReader1.current();
        boolean boolean10 = characterReader1.containsIgnoreCase("hi");
        boolean boolean12 = characterReader1.matches("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        boolean boolean5 = characterReader1.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str9 = characterReader7.consumeTo('a');
        char[] charArray11 = new char[] { '#' };
        java.lang.String str12 = characterReader7.consumeToAnySorted(charArray11);
        java.lang.String str13 = characterReader1.consumeToAny(charArray11);
        java.lang.String str14 = characterReader1.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str18 = characterReader16.consumeTo('a');
        java.lang.String str19 = characterReader16.consumeLetterSequence();
        boolean boolean20 = characterReader16.isEmpty();
        char[] charArray27 = new char[] { ' ', '\uffff', ' ', '4', '4', 'a' };
        java.lang.String str28 = characterReader16.consumeToAny(charArray27);
        java.lang.String str29 = characterReader1.consumeToAnySorted(charArray27);
        java.lang.String str30 = characterReader1.consumeHexSequence();
        char char31 = characterReader1.current();
        char[] charArray32 = null;
        java.lang.String str33 = characterReader1.consumeToAny(charArray32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { ' ', '\uffff', ' ', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\uffff' + "'", char31 == '\uffff');
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = characterReader1.consumeToAnySorted(charArray5);
        char char7 = characterReader1.current();
        java.lang.String str9 = characterReader1.consumeTo("!");
        boolean boolean11 = characterReader1.matchConsume("");
        characterReader1.advance();
        java.lang.String str13 = characterReader1.consumeHexSequence();
        java.lang.String str14 = characterReader1.consumeToEnd();
        int int16 = characterReader1.nextIndexOf('a');
        java.lang.String str17 = characterReader1.consumeHexSequence();
        boolean boolean19 = characterReader1.matchConsumeIgnoreCase("i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        char char3 = characterReader1.consume();
        java.lang.String str4 = characterReader1.consumeData();
        boolean boolean6 = characterReader1.matchConsume("hi");
        java.lang.String str7 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean11 = characterReader1.rangeEquals(2, 0, "!");
        java.lang.String str12 = characterReader1.toString();
        int int13 = characterReader1.pos();
        java.lang.String str14 = characterReader1.consumeData();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = characterReader1.consumeToAnySorted(charArray5);
        boolean boolean8 = characterReader1.matchesIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.toString();
        java.lang.String str11 = characterReader1.consumeTo('a');
        int int13 = characterReader1.nextIndexOf('#');
        boolean boolean15 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str16 = characterReader1.consumeLetterSequence();
        java.lang.String str17 = characterReader1.consumeHexSequence();
        char char18 = characterReader1.current();
        char char19 = characterReader1.consume();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\uffff' + "'", char18 == '\uffff');
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\uffff' + "'", char19 == '\uffff');
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean6 = characterReader1.matches("hi");
        java.lang.String str7 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean8 = characterReader1.matchesDigit();
        boolean boolean9 = characterReader1.isEmpty();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        characterReader11.advance();
        characterReader11.mark();
        characterReader11.mark();
        java.lang.String str15 = characterReader11.consumeHexSequence();
        java.lang.String str16 = characterReader11.consumeData();
        boolean boolean17 = characterReader11.matchesDigit();
        char[] charArray18 = null;
        java.lang.String str19 = characterReader11.consumeToAnySorted(charArray18);
        boolean boolean20 = characterReader11.isEmpty();
        characterReader11.mark();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        characterReader23.advance();
        boolean boolean26 = characterReader23.containsIgnoreCase("hi!");
        char[] charArray32 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean33 = characterReader23.matchesAny(charArray32);
        characterReader23.advance();
        characterReader23.advance();
        java.lang.String str36 = characterReader23.consumeLetterThenDigitSequence();
        boolean boolean38 = characterReader23.matchConsume("i");
        characterReader23.advance();
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("");
        characterReader41.advance();
        boolean boolean44 = characterReader41.containsIgnoreCase("hi!");
        boolean boolean46 = characterReader41.matches("hi");
        int int47 = characterReader41.pos();
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str51 = characterReader49.consumeTo('a');
        java.lang.String str52 = characterReader49.consumeLetterSequence();
        boolean boolean53 = characterReader49.isEmpty();
        org.jsoup.parser.CharacterReader characterReader55 = new org.jsoup.parser.CharacterReader("");
        characterReader55.advance();
        boolean boolean58 = characterReader55.containsIgnoreCase("hi!");
        char[] charArray64 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean65 = characterReader55.matchesAny(charArray64);
        boolean boolean66 = characterReader49.matchesAny(charArray64);
        boolean boolean70 = org.jsoup.parser.CharacterReader.rangeEquals(charArray64, (int) '#', (int) (short) 0, "");
        boolean boolean71 = characterReader41.matchesAnySorted(charArray64);
        boolean boolean75 = org.jsoup.parser.CharacterReader.rangeEquals(charArray64, (int) (byte) 10, 4, "");
        boolean boolean76 = characterReader23.matchesAnySorted(charArray64);
        boolean boolean77 = characterReader11.matchesAny(charArray64);
        boolean boolean78 = characterReader1.matchesAny(charArray64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeData();
        boolean boolean7 = characterReader1.matchesDigit();
        char[] charArray8 = null;
        java.lang.String str9 = characterReader1.consumeToAnySorted(charArray8);
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        characterReader11.advance();
        boolean boolean14 = characterReader11.containsIgnoreCase("hi!");
        boolean boolean16 = characterReader11.matches("hi!");
        boolean boolean17 = characterReader11.isEmpty();
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        characterReader19.advance();
        characterReader19.mark();
        boolean boolean23 = characterReader19.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str27 = characterReader25.consumeTo('a');
        char[] charArray29 = new char[] { '#' };
        java.lang.String str30 = characterReader25.consumeToAnySorted(charArray29);
        java.lang.String str31 = characterReader19.consumeToAny(charArray29);
        boolean boolean32 = characterReader11.matchesAny(charArray29);
        boolean boolean36 = org.jsoup.parser.CharacterReader.rangeEquals(charArray29, (int) ' ', (int) (byte) 100, "hi");
        boolean boolean37 = characterReader1.matchesAny(charArray29);
        boolean boolean39 = characterReader1.matches("!");
        boolean boolean40 = characterReader1.matchesLetter();
        java.lang.String str41 = characterReader1.consumeToEnd();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeData();
        char[] charArray6 = new char[] {};
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        boolean boolean11 = characterReader1.rangeEquals((int) (byte) 1, 1, "");
        java.lang.String str12 = characterReader1.consumeData();
        boolean boolean14 = characterReader1.matchesIgnoreCase("hi!");
        java.lang.String str15 = characterReader1.consumeLetterSequence();
        characterReader1.advance();
        boolean boolean20 = characterReader1.rangeEquals((int) ' ', (int) (byte) 0, "!");
        java.lang.String str21 = characterReader1.consumeLetterThenDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str6 = characterReader1.consumeTo('a');
        boolean boolean10 = characterReader1.rangeEquals((int) (short) -1, 2, "");
        boolean boolean12 = characterReader1.matchConsume("");
        int int14 = characterReader1.nextIndexOf('a');
        boolean boolean18 = characterReader1.rangeEquals(0, 10, "hi");
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        boolean boolean7 = characterReader1.matchConsume("hi!");
        boolean boolean9 = characterReader1.matchConsume("!");
        java.lang.String str10 = characterReader1.consumeLetterSequence();
        java.lang.String str11 = characterReader1.consumeToEnd();
        java.lang.String str12 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        java.lang.String str4 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean10 = characterReader1.matches('\uffff');
        characterReader1.mark();
        java.lang.String str12 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str13 = characterReader1.consumeData();
        char char14 = characterReader1.current();
        java.lang.String str15 = characterReader1.consumeLetterThenDigitSequence();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\uffff' + "'", char14 == '\uffff');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.toString();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        characterReader10.advance();
        characterReader10.mark();
        characterReader10.mark();
        java.lang.String str14 = characterReader10.consumeHexSequence();
        java.lang.String str15 = characterReader10.consumeLetterSequence();
        java.lang.String str16 = characterReader10.consumeHexSequence();
        java.lang.String str17 = characterReader10.consumeData();
        char[] charArray20 = new char[] { '#', '4' };
        boolean boolean21 = characterReader10.matchesAnySorted(charArray20);
        char char22 = characterReader10.current();
        java.lang.String str23 = characterReader10.consumeToEnd();
        java.lang.String str24 = characterReader10.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("");
        characterReader26.advance();
        characterReader26.mark();
        characterReader26.mark();
        boolean boolean30 = characterReader26.isEmpty();
        boolean boolean32 = characterReader26.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("");
        characterReader36.advance();
        characterReader36.mark();
        boolean boolean40 = characterReader36.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str44 = characterReader42.consumeTo('a');
        char[] charArray46 = new char[] { '#' };
        java.lang.String str47 = characterReader42.consumeToAnySorted(charArray46);
        java.lang.String str48 = characterReader36.consumeToAny(charArray46);
        boolean boolean49 = characterReader34.matchesAnySorted(charArray46);
        java.lang.String str50 = characterReader26.consumeToAny(charArray46);
        boolean boolean51 = characterReader10.matchesAny(charArray46);
        java.lang.String str52 = characterReader1.consumeToAnySorted(charArray46);
        boolean boolean54 = characterReader1.matches('#');
        java.lang.String str55 = characterReader1.consumeData();
        boolean boolean59 = characterReader1.rangeEquals((int) (short) 100, (int) 'i', "i");
        characterReader1.rewindToMark();
        boolean boolean61 = characterReader1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\uffff' + "'", char22 == '\uffff');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi");
        java.lang.String str3 = characterReader1.consumeTo("hi");
        java.lang.String str4 = characterReader1.consumeDigitSequence();
        boolean boolean6 = characterReader1.matches("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str4 = characterReader1.consumeHexSequence();
        boolean boolean5 = characterReader1.matchesLetter();
        boolean boolean7 = characterReader1.matches('a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        boolean boolean8 = characterReader1.rangeEquals((int) (byte) 10, (int) (byte) 100, "hi");
        java.lang.String str10 = characterReader1.consumeTo("i");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean8 = characterReader1.rangeEquals(1, (int) (byte) 0, "hi!");
        java.lang.String str9 = characterReader1.consumeDigitSequence();
        java.lang.String str10 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        characterReader12.advance();
        characterReader12.mark();
        characterReader12.mark();
        boolean boolean16 = characterReader12.isEmpty();
        boolean boolean18 = characterReader12.matches("hi!");
        java.lang.String str19 = characterReader12.consumeHexSequence();
        boolean boolean20 = characterReader12.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str24 = characterReader22.consumeTo('a');
        java.lang.String str25 = characterReader22.consumeLetterSequence();
        boolean boolean26 = characterReader22.isEmpty();
        char[] charArray33 = new char[] { ' ', '\uffff', ' ', '4', '4', 'a' };
        java.lang.String str34 = characterReader22.consumeToAny(charArray33);
        java.lang.String str35 = characterReader12.consumeToAny(charArray33);
        boolean boolean36 = characterReader1.matchesAnySorted(charArray33);
        boolean boolean38 = characterReader1.matches("h");
        characterReader1.advance();
        characterReader1.rewindToMark();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { ' ', '\uffff', ' ', '4', '4', 'a' });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str4 = characterReader1.consumeHexSequence();
        boolean boolean5 = characterReader1.matchesLetter();
        boolean boolean7 = characterReader1.matchesIgnoreCase("i");
        boolean boolean9 = characterReader1.matchesIgnoreCase("hi!");
        characterReader1.mark();
        java.lang.String str11 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean13 = characterReader1.containsIgnoreCase("hi");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi" + "'", str11, "hi");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = characterReader1.consumeToAnySorted(charArray5);
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str10 = characterReader8.consumeTo('a');
        java.lang.String str11 = characterReader8.consumeLetterSequence();
        boolean boolean12 = characterReader8.isEmpty();
        int int14 = characterReader8.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str15 = characterReader8.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        characterReader17.advance();
        char char19 = characterReader17.consume();
        java.lang.String str20 = characterReader17.consumeTagName();
        int int21 = characterReader17.pos();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        characterReader23.advance();
        boolean boolean26 = characterReader23.containsIgnoreCase("hi!");
        boolean boolean28 = characterReader23.matches("hi");
        java.lang.String str29 = characterReader23.consumeTagName();
        char[] charArray32 = new char[] { '4', ' ' };
        java.lang.String str33 = characterReader23.consumeToAnySorted(charArray32);
        boolean boolean34 = characterReader17.matchesAnySorted(charArray32);
        java.lang.String str35 = characterReader8.consumeToAny(charArray32);
        boolean boolean36 = characterReader1.matchesAny(charArray32);
        java.lang.String str37 = characterReader1.consumeTagName();
        int int39 = characterReader1.nextIndexOf('h');
        java.lang.String str41 = characterReader1.consumeTo("hi");
        java.lang.String str42 = characterReader1.toString();
        java.lang.String str44 = characterReader1.consumeTo('!');
        java.lang.String str45 = characterReader1.consumeTagName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\uffff' + "'", char19 == '\uffff');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        java.lang.String str4 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean6 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str8 = characterReader1.consumeTo('h');
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str12 = characterReader10.consumeTo('a');
        char[] charArray14 = new char[] { '#' };
        java.lang.String str15 = characterReader10.consumeToAnySorted(charArray14);
        boolean boolean17 = characterReader10.matchesIgnoreCase("hi!");
        boolean boolean19 = characterReader10.containsIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("");
        characterReader21.advance();
        boolean boolean24 = characterReader21.containsIgnoreCase("hi!");
        java.lang.String str25 = characterReader21.consumeToEnd();
        java.lang.String str26 = characterReader21.toString();
        int int28 = characterReader21.nextIndexOf((java.lang.CharSequence) "hi");
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        characterReader30.advance();
        characterReader30.mark();
        characterReader30.mark();
        java.lang.String str34 = characterReader30.consumeHexSequence();
        java.lang.String str35 = characterReader30.consumeLetterSequence();
        java.lang.String str36 = characterReader30.consumeHexSequence();
        java.lang.String str37 = characterReader30.consumeData();
        char[] charArray40 = new char[] { '#', '4' };
        boolean boolean41 = characterReader30.matchesAnySorted(charArray40);
        char char42 = characterReader30.current();
        java.lang.String str43 = characterReader30.consumeToEnd();
        java.lang.String str44 = characterReader30.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader46 = new org.jsoup.parser.CharacterReader("");
        characterReader46.advance();
        characterReader46.mark();
        characterReader46.mark();
        boolean boolean50 = characterReader46.isEmpty();
        boolean boolean52 = characterReader46.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader54 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader56 = new org.jsoup.parser.CharacterReader("");
        characterReader56.advance();
        characterReader56.mark();
        boolean boolean60 = characterReader56.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader62 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str64 = characterReader62.consumeTo('a');
        char[] charArray66 = new char[] { '#' };
        java.lang.String str67 = characterReader62.consumeToAnySorted(charArray66);
        java.lang.String str68 = characterReader56.consumeToAny(charArray66);
        boolean boolean69 = characterReader54.matchesAnySorted(charArray66);
        java.lang.String str70 = characterReader46.consumeToAny(charArray66);
        boolean boolean71 = characterReader30.matchesAny(charArray66);
        java.lang.String str72 = characterReader21.consumeToAnySorted(charArray66);
        java.lang.String str73 = characterReader10.consumeToAnySorted(charArray66);
        boolean boolean77 = org.jsoup.parser.CharacterReader.rangeEquals(charArray66, 32768, 10, "!");
        boolean boolean78 = characterReader1.matchesAnySorted(charArray66);
        int int80 = characterReader1.nextIndexOf('#');
        int int81 = characterReader1.pos();
        java.lang.String str82 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + '\uffff' + "'", char42 == '\uffff');
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        java.lang.String str3 = characterReader1.consumeDigitSequence();
        boolean boolean5 = characterReader1.matchesIgnoreCase("i");
        java.lang.String str6 = characterReader1.consumeData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        boolean boolean5 = characterReader1.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str9 = characterReader7.consumeTo('a');
        char[] charArray11 = new char[] { '#' };
        java.lang.String str12 = characterReader7.consumeToAnySorted(charArray11);
        java.lang.String str13 = characterReader1.consumeToAny(charArray11);
        boolean boolean17 = characterReader1.rangeEquals((int) (short) 1, 0, "");
        char char18 = characterReader1.current();
        boolean boolean22 = characterReader1.rangeEquals(4, 0, "hi!");
        java.lang.String str23 = characterReader1.consumeHexSequence();
        boolean boolean25 = characterReader1.containsIgnoreCase("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\uffff' + "'", char18 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeToEnd();
        boolean boolean4 = characterReader1.matches('a');
        char char5 = characterReader1.current();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean9 = characterReader7.matchesIgnoreCase("");
        int int11 = characterReader7.nextIndexOf('a');
        char char12 = characterReader7.current();
        java.lang.String str13 = characterReader7.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("");
        characterReader15.advance();
        characterReader15.mark();
        characterReader15.mark();
        java.lang.String str19 = characterReader15.consumeHexSequence();
        java.lang.String str20 = characterReader15.consumeLetterSequence();
        java.lang.String str21 = characterReader15.consumeHexSequence();
        java.lang.String str22 = characterReader15.consumeData();
        char[] charArray25 = new char[] { '#', '4' };
        boolean boolean26 = characterReader15.matchesAnySorted(charArray25);
        char char27 = characterReader15.current();
        java.lang.String str28 = characterReader15.consumeToEnd();
        java.lang.String str29 = characterReader15.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("");
        characterReader31.advance();
        characterReader31.mark();
        characterReader31.mark();
        boolean boolean35 = characterReader31.isEmpty();
        boolean boolean37 = characterReader31.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("");
        characterReader41.advance();
        characterReader41.mark();
        boolean boolean45 = characterReader41.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader47 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str49 = characterReader47.consumeTo('a');
        char[] charArray51 = new char[] { '#' };
        java.lang.String str52 = characterReader47.consumeToAnySorted(charArray51);
        java.lang.String str53 = characterReader41.consumeToAny(charArray51);
        boolean boolean54 = characterReader39.matchesAnySorted(charArray51);
        java.lang.String str55 = characterReader31.consumeToAny(charArray51);
        boolean boolean56 = characterReader15.matchesAny(charArray51);
        boolean boolean57 = characterReader7.matchesAny(charArray51);
        java.lang.String str58 = characterReader1.consumeToAnySorted(charArray51);
        java.lang.String str60 = characterReader1.consumeTo("h");
        java.lang.String str62 = characterReader1.consumeTo('\uffff');
        int int63 = characterReader1.pos();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\uffff' + "'", char5 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + 'h' + "'", char12 == 'h');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi" + "'", str13, "hi");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\uffff' + "'", char27 == '\uffff');
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        java.lang.String str7 = characterReader1.consumeHexSequence();
        java.lang.String str8 = characterReader1.consumeData();
        char[] charArray11 = new char[] { '#', '4' };
        boolean boolean12 = characterReader1.matchesAnySorted(charArray11);
        char char13 = characterReader1.current();
        java.lang.String str14 = characterReader1.consumeToEnd();
        java.lang.String str15 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        characterReader17.advance();
        characterReader17.mark();
        characterReader17.mark();
        boolean boolean21 = characterReader17.isEmpty();
        boolean boolean23 = characterReader17.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        characterReader27.advance();
        characterReader27.mark();
        boolean boolean31 = characterReader27.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader33 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str35 = characterReader33.consumeTo('a');
        char[] charArray37 = new char[] { '#' };
        java.lang.String str38 = characterReader33.consumeToAnySorted(charArray37);
        java.lang.String str39 = characterReader27.consumeToAny(charArray37);
        boolean boolean40 = characterReader25.matchesAnySorted(charArray37);
        java.lang.String str41 = characterReader17.consumeToAny(charArray37);
        boolean boolean42 = characterReader1.matchesAny(charArray37);
        java.lang.String str43 = characterReader1.consumeLetterSequence();
        boolean boolean44 = characterReader1.matchesLetter();
        java.lang.String str45 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeData();
        java.lang.String str6 = characterReader1.consumeDigitSequence();
        characterReader1.mark();
        java.lang.String str8 = characterReader1.toString();
        java.lang.String str10 = characterReader1.consumeTo(' ');
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        characterReader12.advance();
        characterReader12.mark();
        characterReader12.mark();
        java.lang.String str16 = characterReader12.consumeHexSequence();
        characterReader12.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        characterReader19.advance();
        boolean boolean22 = characterReader19.containsIgnoreCase("hi!");
        char[] charArray28 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean29 = characterReader19.matchesAny(charArray28);
        java.lang.String str30 = characterReader12.consumeToAny(charArray28);
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean34 = characterReader32.matchesIgnoreCase("");
        int int36 = characterReader32.nextIndexOf('a');
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        characterReader38.advance();
        boolean boolean41 = characterReader38.containsIgnoreCase("hi!");
        char[] charArray47 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean48 = characterReader38.matchesAny(charArray47);
        boolean boolean49 = characterReader32.matchesAnySorted(charArray47);
        boolean boolean50 = characterReader12.matchesAnySorted(charArray47);
        boolean boolean51 = characterReader1.matchesAny(charArray47);
        boolean boolean55 = org.jsoup.parser.CharacterReader.rangeEquals(charArray47, 0, (int) (byte) 10, "hi");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        java.lang.String str7 = characterReader1.consumeHexSequence();
        java.lang.String str8 = characterReader1.consumeData();
        char[] charArray11 = new char[] { '#', '4' };
        boolean boolean12 = characterReader1.matchesAnySorted(charArray11);
        char char13 = characterReader1.current();
        java.lang.String str14 = characterReader1.consumeToEnd();
        java.lang.String str15 = characterReader1.consumeLetterSequence();
        int int17 = characterReader1.nextIndexOf('a');
        characterReader1.rewindToMark();
        boolean boolean20 = characterReader1.matches(' ');
        java.lang.String str21 = characterReader1.consumeTagName();
        int int23 = characterReader1.nextIndexOf('h');
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        characterReader25.advance();
        characterReader25.mark();
        java.lang.String str28 = characterReader25.consumeLetterThenDigitSequence();
        java.lang.String str30 = characterReader25.consumeTo("hi");
        java.lang.String str31 = characterReader25.consumeLetterSequence();
        java.lang.String str32 = characterReader25.consumeLetterSequence();
        char[] charArray39 = new char[] { 'h', '4', '#', 'h', '#', '4' };
        java.lang.String str40 = characterReader25.consumeToAny(charArray39);
        boolean boolean44 = org.jsoup.parser.CharacterReader.rangeEquals(charArray39, (int) 'h', (int) '4', "i!");
        boolean boolean45 = characterReader1.matchesAnySorted(charArray39);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { 'h', '4', '#', 'h', '#', '4' });
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        java.lang.String str7 = characterReader1.consumeHexSequence();
        int int8 = characterReader1.pos();
        char char9 = characterReader1.consume();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        java.lang.String str4 = characterReader1.consumeDigitSequence();
        characterReader1.advance();
        char char6 = characterReader1.current();
        boolean boolean8 = characterReader1.containsIgnoreCase("h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeData();
        char[] charArray6 = new char[] {};
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        boolean boolean11 = characterReader1.rangeEquals((int) (byte) 1, 1, "");
        java.lang.String str12 = characterReader1.consumeData();
        boolean boolean14 = characterReader1.matchesIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        characterReader16.advance();
        characterReader16.mark();
        characterReader16.mark();
        java.lang.String str20 = characterReader16.consumeHexSequence();
        java.lang.String str21 = characterReader16.consumeLetterSequence();
        java.lang.String str22 = characterReader16.consumeHexSequence();
        java.lang.String str23 = characterReader16.consumeData();
        char[] charArray26 = new char[] { '#', '4' };
        boolean boolean27 = characterReader16.matchesAnySorted(charArray26);
        char char28 = characterReader16.current();
        java.lang.String str29 = characterReader16.consumeToEnd();
        java.lang.String str30 = characterReader16.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        characterReader32.advance();
        char char34 = characterReader32.consume();
        java.lang.String str35 = characterReader32.consumeTagName();
        int int36 = characterReader32.pos();
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        characterReader38.advance();
        boolean boolean41 = characterReader38.containsIgnoreCase("hi!");
        boolean boolean43 = characterReader38.matches("hi");
        java.lang.String str44 = characterReader38.consumeTagName();
        char[] charArray47 = new char[] { '4', ' ' };
        java.lang.String str48 = characterReader38.consumeToAnySorted(charArray47);
        boolean boolean49 = characterReader32.matchesAnySorted(charArray47);
        boolean boolean50 = characterReader16.matchesAny(charArray47);
        java.lang.String str51 = characterReader1.consumeToAny(charArray47);
        boolean boolean52 = characterReader1.isEmpty();
        int int54 = characterReader1.nextIndexOf('i');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\uffff' + "'", char28 == '\uffff');
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\uffff' + "'", char34 == '\uffff');
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean6 = characterReader1.matchConsumeIgnoreCase("hi!");
        int int7 = characterReader1.pos();
        int int8 = characterReader1.pos();
        characterReader1.rewindToMark();
        java.lang.String str11 = characterReader1.consumeTo('#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean8 = characterReader1.rangeEquals(1, (int) (byte) 0, "hi!");
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str12 = characterReader10.consumeTo('4');
        characterReader10.rewindToMark();
        java.lang.String str14 = characterReader10.consumeData();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str18 = characterReader16.consumeTo('4');
        characterReader16.rewindToMark();
        boolean boolean23 = characterReader16.rangeEquals(32768, 32768, "hi!");
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        characterReader25.advance();
        boolean boolean28 = characterReader25.containsIgnoreCase("hi!");
        java.lang.String str29 = characterReader25.consumeToEnd();
        java.lang.String str30 = characterReader25.toString();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        characterReader32.advance();
        characterReader32.mark();
        boolean boolean36 = characterReader32.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str40 = characterReader38.consumeTo('a');
        char[] charArray42 = new char[] { '#' };
        java.lang.String str43 = characterReader38.consumeToAnySorted(charArray42);
        java.lang.String str44 = characterReader32.consumeToAny(charArray42);
        boolean boolean45 = characterReader25.matchesAnySorted(charArray42);
        java.lang.String str46 = characterReader16.consumeToAny(charArray42);
        boolean boolean47 = characterReader10.matchesAny(charArray42);
        boolean boolean48 = characterReader1.matchesAnySorted(charArray42);
        boolean boolean49 = characterReader1.isEmpty();
        characterReader1.advance();
        characterReader1.mark();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        characterReader8.advance();
        boolean boolean11 = characterReader8.containsIgnoreCase("hi!");
        char[] charArray17 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean18 = characterReader8.matchesAny(charArray17);
        java.lang.String str19 = characterReader1.consumeToAny(charArray17);
        java.lang.String str20 = characterReader1.toString();
        char char21 = characterReader1.consume();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\uffff' + "'", char21 == '\uffff');
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        characterReader7.advance();
        characterReader7.mark();
        boolean boolean11 = characterReader7.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str15 = characterReader13.consumeTo('a');
        char[] charArray17 = new char[] { '#' };
        java.lang.String str18 = characterReader13.consumeToAnySorted(charArray17);
        java.lang.String str19 = characterReader7.consumeToAny(charArray17);
        boolean boolean20 = characterReader1.matchesAnySorted(charArray17);
        char char21 = characterReader1.current();
        int int23 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str24 = characterReader1.consumeLetterThenDigitSequence();
        characterReader1.advance();
        boolean boolean27 = characterReader1.matchConsumeIgnoreCase("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\uffff' + "'", char21 == '\uffff');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean8 = characterReader1.rangeEquals(1, (int) (byte) 0, "hi!");
        char char9 = characterReader1.consume();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        characterReader11.advance();
        boolean boolean14 = characterReader11.containsIgnoreCase("hi!");
        java.lang.String str15 = characterReader11.consumeToEnd();
        java.lang.String str16 = characterReader11.toString();
        int int18 = characterReader11.nextIndexOf((java.lang.CharSequence) "hi");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        characterReader20.advance();
        characterReader20.mark();
        boolean boolean24 = characterReader20.matchesIgnoreCase("");
        java.lang.String str25 = characterReader20.toString();
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        characterReader27.advance();
        characterReader27.mark();
        characterReader27.mark();
        boolean boolean31 = characterReader27.isEmpty();
        boolean boolean33 = characterReader27.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader35 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("");
        characterReader37.advance();
        characterReader37.mark();
        boolean boolean41 = characterReader37.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str45 = characterReader43.consumeTo('a');
        char[] charArray47 = new char[] { '#' };
        java.lang.String str48 = characterReader43.consumeToAnySorted(charArray47);
        java.lang.String str49 = characterReader37.consumeToAny(charArray47);
        boolean boolean50 = characterReader35.matchesAnySorted(charArray47);
        java.lang.String str51 = characterReader27.consumeToAny(charArray47);
        boolean boolean52 = characterReader20.matchesAnySorted(charArray47);
        boolean boolean53 = characterReader11.matchesAnySorted(charArray47);
        java.lang.String str54 = characterReader1.consumeToAnySorted(charArray47);
        boolean boolean55 = characterReader1.matchesLetter();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        boolean boolean5 = characterReader1.isEmpty();
        int int7 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str8 = characterReader1.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        characterReader10.advance();
        char char12 = characterReader10.consume();
        java.lang.String str13 = characterReader10.consumeTagName();
        int int14 = characterReader10.pos();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        characterReader16.advance();
        boolean boolean19 = characterReader16.containsIgnoreCase("hi!");
        boolean boolean21 = characterReader16.matches("hi");
        java.lang.String str22 = characterReader16.consumeTagName();
        char[] charArray25 = new char[] { '4', ' ' };
        java.lang.String str26 = characterReader16.consumeToAnySorted(charArray25);
        boolean boolean27 = characterReader10.matchesAnySorted(charArray25);
        java.lang.String str28 = characterReader1.consumeToAny(charArray25);
        java.lang.String str29 = characterReader1.consumeTagName();
        java.lang.String str31 = characterReader1.consumeTo('\uffff');
        boolean boolean33 = characterReader1.containsIgnoreCase("h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str6 = characterReader1.consumeTo('a');
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.toString();
        boolean boolean11 = characterReader1.matchConsume("h");
        java.lang.String str12 = characterReader1.consumeLetterSequence();
        char char13 = characterReader1.current();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeData();
        char[] charArray6 = new char[] {};
        java.lang.String str7 = characterReader1.consumeToAnySorted(charArray6);
        boolean boolean11 = characterReader1.rangeEquals((int) (byte) 1, 1, "");
        java.lang.String str12 = characterReader1.consumeData();
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        characterReader14.advance();
        boolean boolean17 = characterReader14.containsIgnoreCase("hi!");
        java.lang.String str18 = characterReader14.consumeToEnd();
        java.lang.String str19 = characterReader14.toString();
        int int21 = characterReader14.nextIndexOf((java.lang.CharSequence) "hi");
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        characterReader23.advance();
        characterReader23.mark();
        boolean boolean27 = characterReader23.matchesIgnoreCase("");
        java.lang.String str28 = characterReader23.toString();
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        characterReader30.advance();
        characterReader30.mark();
        characterReader30.mark();
        boolean boolean34 = characterReader30.isEmpty();
        boolean boolean36 = characterReader30.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("");
        characterReader40.advance();
        characterReader40.mark();
        boolean boolean44 = characterReader40.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader46 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str48 = characterReader46.consumeTo('a');
        char[] charArray50 = new char[] { '#' };
        java.lang.String str51 = characterReader46.consumeToAnySorted(charArray50);
        java.lang.String str52 = characterReader40.consumeToAny(charArray50);
        boolean boolean53 = characterReader38.matchesAnySorted(charArray50);
        java.lang.String str54 = characterReader30.consumeToAny(charArray50);
        boolean boolean55 = characterReader23.matchesAnySorted(charArray50);
        boolean boolean56 = characterReader14.matchesAnySorted(charArray50);
        boolean boolean60 = org.jsoup.parser.CharacterReader.rangeEquals(charArray50, (int) (short) 1, (int) (short) -1, "hi");
        java.lang.String str61 = characterReader1.consumeToAny(charArray50);
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("");
        characterReader63.advance();
        characterReader63.mark();
        characterReader63.mark();
        java.lang.String str67 = characterReader63.consumeHexSequence();
        java.lang.String str68 = characterReader63.consumeLetterSequence();
        java.lang.String str69 = characterReader63.consumeHexSequence();
        java.lang.String str70 = characterReader63.consumeData();
        char[] charArray73 = new char[] { '#', '4' };
        boolean boolean74 = characterReader63.matchesAnySorted(charArray73);
        boolean boolean78 = org.jsoup.parser.CharacterReader.rangeEquals(charArray73, (-1), 0, "");
        boolean boolean82 = org.jsoup.parser.CharacterReader.rangeEquals(charArray73, 32768, (-1), "hi!");
        java.lang.String str83 = characterReader1.consumeToAny(charArray73);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str85 = characterReader1.consumeTo("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertArrayEquals(charArray73, new char[] { '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.toString();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str9 = characterReader1.consumeData();
        java.lang.String str10 = characterReader1.toString();
        characterReader1.rewindToMark();
        boolean boolean13 = characterReader1.matchConsumeIgnoreCase("i!");
        int int15 = characterReader1.nextIndexOf('#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matchesIgnoreCase("");
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        boolean boolean6 = characterReader1.matches("hi");
        java.lang.String str7 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean9 = characterReader1.matchConsume("");
        java.lang.String str10 = characterReader1.consumeData();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi" + "'", str4, "hi");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "!" + "'", str10, "!");
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        characterReader8.advance();
        characterReader8.mark();
        boolean boolean12 = characterReader8.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str16 = characterReader14.consumeTo('a');
        char[] charArray18 = new char[] { '#' };
        java.lang.String str19 = characterReader14.consumeToAnySorted(charArray18);
        java.lang.String str20 = characterReader8.consumeToAny(charArray18);
        boolean boolean21 = characterReader1.matchesAnySorted(charArray18);
        int int23 = characterReader1.nextIndexOf('4');
        boolean boolean25 = characterReader1.matchConsumeIgnoreCase("hi");
        int int27 = characterReader1.nextIndexOf(' ');
        java.lang.String str28 = characterReader1.consumeTagName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        char char3 = characterReader1.current();
        boolean boolean5 = characterReader1.containsIgnoreCase("!");
        characterReader1.mark();
        int int7 = characterReader1.pos();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        characterReader9.advance();
        boolean boolean12 = characterReader9.containsIgnoreCase("hi!");
        java.lang.String str14 = characterReader9.consumeTo('a');
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        characterReader16.advance();
        boolean boolean19 = characterReader16.containsIgnoreCase("hi!");
        java.lang.String str20 = characterReader16.consumeToEnd();
        boolean boolean22 = characterReader16.matchConsume("hi!");
        boolean boolean23 = characterReader16.matchesLetter();
        int int25 = characterReader16.nextIndexOf((java.lang.CharSequence) "hi!");
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str29 = characterReader27.consumeTo('a');
        char[] charArray31 = new char[] { '#' };
        java.lang.String str32 = characterReader27.consumeToAnySorted(charArray31);
        java.lang.String str33 = characterReader27.consumeLetterSequence();
        characterReader27.mark();
        characterReader27.advance();
        boolean boolean39 = characterReader27.rangeEquals((int) (byte) 1, (int) (short) 1, "");
        char char40 = characterReader27.consume();
        characterReader27.unconsume();
        boolean boolean43 = characterReader27.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str47 = characterReader45.consumeTo('a');
        char[] charArray49 = new char[] { '#' };
        java.lang.String str50 = characterReader45.consumeToAnySorted(charArray49);
        org.jsoup.parser.CharacterReader characterReader52 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str54 = characterReader52.consumeTo('a');
        java.lang.String str55 = characterReader52.consumeLetterSequence();
        boolean boolean56 = characterReader52.isEmpty();
        int int58 = characterReader52.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str59 = characterReader52.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader61 = new org.jsoup.parser.CharacterReader("");
        characterReader61.advance();
        char char63 = characterReader61.consume();
        java.lang.String str64 = characterReader61.consumeTagName();
        int int65 = characterReader61.pos();
        org.jsoup.parser.CharacterReader characterReader67 = new org.jsoup.parser.CharacterReader("");
        characterReader67.advance();
        boolean boolean70 = characterReader67.containsIgnoreCase("hi!");
        boolean boolean72 = characterReader67.matches("hi");
        java.lang.String str73 = characterReader67.consumeTagName();
        char[] charArray76 = new char[] { '4', ' ' };
        java.lang.String str77 = characterReader67.consumeToAnySorted(charArray76);
        boolean boolean78 = characterReader61.matchesAnySorted(charArray76);
        java.lang.String str79 = characterReader52.consumeToAny(charArray76);
        boolean boolean80 = characterReader45.matchesAny(charArray76);
        java.lang.String str81 = characterReader45.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader83 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str85 = characterReader83.consumeTo('a');
        char[] charArray87 = new char[] { '#' };
        java.lang.String str88 = characterReader83.consumeToAnySorted(charArray87);
        boolean boolean92 = org.jsoup.parser.CharacterReader.rangeEquals(charArray87, (int) '\uffff', (int) 'h', "hi");
        boolean boolean93 = characterReader45.matchesAny(charArray87);
        boolean boolean94 = characterReader27.matchesAnySorted(charArray87);
        boolean boolean95 = characterReader16.matchesAnySorted(charArray87);
        boolean boolean96 = characterReader9.matchesAnySorted(charArray87);
        boolean boolean97 = characterReader1.matchesAny(charArray87);
        boolean boolean99 = characterReader1.matchConsume("h");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\uffff' + "'", char3 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + '\uffff' + "'", char40 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + char63 + "' != '" + '\uffff' + "'", char63 == '\uffff');
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertArrayEquals(charArray76, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertArrayEquals(charArray87, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeToEnd();
        boolean boolean4 = characterReader1.matches('a');
        char char5 = characterReader1.current();
        char char6 = characterReader1.consume();
        java.lang.String str7 = characterReader1.consumeToEnd();
        int int9 = characterReader1.nextIndexOf((java.lang.CharSequence) "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\uffff' + "'", char5 == '\uffff');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.toString();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str9 = characterReader1.toString();
        int int10 = characterReader1.pos();
        boolean boolean11 = characterReader1.matchesDigit();
        boolean boolean12 = characterReader1.matchesLetter();
        characterReader1.mark();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str6 = characterReader1.consumeTo('a');
        char char7 = characterReader1.consume();
        java.lang.String str8 = characterReader1.consumeTagName();
        java.lang.String str9 = characterReader1.consumeToEnd();
        boolean boolean10 = characterReader1.matchesLetter();
        characterReader1.rewindToMark();
        boolean boolean13 = characterReader1.matches('i');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        boolean boolean8 = characterReader1.rangeEquals((int) 'h', (int) '\uffff', "hi");
        characterReader1.rewindToMark();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.toString();
        int int8 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str9 = characterReader1.consumeData();
        int int11 = characterReader1.nextIndexOf('#');
        boolean boolean13 = characterReader1.matchesIgnoreCase("");
        char char14 = characterReader1.current();
        int int16 = characterReader1.nextIndexOf((java.lang.CharSequence) "i");
        java.lang.String str17 = characterReader1.consumeData();
        boolean boolean19 = characterReader1.matches(' ');
        java.lang.String str21 = characterReader1.consumeTo('a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\uffff' + "'", char14 == '\uffff');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str4 = characterReader1.consumeHexSequence();
        boolean boolean5 = characterReader1.matchesLetter();
        boolean boolean7 = characterReader1.matchesIgnoreCase("");
        java.lang.String str8 = characterReader1.consumeLetterThenDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi" + "'", str8, "hi");
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("");
        characterReader3.advance();
        characterReader3.mark();
        boolean boolean7 = characterReader3.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str11 = characterReader9.consumeTo('a');
        char[] charArray13 = new char[] { '#' };
        java.lang.String str14 = characterReader9.consumeToAnySorted(charArray13);
        java.lang.String str15 = characterReader3.consumeToAny(charArray13);
        boolean boolean16 = characterReader1.matchesAnySorted(charArray13);
        boolean boolean20 = characterReader1.rangeEquals((int) (short) 0, (int) 'h', "");
        java.lang.String str21 = characterReader1.consumeDigitSequence();
        char char22 = characterReader1.consume();
        boolean boolean24 = characterReader1.matches("i!");
        java.lang.String str25 = characterReader1.consumeLetterThenDigitSequence();
        int int26 = characterReader1.pos();
        java.lang.String str27 = characterReader1.consumeTagName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + 'h' + "'", char22 == 'h');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "i" + "'", str25, "i");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "!" + "'", str27, "!");
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = characterReader1.consumeToAnySorted(charArray5);
        boolean boolean8 = characterReader1.matchesIgnoreCase("hi!");
        java.lang.String str9 = characterReader1.toString();
        java.lang.String str10 = characterReader1.consumeLetterSequence();
        int int12 = characterReader1.nextIndexOf('!');
        java.lang.String str13 = characterReader1.consumeHexSequence();
        java.lang.String str14 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        boolean boolean7 = characterReader1.matchConsume("hi!");
        boolean boolean8 = characterReader1.matchesLetter();
        int int10 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        boolean boolean11 = characterReader1.isEmpty();
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            char char13 = characterReader1.consume();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo('a');
        char[] charArray5 = new char[] { '#' };
        java.lang.String str6 = characterReader1.consumeToAnySorted(charArray5);
        char char7 = characterReader1.current();
        boolean boolean8 = characterReader1.matchesLetter();
        boolean boolean9 = characterReader1.matchesDigit();
        char[] charArray10 = null;
        boolean boolean11 = characterReader1.matchesAny(charArray10);
        boolean boolean12 = characterReader1.matchesLetter();
        characterReader1.rewindToMark();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str3 = characterReader1.consumeTo('4');
        characterReader1.rewindToMark();
        boolean boolean8 = characterReader1.rangeEquals(32768, 32768, "hi!");
        java.lang.String str9 = characterReader1.consumeData();
        boolean boolean11 = characterReader1.matches("!");
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        characterReader13.advance();
        characterReader13.mark();
        characterReader13.mark();
        java.lang.String str17 = characterReader13.consumeHexSequence();
        characterReader13.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        characterReader20.advance();
        boolean boolean23 = characterReader20.containsIgnoreCase("hi!");
        char[] charArray29 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean30 = characterReader20.matchesAny(charArray29);
        java.lang.String str31 = characterReader13.consumeToAny(charArray29);
        boolean boolean33 = characterReader13.containsIgnoreCase("hi");
        char[] charArray34 = null;
        boolean boolean35 = characterReader13.matchesAnySorted(charArray34);
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("");
        characterReader37.advance();
        boolean boolean40 = characterReader37.containsIgnoreCase("hi!");
        boolean boolean42 = characterReader37.matchConsumeIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader44 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str46 = characterReader44.consumeTo('a');
        char[] charArray48 = new char[] { '#' };
        java.lang.String str49 = characterReader44.consumeToAnySorted(charArray48);
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str53 = characterReader51.consumeTo('a');
        java.lang.String str54 = characterReader51.consumeLetterSequence();
        boolean boolean55 = characterReader51.isEmpty();
        int int57 = characterReader51.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str58 = characterReader51.consumeHexSequence();
        org.jsoup.parser.CharacterReader characterReader60 = new org.jsoup.parser.CharacterReader("");
        characterReader60.advance();
        char char62 = characterReader60.consume();
        java.lang.String str63 = characterReader60.consumeTagName();
        int int64 = characterReader60.pos();
        org.jsoup.parser.CharacterReader characterReader66 = new org.jsoup.parser.CharacterReader("");
        characterReader66.advance();
        boolean boolean69 = characterReader66.containsIgnoreCase("hi!");
        boolean boolean71 = characterReader66.matches("hi");
        java.lang.String str72 = characterReader66.consumeTagName();
        char[] charArray75 = new char[] { '4', ' ' };
        java.lang.String str76 = characterReader66.consumeToAnySorted(charArray75);
        boolean boolean77 = characterReader60.matchesAnySorted(charArray75);
        java.lang.String str78 = characterReader51.consumeToAny(charArray75);
        boolean boolean79 = characterReader44.matchesAny(charArray75);
        java.lang.String str80 = characterReader44.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader82 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str84 = characterReader82.consumeTo('a');
        char[] charArray86 = new char[] { '#' };
        java.lang.String str87 = characterReader82.consumeToAnySorted(charArray86);
        boolean boolean91 = org.jsoup.parser.CharacterReader.rangeEquals(charArray86, (int) '\uffff', (int) 'h', "hi");
        boolean boolean92 = characterReader44.matchesAny(charArray86);
        java.lang.String str93 = characterReader37.consumeToAnySorted(charArray86);
        boolean boolean94 = characterReader13.matchesAnySorted(charArray86);
        java.lang.String str95 = characterReader1.consumeToAnySorted(charArray86);
        boolean boolean99 = characterReader1.rangeEquals((int) 'a', 0, "hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + char62 + "' != '" + '\uffff' + "'", char62 == '\uffff');
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] { '4', ' ' });
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertArrayEquals(charArray86, new char[] { '#' });
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str5 = characterReader1.consumeToEnd();
        java.lang.String str6 = characterReader1.toString();
        characterReader1.advance();
        java.lang.String str8 = characterReader1.consumeToEnd();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        characterReader1.mark();
        characterReader1.mark();
        java.lang.String str5 = characterReader1.consumeHexSequence();
        java.lang.String str6 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        java.lang.String str8 = characterReader1.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        characterReader10.advance();
        characterReader10.mark();
        characterReader10.mark();
        java.lang.String str14 = characterReader10.consumeHexSequence();
        characterReader10.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        characterReader17.advance();
        boolean boolean20 = characterReader17.containsIgnoreCase("hi!");
        char[] charArray26 = new char[] { '4', ' ', '#', '4', ' ' };
        boolean boolean27 = characterReader17.matchesAny(charArray26);
        java.lang.String str28 = characterReader10.consumeToAny(charArray26);
        java.lang.String str29 = characterReader1.consumeToAny(charArray26);
        int int31 = characterReader1.nextIndexOf((java.lang.CharSequence) "h");
        boolean boolean32 = characterReader1.matchesLetter();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.advance();
        boolean boolean4 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str6 = characterReader1.consumeTo('a');
        boolean boolean10 = characterReader1.rangeEquals((int) (short) -1, 2, "");
        boolean boolean12 = characterReader1.matchConsume("");
        char char13 = characterReader1.consume();
        java.lang.String str14 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean16 = characterReader1.matches('i');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }
}

