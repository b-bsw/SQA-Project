package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        char char0 = org.jsoup.parser.CharacterReader.EOF;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\uffff' + "'", char0 == '\uffff');
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        org.jsoup.parser.TokeniserState tokeniserState7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.TokeniserState tokeniserState5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token7 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        char char4 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser2.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype3);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        char char0 = org.jsoup.parser.Tokeniser.replacementChar;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\ufffd' + "'", char0 == '\ufffd');
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        org.jsoup.parser.TokeniserState tokeniserState9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = tokeniser6.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList5);
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser6.dataBuffer = stringBuilder7;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser6.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
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
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList12);
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser13.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.unconsume();
        boolean boolean4 = characterReader1.matchConsume("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        char char4 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
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
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser11.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = tokeniser2.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader4, parseErrorList5);
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser6.getState();
        tokeniser6.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser6.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = null;
        tokeniser2.dataBuffer = stringBuilder5;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.emit("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = characterReader1.consumeTo("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Tag tag8 = tokeniser2.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser11.getState();
        tokeniser11.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser11.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype5 = tokeniser2.doctypePending;
        tokeniser2.emitTagPending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = tokeniser2.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader5, parseErrorList6);
        org.jsoup.parser.Token.Doctype doctype8 = tokeniser7.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState9 = null;
        tokeniser7.transition(tokeniserState9);
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList12);
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser13.getState();
        tokeniser7.transition(tokeniserState14);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype8);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNotNull(tokeniserState16);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Comment comment7 = tokeniser2.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token8 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment7);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean9 = characterReader1.matchesIgnoreCase("");
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader4, parseErrorList5);
        org.jsoup.parser.Token.Doctype doctype7 = tokeniser6.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState8 = null;
        tokeniser6.transition(tokeniserState8);
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser12.getState();
        tokeniser6.transition(tokeniserState13);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype7);
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        org.jsoup.parser.Token.Tag tag5 = tokeniser2.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNull(tag5);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        boolean boolean6 = tokeniser2.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = tokeniser2.consumeCharacterReference((java.lang.Character) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNull(stringBuilder6);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser10.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader3, parseErrorList4);
        org.jsoup.parser.TokeniserState tokeniserState6 = tokeniser5.getState();
        tokeniser5.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser5.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState6);
        org.junit.Assert.assertNotNull(tokeniserState8);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.isEmpty();
        characterReader1.advance();
        boolean boolean6 = characterReader1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str5 = characterReader1.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList6);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser7.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.createTempBuffer();
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser2.dataBuffer = stringBuilder7;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = tokeniser2.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Tag tag8 = tokeniser2.createTagPending(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token9 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = tokeniser2.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Comment comment7 = tokeniser2.commentPending;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser10.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState12 = null;
        tokeniser10.transition(tokeniserState12);
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser16.getState();
        tokeniser10.transition(tokeniserState17);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertNull(doctype11);
        org.junit.Assert.assertNotNull(tokeniserState17);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader4, parseErrorList5);
        org.jsoup.parser.Token.Doctype doctype7 = tokeniser6.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState8 = null;
        tokeniser6.transition(tokeniserState8);
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser12.getState();
        tokeniser6.transition(tokeniserState13);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNull(doctype7);
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader5, parseErrorList6);
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser7.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tokeniserState8);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment7 = tokeniser2.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token8 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(comment7);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token10 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        java.lang.String str8 = characterReader1.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList9);
        java.lang.String str11 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token6 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.emit("hi!");
        org.jsoup.parser.Token.Tag tag8 = tokeniser2.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char11 = tokeniser2.consumeCharacterReference((java.lang.Character) '\uffff', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag8);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader5, parseErrorList6);
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser7.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState8);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype5 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser8.getState();
        tokeniser8.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser8.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
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
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser15.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState17 = null;
        tokeniser15.transition(tokeniserState17);
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser21.getState();
        tokeniser15.transition(tokeniserState22);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(stringBuilder12);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNotNull(tokeniserState22);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        tokeniser2.emit('\ufffd');
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = null;
        tokeniser2.dataBuffer = stringBuilder5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment6 = tokeniser2.commentPending;
        boolean boolean7 = tokeniser2.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token8 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        boolean boolean6 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser2.getState();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser10.getState();
        tokeniser10.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser10.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Tag tag8 = tokeniser2.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser11.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser10.getState();
        tokeniser10.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser10.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
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
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser14.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState16 = null;
        tokeniser14.transition(tokeniserState16);
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList19);
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser20.getState();
        tokeniser14.transition(tokeniserState21);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNotNull(tokeniserState21);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.emit("hi!");
        org.jsoup.parser.Token.Tag tag8 = tokeniser2.tagPending;
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        char char11 = characterReader10.current();
        java.lang.String str13 = characterReader10.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList14);
        java.lang.StringBuilder stringBuilder16 = null;
        tokeniser15.dataBuffer = stringBuilder16;
        org.jsoup.parser.Token.Tag tag19 = tokeniser15.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser15.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag8);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tokeniserState20);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        java.lang.String str8 = characterReader1.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList9);
        tokeniser10.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = tokeniser10.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean6 = characterReader1.matches('a');
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList7);
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        org.jsoup.parser.Token.Tag tag13 = tokeniser11.createTagPending(false);
        tokeniser11.createTempBuffer();
        boolean boolean15 = tokeniser11.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser11.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser8.eofError(tokeniserState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tokeniserState16);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = tokeniser6.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str5 = characterReader1.consumeTo("hi!");
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype5 = tokeniser2.doctypePending;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.Token.Tag tag11 = tokeniser9.createTagPending(false);
        org.jsoup.parser.Token.Comment comment12 = tokeniser9.commentPending;
        tokeniser9.emit('\uffff');
        tokeniser9.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        char char18 = characterReader17.current();
        java.lang.String str20 = characterReader17.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList21);
        java.lang.StringBuilder stringBuilder23 = null;
        tokeniser22.dataBuffer = stringBuilder23;
        org.jsoup.parser.Token.Tag tag26 = tokeniser22.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState27 = tokeniser22.getState();
        tokeniser9.transition(tokeniserState27);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNull(doctype6);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(comment12);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\uffff' + "'", char18 == '\uffff');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tokeniserState27);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        boolean boolean6 = tokeniser2.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token7 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Comment comment7 = tokeniser2.commentPending;
        tokeniser2.emit('\uffff');
        tokeniser2.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment7);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        java.lang.String str9 = characterReader1.consumeToEnd();
        boolean boolean10 = characterReader1.matchesLetter();
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = characterReader1.consumeTo("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean6 = characterReader1.matches('a');
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList7);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser8.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader4, parseErrorList5);
        org.jsoup.parser.Token.Tag tag8 = tokeniser6.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype9 = tokeniser6.doctypePending;
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser6.doctypePending;
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList12);
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser13.getState();
        tokeniser13.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser13.getState();
        tokeniser6.transition(tokeniserState16);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNull(doctype9);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(tokeniserState16);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        boolean boolean5 = tokeniser2.currentNodeInHtmlNS();
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        org.jsoup.parser.TokeniserState tokeniserState8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        java.lang.String str7 = characterReader1.consumeAsString();
        boolean boolean8 = characterReader1.isEmpty();
        boolean boolean10 = characterReader1.matchConsume("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser2.getState();
        boolean boolean6 = tokeniser2.currentNodeInHtmlNS();
        tokeniser2.emitCommentPending();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.Token.Tag tag12 = tokeniser10.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser10.doctypePending;
        org.jsoup.parser.Token.Doctype doctype14 = tokeniser10.doctypePending;
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader15, parseErrorList16);
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser17.getState();
        tokeniser17.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser17.getState();
        tokeniser10.transition(tokeniserState20);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype13);
        org.junit.Assert.assertNull(doctype14);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState20);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.createTempBuffer();
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser2.dataBuffer = stringBuilder7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment6 = tokeniser2.commentPending;
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        char char9 = characterReader8.current();
        java.lang.String str11 = characterReader8.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList12);
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser13.dataBuffer = stringBuilder14;
        org.jsoup.parser.Token.Tag tag17 = tokeniser13.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser13.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tokeniserState18);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.emit(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = tokeniser2.consumeCharacterReference((java.lang.Character) '\ufffd', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser2.doctypePending;
        tokeniser2.emit('\uffff');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char11 = tokeniser2.consumeCharacterReference((java.lang.Character) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype6);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.createTempBuffer();
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser2.dataBuffer = stringBuilder7;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        boolean boolean5 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag7 = tokeniser2.createTagPending(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char10 = tokeniser2.consumeCharacterReference((java.lang.Character) '\uffff', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean6 = characterReader1.matches('a');
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList7);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser8.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        boolean boolean6 = characterReader1.matches("hi!");
        char char7 = characterReader1.current();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.emit("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        org.jsoup.parser.TokeniserState tokeniserState9 = null;
        tokeniser2.transition(tokeniserState9);
        java.lang.Class<?> wildcardClass11 = tokeniser2.getClass();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.Token.Tag tag11 = tokeniser9.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser9.doctypePending;
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        org.jsoup.parser.Token.Tag tag17 = tokeniser15.createTagPending(false);
        tokeniser9.tagPending = tag17;
        java.lang.StringBuilder stringBuilder19 = tokeniser9.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser9.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype6);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(stringBuilder19);
        org.junit.Assert.assertNotNull(tokeniserState20);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        char char4 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchesLetter();
        characterReader1.mark();
        boolean boolean8 = characterReader1.matches('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeTo('\ufffd');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        org.jsoup.parser.TokeniserState tokeniserState9 = null;
        tokeniser2.transition(tokeniserState9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char13 = tokeniser2.consumeCharacterReference((java.lang.Character) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        tokeniser2.emit("");
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        org.jsoup.parser.Token.Tag tag14 = tokeniser12.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser12.doctypePending;
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList17);
        org.jsoup.parser.Token.Tag tag20 = tokeniser18.createTagPending(false);
        tokeniser12.tagPending = tag20;
        java.lang.StringBuilder stringBuilder22 = tokeniser12.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser12.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNull(stringBuilder22);
        org.junit.Assert.assertNotNull(tokeniserState23);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        tokeniser2.emitTagPending();
        java.lang.Class<?> wildcardClass7 = tokeniser2.getClass();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        characterReader1.mark();
        boolean boolean10 = characterReader1.matches('\uffff');
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        java.lang.StringBuilder stringBuilder10 = null;
        tokeniser9.dataBuffer = stringBuilder10;
        org.jsoup.parser.Token.Comment comment12 = tokeniser9.commentPending;
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser9.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser9.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype6);
        org.junit.Assert.assertNull(comment12);
        org.junit.Assert.assertNull(doctype13);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        boolean boolean4 = characterReader1.matchesLetter();
        boolean boolean6 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str7 = characterReader1.consumeToEnd();
        java.lang.String str9 = characterReader1.consumeTo('4');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        java.lang.StringBuilder stringBuilder11 = null;
        tokeniser10.dataBuffer = stringBuilder11;
        tokeniser10.acknowledgeSelfClosingFlag();
        tokeniser10.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser10.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(tokeniserState15);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.emit("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = tokeniser2.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        tokeniser2.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = tokeniser2.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        tokeniser2.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char11 = tokeniser2.consumeCharacterReference((java.lang.Character) '\uffff', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        java.lang.String str7 = characterReader1.consumeAsString();
        boolean boolean8 = characterReader1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.Token.Tag tag11 = tokeniser9.createTagPending(false);
        org.jsoup.parser.Token.Comment comment12 = tokeniser9.commentPending;
        tokeniser9.emit('\uffff');
        tokeniser9.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        char char18 = characterReader17.current();
        java.lang.String str20 = characterReader17.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList21);
        java.lang.StringBuilder stringBuilder23 = null;
        tokeniser22.dataBuffer = stringBuilder23;
        org.jsoup.parser.Token.Tag tag26 = tokeniser22.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState27 = tokeniser22.getState();
        tokeniser9.transition(tokeniserState27);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(comment12);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\uffff' + "'", char18 == '\uffff');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tokeniserState27);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.emit('\uffff');
        tokeniser2.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        char char11 = characterReader10.current();
        java.lang.String str13 = characterReader10.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList14);
        java.lang.StringBuilder stringBuilder16 = null;
        tokeniser15.dataBuffer = stringBuilder16;
        org.jsoup.parser.Token.Tag tag19 = tokeniser15.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser15.getState();
        tokeniser2.transition(tokeniserState20);
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader22, parseErrorList23);
        org.jsoup.parser.Token.Tag tag26 = tokeniser24.createTagPending(false);
        tokeniser24.createTempBuffer();
        tokeniser24.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype29 = null;
        tokeniser24.doctypePending = doctype29;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader31, parseErrorList32);
        org.jsoup.parser.Token.Tag tag35 = tokeniser33.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype36 = tokeniser33.doctypePending;
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader37, parseErrorList38);
        org.jsoup.parser.Token.Tag tag41 = tokeniser39.createTagPending(false);
        tokeniser33.tagPending = tag41;
        java.lang.StringBuilder stringBuilder43 = tokeniser33.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState44 = tokeniser33.getState();
        tokeniser24.transition(tokeniserState44);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNull(doctype36);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNull(stringBuilder43);
        org.junit.Assert.assertNotNull(tokeniserState44);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser11.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str5 = characterReader1.consumeTo("hi!");
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = characterReader1.matches('\ufffd');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean9 = characterReader1.matchesIgnoreCase("");
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token5 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser10.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState12 = null;
        tokeniser10.transition(tokeniserState12);
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser16.getState();
        tokeniser10.transition(tokeniserState17);
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        org.jsoup.parser.Token.Tag tag23 = tokeniser21.createTagPending(false);
        tokeniser21.createTempBuffer();
        tokeniser21.createDoctypePending();
        org.jsoup.parser.Token.Tag tag27 = tokeniser21.createTagPending(true);
        tokeniser10.emit((org.jsoup.parser.Token) tag27);
        tokeniser2.tagPending = tag27;
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader30, parseErrorList31);
        org.jsoup.parser.Token.Tag tag34 = tokeniser32.createTagPending(false);
        tokeniser32.createTempBuffer();
        boolean boolean36 = tokeniser32.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser32.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(doctype11);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(tokeniserState37);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
        java.lang.String str25 = characterReader1.toString();
        java.lang.Class<?> wildcardClass26 = characterReader1.getClass();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char8 = tokeniser2.consumeCharacterReference((java.lang.Character) '\uffff', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser2.doctypePending;
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
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser11.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype6);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState21);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Comment comment6 = tokeniser2.commentPending;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        java.lang.StringBuilder stringBuilder10 = null;
        tokeniser9.dataBuffer = stringBuilder10;
        org.jsoup.parser.Token.Comment comment12 = tokeniser9.commentPending;
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser9.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser9.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNull(comment12);
        org.junit.Assert.assertNull(doctype13);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        tokeniser2.createCommentPending();
        tokeniser2.emit('\uffff');
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser12.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        org.jsoup.parser.Token.Comment comment8 = tokeniser2.commentPending;
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(comment8);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNotNull(tokeniserState18);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList22);
        org.jsoup.parser.Token.Comment comment24 = tokeniser23.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser23.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(comment24);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        java.lang.String str8 = characterReader1.consumeTo("hi!");
        int int9 = characterReader1.pos();
        boolean boolean11 = characterReader1.matchConsumeIgnoreCase("hi!");
        characterReader1.mark();
        java.lang.String str13 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.emit("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str5 = characterReader1.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList6);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser7.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.toString();
        characterReader1.mark();
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        java.lang.String str8 = characterReader1.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList9);
        tokeniser10.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        tokeniser14.createTempBuffer();
        tokeniser14.createTempBuffer();
        org.jsoup.parser.Token.Comment comment17 = tokeniser14.commentPending;
        java.lang.StringBuilder stringBuilder18 = null;
        tokeniser14.dataBuffer = stringBuilder18;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        org.jsoup.parser.Token.Doctype doctype23 = tokeniser22.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState24 = null;
        tokeniser22.transition(tokeniserState24);
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader26, parseErrorList27);
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser28.getState();
        tokeniser22.transition(tokeniserState29);
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader31, parseErrorList32);
        org.jsoup.parser.Token.Tag tag35 = tokeniser33.createTagPending(false);
        tokeniser33.createTempBuffer();
        tokeniser33.createDoctypePending();
        org.jsoup.parser.Token.Tag tag39 = tokeniser33.createTagPending(true);
        tokeniser22.emit((org.jsoup.parser.Token) tag39);
        tokeniser14.tagPending = tag39;
        tokeniser10.emit((org.jsoup.parser.Token) tag39);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser10.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(comment17);
        org.junit.Assert.assertNull(doctype23);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(tag39);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        tokeniser2.emitTagPending();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = tokeniser2.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(stringBuilder12);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        char char4 = characterReader1.consume();
        characterReader1.rewindToMark();
        java.lang.String str6 = characterReader1.toString();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean8 = characterReader1.matchConsume("");
        java.lang.String str9 = characterReader1.consumeToEnd();
        java.lang.String str10 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        boolean boolean6 = characterReader1.matches("hi!");
        int int7 = characterReader1.pos();
        boolean boolean8 = characterReader1.matchesDigit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.Token.Tag tag11 = tokeniser9.createTagPending(false);
        java.lang.StringBuilder stringBuilder12 = tokeniser9.dataBuffer;
        java.lang.StringBuilder stringBuilder13 = tokeniser9.dataBuffer;
        tokeniser9.createCommentPending();
        tokeniser9.emit('\uffff');
        tokeniser9.acknowledgeSelfClosingFlag();
        tokeniser9.emit("hi!");
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser9.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(stringBuilder12);
        org.junit.Assert.assertNull(stringBuilder13);
        org.junit.Assert.assertNotNull(tokeniserState20);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("hi!");
        boolean boolean9 = characterReader1.matchesIgnoreCase("");
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            char char11 = characterReader1.current();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser2.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = null;
        tokeniser2.transition(tokeniserState4);
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser2.doctypePending = doctype6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype3);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        boolean boolean5 = tokeniser2.currentNodeInHtmlNS();
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char10 = tokeniser2.consumeCharacterReference((java.lang.Character) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        boolean boolean6 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        java.lang.StringBuilder stringBuilder10 = null;
        tokeniser9.dataBuffer = stringBuilder10;
        org.jsoup.parser.Token.Tag tag12 = null;
        tokeniser9.tagPending = tag12;
        org.jsoup.parser.Token.Tag tag14 = tokeniser9.tagPending;
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        char char17 = characterReader16.current();
        java.lang.String str18 = characterReader16.consumeLetterSequence();
        java.lang.String str20 = characterReader16.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList21);
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader23, parseErrorList24);
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser25.getState();
        tokeniser25.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser25.getState();
        tokeniser22.advanceTransition(tokeniserState28);
        tokeniser9.transition(tokeniserState28);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(tag14);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\uffff' + "'", char17 == '\uffff');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNotNull(tokeniserState28);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList5);
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser6.dataBuffer = stringBuilder7;
        org.jsoup.parser.Token.Tag tag10 = tokeniser6.createTagPending(true);
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser6.commentPending = comment11;
        tokeniser6.emit("hi!");
        org.jsoup.parser.Token.Comment comment15 = tokeniser6.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = comment15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(comment15);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.emit("hi!");
        org.jsoup.parser.Token.Tag tag8 = tokeniser2.tagPending;
        tokeniser2.emit('\ufffd');
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag8);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        boolean boolean5 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag7 = tokeniser2.createTagPending(true);
        tokeniser2.createTempBuffer();
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
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser11.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState21);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.emit("hi!");
        org.jsoup.parser.Token.Tag tag8 = tokeniser2.tagPending;
        tokeniser2.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char12 = tokeniser2.consumeCharacterReference((java.lang.Character) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag8);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList5);
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser6.dataBuffer = stringBuilder7;
        org.jsoup.parser.Token.Tag tag10 = tokeniser6.createTagPending(true);
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser6.commentPending = comment11;
        org.jsoup.parser.TokeniserState tokeniserState13 = null;
        tokeniser6.transition(tokeniserState13);
        org.jsoup.parser.TokeniserState tokeniserState15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser6.error(tokeniserState15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        org.jsoup.parser.CharacterReader characterReader17 = new org.jsoup.parser.CharacterReader("");
        char char18 = characterReader17.current();
        java.lang.String str20 = characterReader17.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList21);
        java.lang.StringBuilder stringBuilder23 = null;
        tokeniser22.dataBuffer = stringBuilder23;
        org.jsoup.parser.Token.Tag tag26 = tokeniser22.createTagPending(true);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emit((org.jsoup.parser.Token) tag26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\uffff' + "'", char18 == '\uffff');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(tag26);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str5 = characterReader1.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList6);
        org.jsoup.parser.Token.Doctype doctype8 = null;
        tokeniser7.doctypePending = doctype8;
        tokeniser7.createCommentPending();
        org.jsoup.parser.Token.Tag tag11 = tokeniser7.tagPending;
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(tag11);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        java.lang.Class<?> wildcardClass30 = tokeniser2.getClass();
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList22);
        java.lang.Character char26 = tokeniser23.consumeCharacterReference((java.lang.Character) 'a', false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = tokeniser23.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(char26);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        boolean boolean38 = characterReader1.matchConsume("hi!");
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            char char40 = characterReader1.current();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = tokeniser2.consumeCharacterReference((java.lang.Character) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str5 = characterReader1.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList6);
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser10.getState();
        tokeniser10.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser10.getState();
        tokeniser7.advanceTransition(tokeniserState13);
        org.jsoup.parser.Token token15 = tokeniser7.read();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser7.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(token15);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.createCommentPending();
        tokeniser2.emit('\uffff');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char11 = tokeniser2.consumeCharacterReference((java.lang.Character) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser2.getState();
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        tokeniser2.emit('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char11 = tokeniser2.consumeCharacterReference((java.lang.Character) '\ufffd', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNull(stringBuilder6);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        char char4 = characterReader1.consume();
        characterReader1.unconsume();
        java.lang.String str6 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList5);
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser6.dataBuffer = stringBuilder7;
        org.jsoup.parser.Token.Tag tag10 = tokeniser6.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser6.getState();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = tokeniser6.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        boolean boolean4 = characterReader1.matchesLetter();
        boolean boolean6 = characterReader1.matchConsumeIgnoreCase("");
        characterReader1.mark();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
            tokeniser2.advanceTransition(tokeniserState25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNull(doctype14);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNull(stringBuilder21);
        org.junit.Assert.assertNotNull(tokeniserState25);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str5 = characterReader1.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList6);
        org.jsoup.parser.Token.Doctype doctype8 = null;
        tokeniser7.doctypePending = doctype8;
        tokeniser7.createCommentPending();
        java.lang.Character char13 = tokeniser7.consumeCharacterReference((java.lang.Character) '#', false);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(char13);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser8.getState();
        tokeniser8.createCommentPending();
        boolean boolean11 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag13 = tokeniser8.createTagPending(true);
        tokeniser8.emit("");
        tokeniser8.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment17 = tokeniser8.commentPending;
        tokeniser2.commentPending = comment17;
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        char char21 = characterReader20.current();
        java.lang.String str22 = characterReader20.consumeLetterSequence();
        java.lang.String str24 = characterReader20.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList25);
        org.jsoup.parser.Token.Doctype doctype27 = null;
        tokeniser26.doctypePending = doctype27;
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader29, parseErrorList30);
        org.jsoup.parser.Token.Tag tag33 = tokeniser31.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype34 = tokeniser31.doctypePending;
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader35, parseErrorList36);
        org.jsoup.parser.Token.Tag tag39 = tokeniser37.createTagPending(false);
        tokeniser31.tagPending = tag39;
        java.lang.StringBuilder stringBuilder41 = tokeniser31.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader42, parseErrorList43);
        org.jsoup.parser.TokeniserState tokeniserState45 = tokeniser44.getState();
        tokeniser31.transition(tokeniserState45);
        tokeniser26.transition(tokeniserState45);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(comment17);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\uffff' + "'", char21 == '\uffff');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNull(doctype34);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNull(stringBuilder41);
        org.junit.Assert.assertNotNull(tokeniserState45);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader5, parseErrorList6);
        tokeniser7.createTempBuffer();
        tokeniser7.createTempBuffer();
        java.lang.StringBuilder stringBuilder10 = tokeniser7.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder10;
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser2.getState();
        java.lang.Class<?> wildcardClass13 = tokeniserState12.getClass();
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        java.lang.String str8 = characterReader1.consumeTo("hi!");
        boolean boolean10 = characterReader1.matchesIgnoreCase("");
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        tokeniser2.emitTagPending();
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(stringBuilder12);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser2.doctypePending = doctype6;
        org.jsoup.parser.Token.Comment comment8 = null;
        tokeniser2.commentPending = comment8;
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        char char13 = characterReader12.current();
        java.lang.String str14 = characterReader12.consumeLetterSequence();
        java.lang.String str16 = characterReader12.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList17);
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser21.getState();
        tokeniser21.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser21.getState();
        tokeniser18.advanceTransition(tokeniserState24);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNotNull(tokeniserState24);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char13 = tokeniser2.consumeCharacterReference((java.lang.Character) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        org.jsoup.parser.Token.Tag tag7 = tokeniser2.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char10 = tokeniser2.consumeCharacterReference((java.lang.Character) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag7);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token7 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        tokeniser2.emitTagPending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = tokeniser2.consumeCharacterReference((java.lang.Character) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.emit('\uffff');
        tokeniser2.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        char char11 = characterReader10.current();
        java.lang.String str13 = characterReader10.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList14);
        java.lang.StringBuilder stringBuilder16 = null;
        tokeniser15.dataBuffer = stringBuilder16;
        org.jsoup.parser.Token.Tag tag19 = tokeniser15.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser15.getState();
        tokeniser2.transition(tokeniserState20);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tokeniserState20);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.advance();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment6 = tokeniser2.commentPending;
        boolean boolean7 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment8 = tokeniser2.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(comment8);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser2.getState();
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        tokeniser2.emit('4');
        org.jsoup.parser.Token.Comment comment9 = tokeniser2.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNotNull(comment9);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser2.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = null;
        tokeniser2.transition(tokeniserState4);
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser2.doctypePending = doctype6;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser10.getState();
        tokeniser10.createCommentPending();
        boolean boolean13 = tokeniser10.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser10.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        int int9 = characterReader1.pos();
        java.lang.String str10 = characterReader1.consumeAsString();
        boolean boolean12 = characterReader1.matches("");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        tokeniser2.emit("");
        java.lang.Class<?> wildcardClass11 = tokeniser2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser2.doctypePending = doctype6;
        boolean boolean8 = tokeniser2.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser2.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState5);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Comment comment6 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = tokeniser2.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(comment6);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment6 = tokeniser2.commentPending;
        boolean boolean7 = tokeniser2.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean8 = characterReader1.matchConsume("");
        java.lang.String str9 = characterReader1.consumeHexSequence();
        java.lang.Class<?> wildcardClass10 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader5 = new org.jsoup.parser.CharacterReader("");
        boolean boolean7 = characterReader5.matches(' ');
        characterReader5.advance();
        characterReader5.unconsume();
        characterReader5.rewindToMark();
        boolean boolean12 = characterReader5.matchConsume("");
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader5, parseErrorList13);
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader15, parseErrorList16);
        org.jsoup.parser.Token.Tag tag19 = tokeniser17.createTagPending(false);
        org.jsoup.parser.Token.Comment comment20 = tokeniser17.commentPending;
        org.jsoup.parser.Token.Doctype doctype21 = null;
        tokeniser17.doctypePending = doctype21;
        tokeniser17.createTempBuffer();
        java.lang.StringBuilder stringBuilder24 = tokeniser17.dataBuffer;
        boolean boolean25 = tokeniser17.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser17.getState();
        tokeniser14.advanceTransition(tokeniserState26);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNull(comment20);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tokeniserState26);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        characterReader1.mark();
        boolean boolean10 = characterReader1.matches('\uffff');
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = characterReader1.consumeTo('a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
        characterReader1.rewindToMark();
        char[] charArray37 = new char[] { '\uffff' };
        java.lang.String str38 = characterReader1.consumeToAny(charArray37);
        char char39 = characterReader1.current();
        char char40 = characterReader1.consume();
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
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '\uffff' });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + '\uffff' + "'", char39 == '\uffff');
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + '\uffff' + "'", char40 == '\uffff');
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.Token.Tag tag11 = tokeniser9.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser9.doctypePending;
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser9.doctypePending;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser16.getState();
        tokeniser16.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser16.getState();
        tokeniser9.transition(tokeniserState19);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNull(doctype13);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tokeniserState19);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        java.lang.Class<?> wildcardClass7 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matches('\ufffd');
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            char char10 = characterReader1.current();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser14.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState16 = null;
        tokeniser14.transition(tokeniserState16);
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList19);
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser20.getState();
        tokeniser14.transition(tokeniserState21);
        tokeniser14.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList25);
        java.lang.StringBuilder stringBuilder27 = null;
        tokeniser26.dataBuffer = stringBuilder27;
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader29, parseErrorList30);
        tokeniser31.createTempBuffer();
        tokeniser31.createTempBuffer();
        java.lang.StringBuilder stringBuilder34 = tokeniser31.dataBuffer;
        tokeniser26.dataBuffer = stringBuilder34;
        tokeniser14.dataBuffer = stringBuilder34;
        tokeniser2.dataBuffer = stringBuilder34;
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader38, parseErrorList39);
        org.jsoup.parser.Token.Tag tag42 = tokeniser40.createTagPending(false);
        tokeniser40.createTempBuffer();
        tokeniser40.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype45 = null;
        tokeniser40.doctypePending = doctype45;
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.Tokeniser tokeniser49 = new org.jsoup.parser.Tokeniser(characterReader47, parseErrorList48);
        org.jsoup.parser.Token.Tag tag51 = tokeniser49.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype52 = tokeniser49.doctypePending;
        org.jsoup.parser.CharacterReader characterReader53 = null;
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.Tokeniser tokeniser55 = new org.jsoup.parser.Tokeniser(characterReader53, parseErrorList54);
        org.jsoup.parser.Token.Tag tag57 = tokeniser55.createTagPending(false);
        tokeniser49.tagPending = tag57;
        java.lang.StringBuilder stringBuilder59 = tokeniser49.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState60 = tokeniser49.getState();
        tokeniser40.transition(tokeniserState60);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNull(doctype52);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNull(stringBuilder59);
        org.junit.Assert.assertNotNull(tokeniserState60);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        characterReader1.unconsume();
        org.jsoup.parser.CharacterReader characterReader4 = new org.jsoup.parser.CharacterReader("");
        boolean boolean6 = characterReader4.matches(' ');
        characterReader4.advance();
        characterReader4.unconsume();
        characterReader4.rewindToMark();
        boolean boolean10 = characterReader4.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        char char13 = characterReader12.current();
        java.lang.String str14 = characterReader12.consumeHexSequence();
        boolean boolean15 = characterReader12.isEmpty();
        boolean boolean17 = characterReader12.matches('a');
        java.lang.String str18 = characterReader12.toString();
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        char char21 = characterReader20.current();
        java.lang.String str23 = characterReader20.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList24);
        char[] charArray30 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str31 = characterReader20.consumeToAny(charArray30);
        java.lang.String str32 = characterReader12.consumeToAny(charArray30);
        java.lang.String str33 = characterReader4.consumeToAny(charArray30);
        characterReader4.rewindToMark();
        boolean boolean36 = characterReader4.containsIgnoreCase("");
        boolean boolean37 = characterReader4.isEmpty();
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("");
        char char40 = characterReader39.current();
        java.lang.String str42 = characterReader39.consumeTo('#');
        java.lang.String str44 = characterReader39.consumeTo("");
        int int45 = characterReader39.pos();
        java.lang.String str46 = characterReader39.consumeLetterSequence();
        int int47 = characterReader39.pos();
        boolean boolean48 = characterReader39.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader50 = new org.jsoup.parser.CharacterReader("");
        boolean boolean52 = characterReader50.matches(' ');
        characterReader50.advance();
        characterReader50.unconsume();
        characterReader50.rewindToMark();
        boolean boolean56 = characterReader50.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader58 = new org.jsoup.parser.CharacterReader("");
        char char59 = characterReader58.current();
        java.lang.String str60 = characterReader58.consumeHexSequence();
        boolean boolean61 = characterReader58.isEmpty();
        boolean boolean63 = characterReader58.matches('a');
        java.lang.String str64 = characterReader58.toString();
        org.jsoup.parser.CharacterReader characterReader66 = new org.jsoup.parser.CharacterReader("");
        char char67 = characterReader66.current();
        java.lang.String str69 = characterReader66.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList70 = null;
        org.jsoup.parser.Tokeniser tokeniser71 = new org.jsoup.parser.Tokeniser(characterReader66, parseErrorList70);
        char[] charArray76 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str77 = characterReader66.consumeToAny(charArray76);
        java.lang.String str78 = characterReader58.consumeToAny(charArray76);
        java.lang.String str79 = characterReader50.consumeToAny(charArray76);
        boolean boolean80 = characterReader39.matchesAny(charArray76);
        boolean boolean81 = characterReader4.matchesAny(charArray76);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str82 = characterReader1.consumeToAny(charArray76);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\uffff' + "'", char21 == '\uffff');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + '\uffff' + "'", char40 == '\uffff');
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + char59 + "' != '" + '\uffff' + "'", char59 == '\uffff');
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + char67 + "' != '" + '\uffff' + "'", char67 == '\uffff');
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertArrayEquals(charArray76, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser10.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState12 = null;
        tokeniser10.transition(tokeniserState12);
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser16.getState();
        tokeniser10.transition(tokeniserState17);
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        org.jsoup.parser.Token.Tag tag23 = tokeniser21.createTagPending(false);
        tokeniser21.createTempBuffer();
        tokeniser21.createDoctypePending();
        org.jsoup.parser.Token.Tag tag27 = tokeniser21.createTagPending(true);
        tokeniser10.emit((org.jsoup.parser.Token) tag27);
        tokeniser2.tagPending = tag27;
        org.jsoup.parser.Token.Doctype doctype30 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader31, parseErrorList32);
        org.jsoup.parser.Token.Tag tag35 = tokeniser33.createTagPending(false);
        tokeniser33.createTempBuffer();
        tokeniser33.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype38 = null;
        tokeniser33.doctypePending = doctype38;
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader40, parseErrorList41);
        org.jsoup.parser.Token.Tag tag44 = tokeniser42.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype45 = tokeniser42.doctypePending;
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader46, parseErrorList47);
        org.jsoup.parser.Token.Tag tag50 = tokeniser48.createTagPending(false);
        tokeniser42.tagPending = tag50;
        java.lang.StringBuilder stringBuilder52 = tokeniser42.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState53 = tokeniser42.getState();
        tokeniser33.transition(tokeniserState53);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(doctype11);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNull(doctype30);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNull(doctype45);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNull(stringBuilder52);
        org.junit.Assert.assertNotNull(tokeniserState53);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        boolean boolean5 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag7 = tokeniser2.createTagPending(true);
        tokeniser2.emit("");
        tokeniser2.acknowledgeSelfClosingFlag();
        java.lang.StringBuilder stringBuilder11 = tokeniser2.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token12 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(stringBuilder11);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader5 = new org.jsoup.parser.CharacterReader("");
        char char6 = characterReader5.current();
        java.lang.String str7 = characterReader5.consumeLetterSequence();
        java.lang.String str9 = characterReader5.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader5, parseErrorList10);
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser14.getState();
        tokeniser14.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser14.getState();
        tokeniser11.advanceTransition(tokeniserState17);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tokeniserState17);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader32, parseErrorList33);
        org.jsoup.parser.TokeniserState tokeniserState35 = tokeniser34.getState();
        tokeniser34.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser34.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNotNull(tokeniserState37);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.emit("hi!");
        org.jsoup.parser.Token.Tag tag8 = tokeniser2.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token9 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag8);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.toString();
        characterReader1.mark();
        characterReader1.unconsume();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList11);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList13);
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        char char17 = characterReader16.current();
        java.lang.String str18 = characterReader16.consumeLetterSequence();
        java.lang.String str20 = characterReader16.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList21);
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader23, parseErrorList24);
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser25.getState();
        tokeniser25.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser25.getState();
        tokeniser22.advanceTransition(tokeniserState28);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser14.eofError(tokeniserState28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\uffff' + "'", char17 == '\uffff');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNotNull(tokeniserState28);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("");
        char char37 = characterReader36.current();
        java.lang.String str39 = characterReader36.consumeTo('#');
        java.lang.String str41 = characterReader36.consumeTo("");
        int int42 = characterReader36.pos();
        java.lang.String str43 = characterReader36.consumeLetterSequence();
        int int44 = characterReader36.pos();
        boolean boolean45 = characterReader36.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader47 = new org.jsoup.parser.CharacterReader("");
        boolean boolean49 = characterReader47.matches(' ');
        characterReader47.advance();
        characterReader47.unconsume();
        characterReader47.rewindToMark();
        boolean boolean53 = characterReader47.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader55 = new org.jsoup.parser.CharacterReader("");
        char char56 = characterReader55.current();
        java.lang.String str57 = characterReader55.consumeHexSequence();
        boolean boolean58 = characterReader55.isEmpty();
        boolean boolean60 = characterReader55.matches('a');
        java.lang.String str61 = characterReader55.toString();
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("");
        char char64 = characterReader63.current();
        java.lang.String str66 = characterReader63.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList67 = null;
        org.jsoup.parser.Tokeniser tokeniser68 = new org.jsoup.parser.Tokeniser(characterReader63, parseErrorList67);
        char[] charArray73 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str74 = characterReader63.consumeToAny(charArray73);
        java.lang.String str75 = characterReader55.consumeToAny(charArray73);
        java.lang.String str76 = characterReader47.consumeToAny(charArray73);
        boolean boolean77 = characterReader36.matchesAny(charArray73);
        boolean boolean78 = characterReader1.matchesAny(charArray73);
        char char79 = characterReader1.current();
        characterReader1.mark();
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
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '\uffff' + "'", char37 == '\uffff');
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + char56 + "' != '" + '\uffff' + "'", char56 == '\uffff');
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + char64 + "' != '" + '\uffff' + "'", char64 == '\uffff');
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertArrayEquals(charArray73, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + char79 + "' != '" + '\uffff' + "'", char79 == '\uffff');
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.createCommentPending();
        tokeniser2.emit(' ');
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        org.jsoup.parser.Token.Tag tag13 = tokeniser11.createTagPending(false);
        org.jsoup.parser.Token.Comment comment14 = tokeniser11.commentPending;
        org.jsoup.parser.Token.Doctype doctype15 = null;
        tokeniser11.doctypePending = doctype15;
        tokeniser11.createTempBuffer();
        java.lang.StringBuilder stringBuilder18 = tokeniser11.dataBuffer;
        boolean boolean19 = tokeniser11.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser11.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(tokeniserState20);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        characterReader1.advance();
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end 2, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        boolean boolean38 = characterReader1.matchConsume("hi!");
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = characterReader1.consumeTo('#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end 0, length 0");
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str5 = characterReader1.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList6);
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser10.getState();
        tokeniser10.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser10.getState();
        tokeniser7.advanceTransition(tokeniserState13);
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader15, parseErrorList16);
        org.jsoup.parser.Token.Tag tag19 = tokeniser17.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype20 = tokeniser17.doctypePending;
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader21, parseErrorList22);
        org.jsoup.parser.Token.Tag tag25 = tokeniser23.createTagPending(false);
        tokeniser17.tagPending = tag25;
        java.lang.StringBuilder stringBuilder27 = tokeniser17.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser17.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser7.eofError(tokeniserState28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNull(doctype20);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNull(stringBuilder27);
        org.junit.Assert.assertNotNull(tokeniserState28);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser2.doctypePending = doctype6;
        org.jsoup.parser.Token.Comment comment8 = null;
        tokeniser2.commentPending = comment8;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.toString();
        characterReader1.mark();
        characterReader1.unconsume();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList11);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.isEmpty();
        characterReader1.advance();
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList6);
        characterReader1.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype5 = tokeniser2.doctypePending;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser2.doctypePending;
        tokeniser2.emit('4');
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
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser11.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNull(doctype6);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNull(doctype14);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNull(stringBuilder21);
        org.junit.Assert.assertNotNull(tokeniserState22);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = tokeniser2.consumeCharacterReference((java.lang.Character) '\uffff', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        java.lang.Class<?> wildcardClass6 = tokeniser2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char7 = tokeniser2.consumeCharacterReference((java.lang.Character) '\uffff', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        java.lang.String str8 = characterReader1.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList9);
        tokeniser10.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        tokeniser14.createTempBuffer();
        tokeniser14.createTempBuffer();
        org.jsoup.parser.Token.Comment comment17 = tokeniser14.commentPending;
        java.lang.StringBuilder stringBuilder18 = null;
        tokeniser14.dataBuffer = stringBuilder18;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        org.jsoup.parser.Token.Doctype doctype23 = tokeniser22.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState24 = null;
        tokeniser22.transition(tokeniserState24);
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader26, parseErrorList27);
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser28.getState();
        tokeniser22.transition(tokeniserState29);
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader31, parseErrorList32);
        org.jsoup.parser.Token.Tag tag35 = tokeniser33.createTagPending(false);
        tokeniser33.createTempBuffer();
        tokeniser33.createDoctypePending();
        org.jsoup.parser.Token.Tag tag39 = tokeniser33.createTagPending(true);
        tokeniser22.emit((org.jsoup.parser.Token) tag39);
        tokeniser14.tagPending = tag39;
        tokeniser10.emit((org.jsoup.parser.Token) tag39);
        org.jsoup.parser.Token.Comment comment43 = tokeniser10.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser10.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(comment17);
        org.junit.Assert.assertNull(doctype23);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNull(comment43);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList5);
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser6.dataBuffer = stringBuilder7;
        org.jsoup.parser.Token.Tag tag10 = tokeniser6.createTagPending(true);
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser6.commentPending = comment11;
        tokeniser6.emit("hi!");
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser6.doctypePending;
        org.jsoup.parser.Token token16 = tokeniser6.read();
        tokeniser6.emit("hi!");
        org.jsoup.parser.Token.Tag tag19 = tokeniser6.tagPending;
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser2.doctypePending = doctype6;
        tokeniser2.createTempBuffer();
        java.lang.StringBuilder stringBuilder9 = tokeniser2.dataBuffer;
        boolean boolean10 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser2.getState();
        org.jsoup.parser.Token.Doctype doctype12 = null;
        tokeniser2.doctypePending = doctype12;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = tokeniser2.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNull(stringBuilder6);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader26, parseErrorList27);
        org.jsoup.parser.Token.Tag tag30 = tokeniser28.createTagPending(false);
        tokeniser28.createTempBuffer();
        tokeniser28.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype33 = null;
        tokeniser28.doctypePending = doctype33;
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader35, parseErrorList36);
        org.jsoup.parser.Token.Doctype doctype38 = tokeniser37.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState39 = null;
        tokeniser37.transition(tokeniserState39);
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader41, parseErrorList42);
        org.jsoup.parser.TokeniserState tokeniserState44 = tokeniser43.getState();
        tokeniser37.transition(tokeniserState44);
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader46, parseErrorList47);
        org.jsoup.parser.Token.Tag tag50 = tokeniser48.createTagPending(false);
        tokeniser48.createTempBuffer();
        tokeniser48.createDoctypePending();
        org.jsoup.parser.Token.Tag tag54 = tokeniser48.createTagPending(true);
        tokeniser37.emit((org.jsoup.parser.Token) tag54);
        tokeniser28.emit((org.jsoup.parser.Token) tag54);
        java.lang.StringBuilder stringBuilder57 = tokeniser28.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader58 = null;
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.Tokeniser tokeniser60 = new org.jsoup.parser.Tokeniser(characterReader58, parseErrorList59);
        org.jsoup.parser.TokeniserState tokeniserState61 = tokeniser60.getState();
        tokeniser28.transition(tokeniserState61);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNull(doctype38);
        org.junit.Assert.assertNotNull(tokeniserState44);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertNotNull(stringBuilder57);
        org.junit.Assert.assertEquals(stringBuilder57.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState61);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        java.lang.Class<?> wildcardClass20 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        tokeniser2.createCommentPending();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader27, parseErrorList28);
        org.jsoup.parser.Token.Tag tag31 = tokeniser29.createTagPending(false);
        tokeniser29.createTempBuffer();
        boolean boolean33 = tokeniser29.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState34 = tokeniser29.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tokeniserState34);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        characterReader1.mark();
        boolean boolean10 = characterReader1.matches('\uffff');
        characterReader1.unconsume();
        characterReader1.mark();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser2.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser2.getState();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.Token.Tag tag12 = tokeniser10.createTagPending(false);
        tokeniser10.createTempBuffer();
        boolean boolean14 = tokeniser10.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser10.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(doctype6);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tokeniserState15);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader4, parseErrorList5);
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser6.dataBuffer = stringBuilder7;
        org.jsoup.parser.Token.Comment comment9 = tokeniser6.commentPending;
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser6.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser6.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment9);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser2.getState();
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        tokeniser2.emit('4');
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.emit('\uffff');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        characterReader1.advance();
        characterReader1.advance();
        boolean boolean7 = characterReader1.matchesLetter();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        java.lang.Class<?> wildcardClass16 = tokeniser2.getClass();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        boolean boolean5 = characterReader1.matches('\uffff');
        char char6 = characterReader1.current();
        boolean boolean8 = characterReader1.containsIgnoreCase("");
        boolean boolean10 = characterReader1.matchConsume("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\uffff' + "'", char6 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matchesDigit();
        boolean boolean6 = characterReader1.isEmpty();
        characterReader1.advance();
        java.lang.Class<?> wildcardClass8 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        tokeniser15.createTempBuffer();
        tokeniser15.createTempBuffer();
        org.jsoup.parser.Token.Comment comment18 = tokeniser15.commentPending;
        java.lang.StringBuilder stringBuilder19 = null;
        tokeniser15.dataBuffer = stringBuilder19;
        org.jsoup.parser.Token.Comment comment21 = tokeniser15.commentPending;
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader22, parseErrorList23);
        org.jsoup.parser.Token.Tag tag26 = tokeniser24.createTagPending(false);
        org.jsoup.parser.Token.Comment comment27 = tokeniser24.commentPending;
        org.jsoup.parser.Token.Doctype doctype28 = null;
        tokeniser24.doctypePending = doctype28;
        tokeniser24.createTempBuffer();
        java.lang.StringBuilder stringBuilder31 = tokeniser24.dataBuffer;
        boolean boolean32 = tokeniser24.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState33 = tokeniser24.getState();
        tokeniser15.transition(tokeniserState33);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(stringBuilder12);
        org.junit.Assert.assertNull(comment18);
        org.junit.Assert.assertNull(comment21);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNull(comment27);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(tokeniserState33);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Doctype doctype3 = null;
        tokeniser2.doctypePending = doctype3;
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader5, parseErrorList6);
        tokeniser7.createTempBuffer();
        tokeniser7.createTempBuffer();
        java.lang.StringBuilder stringBuilder10 = tokeniser7.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList12);
        org.jsoup.parser.Token.Tag tag15 = tokeniser13.createTagPending(false);
        tokeniser7.tagPending = tag15;
        tokeniser2.tagPending = tag15;
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList19);
        java.lang.StringBuilder stringBuilder21 = null;
        tokeniser20.dataBuffer = stringBuilder21;
        tokeniser20.acknowledgeSelfClosingFlag();
        tokeniser20.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState25 = tokeniser20.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(tokeniserState25);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.emit("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        char char4 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchesLetter();
        characterReader1.mark();
        boolean boolean8 = characterReader1.matchConsume("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        tokeniser2.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token12 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.createTempBuffer();
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser2.dataBuffer = stringBuilder7;
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        java.lang.StringBuilder stringBuilder12 = null;
        tokeniser11.dataBuffer = stringBuilder12;
        org.jsoup.parser.Token.Comment comment14 = tokeniser11.commentPending;
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser11.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser11.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNotNull(tokeniserState16);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        org.jsoup.parser.Token.Doctype doctype14 = null;
        tokeniser2.doctypePending = doctype14;
        tokeniser2.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype5 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser8.getState();
        tokeniser8.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser8.getState();
        boolean boolean12 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser8.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader4, parseErrorList5);
        org.jsoup.parser.Token.Doctype doctype7 = tokeniser6.doctypePending;
        tokeniser6.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        org.jsoup.parser.Token.Tag tag14 = tokeniser12.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser12.doctypePending;
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList17);
        org.jsoup.parser.Token.Tag tag20 = tokeniser18.createTagPending(false);
        tokeniser12.tagPending = tag20;
        java.lang.StringBuilder stringBuilder22 = tokeniser12.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader23, parseErrorList24);
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser25.getState();
        tokeniser12.transition(tokeniserState26);
        tokeniser6.transition(tokeniserState26);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype7);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNull(stringBuilder22);
        org.junit.Assert.assertNotNull(tokeniserState26);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        org.jsoup.parser.Token.Tag tag10 = tokeniser8.createTagPending(false);
        tokeniser8.createTempBuffer();
        boolean boolean12 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser8.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        char char4 = characterReader1.consume();
        characterReader1.unconsume();
        java.lang.String str6 = characterReader1.consumeAsString();
        char char7 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end 2, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList22);
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList25);
        java.lang.StringBuilder stringBuilder27 = null;
        tokeniser26.dataBuffer = stringBuilder27;
        tokeniser26.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype30 = tokeniser26.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser26.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser23.error(tokeniserState31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(doctype30);
        org.junit.Assert.assertNotNull(tokeniserState31);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        characterReader1.rewindToMark();
        boolean boolean8 = characterReader1.matchesLetter();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Comment comment7 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Tag tag8 = tokeniser2.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.isEmpty();
        characterReader1.advance();
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList6);
        characterReader1.mark();
        boolean boolean10 = characterReader1.containsIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeTo("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser14.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState16 = null;
        tokeniser14.transition(tokeniserState16);
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList19);
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser20.getState();
        tokeniser14.transition(tokeniserState21);
        tokeniser14.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList25);
        java.lang.StringBuilder stringBuilder27 = null;
        tokeniser26.dataBuffer = stringBuilder27;
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader29, parseErrorList30);
        tokeniser31.createTempBuffer();
        tokeniser31.createTempBuffer();
        java.lang.StringBuilder stringBuilder34 = tokeniser31.dataBuffer;
        tokeniser26.dataBuffer = stringBuilder34;
        tokeniser14.dataBuffer = stringBuilder34;
        tokeniser2.dataBuffer = stringBuilder34;
        org.jsoup.parser.Token.Doctype doctype38 = tokeniser2.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertNull(doctype38);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean5 = characterReader1.matchConsume("hi!");
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("hi!");
        char char8 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeTo('a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        int int9 = characterReader1.pos();
        java.lang.String str10 = characterReader1.toString();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser2.getState();
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        tokeniser2.emit('4');
        org.jsoup.parser.Token.Comment comment9 = tokeniser2.commentPending;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser12.doctypePending;
        tokeniser12.emit("hi!");
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
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader29, parseErrorList30);
        org.jsoup.parser.TokeniserState tokeniserState32 = tokeniser31.getState();
        tokeniser18.transition(tokeniserState32);
        tokeniser12.transition(tokeniserState32);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNotNull(comment9);
        org.junit.Assert.assertNull(doctype13);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNull(doctype21);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNull(stringBuilder28);
        org.junit.Assert.assertNotNull(tokeniserState32);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str5 = characterReader1.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList6);
        org.jsoup.parser.Token.Doctype doctype8 = null;
        tokeniser7.doctypePending = doctype8;
        tokeniser7.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList12);
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser13.dataBuffer = stringBuilder14;
        org.jsoup.parser.Token.Tag tag16 = null;
        tokeniser13.tagPending = tag16;
        org.jsoup.parser.Token.Tag tag18 = tokeniser13.tagPending;
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        char char21 = characterReader20.current();
        java.lang.String str22 = characterReader20.consumeLetterSequence();
        java.lang.String str24 = characterReader20.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList25);
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader27, parseErrorList28);
        org.jsoup.parser.TokeniserState tokeniserState30 = tokeniser29.getState();
        tokeniser29.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState32 = tokeniser29.getState();
        tokeniser26.advanceTransition(tokeniserState32);
        tokeniser13.transition(tokeniserState32);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser7.eofError(tokeniserState32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(tag18);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\uffff' + "'", char21 == '\uffff');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertNotNull(tokeniserState32);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        java.lang.String str26 = characterReader1.consumeTo('\ufffd');
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader25, parseErrorList26);
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser27.getState();
        tokeniser27.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState30 = tokeniser27.getState();
        tokeniser27.emit('\uffff');
        org.jsoup.parser.Token.Comment comment33 = tokeniser27.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emit((org.jsoup.parser.Token) comment33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comment6);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertNotNull(comment33);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        tokeniser10.emit(' ');
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader26, parseErrorList27);
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser28.getState();
        tokeniser28.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser28.getState();
        tokeniser28.emit('\uffff');
        org.jsoup.parser.Token.Comment comment34 = tokeniser28.commentPending;
        tokeniser10.emit((org.jsoup.parser.Token) comment34);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser10.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNull(comment16);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNotNull(comment34);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        tokeniser2.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char17 = tokeniser2.consumeCharacterReference((java.lang.Character) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype5 = tokeniser2.doctypePending;
        tokeniser2.emitTagPending();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        java.lang.StringBuilder stringBuilder10 = null;
        tokeniser9.dataBuffer = stringBuilder10;
        tokeniser9.acknowledgeSelfClosingFlag();
        tokeniser9.createCommentPending();
        tokeniser9.emit('\uffff');
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList17);
        java.lang.StringBuilder stringBuilder19 = null;
        tokeniser18.dataBuffer = stringBuilder19;
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader21, parseErrorList22);
        tokeniser23.createTempBuffer();
        tokeniser23.createTempBuffer();
        java.lang.StringBuilder stringBuilder26 = tokeniser23.dataBuffer;
        tokeniser18.dataBuffer = stringBuilder26;
        tokeniser9.dataBuffer = stringBuilder26;
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader29, parseErrorList30);
        tokeniser31.createTempBuffer();
        tokeniser31.emit("");
        java.lang.StringBuilder stringBuilder35 = tokeniser31.dataBuffer;
        tokeniser9.dataBuffer = stringBuilder35;
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader37, parseErrorList38);
        org.jsoup.parser.Token.Tag tag41 = tokeniser39.createTagPending(false);
        tokeniser39.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader43, parseErrorList44);
        org.jsoup.parser.Token.Tag tag47 = tokeniser45.createTagPending(false);
        tokeniser45.createTempBuffer();
        tokeniser45.createDoctypePending();
        org.jsoup.parser.Token.Tag tag51 = tokeniser45.createTagPending(true);
        tokeniser39.emit((org.jsoup.parser.Token) tag51);
        org.jsoup.parser.CharacterReader characterReader53 = null;
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.Tokeniser tokeniser55 = new org.jsoup.parser.Tokeniser(characterReader53, parseErrorList54);
        java.lang.StringBuilder stringBuilder56 = null;
        tokeniser55.dataBuffer = stringBuilder56;
        tokeniser55.createCommentPending();
        org.jsoup.parser.Token.Comment comment59 = tokeniser55.commentPending;
        tokeniser39.commentPending = comment59;
        tokeniser9.commentPending = comment59;
        tokeniser2.commentPending = comment59;
        tokeniser2.createTempBuffer();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "");
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(comment59);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        int int9 = characterReader1.pos();
        boolean boolean10 = characterReader1.matchesDigit();
        java.lang.String str12 = characterReader1.consumeTo("");
        characterReader1.unconsume();
        characterReader1.mark();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        java.lang.StringBuilder stringBuilder13 = null;
        tokeniser12.dataBuffer = stringBuilder13;
        org.jsoup.parser.Token.Tag tag15 = null;
        tokeniser12.tagPending = tag15;
        org.jsoup.parser.Token.Tag tag17 = tokeniser12.tagPending;
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        char char20 = characterReader19.current();
        java.lang.String str21 = characterReader19.consumeLetterSequence();
        java.lang.String str23 = characterReader19.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList24);
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader26, parseErrorList27);
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser28.getState();
        tokeniser28.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser28.getState();
        tokeniser25.advanceTransition(tokeniserState31);
        tokeniser12.transition(tokeniserState31);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(tag17);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\uffff' + "'", char20 == '\uffff');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNotNull(tokeniserState31);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.emit(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        java.lang.StringBuilder stringBuilder10 = null;
        tokeniser9.dataBuffer = stringBuilder10;
        tokeniser9.acknowledgeSelfClosingFlag();
        tokeniser9.createCommentPending();
        tokeniser9.emit('\uffff');
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList17);
        java.lang.StringBuilder stringBuilder19 = null;
        tokeniser18.dataBuffer = stringBuilder19;
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader21, parseErrorList22);
        tokeniser23.createTempBuffer();
        tokeniser23.createTempBuffer();
        java.lang.StringBuilder stringBuilder26 = tokeniser23.dataBuffer;
        tokeniser18.dataBuffer = stringBuilder26;
        tokeniser9.dataBuffer = stringBuilder26;
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader29, parseErrorList30);
        tokeniser31.createTempBuffer();
        tokeniser31.emit("");
        java.lang.StringBuilder stringBuilder35 = tokeniser31.dataBuffer;
        tokeniser9.dataBuffer = stringBuilder35;
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader37, parseErrorList38);
        org.jsoup.parser.Token.Tag tag41 = tokeniser39.createTagPending(false);
        tokeniser39.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader43, parseErrorList44);
        org.jsoup.parser.Token.Tag tag47 = tokeniser45.createTagPending(false);
        tokeniser45.createTempBuffer();
        tokeniser45.createDoctypePending();
        org.jsoup.parser.Token.Tag tag51 = tokeniser45.createTagPending(true);
        tokeniser39.emit((org.jsoup.parser.Token) tag51);
        org.jsoup.parser.CharacterReader characterReader53 = null;
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.Tokeniser tokeniser55 = new org.jsoup.parser.Tokeniser(characterReader53, parseErrorList54);
        java.lang.StringBuilder stringBuilder56 = null;
        tokeniser55.dataBuffer = stringBuilder56;
        tokeniser55.createCommentPending();
        org.jsoup.parser.Token.Comment comment59 = tokeniser55.commentPending;
        tokeniser39.commentPending = comment59;
        tokeniser9.commentPending = comment59;
        org.jsoup.parser.CharacterReader characterReader62 = null;
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        org.jsoup.parser.Tokeniser tokeniser64 = new org.jsoup.parser.Tokeniser(characterReader62, parseErrorList63);
        org.jsoup.parser.Token.Tag tag66 = tokeniser64.createTagPending(false);
        org.jsoup.parser.Token.Comment comment67 = tokeniser64.commentPending;
        org.jsoup.parser.Token.Doctype doctype68 = null;
        tokeniser64.doctypePending = doctype68;
        org.jsoup.parser.CharacterReader characterReader70 = null;
        org.jsoup.parser.ParseErrorList parseErrorList71 = null;
        org.jsoup.parser.Tokeniser tokeniser72 = new org.jsoup.parser.Tokeniser(characterReader70, parseErrorList71);
        org.jsoup.parser.Token.Tag tag74 = tokeniser72.createTagPending(false);
        tokeniser72.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader76 = null;
        org.jsoup.parser.ParseErrorList parseErrorList77 = null;
        org.jsoup.parser.Tokeniser tokeniser78 = new org.jsoup.parser.Tokeniser(characterReader76, parseErrorList77);
        org.jsoup.parser.Token.Tag tag80 = tokeniser78.createTagPending(false);
        tokeniser78.createTempBuffer();
        tokeniser78.createDoctypePending();
        org.jsoup.parser.Token.Tag tag84 = tokeniser78.createTagPending(true);
        tokeniser72.emit((org.jsoup.parser.Token) tag84);
        org.jsoup.parser.CharacterReader characterReader86 = null;
        org.jsoup.parser.ParseErrorList parseErrorList87 = null;
        org.jsoup.parser.Tokeniser tokeniser88 = new org.jsoup.parser.Tokeniser(characterReader86, parseErrorList87);
        java.lang.StringBuilder stringBuilder89 = null;
        tokeniser88.dataBuffer = stringBuilder89;
        tokeniser88.createCommentPending();
        org.jsoup.parser.Token.Comment comment92 = tokeniser88.commentPending;
        tokeniser72.commentPending = comment92;
        tokeniser64.commentPending = comment92;
        tokeniser9.emit((org.jsoup.parser.Token) comment92);
        tokeniser2.commentPending = comment92;
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "");
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(comment59);
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertNull(comment67);
        org.junit.Assert.assertNotNull(tag74);
        org.junit.Assert.assertNotNull(tag80);
        org.junit.Assert.assertNotNull(tag84);
        org.junit.Assert.assertNotNull(comment92);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser10.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState12 = null;
        tokeniser10.transition(tokeniserState12);
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser16.getState();
        tokeniser10.transition(tokeniserState17);
        tokeniser10.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        java.lang.StringBuilder stringBuilder23 = null;
        tokeniser22.dataBuffer = stringBuilder23;
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader25, parseErrorList26);
        tokeniser27.createTempBuffer();
        tokeniser27.createTempBuffer();
        java.lang.StringBuilder stringBuilder30 = tokeniser27.dataBuffer;
        tokeniser22.dataBuffer = stringBuilder30;
        tokeniser10.dataBuffer = stringBuilder30;
        java.lang.StringBuilder stringBuilder33 = tokeniser10.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder33;
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader35, parseErrorList36);
        org.jsoup.parser.Token.Tag tag39 = tokeniser37.createTagPending(false);
        org.jsoup.parser.Token.Comment comment40 = tokeniser37.commentPending;
        tokeniser37.emit('\uffff');
        tokeniser37.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader45 = new org.jsoup.parser.CharacterReader("");
        char char46 = characterReader45.current();
        java.lang.String str48 = characterReader45.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.Tokeniser tokeniser50 = new org.jsoup.parser.Tokeniser(characterReader45, parseErrorList49);
        java.lang.StringBuilder stringBuilder51 = null;
        tokeniser50.dataBuffer = stringBuilder51;
        org.jsoup.parser.Token.Tag tag54 = tokeniser50.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState55 = tokeniser50.getState();
        tokeniser37.transition(tokeniserState55);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNull(doctype11);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNull(comment40);
        org.junit.Assert.assertTrue("'" + char46 + "' != '" + '\uffff' + "'", char46 == '\uffff');
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertNotNull(tokeniserState55);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        org.jsoup.parser.TokeniserState tokeniserState9 = null;
        tokeniser2.transition(tokeniserState9);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        char char4 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchesLetter();
        characterReader1.mark();
        boolean boolean8 = characterReader1.matches('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser2.doctypePending = doctype6;
        tokeniser2.createTempBuffer();
        java.lang.StringBuilder stringBuilder9 = tokeniser2.dataBuffer;
        boolean boolean10 = tokeniser2.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        char char4 = characterReader1.consume();
        characterReader1.rewindToMark();
        boolean boolean7 = characterReader1.matchesIgnoreCase("hi!");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.toString();
        characterReader1.mark();
        characterReader1.unconsume();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList11);
        characterReader1.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str5 = characterReader1.consumeTo("hi!");
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment6 = tokeniser2.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token7 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment6);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.containsIgnoreCase("hi!");
        boolean boolean9 = characterReader1.isEmpty();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser2.doctypePending;
        tokeniser2.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        org.jsoup.parser.Token.Tag tag10 = tokeniser8.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser8.doctypePending;
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        org.jsoup.parser.Token.Tag tag16 = tokeniser14.createTagPending(false);
        tokeniser8.tagPending = tag16;
        java.lang.StringBuilder stringBuilder18 = tokeniser8.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser21.getState();
        tokeniser8.transition(tokeniserState22);
        tokeniser2.transition(tokeniserState22);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(doctype11);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(stringBuilder18);
        org.junit.Assert.assertNotNull(tokeniserState22);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        org.jsoup.parser.Token.Tag tag7 = tokeniser2.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char10 = tokeniser2.consumeCharacterReference((java.lang.Character) '\uffff', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag7);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        char char9 = characterReader8.current();
        java.lang.String str11 = characterReader8.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList12);
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser13.dataBuffer = stringBuilder14;
        org.jsoup.parser.Token.Tag tag17 = tokeniser13.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser13.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser13.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNotNull(tokeniserState19);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token11 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Comment comment6 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(comment6);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.CharacterReader characterReader3 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader3, parseErrorList4);
        tokeniser5.createTempBuffer();
        tokeniser5.createTempBuffer();
        org.jsoup.parser.Token.Comment comment8 = tokeniser5.commentPending;
        java.lang.StringBuilder stringBuilder9 = null;
        tokeniser5.dataBuffer = stringBuilder9;
        org.jsoup.parser.Token.Comment comment11 = tokeniser5.commentPending;
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        org.jsoup.parser.Token.Tag tag16 = tokeniser14.createTagPending(false);
        org.jsoup.parser.Token.Comment comment17 = tokeniser14.commentPending;
        org.jsoup.parser.Token.Doctype doctype18 = null;
        tokeniser14.doctypePending = doctype18;
        tokeniser14.createTempBuffer();
        java.lang.StringBuilder stringBuilder21 = tokeniser14.dataBuffer;
        boolean boolean22 = tokeniser14.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser14.getState();
        tokeniser5.transition(tokeniserState23);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment8);
        org.junit.Assert.assertNull(comment11);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(comment17);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tokeniserState23);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        org.jsoup.parser.Token.Tag tag7 = tokeniser2.tagPending;
        org.jsoup.parser.CharacterReader characterReader9 = new org.jsoup.parser.CharacterReader("");
        char char10 = characterReader9.current();
        java.lang.String str11 = characterReader9.consumeLetterSequence();
        java.lang.String str13 = characterReader9.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList14);
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList17);
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser18.getState();
        tokeniser18.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser18.getState();
        tokeniser15.advanceTransition(tokeniserState21);
        tokeniser2.transition(tokeniserState21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tokeniserState21);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.toString();
        characterReader1.mark();
        characterReader1.unconsume();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList11);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = tokeniser14.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.isEmpty();
        characterReader1.advance();
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList6);
        org.jsoup.parser.Token.Tag tag9 = tokeniser7.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        tokeniser12.createTempBuffer();
        tokeniser12.createTempBuffer();
        org.jsoup.parser.Token.Comment comment15 = tokeniser12.commentPending;
        java.lang.StringBuilder stringBuilder16 = null;
        tokeniser12.dataBuffer = stringBuilder16;
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
        tokeniser12.tagPending = tag37;
        org.jsoup.parser.TokeniserState tokeniserState40 = tokeniser12.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser7.eofError(tokeniserState40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(comment15);
        org.junit.Assert.assertNull(doctype21);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(tokeniserState40);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char26 = tokeniser2.consumeCharacterReference((java.lang.Character) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag21);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        characterReader1.rewindToMark();
        char[] charArray37 = new char[] { '\uffff' };
        java.lang.String str38 = characterReader1.consumeToAny(charArray37);
        java.lang.Class<?> wildcardClass39 = charArray37.getClass();
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
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '\uffff' });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo("hi!");
        java.lang.String str5 = characterReader1.consumeTo("");
        boolean boolean7 = characterReader1.matchesIgnoreCase("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        boolean boolean6 = characterReader1.matches("hi!");
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = tokeniser2.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comment6);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(tokeniserState24);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser2.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = null;
        tokeniser2.transition(tokeniserState4);
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        char char8 = characterReader7.current();
        java.lang.String str9 = characterReader7.consumeHexSequence();
        boolean boolean10 = characterReader7.isEmpty();
        characterReader7.advance();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList12);
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        org.jsoup.parser.Token.Tag tag18 = tokeniser16.createTagPending(false);
        org.jsoup.parser.Token.Comment comment19 = tokeniser16.commentPending;
        tokeniser16.emit('\uffff');
        tokeniser16.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader24 = new org.jsoup.parser.CharacterReader("");
        char char25 = characterReader24.current();
        java.lang.String str27 = characterReader24.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList28);
        java.lang.StringBuilder stringBuilder30 = null;
        tokeniser29.dataBuffer = stringBuilder30;
        org.jsoup.parser.Token.Tag tag33 = tokeniser29.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState34 = tokeniser29.getState();
        tokeniser16.transition(tokeniserState34);
        tokeniser13.advanceTransition(tokeniserState34);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNull(comment19);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\uffff' + "'", char25 == '\uffff');
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(tokeniserState34);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.advance();
        boolean boolean8 = characterReader1.matchConsumeIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment6 = tokeniser2.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(comment6);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser2.doctypePending = doctype6;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.Token.Tag tag12 = tokeniser10.createTagPending(false);
        tokeniser10.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        org.jsoup.parser.Token.Tag tag18 = tokeniser16.createTagPending(false);
        tokeniser16.createTempBuffer();
        tokeniser16.createDoctypePending();
        org.jsoup.parser.Token.Tag tag22 = tokeniser16.createTagPending(true);
        tokeniser10.emit((org.jsoup.parser.Token) tag22);
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList25);
        java.lang.StringBuilder stringBuilder27 = null;
        tokeniser26.dataBuffer = stringBuilder27;
        tokeniser26.createCommentPending();
        org.jsoup.parser.Token.Comment comment30 = tokeniser26.commentPending;
        tokeniser10.commentPending = comment30;
        tokeniser2.commentPending = comment30;
        org.jsoup.parser.CharacterReader characterReader34 = new org.jsoup.parser.CharacterReader("");
        char char35 = characterReader34.current();
        java.lang.String str36 = characterReader34.consumeLetterSequence();
        java.lang.String str38 = characterReader34.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader34, parseErrorList39);
        org.jsoup.parser.Token.Doctype doctype41 = null;
        tokeniser40.doctypePending = doctype41;
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader43, parseErrorList44);
        org.jsoup.parser.Token.Tag tag47 = tokeniser45.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype48 = tokeniser45.doctypePending;
        org.jsoup.parser.CharacterReader characterReader49 = null;
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader49, parseErrorList50);
        org.jsoup.parser.Token.Tag tag53 = tokeniser51.createTagPending(false);
        tokeniser45.tagPending = tag53;
        java.lang.StringBuilder stringBuilder55 = tokeniser45.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader56 = null;
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.Tokeniser tokeniser58 = new org.jsoup.parser.Tokeniser(characterReader56, parseErrorList57);
        org.jsoup.parser.TokeniserState tokeniserState59 = tokeniser58.getState();
        tokeniser45.transition(tokeniserState59);
        tokeniser40.transition(tokeniserState59);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(comment30);
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + '\uffff' + "'", char35 == '\uffff');
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNull(doctype48);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNull(stringBuilder55);
        org.junit.Assert.assertNotNull(tokeniserState59);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.Token.Tag tag11 = tokeniser9.createTagPending(false);
        java.lang.StringBuilder stringBuilder12 = tokeniser9.dataBuffer;
        java.lang.StringBuilder stringBuilder13 = tokeniser9.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("");
        boolean boolean17 = characterReader15.matches(' ');
        characterReader15.advance();
        characterReader15.unconsume();
        characterReader15.rewindToMark();
        boolean boolean22 = characterReader15.matchConsume("");
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader15, parseErrorList23);
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader25, parseErrorList26);
        org.jsoup.parser.Token.Tag tag29 = tokeniser27.createTagPending(false);
        org.jsoup.parser.Token.Comment comment30 = tokeniser27.commentPending;
        org.jsoup.parser.Token.Doctype doctype31 = null;
        tokeniser27.doctypePending = doctype31;
        tokeniser27.createTempBuffer();
        java.lang.StringBuilder stringBuilder34 = tokeniser27.dataBuffer;
        boolean boolean35 = tokeniser27.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState36 = tokeniser27.getState();
        tokeniser24.advanceTransition(tokeniserState36);
        tokeniser24.emit(' ');
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader40, parseErrorList41);
        org.jsoup.parser.TokeniserState tokeniserState43 = tokeniser42.getState();
        tokeniser42.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState45 = tokeniser42.getState();
        tokeniser42.emit('\uffff');
        org.jsoup.parser.Token.Comment comment48 = tokeniser42.commentPending;
        tokeniser24.emit((org.jsoup.parser.Token) comment48);
        tokeniser9.commentPending = comment48;
        tokeniser2.commentPending = comment48;
        org.jsoup.parser.CharacterReader characterReader52 = null;
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.Tokeniser tokeniser54 = new org.jsoup.parser.Tokeniser(characterReader52, parseErrorList53);
        org.jsoup.parser.Token.Tag tag56 = tokeniser54.createTagPending(false);
        tokeniser54.createTempBuffer();
        tokeniser54.createDoctypePending();
        org.jsoup.parser.Token.Comment comment59 = tokeniser54.commentPending;
        tokeniser54.emit('\uffff');
        tokeniser54.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState63 = tokeniser54.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(stringBuilder12);
        org.junit.Assert.assertNull(stringBuilder13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNull(comment30);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNotNull(tokeniserState43);
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertNotNull(comment48);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNull(comment59);
        org.junit.Assert.assertNotNull(tokeniserState63);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser2.getState();
        boolean boolean6 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser2.getState();
        org.jsoup.parser.Token token8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emit(token8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tokeniserState7);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        java.lang.String str9 = characterReader1.consumeToEnd();
        boolean boolean10 = characterReader1.matchesLetter();
        characterReader1.rewindToMark();
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matches('\ufffd');
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser2.getState();
        boolean boolean6 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser2.getState();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.Token.Tag tag12 = tokeniser10.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser10.doctypePending;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        org.jsoup.parser.Token.Tag tag18 = tokeniser16.createTagPending(false);
        tokeniser10.tagPending = tag18;
        java.lang.StringBuilder stringBuilder20 = tokeniser10.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser10.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype13);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNull(stringBuilder20);
        org.junit.Assert.assertNotNull(tokeniserState21);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        tokeniser2.createCommentPending();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        java.lang.String str8 = characterReader1.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList9);
        tokeniser10.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        tokeniser14.createTempBuffer();
        tokeniser14.createTempBuffer();
        org.jsoup.parser.Token.Comment comment17 = tokeniser14.commentPending;
        java.lang.StringBuilder stringBuilder18 = null;
        tokeniser14.dataBuffer = stringBuilder18;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        org.jsoup.parser.Token.Doctype doctype23 = tokeniser22.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState24 = null;
        tokeniser22.transition(tokeniserState24);
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader26, parseErrorList27);
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser28.getState();
        tokeniser22.transition(tokeniserState29);
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader31, parseErrorList32);
        org.jsoup.parser.Token.Tag tag35 = tokeniser33.createTagPending(false);
        tokeniser33.createTempBuffer();
        tokeniser33.createDoctypePending();
        org.jsoup.parser.Token.Tag tag39 = tokeniser33.createTagPending(true);
        tokeniser22.emit((org.jsoup.parser.Token) tag39);
        tokeniser14.tagPending = tag39;
        tokeniser10.emit((org.jsoup.parser.Token) tag39);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser10.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(comment17);
        org.junit.Assert.assertNull(doctype23);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(tag39);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser2.doctypePending = doctype6;
        tokeniser2.createTempBuffer();
        java.lang.StringBuilder stringBuilder9 = tokeniser2.dataBuffer;
        org.jsoup.parser.Token.Comment comment10 = tokeniser2.commentPending;
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNull(comment10);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader27 = new org.jsoup.parser.CharacterReader("");
        char char28 = characterReader27.current();
        java.lang.String str29 = characterReader27.consumeLetterSequence();
        java.lang.String str31 = characterReader27.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader27, parseErrorList32);
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader34, parseErrorList35);
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser36.getState();
        tokeniser36.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState39 = tokeniser36.getState();
        tokeniser33.advanceTransition(tokeniserState39);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\uffff' + "'", char28 == '\uffff');
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertNotNull(tokeniserState39);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = tokeniser7.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(comment13);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\uffff' + "'", char19 == '\uffff');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tokeniserState28);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.unconsume();
        boolean boolean4 = characterReader1.matchConsume("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = characterReader1.matchesLetter();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.unconsume();
        boolean boolean4 = characterReader1.matchConsume("");
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList5);
        org.jsoup.parser.Token.Tag tag8 = tokeniser6.createTagPending(true);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser6.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str5 = characterReader1.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList6);
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser10.getState();
        tokeniser10.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser10.getState();
        tokeniser7.advanceTransition(tokeniserState13);
        org.jsoup.parser.Token token15 = tokeniser7.read();
        tokeniser7.createCommentPending();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(token15);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        org.jsoup.parser.Token.Doctype doctype22 = null;
        tokeniser2.doctypePending = doctype22;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = tokeniser2.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        org.jsoup.parser.Token.Tag tag14 = tokeniser12.createTagPending(false);
        tokeniser12.createTempBuffer();
        tokeniser12.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser12.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tokeniserState17);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.emit("hi!");
        org.jsoup.parser.Token.Tag tag8 = tokeniser2.tagPending;
        tokeniser2.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag8);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser2.getState();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser10.doctypePending;
        tokeniser10.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        org.jsoup.parser.Token.Tag tag18 = tokeniser16.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype19 = tokeniser16.doctypePending;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        org.jsoup.parser.Token.Tag tag24 = tokeniser22.createTagPending(false);
        tokeniser16.tagPending = tag24;
        java.lang.StringBuilder stringBuilder26 = tokeniser16.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader27, parseErrorList28);
        org.jsoup.parser.TokeniserState tokeniserState30 = tokeniser29.getState();
        tokeniser16.transition(tokeniserState30);
        tokeniser10.transition(tokeniserState30);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNull(doctype11);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNull(doctype19);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNull(stringBuilder26);
        org.junit.Assert.assertNotNull(tokeniserState30);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser2.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = null;
        tokeniser2.transition(tokeniserState4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype3);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char13 = tokeniser2.consumeCharacterReference((java.lang.Character) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        org.jsoup.parser.Token.Doctype doctype14 = null;
        tokeniser2.doctypePending = doctype14;
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList17);
        java.lang.StringBuilder stringBuilder19 = null;
        tokeniser18.dataBuffer = stringBuilder19;
        org.jsoup.parser.Token.Tag tag21 = null;
        tokeniser18.tagPending = tag21;
        org.jsoup.parser.Token.Tag tag23 = tokeniser18.tagPending;
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        char char26 = characterReader25.current();
        java.lang.String str27 = characterReader25.consumeLetterSequence();
        java.lang.String str29 = characterReader25.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader25, parseErrorList30);
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader32, parseErrorList33);
        org.jsoup.parser.TokeniserState tokeniserState35 = tokeniser34.getState();
        tokeniser34.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser34.getState();
        tokeniser31.advanceTransition(tokeniserState37);
        tokeniser18.transition(tokeniserState37);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNull(tag23);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\uffff' + "'", char26 == '\uffff');
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNotNull(tokeniserState37);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean6 = characterReader1.matches('a');
        java.lang.String str7 = characterReader1.toString();
        char char8 = characterReader1.current();
        char char9 = characterReader1.current();
        java.lang.String str10 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = characterReader1.consumeTo('4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser2.getState();
        tokeniser2.emit('\uffff');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char10 = tokeniser2.consumeCharacterReference((java.lang.Character) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState5);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        tokeniser2.emitTagPending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(stringBuilder12);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList5);
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser6.dataBuffer = stringBuilder7;
        org.jsoup.parser.Token.Tag tag10 = tokeniser6.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser6.getState();
        tokeniser6.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        org.jsoup.parser.Token.Tag tag17 = tokeniser15.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser15.doctypePending;
        org.jsoup.parser.Token.Doctype doctype19 = tokeniser15.doctypePending;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser22.getState();
        tokeniser22.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState25 = tokeniser22.getState();
        tokeniser15.transition(tokeniserState25);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser6.error(tokeniserState25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNull(doctype19);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNotNull(tokeniserState25);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.containsIgnoreCase("hi!");
        char[] charArray9 = new char[] {};
        boolean boolean10 = characterReader1.matchesAny(charArray9);
        java.lang.String str11 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str5 = characterReader1.consumeTo("hi!");
        boolean boolean7 = characterReader1.matches('\ufffd');
        char char8 = characterReader1.current();
        boolean boolean10 = characterReader1.containsIgnoreCase("");
        java.lang.String str11 = characterReader1.toString();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        java.lang.String str9 = characterReader1.consumeToEnd();
        boolean boolean10 = characterReader1.matchesLetter();
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            char char12 = characterReader1.current();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser11.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState13 = null;
        tokeniser11.transition(tokeniserState13);
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader15, parseErrorList16);
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser17.getState();
        tokeniser11.transition(tokeniserState18);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNotNull(tokeniserState18);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser2.doctypePending = doctype6;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.Token.Tag tag12 = tokeniser10.createTagPending(false);
        tokeniser10.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        org.jsoup.parser.Token.Tag tag18 = tokeniser16.createTagPending(false);
        tokeniser16.createTempBuffer();
        tokeniser16.createDoctypePending();
        org.jsoup.parser.Token.Tag tag22 = tokeniser16.createTagPending(true);
        tokeniser10.emit((org.jsoup.parser.Token) tag22);
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList25);
        java.lang.StringBuilder stringBuilder27 = null;
        tokeniser26.dataBuffer = stringBuilder27;
        tokeniser26.createCommentPending();
        org.jsoup.parser.Token.Comment comment30 = tokeniser26.commentPending;
        tokeniser10.commentPending = comment30;
        tokeniser2.commentPending = comment30;
        tokeniser2.emit('a');
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(comment30);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment9);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        boolean boolean5 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag7 = tokeniser2.createTagPending(true);
        tokeniser2.emit("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token10 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        org.jsoup.parser.Token.Tag tag10 = tokeniser8.createTagPending(false);
        tokeniser8.createTempBuffer();
        tokeniser8.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype13 = null;
        tokeniser8.doctypePending = doctype13;
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader15, parseErrorList16);
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser17.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState19 = null;
        tokeniser17.transition(tokeniserState19);
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader21, parseErrorList22);
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser23.getState();
        tokeniser17.transition(tokeniserState24);
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader26, parseErrorList27);
        org.jsoup.parser.Token.Tag tag30 = tokeniser28.createTagPending(false);
        tokeniser28.createTempBuffer();
        tokeniser28.createDoctypePending();
        org.jsoup.parser.Token.Tag tag34 = tokeniser28.createTagPending(true);
        tokeniser17.emit((org.jsoup.parser.Token) tag34);
        tokeniser8.emit((org.jsoup.parser.Token) tag34);
        java.lang.StringBuilder stringBuilder37 = tokeniser8.dataBuffer;
        tokeniser8.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState39 = tokeniser8.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState39);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        java.lang.String str26 = characterReader1.consumeTo("");
        int int27 = characterReader1.pos();
        java.lang.Class<?> wildcardClass28 = characterReader1.getClass();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
        java.lang.StringBuilder stringBuilder43 = tokeniser2.dataBuffer;
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(comment22);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNull(doctype33);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNull(stringBuilder43);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        java.lang.Class<?> wildcardClass24 = tag21.getClass();
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.emit('\uffff');
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        tokeniser10.createTempBuffer();
        tokeniser10.createTempBuffer();
        java.lang.StringBuilder stringBuilder13 = tokeniser10.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        org.jsoup.parser.Token.Tag tag18 = tokeniser16.createTagPending(false);
        tokeniser10.tagPending = tag18;
        tokeniser10.emit('\ufffd');
        org.jsoup.parser.Token.Tag tag22 = tokeniser10.tagPending;
        tokeniser2.tagPending = tag22;
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader25, parseErrorList26);
        java.lang.StringBuilder stringBuilder28 = null;
        tokeniser27.dataBuffer = stringBuilder28;
        org.jsoup.parser.Token.Comment comment30 = tokeniser27.commentPending;
        org.jsoup.parser.Token.Doctype doctype31 = tokeniser27.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState32 = tokeniser27.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(comment30);
        org.junit.Assert.assertNull(doctype31);
        org.junit.Assert.assertNotNull(tokeniserState32);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser2.getState();
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
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
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList19);
        org.jsoup.parser.Token.Tag tag22 = tokeniser20.createTagPending(false);
        tokeniser20.createTempBuffer();
        tokeniser20.createDoctypePending();
        org.jsoup.parser.Token.Tag tag26 = tokeniser20.createTagPending(true);
        tokeniser9.emit((org.jsoup.parser.Token) tag26);
        tokeniser2.tagPending = tag26;
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader29, parseErrorList30);
        java.lang.StringBuilder stringBuilder32 = null;
        tokeniser31.dataBuffer = stringBuilder32;
        tokeniser31.createCommentPending();
        org.jsoup.parser.Token.Comment comment35 = tokeniser31.commentPending;
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader36, parseErrorList37);
        org.jsoup.parser.Token.Tag tag40 = tokeniser38.createTagPending(false);
        tokeniser38.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader42, parseErrorList43);
        org.jsoup.parser.Token.Tag tag46 = tokeniser44.createTagPending(false);
        tokeniser44.createTempBuffer();
        tokeniser44.createDoctypePending();
        org.jsoup.parser.Token.Tag tag50 = tokeniser44.createTagPending(true);
        tokeniser38.emit((org.jsoup.parser.Token) tag50);
        tokeniser31.emit((org.jsoup.parser.Token) tag50);
        org.jsoup.parser.TokeniserState tokeniserState53 = tokeniser31.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(comment35);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(tokeniserState53);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype5 = tokeniser2.doctypePending;
        tokeniser2.emitTagPending();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        org.jsoup.parser.Token.Tag tag11 = tokeniser9.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser9.doctypePending;
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        org.jsoup.parser.Token.Tag tag17 = tokeniser15.createTagPending(false);
        tokeniser9.tagPending = tag17;
        java.lang.StringBuilder stringBuilder19 = tokeniser9.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser9.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(stringBuilder19);
        org.junit.Assert.assertNotNull(tokeniserState20);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype5 = tokeniser2.doctypePending;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser2.doctypePending;
        java.lang.StringBuilder stringBuilder7 = tokeniser2.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNull(doctype6);
        org.junit.Assert.assertNull(stringBuilder7);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList5);
        java.lang.String str7 = characterReader1.consumeDigitSequence();
        java.lang.String str8 = characterReader1.consumeHexSequence();
        java.lang.String str9 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser2.doctypePending = doctype6;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser10.getState();
        tokeniser10.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser10.getState();
        java.lang.StringBuilder stringBuilder14 = tokeniser10.dataBuffer;
        tokeniser10.emit('4');
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser10.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNotNull(tokeniserState17);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        int int9 = characterReader1.pos();
        boolean boolean10 = characterReader1.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        boolean boolean14 = characterReader12.matches(' ');
        characterReader12.advance();
        characterReader12.unconsume();
        characterReader12.rewindToMark();
        boolean boolean18 = characterReader12.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        char char21 = characterReader20.current();
        java.lang.String str22 = characterReader20.consumeHexSequence();
        boolean boolean23 = characterReader20.isEmpty();
        boolean boolean25 = characterReader20.matches('a');
        java.lang.String str26 = characterReader20.toString();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        char char29 = characterReader28.current();
        java.lang.String str31 = characterReader28.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader28, parseErrorList32);
        char[] charArray38 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str39 = characterReader28.consumeToAny(charArray38);
        java.lang.String str40 = characterReader20.consumeToAny(charArray38);
        java.lang.String str41 = characterReader12.consumeToAny(charArray38);
        boolean boolean42 = characterReader1.matchesAny(charArray38);
        boolean boolean43 = characterReader1.matchesLetter();
        boolean boolean45 = characterReader1.matchConsume("");
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\uffff' + "'", char21 == '\uffff');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\uffff' + "'", char29 == '\uffff');
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean5 = characterReader1.matchesLetter();
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        tokeniser2.createTempBuffer();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        int int9 = characterReader1.pos();
        boolean boolean10 = characterReader1.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        boolean boolean14 = characterReader12.matches(' ');
        characterReader12.advance();
        characterReader12.unconsume();
        characterReader12.rewindToMark();
        boolean boolean18 = characterReader12.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        char char21 = characterReader20.current();
        java.lang.String str22 = characterReader20.consumeHexSequence();
        boolean boolean23 = characterReader20.isEmpty();
        boolean boolean25 = characterReader20.matches('a');
        java.lang.String str26 = characterReader20.toString();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        char char29 = characterReader28.current();
        java.lang.String str31 = characterReader28.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader28, parseErrorList32);
        char[] charArray38 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str39 = characterReader28.consumeToAny(charArray38);
        java.lang.String str40 = characterReader20.consumeToAny(charArray38);
        java.lang.String str41 = characterReader12.consumeToAny(charArray38);
        boolean boolean42 = characterReader1.matchesAny(charArray38);
        boolean boolean43 = characterReader1.matchesLetter();
        boolean boolean45 = characterReader1.matchConsume("");
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = characterReader1.consumeTo("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\uffff' + "'", char21 == '\uffff');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\uffff' + "'", char29 == '\uffff');
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser2.getState();
        boolean boolean6 = tokeniser2.currentNodeInHtmlNS();
        tokeniser2.emitCommentPending();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        java.lang.StringBuilder stringBuilder11 = null;
        tokeniser10.dataBuffer = stringBuilder11;
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        tokeniser15.createTempBuffer();
        tokeniser15.createTempBuffer();
        java.lang.StringBuilder stringBuilder18 = tokeniser15.dataBuffer;
        tokeniser10.dataBuffer = stringBuilder18;
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser10.getState();
        tokeniser2.transition(tokeniserState20);
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emit((org.jsoup.parser.Token) tag42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(comment39);
        org.junit.Assert.assertNotNull(tag42);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        boolean boolean5 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag7 = tokeniser2.createTagPending(true);
        java.lang.Class<?> wildcardClass8 = tokeniser2.getClass();
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList5);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser6.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        int int9 = characterReader1.pos();
        java.lang.String str10 = characterReader1.consumeAsString();
        boolean boolean12 = characterReader1.matches("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = characterReader1.consumeTo('#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str4 = characterReader1.consumeToEnd();
        boolean boolean6 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str7 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        tokeniser2.createTempBuffer();
        tokeniser2.emit(' ');
        tokeniser2.emit("hi!");
        org.jsoup.parser.Token.Doctype doctype13 = null;
        tokeniser2.doctypePending = doctype13;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char17 = tokeniser2.consumeCharacterReference((java.lang.Character) '\uffff', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.mark();
        boolean boolean7 = characterReader1.containsIgnoreCase("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.emit("hi!");
        org.jsoup.parser.Token.Doctype doctype8 = null;
        tokeniser2.doctypePending = doctype8;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        org.jsoup.parser.Token.Tag tag14 = tokeniser12.createTagPending(false);
        tokeniser12.createTempBuffer();
        tokeniser12.createDoctypePending();
        org.jsoup.parser.Token.Comment comment17 = tokeniser12.commentPending;
        tokeniser12.emit('\uffff');
        tokeniser12.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser12.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNull(comment17);
        org.junit.Assert.assertNotNull(tokeniserState21);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        org.jsoup.parser.Token.Tag tag5 = tokeniser2.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag5);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = tokeniser2.consumeCharacterReference((java.lang.Character) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matches('\ufffd');
        boolean boolean9 = characterReader1.matchesDigit();
        java.lang.String str10 = characterReader1.consumeHexSequence();
        int int11 = characterReader1.pos();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str5 = characterReader1.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList6);
        org.jsoup.parser.Token.Doctype doctype8 = null;
        tokeniser7.doctypePending = doctype8;
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        char char12 = characterReader11.current();
        java.lang.String str13 = characterReader11.consumeLetterSequence();
        java.lang.String str15 = characterReader11.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList16);
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList19);
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser20.getState();
        tokeniser20.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser20.getState();
        tokeniser17.advanceTransition(tokeniserState23);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser7.error(tokeniserState23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(tokeniserState23);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Comment comment7 = tokeniser2.commentPending;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        java.lang.StringBuilder stringBuilder11 = null;
        tokeniser10.dataBuffer = stringBuilder11;
        tokeniser10.acknowledgeSelfClosingFlag();
        tokeniser10.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser10.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertNotNull(tokeniserState15);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        tokeniser2.createCommentPending();
        tokeniser2.emit('\uffff');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token10 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNull(stringBuilder6);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        java.lang.String str9 = characterReader1.consumeToEnd();
        boolean boolean11 = characterReader1.matchConsume("");
        java.lang.String str12 = characterReader1.consumeToEnd();
        char char13 = characterReader1.current();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        boolean boolean6 = characterReader1.matches("hi!");
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Comment comment7 = tokeniser2.commentPending;
        tokeniser2.emit('\uffff');
        tokeniser2.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser2.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char14 = tokeniser2.consumeCharacterReference((java.lang.Character) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        tokeniser2.emit("");
        org.jsoup.parser.Token.Tag tag12 = tokeniser2.createTagPending(false);
        java.lang.Class<?> wildcardClass13 = tag12.getClass();
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        org.jsoup.parser.TokeniserState tokeniserState31 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser7.error(tokeniserState31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(comment13);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\uffff' + "'", char19 == '\uffff');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tokeniserState28);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        tokeniser10.emit(' ');
        tokeniser10.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader28, parseErrorList29);
        org.jsoup.parser.Token.Tag tag32 = tokeniser30.createTagPending(false);
        java.lang.StringBuilder stringBuilder33 = tokeniser30.dataBuffer;
        java.lang.StringBuilder stringBuilder34 = tokeniser30.dataBuffer;
        tokeniser30.createCommentPending();
        tokeniser30.emit('\uffff');
        tokeniser30.acknowledgeSelfClosingFlag();
        tokeniser30.emit("hi!");
        org.jsoup.parser.TokeniserState tokeniserState41 = tokeniser30.getState();
        tokeniser10.transition(tokeniserState41);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser10.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNull(comment16);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNull(stringBuilder33);
        org.junit.Assert.assertNull(stringBuilder34);
        org.junit.Assert.assertNotNull(tokeniserState41);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        char char4 = characterReader1.consume();
        characterReader1.unconsume();
        java.lang.String str6 = characterReader1.consumeAsString();
        char char7 = characterReader1.consume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 2, end 2, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\uffff' + "'", char7 == '\uffff');
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList5);
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser6.dataBuffer = stringBuilder7;
        org.jsoup.parser.Token.Tag tag10 = tokeniser6.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser6.getState();
        tokeniser6.createDoctypePending();
        tokeniser6.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = tokeniser6.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList22);
        boolean boolean25 = characterReader1.matchesIgnoreCase("");
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            char char27 = characterReader1.current();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser2.getState();
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        tokeniser2.emit('4');
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        org.jsoup.parser.Token.Tag tag13 = tokeniser11.createTagPending(false);
        org.jsoup.parser.Token.Comment comment14 = tokeniser11.commentPending;
        org.jsoup.parser.Token.Doctype doctype15 = null;
        tokeniser11.doctypePending = doctype15;
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList18);
        org.jsoup.parser.Token.Tag tag21 = tokeniser19.createTagPending(false);
        tokeniser19.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader23, parseErrorList24);
        org.jsoup.parser.Token.Tag tag27 = tokeniser25.createTagPending(false);
        tokeniser25.createTempBuffer();
        tokeniser25.createDoctypePending();
        org.jsoup.parser.Token.Tag tag31 = tokeniser25.createTagPending(true);
        tokeniser19.emit((org.jsoup.parser.Token) tag31);
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader33, parseErrorList34);
        java.lang.StringBuilder stringBuilder36 = null;
        tokeniser35.dataBuffer = stringBuilder36;
        tokeniser35.createCommentPending();
        org.jsoup.parser.Token.Comment comment39 = tokeniser35.commentPending;
        tokeniser19.commentPending = comment39;
        tokeniser11.commentPending = comment39;
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader42, parseErrorList43);
        org.jsoup.parser.Token.Tag tag46 = tokeniser44.createTagPending(false);
        tokeniser44.createTempBuffer();
        tokeniser44.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype49 = null;
        tokeniser44.doctypePending = doctype49;
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
        org.jsoup.parser.CharacterReader characterReader62 = null;
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        org.jsoup.parser.Tokeniser tokeniser64 = new org.jsoup.parser.Tokeniser(characterReader62, parseErrorList63);
        org.jsoup.parser.Token.Tag tag66 = tokeniser64.createTagPending(false);
        tokeniser64.createTempBuffer();
        tokeniser64.createDoctypePending();
        org.jsoup.parser.Token.Tag tag70 = tokeniser64.createTagPending(true);
        tokeniser53.emit((org.jsoup.parser.Token) tag70);
        tokeniser44.emit((org.jsoup.parser.Token) tag70);
        tokeniser11.tagPending = tag70;
        tokeniser2.tagPending = tag70;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str75 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(comment39);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNull(doctype54);
        org.junit.Assert.assertNotNull(tokeniserState60);
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertNotNull(tag70);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        tokeniser2.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token7 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        org.jsoup.parser.Token.Comment comment12 = tokeniser2.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(comment12);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        tokeniser2.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        tokeniser15.createTempBuffer();
        tokeniser15.createTempBuffer();
        org.jsoup.parser.Token.Comment comment18 = tokeniser15.commentPending;
        java.lang.StringBuilder stringBuilder19 = null;
        tokeniser15.dataBuffer = stringBuilder19;
        org.jsoup.parser.Token.Comment comment21 = tokeniser15.commentPending;
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader22, parseErrorList23);
        org.jsoup.parser.Token.Tag tag26 = tokeniser24.createTagPending(false);
        org.jsoup.parser.Token.Comment comment27 = tokeniser24.commentPending;
        org.jsoup.parser.Token.Doctype doctype28 = null;
        tokeniser24.doctypePending = doctype28;
        tokeniser24.createTempBuffer();
        java.lang.StringBuilder stringBuilder31 = tokeniser24.dataBuffer;
        boolean boolean32 = tokeniser24.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState33 = tokeniser24.getState();
        tokeniser15.transition(tokeniserState33);
        org.jsoup.parser.TokeniserState tokeniserState35 = tokeniser15.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNull(comment18);
        org.junit.Assert.assertNull(comment21);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNull(comment27);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(tokeniserState35);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        boolean boolean5 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag7 = tokeniser2.createTagPending(true);
        tokeniser2.emit("");
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment11 = tokeniser2.commentPending;
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        char char14 = characterReader13.current();
        java.lang.String str16 = characterReader13.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList17);
        java.lang.StringBuilder stringBuilder19 = null;
        tokeniser18.dataBuffer = stringBuilder19;
        org.jsoup.parser.Token.Tag tag22 = tokeniser18.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype23 = tokeniser18.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser18.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(comment11);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\uffff' + "'", char14 == '\uffff');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(doctype23);
        org.junit.Assert.assertNotNull(tokeniserState24);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        boolean boolean4 = characterReader1.matchesLetter();
        characterReader1.rewindToMark();
        boolean boolean6 = characterReader1.matchesLetter();
        characterReader1.mark();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList8);
        tokeniser9.createTempBuffer();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        org.jsoup.parser.Token.Doctype doctype5 = tokeniser2.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype5);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.emit("hi!");
        org.jsoup.parser.Token.Doctype doctype8 = null;
        tokeniser2.doctypePending = doctype8;
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        char char12 = characterReader11.current();
        java.lang.String str14 = characterReader11.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList15);
        java.lang.StringBuilder stringBuilder17 = null;
        tokeniser16.dataBuffer = stringBuilder17;
        org.jsoup.parser.Token.Tag tag20 = tokeniser16.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser16.getState();
        tokeniser16.createDoctypePending();
        tokeniser16.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList25);
        tokeniser26.createTempBuffer();
        tokeniser26.emit("");
        java.lang.StringBuilder stringBuilder30 = tokeniser26.dataBuffer;
        tokeniser16.dataBuffer = stringBuilder30;
        tokeniser2.dataBuffer = stringBuilder30;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader33, parseErrorList34);
        java.lang.StringBuilder stringBuilder36 = null;
        tokeniser35.dataBuffer = stringBuilder36;
        tokeniser35.createCommentPending();
        org.jsoup.parser.Token.Comment comment39 = tokeniser35.commentPending;
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader40, parseErrorList41);
        org.jsoup.parser.Token.Tag tag44 = tokeniser42.createTagPending(false);
        tokeniser42.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader46, parseErrorList47);
        org.jsoup.parser.Token.Tag tag50 = tokeniser48.createTagPending(false);
        tokeniser48.createTempBuffer();
        tokeniser48.createDoctypePending();
        org.jsoup.parser.Token.Tag tag54 = tokeniser48.createTagPending(true);
        tokeniser42.emit((org.jsoup.parser.Token) tag54);
        tokeniser35.emit((org.jsoup.parser.Token) tag54);
        org.jsoup.parser.TokeniserState tokeniserState57 = tokeniser35.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertNotNull(comment39);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertNotNull(tokeniserState57);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        org.jsoup.parser.Token.Tag tag10 = tokeniser8.createTagPending(false);
        java.lang.StringBuilder stringBuilder11 = tokeniser8.dataBuffer;
        java.lang.StringBuilder stringBuilder12 = tokeniser8.dataBuffer;
        tokeniser8.createCommentPending();
        org.jsoup.parser.Token.Comment comment14 = tokeniser8.commentPending;
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("");
        boolean boolean18 = characterReader16.matches(' ');
        characterReader16.advance();
        characterReader16.unconsume();
        characterReader16.rewindToMark();
        boolean boolean23 = characterReader16.matchConsume("");
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList24);
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader26, parseErrorList27);
        org.jsoup.parser.Token.Tag tag30 = tokeniser28.createTagPending(false);
        org.jsoup.parser.Token.Comment comment31 = tokeniser28.commentPending;
        org.jsoup.parser.Token.Doctype doctype32 = null;
        tokeniser28.doctypePending = doctype32;
        tokeniser28.createTempBuffer();
        java.lang.StringBuilder stringBuilder35 = tokeniser28.dataBuffer;
        boolean boolean36 = tokeniser28.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser28.getState();
        tokeniser25.advanceTransition(tokeniserState37);
        tokeniser25.emit(' ');
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader41, parseErrorList42);
        org.jsoup.parser.TokeniserState tokeniserState44 = tokeniser43.getState();
        tokeniser43.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState46 = tokeniser43.getState();
        tokeniser43.emit('\uffff');
        org.jsoup.parser.Token.Comment comment49 = tokeniser43.commentPending;
        tokeniser25.emit((org.jsoup.parser.Token) comment49);
        tokeniser8.commentPending = comment49;
        tokeniser2.commentPending = comment49;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char55 = tokeniser2.consumeCharacterReference((java.lang.Character) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(stringBuilder11);
        org.junit.Assert.assertNull(stringBuilder12);
        org.junit.Assert.assertNotNull(comment14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNull(comment31);
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertNotNull(tokeniserState44);
        org.junit.Assert.assertNotNull(tokeniserState46);
        org.junit.Assert.assertNotNull(comment49);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNotNull(tokeniserState16);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.emit("");
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        boolean boolean13 = tokeniser2.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token14 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(stringBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser2.getState();
        boolean boolean6 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser2.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tokeniserState7);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader5, parseErrorList6);
        tokeniser7.createTempBuffer();
        tokeniser7.createTempBuffer();
        java.lang.StringBuilder stringBuilder10 = tokeniser7.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder10;
        tokeniser2.emit('\uffff');
        java.lang.Class<?> wildcardClass14 = tokeniser2.getClass();
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        java.lang.String str5 = characterReader1.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList6);
        java.lang.Character char10 = tokeniser7.consumeCharacterReference((java.lang.Character) '\ufffd', true);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(char10);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.emit("hi!");
        org.jsoup.parser.Token.Tag tag8 = tokeniser2.tagPending;
        tokeniser2.createCommentPending();
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
        org.jsoup.parser.Token.Doctype doctype27 = tokeniser23.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser23.getState();
        tokeniser17.transition(tokeniserState28);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag8);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(comment26);
        org.junit.Assert.assertNull(doctype27);
        org.junit.Assert.assertNotNull(tokeniserState28);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.toString();
        characterReader1.mark();
        characterReader1.unconsume();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = characterReader1.matches('#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        int int7 = characterReader1.pos();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = tokeniser9.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.toString();
        characterReader1.mark();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList10);
        java.lang.Class<?> wildcardClass12 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.unconsume();
        boolean boolean4 = characterReader1.matchConsume("");
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
            java.lang.String str31 = tokeniser2.appropriateEndTagName();
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

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList22);
        java.lang.Character char26 = tokeniser23.consumeCharacterReference((java.lang.Character) 'a', false);
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader27, parseErrorList28);
        org.jsoup.parser.Token.Doctype doctype30 = tokeniser29.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState31 = null;
        tokeniser29.transition(tokeniserState31);
        org.jsoup.parser.Token.Doctype doctype33 = null;
        tokeniser29.doctypePending = doctype33;
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader35, parseErrorList36);
        org.jsoup.parser.Token.Tag tag39 = tokeniser37.createTagPending(false);
        tokeniser37.createTempBuffer();
        boolean boolean41 = tokeniser37.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState42 = tokeniser37.getState();
        tokeniser29.transition(tokeniserState42);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser23.eofError(tokeniserState42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(char26);
        org.junit.Assert.assertNull(doctype30);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tokeniserState42);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser2.doctypePending = doctype6;
        boolean boolean8 = tokeniser2.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = tokeniser2.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser2.getState();
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        tokeniser2.emit('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNull(stringBuilder6);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        tokeniser8.createTempBuffer();
        tokeniser8.createTempBuffer();
        org.jsoup.parser.Token.Comment comment11 = tokeniser8.commentPending;
        java.lang.StringBuilder stringBuilder12 = null;
        tokeniser8.dataBuffer = stringBuilder12;
        org.jsoup.parser.Token.Comment comment14 = null;
        tokeniser8.commentPending = comment14;
        tokeniser8.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList18);
        org.jsoup.parser.Token.Tag tag21 = tokeniser19.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype22 = tokeniser19.doctypePending;
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader23, parseErrorList24);
        org.jsoup.parser.Token.Tag tag27 = tokeniser25.createTagPending(false);
        tokeniser19.tagPending = tag27;
        tokeniser8.emit((org.jsoup.parser.Token) tag27);
        tokeniser2.emit((org.jsoup.parser.Token) tag27);
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser2.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment11);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNull(doctype22);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tokeniserState31);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        tokeniser2.emit('\ufffd');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.createCommentPending();
        tokeniser2.emit('\uffff');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char11 = tokeniser2.consumeCharacterReference((java.lang.Character) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        tokeniser2.emit("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char18 = tokeniser2.consumeCharacterReference((java.lang.Character) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        boolean boolean5 = characterReader1.matchesDigit();
        boolean boolean6 = characterReader1.isEmpty();
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        char char23 = characterReader1.consume();
        characterReader1.mark();
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
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\uffff' + "'", char23 == '\uffff');
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        tokeniser10.emit(' ');
        tokeniser10.emit('\ufffd');
        // The following exception was thrown during execution in test generation
        try {
            tokeniser10.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNull(comment16);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tokeniserState22);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.toString();
        characterReader1.mark();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList10);
        java.lang.Class<?> wildcardClass12 = tokeniser11.getClass();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        java.lang.String str8 = characterReader1.consumeTo("hi!");
        int int9 = characterReader1.pos();
        boolean boolean10 = characterReader1.matchesDigit();
        java.lang.String str11 = characterReader1.consumeToEnd();
        java.lang.String str13 = characterReader1.consumeTo('#');
        boolean boolean14 = characterReader1.matchesDigit();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        java.lang.String str15 = characterReader1.consumeToEnd();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        tokeniser2.emit("");
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
        tokeniser2.tagPending = tag21;
        tokeniser2.emit("");
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag27 = tokeniser2.tagPending;
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(tag27);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.advance();
        boolean boolean8 = characterReader1.matches("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        tokeniser2.emit("");
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
        tokeniser2.tagPending = tag21;
        tokeniser2.emit("");
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNotNull(tag21);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser2.getState();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        org.jsoup.parser.Token.Tag tag10 = tokeniser8.createTagPending(false);
        tokeniser8.createTempBuffer();
        tokeniser8.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype13 = null;
        tokeniser8.doctypePending = doctype13;
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader15, parseErrorList16);
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser17.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState19 = null;
        tokeniser17.transition(tokeniserState19);
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader21, parseErrorList22);
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser23.getState();
        tokeniser17.transition(tokeniserState24);
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader26, parseErrorList27);
        org.jsoup.parser.Token.Tag tag30 = tokeniser28.createTagPending(false);
        tokeniser28.createTempBuffer();
        tokeniser28.createDoctypePending();
        org.jsoup.parser.Token.Tag tag34 = tokeniser28.createTagPending(true);
        tokeniser17.emit((org.jsoup.parser.Token) tag34);
        tokeniser8.emit((org.jsoup.parser.Token) tag34);
        java.lang.StringBuilder stringBuilder37 = tokeniser8.dataBuffer;
        tokeniser8.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState39 = tokeniser8.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState39);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser2.doctypePending;
        tokeniser2.emit("");
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(doctype6);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        boolean boolean8 = characterReader1.matches('\ufffd');
        java.lang.String str10 = characterReader1.consumeTo("hi!");
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = characterReader1.matchesLetter();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean5 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        boolean boolean9 = characterReader7.matches(' ');
        characterReader7.advance();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        char char13 = characterReader12.current();
        java.lang.String str15 = characterReader12.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList16);
        char[] charArray22 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str23 = characterReader12.consumeToAny(charArray22);
        boolean boolean24 = characterReader7.matchesAny(charArray22);
        java.lang.String str25 = characterReader1.consumeToAny(charArray22);
        java.lang.String str26 = characterReader1.consumeToEnd();
        characterReader1.rewindToMark();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\uffff' + "'", char13 == '\uffff');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser2.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token12 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(doctype11);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        boolean boolean6 = characterReader1.matches("hi!");
        boolean boolean8 = characterReader1.matches("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.emit('\uffff');
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        tokeniser10.createTempBuffer();
        tokeniser10.createTempBuffer();
        java.lang.StringBuilder stringBuilder13 = tokeniser10.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        org.jsoup.parser.Token.Tag tag18 = tokeniser16.createTagPending(false);
        tokeniser10.tagPending = tag18;
        tokeniser10.emit('\ufffd');
        org.jsoup.parser.Token.Tag tag22 = tokeniser10.tagPending;
        tokeniser2.tagPending = tag22;
        tokeniser2.createDoctypePending();
        java.lang.StringBuilder stringBuilder25 = tokeniser2.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char28 = tokeniser2.consumeCharacterReference((java.lang.Character) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(stringBuilder25);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        tokeniser2.createCommentPending();
        tokeniser2.emitTagPending();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = tokeniser2.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNull(stringBuilder6);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser8.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        tokeniser2.createCommentPending();
        tokeniser2.emit('\uffff');
        tokeniser2.emitTagPending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNull(stringBuilder6);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser2.doctypePending;
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser2.commentPending = comment4;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = tokeniser2.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype3);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.createTempBuffer();
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser2.dataBuffer = stringBuilder7;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList5);
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser6.dataBuffer = stringBuilder7;
        org.jsoup.parser.Token.Tag tag10 = tokeniser6.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser6.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser6.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser2.doctypePending;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.Token.Tag tag12 = tokeniser10.createTagPending(false);
        tokeniser10.createTempBuffer();
        tokeniser10.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype15 = null;
        tokeniser10.doctypePending = doctype15;
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
        tokeniser10.emit((org.jsoup.parser.Token) tag36);
        java.lang.StringBuilder stringBuilder39 = tokeniser10.dataBuffer;
        tokeniser10.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState41 = tokeniser10.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype6);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype20);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState41);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        boolean boolean24 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str25 = characterReader1.consumeAsString();
        char char26 = characterReader1.current();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\uffff' + "'", char26 == '\uffff');
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        java.lang.String str15 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        characterReader1.mark();
        java.lang.String str61 = characterReader1.consumeAsString();
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
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Comment comment7 = tokeniser2.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(comment7);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        boolean boolean5 = tokeniser2.currentNodeInHtmlNS();
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        org.jsoup.parser.Token.Comment comment8 = null;
        tokeniser2.commentPending = comment8;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        tokeniser12.createTempBuffer();
        tokeniser12.createTempBuffer();
        java.lang.StringBuilder stringBuilder15 = tokeniser12.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder15;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token17 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        java.lang.String str8 = characterReader1.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList9);
        tokeniser10.acknowledgeSelfClosingFlag();
        boolean boolean12 = tokeniser10.currentNodeInHtmlNS();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        int int9 = characterReader1.pos();
        boolean boolean10 = characterReader1.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        boolean boolean14 = characterReader12.matches(' ');
        characterReader12.advance();
        characterReader12.unconsume();
        characterReader12.rewindToMark();
        boolean boolean18 = characterReader12.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        char char21 = characterReader20.current();
        java.lang.String str22 = characterReader20.consumeHexSequence();
        boolean boolean23 = characterReader20.isEmpty();
        boolean boolean25 = characterReader20.matches('a');
        java.lang.String str26 = characterReader20.toString();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        char char29 = characterReader28.current();
        java.lang.String str31 = characterReader28.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader28, parseErrorList32);
        char[] charArray38 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str39 = characterReader28.consumeToAny(charArray38);
        java.lang.String str40 = characterReader20.consumeToAny(charArray38);
        java.lang.String str41 = characterReader12.consumeToAny(charArray38);
        boolean boolean42 = characterReader1.matchesAny(charArray38);
        characterReader1.unconsume();
        boolean boolean45 = characterReader1.matchConsumeIgnoreCase("");
        boolean boolean47 = characterReader1.matches("hi!");
        characterReader1.advance();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\uffff' + "'", char21 == '\uffff');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\uffff' + "'", char29 == '\uffff');
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        tokeniser8.createTempBuffer();
        tokeniser8.createTempBuffer();
        org.jsoup.parser.Token.Comment comment11 = tokeniser8.commentPending;
        java.lang.StringBuilder stringBuilder12 = null;
        tokeniser8.dataBuffer = stringBuilder12;
        org.jsoup.parser.Token.Comment comment14 = null;
        tokeniser8.commentPending = comment14;
        tokeniser8.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList18);
        org.jsoup.parser.Token.Tag tag21 = tokeniser19.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype22 = tokeniser19.doctypePending;
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader23, parseErrorList24);
        org.jsoup.parser.Token.Tag tag27 = tokeniser25.createTagPending(false);
        tokeniser19.tagPending = tag27;
        tokeniser8.emit((org.jsoup.parser.Token) tag27);
        tokeniser2.emit((org.jsoup.parser.Token) tag27);
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser2.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment11);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNull(doctype22);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tokeniserState31);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Comment comment7 = tokeniser2.commentPending;
        tokeniser2.emit('\uffff');
        tokeniser2.createDoctypePending();
        boolean boolean11 = tokeniser2.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char14 = tokeniser2.consumeCharacterReference((java.lang.Character) '\uffff', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        org.jsoup.parser.TokeniserState tokeniserState9 = null;
        tokeniser2.transition(tokeniserState9);
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
        org.jsoup.parser.TokeniserState tokeniserState42 = tokeniser13.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment22);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNull(doctype33);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(tokeniserState42);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser2.doctypePending = doctype6;
        org.jsoup.parser.Token.Comment comment8 = null;
        tokeniser2.commentPending = comment8;
        tokeniser2.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        org.jsoup.parser.Token.Tag tag16 = tokeniser14.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype17 = tokeniser14.doctypePending;
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList19);
        org.jsoup.parser.Token.Tag tag22 = tokeniser20.createTagPending(false);
        tokeniser14.tagPending = tag22;
        java.lang.StringBuilder stringBuilder24 = tokeniser14.dataBuffer;
        tokeniser14.emitTagPending();
        tokeniser14.acknowledgeSelfClosingFlag();
        tokeniser14.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag28 = tokeniser14.tagPending;
        tokeniser2.tagPending = tag28;
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader30, parseErrorList31);
        java.lang.StringBuilder stringBuilder33 = null;
        tokeniser32.dataBuffer = stringBuilder33;
        org.jsoup.parser.Token.Tag tag35 = null;
        tokeniser32.tagPending = tag35;
        org.jsoup.parser.Token.Tag tag37 = tokeniser32.tagPending;
        org.jsoup.parser.CharacterReader characterReader39 = new org.jsoup.parser.CharacterReader("");
        char char40 = characterReader39.current();
        java.lang.String str41 = characterReader39.consumeLetterSequence();
        java.lang.String str43 = characterReader39.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader39, parseErrorList44);
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader46, parseErrorList47);
        org.jsoup.parser.TokeniserState tokeniserState49 = tokeniser48.getState();
        tokeniser48.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState51 = tokeniser48.getState();
        tokeniser45.advanceTransition(tokeniserState51);
        tokeniser32.transition(tokeniserState51);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(doctype11);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(doctype17);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(stringBuilder24);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNull(tag37);
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + '\uffff' + "'", char40 == '\uffff');
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(tokeniserState49);
        org.junit.Assert.assertNotNull(tokeniserState51);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        char char24 = characterReader23.current();
        java.lang.String str25 = characterReader23.consumeHexSequence();
        boolean boolean26 = characterReader23.isEmpty();
        boolean boolean28 = characterReader23.matches('a');
        java.lang.String str29 = characterReader23.toString();
        org.jsoup.parser.CharacterReader characterReader31 = new org.jsoup.parser.CharacterReader("");
        char char32 = characterReader31.current();
        java.lang.String str34 = characterReader31.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader31, parseErrorList35);
        char[] charArray41 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str42 = characterReader31.consumeToAny(charArray41);
        java.lang.String str43 = characterReader23.consumeToAny(charArray41);
        boolean boolean44 = characterReader1.matchesAny(charArray41);
        java.lang.String str45 = characterReader1.toString();
        boolean boolean47 = characterReader1.matchConsumeIgnoreCase("");
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
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\uffff' + "'", char24 == '\uffff');
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\uffff' + "'", char32 == '\uffff');
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        org.jsoup.parser.Token.Tag tag5 = tokeniser2.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag5);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser10.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState12 = null;
        tokeniser10.transition(tokeniserState12);
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser16.getState();
        tokeniser10.transition(tokeniserState17);
        tokeniser10.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        java.lang.StringBuilder stringBuilder23 = null;
        tokeniser22.dataBuffer = stringBuilder23;
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader25, parseErrorList26);
        tokeniser27.createTempBuffer();
        tokeniser27.createTempBuffer();
        java.lang.StringBuilder stringBuilder30 = tokeniser27.dataBuffer;
        tokeniser22.dataBuffer = stringBuilder30;
        tokeniser10.dataBuffer = stringBuilder30;
        java.lang.StringBuilder stringBuilder33 = tokeniser10.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder33;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNull(doctype11);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.toString();
        characterReader1.mark();
        characterReader1.unconsume();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList11);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList13);
        // The following exception was thrown during execution in test generation
        try {
            char char15 = characterReader1.current();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        boolean boolean6 = characterReader1.matchesIgnoreCase("hi!");
        java.lang.String str7 = characterReader1.consumeAsString();
        boolean boolean8 = characterReader1.isEmpty();
        boolean boolean10 = characterReader1.matchConsume("");
        characterReader1.unconsume();
        java.lang.String str12 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype5 = tokeniser2.doctypePending;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser2.doctypePending;
        tokeniser2.emit('4');
        java.lang.Class<?> wildcardClass9 = tokeniser2.getClass();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNull(doctype6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        java.lang.String str8 = characterReader1.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList9);
        char char11 = characterReader1.current();
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
        java.lang.String str34 = characterReader13.consumeLetterSequence();
        org.jsoup.parser.CharacterReader characterReader36 = new org.jsoup.parser.CharacterReader("");
        char char37 = characterReader36.current();
        java.lang.String str39 = characterReader36.consumeTo('#');
        boolean boolean40 = characterReader36.matchesDigit();
        boolean boolean41 = characterReader36.isEmpty();
        org.jsoup.parser.CharacterReader characterReader43 = new org.jsoup.parser.CharacterReader("");
        char char44 = characterReader43.current();
        java.lang.String str45 = characterReader43.consumeHexSequence();
        boolean boolean46 = characterReader43.isEmpty();
        boolean boolean48 = characterReader43.matches('a');
        java.lang.String str49 = characterReader43.toString();
        org.jsoup.parser.CharacterReader characterReader51 = new org.jsoup.parser.CharacterReader("");
        char char52 = characterReader51.current();
        java.lang.String str54 = characterReader51.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.Tokeniser tokeniser56 = new org.jsoup.parser.Tokeniser(characterReader51, parseErrorList55);
        char[] charArray61 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str62 = characterReader51.consumeToAny(charArray61);
        java.lang.String str63 = characterReader43.consumeToAny(charArray61);
        java.lang.String str64 = characterReader36.consumeToAny(charArray61);
        boolean boolean65 = characterReader13.matchesAny(charArray61);
        boolean boolean66 = characterReader1.matchesAny(charArray61);
        java.lang.String str67 = characterReader1.consumeAsString();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
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
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '\uffff' + "'", char37 == '\uffff');
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + char44 + "' != '" + '\uffff' + "'", char44 == '\uffff');
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + char52 + "' != '" + '\uffff' + "'", char52 == '\uffff');
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList5);
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser6.dataBuffer = stringBuilder7;
        org.jsoup.parser.Token.Tag tag10 = tokeniser6.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser6.getState();
        tokeniser6.createDoctypePending();
        java.lang.Character char15 = tokeniser6.consumeCharacterReference((java.lang.Character) '4', false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = tokeniser6.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNull(char15);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        tokeniser24.createTempBuffer();
        tokeniser24.createTempBuffer();
        tokeniser24.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype29 = null;
        tokeniser24.doctypePending = doctype29;
        org.jsoup.parser.Token.Comment comment31 = tokeniser24.commentPending;
        org.jsoup.parser.Token.Tag tag32 = tokeniser24.tagPending;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader33, parseErrorList34);
        org.jsoup.parser.Token.Tag tag37 = tokeniser35.createTagPending(false);
        tokeniser35.createTempBuffer();
        tokeniser35.createDoctypePending();
        org.jsoup.parser.Token.Comment comment40 = tokeniser35.commentPending;
        org.jsoup.parser.Token.Tag tag41 = tokeniser35.tagPending;
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader42, parseErrorList43);
        org.jsoup.parser.Token.Tag tag46 = tokeniser44.createTagPending(false);
        java.lang.StringBuilder stringBuilder47 = tokeniser44.dataBuffer;
        java.lang.StringBuilder stringBuilder48 = tokeniser44.dataBuffer;
        tokeniser44.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader50, parseErrorList51);
        org.jsoup.parser.Token.Doctype doctype53 = tokeniser52.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState54 = null;
        tokeniser52.transition(tokeniserState54);
        org.jsoup.parser.CharacterReader characterReader56 = null;
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.Tokeniser tokeniser58 = new org.jsoup.parser.Tokeniser(characterReader56, parseErrorList57);
        org.jsoup.parser.TokeniserState tokeniserState59 = tokeniser58.getState();
        tokeniser52.transition(tokeniserState59);
        tokeniser52.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader62 = null;
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        org.jsoup.parser.Tokeniser tokeniser64 = new org.jsoup.parser.Tokeniser(characterReader62, parseErrorList63);
        java.lang.StringBuilder stringBuilder65 = null;
        tokeniser64.dataBuffer = stringBuilder65;
        org.jsoup.parser.CharacterReader characterReader67 = null;
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        org.jsoup.parser.Tokeniser tokeniser69 = new org.jsoup.parser.Tokeniser(characterReader67, parseErrorList68);
        tokeniser69.createTempBuffer();
        tokeniser69.createTempBuffer();
        java.lang.StringBuilder stringBuilder72 = tokeniser69.dataBuffer;
        tokeniser64.dataBuffer = stringBuilder72;
        tokeniser52.dataBuffer = stringBuilder72;
        java.lang.StringBuilder stringBuilder75 = tokeniser52.dataBuffer;
        tokeniser44.dataBuffer = stringBuilder75;
        tokeniser35.dataBuffer = stringBuilder75;
        tokeniser24.dataBuffer = stringBuilder75;
        tokeniser2.dataBuffer = stringBuilder75;
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNull(comment31);
        org.junit.Assert.assertNull(tag32);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNull(comment40);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNull(stringBuilder47);
        org.junit.Assert.assertNull(stringBuilder48);
        org.junit.Assert.assertNull(doctype53);
        org.junit.Assert.assertNotNull(tokeniserState59);
        org.junit.Assert.assertNotNull(stringBuilder72);
        org.junit.Assert.assertEquals(stringBuilder72.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder75);
        org.junit.Assert.assertEquals(stringBuilder75.toString(), "");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        tokeniser2.createCommentPending();
        tokeniser2.emit('\uffff');
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token12 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNull(stringBuilder6);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser2.doctypePending = doctype6;
        tokeniser2.createTempBuffer();
        java.lang.StringBuilder stringBuilder9 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder10 = tokeniser2.dataBuffer;
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Doctype doctype3 = null;
        tokeniser2.doctypePending = doctype3;
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader5, parseErrorList6);
        org.jsoup.parser.Token.Tag tag9 = tokeniser7.createTagPending(false);
        tokeniser7.createTempBuffer();
        tokeniser7.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype12 = null;
        tokeniser7.doctypePending = doctype12;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        org.jsoup.parser.Token.Doctype doctype17 = tokeniser16.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState18 = null;
        tokeniser16.transition(tokeniserState18);
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser22.getState();
        tokeniser16.transition(tokeniserState23);
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader25, parseErrorList26);
        org.jsoup.parser.Token.Tag tag29 = tokeniser27.createTagPending(false);
        tokeniser27.createTempBuffer();
        tokeniser27.createDoctypePending();
        org.jsoup.parser.Token.Tag tag33 = tokeniser27.createTagPending(true);
        tokeniser16.emit((org.jsoup.parser.Token) tag33);
        tokeniser7.emit((org.jsoup.parser.Token) tag33);
        java.lang.StringBuilder stringBuilder36 = tokeniser7.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader37, parseErrorList38);
        org.jsoup.parser.TokeniserState tokeniserState40 = tokeniser39.getState();
        tokeniser7.transition(tokeniserState40);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(doctype17);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState40);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        int int9 = characterReader1.pos();
        boolean boolean10 = characterReader1.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader12 = new org.jsoup.parser.CharacterReader("");
        boolean boolean14 = characterReader12.matches(' ');
        characterReader12.advance();
        characterReader12.unconsume();
        characterReader12.rewindToMark();
        boolean boolean18 = characterReader12.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        char char21 = characterReader20.current();
        java.lang.String str22 = characterReader20.consumeHexSequence();
        boolean boolean23 = characterReader20.isEmpty();
        boolean boolean25 = characterReader20.matches('a');
        java.lang.String str26 = characterReader20.toString();
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        char char29 = characterReader28.current();
        java.lang.String str31 = characterReader28.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader28, parseErrorList32);
        char[] charArray38 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str39 = characterReader28.consumeToAny(charArray38);
        java.lang.String str40 = characterReader20.consumeToAny(charArray38);
        java.lang.String str41 = characterReader12.consumeToAny(charArray38);
        boolean boolean42 = characterReader1.matchesAny(charArray38);
        boolean boolean43 = characterReader1.matchesLetter();
        boolean boolean45 = characterReader1.matchConsume("");
        characterReader1.advance();
        java.lang.Class<?> wildcardClass47 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\uffff' + "'", char21 == '\uffff');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\uffff' + "'", char29 == '\uffff');
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        tokeniser2.createCommentPending();
        tokeniser2.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token9 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNull(stringBuilder6);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype5 = tokeniser2.doctypePending;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        java.lang.StringBuilder stringBuilder10 = null;
        tokeniser9.dataBuffer = stringBuilder10;
        tokeniser9.createCommentPending();
        org.jsoup.parser.Token.Comment comment13 = tokeniser9.commentPending;
        tokeniser2.commentPending = comment13;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNull(doctype6);
        org.junit.Assert.assertNotNull(comment13);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        char char4 = characterReader1.consume();
        java.lang.Class<?> wildcardClass5 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = tokeniser2.appropriateEndTagName();
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
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        java.lang.String str34 = characterReader1.consumeDigitSequence();
        characterReader1.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end -1, length 0");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        char char4 = characterReader1.consume();
        characterReader1.rewindToMark();
        java.lang.String str6 = characterReader1.toString();
        java.lang.String str7 = characterReader1.consumeHexSequence();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str3 = characterReader1.consumeTo("hi!");
        char char4 = characterReader1.consume();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        boolean boolean5 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag7 = tokeniser2.createTagPending(true);
        tokeniser2.emit("");
        tokeniser2.acknowledgeSelfClosingFlag();
        java.lang.StringBuilder stringBuilder11 = tokeniser2.dataBuffer;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.createTempBuffer();
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(stringBuilder11);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment11 = tokeniser2.commentPending;
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(comment11);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.emit("hi!");
        org.jsoup.parser.Token.Doctype doctype8 = null;
        tokeniser2.doctypePending = doctype8;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        tokeniser12.createTempBuffer();
        tokeniser12.createTempBuffer();
        org.jsoup.parser.Token.Comment comment15 = tokeniser12.commentPending;
        java.lang.StringBuilder stringBuilder16 = null;
        tokeniser12.dataBuffer = stringBuilder16;
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
        tokeniser12.tagPending = tag37;
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("");
        char char42 = characterReader41.current();
        java.lang.String str44 = characterReader41.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader41, parseErrorList45);
        java.lang.StringBuilder stringBuilder47 = null;
        tokeniser46.dataBuffer = stringBuilder47;
        org.jsoup.parser.Token.Tag tag50 = tokeniser46.createTagPending(true);
        tokeniser12.emit((org.jsoup.parser.Token) tag50);
        tokeniser2.tagPending = tag50;
        org.jsoup.parser.CharacterReader characterReader53 = null;
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.Tokeniser tokeniser55 = new org.jsoup.parser.Tokeniser(characterReader53, parseErrorList54);
        org.jsoup.parser.Token.Tag tag57 = tokeniser55.createTagPending(false);
        java.lang.StringBuilder stringBuilder58 = tokeniser55.dataBuffer;
        java.lang.StringBuilder stringBuilder59 = tokeniser55.dataBuffer;
        tokeniser55.createCommentPending();
        org.jsoup.parser.Token.Comment comment61 = tokeniser55.commentPending;
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("");
        boolean boolean65 = characterReader63.matches(' ');
        characterReader63.advance();
        characterReader63.unconsume();
        characterReader63.rewindToMark();
        boolean boolean70 = characterReader63.matchConsume("");
        org.jsoup.parser.ParseErrorList parseErrorList71 = null;
        org.jsoup.parser.Tokeniser tokeniser72 = new org.jsoup.parser.Tokeniser(characterReader63, parseErrorList71);
        org.jsoup.parser.CharacterReader characterReader73 = null;
        org.jsoup.parser.ParseErrorList parseErrorList74 = null;
        org.jsoup.parser.Tokeniser tokeniser75 = new org.jsoup.parser.Tokeniser(characterReader73, parseErrorList74);
        org.jsoup.parser.Token.Tag tag77 = tokeniser75.createTagPending(false);
        org.jsoup.parser.Token.Comment comment78 = tokeniser75.commentPending;
        org.jsoup.parser.Token.Doctype doctype79 = null;
        tokeniser75.doctypePending = doctype79;
        tokeniser75.createTempBuffer();
        java.lang.StringBuilder stringBuilder82 = tokeniser75.dataBuffer;
        boolean boolean83 = tokeniser75.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState84 = tokeniser75.getState();
        tokeniser72.advanceTransition(tokeniserState84);
        tokeniser72.emit(' ');
        org.jsoup.parser.CharacterReader characterReader88 = null;
        org.jsoup.parser.ParseErrorList parseErrorList89 = null;
        org.jsoup.parser.Tokeniser tokeniser90 = new org.jsoup.parser.Tokeniser(characterReader88, parseErrorList89);
        org.jsoup.parser.TokeniserState tokeniserState91 = tokeniser90.getState();
        tokeniser90.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState93 = tokeniser90.getState();
        tokeniser90.emit('\uffff');
        org.jsoup.parser.Token.Comment comment96 = tokeniser90.commentPending;
        tokeniser72.emit((org.jsoup.parser.Token) comment96);
        tokeniser55.commentPending = comment96;
        tokeniser2.commentPending = comment96;
        org.junit.Assert.assertNull(comment15);
        org.junit.Assert.assertNull(doctype21);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + '\uffff' + "'", char42 == '\uffff');
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNull(stringBuilder58);
        org.junit.Assert.assertNull(stringBuilder59);
        org.junit.Assert.assertNotNull(comment61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(tag77);
        org.junit.Assert.assertNull(comment78);
        org.junit.Assert.assertNotNull(stringBuilder82);
        org.junit.Assert.assertEquals(stringBuilder82.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(tokeniserState84);
        org.junit.Assert.assertNotNull(tokeniserState91);
        org.junit.Assert.assertNotNull(tokeniserState93);
        org.junit.Assert.assertNotNull(comment96);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        java.lang.String str22 = characterReader1.consumeToEnd();
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = characterReader1.consumeTo('\uffff');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Comment comment7 = tokeniser2.commentPending;
        tokeniser2.emit('\uffff');
        tokeniser2.createDoctypePending();
        boolean boolean11 = tokeniser2.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        tokeniser14.createTempBuffer();
        tokeniser14.createTempBuffer();
        tokeniser14.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList19);
        org.jsoup.parser.Token.Tag tag22 = tokeniser20.createTagPending(false);
        java.lang.StringBuilder stringBuilder23 = tokeniser20.dataBuffer;
        java.lang.StringBuilder stringBuilder24 = tokeniser20.dataBuffer;
        tokeniser20.createCommentPending();
        org.jsoup.parser.Token.Comment comment26 = tokeniser20.commentPending;
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader("");
        boolean boolean30 = characterReader28.matches(' ');
        characterReader28.advance();
        characterReader28.unconsume();
        characterReader28.rewindToMark();
        boolean boolean35 = characterReader28.matchConsume("");
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader28, parseErrorList36);
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader38, parseErrorList39);
        org.jsoup.parser.Token.Tag tag42 = tokeniser40.createTagPending(false);
        org.jsoup.parser.Token.Comment comment43 = tokeniser40.commentPending;
        org.jsoup.parser.Token.Doctype doctype44 = null;
        tokeniser40.doctypePending = doctype44;
        tokeniser40.createTempBuffer();
        java.lang.StringBuilder stringBuilder47 = tokeniser40.dataBuffer;
        boolean boolean48 = tokeniser40.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState49 = tokeniser40.getState();
        tokeniser37.advanceTransition(tokeniserState49);
        tokeniser37.emit(' ');
        org.jsoup.parser.CharacterReader characterReader53 = null;
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.Tokeniser tokeniser55 = new org.jsoup.parser.Tokeniser(characterReader53, parseErrorList54);
        org.jsoup.parser.TokeniserState tokeniserState56 = tokeniser55.getState();
        tokeniser55.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState58 = tokeniser55.getState();
        tokeniser55.emit('\uffff');
        org.jsoup.parser.Token.Comment comment61 = tokeniser55.commentPending;
        tokeniser37.emit((org.jsoup.parser.Token) comment61);
        tokeniser20.commentPending = comment61;
        tokeniser14.commentPending = comment61;
        org.jsoup.parser.CharacterReader characterReader65 = null;
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        org.jsoup.parser.Tokeniser tokeniser67 = new org.jsoup.parser.Tokeniser(characterReader65, parseErrorList66);
        org.jsoup.parser.TokeniserState tokeniserState68 = tokeniser67.getState();
        tokeniser67.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState70 = tokeniser67.getState();
        boolean boolean71 = tokeniser67.currentNodeInHtmlNS();
        tokeniser67.emitCommentPending();
        org.jsoup.parser.CharacterReader characterReader73 = null;
        org.jsoup.parser.ParseErrorList parseErrorList74 = null;
        org.jsoup.parser.Tokeniser tokeniser75 = new org.jsoup.parser.Tokeniser(characterReader73, parseErrorList74);
        java.lang.StringBuilder stringBuilder76 = null;
        tokeniser75.dataBuffer = stringBuilder76;
        org.jsoup.parser.CharacterReader characterReader78 = null;
        org.jsoup.parser.ParseErrorList parseErrorList79 = null;
        org.jsoup.parser.Tokeniser tokeniser80 = new org.jsoup.parser.Tokeniser(characterReader78, parseErrorList79);
        tokeniser80.createTempBuffer();
        tokeniser80.createTempBuffer();
        java.lang.StringBuilder stringBuilder83 = tokeniser80.dataBuffer;
        tokeniser75.dataBuffer = stringBuilder83;
        org.jsoup.parser.TokeniserState tokeniserState85 = tokeniser75.getState();
        tokeniser67.transition(tokeniserState85);
        tokeniser14.transition(tokeniserState85);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype5);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(stringBuilder23);
        org.junit.Assert.assertNull(stringBuilder24);
        org.junit.Assert.assertNotNull(comment26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNull(comment43);
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(tokeniserState49);
        org.junit.Assert.assertNotNull(tokeniserState56);
        org.junit.Assert.assertNotNull(tokeniserState58);
        org.junit.Assert.assertNotNull(comment61);
        org.junit.Assert.assertNotNull(tokeniserState68);
        org.junit.Assert.assertNotNull(tokeniserState70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(stringBuilder83);
        org.junit.Assert.assertEquals(stringBuilder83.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState85);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        java.lang.String str9 = characterReader1.consumeToEnd();
        boolean boolean10 = characterReader1.matchesLetter();
        java.lang.String str12 = characterReader1.consumeTo(' ');
        boolean boolean14 = characterReader1.matches('4');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean8 = characterReader1.matchConsume("");
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList9);
        tokeniser10.createDoctypePending();
        tokeniser10.emit('#');
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        org.jsoup.parser.Token.Tag tag18 = tokeniser16.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype19 = tokeniser16.doctypePending;
        org.jsoup.parser.Token.Doctype doctype20 = tokeniser16.doctypePending;
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader21, parseErrorList22);
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser23.getState();
        tokeniser23.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser23.getState();
        tokeniser16.transition(tokeniserState26);
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser16.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser10.eofError(tokeniserState28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNull(doctype19);
        org.junit.Assert.assertNull(doctype20);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNotNull(tokeniserState28);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.createCommentPending();
        tokeniser2.emit('\uffff');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token9 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = tokeniser2.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        int int7 = characterReader1.pos();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList8);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser9.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        char char4 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader7 = new org.jsoup.parser.CharacterReader("");
        boolean boolean9 = characterReader7.matches(' ');
        characterReader7.advance();
        characterReader7.unconsume();
        characterReader7.rewindToMark();
        boolean boolean13 = characterReader7.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader15 = new org.jsoup.parser.CharacterReader("");
        char char16 = characterReader15.current();
        java.lang.String str17 = characterReader15.consumeHexSequence();
        boolean boolean18 = characterReader15.isEmpty();
        boolean boolean20 = characterReader15.matches('a');
        java.lang.String str21 = characterReader15.toString();
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("");
        char char24 = characterReader23.current();
        java.lang.String str26 = characterReader23.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader23, parseErrorList27);
        char[] charArray33 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str34 = characterReader23.consumeToAny(charArray33);
        java.lang.String str35 = characterReader15.consumeToAny(charArray33);
        java.lang.String str36 = characterReader7.consumeToAny(charArray33);
        characterReader7.rewindToMark();
        boolean boolean39 = characterReader7.containsIgnoreCase("");
        org.jsoup.parser.CharacterReader characterReader41 = new org.jsoup.parser.CharacterReader("");
        char char42 = characterReader41.current();
        java.lang.String str43 = characterReader41.consumeHexSequence();
        java.lang.String str45 = characterReader41.consumeTo("hi!");
        org.jsoup.parser.CharacterReader characterReader47 = new org.jsoup.parser.CharacterReader("");
        char char48 = characterReader47.current();
        java.lang.String str50 = characterReader47.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader47, parseErrorList51);
        char[] charArray57 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str58 = characterReader47.consumeToAny(charArray57);
        boolean boolean59 = characterReader41.matchesAny(charArray57);
        java.lang.String str61 = characterReader41.consumeTo(' ');
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("");
        char char64 = characterReader63.current();
        java.lang.String str65 = characterReader63.consumeHexSequence();
        boolean boolean66 = characterReader63.isEmpty();
        boolean boolean68 = characterReader63.matches('a');
        java.lang.String str69 = characterReader63.toString();
        org.jsoup.parser.CharacterReader characterReader71 = new org.jsoup.parser.CharacterReader("");
        char char72 = characterReader71.current();
        java.lang.String str74 = characterReader71.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList75 = null;
        org.jsoup.parser.Tokeniser tokeniser76 = new org.jsoup.parser.Tokeniser(characterReader71, parseErrorList75);
        char[] charArray81 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str82 = characterReader71.consumeToAny(charArray81);
        java.lang.String str83 = characterReader63.consumeToAny(charArray81);
        boolean boolean84 = characterReader41.matchesAny(charArray81);
        java.lang.String str85 = characterReader7.consumeToAny(charArray81);
        java.lang.String str86 = characterReader1.consumeToAny(charArray81);
        characterReader1.mark();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\uffff' + "'", char16 == '\uffff');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\uffff' + "'", char24 == '\uffff');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + '\uffff' + "'", char42 == '\uffff');
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + char48 + "' != '" + '\uffff' + "'", char48 == '\uffff');
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + char64 + "' != '" + '\uffff' + "'", char64 == '\uffff');
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + char72 + "' != '" + '\uffff' + "'", char72 == '\uffff');
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertArrayEquals(charArray81, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        java.lang.String str8 = characterReader1.consumeLetterSequence();
        boolean boolean10 = characterReader1.matchConsumeIgnoreCase("");
        java.lang.String str11 = characterReader1.toString();
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        char char14 = characterReader13.current();
        java.lang.String str15 = characterReader13.consumeHexSequence();
        boolean boolean16 = characterReader13.isEmpty();
        characterReader13.rewindToMark();
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("");
        char char20 = characterReader19.current();
        java.lang.String str22 = characterReader19.consumeTo('#');
        java.lang.String str24 = characterReader19.consumeTo("");
        int int25 = characterReader19.pos();
        java.lang.String str26 = characterReader19.consumeLetterSequence();
        int int27 = characterReader19.pos();
        boolean boolean28 = characterReader19.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader30 = new org.jsoup.parser.CharacterReader("");
        boolean boolean32 = characterReader30.matches(' ');
        characterReader30.advance();
        characterReader30.unconsume();
        characterReader30.rewindToMark();
        boolean boolean36 = characterReader30.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("");
        char char39 = characterReader38.current();
        java.lang.String str40 = characterReader38.consumeHexSequence();
        boolean boolean41 = characterReader38.isEmpty();
        boolean boolean43 = characterReader38.matches('a');
        java.lang.String str44 = characterReader38.toString();
        org.jsoup.parser.CharacterReader characterReader46 = new org.jsoup.parser.CharacterReader("");
        char char47 = characterReader46.current();
        java.lang.String str49 = characterReader46.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader46, parseErrorList50);
        char[] charArray56 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str57 = characterReader46.consumeToAny(charArray56);
        java.lang.String str58 = characterReader38.consumeToAny(charArray56);
        java.lang.String str59 = characterReader30.consumeToAny(charArray56);
        boolean boolean60 = characterReader19.matchesAny(charArray56);
        boolean boolean61 = characterReader13.matchesAny(charArray56);
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("");
        char char64 = characterReader63.current();
        org.jsoup.parser.CharacterReader characterReader66 = new org.jsoup.parser.CharacterReader("");
        boolean boolean68 = characterReader66.matches(' ');
        characterReader66.advance();
        characterReader66.unconsume();
        characterReader66.rewindToMark();
        boolean boolean72 = characterReader66.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader74 = new org.jsoup.parser.CharacterReader("");
        char char75 = characterReader74.current();
        java.lang.String str76 = characterReader74.consumeHexSequence();
        boolean boolean77 = characterReader74.isEmpty();
        boolean boolean79 = characterReader74.matches('a');
        java.lang.String str80 = characterReader74.toString();
        org.jsoup.parser.CharacterReader characterReader82 = new org.jsoup.parser.CharacterReader("");
        char char83 = characterReader82.current();
        java.lang.String str85 = characterReader82.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList86 = null;
        org.jsoup.parser.Tokeniser tokeniser87 = new org.jsoup.parser.Tokeniser(characterReader82, parseErrorList86);
        char[] charArray92 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str93 = characterReader82.consumeToAny(charArray92);
        java.lang.String str94 = characterReader74.consumeToAny(charArray92);
        java.lang.String str95 = characterReader66.consumeToAny(charArray92);
        boolean boolean96 = characterReader63.matchesAny(charArray92);
        java.lang.String str97 = characterReader13.consumeToAny(charArray92);
        boolean boolean98 = characterReader1.matchesAny(charArray92);
        boolean boolean99 = characterReader1.isEmpty();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\uffff' + "'", char14 == '\uffff');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\uffff' + "'", char20 == '\uffff');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + '\uffff' + "'", char39 == '\uffff');
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + char47 + "' != '" + '\uffff' + "'", char47 == '\uffff');
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + char64 + "' != '" + '\uffff' + "'", char64 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + char75 + "' != '" + '\uffff' + "'", char75 == '\uffff');
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + char83 + "' != '" + '\uffff' + "'", char83 == '\uffff');
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(charArray92);
        org.junit.Assert.assertArrayEquals(charArray92, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        org.jsoup.parser.Token.Tag tag10 = tokeniser2.tagPending;
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList12);
        org.jsoup.parser.Token.Tag tag15 = tokeniser13.createTagPending(false);
        tokeniser13.createTempBuffer();
        tokeniser13.createDoctypePending();
        org.jsoup.parser.Token.Comment comment18 = tokeniser13.commentPending;
        org.jsoup.parser.Token.Tag tag19 = tokeniser13.tagPending;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        org.jsoup.parser.Token.Tag tag24 = tokeniser22.createTagPending(false);
        java.lang.StringBuilder stringBuilder25 = tokeniser22.dataBuffer;
        java.lang.StringBuilder stringBuilder26 = tokeniser22.dataBuffer;
        tokeniser22.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader28, parseErrorList29);
        org.jsoup.parser.Token.Doctype doctype31 = tokeniser30.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState32 = null;
        tokeniser30.transition(tokeniserState32);
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader34, parseErrorList35);
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser36.getState();
        tokeniser30.transition(tokeniserState37);
        tokeniser30.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader40, parseErrorList41);
        java.lang.StringBuilder stringBuilder43 = null;
        tokeniser42.dataBuffer = stringBuilder43;
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader45, parseErrorList46);
        tokeniser47.createTempBuffer();
        tokeniser47.createTempBuffer();
        java.lang.StringBuilder stringBuilder50 = tokeniser47.dataBuffer;
        tokeniser42.dataBuffer = stringBuilder50;
        tokeniser30.dataBuffer = stringBuilder50;
        java.lang.StringBuilder stringBuilder53 = tokeniser30.dataBuffer;
        tokeniser22.dataBuffer = stringBuilder53;
        tokeniser13.dataBuffer = stringBuilder53;
        tokeniser2.dataBuffer = stringBuilder53;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token57 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment9);
        org.junit.Assert.assertNull(tag10);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNull(comment18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNull(stringBuilder25);
        org.junit.Assert.assertNull(stringBuilder26);
        org.junit.Assert.assertNull(doctype31);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder53);
        org.junit.Assert.assertEquals(stringBuilder53.toString(), "");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser10.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState12 = null;
        tokeniser10.transition(tokeniserState12);
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser16.getState();
        tokeniser10.transition(tokeniserState17);
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        org.jsoup.parser.Token.Tag tag23 = tokeniser21.createTagPending(false);
        tokeniser21.createTempBuffer();
        tokeniser21.createDoctypePending();
        org.jsoup.parser.Token.Tag tag27 = tokeniser21.createTagPending(true);
        tokeniser10.emit((org.jsoup.parser.Token) tag27);
        tokeniser2.tagPending = tag27;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token30 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(doctype11);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(tag27);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        tokeniser2.createTempBuffer();
        tokeniser2.emit(' ');
        tokeniser2.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        org.jsoup.parser.Token.Tag tag17 = tokeniser15.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser15.doctypePending;
        org.jsoup.parser.Token.Doctype doctype19 = tokeniser15.doctypePending;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser22.getState();
        tokeniser22.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState25 = tokeniser22.getState();
        tokeniser15.transition(tokeniserState25);
        org.jsoup.parser.TokeniserState tokeniserState27 = tokeniser15.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNull(doctype19);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNotNull(tokeniserState27);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        characterReader1.rewindToMark();
        boolean boolean37 = characterReader1.matches('a');
        characterReader1.rewindToMark();
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        boolean boolean4 = characterReader1.isEmpty();
        boolean boolean6 = characterReader1.matches('a');
        int int7 = characterReader1.pos();
        boolean boolean9 = characterReader1.matches("");
        char char10 = characterReader1.current();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser14.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState16 = null;
        tokeniser14.transition(tokeniserState16);
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList19);
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser20.getState();
        tokeniser14.transition(tokeniserState21);
        tokeniser14.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList25);
        java.lang.StringBuilder stringBuilder27 = null;
        tokeniser26.dataBuffer = stringBuilder27;
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader29, parseErrorList30);
        tokeniser31.createTempBuffer();
        tokeniser31.createTempBuffer();
        java.lang.StringBuilder stringBuilder34 = tokeniser31.dataBuffer;
        tokeniser26.dataBuffer = stringBuilder34;
        tokeniser14.dataBuffer = stringBuilder34;
        tokeniser2.dataBuffer = stringBuilder34;
        org.jsoup.parser.Token.Tag tag39 = tokeniser2.createTagPending(false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertNotNull(tag39);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Comment comment6 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        org.jsoup.parser.Token.Tag tag9 = tokeniser2.tagPending;
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("");
        char char12 = characterReader11.current();
        java.lang.String str13 = characterReader11.consumeLetterSequence();
        java.lang.String str15 = characterReader11.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList16);
        org.jsoup.parser.Token.Doctype doctype18 = null;
        tokeniser17.doctypePending = doctype18;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        org.jsoup.parser.Token.Tag tag24 = tokeniser22.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype25 = tokeniser22.doctypePending;
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader26, parseErrorList27);
        org.jsoup.parser.Token.Tag tag30 = tokeniser28.createTagPending(false);
        tokeniser22.tagPending = tag30;
        java.lang.StringBuilder stringBuilder32 = tokeniser22.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader33, parseErrorList34);
        org.jsoup.parser.TokeniserState tokeniserState36 = tokeniser35.getState();
        tokeniser22.transition(tokeniserState36);
        tokeniser17.transition(tokeniserState36);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNull(tag9);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\uffff' + "'", char12 == '\uffff');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNull(doctype25);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNull(stringBuilder32);
        org.junit.Assert.assertNotNull(tokeniserState36);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        characterReader1.mark();
        characterReader1.rewindToMark();
        java.lang.String str10 = characterReader1.consumeDigitSequence();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList11);
        characterReader1.rewindToMark();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList5);
        java.lang.String str7 = characterReader1.consumeDigitSequence();
        java.lang.String str8 = characterReader1.consumeHexSequence();
        boolean boolean10 = characterReader1.matchConsume("hi!");
        java.lang.Class<?> wildcardClass11 = characterReader1.getClass();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        tokeniser2.createCommentPending();
        tokeniser2.emit('\uffff');
        tokeniser2.emitTagPending();
        org.jsoup.parser.Token.Tag tag11 = tokeniser2.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = tokeniser2.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser2.doctypePending = doctype6;
        tokeniser2.createTempBuffer();
        java.lang.StringBuilder stringBuilder9 = tokeniser2.dataBuffer;
        boolean boolean10 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser2.getState();
        org.jsoup.parser.Token.Doctype doctype12 = null;
        tokeniser2.doctypePending = doctype12;
        tokeniser2.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader15, parseErrorList16);
        java.lang.StringBuilder stringBuilder18 = null;
        tokeniser17.dataBuffer = stringBuilder18;
        tokeniser17.createCommentPending();
        org.jsoup.parser.Token.Comment comment21 = tokeniser17.commentPending;
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader22, parseErrorList23);
        org.jsoup.parser.Token.Tag tag26 = tokeniser24.createTagPending(false);
        tokeniser24.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader28, parseErrorList29);
        org.jsoup.parser.Token.Tag tag32 = tokeniser30.createTagPending(false);
        tokeniser30.createTempBuffer();
        tokeniser30.createDoctypePending();
        org.jsoup.parser.Token.Tag tag36 = tokeniser30.createTagPending(true);
        tokeniser24.emit((org.jsoup.parser.Token) tag36);
        tokeniser17.emit((org.jsoup.parser.Token) tag36);
        org.jsoup.parser.TokeniserState tokeniserState39 = tokeniser17.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(comment21);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(tokeniserState39);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser14.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState16 = null;
        tokeniser14.transition(tokeniserState16);
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList19);
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser20.getState();
        tokeniser14.transition(tokeniserState21);
        tokeniser14.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList25);
        java.lang.StringBuilder stringBuilder27 = null;
        tokeniser26.dataBuffer = stringBuilder27;
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader29, parseErrorList30);
        tokeniser31.createTempBuffer();
        tokeniser31.createTempBuffer();
        java.lang.StringBuilder stringBuilder34 = tokeniser31.dataBuffer;
        tokeniser26.dataBuffer = stringBuilder34;
        tokeniser14.dataBuffer = stringBuilder34;
        tokeniser2.dataBuffer = stringBuilder34;
        org.jsoup.parser.Token.Doctype doctype38 = tokeniser2.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char41 = tokeniser2.consumeCharacterReference((java.lang.Character) '\ufffd', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertNull(doctype38);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        org.jsoup.parser.Token.Tag tag7 = tokeniser2.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char10 = tokeniser2.consumeCharacterReference((java.lang.Character) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag7);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        tokeniser2.createCommentPending();
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        boolean boolean12 = characterReader10.matches(' ');
        characterReader10.advance();
        characterReader10.unconsume();
        characterReader10.rewindToMark();
        boolean boolean17 = characterReader10.matchConsume("");
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList18);
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        org.jsoup.parser.Token.Tag tag24 = tokeniser22.createTagPending(false);
        org.jsoup.parser.Token.Comment comment25 = tokeniser22.commentPending;
        org.jsoup.parser.Token.Doctype doctype26 = null;
        tokeniser22.doctypePending = doctype26;
        tokeniser22.createTempBuffer();
        java.lang.StringBuilder stringBuilder29 = tokeniser22.dataBuffer;
        boolean boolean30 = tokeniser22.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser22.getState();
        tokeniser19.advanceTransition(tokeniserState31);
        tokeniser19.emit(' ');
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader35, parseErrorList36);
        org.jsoup.parser.TokeniserState tokeniserState38 = tokeniser37.getState();
        tokeniser37.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState40 = tokeniser37.getState();
        tokeniser37.emit('\uffff');
        org.jsoup.parser.Token.Comment comment43 = tokeniser37.commentPending;
        tokeniser19.emit((org.jsoup.parser.Token) comment43);
        org.jsoup.parser.TokeniserState tokeniserState45 = tokeniser19.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNull(comment25);
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNotNull(tokeniserState38);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertNotNull(comment43);
        org.junit.Assert.assertNotNull(tokeniserState45);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        int int23 = characterReader1.pos();
        characterReader1.advance();
        boolean boolean25 = characterReader1.matchesDigit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = characterReader1.consumeToEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = tokeniser2.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.emit("hi!");
        org.jsoup.parser.Token.Tag tag8 = tokeniser2.tagPending;
        tokeniser2.createCommentPending();
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser2.commentPending = comment10;
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser14.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState16 = null;
        tokeniser14.transition(tokeniserState16);
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList19);
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser20.getState();
        tokeniser14.transition(tokeniserState21);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag8);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNotNull(tokeniserState21);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser2.getState();
        tokeniser2.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState5 = tokeniser2.getState();
        boolean boolean6 = tokeniser2.currentNodeInHtmlNS();
        tokeniser2.emit("");
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        boolean boolean16 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList18);
        java.lang.StringBuilder stringBuilder20 = null;
        tokeniser19.dataBuffer = stringBuilder20;
        tokeniser19.createCommentPending();
        boolean boolean23 = tokeniser19.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype24 = null;
        tokeniser19.doctypePending = doctype24;
        java.lang.StringBuilder stringBuilder26 = tokeniser19.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader27, parseErrorList28);
        org.jsoup.parser.Token.Tag tag31 = tokeniser29.createTagPending(false);
        tokeniser29.createTempBuffer();
        boolean boolean33 = tokeniser29.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState34 = tokeniser29.getState();
        tokeniser19.transition(tokeniserState34);
        tokeniser2.transition(tokeniserState34);
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader37, parseErrorList38);
        org.jsoup.parser.Token.Tag tag41 = tokeniser39.createTagPending(false);
        tokeniser39.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader43, parseErrorList44);
        org.jsoup.parser.Token.Tag tag47 = tokeniser45.createTagPending(false);
        tokeniser45.createTempBuffer();
        tokeniser45.createDoctypePending();
        org.jsoup.parser.Token.Tag tag51 = tokeniser45.createTagPending(true);
        tokeniser39.emit((org.jsoup.parser.Token) tag51);
        boolean boolean53 = tokeniser39.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader54 = null;
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.Tokeniser tokeniser56 = new org.jsoup.parser.Tokeniser(characterReader54, parseErrorList55);
        java.lang.StringBuilder stringBuilder57 = null;
        tokeniser56.dataBuffer = stringBuilder57;
        tokeniser56.createCommentPending();
        boolean boolean60 = tokeniser56.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype61 = null;
        tokeniser56.doctypePending = doctype61;
        java.lang.StringBuilder stringBuilder63 = tokeniser56.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader64 = null;
        org.jsoup.parser.ParseErrorList parseErrorList65 = null;
        org.jsoup.parser.Tokeniser tokeniser66 = new org.jsoup.parser.Tokeniser(characterReader64, parseErrorList65);
        org.jsoup.parser.Token.Tag tag68 = tokeniser66.createTagPending(false);
        tokeniser66.createTempBuffer();
        boolean boolean70 = tokeniser66.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState71 = tokeniser66.getState();
        tokeniser56.transition(tokeniserState71);
        tokeniser39.transition(tokeniserState71);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(stringBuilder26);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tokeniserState34);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(stringBuilder63);
        org.junit.Assert.assertNotNull(tag68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(tokeniserState71);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        org.jsoup.parser.Token.Tag tag5 = tokeniser2.tagPending;
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        org.jsoup.parser.Token token7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emit(token7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag5);
        org.junit.Assert.assertNull(stringBuilder6);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype8 = tokeniser2.doctypePending;
        tokeniser2.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doctype8);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str84 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
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
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeHexSequence();
        characterReader1.rewindToMark();
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = characterReader1.consumeLetterSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.advance();
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        char char9 = characterReader8.current();
        java.lang.String str10 = characterReader8.consumeHexSequence();
        java.lang.String str12 = characterReader8.consumeTo("hi!");
        org.jsoup.parser.CharacterReader characterReader14 = new org.jsoup.parser.CharacterReader("");
        char char15 = characterReader14.current();
        java.lang.String str17 = characterReader14.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList18);
        char[] charArray24 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str25 = characterReader14.consumeToAny(charArray24);
        boolean boolean26 = characterReader8.matchesAny(charArray24);
        boolean boolean27 = characterReader1.matchesAny(charArray24);
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("");
        char char30 = characterReader29.current();
        java.lang.String str32 = characterReader29.consumeTo('#');
        java.lang.String str34 = characterReader29.consumeTo("");
        int int35 = characterReader29.pos();
        java.lang.String str36 = characterReader29.consumeLetterSequence();
        int int37 = characterReader29.pos();
        boolean boolean38 = characterReader29.matchesDigit();
        org.jsoup.parser.CharacterReader characterReader40 = new org.jsoup.parser.CharacterReader("");
        boolean boolean42 = characterReader40.matches(' ');
        characterReader40.advance();
        characterReader40.unconsume();
        characterReader40.rewindToMark();
        boolean boolean46 = characterReader40.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader48 = new org.jsoup.parser.CharacterReader("");
        char char49 = characterReader48.current();
        java.lang.String str50 = characterReader48.consumeHexSequence();
        boolean boolean51 = characterReader48.isEmpty();
        boolean boolean53 = characterReader48.matches('a');
        java.lang.String str54 = characterReader48.toString();
        org.jsoup.parser.CharacterReader characterReader56 = new org.jsoup.parser.CharacterReader("");
        char char57 = characterReader56.current();
        java.lang.String str59 = characterReader56.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.Tokeniser tokeniser61 = new org.jsoup.parser.Tokeniser(characterReader56, parseErrorList60);
        char[] charArray66 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str67 = characterReader56.consumeToAny(charArray66);
        java.lang.String str68 = characterReader48.consumeToAny(charArray66);
        java.lang.String str69 = characterReader40.consumeToAny(charArray66);
        boolean boolean70 = characterReader29.matchesAny(charArray66);
        boolean boolean71 = characterReader1.matchesAny(charArray66);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str72 = characterReader1.consumeAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\uffff' + "'", char9 == '\uffff');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\uffff' + "'", char15 == '\uffff');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\uffff' + "'", char30 == '\uffff');
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + char49 + "' != '" + '\uffff' + "'", char49 == '\uffff');
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + char57 + "' != '" + '\uffff' + "'", char57 == '\uffff');
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype7 = null;
        tokeniser2.doctypePending = doctype7;
        tokeniser2.emit("hi!");
        org.jsoup.parser.Token.Tag tag11 = tokeniser2.tagPending;
        org.jsoup.parser.CharacterReader characterReader13 = new org.jsoup.parser.CharacterReader("");
        char char14 = characterReader13.current();
        java.lang.String str15 = characterReader13.consumeLetterSequence();
        java.lang.String str17 = characterReader13.consumeTo("hi!");
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList18);
        org.jsoup.parser.Token.Doctype doctype20 = null;
        tokeniser19.doctypePending = doctype20;
        tokeniser19.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader23, parseErrorList24);
        java.lang.StringBuilder stringBuilder26 = null;
        tokeniser25.dataBuffer = stringBuilder26;
        org.jsoup.parser.Token.Comment comment28 = tokeniser25.commentPending;
        org.jsoup.parser.Token.Doctype doctype29 = tokeniser25.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState30 = tokeniser25.getState();
        tokeniser19.transition(tokeniserState30);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag11);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\uffff' + "'", char14 == '\uffff');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(comment28);
        org.junit.Assert.assertNull(doctype29);
        org.junit.Assert.assertNotNull(tokeniserState30);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser2.doctypePending;
        tokeniser2.emit("");
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(doctype6);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment6 = tokeniser2.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser2.getState();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.Token.Tag tag12 = tokeniser10.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser10.doctypePending;
        org.jsoup.parser.Token.Doctype doctype14 = tokeniser10.doctypePending;
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader15, parseErrorList16);
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser17.getState();
        tokeniser17.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser17.getState();
        tokeniser10.transition(tokeniserState20);
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser10.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype13);
        org.junit.Assert.assertNull(doctype14);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(tokeniserState22);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = tokeniser2.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comment6);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(tokeniserState24);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        tokeniser2.createCommentPending();
        org.jsoup.parser.Token.Comment comment8 = tokeniser2.commentPending;
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        boolean boolean12 = characterReader10.matches(' ');
        characterReader10.advance();
        characterReader10.unconsume();
        characterReader10.rewindToMark();
        boolean boolean17 = characterReader10.matchConsume("");
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList18);
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        org.jsoup.parser.Token.Tag tag24 = tokeniser22.createTagPending(false);
        org.jsoup.parser.Token.Comment comment25 = tokeniser22.commentPending;
        org.jsoup.parser.Token.Doctype doctype26 = null;
        tokeniser22.doctypePending = doctype26;
        tokeniser22.createTempBuffer();
        java.lang.StringBuilder stringBuilder29 = tokeniser22.dataBuffer;
        boolean boolean30 = tokeniser22.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser22.getState();
        tokeniser19.advanceTransition(tokeniserState31);
        tokeniser19.emit(' ');
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader35, parseErrorList36);
        org.jsoup.parser.TokeniserState tokeniserState38 = tokeniser37.getState();
        tokeniser37.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState40 = tokeniser37.getState();
        tokeniser37.emit('\uffff');
        org.jsoup.parser.Token.Comment comment43 = tokeniser37.commentPending;
        tokeniser19.emit((org.jsoup.parser.Token) comment43);
        tokeniser2.commentPending = comment43;
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader46, parseErrorList47);
        org.jsoup.parser.Token.Tag tag50 = tokeniser48.createTagPending(false);
        org.jsoup.parser.Token.Comment comment51 = tokeniser48.commentPending;
        tokeniser48.emit('\uffff');
        tokeniser48.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader56 = new org.jsoup.parser.CharacterReader("");
        char char57 = characterReader56.current();
        java.lang.String str59 = characterReader56.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.Tokeniser tokeniser61 = new org.jsoup.parser.Tokeniser(characterReader56, parseErrorList60);
        java.lang.StringBuilder stringBuilder62 = null;
        tokeniser61.dataBuffer = stringBuilder62;
        org.jsoup.parser.Token.Tag tag65 = tokeniser61.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState66 = tokeniser61.getState();
        tokeniser48.transition(tokeniserState66);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNotNull(comment8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNull(comment25);
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNotNull(tokeniserState38);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertNotNull(comment43);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNull(comment51);
        org.junit.Assert.assertTrue("'" + char57 + "' != '" + '\uffff' + "'", char57 == '\uffff');
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(tag65);
        org.junit.Assert.assertNotNull(tokeniserState66);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader32, parseErrorList33);
        org.jsoup.parser.TokeniserState tokeniserState35 = tokeniser34.getState();
        tokeniser2.transition(tokeniserState35);
        tokeniser2.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader39, parseErrorList40);
        org.jsoup.parser.Token.Tag tag43 = tokeniser41.createTagPending(false);
        org.jsoup.parser.Token.Comment comment44 = tokeniser41.commentPending;
        org.jsoup.parser.Token.Doctype doctype45 = null;
        tokeniser41.doctypePending = doctype45;
        tokeniser41.createTempBuffer();
        java.lang.StringBuilder stringBuilder48 = tokeniser41.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder48;
        java.lang.Class<?> wildcardClass50 = stringBuilder48.getClass();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNull(comment44);
        org.junit.Assert.assertNotNull(stringBuilder48);
        org.junit.Assert.assertEquals(stringBuilder48.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str4 = characterReader1.consumeTo('#');
        java.lang.String str6 = characterReader1.consumeTo("");
        int int7 = characterReader1.pos();
        characterReader1.mark();
        boolean boolean10 = characterReader1.matches('\uffff');
        boolean boolean12 = characterReader1.matches("hi!");
        characterReader1.mark();
        char char14 = characterReader1.current();
        characterReader1.mark();
        java.lang.String str16 = characterReader1.consumeDigitSequence();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\uffff' + "'", char14 == '\uffff');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser2.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = null;
        tokeniser2.transition(tokeniserState4);
        org.jsoup.parser.Token.Doctype doctype6 = null;
        tokeniser2.doctypePending = doctype6;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.Token.Tag tag12 = tokeniser10.createTagPending(false);
        tokeniser10.createTempBuffer();
        boolean boolean14 = tokeniser10.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser10.getState();
        tokeniser2.transition(tokeniserState15);
        tokeniser2.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        org.jsoup.parser.Token.Tag tag23 = tokeniser21.createTagPending(false);
        java.lang.StringBuilder stringBuilder24 = tokeniser21.dataBuffer;
        java.lang.StringBuilder stringBuilder25 = tokeniser21.dataBuffer;
        tokeniser21.createCommentPending();
        tokeniser21.emit('\uffff');
        tokeniser21.acknowledgeSelfClosingFlag();
        tokeniser21.emit("hi!");
        org.jsoup.parser.TokeniserState tokeniserState32 = tokeniser21.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNull(stringBuilder24);
        org.junit.Assert.assertNull(stringBuilder25);
        org.junit.Assert.assertNotNull(tokeniserState32);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        tokeniser2.createTempBuffer();
        tokeniser2.emitTagPending();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.Token.Tag tag12 = tokeniser10.createTagPending(false);
        java.lang.StringBuilder stringBuilder13 = tokeniser10.dataBuffer;
        java.lang.StringBuilder stringBuilder14 = tokeniser10.dataBuffer;
        tokeniser10.createCommentPending();
        tokeniser10.emit('\uffff');
        tokeniser10.acknowledgeSelfClosingFlag();
        tokeniser10.emit("hi!");
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser10.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(stringBuilder13);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNotNull(tokeniserState21);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        org.jsoup.parser.Token.Tag tag4 = tokeniser2.createTagPending(false);
        java.lang.StringBuilder stringBuilder5 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder6 = tokeniser2.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader8 = new org.jsoup.parser.CharacterReader("");
        boolean boolean10 = characterReader8.matches(' ');
        characterReader8.advance();
        characterReader8.unconsume();
        characterReader8.rewindToMark();
        boolean boolean15 = characterReader8.matchConsume("");
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList16);
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList19);
        org.jsoup.parser.Token.Tag tag22 = tokeniser20.createTagPending(false);
        org.jsoup.parser.Token.Comment comment23 = tokeniser20.commentPending;
        org.jsoup.parser.Token.Doctype doctype24 = null;
        tokeniser20.doctypePending = doctype24;
        tokeniser20.createTempBuffer();
        java.lang.StringBuilder stringBuilder27 = tokeniser20.dataBuffer;
        boolean boolean28 = tokeniser20.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser20.getState();
        tokeniser17.advanceTransition(tokeniserState29);
        tokeniser17.emit(' ');
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader33, parseErrorList34);
        org.jsoup.parser.TokeniserState tokeniserState36 = tokeniser35.getState();
        tokeniser35.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState38 = tokeniser35.getState();
        tokeniser35.emit('\uffff');
        org.jsoup.parser.Token.Comment comment41 = tokeniser35.commentPending;
        tokeniser17.emit((org.jsoup.parser.Token) comment41);
        tokeniser2.commentPending = comment41;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = tokeniser2.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(stringBuilder5);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(comment23);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNotNull(tokeniserState38);
        org.junit.Assert.assertNotNull(comment41);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        java.lang.Class<?> wildcardClass31 = tag28.getClass();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        char char2 = characterReader1.current();
        java.lang.String str3 = characterReader1.consumeLetterSequence();
        char char4 = characterReader1.consume();
        boolean boolean5 = characterReader1.matchesLetter();
        characterReader1.mark();
        boolean boolean8 = characterReader1.matchConsume("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\uffff' + "'", char2 == '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\uffff' + "'", char4 == '\uffff');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        java.lang.String str2 = characterReader1.consumeLetterSequence();
        java.lang.String str3 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = characterReader1.consumeDigitSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = tokeniser2.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag21);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = null;
        tokeniser2.dataBuffer = stringBuilder3;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.emit("hi!");
        org.jsoup.parser.Token.Tag tag8 = tokeniser2.tagPending;
        tokeniser2.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = tokeniser2.appropriateEndTagName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag8);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        boolean boolean23 = characterReader1.isEmpty();
        java.lang.String str24 = characterReader1.consumeAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        boolean boolean6 = characterReader1.matches("hi!");
        int int7 = characterReader1.pos();
        boolean boolean8 = characterReader1.matchesLetter();
        org.jsoup.parser.CharacterReader characterReader10 = new org.jsoup.parser.CharacterReader("");
        char char11 = characterReader10.current();
        java.lang.String str13 = characterReader10.consumeTo('#');
        java.lang.String str14 = characterReader10.consumeLetterSequence();
        boolean boolean16 = characterReader10.containsIgnoreCase("");
        boolean boolean18 = characterReader10.matchConsume("hi!");
        org.jsoup.parser.CharacterReader characterReader20 = new org.jsoup.parser.CharacterReader("");
        boolean boolean22 = characterReader20.matches(' ');
        characterReader20.advance();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("");
        char char26 = characterReader25.current();
        java.lang.String str28 = characterReader25.consumeTo('#');
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader25, parseErrorList29);
        char[] charArray35 = new char[] { ' ', ' ', '4', '\uffff' };
        java.lang.String str36 = characterReader25.consumeToAny(charArray35);
        boolean boolean37 = characterReader20.matchesAny(charArray35);
        java.lang.String str38 = characterReader10.consumeToAny(charArray35);
        boolean boolean39 = characterReader1.matchesAny(charArray35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = characterReader1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\uffff' + "'", char26 == '\uffff');
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { ' ', ' ', '4', '\uffff' });
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("hi!");
        boolean boolean2 = characterReader1.isEmpty();
        boolean boolean4 = characterReader1.matchesIgnoreCase("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.createTempBuffer();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser10.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState12 = null;
        tokeniser10.transition(tokeniserState12);
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser16.getState();
        tokeniser10.transition(tokeniserState17);
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        org.jsoup.parser.Token.Tag tag23 = tokeniser21.createTagPending(false);
        tokeniser21.createTempBuffer();
        tokeniser21.createDoctypePending();
        org.jsoup.parser.Token.Tag tag27 = tokeniser21.createTagPending(true);
        tokeniser10.emit((org.jsoup.parser.Token) tag27);
        tokeniser2.tagPending = tag27;
        tokeniser2.createCommentPending();
        tokeniser2.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = tokeniser2.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(doctype11);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(tag27);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        boolean boolean3 = characterReader1.matches(' ');
        characterReader1.advance();
        characterReader1.unconsume();
        characterReader1.rewindToMark();
        boolean boolean8 = characterReader1.matchConsume("");
        characterReader1.advance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = characterReader1.consumeHexSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("");
        characterReader1.unconsume();
        boolean boolean4 = characterReader1.matchConsume("");
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList5);
        org.jsoup.parser.Token.Tag tag8 = tokeniser6.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser11.getState();
        tokeniser11.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser11.getState();
        java.lang.StringBuilder stringBuilder15 = tokeniser11.dataBuffer;
        tokeniser11.emit('4');
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser11.getState();
        tokeniser6.advanceTransition(tokeniserState18);
        org.jsoup.parser.Token.Doctype doctype20 = tokeniser6.doctypePending;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNull(stringBuilder15);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNull(doctype20);
    }
}

