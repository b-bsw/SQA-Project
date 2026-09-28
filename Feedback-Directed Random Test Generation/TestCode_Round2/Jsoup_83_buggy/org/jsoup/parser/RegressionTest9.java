package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        int int3 = characterReader1.pos();
        java.lang.String str4 = characterReader1.consumeDigitSequence();
        char char5 = characterReader1.current();
        boolean boolean6 = characterReader1.matchesDigit();
        int int8 = characterReader1.nextIndexOf('i');
        characterReader1.advance();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'h' + "'", char5 == 'h');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        org.jsoup.parser.Tokeniser tokeniser1 = null;
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean5 = characterReader3.matches(' ');
        boolean boolean9 = characterReader3.rangeEquals(10, 0, "");
        boolean boolean10 = characterReader3.matchesLetter();
        char char11 = characterReader3.consume();
        java.lang.String str12 = characterReader3.consumeHexSequence();
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser1, characterReader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'h' + "'", char11 == 'h');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int2 = characterReader1.pos();
        java.lang.String str3 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str5 = characterReader1.consumeTo('#');
        char[] charArray7 = new char[] { ' ' };
        boolean boolean11 = org.jsoup.parser.CharacterReader.rangeEquals(charArray7, 32768, (int) (byte) 10, "");
        java.lang.String str12 = characterReader1.consumeToAny(charArray7);
        boolean boolean14 = characterReader1.matchConsume("");
        java.lang.String str15 = characterReader1.consumeToEnd();
        int int16 = characterReader1.pos();
        char char17 = characterReader1.current();
        boolean boolean19 = characterReader1.matches("hi");
        characterReader1.unconsume();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!" + "'", str5, "!");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\uffff' + "'", char17 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean4 = characterReader1.isEmpty();
        java.lang.String str5 = characterReader1.toString();
        java.lang.String str6 = characterReader1.consumeData();
        characterReader1.rewindToMark();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        boolean boolean9 = characterReader1.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str12 = characterReader11.toString();
        java.lang.String str13 = characterReader11.toString();
        boolean boolean14 = characterReader11.isEmpty();
        java.lang.String str15 = characterReader11.toString();
        boolean boolean17 = characterReader11.matchesIgnoreCase("!");
        java.lang.String str18 = characterReader11.consumeData();
        java.lang.String str19 = characterReader11.consumeTagName();
        java.lang.String str20 = characterReader11.consumeToEnd();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str23 = characterReader22.consumeDigitSequence();
        characterReader22.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader26 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean28 = characterReader26.matches("hi!");
        char[] charArray30 = new char[] { ' ' };
        boolean boolean34 = org.jsoup.parser.CharacterReader.rangeEquals(charArray30, 32768, (int) (byte) 10, "");
        java.lang.String str35 = characterReader26.consumeToAnySorted(charArray30);
        java.lang.String str36 = characterReader22.consumeToAnySorted(charArray30);
        boolean boolean37 = characterReader11.matchesAny(charArray30);
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str40 = characterReader39.toString();
        java.lang.String str41 = characterReader39.toString();
        boolean boolean42 = characterReader39.isEmpty();
        java.lang.String str43 = characterReader39.toString();
        char[] charArray44 = new char[] {};
        boolean boolean48 = org.jsoup.parser.CharacterReader.rangeEquals(charArray44, 1, (int) (byte) 10, "hi!");
        boolean boolean49 = characterReader39.matchesAny(charArray44);
        boolean boolean53 = org.jsoup.parser.CharacterReader.rangeEquals(charArray44, (int) (short) 10, 0, "h");
        java.lang.String str54 = characterReader11.consumeToAny(charArray44);
        boolean boolean55 = characterReader1.matchesAny(charArray44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi" + "'", str8, "hi");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matches(' ');
        char char4 = characterReader1.consume();
        java.lang.String str5 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("!");
        java.lang.String str8 = characterReader1.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str11 = characterReader10.toString();
        char[] charArray13 = new char[] { ' ' };
        boolean boolean17 = org.jsoup.parser.CharacterReader.rangeEquals(charArray13, 32768, (int) (byte) 10, "");
        boolean boolean18 = characterReader10.matchesAny(charArray13);
        char[] charArray19 = new char[] {};
        boolean boolean23 = org.jsoup.parser.CharacterReader.rangeEquals(charArray19, 0, 100, "!");
        boolean boolean27 = org.jsoup.parser.CharacterReader.rangeEquals(charArray19, (int) 'i', (int) (short) 100, "i!");
        boolean boolean28 = characterReader10.matchesAnySorted(charArray19);
        boolean boolean29 = characterReader1.matchesAny(charArray19);
        boolean boolean31 = characterReader1.containsIgnoreCase("i!");
        boolean boolean33 = characterReader1.matches("hi!");
        boolean boolean35 = characterReader1.matchesIgnoreCase("");
        boolean boolean37 = characterReader1.matches("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'h' + "'", char4 == 'h');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        int int3 = characterReader1.pos();
        int int4 = characterReader1.pos();
        boolean boolean6 = characterReader1.matches("");
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str9 = characterReader8.toString();
        int int10 = characterReader8.pos();
        char[] charArray11 = new char[] {};
        boolean boolean12 = characterReader8.matchesAny(charArray11);
        boolean boolean16 = org.jsoup.parser.CharacterReader.rangeEquals(charArray11, (int) (short) 0, (int) (byte) 100, "hi");
        boolean boolean17 = characterReader1.matchesAnySorted(charArray11);
        boolean boolean19 = characterReader1.matchConsumeIgnoreCase("i");
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str22 = characterReader21.toString();
        boolean boolean24 = characterReader21.matches('\uffff');
        boolean boolean26 = characterReader21.matches("");
        boolean boolean28 = characterReader21.matchConsume("");
        java.lang.String str29 = characterReader21.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str32 = characterReader31.toString();
        int int33 = characterReader31.pos();
        char[] charArray34 = new char[] {};
        boolean boolean35 = characterReader31.matchesAny(charArray34);
        boolean boolean39 = org.jsoup.parser.CharacterReader.rangeEquals(charArray34, (int) (short) 0, (int) (byte) 100, "hi");
        boolean boolean40 = characterReader21.matchesAny(charArray34);
        boolean boolean44 = org.jsoup.parser.CharacterReader.rangeEquals(charArray34, (int) (byte) 1, 32768, "hi");
        java.lang.String str45 = characterReader1.consumeToAny(charArray34);
        boolean boolean47 = characterReader1.matchesIgnoreCase("i!");
        java.lang.String str48 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str50 = characterReader1.consumeTo('a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi" + "'", str29, "hi");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeDigitSequence();
        boolean boolean4 = characterReader1.matches('4');
        int int6 = characterReader1.nextIndexOf('\uffff');
        java.lang.String str7 = characterReader1.consumeTagName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int2 = characterReader1.pos();
        java.lang.String str3 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str5 = characterReader1.consumeTo('#');
        char[] charArray7 = new char[] { ' ' };
        boolean boolean11 = org.jsoup.parser.CharacterReader.rangeEquals(charArray7, 32768, (int) (byte) 10, "");
        java.lang.String str12 = characterReader1.consumeToAny(charArray7);
        java.lang.String str13 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str16 = characterReader15.toString();
        boolean boolean18 = characterReader15.matches('\uffff');
        boolean boolean20 = characterReader15.matches("");
        boolean boolean22 = characterReader15.matchConsume("");
        java.lang.String str23 = characterReader15.consumeLetterSequence();
        char[] charArray24 = new char[] {};
        boolean boolean28 = org.jsoup.parser.CharacterReader.rangeEquals(charArray24, (int) (byte) -1, (int) (byte) 100, "hi!");
        java.lang.String str29 = characterReader15.consumeToAny(charArray24);
        boolean boolean30 = characterReader1.matchesAnySorted(charArray24);
        char[] charArray31 = null;
        boolean boolean32 = characterReader1.matchesAny(charArray31);
        characterReader1.rewindToMark();
        java.lang.String str34 = characterReader1.consumeData();
        characterReader1.unconsume();
        int int37 = characterReader1.nextIndexOf((java.lang.CharSequence) "h");
        characterReader1.unconsume();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!" + "'", str5, "!");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi" + "'", str23, "hi");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "!" + "'", str29, "!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        int int3 = characterReader1.pos();
        int int4 = characterReader1.pos();
        java.lang.String str5 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.Class<?> wildcardClass6 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi" + "'", str5, "hi");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean2 = characterReader1.matchesDigit();
        boolean boolean3 = characterReader1.isEmpty();
        boolean boolean5 = characterReader1.matches("!");
        boolean boolean7 = characterReader1.matches("hi!");
        java.lang.String str8 = characterReader1.consumeHexSequence();
        java.lang.String str9 = characterReader1.consumeData();
        int int10 = characterReader1.pos();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        int int13 = characterReader12.pos();
        java.lang.String str14 = characterReader12.consumeLetterThenDigitSequence();
        java.lang.String str16 = characterReader12.consumeTo('h');
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str19 = characterReader18.toString();
        java.lang.String str20 = characterReader18.toString();
        boolean boolean21 = characterReader18.isEmpty();
        java.lang.String str22 = characterReader18.toString();
        char[] charArray23 = new char[] {};
        boolean boolean27 = org.jsoup.parser.CharacterReader.rangeEquals(charArray23, 1, (int) (byte) 10, "hi!");
        boolean boolean28 = characterReader18.matchesAny(charArray23);
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean32 = characterReader30.matches("hi!");
        java.lang.String str33 = characterReader30.consumeToEnd();
        java.lang.String str34 = characterReader30.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("hi!");
        int int37 = characterReader36.pos();
        char[] charArray39 = new char[] { '4' };
        java.lang.String str40 = characterReader36.consumeToAny(charArray39);
        boolean boolean41 = characterReader30.matchesAnySorted(charArray39);
        boolean boolean42 = characterReader18.matchesAny(charArray39);
        boolean boolean43 = characterReader12.matchesAny(charArray39);
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean47 = characterReader45.matches("hi!");
        java.lang.String str48 = characterReader45.consumeToEnd();
        java.lang.String str49 = characterReader45.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("hi!");
        int int52 = characterReader51.pos();
        char[] charArray54 = new char[] { '4' };
        java.lang.String str55 = characterReader51.consumeToAny(charArray54);
        boolean boolean56 = characterReader45.matchesAnySorted(charArray54);
        boolean boolean57 = characterReader12.matchesAny(charArray54);
        boolean boolean58 = characterReader1.matchesAny(charArray54);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi" + "'", str14, "hi");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "!" + "'", str16, "!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str5 = characterReader4.toString();
        char[] charArray7 = new char[] { ' ' };
        boolean boolean11 = org.jsoup.parser.CharacterReader.rangeEquals(charArray7, 32768, (int) (byte) 10, "");
        boolean boolean12 = characterReader4.matchesAny(charArray7);
        boolean boolean13 = characterReader1.matchesAnySorted(charArray7);
        characterReader1.rewindToMark();
        java.lang.String str15 = characterReader1.consumeDigitSequence();
        java.lang.String str17 = characterReader1.consumeTo('a');
        int int19 = characterReader1.nextIndexOf('#');
        int int21 = characterReader1.nextIndexOf('h');
        boolean boolean25 = characterReader1.rangeEquals((int) 'i', (int) '\uffff', "i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean4 = characterReader1.isEmpty();
        java.lang.String str5 = characterReader1.toString();
        java.lang.String str6 = characterReader1.consumeData();
        characterReader1.rewindToMark();
        boolean boolean9 = characterReader1.matches("hi!");
        boolean boolean11 = characterReader1.matchConsumeIgnoreCase("i!");
        boolean boolean13 = characterReader1.matchesIgnoreCase("i!");
        java.lang.String str14 = characterReader1.consumeToEnd();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        boolean boolean4 = characterReader1.matches('\uffff');
        boolean boolean6 = characterReader1.matches("");
        boolean boolean8 = characterReader1.matchConsume("");
        java.lang.String str9 = characterReader1.consumeLetterSequence();
        java.lang.String str10 = characterReader1.consumeHexSequence();
        boolean boolean11 = characterReader1.matchesDigit();
        java.lang.String str12 = characterReader1.toString();
        java.lang.String str14 = characterReader1.consumeTo("i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi" + "'", str9, "hi");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "!" + "'", str12, "!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "!" + "'", str14, "!");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matches(' ');
        java.lang.String str5 = characterReader1.consumeTo('\uffff');
        boolean boolean7 = characterReader1.matches('4');
        java.lang.String str9 = characterReader1.consumeTo("hi!");
        java.lang.String str10 = characterReader1.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("hi!");
        int int13 = characterReader12.pos();
        java.lang.String str14 = characterReader12.consumeLetterThenDigitSequence();
        characterReader12.mark();
        boolean boolean16 = characterReader12.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("hi!");
        int int19 = characterReader18.pos();
        java.lang.String str20 = characterReader18.consumeLetterThenDigitSequence();
        characterReader18.mark();
        java.lang.String str22 = characterReader18.consumeToEnd();
        char[] charArray26 = new char[] { '\uffff', ' ', 'h' };
        boolean boolean30 = org.jsoup.parser.CharacterReader.rangeEquals(charArray26, (int) (byte) -1, (int) (byte) 100, "i");
        boolean boolean31 = characterReader18.matchesAny(charArray26);
        boolean boolean32 = characterReader12.matchesAny(charArray26);
        boolean boolean33 = characterReader1.matchesAny(charArray26);
        java.lang.String str34 = characterReader1.consumeToEnd();
        boolean boolean36 = characterReader1.matchConsumeIgnoreCase("hi!");
        char char37 = characterReader1.consume();
        boolean boolean39 = characterReader1.matchConsumeIgnoreCase("");
        boolean boolean40 = characterReader1.matchesLetter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi" + "'", str14, "hi");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi" + "'", str20, "hi");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "!" + "'", str22, "!");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\uffff', ' ', 'h' });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '\uffff' + "'", char37 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        boolean boolean4 = characterReader1.matches('\uffff');
        boolean boolean6 = characterReader1.matches("");
        java.lang.String str8 = characterReader1.consumeTo("!");
        char[] charArray11 = new char[] { 'h', '!' };
        boolean boolean15 = org.jsoup.parser.CharacterReader.rangeEquals(charArray11, (int) 'a', 0, "!");
        boolean boolean19 = org.jsoup.parser.CharacterReader.rangeEquals(charArray11, (int) (byte) 10, (int) (byte) -1, "!");
        boolean boolean20 = characterReader1.matchesAny(charArray11);
        characterReader1.advance();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str24 = characterReader23.toString();
        int int25 = characterReader23.pos();
        int int26 = characterReader23.pos();
        boolean boolean28 = characterReader23.matches("");
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str31 = characterReader30.toString();
        int int32 = characterReader30.pos();
        char[] charArray33 = new char[] {};
        boolean boolean34 = characterReader30.matchesAny(charArray33);
        boolean boolean38 = org.jsoup.parser.CharacterReader.rangeEquals(charArray33, (int) (short) 0, (int) (byte) 100, "hi");
        boolean boolean39 = characterReader23.matchesAnySorted(charArray33);
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("hi!");
        int int42 = characterReader41.pos();
        char[] charArray44 = new char[] { '4' };
        java.lang.String str45 = characterReader41.consumeToAny(charArray44);
        java.lang.String str46 = characterReader23.consumeToAnySorted(charArray44);
        boolean boolean50 = characterReader23.rangeEquals((int) '!', 0, "i!");
        org.jsoup.parser.CharacterReader characterReader52 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str53 = characterReader52.toString();
        boolean boolean55 = characterReader52.matches('\uffff');
        boolean boolean57 = characterReader52.matches("");
        java.lang.String str59 = characterReader52.consumeTo("!");
        char[] charArray62 = new char[] { 'h', '!' };
        boolean boolean66 = org.jsoup.parser.CharacterReader.rangeEquals(charArray62, (int) 'a', 0, "!");
        boolean boolean70 = org.jsoup.parser.CharacterReader.rangeEquals(charArray62, (int) (byte) 10, (int) (byte) -1, "!");
        boolean boolean71 = characterReader52.matchesAny(charArray62);
        boolean boolean72 = characterReader23.matchesAny(charArray62);
        java.lang.String str73 = characterReader1.consumeToAny(charArray62);
        characterReader1.unconsume();
        characterReader1.advance();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi" + "'", str8, "hi");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'h', '!' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi" + "'", str59, "hi");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { 'h', '!' });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray3 = new char[] { ' ' };
        boolean boolean7 = org.jsoup.parser.CharacterReader.rangeEquals(charArray3, 32768, (int) (byte) 10, "");
        java.lang.String str8 = characterReader1.consumeToAnySorted(charArray3);
        java.lang.String str9 = characterReader1.toString();
        int int10 = characterReader1.pos();
        boolean boolean12 = characterReader1.matches("h");
        boolean boolean14 = characterReader1.matchConsume("!");
        java.lang.String str15 = characterReader1.consumeData();
        java.lang.String str16 = characterReader1.consumeLetterSequence();
        java.lang.String str17 = characterReader1.consumeLetterThenDigitSequence();
        characterReader1.advance();
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str21 = characterReader20.toString();
        int int22 = characterReader20.pos();
        int int23 = characterReader20.pos();
        boolean boolean25 = characterReader20.matches("");
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str28 = characterReader27.toString();
        int int29 = characterReader27.pos();
        char[] charArray30 = new char[] {};
        boolean boolean31 = characterReader27.matchesAny(charArray30);
        boolean boolean35 = org.jsoup.parser.CharacterReader.rangeEquals(charArray30, (int) (short) 0, (int) (byte) 100, "hi");
        boolean boolean36 = characterReader20.matchesAnySorted(charArray30);
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("hi!");
        int int39 = characterReader38.pos();
        char[] charArray41 = new char[] { '4' };
        java.lang.String str42 = characterReader38.consumeToAny(charArray41);
        java.lang.String str43 = characterReader20.consumeToAnySorted(charArray41);
        boolean boolean47 = characterReader20.rangeEquals((int) '!', 0, "i!");
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str50 = characterReader49.toString();
        boolean boolean52 = characterReader49.matches('\uffff');
        boolean boolean54 = characterReader49.matches("");
        java.lang.String str56 = characterReader49.consumeTo("!");
        char[] charArray59 = new char[] { 'h', '!' };
        boolean boolean63 = org.jsoup.parser.CharacterReader.rangeEquals(charArray59, (int) 'a', 0, "!");
        boolean boolean67 = org.jsoup.parser.CharacterReader.rangeEquals(charArray59, (int) (byte) 10, (int) (byte) -1, "!");
        boolean boolean68 = characterReader49.matchesAny(charArray59);
        boolean boolean69 = characterReader20.matchesAny(charArray59);
        boolean boolean70 = characterReader1.matchesAny(charArray59);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi" + "'", str56, "hi");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] { 'h', '!' });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        boolean boolean4 = characterReader1.matches('\uffff');
        boolean boolean6 = characterReader1.matches("");
        java.lang.String str7 = characterReader1.consumeHexSequence();
        java.lang.String str9 = characterReader1.consumeTo("hi!");
        boolean boolean13 = characterReader1.rangeEquals((int) (short) 0, (int) 'i', "i");
        java.lang.String str14 = characterReader1.consumeLetterSequence();
        java.lang.String str16 = characterReader1.consumeTo("hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi" + "'", str14, "hi");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "!" + "'", str16, "!");
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matches(' ');
        java.lang.String str5 = characterReader1.consumeTo('\uffff');
        boolean boolean7 = characterReader1.matchesIgnoreCase("hi");
        char char8 = characterReader1.consume();
        characterReader1.mark();
        java.lang.String str10 = characterReader1.consumeLetterSequence();
        boolean boolean12 = characterReader1.containsIgnoreCase("!");
        int int13 = characterReader1.pos();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matches(' ');
        java.lang.String str5 = characterReader1.consumeTo('\uffff');
        java.lang.String str6 = characterReader1.consumeTagName();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean10 = characterReader1.matches("hi!");
        boolean boolean11 = characterReader1.matchesDigit();
        boolean boolean13 = characterReader1.matches(' ');
        java.lang.String str14 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str4 = characterReader3.toString();
        int int5 = characterReader3.pos();
        char[] charArray6 = new char[] {};
        boolean boolean7 = characterReader3.matchesAny(charArray6);
        boolean boolean11 = org.jsoup.parser.CharacterReader.rangeEquals(charArray6, (int) (short) 0, (int) (byte) 100, "hi");
        java.lang.String str12 = characterReader1.consumeToAnySorted(charArray6);
        java.lang.String str13 = characterReader1.consumeLetterSequence();
        boolean boolean15 = characterReader1.matches('\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matches(' ');
        java.lang.String str5 = characterReader1.consumeTo('\uffff');
        boolean boolean7 = characterReader1.matches('4');
        characterReader1.advance();
        boolean boolean12 = characterReader1.rangeEquals((int) '4', (int) (short) 0, "");
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("hi!");
        int int15 = characterReader14.pos();
        java.lang.String str16 = characterReader14.toString();
        boolean boolean20 = characterReader14.rangeEquals((int) ' ', 2, "");
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str23 = characterReader22.toString();
        char[] charArray25 = new char[] { ' ' };
        boolean boolean29 = org.jsoup.parser.CharacterReader.rangeEquals(charArray25, 32768, (int) (byte) 10, "");
        boolean boolean30 = characterReader22.matchesAny(charArray25);
        java.lang.String str31 = characterReader22.consumeHexSequence();
        characterReader22.mark();
        boolean boolean34 = characterReader22.matchesIgnoreCase("!");
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str37 = characterReader36.toString();
        int int38 = characterReader36.pos();
        char[] charArray39 = new char[] {};
        boolean boolean40 = characterReader36.matchesAny(charArray39);
        boolean boolean41 = characterReader22.matchesAny(charArray39);
        boolean boolean42 = characterReader14.matchesAny(charArray39);
        java.lang.String str43 = characterReader1.consumeToAny(charArray39);
        boolean boolean44 = characterReader1.isEmpty();
        characterReader1.unconsume();
        org.jsoup.parser.CharacterReader characterReader47 = new org.jsoup.parser.CharacterReader("hi!");
        int int48 = characterReader47.pos();
        java.lang.String str49 = characterReader47.consumeLetterThenDigitSequence();
        java.lang.String str51 = characterReader47.consumeTo('#');
        char[] charArray53 = new char[] { ' ' };
        boolean boolean57 = org.jsoup.parser.CharacterReader.rangeEquals(charArray53, 32768, (int) (byte) 10, "");
        java.lang.String str58 = characterReader47.consumeToAny(charArray53);
        java.lang.String str59 = characterReader47.consumeLetterSequence();
        boolean boolean60 = characterReader47.matchesLetter();
        java.lang.String str61 = characterReader47.consumeDigitSequence();
        char char62 = characterReader47.current();
        org.jsoup.parser.CharacterReader characterReader64 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str65 = characterReader64.toString();
        char[] charArray67 = new char[] { ' ' };
        boolean boolean71 = org.jsoup.parser.CharacterReader.rangeEquals(charArray67, 32768, (int) (byte) 10, "");
        boolean boolean72 = characterReader64.matchesAny(charArray67);
        boolean boolean73 = characterReader64.matchesLetter();
        int int75 = characterReader64.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str76 = characterReader64.consumeLetterThenDigitSequence();
        org.jsoup.parser.CharacterReader characterReader78 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean80 = characterReader78.matches("hi!");
        java.lang.String str81 = characterReader78.consumeToEnd();
        java.lang.String str82 = characterReader78.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader84 = new org.jsoup.parser.CharacterReader("hi!");
        int int85 = characterReader84.pos();
        char[] charArray87 = new char[] { '4' };
        java.lang.String str88 = characterReader84.consumeToAny(charArray87);
        boolean boolean89 = characterReader78.matchesAnySorted(charArray87);
        java.lang.String str90 = characterReader64.consumeToAny(charArray87);
        java.lang.String str91 = characterReader47.consumeToAnySorted(charArray87);
        java.lang.String str92 = characterReader1.consumeToAny(charArray87);
        int int94 = characterReader1.nextIndexOf('a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi" + "'", str49, "hi");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "!" + "'", str51, "!");
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + char62 + "' != '" + '\uffff' + "'", char62 == '\uffff');
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi" + "'", str76, "hi");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertArrayEquals(charArray87, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "!" + "'", str90, "!");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean4 = characterReader1.isEmpty();
        java.lang.String str5 = characterReader1.toString();
        boolean boolean7 = characterReader1.matchesIgnoreCase("!");
        boolean boolean9 = characterReader1.matchConsumeIgnoreCase("");
        int int10 = characterReader1.pos();
        boolean boolean14 = characterReader1.rangeEquals((int) 'i', (int) (short) 1, "");
        char char15 = characterReader1.consume();
        boolean boolean17 = characterReader1.matches("i");
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray21 = new char[] { ' ' };
        boolean boolean25 = org.jsoup.parser.CharacterReader.rangeEquals(charArray21, 32768, (int) (byte) 10, "");
        java.lang.String str26 = characterReader19.consumeToAnySorted(charArray21);
        java.lang.String str27 = characterReader19.toString();
        int int28 = characterReader19.pos();
        boolean boolean30 = characterReader19.matches("h");
        boolean boolean32 = characterReader19.matchConsume("!");
        boolean boolean33 = characterReader19.isEmpty();
        org.jsoup.parser.CharacterReader characterReader35 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean37 = characterReader35.matches(' ');
        java.lang.String str39 = characterReader35.consumeTo('\uffff');
        boolean boolean41 = characterReader35.matches('4');
        boolean boolean42 = characterReader35.matchesDigit();
        java.lang.String str43 = characterReader35.consumeToEnd();
        java.lang.String str44 = characterReader35.consumeData();
        org.jsoup.parser.CharacterReader characterReader46 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str47 = characterReader46.toString();
        int int48 = characterReader46.pos();
        char[] charArray49 = new char[] {};
        boolean boolean50 = characterReader46.matchesAny(charArray49);
        java.lang.String str51 = characterReader35.consumeToAny(charArray49);
        boolean boolean52 = characterReader19.matchesAnySorted(charArray49);
        boolean boolean53 = characterReader1.matchesAny(charArray49);
        char char54 = characterReader1.consume();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + char54 + "' != '" + 'i' + "'", char54 == 'i');
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int2 = characterReader1.pos();
        char[] charArray4 = new char[] { '4' };
        java.lang.String str5 = characterReader1.consumeToAny(charArray4);
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("hi");
        boolean boolean9 = characterReader1.matchesIgnoreCase("i!");
        characterReader1.rewindToMark();
        boolean boolean11 = characterReader1.matchesDigit();
        java.lang.String str12 = characterReader1.consumeData();
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean16 = characterReader14.matches(' ');
        boolean boolean18 = characterReader14.matchesIgnoreCase("hi!");
        char[] charArray19 = new char[] {};
        boolean boolean20 = characterReader14.matchesAnySorted(charArray19);
        boolean boolean21 = characterReader14.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean25 = characterReader23.matches(' ');
        java.lang.String str27 = characterReader23.consumeTo('\uffff');
        java.lang.String str28 = characterReader23.consumeTagName();
        java.lang.String str29 = characterReader23.consumeLetterSequence();
        java.lang.String str30 = characterReader23.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str33 = characterReader32.toString();
        char[] charArray35 = new char[] { ' ' };
        boolean boolean39 = org.jsoup.parser.CharacterReader.rangeEquals(charArray35, 32768, (int) (byte) 10, "");
        boolean boolean40 = characterReader32.matchesAny(charArray35);
        char[] charArray41 = new char[] {};
        boolean boolean45 = org.jsoup.parser.CharacterReader.rangeEquals(charArray41, 0, 100, "!");
        boolean boolean49 = org.jsoup.parser.CharacterReader.rangeEquals(charArray41, (int) 'i', (int) (short) 100, "i!");
        boolean boolean50 = characterReader32.matchesAnySorted(charArray41);
        boolean boolean51 = characterReader23.matchesAny(charArray41);
        java.lang.String str52 = characterReader14.consumeToAnySorted(charArray41);
        boolean boolean53 = characterReader1.matchesAny(charArray41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matches(' ');
        java.lang.String str5 = characterReader1.consumeTo('\uffff');
        java.lang.String str6 = characterReader1.consumeTagName();
        java.lang.String str7 = characterReader1.consumeLetterSequence();
        char char8 = characterReader1.current();
        characterReader1.unconsume();
        boolean boolean11 = characterReader1.matches('h');
        characterReader1.rewindToMark();
        char char13 = characterReader1.consume();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + 'h' + "'", char13 == 'h');
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        int int3 = characterReader1.pos();
        int int4 = characterReader1.pos();
        boolean boolean6 = characterReader1.matches("");
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str9 = characterReader8.toString();
        int int10 = characterReader8.pos();
        char[] charArray11 = new char[] {};
        boolean boolean12 = characterReader8.matchesAny(charArray11);
        boolean boolean16 = org.jsoup.parser.CharacterReader.rangeEquals(charArray11, (int) (short) 0, (int) (byte) 100, "hi");
        boolean boolean17 = characterReader1.matchesAnySorted(charArray11);
        char char18 = characterReader1.consume();
        boolean boolean20 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean21 = characterReader1.matchesDigit();
        boolean boolean22 = characterReader1.matchesLetter();
        java.lang.String str23 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean25 = characterReader1.matches('\uffff');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + 'h' + "'", char18 == 'h');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "i" + "'", str23, "i");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matches(' ');
        java.lang.String str4 = characterReader1.toString();
        java.lang.String str5 = characterReader1.consumeLetterThenDigitSequence();
        characterReader1.unconsume();
        boolean boolean7 = characterReader1.matchesLetter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi" + "'", str5, "hi");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matches(' ');
        char char4 = characterReader1.consume();
        java.lang.String str5 = characterReader1.consumeLetterThenDigitSequence();
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("!");
        boolean boolean9 = characterReader1.matchConsume("h");
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean13 = characterReader11.matches(' ');
        boolean boolean17 = characterReader11.rangeEquals(10, 0, "");
        int int19 = characterReader11.nextIndexOf(' ');
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str22 = characterReader21.toString();
        java.lang.String str23 = characterReader21.toString();
        boolean boolean24 = characterReader21.isEmpty();
        java.lang.String str25 = characterReader21.toString();
        boolean boolean26 = characterReader21.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str29 = characterReader28.toString();
        boolean boolean31 = characterReader28.matches('\uffff');
        boolean boolean33 = characterReader28.matches("");
        boolean boolean35 = characterReader28.matchConsume("");
        java.lang.String str36 = characterReader28.consumeLetterSequence();
        char[] charArray37 = new char[] {};
        boolean boolean41 = org.jsoup.parser.CharacterReader.rangeEquals(charArray37, (int) (byte) -1, (int) (byte) 100, "hi!");
        java.lang.String str42 = characterReader28.consumeToAny(charArray37);
        boolean boolean43 = characterReader21.matchesAnySorted(charArray37);
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean47 = characterReader45.matches("hi!");
        java.lang.String str48 = characterReader45.consumeToEnd();
        java.lang.String str49 = characterReader45.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("hi!");
        int int52 = characterReader51.pos();
        char[] charArray54 = new char[] { '4' };
        java.lang.String str55 = characterReader51.consumeToAny(charArray54);
        boolean boolean56 = characterReader45.matchesAnySorted(charArray54);
        boolean boolean57 = characterReader21.matchesAnySorted(charArray54);
        boolean boolean61 = org.jsoup.parser.CharacterReader.rangeEquals(charArray54, (int) (byte) 1, (int) (byte) 1, "hi!");
        boolean boolean62 = characterReader11.matchesAnySorted(charArray54);
        java.lang.String str63 = characterReader1.consumeToAnySorted(charArray54);
        boolean boolean65 = characterReader1.matches('a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'h' + "'", char4 == 'h');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi" + "'", str36, "hi");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "!" + "'", str42, "!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matches("hi!");
        char[] charArray5 = new char[] { ' ' };
        boolean boolean9 = org.jsoup.parser.CharacterReader.rangeEquals(charArray5, 32768, (int) (byte) 10, "");
        java.lang.String str10 = characterReader1.consumeToAnySorted(charArray5);
        java.lang.String str11 = characterReader1.consumeTagName();
        characterReader1.mark();
        boolean boolean14 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str15 = characterReader1.consumeData();
        characterReader1.rewindToMark();
        int int18 = characterReader1.nextIndexOf((java.lang.CharSequence) "i!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi");
        java.lang.String str3 = characterReader1.consumeTo("h");
        java.lang.String str4 = characterReader1.consumeData();
        characterReader1.advance();
        java.lang.String str6 = characterReader1.consumeTagName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi" + "'", str4, "hi");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        int int3 = characterReader1.pos();
        java.lang.String str4 = characterReader1.consumeDigitSequence();
        java.lang.String str5 = characterReader1.consumeTagName();
        characterReader1.rewindToMark();
        java.lang.String str7 = characterReader1.toString();
        boolean boolean9 = characterReader1.matchesIgnoreCase("hi");
        int int10 = characterReader1.pos();
        java.lang.String str11 = characterReader1.toString();
        java.lang.String str12 = characterReader1.toString();
        java.lang.String str13 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        int int3 = characterReader1.pos();
        char[] charArray4 = new char[] {};
        boolean boolean5 = characterReader1.matchesAny(charArray4);
        int int7 = characterReader1.nextIndexOf((java.lang.CharSequence) "!");
        java.lang.String str8 = characterReader1.toString();
        java.lang.String str9 = characterReader1.consumeTagName();
        characterReader1.mark();
        int int11 = characterReader1.pos();
        boolean boolean12 = characterReader1.matchesLetter();
        boolean boolean16 = characterReader1.rangeEquals(2, (int) ' ', "i!");
        java.lang.Class<?> wildcardClass17 = characterReader1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matches("hi!");
        char[] charArray5 = new char[] { ' ' };
        boolean boolean9 = org.jsoup.parser.CharacterReader.rangeEquals(charArray5, 32768, (int) (byte) 10, "");
        java.lang.String str10 = characterReader1.consumeToAnySorted(charArray5);
        characterReader1.unconsume();
        int int13 = characterReader1.nextIndexOf('!');
        boolean boolean15 = characterReader1.matches('!');
        boolean boolean17 = characterReader1.matches("i!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matches(' ');
        java.lang.String str5 = characterReader1.consumeTo('\uffff');
        boolean boolean7 = characterReader1.matches('4');
        characterReader1.advance();
        boolean boolean10 = characterReader1.matchConsume("h");
        int int11 = characterReader1.pos();
        boolean boolean15 = characterReader1.rangeEquals((int) (byte) -1, (int) (byte) 100, "i!");
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str18 = characterReader17.toString();
        java.lang.String str19 = characterReader17.toString();
        boolean boolean20 = characterReader17.isEmpty();
        java.lang.String str21 = characterReader17.toString();
        java.lang.String str22 = characterReader17.consumeData();
        characterReader17.rewindToMark();
        char[] charArray27 = new char[] { '\uffff', ' ', 'h' };
        boolean boolean31 = org.jsoup.parser.CharacterReader.rangeEquals(charArray27, (int) (byte) -1, (int) (byte) 100, "i");
        java.lang.String str32 = characterReader17.consumeToAnySorted(charArray27);
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean36 = characterReader34.matches(' ');
        java.lang.String str38 = characterReader34.consumeTo('\uffff');
        boolean boolean40 = characterReader34.matches('4');
        characterReader34.advance();
        boolean boolean45 = characterReader34.rangeEquals((int) '4', (int) (short) 0, "");
        char char46 = characterReader34.current();
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean50 = characterReader48.matches(' ');
        java.lang.String str52 = characterReader48.consumeTo('\uffff');
        java.lang.String str53 = characterReader48.consumeTagName();
        boolean boolean55 = characterReader48.matchConsume("!");
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean59 = characterReader57.matches(' ');
        java.lang.String str61 = characterReader57.consumeTo('\uffff');
        java.lang.String str62 = characterReader57.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader64 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean66 = characterReader64.matches("hi!");
        java.lang.String str67 = characterReader64.consumeToEnd();
        java.lang.String str68 = characterReader64.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader70 = new org.jsoup.parser.CharacterReader("hi!");
        int int71 = characterReader70.pos();
        char[] charArray73 = new char[] { '4' };
        java.lang.String str74 = characterReader70.consumeToAny(charArray73);
        java.lang.String str75 = characterReader64.consumeToAnySorted(charArray73);
        boolean boolean76 = characterReader57.matchesAnySorted(charArray73);
        java.lang.String str77 = characterReader48.consumeToAnySorted(charArray73);
        java.lang.String str78 = characterReader34.consumeToAnySorted(charArray73);
        boolean boolean79 = characterReader17.matchesAny(charArray73);
        java.lang.String str80 = characterReader1.consumeToAny(charArray73);
        boolean boolean82 = characterReader1.containsIgnoreCase("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '\uffff', ' ', 'h' });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + char46 + "' != '" + '\uffff' + "'", char46 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertArrayEquals(charArray73, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("h");
        java.lang.String str3 = characterReader1.consumeTo('i');
        org.jsoup.parser.CharacterReader characterReader5 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean7 = characterReader5.matches("hi!");
        java.lang.String str8 = characterReader5.consumeToEnd();
        java.lang.String str9 = characterReader5.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("hi!");
        int int12 = characterReader11.pos();
        char[] charArray14 = new char[] { '4' };
        java.lang.String str15 = characterReader11.consumeToAny(charArray14);
        java.lang.String str16 = characterReader5.consumeToAnySorted(charArray14);
        java.lang.String str17 = characterReader1.consumeToAnySorted(charArray14);
        characterReader1.rewindToMark();
        boolean boolean22 = characterReader1.rangeEquals((int) '!', 3, "!");
        boolean boolean24 = characterReader1.matches("i");
        boolean boolean28 = characterReader1.rangeEquals((int) '#', (int) '!', "hi");
        char char29 = characterReader1.current();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + 'h' + "'", char29 == 'h');
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        int int3 = characterReader1.pos();
        java.lang.String str4 = characterReader1.consumeLetterSequence();
        boolean boolean6 = characterReader1.matches('h');
        java.lang.String str8 = characterReader1.consumeTo('\uffff');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi" + "'", str4, "hi");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!" + "'", str8, "!");
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        int int3 = characterReader1.pos();
        char[] charArray4 = new char[] {};
        boolean boolean5 = characterReader1.matchesAny(charArray4);
        int int7 = characterReader1.nextIndexOf((java.lang.CharSequence) "!");
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        characterReader1.unconsume();
        int int11 = characterReader1.nextIndexOf((java.lang.CharSequence) "!");
        boolean boolean12 = characterReader1.isEmpty();
        boolean boolean14 = characterReader1.containsIgnoreCase("hi");
        boolean boolean16 = characterReader1.matchConsume("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi" + "'", str8, "hi");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matches("hi!");
        java.lang.String str4 = characterReader1.consumeToEnd();
        java.lang.String str5 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("hi!");
        int int8 = characterReader7.pos();
        char[] charArray10 = new char[] { '4' };
        java.lang.String str11 = characterReader7.consumeToAny(charArray10);
        boolean boolean12 = characterReader1.matchesAnySorted(charArray10);
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str15 = characterReader14.toString();
        int int16 = characterReader14.pos();
        int int17 = characterReader14.pos();
        boolean boolean19 = characterReader14.matches("");
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str22 = characterReader21.toString();
        int int23 = characterReader21.pos();
        char[] charArray24 = new char[] {};
        boolean boolean25 = characterReader21.matchesAny(charArray24);
        boolean boolean29 = org.jsoup.parser.CharacterReader.rangeEquals(charArray24, (int) (short) 0, (int) (byte) 100, "hi");
        boolean boolean30 = characterReader14.matchesAnySorted(charArray24);
        boolean boolean31 = characterReader1.matchesAny(charArray24);
        characterReader1.advance();
        int int34 = characterReader1.nextIndexOf('\uffff');
        java.lang.String str36 = characterReader1.consumeTo("!");
        java.lang.String str37 = characterReader1.consumeData();
        char char38 = characterReader1.current();
        boolean boolean40 = characterReader1.matches("i");
        java.lang.String str41 = characterReader1.consumeData();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + '\uffff' + "'", char38 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.consumeToEnd();
        boolean boolean4 = characterReader1.matchConsume("i");
        boolean boolean6 = characterReader1.matches('#');
        characterReader1.advance();
        boolean boolean9 = characterReader1.matchConsumeIgnoreCase("i!");
        java.lang.String str10 = characterReader1.consumeData();
        java.lang.String str11 = characterReader1.consumeTagName();
        java.lang.String str12 = characterReader1.consumeToEnd();
        int int14 = characterReader1.nextIndexOf('#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean4 = characterReader1.isEmpty();
        java.lang.String str5 = characterReader1.toString();
        boolean boolean6 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str9 = characterReader8.toString();
        boolean boolean11 = characterReader8.matches('\uffff');
        boolean boolean13 = characterReader8.matches("");
        boolean boolean15 = characterReader8.matchConsume("");
        java.lang.String str16 = characterReader8.consumeLetterSequence();
        char[] charArray17 = new char[] {};
        boolean boolean21 = org.jsoup.parser.CharacterReader.rangeEquals(charArray17, (int) (byte) -1, (int) (byte) 100, "hi!");
        java.lang.String str22 = characterReader8.consumeToAny(charArray17);
        boolean boolean23 = characterReader1.matchesAnySorted(charArray17);
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean27 = characterReader25.matches("hi!");
        java.lang.String str28 = characterReader25.consumeToEnd();
        java.lang.String str29 = characterReader25.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("hi!");
        int int32 = characterReader31.pos();
        char[] charArray34 = new char[] { '4' };
        java.lang.String str35 = characterReader31.consumeToAny(charArray34);
        boolean boolean36 = characterReader25.matchesAnySorted(charArray34);
        boolean boolean37 = characterReader1.matchesAnySorted(charArray34);
        boolean boolean39 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean40 = characterReader1.isEmpty();
        characterReader1.mark();
        boolean boolean43 = characterReader1.matchConsume("i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi" + "'", str16, "hi");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "!" + "'", str22, "!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str5 = characterReader4.toString();
        char[] charArray7 = new char[] { ' ' };
        boolean boolean11 = org.jsoup.parser.CharacterReader.rangeEquals(charArray7, 32768, (int) (byte) 10, "");
        boolean boolean12 = characterReader4.matchesAny(charArray7);
        boolean boolean13 = characterReader1.matchesAnySorted(charArray7);
        boolean boolean14 = characterReader1.matchesDigit();
        int int16 = characterReader1.nextIndexOf('a');
        int int18 = characterReader1.nextIndexOf('h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matches(' ');
        java.lang.String str5 = characterReader1.consumeTo('\uffff');
        java.lang.String str6 = characterReader1.consumeTagName();
        java.lang.String str7 = characterReader1.consumeLetterSequence();
        java.lang.String str9 = characterReader1.consumeTo("hi!");
        characterReader1.unconsume();
        java.lang.String str11 = characterReader1.consumeTagName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!" + "'", str11, "!");
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int2 = characterReader1.pos();
        char[] charArray4 = new char[] { '4' };
        java.lang.String str5 = characterReader1.consumeToAny(charArray4);
        int int6 = characterReader1.pos();
        boolean boolean7 = characterReader1.isEmpty();
        boolean boolean8 = characterReader1.matchesLetter();
        boolean boolean10 = characterReader1.containsIgnoreCase("i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        boolean boolean4 = characterReader1.matches('\uffff');
        boolean boolean6 = characterReader1.matches("");
        java.lang.String str7 = characterReader1.consumeHexSequence();
        boolean boolean9 = characterReader1.containsIgnoreCase("h");
        characterReader1.mark();
        characterReader1.mark();
        boolean boolean13 = characterReader1.matches('\uffff');
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean17 = characterReader15.matches(' ');
        java.lang.String str18 = characterReader15.toString();
        boolean boolean19 = characterReader15.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray23 = new char[] { ' ' };
        boolean boolean27 = org.jsoup.parser.CharacterReader.rangeEquals(charArray23, 32768, (int) (byte) 10, "");
        java.lang.String str28 = characterReader21.consumeToAnySorted(charArray23);
        int int30 = characterReader21.nextIndexOf((java.lang.CharSequence) "i!");
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("");
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray36 = new char[] { ' ' };
        boolean boolean40 = org.jsoup.parser.CharacterReader.rangeEquals(charArray36, 32768, (int) (byte) 10, "");
        java.lang.String str41 = characterReader34.consumeToAnySorted(charArray36);
        boolean boolean42 = characterReader32.matchesAny(charArray36);
        java.lang.String str43 = characterReader21.consumeToAnySorted(charArray36);
        java.lang.String str44 = characterReader15.consumeToAnySorted(charArray36);
        java.lang.String str45 = characterReader1.consumeToAnySorted(charArray36);
        characterReader1.advance();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        char[] charArray3 = new char[] { ' ' };
        boolean boolean7 = org.jsoup.parser.CharacterReader.rangeEquals(charArray3, 32768, (int) (byte) 10, "");
        java.lang.String str8 = characterReader1.consumeToAnySorted(charArray3);
        java.lang.String str9 = characterReader1.toString();
        java.lang.String str10 = characterReader1.consumeHexSequence();
        boolean boolean12 = characterReader1.matchConsumeIgnoreCase("i!");
        char char13 = characterReader1.current();
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str16 = characterReader15.toString();
        int int17 = characterReader15.pos();
        int int18 = characterReader15.pos();
        int int20 = characterReader15.nextIndexOf((java.lang.CharSequence) "!");
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str25 = characterReader24.toString();
        int int26 = characterReader24.pos();
        char[] charArray27 = new char[] {};
        boolean boolean28 = characterReader24.matchesAny(charArray27);
        boolean boolean32 = org.jsoup.parser.CharacterReader.rangeEquals(charArray27, (int) (short) 0, (int) (byte) 100, "hi");
        java.lang.String str33 = characterReader22.consumeToAnySorted(charArray27);
        boolean boolean37 = org.jsoup.parser.CharacterReader.rangeEquals(charArray27, (int) '!', (int) (byte) 1, "hi");
        boolean boolean41 = org.jsoup.parser.CharacterReader.rangeEquals(charArray27, 2, (int) (short) 10, "");
        boolean boolean42 = characterReader15.matchesAny(charArray27);
        boolean boolean43 = characterReader1.matchesAny(charArray27);
        boolean boolean45 = characterReader1.containsIgnoreCase("h");
        boolean boolean47 = characterReader1.matchConsumeIgnoreCase("i");
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str50 = characterReader49.toString();
        int int51 = characterReader49.pos();
        int int52 = characterReader49.pos();
        boolean boolean53 = characterReader49.matchesDigit();
        char char54 = characterReader49.current();
        char[] charArray56 = new char[] { ' ' };
        boolean boolean60 = org.jsoup.parser.CharacterReader.rangeEquals(charArray56, 32768, (int) (byte) 10, "");
        boolean boolean64 = org.jsoup.parser.CharacterReader.rangeEquals(charArray56, (int) 'a', 1, "hi!");
        java.lang.String str65 = characterReader49.consumeToAny(charArray56);
        boolean boolean66 = characterReader1.matchesAny(charArray56);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + char54 + "' != '" + 'h' + "'", char54 == 'h');
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        java.lang.String str3 = characterReader1.toString();
        boolean boolean4 = characterReader1.isEmpty();
        char char5 = characterReader1.consume();
        int int7 = characterReader1.nextIndexOf(' ');
        boolean boolean8 = characterReader1.matchesDigit();
        boolean boolean10 = characterReader1.matches("i");
        boolean boolean12 = characterReader1.matches("hi");
        boolean boolean14 = characterReader1.matches("!");
        char char15 = characterReader1.current();
        boolean boolean17 = characterReader1.containsIgnoreCase("i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'h' + "'", char5 == 'h');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'i' + "'", char15 == 'i');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        int int3 = characterReader1.pos();
        int int4 = characterReader1.pos();
        boolean boolean6 = characterReader1.matches("");
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str9 = characterReader8.toString();
        int int10 = characterReader8.pos();
        char[] charArray11 = new char[] {};
        boolean boolean12 = characterReader8.matchesAny(charArray11);
        boolean boolean16 = org.jsoup.parser.CharacterReader.rangeEquals(charArray11, (int) (short) 0, (int) (byte) 100, "hi");
        boolean boolean17 = characterReader1.matchesAnySorted(charArray11);
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("hi!");
        int int20 = characterReader19.pos();
        char[] charArray22 = new char[] { '4' };
        java.lang.String str23 = characterReader19.consumeToAny(charArray22);
        java.lang.String str24 = characterReader1.consumeToAnySorted(charArray22);
        int int26 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        boolean boolean28 = characterReader1.matchesIgnoreCase("hi!");
        java.lang.String str30 = characterReader1.consumeTo('h');
        org.jsoup.parser.CharacterReader characterReader32 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str33 = characterReader32.toString();
        int int34 = characterReader32.pos();
        char[] charArray35 = new char[] {};
        boolean boolean36 = characterReader32.matchesAny(charArray35);
        java.lang.String str37 = characterReader1.consumeToAny(charArray35);
        java.lang.String str38 = characterReader1.toString();
        boolean boolean40 = characterReader1.matchConsume("hi");
        char char41 = characterReader1.consume();
        boolean boolean43 = characterReader1.matches('i');
        boolean boolean44 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader46 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str47 = characterReader46.toString();
        int int48 = characterReader46.pos();
        java.lang.String str49 = characterReader46.consumeDigitSequence();
        java.lang.String str50 = characterReader46.consumeLetterThenDigitSequence();
        characterReader46.unconsume();
        characterReader46.mark();
        org.jsoup.parser.CharacterReader characterReader54 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str55 = characterReader54.toString();
        boolean boolean57 = characterReader54.matches('\uffff');
        org.jsoup.parser.CharacterReader characterReader59 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader61 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str62 = characterReader61.toString();
        int int63 = characterReader61.pos();
        char[] charArray64 = new char[] {};
        boolean boolean65 = characterReader61.matchesAny(charArray64);
        boolean boolean69 = org.jsoup.parser.CharacterReader.rangeEquals(charArray64, (int) (short) 0, (int) (byte) 100, "hi");
        java.lang.String str70 = characterReader59.consumeToAnySorted(charArray64);
        boolean boolean74 = org.jsoup.parser.CharacterReader.rangeEquals(charArray64, (int) '!', (int) (byte) 1, "hi");
        java.lang.String str75 = characterReader54.consumeToAny(charArray64);
        boolean boolean76 = characterReader46.matchesAny(charArray64);
        boolean boolean77 = characterReader1.matchesAny(charArray64);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '\uffff' + "'", char41 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi" + "'", str50, "hi");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("i!");
        java.lang.String str2 = characterReader1.consumeData();
        int int4 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi");
        java.lang.String str5 = characterReader1.consumeDigitSequence();
        characterReader1.advance();
        java.lang.String str7 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!" + "'", str2, "i!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        java.lang.String str3 = characterReader1.consumeData();
        boolean boolean5 = characterReader1.matchesIgnoreCase("");
        boolean boolean7 = characterReader1.matchConsume("h");
        java.lang.String str8 = characterReader1.consumeDigitSequence();
        int int10 = characterReader1.nextIndexOf('i');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        int int3 = characterReader1.pos();
        int int4 = characterReader1.pos();
        int int6 = characterReader1.nextIndexOf((java.lang.CharSequence) "!");
        char char7 = characterReader1.current();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'h' + "'", char7 == 'h');
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean3 = characterReader1.matches(' ');
        java.lang.String str5 = characterReader1.consumeTo('\uffff');
        characterReader1.mark();
        java.lang.String str7 = characterReader1.consumeLetterSequence();
        boolean boolean8 = characterReader1.isEmpty();
        java.lang.String str9 = characterReader1.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("i!");
        java.lang.String str12 = characterReader11.consumeData();
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean16 = characterReader14.matches(' ');
        boolean boolean18 = characterReader14.matchesIgnoreCase("hi!");
        char[] charArray19 = new char[] {};
        boolean boolean20 = characterReader14.matchesAnySorted(charArray19);
        boolean boolean21 = characterReader14.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str24 = characterReader23.toString();
        int int25 = characterReader23.pos();
        int int26 = characterReader23.pos();
        boolean boolean28 = characterReader23.matches("");
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str31 = characterReader30.toString();
        int int32 = characterReader30.pos();
        char[] charArray33 = new char[] {};
        boolean boolean34 = characterReader30.matchesAny(charArray33);
        boolean boolean38 = org.jsoup.parser.CharacterReader.rangeEquals(charArray33, (int) (short) 0, (int) (byte) 100, "hi");
        boolean boolean39 = characterReader23.matchesAnySorted(charArray33);
        boolean boolean41 = characterReader23.matchConsumeIgnoreCase("i");
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str44 = characterReader43.toString();
        boolean boolean46 = characterReader43.matches('\uffff');
        boolean boolean48 = characterReader43.matches("");
        boolean boolean50 = characterReader43.matchConsume("");
        java.lang.String str51 = characterReader43.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader53 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str54 = characterReader53.toString();
        int int55 = characterReader53.pos();
        char[] charArray56 = new char[] {};
        boolean boolean57 = characterReader53.matchesAny(charArray56);
        boolean boolean61 = org.jsoup.parser.CharacterReader.rangeEquals(charArray56, (int) (short) 0, (int) (byte) 100, "hi");
        boolean boolean62 = characterReader43.matchesAny(charArray56);
        boolean boolean66 = org.jsoup.parser.CharacterReader.rangeEquals(charArray56, (int) (byte) 1, 32768, "hi");
        java.lang.String str67 = characterReader23.consumeToAny(charArray56);
        java.lang.String str68 = characterReader14.consumeToAny(charArray56);
        char[] charArray69 = new char[] {};
        boolean boolean73 = org.jsoup.parser.CharacterReader.rangeEquals(charArray69, 0, 100, "!");
        boolean boolean77 = org.jsoup.parser.CharacterReader.rangeEquals(charArray69, (int) 'i', (int) (short) 100, "i!");
        java.lang.String str78 = characterReader14.consumeToAnySorted(charArray69);
        java.lang.String str79 = characterReader11.consumeToAny(charArray69);
        boolean boolean80 = characterReader1.matchesAny(charArray69);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "i!" + "'", str12, "i!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi" + "'", str51, "hi");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CommentEndDash;
        org.jsoup.parser.Tokeniser tokeniser1 = null;
        org.jsoup.parser.CharacterReader characterReader3 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str4 = characterReader3.toString();
        java.lang.String str5 = characterReader3.toString();
        boolean boolean6 = characterReader3.isEmpty();
        java.lang.String str7 = characterReader3.toString();
        boolean boolean9 = characterReader3.matchesIgnoreCase("!");
        boolean boolean11 = characterReader3.matchConsumeIgnoreCase("");
        int int12 = characterReader3.pos();
        boolean boolean14 = characterReader3.matches('i');
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str17 = characterReader16.toString();
        boolean boolean19 = characterReader16.matches('\uffff');
        boolean boolean21 = characterReader16.matches("");
        java.lang.String str23 = characterReader16.consumeTo("!");
        char[] charArray26 = new char[] { 'h', '!' };
        boolean boolean30 = org.jsoup.parser.CharacterReader.rangeEquals(charArray26, (int) 'a', 0, "!");
        boolean boolean34 = org.jsoup.parser.CharacterReader.rangeEquals(charArray26, (int) (byte) 10, (int) (byte) -1, "!");
        boolean boolean35 = characterReader16.matchesAny(charArray26);
        boolean boolean36 = characterReader3.matchesAnySorted(charArray26);
        boolean boolean38 = characterReader3.matchesIgnoreCase("hi!");
        characterReader3.advance();
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str42 = characterReader41.toString();
        java.lang.String str43 = characterReader41.consumeData();
        java.lang.String str44 = characterReader41.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader46 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str47 = characterReader46.toString();
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str50 = characterReader49.toString();
        char[] charArray52 = new char[] { ' ' };
        boolean boolean56 = org.jsoup.parser.CharacterReader.rangeEquals(charArray52, 32768, (int) (byte) 10, "");
        boolean boolean57 = characterReader49.matchesAny(charArray52);
        boolean boolean58 = characterReader46.matchesAnySorted(charArray52);
        boolean boolean62 = org.jsoup.parser.CharacterReader.rangeEquals(charArray52, (int) (byte) 100, 0, "h");
        boolean boolean66 = org.jsoup.parser.CharacterReader.rangeEquals(charArray52, (int) (short) 0, 3, "hi!");
        boolean boolean67 = characterReader41.matchesAny(charArray52);
        boolean boolean71 = org.jsoup.parser.CharacterReader.rangeEquals(charArray52, 3, (int) (byte) -1, "!");
        java.lang.String str72 = characterReader3.consumeToAny(charArray52);
        int int74 = characterReader3.nextIndexOf((java.lang.CharSequence) "i");
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser1, characterReader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi" + "'", str23, "hi");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { 'h', '!' });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "i!" + "'", str72, "i!");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        char[] charArray4 = new char[] { ' ' };
        boolean boolean8 = org.jsoup.parser.CharacterReader.rangeEquals(charArray4, 32768, (int) (byte) 10, "");
        boolean boolean9 = characterReader1.matchesAny(charArray4);
        boolean boolean11 = characterReader1.matchesIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str14 = characterReader13.toString();
        int int15 = characterReader13.pos();
        char[] charArray16 = new char[] {};
        boolean boolean17 = characterReader13.matchesAny(charArray16);
        boolean boolean18 = characterReader1.matchesAny(charArray16);
        characterReader1.advance();
        java.lang.String str21 = characterReader1.consumeTo("!");
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("hi!");
        int int24 = characterReader23.pos();
        java.lang.String str25 = characterReader23.consumeLetterThenDigitSequence();
        java.lang.String str27 = characterReader23.consumeTo('#');
        char[] charArray29 = new char[] { ' ' };
        boolean boolean33 = org.jsoup.parser.CharacterReader.rangeEquals(charArray29, 32768, (int) (byte) 10, "");
        java.lang.String str34 = characterReader23.consumeToAny(charArray29);
        java.lang.String str35 = characterReader23.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str38 = characterReader37.toString();
        boolean boolean40 = characterReader37.matches('\uffff');
        boolean boolean42 = characterReader37.matches("");
        boolean boolean44 = characterReader37.matchConsume("");
        java.lang.String str45 = characterReader37.consumeLetterSequence();
        char[] charArray46 = new char[] {};
        boolean boolean50 = org.jsoup.parser.CharacterReader.rangeEquals(charArray46, (int) (byte) -1, (int) (byte) 100, "hi!");
        java.lang.String str51 = characterReader37.consumeToAny(charArray46);
        boolean boolean52 = characterReader23.matchesAnySorted(charArray46);
        char[] charArray53 = null;
        boolean boolean54 = characterReader23.matchesAny(charArray53);
        characterReader23.rewindToMark();
        int int57 = characterReader23.nextIndexOf(' ');
        char char58 = characterReader23.current();
        org.jsoup.parser.CharacterReader characterReader60 = new org.jsoup.parser.CharacterReader("h");
        java.lang.String str62 = characterReader60.consumeTo('i');
        boolean boolean63 = characterReader60.isEmpty();
        java.lang.String str65 = characterReader60.consumeTo("hi!");
        java.lang.String str66 = characterReader60.consumeTagName();
        org.jsoup.parser.CharacterReader characterReader68 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean70 = characterReader68.matches(' ');
        java.lang.String str72 = characterReader68.consumeTo('\uffff');
        boolean boolean74 = characterReader68.matches('4');
        characterReader68.advance();
        char[] charArray76 = new char[] {};
        boolean boolean80 = org.jsoup.parser.CharacterReader.rangeEquals(charArray76, 0, 100, "!");
        java.lang.String str81 = characterReader68.consumeToAny(charArray76);
        java.lang.String str82 = characterReader60.consumeToAny(charArray76);
        java.lang.String str83 = characterReader23.consumeToAnySorted(charArray76);
        java.lang.String str84 = characterReader1.consumeToAnySorted(charArray76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "i" + "'", str21, "i");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi" + "'", str25, "hi");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "!" + "'", str27, "!");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi" + "'", str45, "hi");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "!" + "'", str51, "!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + char58 + "' != '" + 'h' + "'", char58 == 'h');
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "h" + "'", str62, "h");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertArrayEquals(charArray76, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "!" + "'", str84, "!");
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        java.lang.String str2 = characterReader1.toString();
        char[] charArray4 = new char[] { ' ' };
        boolean boolean8 = org.jsoup.parser.CharacterReader.rangeEquals(charArray4, 32768, (int) (byte) 10, "");
        boolean boolean9 = characterReader1.matchesAny(charArray4);
        java.lang.String str10 = characterReader1.consumeHexSequence();
        java.lang.String str12 = characterReader1.consumeTo(' ');
        char[] charArray15 = new char[] { 'h', '!' };
        boolean boolean19 = org.jsoup.parser.CharacterReader.rangeEquals(charArray15, (int) 'a', 0, "!");
        java.lang.String str20 = characterReader1.consumeToAny(charArray15);
        java.lang.String str22 = characterReader1.consumeTo('#');
        boolean boolean24 = characterReader1.matchConsume("");
        int int26 = characterReader1.nextIndexOf((java.lang.CharSequence) "hi!");
        java.lang.String str27 = characterReader1.consumeDigitSequence();
        java.lang.String str28 = characterReader1.consumeData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'h', '!' });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        int int2 = characterReader1.pos();
        java.lang.String str3 = characterReader1.consumeLetterThenDigitSequence();
        java.lang.String str5 = characterReader1.consumeTo('#');
        char[] charArray7 = new char[] { ' ' };
        boolean boolean11 = org.jsoup.parser.CharacterReader.rangeEquals(charArray7, 32768, (int) (byte) 10, "");
        java.lang.String str12 = characterReader1.consumeToAny(charArray7);
        java.lang.String str13 = characterReader1.consumeLetterSequence();
        boolean boolean14 = characterReader1.matchesLetter();
        int int15 = characterReader1.pos();
        boolean boolean16 = characterReader1.isEmpty();
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean20 = characterReader18.matches("hi!");
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("hi!");
        int int23 = characterReader22.pos();
        java.lang.String str24 = characterReader22.consumeLetterThenDigitSequence();
        characterReader22.mark();
        java.lang.String str26 = characterReader22.consumeToEnd();
        char[] charArray30 = new char[] { '\uffff', ' ', 'h' };
        boolean boolean34 = org.jsoup.parser.CharacterReader.rangeEquals(charArray30, (int) (byte) -1, (int) (byte) 100, "i");
        boolean boolean35 = characterReader22.matchesAny(charArray30);
        java.lang.String str36 = characterReader18.consumeToAnySorted(charArray30);
        boolean boolean37 = characterReader1.matchesAny(charArray30);
        boolean boolean39 = characterReader1.matchesIgnoreCase("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!" + "'", str5, "!");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi" + "'", str24, "hi");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "!" + "'", str26, "!");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { '\uffff', ' ', 'h' });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }
}

