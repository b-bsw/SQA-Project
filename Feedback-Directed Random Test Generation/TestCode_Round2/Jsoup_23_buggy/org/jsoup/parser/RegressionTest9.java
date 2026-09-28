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
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype5 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        org.jsoup.parser.Token.Tag tag10 = tokeniser8.createTagPending(false);
        tokeniser2.tagPending = tag10;
        java.lang.StringBuilder stringBuilder12 = tokeniser2.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser2.getState();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        java.lang.StringBuilder stringBuilder17 = null;
        tokeniser16.dataBuffer = stringBuilder17;
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        tokeniser21.createTempBuffer();
        tokeniser21.createTempBuffer();
        java.lang.StringBuilder stringBuilder24 = tokeniser21.dataBuffer;
        tokeniser16.dataBuffer = stringBuilder24;
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser16.getState();
        tokeniser2.transition(tokeniserState26);
        org.jsoup.parser.Token.Tag tag28 = tokeniser2.tagPending;
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader30, parseErrorList31);
        org.jsoup.parser.TokeniserState tokeniserState33 = tokeniser32.getState();
        tokeniser32.createCommentPending();
        tokeniser32.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment36 = tokeniser32.commentPending;
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader37, parseErrorList38);
        org.jsoup.parser.TokeniserState tokeniserState40 = tokeniser39.getState();
        tokeniser39.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState42 = tokeniser39.getState();
        java.lang.StringBuilder stringBuilder43 = tokeniser39.dataBuffer;
        tokeniser39.emit('4');
        org.jsoup.parser.TokeniserState tokeniserState46 = tokeniser39.getState();
        tokeniser32.transition(tokeniserState46);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(stringBuilder12);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(comment36);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertNull(stringBuilder43);
        org.junit.Assert.assertNotNull(tokeniserState46);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype5 = tokeniser2.doctypePending;
        tokeniser2.emitTagPending();
        boolean boolean7 = tokeniser2.currentNodeInHtmlNS();
        boolean boolean8 = tokeniser2.currentNodeInHtmlNS();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment10 = tokeniser2.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser2.getState();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comment10);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.createCommentPending();
        tokeniser2.emit('\uffff');
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        java.lang.StringBuilder stringBuilder12 = null;
        tokeniser11.dataBuffer = stringBuilder12;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        tokeniser16.createTempBuffer();
        tokeniser16.createTempBuffer();
        java.lang.StringBuilder stringBuilder19 = tokeniser16.dataBuffer;
        tokeniser11.dataBuffer = stringBuilder19;
        tokeniser2.dataBuffer = stringBuilder19;
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader22, parseErrorList23);
        tokeniser24.createTempBuffer();
        tokeniser24.emit("");
        java.lang.StringBuilder stringBuilder28 = tokeniser24.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder28;
        org.jsoup.parser.Token.Tag tag31 = tokeniser2.createTagPending(false);
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState33 = tokeniser2.getState();
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(tokeniserState33);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList5);
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        characterReader8.unconsume();
        boolean boolean11 = characterReader8.matchConsume("");
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList12);
        org.jsoup.parser.Token.Tag tag15 = tokeniser13.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList17);
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser18.getState();
        tokeniser18.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser18.getState();
        java.lang.StringBuilder stringBuilder22 = tokeniser18.dataBuffer;
        tokeniser18.emit('4');
        org.jsoup.parser.TokeniserState tokeniserState25 = tokeniser18.getState();
        tokeniser13.advanceTransition(tokeniserState25);
        tokeniser6.advanceTransition(tokeniserState25);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNull(stringBuilder22);
        org.junit.Assert.assertNotNull(tokeniserState25);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        org.jsoup.parser.Token.Comment comment9 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype10 = null;
        tokeniser2.doctypePending = doctype10;
        org.jsoup.parser.Token.Tag tag13 = tokeniser2.createTagPending(true);
        tokeniser2.emit('\ufffd');
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser2.doctypePending;
        tokeniser2.createTempBuffer();
        org.junit.Assert.assertNull(comment9);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNull(doctype16);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean8 = characterReader1.matchConsume("");
        boolean boolean9 = characterReader1.matchesDigit();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList10);
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        tokeniser8.createTempBuffer();
        tokeniser8.emit("");
        java.lang.StringBuilder stringBuilder12 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder12;
        org.jsoup.parser.Token.Doctype doctype14 = tokeniser2.doctypePending;
        tokeniser2.acknowledgeSelfClosingFlag();
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNull(doctype14);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser9.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState11 = null;
        tokeniser9.transition(tokeniserState11);
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser15.getState();
        tokeniser9.transition(tokeniserState16);
        tokeniser9.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        java.lang.StringBuilder stringBuilder22 = null;
        tokeniser21.dataBuffer = stringBuilder22;
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList25);
        tokeniser26.createTempBuffer();
        tokeniser26.createTempBuffer();
        java.lang.StringBuilder stringBuilder29 = tokeniser26.dataBuffer;
        tokeniser21.dataBuffer = stringBuilder29;
        tokeniser9.dataBuffer = stringBuilder29;
        tokeniser2.dataBuffer = stringBuilder29;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader33, parseErrorList34);
        java.lang.StringBuilder stringBuilder36 = null;
        tokeniser35.dataBuffer = stringBuilder36;
        tokeniser35.acknowledgeSelfClosingFlag();
        tokeniser35.createCommentPending();
        tokeniser35.emit('\uffff');
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader42, parseErrorList43);
        java.lang.StringBuilder stringBuilder45 = null;
        tokeniser44.dataBuffer = stringBuilder45;
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.Tokeniser tokeniser49 = new org.jsoup.parser.Tokeniser(characterReader47, parseErrorList48);
        tokeniser49.createTempBuffer();
        tokeniser49.createTempBuffer();
        java.lang.StringBuilder stringBuilder52 = tokeniser49.dataBuffer;
        tokeniser44.dataBuffer = stringBuilder52;
        tokeniser35.dataBuffer = stringBuilder52;
        org.jsoup.parser.CharacterReader characterReader55 = null;
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.Tokeniser tokeniser57 = new org.jsoup.parser.Tokeniser(characterReader55, parseErrorList56);
        tokeniser57.createTempBuffer();
        tokeniser57.emit("");
        java.lang.StringBuilder stringBuilder61 = tokeniser57.dataBuffer;
        tokeniser35.dataBuffer = stringBuilder61;
        org.jsoup.parser.Token.Tag tag64 = tokeniser35.createTagPending(true);
        tokeniser2.tagPending = tag64;
        tokeniser2.emitTagPending();
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder61);
        org.junit.Assert.assertEquals(stringBuilder61.toString(), "");
        org.junit.Assert.assertNotNull(tag64);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        org.jsoup.parser.Token.Tag tag10 = tokeniser8.createTagPending(false);
        tokeniser2.tagPending = tag10;
        tokeniser2.emit('\ufffd');
        org.jsoup.parser.Token.Tag tag14 = tokeniser2.tagPending;
        tokeniser2.createDoctypePending();
        tokeniser2.emitDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.emit('\uffff');
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser10.getState();
        tokeniser10.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser10.getState();
        java.lang.StringBuilder stringBuilder14 = tokeniser10.dataBuffer;
        tokeniser10.emit('4');
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList18);
        java.lang.StringBuilder stringBuilder20 = null;
        tokeniser19.dataBuffer = stringBuilder20;
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader22, parseErrorList23);
        tokeniser24.createTempBuffer();
        tokeniser24.createTempBuffer();
        java.lang.StringBuilder stringBuilder27 = tokeniser24.dataBuffer;
        tokeniser19.dataBuffer = stringBuilder27;
        tokeniser10.dataBuffer = stringBuilder27;
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader30, parseErrorList31);
        java.lang.StringBuilder stringBuilder33 = null;
        tokeniser32.dataBuffer = stringBuilder33;
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader35, parseErrorList36);
        tokeniser37.createTempBuffer();
        tokeniser37.createTempBuffer();
        java.lang.StringBuilder stringBuilder40 = tokeniser37.dataBuffer;
        tokeniser32.dataBuffer = stringBuilder40;
        tokeniser10.dataBuffer = stringBuilder40;
        tokeniser2.dataBuffer = stringBuilder40;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder40);
        org.junit.Assert.assertEquals(stringBuilder40.toString(), "");
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        char char4 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchesLetter();
        characterReader1.mark();
        boolean boolean8 = characterReader1.matches('a');
        boolean boolean9 = characterReader1.isEmpty();
        boolean boolean11 = characterReader1.matchConsume("");
        boolean boolean13 = characterReader1.matchesIgnoreCase("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createDoctypePending();
        tokeniser2.createTempBuffer();
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matchesDigit();
        boolean boolean6 = characterReader1.isEmpty();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        char char9 = characterReader8.current();
        java.lang.String str10 = characterReader8.consumeHexSequence();
        boolean boolean11 = characterReader8.isEmpty();
        boolean boolean13 = characterReader8.matches('a');
        java.lang.String str14 = characterReader8.toString();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        char char17 = characterReader16.current();
        java.lang.String str19 = characterReader16.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList20);
        char[] charArray26 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str27 = characterReader16.consumeToAny(charArray26);
        java.lang.String str28 = characterReader8.consumeToAny(charArray26);
        java.lang.String str29 = characterReader1.consumeToAny(charArray26);
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("");
        char char32 = characterReader31.current();
        java.lang.String str33 = characterReader31.consumeHexSequence();
        java.lang.String str35 = characterReader31.consumeTo("hi!");
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("");
        char char38 = characterReader37.current();
        java.lang.String str39 = characterReader37.consumeHexSequence();
        boolean boolean40 = characterReader37.isEmpty();
        boolean boolean42 = characterReader37.matches('a');
        java.lang.String str43 = characterReader37.toString();
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        char char46 = characterReader45.current();
        java.lang.String str48 = characterReader45.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.Tokeniser tokeniser50 = new org.jsoup.parser.Tokeniser(characterReader45, parseErrorList49);
        char[] charArray55 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str56 = characterReader45.consumeToAny(charArray55);
        java.lang.String str57 = characterReader37.consumeToAny(charArray55);
        java.lang.String str58 = characterReader31.consumeToAny(charArray55);
        java.lang.String str59 = characterReader1.consumeToAny(charArray55);
        boolean boolean61 = characterReader1.matchesIgnoreCase("");
        boolean boolean63 = characterReader1.matchConsume("hi");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\uffff' + "'", char17 == '\uffff');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\uffff' + "'", char32 == '\uffff');
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + '\uffff' + "'", char38 == '\uffff');
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + char46 + "' != '" + '\uffff' + "'", char46 == '\uffff');
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser2.doctypePending = doctype6;
        tokeniser2.createTempBuffer();
        java.lang.StringBuilder stringBuilder9 = tokeniser2.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        org.jsoup.parser.Token.Tag tag14 = tokeniser12.createTagPending(false);
        tokeniser12.createTempBuffer();
        tokeniser12.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype17 = null;
        tokeniser12.doctypePending = doctype17;
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        org.jsoup.parser.Token.Doctype doctype22 = tokeniser21.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState23 = null;
        tokeniser21.transition(tokeniserState23);
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader25, parseErrorList26);
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser27.getState();
        tokeniser21.transition(tokeniserState28);
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader30, parseErrorList31);
        org.jsoup.parser.Token.Tag tag34 = tokeniser32.createTagPending(false);
        tokeniser32.createTempBuffer();
        tokeniser32.createDoctypePending();
        org.jsoup.parser.Token.Tag tag38 = tokeniser32.createTagPending(true);
        tokeniser21.emit((org.jsoup.parser.Token) tag38);
        tokeniser12.emit((org.jsoup.parser.Token) tag38);
        java.lang.StringBuilder stringBuilder41 = tokeniser12.dataBuffer;
        tokeniser12.createCommentPending();
        java.lang.String str43 = tokeniser12.appropriateEndTagName();
        org.jsoup.parser.Token.Doctype doctype44 = null;
        tokeniser12.doctypePending = doctype44;
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader46, parseErrorList47);
        java.lang.StringBuilder stringBuilder49 = null;
        tokeniser48.dataBuffer = stringBuilder49;
        tokeniser48.acknowledgeSelfClosingFlag();
        tokeniser48.createCommentPending();
        tokeniser48.emit('\uffff');
        org.jsoup.parser.CharacterReader characterReader55 = null;
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.Tokeniser tokeniser57 = new org.jsoup.parser.Tokeniser(characterReader55, parseErrorList56);
        java.lang.StringBuilder stringBuilder58 = null;
        tokeniser57.dataBuffer = stringBuilder58;
        org.jsoup.parser.CharacterReader characterReader60 = null;
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.Tokeniser tokeniser62 = new org.jsoup.parser.Tokeniser(characterReader60, parseErrorList61);
        tokeniser62.createTempBuffer();
        tokeniser62.createTempBuffer();
        java.lang.StringBuilder stringBuilder65 = tokeniser62.dataBuffer;
        tokeniser57.dataBuffer = stringBuilder65;
        tokeniser48.dataBuffer = stringBuilder65;
        tokeniser12.dataBuffer = stringBuilder65;
        tokeniser12.createDoctypePending();
        org.jsoup.parser.Token.Comment comment70 = tokeniser12.commentPending;
        org.jsoup.parser.CharacterReader characterReader71 = null;
        org.jsoup.parser.ParseErrorList parseErrorList72 = null;
        org.jsoup.parser.Tokeniser tokeniser73 = new org.jsoup.parser.Tokeniser(characterReader71, parseErrorList72);
        org.jsoup.parser.TokeniserState tokeniserState74 = tokeniser73.getState();
        tokeniser12.transition(tokeniserState74);
        tokeniser2.transition(tokeniserState74);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNull(doctype22);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(stringBuilder65);
        org.junit.Assert.assertEquals(stringBuilder65.toString(), "");
        org.junit.Assert.assertNotNull(comment70);
        org.junit.Assert.assertNotNull(tokeniserState74);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.toString();
        characterReader1.rewindToMark();
        boolean boolean10 = characterReader1.isEmpty();
        boolean boolean12 = characterReader1.matches('\uffff');
        java.lang.String str13 = characterReader1.consumeAsString();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList14);
        org.jsoup.parser.TokeniserState tokeniserState16 = null;
        tokeniser15.advanceTransition(tokeniserState16);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.isEmpty();
        characterReader1.advance();
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList6);
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.Token.Tag tag12 = tokeniser10.createTagPending(false);
        org.jsoup.parser.Token.Comment comment13 = tokeniser10.commentPending;
        tokeniser10.emit('\uffff');
        tokeniser10.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader18 = new org.jsoup.parser.CharacterReader("");
        char char19 = characterReader18.current();
        java.lang.String str21 = characterReader18.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList22);
        java.lang.StringBuilder stringBuilder24 = null;
        tokeniser23.dataBuffer = stringBuilder24;
        org.jsoup.parser.Token.Tag tag27 = tokeniser23.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser23.getState();
        tokeniser10.transition(tokeniserState28);
        tokeniser7.advanceTransition(tokeniserState28);
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader31, parseErrorList32);
        org.jsoup.parser.Token.Tag tag35 = tokeniser33.createTagPending(false);
        org.jsoup.parser.Token.Comment comment36 = tokeniser33.commentPending;
        tokeniser33.emit('\uffff');
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader39, parseErrorList40);
        tokeniser41.createTempBuffer();
        tokeniser41.createTempBuffer();
        java.lang.StringBuilder stringBuilder44 = tokeniser41.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader45, parseErrorList46);
        org.jsoup.parser.Token.Tag tag49 = tokeniser47.createTagPending(false);
        tokeniser41.tagPending = tag49;
        tokeniser41.emit('\ufffd');
        org.jsoup.parser.Token.Tag tag53 = tokeniser41.tagPending;
        tokeniser33.tagPending = tag53;
        tokeniser33.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader56 = null;
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.Tokeniser tokeniser58 = new org.jsoup.parser.Tokeniser(characterReader56, parseErrorList57);
        org.jsoup.parser.TokeniserState tokeniserState59 = tokeniser58.getState();
        tokeniser58.createCommentPending();
        boolean boolean61 = tokeniser58.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState62 = tokeniser58.getState();
        tokeniser33.transition(tokeniserState62);
        tokeniser7.transition(tokeniserState62);
        org.jsoup.parser.TokeniserState tokeniserState65 = tokeniser7.getState();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(comment13);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\uffff' + "'", char19 == '\uffff');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNull(comment36);
        org.junit.Assert.assertNotNull(stringBuilder44);
        org.junit.Assert.assertEquals(stringBuilder44.toString(), "");
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(tokeniserState59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(tokeniserState62);
        org.junit.Assert.assertNotNull(tokeniserState65);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean7 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        char char10 = characterReader9.current();
        java.lang.String str11 = characterReader9.consumeHexSequence();
        boolean boolean12 = characterReader9.isEmpty();
        boolean boolean14 = characterReader9.matches('a');
        java.lang.String str15 = characterReader9.toString();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        char char18 = characterReader17.current();
        java.lang.String str20 = characterReader17.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList21);
        char[] charArray27 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str28 = characterReader17.consumeToAny(charArray27);
        java.lang.String str29 = characterReader9.consumeToAny(charArray27);
        java.lang.String str30 = characterReader1.consumeToAny(charArray27);
        characterReader1.rewindToMark();
        boolean boolean33 = characterReader1.containsIgnoreCase("");
        boolean boolean34 = characterReader1.isEmpty();
        boolean boolean36 = characterReader1.matchesIgnoreCase("hi!");
        java.lang.String str37 = characterReader1.consumeHexSequence();
        boolean boolean38 = characterReader1.isEmpty();
        boolean boolean40 = characterReader1.matches("");
        characterReader1.advance();
        boolean boolean43 = characterReader1.matchesIgnoreCase("i!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\uffff' + "'", char18 == '\uffff');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        boolean boolean4 = characterReader1.matchesLetter();
        boolean boolean6 = characterReader1.matchConsumeIgnoreCase("");
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList7);
        java.lang.String str9 = characterReader1.toString();
        boolean boolean11 = characterReader1.matchesIgnoreCase("hi");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str5 = characterReader1.consumeLetterSequence();
        boolean boolean7 = characterReader1.containsIgnoreCase("");
        boolean boolean8 = characterReader1.isEmpty();
        boolean boolean9 = characterReader1.matchesDigit();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList10);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        java.lang.String str5 = characterReader1.consumeTo("hi!");
        boolean boolean6 = characterReader1.matchesDigit();
        boolean boolean7 = characterReader1.matchesDigit();
        char char8 = characterReader1.consume();
        boolean boolean10 = characterReader1.containsIgnoreCase("i!");
        boolean boolean11 = characterReader1.matchesLetter();
        char char12 = characterReader1.current();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        org.jsoup.parser.Token.Comment comment8 = null;
        tokeniser2.commentPending = comment8;
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList12);
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser13.dataBuffer = stringBuilder14;
        tokeniser13.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList18);
        tokeniser19.createTempBuffer();
        tokeniser19.createTempBuffer();
        org.jsoup.parser.Token.Comment comment22 = tokeniser19.commentPending;
        java.lang.StringBuilder stringBuilder23 = null;
        tokeniser19.dataBuffer = stringBuilder23;
        org.jsoup.parser.Token.Comment comment25 = null;
        tokeniser19.commentPending = comment25;
        tokeniser19.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader28, parseErrorList29);
        org.jsoup.parser.Token.Tag tag32 = tokeniser30.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype33 = tokeniser30.doctypePending;
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader34, parseErrorList35);
        org.jsoup.parser.Token.Tag tag38 = tokeniser36.createTagPending(false);
        tokeniser30.tagPending = tag38;
        tokeniser19.emit((org.jsoup.parser.Token) tag38);
        tokeniser13.emit((org.jsoup.parser.Token) tag38);
        tokeniser2.emit((org.jsoup.parser.Token) tag38);
        tokeniser2.createTempBuffer();
        tokeniser2.acknowledgeSelfClosingFlag();
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(comment22);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNull(doctype33);
        org.junit.Assert.assertNotNull(tag38);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean6 = characterReader1.matches('a');
        java.lang.String str7 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        char char10 = characterReader9.current();
        java.lang.String str12 = characterReader9.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList13);
        char[] charArray19 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str20 = characterReader9.consumeToAny(charArray19);
        java.lang.String str21 = characterReader1.consumeToAny(charArray19);
        boolean boolean22 = characterReader1.isEmpty();
        java.lang.String str24 = characterReader1.consumeTo("hi!");
        boolean boolean26 = characterReader1.matchConsume("hi!");
        char char27 = characterReader1.current();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\uffff' + "'", char27 == '\uffff');
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser11.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState13 = null;
        tokeniser11.transition(tokeniserState13);
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader15, parseErrorList16);
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser17.getState();
        tokeniser11.transition(tokeniserState18);
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        org.jsoup.parser.Token.Tag tag24 = tokeniser22.createTagPending(false);
        tokeniser22.createTempBuffer();
        tokeniser22.createDoctypePending();
        org.jsoup.parser.Token.Tag tag28 = tokeniser22.createTagPending(true);
        tokeniser11.emit((org.jsoup.parser.Token) tag28);
        tokeniser2.emit((org.jsoup.parser.Token) tag28);
        java.lang.StringBuilder stringBuilder31 = tokeniser2.dataBuffer;
        tokeniser2.createCommentPending();
        java.lang.String str33 = tokeniser2.appropriateEndTagName();
        org.jsoup.parser.Token.Doctype doctype34 = null;
        tokeniser2.doctypePending = doctype34;
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader36, parseErrorList37);
        java.lang.StringBuilder stringBuilder39 = null;
        tokeniser38.dataBuffer = stringBuilder39;
        tokeniser38.acknowledgeSelfClosingFlag();
        tokeniser38.createCommentPending();
        tokeniser38.emit('\uffff');
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader45, parseErrorList46);
        java.lang.StringBuilder stringBuilder48 = null;
        tokeniser47.dataBuffer = stringBuilder48;
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader50, parseErrorList51);
        tokeniser52.createTempBuffer();
        tokeniser52.createTempBuffer();
        java.lang.StringBuilder stringBuilder55 = tokeniser52.dataBuffer;
        tokeniser47.dataBuffer = stringBuilder55;
        tokeniser38.dataBuffer = stringBuilder55;
        tokeniser2.dataBuffer = stringBuilder55;
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Comment comment60 = tokeniser2.commentPending;
        org.jsoup.parser.CharacterReader characterReader61 = null;
        org.jsoup.parser.ParseErrorList parseErrorList62 = null;
        org.jsoup.parser.Tokeniser tokeniser63 = new org.jsoup.parser.Tokeniser(characterReader61, parseErrorList62);
        org.jsoup.parser.TokeniserState tokeniserState64 = tokeniser63.getState();
        tokeniser2.transition(tokeniserState64);
        java.lang.Class<?> wildcardClass66 = tokeniserState64.getClass();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(stringBuilder55);
        org.junit.Assert.assertEquals(stringBuilder55.toString(), "");
        org.junit.Assert.assertNotNull(comment60);
        org.junit.Assert.assertNotNull(tokeniserState64);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        char char4 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchesLetter();
        characterReader1.mark();
        boolean boolean8 = characterReader1.matches('#');
        characterReader1.rewindToMark();
        characterReader1.mark();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean6 = characterReader1.matches('a');
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        java.lang.StringBuilder stringBuilder10 = tokeniser8.dataBuffer;
        org.jsoup.parser.Token.Comment comment11 = tokeniser8.commentPending;
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(stringBuilder9);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertNull(comment11);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean7 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        char char10 = characterReader9.current();
        java.lang.String str11 = characterReader9.consumeHexSequence();
        boolean boolean12 = characterReader9.isEmpty();
        boolean boolean14 = characterReader9.matches('a');
        java.lang.String str15 = characterReader9.toString();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        char char18 = characterReader17.current();
        java.lang.String str20 = characterReader17.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList21);
        char[] charArray27 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str28 = characterReader17.consumeToAny(charArray27);
        java.lang.String str29 = characterReader9.consumeToAny(charArray27);
        java.lang.String str30 = characterReader1.consumeToAny(charArray27);
        characterReader1.rewindToMark();
        boolean boolean33 = characterReader1.containsIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader35 = new org.jsoup.parser.CharacterReader("");
        char char36 = characterReader35.current();
        java.lang.String str37 = characterReader35.consumeHexSequence();
        java.lang.String str39 = characterReader35.consumeTo("hi!");
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("");
        char char42 = characterReader41.current();
        java.lang.String str44 = characterReader41.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader41, parseErrorList45);
        char[] charArray51 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str52 = characterReader41.consumeToAny(charArray51);
        boolean boolean53 = characterReader35.matchesAny(charArray51);
        java.lang.String str55 = characterReader35.consumeTo(' ');
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("");
        char char58 = characterReader57.current();
        java.lang.String str59 = characterReader57.consumeHexSequence();
        boolean boolean60 = characterReader57.isEmpty();
        boolean boolean62 = characterReader57.matches('a');
        java.lang.String str63 = characterReader57.toString();
        org.jsoup.parser.CharacterReader characterReader65 = new org.jsoup.parser.CharacterReader("");
        char char66 = characterReader65.current();
        java.lang.String str68 = characterReader65.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        org.jsoup.parser.Tokeniser tokeniser70 = new org.jsoup.parser.Tokeniser(characterReader65, parseErrorList69);
        char[] charArray75 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str76 = characterReader65.consumeToAny(charArray75);
        java.lang.String str77 = characterReader57.consumeToAny(charArray75);
        boolean boolean78 = characterReader35.matchesAny(charArray75);
        java.lang.String str79 = characterReader1.consumeToAny(charArray75);
        boolean boolean81 = characterReader1.matches(' ');
        char char82 = characterReader1.current();
        characterReader1.advance();
        boolean boolean85 = characterReader1.matches("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str86 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\uffff' + "'", char18 == '\uffff');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + '\uffff' + "'", char36 == '\uffff');
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + '\uffff' + "'", char42 == '\uffff');
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + char58 + "' != '" + '\uffff' + "'", char58 == '\uffff');
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + char66 + "' != '" + '\uffff' + "'", char66 == '\uffff');
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + char82 + "' != '" + '\uffff' + "'", char82 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser2.doctypePending = doctype6;
        boolean boolean8 = tokeniser2.currentNodeInHtmlNS();
        tokeniser2.emit('a');
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        char char13 = characterReader12.current();
        java.lang.String str15 = characterReader12.consumeTo('#');
        java.lang.String str17 = characterReader12.consumeTo("");
        java.lang.String str19 = characterReader12.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList20);
        org.jsoup.parser.Token.Tag tag23 = tokeniser21.createTagPending(false);
        boolean boolean24 = tokeniser21.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag25 = tokeniser21.tagPending;
        tokeniser2.tagPending = tag25;
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        char char29 = characterReader28.current();
        java.lang.String str31 = characterReader28.consumeTo('#');
        java.lang.String str33 = characterReader28.consumeTo("");
        int int34 = characterReader28.pos();
        java.lang.String str35 = characterReader28.toString();
        characterReader28.rewindToMark();
        boolean boolean38 = characterReader28.matches("");
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader28, parseErrorList39);
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader41, parseErrorList42);
        java.lang.StringBuilder stringBuilder44 = null;
        tokeniser43.dataBuffer = stringBuilder44;
        tokeniser43.createCommentPending();
        org.jsoup.parser.Token.Comment comment47 = tokeniser43.commentPending;
        org.jsoup.parser.CharacterReader characterReader48 = null;
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.Tokeniser tokeniser50 = new org.jsoup.parser.Tokeniser(characterReader48, parseErrorList49);
        org.jsoup.parser.Token.Tag tag52 = tokeniser50.createTagPending(false);
        tokeniser50.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader54 = null;
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.Tokeniser tokeniser56 = new org.jsoup.parser.Tokeniser(characterReader54, parseErrorList55);
        org.jsoup.parser.Token.Tag tag58 = tokeniser56.createTagPending(false);
        tokeniser56.createTempBuffer();
        tokeniser56.createDoctypePending();
        org.jsoup.parser.Token.Tag tag62 = tokeniser56.createTagPending(true);
        tokeniser50.emit((org.jsoup.parser.Token) tag62);
        tokeniser43.emit((org.jsoup.parser.Token) tag62);
        org.jsoup.parser.TokeniserState tokeniserState65 = tokeniser43.getState();
        tokeniser43.createDoctypePending();
        tokeniser43.emit("i!");
        org.jsoup.parser.Token.Comment comment69 = tokeniser43.commentPending;
        tokeniser40.commentPending = comment69;
        tokeniser2.emit((org.jsoup.parser.Token) comment69);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\uffff' + "'", char29 == '\uffff');
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(comment47);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNotNull(tokeniserState65);
        org.junit.Assert.assertNotNull(comment69);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean7 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        char char10 = characterReader9.current();
        java.lang.String str11 = characterReader9.consumeHexSequence();
        boolean boolean12 = characterReader9.isEmpty();
        boolean boolean14 = characterReader9.matches('a');
        java.lang.String str15 = characterReader9.toString();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        char char18 = characterReader17.current();
        java.lang.String str20 = characterReader17.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList21);
        char[] charArray27 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str28 = characterReader17.consumeToAny(charArray27);
        java.lang.String str29 = characterReader9.consumeToAny(charArray27);
        java.lang.String str30 = characterReader1.consumeToAny(charArray27);
        characterReader1.rewindToMark();
        boolean boolean33 = characterReader1.containsIgnoreCase("");
        boolean boolean34 = characterReader1.isEmpty();
        boolean boolean36 = characterReader1.matchesIgnoreCase("hi!");
        java.lang.String str37 = characterReader1.consumeHexSequence();
        char char38 = characterReader1.consume();
        characterReader1.advance();
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("");
        char char42 = characterReader41.current();
        java.lang.String str44 = characterReader41.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader41, parseErrorList45);
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.Tokeniser tokeniser50 = new org.jsoup.parser.Tokeniser(characterReader48, parseErrorList49);
        org.jsoup.parser.CharacterReader characterReader52 = new org.jsoup.parser.CharacterReader("hi!");
        org.jsoup.parser.CharacterReader characterReader54 = new org.jsoup.parser.CharacterReader("");
        char char55 = characterReader54.current();
        java.lang.String str57 = characterReader54.consumeTo('#');
        java.lang.String str59 = characterReader54.consumeTo("");
        int int60 = characterReader54.pos();
        java.lang.String str61 = characterReader54.consumeLetterSequence();
        int int62 = characterReader54.pos();
        org.jsoup.parser.CharacterReader characterReader64 = new org.jsoup.parser.CharacterReader("");
        boolean boolean66 = characterReader64.matches(' ');
        characterReader64.advance();
        characterReader64.unconsume();
        characterReader64.rewindToMark();
        boolean boolean70 = characterReader64.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader72 = new org.jsoup.parser.CharacterReader("");
        char char73 = characterReader72.current();
        java.lang.String str74 = characterReader72.consumeHexSequence();
        boolean boolean75 = characterReader72.isEmpty();
        boolean boolean77 = characterReader72.matches('a');
        java.lang.String str78 = characterReader72.toString();
        org.jsoup.parser.CharacterReader characterReader80 = new org.jsoup.parser.CharacterReader("");
        char char81 = characterReader80.current();
        java.lang.String str83 = characterReader80.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList84 = null;
        org.jsoup.parser.Tokeniser tokeniser85 = new org.jsoup.parser.Tokeniser(characterReader80, parseErrorList84);
        char[] charArray90 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str91 = characterReader80.consumeToAny(charArray90);
        java.lang.String str92 = characterReader72.consumeToAny(charArray90);
        java.lang.String str93 = characterReader64.consumeToAny(charArray90);
        java.lang.String str94 = characterReader54.consumeToAny(charArray90);
        boolean boolean95 = characterReader52.matchesAny(charArray90);
        boolean boolean96 = characterReader48.matchesAny(charArray90);
        java.lang.String str97 = characterReader41.consumeToAny(charArray90);
        boolean boolean98 = characterReader1.matchesAny(charArray90);
        java.lang.Class<?> wildcardClass99 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\uffff' + "'", char18 == '\uffff');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + '\uffff' + "'", char38 == '\uffff');
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + '\uffff' + "'", char42 == '\uffff');
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + char55 + "' != '" + '\uffff' + "'", char55 == '\uffff');
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + char73 + "' != '" + '\uffff' + "'", char73 == '\uffff');
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + char81 + "' != '" + '\uffff' + "'", char81 == '\uffff');
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(charArray90);
        org.junit.Assert.assertArrayEquals(charArray90, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser9.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState11 = null;
        tokeniser9.transition(tokeniserState11);
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser15.getState();
        tokeniser9.transition(tokeniserState16);
        tokeniser9.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        java.lang.StringBuilder stringBuilder22 = null;
        tokeniser21.dataBuffer = stringBuilder22;
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList25);
        tokeniser26.createTempBuffer();
        tokeniser26.createTempBuffer();
        java.lang.StringBuilder stringBuilder29 = tokeniser26.dataBuffer;
        tokeniser21.dataBuffer = stringBuilder29;
        tokeniser9.dataBuffer = stringBuilder29;
        tokeniser9.createCommentPending();
        tokeniser9.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader34, parseErrorList35);
        tokeniser36.createTempBuffer();
        tokeniser36.createTempBuffer();
        tokeniser36.createTempBuffer();
        tokeniser36.createDoctypePending();
        tokeniser36.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype42 = tokeniser36.doctypePending;
        tokeniser9.doctypePending = doctype42;
        tokeniser2.doctypePending = doctype42;
        java.lang.Class<?> wildcardClass45 = doctype42.getClass();
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertNotNull(doctype42);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        boolean boolean6 = characterReader1.matches("hi!");
        characterReader1.mark();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser2.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = null;
        tokeniser2.transition(tokeniserState4);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser8.getState();
        tokeniser2.transition(tokeniserState9);
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        java.lang.StringBuilder stringBuilder15 = null;
        tokeniser14.dataBuffer = stringBuilder15;
        tokeniser14.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser14.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser14.getState();
        tokeniser2.transition(tokeniserState19);
        boolean boolean21 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader22, parseErrorList23);
        org.jsoup.parser.Token.Tag tag26 = tokeniser24.createTagPending(false);
        tokeniser24.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader28, parseErrorList29);
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser30.getState();
        tokeniser30.createCommentPending();
        boolean boolean33 = tokeniser30.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag35 = tokeniser30.createTagPending(true);
        tokeniser30.emit("");
        tokeniser30.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment39 = tokeniser30.commentPending;
        tokeniser24.commentPending = comment39;
        org.jsoup.parser.Token.Tag tag42 = tokeniser24.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader44 = new org.jsoup.parser.CharacterReader("");
        char char45 = characterReader44.current();
        java.lang.String str46 = characterReader44.consumeLetterSequence();
        boolean boolean47 = characterReader44.matchesLetter();
        characterReader44.rewindToMark();
        boolean boolean49 = characterReader44.matchesLetter();
        characterReader44.mark();
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader44, parseErrorList51);
        org.jsoup.parser.CharacterReader characterReader54 = new org.jsoup.parser.CharacterReader("");
        boolean boolean56 = characterReader54.matches(' ');
        characterReader54.advance();
        characterReader54.unconsume();
        characterReader54.rewindToMark();
        boolean boolean61 = characterReader54.matchConsume("");
        org.jsoup.parser.ParseErrorList parseErrorList62 = null;
        org.jsoup.parser.Tokeniser tokeniser63 = new org.jsoup.parser.Tokeniser(characterReader54, parseErrorList62);
        org.jsoup.parser.CharacterReader characterReader64 = null;
        org.jsoup.parser.ParseErrorList parseErrorList65 = null;
        org.jsoup.parser.Tokeniser tokeniser66 = new org.jsoup.parser.Tokeniser(characterReader64, parseErrorList65);
        org.jsoup.parser.Token.Tag tag68 = tokeniser66.createTagPending(false);
        org.jsoup.parser.Token.Comment comment69 = tokeniser66.commentPending;
        org.jsoup.parser.Token.Doctype doctype70 = null;
        tokeniser66.doctypePending = doctype70;
        tokeniser66.createTempBuffer();
        java.lang.StringBuilder stringBuilder73 = tokeniser66.dataBuffer;
        boolean boolean74 = tokeniser66.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState75 = tokeniser66.getState();
        tokeniser63.advanceTransition(tokeniserState75);
        tokeniser63.emit(' ');
        org.jsoup.parser.CharacterReader characterReader79 = null;
        org.jsoup.parser.ParseErrorList parseErrorList80 = null;
        org.jsoup.parser.Tokeniser tokeniser81 = new org.jsoup.parser.Tokeniser(characterReader79, parseErrorList80);
        org.jsoup.parser.TokeniserState tokeniserState82 = tokeniser81.getState();
        tokeniser81.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState84 = tokeniser81.getState();
        tokeniser81.emit('\uffff');
        org.jsoup.parser.Token.Comment comment87 = tokeniser81.commentPending;
        tokeniser63.emit((org.jsoup.parser.Token) comment87);
        tokeniser52.commentPending = comment87;
        tokeniser24.commentPending = comment87;
        tokeniser2.commentPending = comment87;
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNull(doctype11);
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(comment39);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + char45 + "' != '" + '\uffff' + "'", char45 == '\uffff');
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(tag68);
        org.junit.Assert.assertNull(comment69);
        org.junit.Assert.assertNotNull(stringBuilder73);
        org.junit.Assert.assertEquals(stringBuilder73.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(tokeniserState75);
        org.junit.Assert.assertNotNull(tokeniserState82);
        org.junit.Assert.assertNotNull(tokeniserState84);
        org.junit.Assert.assertNotNull(comment87);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        java.lang.String str5 = characterReader1.consumeTo("hi!");
        boolean boolean6 = characterReader1.matchesDigit();
        int int7 = characterReader1.pos();
        int int8 = characterReader1.pos();
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        characterReader1.mark();
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList9);
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser10.getState();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        char char4 = characterReader1.consume();
        characterReader1.unconsume();
        java.lang.String str6 = characterReader1.consumeAsString();
        char char7 = characterReader1.consume();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList8);
        char char10 = characterReader1.consume();
        char char11 = characterReader1.current();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        java.lang.String str9 = characterReader1.consumeToEnd();
        boolean boolean10 = characterReader1.matchesLetter();
        characterReader1.rewindToMark();
        char char12 = characterReader1.current();
        boolean boolean14 = characterReader1.matchConsume("hi!");
        int int15 = characterReader1.pos();
        characterReader1.mark();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        boolean boolean5 = characterReader1.matches('\uffff');
        char char6 = characterReader1.current();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        java.lang.String str9 = characterReader1.consumeAsString();
        boolean boolean11 = characterReader1.matches('#');
        boolean boolean13 = characterReader1.matchConsume("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        org.jsoup.parser.Token.Doctype doctype8 = null;
        tokeniser2.doctypePending = doctype8;
        tokeniser2.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList12);
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser13.getState();
        tokeniser13.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser13.getState();
        java.lang.StringBuilder stringBuilder17 = tokeniser13.dataBuffer;
        org.jsoup.parser.Token.Tag tag18 = tokeniser13.tagPending;
        org.jsoup.parser.Token.Comment comment19 = tokeniser13.commentPending;
        tokeniser2.commentPending = comment19;
        java.lang.StringBuilder stringBuilder21 = tokeniser2.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        char char24 = characterReader23.current();
        java.lang.String str25 = characterReader23.consumeLetterSequence();
        java.lang.String str27 = characterReader23.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader23, parseErrorList28);
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader30, parseErrorList31);
        org.jsoup.parser.TokeniserState tokeniserState33 = tokeniser32.getState();
        tokeniser32.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState35 = tokeniser32.getState();
        tokeniser29.advanceTransition(tokeniserState35);
        org.jsoup.parser.Token token37 = tokeniser29.read();
        tokeniser29.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader39, parseErrorList40);
        tokeniser41.createTempBuffer();
        tokeniser41.createTempBuffer();
        java.lang.StringBuilder stringBuilder44 = tokeniser41.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader45, parseErrorList46);
        org.jsoup.parser.Token.Tag tag49 = tokeniser47.createTagPending(false);
        tokeniser41.tagPending = tag49;
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.Tokeniser tokeniser53 = new org.jsoup.parser.Tokeniser(characterReader51, parseErrorList52);
        org.jsoup.parser.Token.Doctype doctype54 = tokeniser53.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState55 = null;
        tokeniser53.transition(tokeniserState55);
        org.jsoup.parser.CharacterReader characterReader57 = null;
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.parser.Tokeniser tokeniser59 = new org.jsoup.parser.Tokeniser(characterReader57, parseErrorList58);
        org.jsoup.parser.TokeniserState tokeniserState60 = tokeniser59.getState();
        tokeniser53.transition(tokeniserState60);
        tokeniser53.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader63 = null;
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        org.jsoup.parser.Tokeniser tokeniser65 = new org.jsoup.parser.Tokeniser(characterReader63, parseErrorList64);
        java.lang.StringBuilder stringBuilder66 = null;
        tokeniser65.dataBuffer = stringBuilder66;
        org.jsoup.parser.CharacterReader characterReader68 = null;
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        org.jsoup.parser.Tokeniser tokeniser70 = new org.jsoup.parser.Tokeniser(characterReader68, parseErrorList69);
        tokeniser70.createTempBuffer();
        tokeniser70.createTempBuffer();
        java.lang.StringBuilder stringBuilder73 = tokeniser70.dataBuffer;
        tokeniser65.dataBuffer = stringBuilder73;
        tokeniser53.dataBuffer = stringBuilder73;
        tokeniser41.dataBuffer = stringBuilder73;
        tokeniser29.dataBuffer = stringBuilder73;
        tokeniser2.dataBuffer = stringBuilder73;
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNull(stringBuilder17);
        org.junit.Assert.assertNull(tag18);
        org.junit.Assert.assertNotNull(comment19);
        org.junit.Assert.assertNull(stringBuilder21);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\uffff' + "'", char24 == '\uffff');
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNotNull(token37);
        org.junit.Assert.assertNotNull(stringBuilder44);
        org.junit.Assert.assertEquals(stringBuilder44.toString(), "");
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNull(doctype54);
        org.junit.Assert.assertNotNull(tokeniserState60);
        org.junit.Assert.assertNotNull(stringBuilder73);
        org.junit.Assert.assertEquals(stringBuilder73.toString(), "");
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype5 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        org.jsoup.parser.Token.Tag tag10 = tokeniser8.createTagPending(false);
        tokeniser2.tagPending = tag10;
        tokeniser2.emitTagPending();
        org.jsoup.parser.Token.Tag tag14 = tokeniser2.createTagPending(true);
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList17);
        java.lang.StringBuilder stringBuilder19 = null;
        tokeniser18.dataBuffer = stringBuilder19;
        tokeniser18.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader22, parseErrorList23);
        tokeniser24.createTempBuffer();
        tokeniser24.createTempBuffer();
        org.jsoup.parser.Token.Comment comment27 = tokeniser24.commentPending;
        java.lang.StringBuilder stringBuilder28 = null;
        tokeniser24.dataBuffer = stringBuilder28;
        org.jsoup.parser.Token.Comment comment30 = null;
        tokeniser24.commentPending = comment30;
        tokeniser24.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader33, parseErrorList34);
        org.jsoup.parser.Token.Tag tag37 = tokeniser35.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype38 = tokeniser35.doctypePending;
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader39, parseErrorList40);
        org.jsoup.parser.Token.Tag tag43 = tokeniser41.createTagPending(false);
        tokeniser35.tagPending = tag43;
        tokeniser24.emit((org.jsoup.parser.Token) tag43);
        tokeniser18.emit((org.jsoup.parser.Token) tag43);
        org.jsoup.parser.TokeniserState tokeniserState47 = tokeniser18.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNull(comment27);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNull(doctype38);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(tokeniserState47);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        java.lang.String str8 = characterReader1.consumeTo("hi!");
        int int9 = characterReader1.pos();
        boolean boolean10 = characterReader1.matchesDigit();
        java.lang.String str11 = characterReader1.toString();
        java.lang.String str12 = characterReader1.consumeToEnd();
        boolean boolean14 = characterReader1.matchConsume("");
        boolean boolean15 = characterReader1.isEmpty();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.toString();
        characterReader1.rewindToMark();
        boolean boolean11 = characterReader1.matches("");
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList12);
        characterReader1.unconsume();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.createCommentPending();
        boolean boolean6 = tokeniser2.currentNodeInHtmlNS();
        tokeniser2.createDoctypePending();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.createCommentPending();
        tokeniser2.emit("");
        tokeniser2.emit(' ');
        org.jsoup.parser.Token.Tag tag11 = tokeniser2.createTagPending(false);
        boolean boolean12 = tokeniser2.currentNodeInHtmlNS();
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.createCommentPending();
        tokeniser2.emit('\uffff');
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        java.lang.StringBuilder stringBuilder12 = null;
        tokeniser11.dataBuffer = stringBuilder12;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        tokeniser16.createTempBuffer();
        tokeniser16.createTempBuffer();
        java.lang.StringBuilder stringBuilder19 = tokeniser16.dataBuffer;
        tokeniser11.dataBuffer = stringBuilder19;
        tokeniser2.dataBuffer = stringBuilder19;
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader22, parseErrorList23);
        tokeniser24.createTempBuffer();
        tokeniser24.emit("");
        java.lang.StringBuilder stringBuilder28 = tokeniser24.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder28;
        org.jsoup.parser.Token.Tag tag31 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype32 = tokeniser2.doctypePending;
        org.jsoup.parser.Token.Tag tag33 = tokeniser2.tagPending;
        java.lang.StringBuilder stringBuilder34 = tokeniser2.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader35, parseErrorList36);
        org.jsoup.parser.Token.Tag tag39 = tokeniser37.createTagPending(false);
        org.jsoup.parser.Token.Comment comment40 = tokeniser37.commentPending;
        tokeniser37.createTempBuffer();
        java.lang.StringBuilder stringBuilder42 = null;
        tokeniser37.dataBuffer = stringBuilder42;
        org.jsoup.parser.TokeniserState tokeniserState44 = tokeniser37.getState();
        tokeniser2.transition(tokeniserState44);
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.Tokeniser tokeniser49 = new org.jsoup.parser.Tokeniser(characterReader47, parseErrorList48);
        org.jsoup.parser.TokeniserState tokeniserState50 = tokeniser49.getState();
        tokeniser49.createCommentPending();
        boolean boolean52 = tokeniser49.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment53 = tokeniser49.commentPending;
        org.jsoup.parser.CharacterReader characterReader55 = new org.jsoup.parser.CharacterReader("");
        char char56 = characterReader55.current();
        java.lang.String str58 = characterReader55.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.Tokeniser tokeniser60 = new org.jsoup.parser.Tokeniser(characterReader55, parseErrorList59);
        org.jsoup.parser.TokeniserState tokeniserState61 = tokeniser60.getState();
        tokeniser49.transition(tokeniserState61);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNull(doctype32);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNull(comment40);
        org.junit.Assert.assertNotNull(tokeniserState44);
        org.junit.Assert.assertNotNull(tokeniserState50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(comment53);
        org.junit.Assert.assertTrue("'" + char56 + "' != '" + '\uffff' + "'", char56 == '\uffff');
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(tokeniserState61);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        org.jsoup.parser.Token.Tag tag10 = tokeniser8.createTagPending(false);
        tokeniser8.createTempBuffer();
        tokeniser8.createDoctypePending();
        org.jsoup.parser.Token.Tag tag14 = tokeniser8.createTagPending(true);
        tokeniser2.emit((org.jsoup.parser.Token) tag14);
        org.jsoup.parser.Token token16 = tokeniser2.read();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList18);
        org.jsoup.parser.Token.Tag tag21 = tokeniser19.createTagPending(false);
        org.jsoup.parser.Token.Comment comment22 = tokeniser19.commentPending;
        tokeniser19.emit('\uffff');
        tokeniser19.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        characterReader27.unconsume();
        boolean boolean30 = characterReader27.matchConsume("");
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader27, parseErrorList31);
        org.jsoup.parser.Token.Tag tag34 = tokeniser32.createTagPending(true);
        tokeniser19.emit((org.jsoup.parser.Token) tag34);
        tokeniser2.emit((org.jsoup.parser.Token) tag34);
        tokeniser2.createCommentPending();
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader39, parseErrorList40);
        org.jsoup.parser.Token.Tag tag43 = tokeniser41.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype44 = tokeniser41.doctypePending;
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader45, parseErrorList46);
        org.jsoup.parser.Token.Tag tag49 = tokeniser47.createTagPending(false);
        tokeniser41.tagPending = tag49;
        java.lang.StringBuilder stringBuilder51 = tokeniser41.dataBuffer;
        tokeniser41.emitTagPending();
        tokeniser41.acknowledgeSelfClosingFlag();
        tokeniser41.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag56 = tokeniser41.createTagPending(false);
        tokeniser2.tagPending = tag56;
        org.jsoup.parser.CharacterReader characterReader58 = null;
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.Tokeniser tokeniser60 = new org.jsoup.parser.Tokeniser(characterReader58, parseErrorList59);
        org.jsoup.parser.Token.Tag tag62 = tokeniser60.createTagPending(false);
        tokeniser60.createTempBuffer();
        tokeniser60.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype65 = null;
        tokeniser60.doctypePending = doctype65;
        org.jsoup.parser.CharacterReader characterReader67 = null;
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        org.jsoup.parser.Tokeniser tokeniser69 = new org.jsoup.parser.Tokeniser(characterReader67, parseErrorList68);
        org.jsoup.parser.Token.Doctype doctype70 = tokeniser69.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState71 = null;
        tokeniser69.transition(tokeniserState71);
        org.jsoup.parser.CharacterReader characterReader73 = null;
        org.jsoup.parser.ParseErrorList parseErrorList74 = null;
        org.jsoup.parser.Tokeniser tokeniser75 = new org.jsoup.parser.Tokeniser(characterReader73, parseErrorList74);
        org.jsoup.parser.TokeniserState tokeniserState76 = tokeniser75.getState();
        tokeniser69.transition(tokeniserState76);
        org.jsoup.parser.CharacterReader characterReader78 = null;
        org.jsoup.parser.ParseErrorList parseErrorList79 = null;
        org.jsoup.parser.Tokeniser tokeniser80 = new org.jsoup.parser.Tokeniser(characterReader78, parseErrorList79);
        org.jsoup.parser.Token.Tag tag82 = tokeniser80.createTagPending(false);
        tokeniser80.createTempBuffer();
        tokeniser80.createDoctypePending();
        org.jsoup.parser.Token.Tag tag86 = tokeniser80.createTagPending(true);
        tokeniser69.emit((org.jsoup.parser.Token) tag86);
        tokeniser60.emit((org.jsoup.parser.Token) tag86);
        java.lang.StringBuilder stringBuilder89 = tokeniser60.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader90 = null;
        org.jsoup.parser.ParseErrorList parseErrorList91 = null;
        org.jsoup.parser.Tokeniser tokeniser92 = new org.jsoup.parser.Tokeniser(characterReader90, parseErrorList91);
        org.jsoup.parser.TokeniserState tokeniserState93 = tokeniser92.getState();
        tokeniser60.transition(tokeniserState93);
        tokeniser2.transition(tokeniserState93);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNull(comment22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNull(doctype44);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNull(stringBuilder51);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNull(doctype70);
        org.junit.Assert.assertNotNull(tokeniserState76);
        org.junit.Assert.assertNotNull(tag82);
        org.junit.Assert.assertNotNull(tag86);
        org.junit.Assert.assertNotNull(stringBuilder89);
        org.junit.Assert.assertEquals(stringBuilder89.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState93);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        char char4 = characterReader1.consume();
        characterReader1.unconsume();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        char char8 = characterReader7.current();
        java.lang.String str9 = characterReader7.consumeHexSequence();
        java.lang.String str11 = characterReader7.consumeTo("hi!");
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        char char14 = characterReader13.current();
        java.lang.String str15 = characterReader13.consumeHexSequence();
        boolean boolean16 = characterReader13.isEmpty();
        boolean boolean18 = characterReader13.matches('a');
        java.lang.String str19 = characterReader13.toString();
        org.jsoup.parser.CharacterReader characterReader21 = new org.jsoup.parser.CharacterReader("");
        char char22 = characterReader21.current();
        java.lang.String str24 = characterReader21.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader21, parseErrorList25);
        char[] charArray31 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str32 = characterReader21.consumeToAny(charArray31);
        java.lang.String str33 = characterReader13.consumeToAny(charArray31);
        java.lang.String str34 = characterReader7.consumeToAny(charArray31);
        java.lang.String str35 = characterReader1.consumeToAny(charArray31);
        java.lang.String str36 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\uffff' + "'", char14 == '\uffff');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\uffff' + "'", char22 == '\uffff');
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        characterReader1.mark();
        boolean boolean10 = characterReader1.matches('\uffff');
        boolean boolean12 = characterReader1.matches("hi!");
        boolean boolean14 = characterReader1.matchConsume("");
        char char15 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\uffff' + "'", char15 == '\uffff');
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.createCommentPending();
        tokeniser2.emit('\uffff');
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        java.lang.StringBuilder stringBuilder12 = null;
        tokeniser11.dataBuffer = stringBuilder12;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        tokeniser16.createTempBuffer();
        tokeniser16.createTempBuffer();
        java.lang.StringBuilder stringBuilder19 = tokeniser16.dataBuffer;
        tokeniser11.dataBuffer = stringBuilder19;
        tokeniser2.dataBuffer = stringBuilder19;
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader22, parseErrorList23);
        tokeniser24.createTempBuffer();
        tokeniser24.emit("");
        java.lang.StringBuilder stringBuilder28 = tokeniser24.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder28;
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader30, parseErrorList31);
        org.jsoup.parser.Token.Tag tag34 = tokeniser32.createTagPending(false);
        tokeniser32.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader36, parseErrorList37);
        org.jsoup.parser.Token.Tag tag40 = tokeniser38.createTagPending(false);
        tokeniser38.createTempBuffer();
        tokeniser38.createDoctypePending();
        org.jsoup.parser.Token.Tag tag44 = tokeniser38.createTagPending(true);
        tokeniser32.emit((org.jsoup.parser.Token) tag44);
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader46, parseErrorList47);
        java.lang.StringBuilder stringBuilder49 = null;
        tokeniser48.dataBuffer = stringBuilder49;
        tokeniser48.createCommentPending();
        org.jsoup.parser.Token.Comment comment52 = tokeniser48.commentPending;
        tokeniser32.commentPending = comment52;
        tokeniser2.commentPending = comment52;
        org.jsoup.parser.CharacterReader characterReader55 = null;
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.Tokeniser tokeniser57 = new org.jsoup.parser.Tokeniser(characterReader55, parseErrorList56);
        org.jsoup.parser.Token.Tag tag59 = tokeniser57.createTagPending(false);
        org.jsoup.parser.Token.Comment comment60 = tokeniser57.commentPending;
        org.jsoup.parser.Token.Doctype doctype61 = null;
        tokeniser57.doctypePending = doctype61;
        org.jsoup.parser.CharacterReader characterReader63 = null;
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        org.jsoup.parser.Tokeniser tokeniser65 = new org.jsoup.parser.Tokeniser(characterReader63, parseErrorList64);
        org.jsoup.parser.Token.Tag tag67 = tokeniser65.createTagPending(false);
        tokeniser65.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader69 = null;
        org.jsoup.parser.ParseErrorList parseErrorList70 = null;
        org.jsoup.parser.Tokeniser tokeniser71 = new org.jsoup.parser.Tokeniser(characterReader69, parseErrorList70);
        org.jsoup.parser.Token.Tag tag73 = tokeniser71.createTagPending(false);
        tokeniser71.createTempBuffer();
        tokeniser71.createDoctypePending();
        org.jsoup.parser.Token.Tag tag77 = tokeniser71.createTagPending(true);
        tokeniser65.emit((org.jsoup.parser.Token) tag77);
        org.jsoup.parser.CharacterReader characterReader79 = null;
        org.jsoup.parser.ParseErrorList parseErrorList80 = null;
        org.jsoup.parser.Tokeniser tokeniser81 = new org.jsoup.parser.Tokeniser(characterReader79, parseErrorList80);
        java.lang.StringBuilder stringBuilder82 = null;
        tokeniser81.dataBuffer = stringBuilder82;
        tokeniser81.createCommentPending();
        org.jsoup.parser.Token.Comment comment85 = tokeniser81.commentPending;
        tokeniser65.commentPending = comment85;
        tokeniser57.commentPending = comment85;
        tokeniser2.emit((org.jsoup.parser.Token) comment85);
        tokeniser2.acknowledgeSelfClosingFlag();
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(comment52);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertNull(comment60);
        org.junit.Assert.assertNotNull(tag67);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertNotNull(tag77);
        org.junit.Assert.assertNotNull(comment85);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        int int7 = characterReader1.pos();
        characterReader1.rewindToMark();
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList9);
        tokeniser10.emit("hi!");
        tokeniser10.createTempBuffer();
        tokeniser10.createCommentPending();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.createCommentPending();
        tokeniser2.emit('\uffff');
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        java.lang.StringBuilder stringBuilder12 = null;
        tokeniser11.dataBuffer = stringBuilder12;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        tokeniser16.createTempBuffer();
        tokeniser16.createTempBuffer();
        java.lang.StringBuilder stringBuilder19 = tokeniser16.dataBuffer;
        tokeniser11.dataBuffer = stringBuilder19;
        tokeniser2.dataBuffer = stringBuilder19;
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader22, parseErrorList23);
        org.jsoup.parser.TokeniserState tokeniserState25 = tokeniser24.getState();
        tokeniser24.createCommentPending();
        org.jsoup.parser.Token.Tag tag27 = tokeniser24.tagPending;
        org.jsoup.parser.Token.Doctype doctype28 = null;
        tokeniser24.doctypePending = doctype28;
        tokeniser24.emitCommentPending();
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader31, parseErrorList32);
        org.jsoup.parser.TokeniserState tokeniserState34 = tokeniser33.getState();
        tokeniser33.createCommentPending();
        boolean boolean36 = tokeniser33.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag38 = tokeniser33.createTagPending(true);
        tokeniser24.tagPending = tag38;
        tokeniser2.tagPending = tag38;
        tokeniser2.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char44 = tokeniser2.consumeCharacterReference((java.lang.Character) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNull(tag27);
        org.junit.Assert.assertNotNull(tokeniserState34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(tag38);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.toString();
        characterReader1.rewindToMark();
        boolean boolean10 = characterReader1.isEmpty();
        char char11 = characterReader1.current();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList12);
        java.lang.String str14 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        tokeniser2.createCommentPending();
        tokeniser2.emit('\uffff');
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.emit("hi!");
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser2.getState();
        tokeniser2.createDoctypePending();
        java.lang.StringBuilder stringBuilder15 = tokeniser2.dataBuffer;
        org.jsoup.parser.Token.Tag tag16 = tokeniser2.tagPending;
        org.jsoup.parser.Token.Doctype doctype17 = tokeniser2.doctypePending;
        java.lang.StringBuilder stringBuilder18 = null;
        tokeniser2.dataBuffer = stringBuilder18;
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNull(stringBuilder15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(doctype17);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.createCommentPending();
        org.jsoup.parser.Token.Comment comment6 = tokeniser2.commentPending;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.Token.Tag tag11 = tokeniser9.createTagPending(false);
        tokeniser9.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        org.jsoup.parser.Token.Tag tag17 = tokeniser15.createTagPending(false);
        tokeniser15.createTempBuffer();
        tokeniser15.createDoctypePending();
        org.jsoup.parser.Token.Tag tag21 = tokeniser15.createTagPending(true);
        tokeniser9.emit((org.jsoup.parser.Token) tag21);
        tokeniser2.emit((org.jsoup.parser.Token) tag21);
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser2.getState();
        tokeniser2.createDoctypePending();
        java.lang.String str26 = tokeniser2.appropriateEndTagName();
        java.lang.StringBuilder stringBuilder27 = tokeniser2.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader28, parseErrorList29);
        java.lang.StringBuilder stringBuilder31 = null;
        tokeniser30.dataBuffer = stringBuilder31;
        tokeniser30.createCommentPending();
        org.jsoup.parser.Token.Comment comment34 = tokeniser30.commentPending;
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader35, parseErrorList36);
        org.jsoup.parser.Token.Tag tag39 = tokeniser37.createTagPending(false);
        tokeniser37.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader41, parseErrorList42);
        org.jsoup.parser.Token.Tag tag45 = tokeniser43.createTagPending(false);
        tokeniser43.createTempBuffer();
        tokeniser43.createDoctypePending();
        org.jsoup.parser.Token.Tag tag49 = tokeniser43.createTagPending(true);
        tokeniser37.emit((org.jsoup.parser.Token) tag49);
        tokeniser30.emit((org.jsoup.parser.Token) tag49);
        tokeniser30.emit(' ');
        org.jsoup.parser.TokeniserState tokeniserState54 = tokeniser30.getState();
        tokeniser2.transition(tokeniserState54);
        org.junit.Assert.assertNotNull(comment6);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(stringBuilder27);
        org.junit.Assert.assertNotNull(comment34);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(tokeniserState54);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype5 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        org.jsoup.parser.Token.Tag tag10 = tokeniser8.createTagPending(false);
        tokeniser2.tagPending = tag10;
        tokeniser2.emitTagPending();
        org.jsoup.parser.Token token13 = tokeniser2.read();
        org.jsoup.parser.Token.Tag tag14 = tokeniser2.tagPending;
        java.lang.StringBuilder stringBuilder15 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype17 = tokeniser2.doctypePending;
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNull(stringBuilder15);
        org.junit.Assert.assertNull(doctype17);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str4 = characterReader1.consumeToEnd();
        java.lang.String str5 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        char char4 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchesLetter();
        characterReader1.mark();
        boolean boolean8 = characterReader1.matches('#');
        boolean boolean9 = characterReader1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser2.getState();
        tokeniser2.emit('\uffff');
        tokeniser2.emit("");
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        char char12 = characterReader11.current();
        java.lang.String str13 = characterReader11.consumeLetterSequence();
        java.lang.String str15 = characterReader11.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList16);
        org.jsoup.parser.Token.Doctype doctype18 = null;
        tokeniser17.doctypePending = doctype18;
        tokeniser17.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader21, parseErrorList22);
        java.lang.StringBuilder stringBuilder24 = null;
        tokeniser23.dataBuffer = stringBuilder24;
        org.jsoup.parser.Token.Comment comment26 = tokeniser23.commentPending;
        org.jsoup.parser.Token.Comment comment27 = tokeniser23.commentPending;
        org.jsoup.parser.Token.Doctype doctype28 = null;
        tokeniser23.doctypePending = doctype28;
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("");
        char char32 = characterReader31.current();
        java.lang.String str34 = characterReader31.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader31, parseErrorList35);
        java.lang.StringBuilder stringBuilder37 = null;
        tokeniser36.dataBuffer = stringBuilder37;
        org.jsoup.parser.Token.Tag tag40 = tokeniser36.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState41 = tokeniser36.getState();
        tokeniser36.createDoctypePending();
        tokeniser36.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader44 = null;
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader44, parseErrorList45);
        tokeniser46.createTempBuffer();
        tokeniser46.emit("");
        java.lang.StringBuilder stringBuilder50 = tokeniser46.dataBuffer;
        tokeniser36.dataBuffer = stringBuilder50;
        tokeniser23.dataBuffer = stringBuilder50;
        tokeniser17.dataBuffer = stringBuilder50;
        tokeniser2.dataBuffer = stringBuilder50;
        tokeniser2.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState56 = tokeniser2.getState();
        java.lang.StringBuilder stringBuilder57 = tokeniser2.dataBuffer;
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(comment26);
        org.junit.Assert.assertNull(comment27);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\uffff' + "'", char32 == '\uffff');
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(tokeniserState41);
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState56);
        org.junit.Assert.assertNotNull(stringBuilder57);
        org.junit.Assert.assertEquals(stringBuilder57.toString(), "");
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.emit('\uffff');
        tokeniser2.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        characterReader10.unconsume();
        boolean boolean13 = characterReader10.matchConsume("");
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList14);
        org.jsoup.parser.Token.Tag tag17 = tokeniser15.createTagPending(true);
        tokeniser2.emit((org.jsoup.parser.Token) tag17);
        org.jsoup.parser.Token.Tag tag20 = tokeniser2.createTagPending(true);
        org.jsoup.parser.Token.Tag tag22 = tokeniser2.createTagPending(true);
        org.jsoup.parser.Token.Tag tag23 = tokeniser2.tagPending;
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        char char26 = characterReader25.current();
        java.lang.String str27 = characterReader25.consumeHexSequence();
        characterReader25.rewindToMark();
        boolean boolean30 = characterReader25.matchesIgnoreCase("hi!");
        boolean boolean32 = characterReader25.containsIgnoreCase("hi!");
        boolean boolean33 = characterReader25.matchesLetter();
        java.lang.String str34 = characterReader25.consumeDigitSequence();
        boolean boolean35 = characterReader25.matchesDigit();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader25, parseErrorList36);
        org.jsoup.parser.TokeniserState tokeniserState38 = tokeniser37.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\uffff' + "'", char26 == '\uffff');
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(tokeniserState38);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str5 = characterReader1.consumeLetterSequence();
        boolean boolean7 = characterReader1.containsIgnoreCase("hi!");
        characterReader1.rewindToMark();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        int int7 = characterReader1.pos();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList8);
        boolean boolean10 = characterReader1.matchesDigit();
        java.lang.String str12 = characterReader1.consumeTo('\ufffd');
        java.lang.String str13 = characterReader1.toString();
        boolean boolean15 = characterReader1.matches("hi!");
        boolean boolean17 = characterReader1.matchesIgnoreCase("i!");
        boolean boolean18 = characterReader1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        char char4 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchesLetter();
        characterReader1.mark();
        boolean boolean8 = characterReader1.matches('a');
        boolean boolean9 = characterReader1.isEmpty();
        boolean boolean11 = characterReader1.matchConsume("");
        boolean boolean13 = characterReader1.matchesIgnoreCase("");
        characterReader1.unconsume();
        java.lang.String str15 = characterReader1.toString();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.isEmpty();
        characterReader1.advance();
        characterReader1.mark();
        boolean boolean8 = characterReader1.matchesIgnoreCase("i!");
        int int9 = characterReader1.pos();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        java.lang.String str9 = characterReader1.consumeToEnd();
        boolean boolean10 = characterReader1.matchesLetter();
        java.lang.String str12 = characterReader1.consumeTo(' ');
        java.lang.String str13 = characterReader1.consumeAsString();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList14);
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser15.doctypePending;
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(doctype16);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        org.jsoup.parser.CharacterReader characterReader6 = new org.jsoup.parser.CharacterReader("");
        char char7 = characterReader6.current();
        java.lang.String str9 = characterReader6.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList10);
        char[] charArray16 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str17 = characterReader6.consumeToAny(charArray16);
        boolean boolean18 = characterReader1.matchesAny(charArray16);
        boolean boolean20 = characterReader1.matches("hi!");
        boolean boolean21 = characterReader1.matchesDigit();
        char char22 = characterReader1.consume();
        boolean boolean24 = characterReader1.matches('i');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\uffff' + "'", char22 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser2.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = null;
        tokeniser2.transition(tokeniserState4);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser8.getState();
        tokeniser2.transition(tokeniserState9);
        tokeniser2.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        java.lang.StringBuilder stringBuilder15 = null;
        tokeniser14.dataBuffer = stringBuilder15;
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList18);
        tokeniser19.createTempBuffer();
        tokeniser19.createTempBuffer();
        java.lang.StringBuilder stringBuilder22 = tokeniser19.dataBuffer;
        tokeniser14.dataBuffer = stringBuilder22;
        tokeniser2.dataBuffer = stringBuilder22;
        java.lang.StringBuilder stringBuilder25 = tokeniser2.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader26, parseErrorList27);
        org.jsoup.parser.Token.Tag tag30 = tokeniser28.createTagPending(false);
        tokeniser28.createTempBuffer();
        org.jsoup.parser.Token.Comment comment32 = tokeniser28.commentPending;
        boolean boolean33 = tokeniser28.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment34 = tokeniser28.commentPending;
        org.jsoup.parser.Token.Doctype doctype35 = tokeniser28.doctypePending;
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader36, parseErrorList37);
        java.lang.StringBuilder stringBuilder39 = null;
        tokeniser38.dataBuffer = stringBuilder39;
        tokeniser38.acknowledgeSelfClosingFlag();
        tokeniser38.createCommentPending();
        tokeniser38.emit('\uffff');
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader45, parseErrorList46);
        java.lang.StringBuilder stringBuilder48 = null;
        tokeniser47.dataBuffer = stringBuilder48;
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader50, parseErrorList51);
        tokeniser52.createTempBuffer();
        tokeniser52.createTempBuffer();
        java.lang.StringBuilder stringBuilder55 = tokeniser52.dataBuffer;
        tokeniser47.dataBuffer = stringBuilder55;
        tokeniser38.dataBuffer = stringBuilder55;
        org.jsoup.parser.CharacterReader characterReader58 = null;
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.Tokeniser tokeniser60 = new org.jsoup.parser.Tokeniser(characterReader58, parseErrorList59);
        tokeniser60.createTempBuffer();
        tokeniser60.emit("");
        java.lang.StringBuilder stringBuilder64 = tokeniser60.dataBuffer;
        tokeniser38.dataBuffer = stringBuilder64;
        org.jsoup.parser.Token.Tag tag67 = tokeniser38.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype68 = tokeniser38.doctypePending;
        org.jsoup.parser.Token.Tag tag69 = tokeniser38.tagPending;
        java.lang.StringBuilder stringBuilder70 = tokeniser38.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader71 = null;
        org.jsoup.parser.ParseErrorList parseErrorList72 = null;
        org.jsoup.parser.Tokeniser tokeniser73 = new org.jsoup.parser.Tokeniser(characterReader71, parseErrorList72);
        org.jsoup.parser.Token.Tag tag75 = tokeniser73.createTagPending(false);
        org.jsoup.parser.Token.Tag tag77 = tokeniser73.createTagPending(false);
        tokeniser38.emit((org.jsoup.parser.Token) tag77);
        java.lang.StringBuilder stringBuilder79 = tokeniser38.dataBuffer;
        tokeniser28.dataBuffer = stringBuilder79;
        tokeniser2.dataBuffer = stringBuilder79;
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNull(comment32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(comment34);
        org.junit.Assert.assertNull(doctype35);
        org.junit.Assert.assertNotNull(stringBuilder55);
        org.junit.Assert.assertEquals(stringBuilder55.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder64);
        org.junit.Assert.assertEquals(stringBuilder64.toString(), "");
        org.junit.Assert.assertNotNull(tag67);
        org.junit.Assert.assertNull(doctype68);
        org.junit.Assert.assertNotNull(tag69);
        org.junit.Assert.assertNotNull(stringBuilder70);
        org.junit.Assert.assertEquals(stringBuilder70.toString(), "");
        org.junit.Assert.assertNotNull(tag75);
        org.junit.Assert.assertNotNull(tag77);
        org.junit.Assert.assertNotNull(stringBuilder79);
        org.junit.Assert.assertEquals(stringBuilder79.toString(), "");
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str5 = characterReader1.consumeTo("hi!");
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        java.lang.String str9 = characterReader1.consumeTo(' ');
        java.lang.String str10 = characterReader1.consumeToEnd();
        java.lang.String str11 = characterReader1.consumeLetterSequence();
        char char12 = characterReader1.current();
        java.lang.String str13 = characterReader1.consumeToEnd();
        java.lang.String str14 = characterReader1.consumeToEnd();
        char char15 = characterReader1.current();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\uffff' + "'", char15 == '\uffff');
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        java.lang.String str8 = characterReader1.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList9);
        java.lang.String str12 = characterReader1.consumeTo("");
        char char13 = characterReader1.current();
        boolean boolean15 = characterReader1.matchConsumeIgnoreCase("");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        tokeniser2.emitTagPending();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.Token.Tag tag11 = tokeniser9.createTagPending(false);
        org.jsoup.parser.Token.Comment comment12 = tokeniser9.commentPending;
        org.jsoup.parser.Token.Doctype doctype13 = null;
        tokeniser9.doctypePending = doctype13;
        tokeniser9.createTempBuffer();
        java.lang.StringBuilder stringBuilder16 = tokeniser9.dataBuffer;
        boolean boolean17 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser9.getState();
        org.jsoup.parser.Token.Doctype doctype19 = null;
        tokeniser9.doctypePending = doctype19;
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        char char23 = characterReader22.current();
        java.lang.String str25 = characterReader22.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader22, parseErrorList26);
        java.lang.StringBuilder stringBuilder28 = null;
        tokeniser27.dataBuffer = stringBuilder28;
        org.jsoup.parser.Token.Tag tag31 = tokeniser27.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader32, parseErrorList33);
        org.jsoup.parser.TokeniserState tokeniserState35 = tokeniser34.getState();
        tokeniser34.createCommentPending();
        boolean boolean37 = tokeniser34.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag39 = tokeniser34.createTagPending(true);
        tokeniser34.emit("");
        tokeniser34.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment43 = tokeniser34.commentPending;
        tokeniser27.commentPending = comment43;
        tokeniser9.commentPending = comment43;
        tokeniser2.commentPending = comment43;
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(comment12);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\uffff' + "'", char23 == '\uffff');
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(comment43);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.Token.Tag tag11 = tokeniser9.createTagPending(false);
        tokeniser9.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        org.jsoup.parser.Token.Tag tag17 = tokeniser15.createTagPending(false);
        tokeniser15.createTempBuffer();
        tokeniser15.createDoctypePending();
        org.jsoup.parser.Token.Tag tag21 = tokeniser15.createTagPending(true);
        tokeniser9.emit((org.jsoup.parser.Token) tag21);
        tokeniser2.tagPending = tag21;
        boolean boolean24 = tokeniser2.currentNodeInHtmlNS();
        boolean boolean25 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser2.getState();
        org.jsoup.parser.Token.Tag tag27 = tokeniser2.tagPending;
        org.jsoup.parser.Token.Tag tag28 = tokeniser2.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char31 = tokeniser2.consumeCharacterReference((java.lang.Character) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tag28);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Comment comment7 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Tag tag8 = tokeniser2.tagPending;
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        org.jsoup.parser.Token.Tag tag13 = tokeniser11.createTagPending(false);
        tokeniser11.createTempBuffer();
        boolean boolean15 = tokeniser11.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList17);
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser18.getState();
        tokeniser18.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser18.getState();
        java.lang.StringBuilder stringBuilder22 = tokeniser18.dataBuffer;
        tokeniser18.emit('4');
        org.jsoup.parser.TokeniserState tokeniserState25 = tokeniser18.getState();
        tokeniser11.transition(tokeniserState25);
        tokeniser2.transition(tokeniserState25);
        org.jsoup.parser.Token.Tag tag28 = tokeniser2.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser2.getState();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNull(stringBuilder22);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(tokeniserState29);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean9 = characterReader1.matches(' ');
        boolean boolean11 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean13 = characterReader1.matchConsume("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        java.lang.String str8 = characterReader1.consumeTo("hi!");
        int int9 = characterReader1.pos();
        boolean boolean11 = characterReader1.matchConsumeIgnoreCase("hi!");
        characterReader1.mark();
        java.lang.String str13 = characterReader1.consumeDigitSequence();
        java.lang.String str14 = characterReader1.toString();
        java.lang.String str15 = characterReader1.consumeDigitSequence();
        boolean boolean17 = characterReader1.matches("hi!");
        java.lang.String str18 = characterReader1.toString();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.createCommentPending();
        tokeniser2.emit('\uffff');
        boolean boolean9 = tokeniser2.currentNodeInHtmlNS();
        tokeniser2.emitCommentPending();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        org.jsoup.parser.Token.Comment comment8 = null;
        tokeniser2.commentPending = comment8;
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList12);
        org.jsoup.parser.Token.Tag tag15 = tokeniser13.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser13.doctypePending;
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList18);
        org.jsoup.parser.Token.Tag tag21 = tokeniser19.createTagPending(false);
        tokeniser13.tagPending = tag21;
        tokeniser2.emit((org.jsoup.parser.Token) tag21);
        tokeniser2.createCommentPending();
        tokeniser2.emit("");
        tokeniser2.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNotNull(tag21);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        tokeniser8.createTempBuffer();
        tokeniser8.emit("");
        java.lang.StringBuilder stringBuilder12 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder12;
        org.jsoup.parser.Token.Doctype doctype14 = tokeniser2.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNull(doctype14);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        org.jsoup.parser.Token.Doctype doctype8 = null;
        tokeniser2.doctypePending = doctype8;
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        char char14 = characterReader13.current();
        java.lang.String str15 = characterReader13.consumeHexSequence();
        boolean boolean16 = characterReader13.isEmpty();
        characterReader13.advance();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList18);
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        org.jsoup.parser.Token.Tag tag24 = tokeniser22.createTagPending(false);
        org.jsoup.parser.Token.Comment comment25 = tokeniser22.commentPending;
        tokeniser22.emit('\uffff');
        tokeniser22.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        char char31 = characterReader30.current();
        java.lang.String str33 = characterReader30.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader30, parseErrorList34);
        java.lang.StringBuilder stringBuilder36 = null;
        tokeniser35.dataBuffer = stringBuilder36;
        org.jsoup.parser.Token.Tag tag39 = tokeniser35.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState40 = tokeniser35.getState();
        tokeniser22.transition(tokeniserState40);
        tokeniser19.advanceTransition(tokeniserState40);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\uffff' + "'", char14 == '\uffff');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNull(comment25);
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\uffff' + "'", char31 == '\uffff');
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(tokeniserState40);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        tokeniser2.createCommentPending();
        tokeniser2.emit('\uffff');
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser2.doctypePending;
        tokeniser2.emitTagPending();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Comment comment14 = tokeniser2.commentPending;
        org.jsoup.parser.Token token15 = tokeniser2.read();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNull(doctype11);
        org.junit.Assert.assertNotNull(comment14);
        org.junit.Assert.assertNotNull(token15);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser2.getState();
        tokeniser2.emit('\uffff');
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.Token.Tag tag12 = tokeniser10.createTagPending(false);
        org.jsoup.parser.Token.Comment comment13 = tokeniser10.commentPending;
        org.jsoup.parser.Token.Doctype doctype14 = null;
        tokeniser10.doctypePending = doctype14;
        tokeniser10.createTempBuffer();
        java.lang.StringBuilder stringBuilder17 = tokeniser10.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder17;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token19 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(comment13);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        org.jsoup.parser.Token.Comment comment9 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Comment comment10 = tokeniser2.commentPending;
        tokeniser2.createDoctypePending();
        tokeniser2.createTempBuffer();
        org.junit.Assert.assertNull(comment9);
        org.junit.Assert.assertNull(comment10);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        java.lang.String str7 = characterReader1.consumeAsString();
        characterReader1.mark();
        characterReader1.mark();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean8 = characterReader1.matchConsume("");
        java.lang.String str9 = characterReader1.consumeHexSequence();
        char char10 = characterReader1.current();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList11);
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        org.jsoup.parser.Token.Tag tag17 = tokeniser15.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser15.doctypePending;
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        org.jsoup.parser.Token.Tag tag23 = tokeniser21.createTagPending(false);
        tokeniser15.tagPending = tag23;
        java.lang.StringBuilder stringBuilder25 = tokeniser15.dataBuffer;
        tokeniser15.emitTagPending();
        tokeniser15.emit(' ');
        tokeniser15.createDoctypePending();
        tokeniser15.createCommentPending();
        tokeniser15.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader32, parseErrorList33);
        org.jsoup.parser.Token.Tag tag36 = tokeniser34.createTagPending(false);
        org.jsoup.parser.Token.Comment comment37 = tokeniser34.commentPending;
        tokeniser34.emit('\uffff');
        tokeniser34.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("");
        characterReader42.unconsume();
        boolean boolean45 = characterReader42.matchConsume("");
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader42, parseErrorList46);
        org.jsoup.parser.Token.Tag tag49 = tokeniser47.createTagPending(true);
        tokeniser34.emit((org.jsoup.parser.Token) tag49);
        boolean boolean51 = tokeniser34.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype52 = tokeniser34.doctypePending;
        tokeniser15.doctypePending = doctype52;
        org.jsoup.parser.Token.Tag tag55 = tokeniser15.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("");
        char char58 = characterReader57.current();
        java.lang.String str60 = characterReader57.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.Tokeniser tokeniser62 = new org.jsoup.parser.Tokeniser(characterReader57, parseErrorList61);
        java.lang.StringBuilder stringBuilder63 = null;
        tokeniser62.dataBuffer = stringBuilder63;
        org.jsoup.parser.Token.Tag tag66 = tokeniser62.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader67 = null;
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        org.jsoup.parser.Tokeniser tokeniser69 = new org.jsoup.parser.Tokeniser(characterReader67, parseErrorList68);
        org.jsoup.parser.Token.Tag tag71 = tokeniser69.createTagPending(false);
        tokeniser69.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader73 = null;
        org.jsoup.parser.ParseErrorList parseErrorList74 = null;
        org.jsoup.parser.Tokeniser tokeniser75 = new org.jsoup.parser.Tokeniser(characterReader73, parseErrorList74);
        org.jsoup.parser.TokeniserState tokeniserState76 = tokeniser75.getState();
        tokeniser75.createCommentPending();
        boolean boolean78 = tokeniser75.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag80 = tokeniser75.createTagPending(true);
        tokeniser75.emit("");
        tokeniser75.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment84 = tokeniser75.commentPending;
        tokeniser69.commentPending = comment84;
        org.jsoup.parser.Token.Tag tag86 = tokeniser69.tagPending;
        tokeniser62.tagPending = tag86;
        tokeniser15.tagPending = tag86;
        tokeniser12.tagPending = tag86;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNull(stringBuilder25);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNull(comment37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doctype52);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertTrue("'" + char58 + "' != '" + '\uffff' + "'", char58 == '\uffff');
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertNotNull(tag71);
        org.junit.Assert.assertNotNull(tokeniserState76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(tag80);
        org.junit.Assert.assertNotNull(comment84);
        org.junit.Assert.assertNotNull(tag86);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        characterReader1.mark();
        characterReader1.rewindToMark();
        java.lang.String str10 = characterReader1.consumeDigitSequence();
        boolean boolean11 = characterReader1.matchesLetter();
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        char char13 = characterReader1.consume();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        int int7 = characterReader1.pos();
        boolean boolean9 = characterReader1.containsIgnoreCase("hi!");
        java.lang.String str11 = characterReader1.consumeTo('#');
        boolean boolean13 = characterReader1.matchConsumeIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("");
        char char16 = characterReader15.current();
        java.lang.String str18 = characterReader15.consumeTo('#');
        boolean boolean20 = characterReader15.matchesIgnoreCase("hi!");
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("");
        char char23 = characterReader22.current();
        java.lang.String str24 = characterReader22.consumeLetterSequence();
        char char25 = characterReader22.consume();
        characterReader22.unconsume();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        char char29 = characterReader28.current();
        java.lang.String str30 = characterReader28.consumeHexSequence();
        java.lang.String str32 = characterReader28.consumeTo("hi!");
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("");
        char char35 = characterReader34.current();
        java.lang.String str36 = characterReader34.consumeHexSequence();
        boolean boolean37 = characterReader34.isEmpty();
        boolean boolean39 = characterReader34.matches('a');
        java.lang.String str40 = characterReader34.toString();
        org.jsoup.parser.CharacterReader characterReader42 = new org.jsoup.parser.CharacterReader("");
        char char43 = characterReader42.current();
        java.lang.String str45 = characterReader42.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader42, parseErrorList46);
        char[] charArray52 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str53 = characterReader42.consumeToAny(charArray52);
        java.lang.String str54 = characterReader34.consumeToAny(charArray52);
        java.lang.String str55 = characterReader28.consumeToAny(charArray52);
        java.lang.String str56 = characterReader22.consumeToAny(charArray52);
        java.lang.String str57 = characterReader15.consumeToAny(charArray52);
        boolean boolean58 = characterReader1.matchesAny(charArray52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\uffff' + "'", char16 == '\uffff');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\uffff' + "'", char23 == '\uffff');
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\uffff' + "'", char25 == '\uffff');
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\uffff' + "'", char29 == '\uffff');
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + '\uffff' + "'", char35 == '\uffff');
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + char43 + "' != '" + '\uffff' + "'", char43 == '\uffff');
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.emit('\uffff');
        tokeniser2.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        tokeniser11.createTempBuffer();
        tokeniser11.createTempBuffer();
        org.jsoup.parser.Token.Comment comment14 = tokeniser11.commentPending;
        java.lang.StringBuilder stringBuilder15 = null;
        tokeniser11.dataBuffer = stringBuilder15;
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList18);
        org.jsoup.parser.Token.Doctype doctype20 = tokeniser19.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState21 = null;
        tokeniser19.transition(tokeniserState21);
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader23, parseErrorList24);
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser25.getState();
        tokeniser19.transition(tokeniserState26);
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader28, parseErrorList29);
        org.jsoup.parser.Token.Tag tag32 = tokeniser30.createTagPending(false);
        tokeniser30.createTempBuffer();
        tokeniser30.createDoctypePending();
        org.jsoup.parser.Token.Tag tag36 = tokeniser30.createTagPending(true);
        tokeniser19.emit((org.jsoup.parser.Token) tag36);
        tokeniser11.tagPending = tag36;
        tokeniser2.tagPending = tag36;
        org.jsoup.parser.Token.Tag tag41 = tokeniser2.createTagPending(true);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNull(doctype20);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(tag41);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean6 = characterReader1.matches('a');
        java.lang.String str7 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        char char10 = characterReader9.current();
        java.lang.String str12 = characterReader9.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList13);
        char[] charArray19 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str20 = characterReader9.consumeToAny(charArray19);
        java.lang.String str21 = characterReader1.consumeToAny(charArray19);
        java.lang.String str22 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList23);
        boolean boolean26 = characterReader1.matches("");
        boolean boolean28 = characterReader1.matchConsume("hi!");
        boolean boolean30 = characterReader1.matchesIgnoreCase("");
        boolean boolean32 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str33 = characterReader1.toString();
        java.lang.String str34 = characterReader1.consumeDigitSequence();
        boolean boolean36 = characterReader1.matches('a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.emit('\uffff');
        tokeniser2.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        characterReader10.unconsume();
        boolean boolean13 = characterReader10.matchConsume("");
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList14);
        org.jsoup.parser.Token.Tag tag17 = tokeniser15.createTagPending(true);
        tokeniser2.emit((org.jsoup.parser.Token) tag17);
        org.jsoup.parser.Token.Tag tag20 = tokeniser2.createTagPending(true);
        tokeniser2.createCommentPending();
        tokeniser2.createDoctypePending();
        tokeniser2.createTempBuffer();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag20);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser2.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser2.getState();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        org.jsoup.parser.Token.Tag tag13 = tokeniser11.createTagPending(false);
        tokeniser11.createTempBuffer();
        tokeniser11.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype16 = null;
        tokeniser11.doctypePending = doctype16;
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList19);
        org.jsoup.parser.Token.Doctype doctype21 = tokeniser20.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState22 = null;
        tokeniser20.transition(tokeniserState22);
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList25);
        org.jsoup.parser.TokeniserState tokeniserState27 = tokeniser26.getState();
        tokeniser20.transition(tokeniserState27);
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader29, parseErrorList30);
        org.jsoup.parser.Token.Tag tag33 = tokeniser31.createTagPending(false);
        tokeniser31.createTempBuffer();
        tokeniser31.createDoctypePending();
        org.jsoup.parser.Token.Tag tag37 = tokeniser31.createTagPending(true);
        tokeniser20.emit((org.jsoup.parser.Token) tag37);
        tokeniser11.emit((org.jsoup.parser.Token) tag37);
        tokeniser2.tagPending = tag37;
        org.jsoup.parser.TokeniserState tokeniserState41 = tokeniser2.getState();
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(doctype6);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNull(doctype21);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(tokeniserState41);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        characterReader1.mark();
        characterReader1.rewindToMark();
        java.lang.String str10 = characterReader1.consumeDigitSequence();
        boolean boolean11 = characterReader1.matchesLetter();
        java.lang.String str12 = characterReader1.consumeDigitSequence();
        java.lang.String str13 = characterReader1.consumeToEnd();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype5 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        org.jsoup.parser.Token.Tag tag10 = tokeniser8.createTagPending(false);
        tokeniser2.tagPending = tag10;
        java.lang.StringBuilder stringBuilder12 = tokeniser2.dataBuffer;
        org.jsoup.parser.Token.Comment comment13 = tokeniser2.commentPending;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser16.getState();
        tokeniser16.createCommentPending();
        boolean boolean19 = tokeniser16.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag21 = tokeniser16.createTagPending(true);
        tokeniser16.emit("");
        tokeniser16.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment25 = tokeniser16.commentPending;
        tokeniser2.commentPending = comment25;
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(stringBuilder12);
        org.junit.Assert.assertNull(comment13);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(comment25);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        characterReader1.mark();
        boolean boolean10 = characterReader1.matches('\uffff');
        char char11 = characterReader1.consume();
        boolean boolean12 = characterReader1.matchesDigit();
        char char13 = characterReader1.consume();
        boolean boolean14 = characterReader1.matchesDigit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end 2, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        characterReader1.mark();
        boolean boolean10 = characterReader1.matches('\uffff');
        boolean boolean12 = characterReader1.matches("hi!");
        boolean boolean13 = characterReader1.matchesLetter();
        characterReader1.rewindToMark();
        boolean boolean15 = characterReader1.matchesDigit();
        boolean boolean17 = characterReader1.matches("hi!");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean6 = characterReader1.matches('a');
        java.lang.String str7 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        char char10 = characterReader9.current();
        java.lang.String str12 = characterReader9.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList13);
        char[] charArray19 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str20 = characterReader9.consumeToAny(charArray19);
        java.lang.String str21 = characterReader1.consumeToAny(charArray19);
        java.lang.String str22 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        char char25 = characterReader24.current();
        java.lang.String str27 = characterReader24.consumeTo('#');
        boolean boolean28 = characterReader24.matchesDigit();
        boolean boolean29 = characterReader24.isEmpty();
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("");
        char char32 = characterReader31.current();
        java.lang.String str33 = characterReader31.consumeHexSequence();
        boolean boolean34 = characterReader31.isEmpty();
        boolean boolean36 = characterReader31.matches('a');
        java.lang.String str37 = characterReader31.toString();
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("");
        char char40 = characterReader39.current();
        java.lang.String str42 = characterReader39.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader39, parseErrorList43);
        char[] charArray49 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str50 = characterReader39.consumeToAny(charArray49);
        java.lang.String str51 = characterReader31.consumeToAny(charArray49);
        java.lang.String str52 = characterReader24.consumeToAny(charArray49);
        boolean boolean53 = characterReader1.matchesAny(charArray49);
        boolean boolean54 = characterReader1.matchesLetter();
        boolean boolean56 = characterReader1.matches('\ufffd');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\uffff' + "'", char25 == '\uffff');
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\uffff' + "'", char32 == '\uffff');
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + '\uffff' + "'", char40 == '\uffff');
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        java.lang.String str8 = characterReader1.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList9);
        char char11 = characterReader1.current();
        boolean boolean12 = characterReader1.isEmpty();
        java.lang.String str14 = characterReader1.consumeTo('a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean6 = characterReader1.matches('a');
        java.lang.String str7 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        char char10 = characterReader9.current();
        java.lang.String str12 = characterReader9.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList13);
        char[] charArray19 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str20 = characterReader9.consumeToAny(charArray19);
        java.lang.String str21 = characterReader1.consumeToAny(charArray19);
        java.lang.String str22 = characterReader1.consumeLetterSequence();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList23);
        boolean boolean26 = characterReader1.matches("");
        boolean boolean28 = characterReader1.matchConsume("hi!");
        boolean boolean30 = characterReader1.matchesIgnoreCase("");
        java.lang.String str31 = characterReader1.consumeHexSequence();
        java.lang.String str33 = characterReader1.consumeTo("");
        java.lang.String str34 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.emit("hi!");
        tokeniser2.createCommentPending();
        tokeniser2.emitCommentPending();
        org.jsoup.parser.Token.Tag tag10 = tokeniser2.createTagPending(true);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean8 = characterReader1.matchConsume("");
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList9);
        tokeniser10.createDoctypePending();
        tokeniser10.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        tokeniser15.createTempBuffer();
        tokeniser15.createTempBuffer();
        org.jsoup.parser.Token.Comment comment18 = tokeniser15.commentPending;
        java.lang.StringBuilder stringBuilder19 = null;
        tokeniser15.dataBuffer = stringBuilder19;
        org.jsoup.parser.Token.Doctype doctype21 = null;
        tokeniser15.doctypePending = doctype21;
        tokeniser15.createDoctypePending();
        tokeniser15.emit('a');
        boolean boolean26 = tokeniser15.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag28 = tokeniser15.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader29, parseErrorList30);
        java.lang.StringBuilder stringBuilder32 = null;
        tokeniser31.dataBuffer = stringBuilder32;
        tokeniser31.acknowledgeSelfClosingFlag();
        tokeniser31.createCommentPending();
        tokeniser31.emit('\uffff');
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader38, parseErrorList39);
        java.lang.StringBuilder stringBuilder41 = null;
        tokeniser40.dataBuffer = stringBuilder41;
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader43, parseErrorList44);
        tokeniser45.createTempBuffer();
        tokeniser45.createTempBuffer();
        java.lang.StringBuilder stringBuilder48 = tokeniser45.dataBuffer;
        tokeniser40.dataBuffer = stringBuilder48;
        tokeniser31.dataBuffer = stringBuilder48;
        org.jsoup.parser.Token.Tag tag52 = tokeniser31.createTagPending(false);
        org.jsoup.parser.Token.Tag tag53 = tokeniser31.tagPending;
        org.jsoup.parser.CharacterReader characterReader54 = null;
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.Tokeniser tokeniser56 = new org.jsoup.parser.Tokeniser(characterReader54, parseErrorList55);
        org.jsoup.parser.Token.Doctype doctype57 = tokeniser56.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState58 = null;
        tokeniser56.transition(tokeniserState58);
        org.jsoup.parser.CharacterReader characterReader60 = null;
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.Tokeniser tokeniser62 = new org.jsoup.parser.Tokeniser(characterReader60, parseErrorList61);
        org.jsoup.parser.TokeniserState tokeniserState63 = tokeniser62.getState();
        tokeniser56.transition(tokeniserState63);
        tokeniser56.emit('\ufffd');
        tokeniser56.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype68 = tokeniser56.doctypePending;
        tokeniser31.doctypePending = doctype68;
        tokeniser15.emit((org.jsoup.parser.Token) doctype68);
        tokeniser10.doctypePending = doctype68;
        tokeniser10.emitDoctypePending();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(comment18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(stringBuilder48);
        org.junit.Assert.assertEquals(stringBuilder48.toString(), "");
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNull(doctype57);
        org.junit.Assert.assertNotNull(tokeniserState63);
        org.junit.Assert.assertNotNull(doctype68);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        characterReader1.rewindToMark();
        char char5 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\uffff' + "'", char5 == '\uffff');
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        java.lang.String str5 = characterReader1.consumeTo("hi!");
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        char char8 = characterReader7.current();
        java.lang.String str10 = characterReader7.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList11);
        char[] charArray17 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str18 = characterReader7.consumeToAny(charArray17);
        boolean boolean19 = characterReader1.matchesAny(charArray17);
        java.lang.String str21 = characterReader1.consumeTo(' ');
        boolean boolean22 = characterReader1.matchesDigit();
        characterReader1.rewindToMark();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        boolean boolean4 = characterReader1.matchesLetter();
        boolean boolean6 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str7 = characterReader1.consumeToEnd();
        boolean boolean9 = characterReader1.matches("");
        boolean boolean10 = characterReader1.matchesLetter();
        java.lang.String str11 = characterReader1.consumeToEnd();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean6 = characterReader1.matches('a');
        int int7 = characterReader1.pos();
        boolean boolean9 = characterReader1.matches("");
        boolean boolean11 = characterReader1.matches('4');
        characterReader1.rewindToMark();
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        tokeniser2.createCommentPending();
        tokeniser2.emit('\uffff');
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser2.doctypePending;
        tokeniser2.emitTagPending();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Tag tag15 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment16 = tokeniser2.commentPending;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        boolean boolean21 = characterReader19.matches(' ');
        characterReader19.advance();
        characterReader19.unconsume();
        characterReader19.rewindToMark();
        int int25 = characterReader19.pos();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList26);
        org.jsoup.parser.Token.Tag tag29 = tokeniser27.createTagPending(false);
        boolean boolean30 = tokeniser27.currentNodeInHtmlNS();
        tokeniser27.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader32, parseErrorList33);
        org.jsoup.parser.TokeniserState tokeniserState35 = tokeniser34.getState();
        tokeniser34.createCommentPending();
        tokeniser34.createCommentPending();
        tokeniser34.emitCommentPending();
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader39, parseErrorList40);
        org.jsoup.parser.Token.Tag tag43 = tokeniser41.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype44 = tokeniser41.doctypePending;
        org.jsoup.parser.Token.Doctype doctype45 = tokeniser41.doctypePending;
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader46, parseErrorList47);
        java.lang.StringBuilder stringBuilder49 = null;
        tokeniser48.dataBuffer = stringBuilder49;
        tokeniser48.createCommentPending();
        org.jsoup.parser.Token.Comment comment52 = tokeniser48.commentPending;
        tokeniser41.commentPending = comment52;
        tokeniser34.commentPending = comment52;
        tokeniser27.commentPending = comment52;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emit((org.jsoup.parser.Token) comment52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNull(doctype11);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(comment16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNull(doctype44);
        org.junit.Assert.assertNull(doctype45);
        org.junit.Assert.assertNotNull(comment52);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        characterReader1.mark();
        boolean boolean10 = characterReader1.matches('\uffff');
        boolean boolean12 = characterReader1.matches("hi!");
        characterReader1.mark();
        boolean boolean15 = characterReader1.containsIgnoreCase("");
        boolean boolean17 = characterReader1.matches("");
        boolean boolean18 = characterReader1.isEmpty();
        boolean boolean20 = characterReader1.matchConsume("");
        java.lang.String str21 = characterReader1.consumeToEnd();
        boolean boolean23 = characterReader1.matchConsumeIgnoreCase("hi!");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean8 = characterReader1.matchConsume("");
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList9);
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList12);
        org.jsoup.parser.Token.Tag tag15 = tokeniser13.createTagPending(false);
        org.jsoup.parser.Token.Comment comment16 = tokeniser13.commentPending;
        org.jsoup.parser.Token.Doctype doctype17 = null;
        tokeniser13.doctypePending = doctype17;
        tokeniser13.createTempBuffer();
        java.lang.StringBuilder stringBuilder20 = tokeniser13.dataBuffer;
        boolean boolean21 = tokeniser13.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser13.getState();
        tokeniser10.advanceTransition(tokeniserState22);
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList25);
        java.lang.StringBuilder stringBuilder27 = null;
        tokeniser26.dataBuffer = stringBuilder27;
        tokeniser26.acknowledgeSelfClosingFlag();
        tokeniser26.emit("hi!");
        org.jsoup.parser.Token.Doctype doctype32 = null;
        tokeniser26.doctypePending = doctype32;
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader34, parseErrorList35);
        tokeniser36.createTempBuffer();
        tokeniser36.createTempBuffer();
        org.jsoup.parser.Token.Comment comment39 = tokeniser36.commentPending;
        java.lang.StringBuilder stringBuilder40 = null;
        tokeniser36.dataBuffer = stringBuilder40;
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader42, parseErrorList43);
        org.jsoup.parser.Token.Doctype doctype45 = tokeniser44.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState46 = null;
        tokeniser44.transition(tokeniserState46);
        org.jsoup.parser.CharacterReader characterReader48 = null;
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.Tokeniser tokeniser50 = new org.jsoup.parser.Tokeniser(characterReader48, parseErrorList49);
        org.jsoup.parser.TokeniserState tokeniserState51 = tokeniser50.getState();
        tokeniser44.transition(tokeniserState51);
        org.jsoup.parser.CharacterReader characterReader53 = null;
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.Tokeniser tokeniser55 = new org.jsoup.parser.Tokeniser(characterReader53, parseErrorList54);
        org.jsoup.parser.Token.Tag tag57 = tokeniser55.createTagPending(false);
        tokeniser55.createTempBuffer();
        tokeniser55.createDoctypePending();
        org.jsoup.parser.Token.Tag tag61 = tokeniser55.createTagPending(true);
        tokeniser44.emit((org.jsoup.parser.Token) tag61);
        tokeniser36.tagPending = tag61;
        org.jsoup.parser.CharacterReader characterReader65 = new org.jsoup.parser.CharacterReader("");
        char char66 = characterReader65.current();
        java.lang.String str68 = characterReader65.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        org.jsoup.parser.Tokeniser tokeniser70 = new org.jsoup.parser.Tokeniser(characterReader65, parseErrorList69);
        java.lang.StringBuilder stringBuilder71 = null;
        tokeniser70.dataBuffer = stringBuilder71;
        org.jsoup.parser.Token.Tag tag74 = tokeniser70.createTagPending(true);
        tokeniser36.emit((org.jsoup.parser.Token) tag74);
        tokeniser26.tagPending = tag74;
        tokeniser10.tagPending = tag74;
        org.jsoup.parser.Token.Doctype doctype78 = tokeniser10.doctypePending;
        java.lang.Character char81 = tokeniser10.consumeCharacterReference((java.lang.Character) '\uffff', false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNull(comment16);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNull(comment39);
        org.junit.Assert.assertNull(doctype45);
        org.junit.Assert.assertNotNull(tokeniserState51);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertTrue("'" + char66 + "' != '" + '\uffff' + "'", char66 == '\uffff');
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(tag74);
        org.junit.Assert.assertNull(doctype78);
        org.junit.Assert.assertNull(char81);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        characterReader1.mark();
        boolean boolean10 = characterReader1.matches('\uffff');
        boolean boolean12 = characterReader1.matches("hi!");
        boolean boolean13 = characterReader1.matchesLetter();
        java.lang.String str14 = characterReader1.toString();
        int int15 = characterReader1.pos();
        java.lang.String str17 = characterReader1.consumeTo("hi!");
        characterReader1.rewindToMark();
        characterReader1.unconsume();
        boolean boolean20 = characterReader1.isEmpty();
        characterReader1.unconsume();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList5);
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser6.dataBuffer = stringBuilder7;
        org.jsoup.parser.Token.Tag tag10 = tokeniser6.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser6.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser6.getState();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        org.jsoup.parser.Token.Tag tag17 = tokeniser15.createTagPending(false);
        java.lang.StringBuilder stringBuilder18 = tokeniser15.dataBuffer;
        java.lang.StringBuilder stringBuilder19 = tokeniser15.dataBuffer;
        tokeniser15.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader21, parseErrorList22);
        org.jsoup.parser.Token.Doctype doctype24 = tokeniser23.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState25 = null;
        tokeniser23.transition(tokeniserState25);
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader27, parseErrorList28);
        org.jsoup.parser.TokeniserState tokeniserState30 = tokeniser29.getState();
        tokeniser23.transition(tokeniserState30);
        tokeniser23.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader33, parseErrorList34);
        java.lang.StringBuilder stringBuilder36 = null;
        tokeniser35.dataBuffer = stringBuilder36;
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader38, parseErrorList39);
        tokeniser40.createTempBuffer();
        tokeniser40.createTempBuffer();
        java.lang.StringBuilder stringBuilder43 = tokeniser40.dataBuffer;
        tokeniser35.dataBuffer = stringBuilder43;
        tokeniser23.dataBuffer = stringBuilder43;
        java.lang.StringBuilder stringBuilder46 = tokeniser23.dataBuffer;
        tokeniser15.dataBuffer = stringBuilder46;
        tokeniser6.dataBuffer = stringBuilder46;
        org.jsoup.parser.CharacterReader characterReader49 = null;
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader49, parseErrorList50);
        org.jsoup.parser.TokeniserState tokeniserState52 = tokeniser51.getState();
        tokeniser51.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState54 = tokeniser51.getState();
        tokeniser6.advanceTransition(tokeniserState54);
        org.jsoup.parser.CharacterReader characterReader56 = null;
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.Tokeniser tokeniser58 = new org.jsoup.parser.Tokeniser(characterReader56, parseErrorList57);
        org.jsoup.parser.Token.Tag tag60 = tokeniser58.createTagPending(false);
        org.jsoup.parser.Token.Comment comment61 = tokeniser58.commentPending;
        tokeniser58.emit('\uffff');
        tokeniser58.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader66 = new org.jsoup.parser.CharacterReader("");
        characterReader66.unconsume();
        boolean boolean69 = characterReader66.matchConsume("");
        org.jsoup.parser.ParseErrorList parseErrorList70 = null;
        org.jsoup.parser.Tokeniser tokeniser71 = new org.jsoup.parser.Tokeniser(characterReader66, parseErrorList70);
        org.jsoup.parser.Token.Tag tag73 = tokeniser71.createTagPending(true);
        tokeniser58.emit((org.jsoup.parser.Token) tag73);
        org.jsoup.parser.Token.Tag tag76 = tokeniser58.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype77 = tokeniser58.doctypePending;
        org.jsoup.parser.CharacterReader characterReader78 = null;
        org.jsoup.parser.ParseErrorList parseErrorList79 = null;
        org.jsoup.parser.Tokeniser tokeniser80 = new org.jsoup.parser.Tokeniser(characterReader78, parseErrorList79);
        org.jsoup.parser.TokeniserState tokeniserState81 = tokeniser80.getState();
        tokeniser80.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState83 = tokeniser80.getState();
        java.lang.StringBuilder stringBuilder84 = tokeniser80.dataBuffer;
        tokeniser80.emit('4');
        org.jsoup.parser.Token.Comment comment87 = tokeniser80.commentPending;
        tokeniser58.commentPending = comment87;
        tokeniser6.commentPending = comment87;
        org.jsoup.parser.TokeniserState tokeniserState90 = null;
        tokeniser6.transition(tokeniserState90);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(doctype11);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(stringBuilder18);
        org.junit.Assert.assertNull(stringBuilder19);
        org.junit.Assert.assertNull(doctype24);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals(stringBuilder43.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder46);
        org.junit.Assert.assertEquals(stringBuilder46.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState52);
        org.junit.Assert.assertNotNull(tokeniserState54);
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertNull(comment61);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertNotNull(tag76);
        org.junit.Assert.assertNotNull(doctype77);
        org.junit.Assert.assertNotNull(tokeniserState81);
        org.junit.Assert.assertNotNull(tokeniserState83);
        org.junit.Assert.assertNull(stringBuilder84);
        org.junit.Assert.assertNotNull(comment87);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        boolean boolean5 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag7 = tokeniser2.createTagPending(true);
        tokeniser2.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token9 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.isEmpty();
        characterReader1.advance();
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList6);
        characterReader1.mark();
        boolean boolean10 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean12 = characterReader1.matches("");
        boolean boolean13 = characterReader1.isEmpty();
        characterReader1.advance();
        boolean boolean16 = characterReader1.matchesIgnoreCase("");
        boolean boolean18 = characterReader1.matchesIgnoreCase("");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean5 = characterReader1.matchConsume("hi!");
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("hi!");
        char char8 = characterReader1.current();
        boolean boolean10 = characterReader1.matchConsumeIgnoreCase("hi!");
        java.lang.String str11 = characterReader1.toString();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        java.lang.String str9 = characterReader1.consumeToEnd();
        boolean boolean10 = characterReader1.matchesLetter();
        characterReader1.rewindToMark();
        char char12 = characterReader1.current();
        boolean boolean14 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str15 = characterReader1.consumeHexSequence();
        boolean boolean17 = characterReader1.matchConsume("hi");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.createCommentPending();
        tokeniser2.emit('\uffff');
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        org.jsoup.parser.Token.Tag tag13 = tokeniser11.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype14 = tokeniser11.doctypePending;
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader15, parseErrorList16);
        org.jsoup.parser.Token.Tag tag19 = tokeniser17.createTagPending(false);
        tokeniser11.tagPending = tag19;
        java.lang.StringBuilder stringBuilder21 = tokeniser11.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader22, parseErrorList23);
        org.jsoup.parser.TokeniserState tokeniserState25 = tokeniser24.getState();
        tokeniser11.transition(tokeniserState25);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNull(doctype14);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNull(stringBuilder21);
        org.junit.Assert.assertNotNull(tokeniserState25);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.Token.Tag tag11 = tokeniser9.createTagPending(false);
        tokeniser9.createTempBuffer();
        tokeniser9.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype14 = null;
        tokeniser9.doctypePending = doctype14;
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList17);
        org.jsoup.parser.Token.Tag tag20 = tokeniser18.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype21 = tokeniser18.doctypePending;
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader22, parseErrorList23);
        org.jsoup.parser.Token.Tag tag26 = tokeniser24.createTagPending(false);
        tokeniser18.tagPending = tag26;
        java.lang.StringBuilder stringBuilder28 = tokeniser18.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser18.getState();
        tokeniser9.transition(tokeniserState29);
        tokeniser2.transition(tokeniserState29);
        tokeniser2.emitTagPending();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNull(doctype21);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNull(stringBuilder28);
        org.junit.Assert.assertNotNull(tokeniserState29);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.createCommentPending();
        tokeniser2.emit('\uffff');
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        java.lang.StringBuilder stringBuilder12 = null;
        tokeniser11.dataBuffer = stringBuilder12;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        tokeniser16.createTempBuffer();
        tokeniser16.createTempBuffer();
        java.lang.StringBuilder stringBuilder19 = tokeniser16.dataBuffer;
        tokeniser11.dataBuffer = stringBuilder19;
        tokeniser2.dataBuffer = stringBuilder19;
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader22, parseErrorList23);
        tokeniser24.createTempBuffer();
        tokeniser24.emit("");
        java.lang.StringBuilder stringBuilder28 = tokeniser24.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder28;
        org.jsoup.parser.Token.Tag tag31 = tokeniser2.createTagPending(false);
        tokeniser2.emitCommentPending();
        tokeniser2.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char36 = tokeniser2.consumeCharacterReference((java.lang.Character) '\ufffd', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(tag31);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList5);
        java.lang.String str7 = characterReader1.consumeDigitSequence();
        boolean boolean8 = characterReader1.matchesLetter();
        java.lang.Class<?> wildcardClass9 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        char char4 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchesLetter();
        characterReader1.mark();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        char char9 = characterReader1.consume();
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str5 = characterReader1.consumeTo("hi!");
        boolean boolean7 = characterReader1.matches('\ufffd');
        char char8 = characterReader1.current();
        boolean boolean10 = characterReader1.containsIgnoreCase("");
        java.lang.String str12 = characterReader1.consumeTo('\ufffd');
        boolean boolean14 = characterReader1.containsIgnoreCase("i!");
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        char char17 = characterReader16.current();
        java.lang.String str18 = characterReader16.consumeHexSequence();
        boolean boolean19 = characterReader16.isEmpty();
        boolean boolean21 = characterReader16.matches('a');
        java.lang.String str22 = characterReader16.toString();
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        char char25 = characterReader24.current();
        java.lang.String str27 = characterReader24.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList28);
        char[] charArray34 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str35 = characterReader24.consumeToAny(charArray34);
        java.lang.String str36 = characterReader16.consumeToAny(charArray34);
        java.lang.String str37 = characterReader16.consumeLetterSequence();
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList38);
        java.lang.String str41 = characterReader16.consumeTo("");
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("");
        char char44 = characterReader43.current();
        java.lang.String str46 = characterReader43.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader43, parseErrorList47);
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("");
        char char51 = characterReader50.current();
        java.lang.String str52 = characterReader50.consumeHexSequence();
        boolean boolean53 = characterReader50.isEmpty();
        boolean boolean55 = characterReader50.matches('a');
        java.lang.String str56 = characterReader50.toString();
        org.jsoup.parser.CharacterReader characterReader58 = new org.jsoup.parser.CharacterReader("");
        char char59 = characterReader58.current();
        java.lang.String str61 = characterReader58.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList62 = null;
        org.jsoup.parser.Tokeniser tokeniser63 = new org.jsoup.parser.Tokeniser(characterReader58, parseErrorList62);
        char[] charArray68 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str69 = characterReader58.consumeToAny(charArray68);
        java.lang.String str70 = characterReader50.consumeToAny(charArray68);
        java.lang.String str71 = characterReader43.consumeToAny(charArray68);
        boolean boolean72 = characterReader16.matchesAny(charArray68);
        java.lang.String str73 = characterReader1.consumeToAny(charArray68);
        char char74 = characterReader1.consume();
        boolean boolean76 = characterReader1.matches('#');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\uffff' + "'", char17 == '\uffff');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\uffff' + "'", char25 == '\uffff');
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + char44 + "' != '" + '\uffff' + "'", char44 == '\uffff');
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + char51 + "' != '" + '\uffff' + "'", char51 == '\uffff');
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + char59 + "' != '" + '\uffff' + "'", char59 == '\uffff');
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + char74 + "' != '" + '\uffff' + "'", char74 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean9 = characterReader1.matches(' ');
        boolean boolean11 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean13 = characterReader1.matchConsume("hi!");
        java.lang.String str14 = characterReader1.consumeAsString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        boolean boolean11 = characterReader9.matches(' ');
        characterReader9.advance();
        characterReader9.unconsume();
        characterReader9.rewindToMark();
        boolean boolean15 = characterReader9.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        char char18 = characterReader17.current();
        java.lang.String str19 = characterReader17.consumeHexSequence();
        boolean boolean20 = characterReader17.isEmpty();
        boolean boolean22 = characterReader17.matches('a');
        java.lang.String str23 = characterReader17.toString();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        char char26 = characterReader25.current();
        java.lang.String str28 = characterReader25.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader25, parseErrorList29);
        char[] charArray35 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str36 = characterReader25.consumeToAny(charArray35);
        java.lang.String str37 = characterReader17.consumeToAny(charArray35);
        java.lang.String str38 = characterReader9.consumeToAny(charArray35);
        characterReader9.rewindToMark();
        boolean boolean41 = characterReader9.containsIgnoreCase("");
        boolean boolean42 = characterReader9.isEmpty();
        characterReader9.rewindToMark();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList44);
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader46, parseErrorList47);
        org.jsoup.parser.Token.Doctype doctype49 = tokeniser48.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState50 = null;
        tokeniser48.transition(tokeniserState50);
        org.jsoup.parser.CharacterReader characterReader52 = null;
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.Tokeniser tokeniser54 = new org.jsoup.parser.Tokeniser(characterReader52, parseErrorList53);
        org.jsoup.parser.TokeniserState tokeniserState55 = tokeniser54.getState();
        tokeniser48.transition(tokeniserState55);
        tokeniser48.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader58 = null;
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.Tokeniser tokeniser60 = new org.jsoup.parser.Tokeniser(characterReader58, parseErrorList59);
        java.lang.StringBuilder stringBuilder61 = null;
        tokeniser60.dataBuffer = stringBuilder61;
        org.jsoup.parser.CharacterReader characterReader63 = null;
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        org.jsoup.parser.Tokeniser tokeniser65 = new org.jsoup.parser.Tokeniser(characterReader63, parseErrorList64);
        tokeniser65.createTempBuffer();
        tokeniser65.createTempBuffer();
        java.lang.StringBuilder stringBuilder68 = tokeniser65.dataBuffer;
        tokeniser60.dataBuffer = stringBuilder68;
        tokeniser48.dataBuffer = stringBuilder68;
        tokeniser48.createCommentPending();
        tokeniser48.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader73 = null;
        org.jsoup.parser.ParseErrorList parseErrorList74 = null;
        org.jsoup.parser.Tokeniser tokeniser75 = new org.jsoup.parser.Tokeniser(characterReader73, parseErrorList74);
        tokeniser75.createTempBuffer();
        tokeniser75.createTempBuffer();
        tokeniser75.createTempBuffer();
        tokeniser75.createDoctypePending();
        tokeniser75.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype81 = tokeniser75.doctypePending;
        tokeniser48.doctypePending = doctype81;
        tokeniser45.emit((org.jsoup.parser.Token) doctype81);
        org.jsoup.parser.Token.Tag tag85 = tokeniser45.createTagPending(true);
        tokeniser2.tagPending = tag85;
        tokeniser2.createTempBuffer();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\uffff' + "'", char18 == '\uffff');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\uffff' + "'", char26 == '\uffff');
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(doctype49);
        org.junit.Assert.assertNotNull(tokeniserState55);
        org.junit.Assert.assertNotNull(stringBuilder68);
        org.junit.Assert.assertEquals(stringBuilder68.toString(), "");
        org.junit.Assert.assertNotNull(doctype81);
        org.junit.Assert.assertNotNull(tag85);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser9.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState11 = null;
        tokeniser9.transition(tokeniserState11);
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser15.getState();
        tokeniser9.transition(tokeniserState16);
        tokeniser9.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        java.lang.StringBuilder stringBuilder22 = null;
        tokeniser21.dataBuffer = stringBuilder22;
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList25);
        tokeniser26.createTempBuffer();
        tokeniser26.createTempBuffer();
        java.lang.StringBuilder stringBuilder29 = tokeniser26.dataBuffer;
        tokeniser21.dataBuffer = stringBuilder29;
        tokeniser9.dataBuffer = stringBuilder29;
        tokeniser2.dataBuffer = stringBuilder29;
        tokeniser2.emitDoctypePending();
        java.lang.StringBuilder stringBuilder34 = tokeniser2.dataBuffer;
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        java.lang.String str5 = characterReader1.consumeTo("hi!");
        boolean boolean6 = characterReader1.matchesDigit();
        int int7 = characterReader1.pos();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        char char10 = characterReader9.current();
        java.lang.String str11 = characterReader9.consumeHexSequence();
        boolean boolean12 = characterReader9.isEmpty();
        boolean boolean14 = characterReader9.matches('a');
        java.lang.String str15 = characterReader9.toString();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        char char18 = characterReader17.current();
        java.lang.String str20 = characterReader17.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList21);
        char[] charArray27 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str28 = characterReader17.consumeToAny(charArray27);
        java.lang.String str29 = characterReader9.consumeToAny(charArray27);
        boolean boolean30 = characterReader1.matchesAny(charArray27);
        java.lang.String str31 = characterReader1.consumeHexSequence();
        characterReader1.advance();
        characterReader1.advance();
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\uffff' + "'", char18 == '\uffff');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.isEmpty();
        characterReader1.advance();
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList6);
        characterReader1.advance();
        boolean boolean10 = characterReader1.matchesIgnoreCase("hi!");
        int int11 = characterReader1.pos();
        char char12 = characterReader1.consume();
        boolean boolean13 = characterReader1.matchesLetter();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        int int7 = characterReader1.pos();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList8);
        java.lang.String str10 = characterReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("");
        char char9 = characterReader1.consume();
        boolean boolean11 = characterReader1.matches("i!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matchesDigit();
        java.lang.String str6 = characterReader1.consumeToEnd();
        boolean boolean7 = characterReader1.isEmpty();
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        char char10 = characterReader9.current();
        java.lang.String str12 = characterReader9.consumeTo('#');
        java.lang.String str14 = characterReader9.consumeTo("");
        java.lang.String str16 = characterReader9.consumeTo("hi!");
        int int17 = characterReader9.pos();
        boolean boolean18 = characterReader9.matchesDigit();
        java.lang.String str19 = characterReader9.consumeToEnd();
        java.lang.String str21 = characterReader9.consumeTo('#');
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        char char24 = characterReader23.current();
        java.lang.String str25 = characterReader23.consumeLetterSequence();
        java.lang.String str26 = characterReader23.consumeDigitSequence();
        char char27 = characterReader23.consume();
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader23, parseErrorList28);
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("");
        char char32 = characterReader31.current();
        java.lang.String str34 = characterReader31.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader31, parseErrorList35);
        char[] charArray41 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str42 = characterReader31.consumeToAny(charArray41);
        org.jsoup.parser.CharacterReader characterReader44 = new org.jsoup.parser.CharacterReader("");
        boolean boolean46 = characterReader44.matches(' ');
        characterReader44.advance();
        characterReader44.unconsume();
        characterReader44.advance();
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("");
        char char52 = characterReader51.current();
        java.lang.String str53 = characterReader51.consumeHexSequence();
        java.lang.String str55 = characterReader51.consumeTo("hi!");
        org.jsoup.parser.CharacterReader characterReader57 = new org.jsoup.parser.CharacterReader("");
        char char58 = characterReader57.current();
        java.lang.String str60 = characterReader57.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.Tokeniser tokeniser62 = new org.jsoup.parser.Tokeniser(characterReader57, parseErrorList61);
        char[] charArray67 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str68 = characterReader57.consumeToAny(charArray67);
        boolean boolean69 = characterReader51.matchesAny(charArray67);
        boolean boolean70 = characterReader44.matchesAny(charArray67);
        boolean boolean71 = characterReader31.matchesAny(charArray67);
        java.lang.String str72 = characterReader23.consumeToAny(charArray67);
        java.lang.String str73 = characterReader9.consumeToAny(charArray67);
        boolean boolean74 = characterReader1.matchesAny(charArray67);
        java.lang.String str75 = characterReader1.consumeToEnd();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\uffff' + "'", char24 == '\uffff');
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\uffff' + "'", char27 == '\uffff');
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\uffff' + "'", char32 == '\uffff');
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + char52 + "' != '" + '\uffff' + "'", char52 == '\uffff');
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + char58 + "' != '" + '\uffff' + "'", char58 == '\uffff');
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        boolean boolean10 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str11 = characterReader1.consumeLetterSequence();
        boolean boolean13 = characterReader1.matchConsumeIgnoreCase("i!");
        boolean boolean15 = characterReader1.matchesIgnoreCase("");
        boolean boolean16 = characterReader1.matchesLetter();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        java.lang.String str9 = characterReader1.consumeToEnd();
        boolean boolean10 = characterReader1.matchesLetter();
        boolean boolean12 = characterReader1.matchesIgnoreCase("i!");
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        java.lang.String str8 = characterReader1.consumeTo("hi!");
        int int9 = characterReader1.pos();
        boolean boolean10 = characterReader1.matchesDigit();
        java.lang.String str11 = characterReader1.consumeToEnd();
        boolean boolean13 = characterReader1.matches(' ');
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList14);
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        char char18 = characterReader17.current();
        java.lang.String str20 = characterReader17.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList21);
        java.lang.StringBuilder stringBuilder23 = null;
        tokeniser22.dataBuffer = stringBuilder23;
        org.jsoup.parser.Token.Tag tag26 = tokeniser22.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState27 = tokeniser22.getState();
        tokeniser15.transition(tokeniserState27);
        org.jsoup.parser.Token.Tag tag30 = tokeniser15.createTagPending(true);
        org.jsoup.parser.Token.Comment comment31 = tokeniser15.commentPending;
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\uffff' + "'", char18 == '\uffff');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNull(comment31);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment6 = tokeniser2.commentPending;
        tokeniser2.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token8 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(comment6);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.createCommentPending();
        tokeniser2.emit('\uffff');
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        java.lang.StringBuilder stringBuilder12 = null;
        tokeniser11.dataBuffer = stringBuilder12;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        tokeniser16.createTempBuffer();
        tokeniser16.createTempBuffer();
        java.lang.StringBuilder stringBuilder19 = tokeniser16.dataBuffer;
        tokeniser11.dataBuffer = stringBuilder19;
        tokeniser2.dataBuffer = stringBuilder19;
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader22, parseErrorList23);
        tokeniser24.createTempBuffer();
        tokeniser24.emit("");
        java.lang.StringBuilder stringBuilder28 = tokeniser24.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder28;
        org.jsoup.parser.Token.Doctype doctype30 = tokeniser2.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = doctype30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNull(doctype30);
    }
}

