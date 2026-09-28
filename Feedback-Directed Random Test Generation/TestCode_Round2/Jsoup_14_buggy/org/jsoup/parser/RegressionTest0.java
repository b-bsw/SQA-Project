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
        char char0 = org.jsoup.parser.Tokeniser.replacementChar;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\ufffd' + "'", char0 == '\ufffd');
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.TokeniserState tokeniserState6 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState6);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char4 = tokeniser1.consumeCharacterReference((java.lang.Character) '\ufffd', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.AttributeValue_unquoted;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.Data;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        org.jsoup.parser.TokeniserState tokeniserState3 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser2.transition(tokeniserState3);
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser2.commentPending = comment5;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState3);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterAttributeValue_quoted;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token token6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit(token6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token token4 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit(token4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.TokeniserState tokeniserState6 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDashDash;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState6);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token2 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char4 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.TokeniserState tokeniserState6 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStart;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState6);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token11 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        tokeniser1.emit(' ');
        org.jsoup.parser.Token token11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit(token11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AttributeName;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        boolean boolean12 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(tag13);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStartDash;
        tokeniser1.transition(tokeniserState12);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token token11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit(token11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment4 = tokeniser1.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token8 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char5 = tokeniser1.consumeCharacterReference((java.lang.Character) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Doctype doctype4 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState5 = org.jsoup.parser.TokeniserState.CommentStartDash;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(doctype4);
        org.junit.Assert.assertNotNull(tokeniserState5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment12 = tokeniser1.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNull(comment12);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        boolean boolean12 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char13 = tokeniser1.consumeCharacterReference((java.lang.Character) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment3 = tokeniser1.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = comment3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment3);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser1.dataBuffer = stringBuilder7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char11 = tokeniser1.consumeCharacterReference((java.lang.Character) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        tokeniser1.emit(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char13 = tokeniser1.consumeCharacterReference((java.lang.Character) '\ufffd', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CommentStart;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        org.jsoup.parser.TokeniserState tokeniserState3 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser2.transition(tokeniserState3);
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser2.commentPending = comment5;
        tokeniser2.emit('\ufffd');
        tokeniser2.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser2.getState();
        boolean boolean11 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doctype12);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        boolean boolean12 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char17 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char7 = tokeniser1.consumeCharacterReference((java.lang.Character) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        tokeniser6.createDoctypePending();
        tokeniser6.createDoctypePending();
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser6.commentPending = comment9;
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser6.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit((org.jsoup.parser.Token) doctype11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(doctype11);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.setTrackErrors(true);
        tokeniser1.emit("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char7 = tokeniser1.consumeCharacterReference((java.lang.Character) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterDoctypePublicIdentifier;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        boolean boolean12 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Tag tag14 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNull(tag14);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStartDash;
        tokeniser1.transition(tokeniserState12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token14 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState4);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser13.transition(tokeniserState14);
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser13.commentPending = comment16;
        tokeniser13.emit('\ufffd');
        tokeniser13.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder22 = tokeniser13.dataBuffer;
        tokeniser13.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState24 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStartDash;
        tokeniser13.transition(tokeniserState24);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNull(stringBuilder22);
        org.junit.Assert.assertNotNull(tokeniserState24);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag7 = null;
        tokeniser1.tagPending = tag7;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token9 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.tagPending;
        java.lang.StringBuilder stringBuilder5 = null;
        tokeniser1.dataBuffer = stringBuilder5;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag4);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('\ufffd');
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AttributeValue_unquoted;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser2.getState();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState4);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment8 = tokeniser1.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment8);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('a');
        java.lang.Class<?> wildcardClass15 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.createDoctypePending();
        tokeniser8.createDoctypePending();
        org.jsoup.parser.Token.Tag tag11 = tokeniser8.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedLessthanSign;
        tokeniser8.transition(tokeniserState12);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token10 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        java.lang.Class<?> wildcardClass7 = tokeniser1.getClass();
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser1.dataBuffer = stringBuilder7;
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscaped;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedLessthanSign;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        org.jsoup.parser.TokeniserState tokeniserState3 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser2.transition(tokeniserState3);
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser2.commentPending = comment5;
        tokeniser2.emit('\ufffd');
        tokeniser2.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder11 = tokeniser2.dataBuffer;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.emit('a');
        org.jsoup.parser.CharacterReader characterReader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNull(stringBuilder11);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.setTrackErrors(true);
        tokeniser1.createCommentPending();
        java.lang.Class<?> wildcardClass7 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AttributeValue_doubleQuoted;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        org.jsoup.parser.TokeniserState tokeniserState3 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser2.transition(tokeniserState3);
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser2.commentPending = comment5;
        tokeniser2.emit('\ufffd');
        tokeniser2.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser2.transition(tokeniserState10);
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser15.transition(tokeniserState16);
        org.jsoup.parser.Token.Comment comment18 = null;
        tokeniser15.commentPending = comment18;
        tokeniser15.emit('\ufffd');
        tokeniser15.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser15.getState();
        boolean boolean24 = tokeniser15.currentNodeInHtmlNS();
        tokeniser15.createDoctypePending();
        org.jsoup.parser.Token.Tag tag26 = tokeniser15.tagPending;
        org.jsoup.parser.CharacterReader characterReader27 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState13.read(tokeniser15, characterReader27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(tag26);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment4 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState7 = org.jsoup.parser.TokeniserState.CommentStartDash;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState7);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser1.dataBuffer = stringBuilder7;
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.BogusComment;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char15 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(tag12);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        boolean boolean12 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('a');
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser1.transition(tokeniserState4);
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser1.dataBuffer = stringBuilder6;
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.BogusDoctype;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tokeniserState8);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doctype11);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char8 = tokeniser1.consumeCharacterReference((java.lang.Character) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser8.transition(tokeniserState9);
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser8.commentPending = comment11;
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser8.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token7 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        tokeniser1.emit(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token11 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.createDoctypePending();
        boolean boolean13 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser15.transition(tokeniserState16);
        org.jsoup.parser.Token.Comment comment18 = null;
        tokeniser15.commentPending = comment18;
        tokeniser15.emit('\ufffd');
        tokeniser15.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder24 = tokeniser15.dataBuffer;
        tokeniser15.acknowledgeSelfClosingFlag();
        boolean boolean26 = tokeniser15.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag27 = tokeniser15.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser15.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNull(stringBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(tag27);
        org.junit.Assert.assertNotNull(tokeniserState28);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(doctype12);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Doctype doctype4 = tokeniser1.doctypePending;
        tokeniser1.setTrackErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token7 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(doctype4);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.AttributeValue_unquoted;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNull(doctype13);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token7 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BeforeDoctypePublicIdentifier;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStartDash;
        tokeniser1.transition(tokeniserState12);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        java.lang.Class<?> wildcardClass10 = tokeniserState9.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        java.lang.StringBuilder stringBuilder11 = null;
        tokeniser1.dataBuffer = stringBuilder11;
        org.jsoup.parser.Token token13 = tokeniser1.read();
        java.lang.Class<?> wildcardClass14 = token13.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEndTagOpen;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        org.jsoup.parser.TokeniserState tokeniserState3 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser2.transition(tokeniserState3);
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser2.commentPending = comment5;
        tokeniser2.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState3);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emitDoctypePending();
        tokeniser1.emit('#');
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser1.dataBuffer = stringBuilder7;
        tokeniser1.setTrackErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        tokeniser1.transition(tokeniserState11);
        org.jsoup.parser.Token token13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit(token13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEndTagName;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        org.jsoup.parser.TokeniserState tokeniserState3 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser2.transition(tokeniserState3);
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser2.commentPending = comment5;
        tokeniser2.emit('\ufffd');
        tokeniser2.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder11 = tokeniser2.dataBuffer;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNull(stringBuilder11);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.RCDATAEndTagName;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState8);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token9 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNull(tag7);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.setTrackErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        boolean boolean7 = tokeniser1.isTrackErrors();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token8 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser1.transition(tokeniserState9);
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment12 = tokeniser1.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(comment12);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser1.transition(tokeniserState9);
        boolean boolean11 = tokeniser1.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.RCDATAEndTagOpen;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Comment comment7 = null;
        tokeniser1.commentPending = comment7;
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.ScriptDataEndTagOpen;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment4 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState7 = org.jsoup.parser.TokeniserState.ScriptDataLessthanSign;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState7);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState7 = org.jsoup.parser.TokeniserState.PLAINTEXT;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState7);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag9 = null;
        tokeniser1.tagPending = tag9;
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.Doctype;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser10.transition(tokeniserState11);
        tokeniser10.emit("hi!");
        org.jsoup.parser.Token.Tag tag15 = tokeniser10.tagPending;
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        tokeniser17.createDoctypePending();
        tokeniser17.createDoctypePending();
        org.jsoup.parser.Token.Comment comment20 = null;
        tokeniser17.commentPending = comment20;
        tokeniser17.createDoctypePending();
        tokeniser17.emit("");
        tokeniser17.createDoctypePending();
        org.jsoup.parser.Token.Comment comment26 = null;
        tokeniser17.commentPending = comment26;
        org.jsoup.parser.TokeniserState tokeniserState28 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser17.transition(tokeniserState28);
        tokeniser10.transition(tokeniserState28);
        tokeniser1.transition(tokeniserState28);
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        org.jsoup.parser.TokeniserState tokeniserState34 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser33.transition(tokeniserState34);
        org.jsoup.parser.Token.Comment comment36 = null;
        tokeniser33.commentPending = comment36;
        tokeniser33.emit('\ufffd');
        tokeniser33.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState41 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser33.transition(tokeniserState41);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNull(tag15);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertNotNull(tokeniserState34);
        org.junit.Assert.assertNotNull(tokeniserState41);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.Rcdata;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Doctype doctype4 = tokeniser1.doctypePending;
        tokeniser1.setTrackErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(doctype4);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        org.jsoup.parser.Token.Tag tag17 = tokeniser1.createTagPending(true);
        java.lang.Class<?> wildcardClass18 = tag17.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser1.transition(tokeniserState9);
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser12.transition(tokeniserState13);
        org.jsoup.parser.Token.Comment comment15 = null;
        tokeniser12.commentPending = comment15;
        tokeniser12.emit('\ufffd');
        tokeniser12.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder21 = tokeniser12.dataBuffer;
        tokeniser12.acknowledgeSelfClosingFlag();
        boolean boolean23 = tokeniser12.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag24 = tokeniser12.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState25 = tokeniser12.getState();
        tokeniser12.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader28 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState9.read(tokeniser12, characterReader28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNull(stringBuilder21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(tag24);
        org.junit.Assert.assertNotNull(tokeniserState25);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        tokeniser15.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser15.getState();
        tokeniser15.createTempBuffer();
        tokeniser15.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        org.jsoup.parser.TokeniserState tokeniserState22 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser21.transition(tokeniserState22);
        org.jsoup.parser.Token.Comment comment24 = null;
        tokeniser21.commentPending = comment24;
        tokeniser21.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment28 = tokeniser21.commentPending;
        org.jsoup.parser.Token.Tag tag30 = tokeniser21.createTagPending(true);
        tokeniser15.tagPending = tag30;
        java.lang.StringBuilder stringBuilder32 = tokeniser15.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder32;
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        org.jsoup.parser.TokeniserState tokeniserState36 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser35.transition(tokeniserState36);
        org.jsoup.parser.Token.Comment comment38 = null;
        tokeniser35.commentPending = comment38;
        tokeniser35.emit('\ufffd');
        tokeniser35.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState43 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser35.transition(tokeniserState43);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNull(comment28);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNotNull(tokeniserState43);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNull(doctype13);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser1.doctypePending;
        java.lang.StringBuilder stringBuilder13 = tokeniser1.dataBuffer;
        java.lang.StringBuilder stringBuilder14 = tokeniser1.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doctype12);
        org.junit.Assert.assertNull(stringBuilder13);
        org.junit.Assert.assertNull(stringBuilder14);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag4);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        tokeniser1.emit("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char13 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser1.dataBuffer = stringBuilder7;
        tokeniser1.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token10 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        org.jsoup.parser.TokeniserState tokeniserState6 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser5.transition(tokeniserState6);
        org.jsoup.parser.Token.Comment comment8 = null;
        tokeniser5.commentPending = comment8;
        tokeniser5.emit('\ufffd');
        tokeniser5.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser5.getState();
        boolean boolean14 = tokeniser5.currentNodeInHtmlNS();
        tokeniser5.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser5.doctypePending;
        tokeniser1.doctypePending = doctype16;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token18 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState6);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doctype16);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        tokeniser1.emitDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.createTempBuffer();
        tokeniser1.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char8 = tokeniser1.consumeCharacterReference((java.lang.Character) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapeEnd;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        org.jsoup.parser.TokeniserState tokeniserState3 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser2.transition(tokeniserState3);
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser2.commentPending = comment5;
        tokeniser2.emit('\ufffd');
        tokeniser2.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState3);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        tokeniser1.emit("");
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        boolean boolean8 = tokeniser1.isTrackErrors();
        tokeniser1.emitDoctypePending();
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('a');
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag17 = tokeniser1.tagPending;
        tokeniser1.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNull(tag17);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapeEnd;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState16);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emitDoctypePending();
        tokeniser1.emit('#');
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.EndTagOpen;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AttributeValue_doubleQuoted;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        org.jsoup.parser.TokeniserState tokeniserState3 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser2.transition(tokeniserState3);
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser2.commentPending = comment5;
        tokeniser2.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser10.transition(tokeniserState11);
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser10.doctypePending;
        tokeniser10.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser17.transition(tokeniserState18);
        org.jsoup.parser.Token.Comment comment20 = null;
        tokeniser17.commentPending = comment20;
        tokeniser17.emit('\ufffd');
        tokeniser17.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState25 = tokeniser17.getState();
        boolean boolean26 = tokeniser17.currentNodeInHtmlNS();
        tokeniser17.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype28 = tokeniser17.doctypePending;
        tokeniser10.doctypePending = doctype28;
        tokeniser2.doctypePending = doctype28;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader32 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNull(doctype13);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(doctype28);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        boolean boolean7 = tokeniser1.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        tokeniser9.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser9.getState();
        tokeniser9.createTempBuffer();
        tokeniser9.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser15.transition(tokeniserState16);
        org.jsoup.parser.Token.Comment comment18 = null;
        tokeniser15.commentPending = comment18;
        tokeniser15.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment22 = tokeniser15.commentPending;
        org.jsoup.parser.Token.Tag tag24 = tokeniser15.createTagPending(true);
        tokeniser9.tagPending = tag24;
        tokeniser1.tagPending = tag24;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token27 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNull(comment22);
        org.junit.Assert.assertNotNull(tag24);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment3 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        org.jsoup.parser.TokeniserState tokeniserState6 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser5.transition(tokeniserState6);
        org.jsoup.parser.Token.Comment comment8 = null;
        tokeniser5.commentPending = comment8;
        tokeniser5.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment12 = tokeniser5.commentPending;
        org.jsoup.parser.Token.Tag tag14 = tokeniser5.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag14);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment3);
        org.junit.Assert.assertNotNull(tokeniserState6);
        org.junit.Assert.assertNull(comment12);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        boolean boolean12 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser15.transition(tokeniserState16);
        org.jsoup.parser.Token.Comment comment18 = null;
        tokeniser15.commentPending = comment18;
        tokeniser15.emit('\ufffd');
        tokeniser15.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser15.getState();
        boolean boolean24 = tokeniser15.currentNodeInHtmlNS();
        tokeniser15.emitDoctypePending();
        tokeniser15.emit("");
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        tokeniser29.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser29.getState();
        tokeniser29.createTempBuffer();
        tokeniser29.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        org.jsoup.parser.TokeniserState tokeniserState36 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser35.transition(tokeniserState36);
        org.jsoup.parser.Token.Comment comment38 = null;
        tokeniser35.commentPending = comment38;
        tokeniser35.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment42 = tokeniser35.commentPending;
        org.jsoup.parser.Token.Tag tag44 = tokeniser35.createTagPending(true);
        tokeniser29.tagPending = tag44;
        java.lang.StringBuilder stringBuilder46 = tokeniser29.dataBuffer;
        tokeniser15.dataBuffer = stringBuilder46;
        tokeniser1.dataBuffer = stringBuilder46;
        org.jsoup.parser.TokeniserState tokeniserState49 = org.jsoup.parser.TokeniserState.AttributeValue_unquoted;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNull(comment42);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(stringBuilder46);
        org.junit.Assert.assertEquals(stringBuilder46.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState49);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        java.lang.StringBuilder stringBuilder6 = tokeniser1.dataBuffer;
        tokeniser1.emitDoctypePending();
        java.lang.StringBuilder stringBuilder8 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser10.transition(tokeniserState11);
        org.jsoup.parser.Token.Comment comment13 = null;
        tokeniser10.commentPending = comment13;
        tokeniser10.emit('\ufffd');
        tokeniser10.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser10.transition(tokeniserState18);
        tokeniser10.acknowledgeSelfClosingFlag();
        tokeniser10.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser24.transition(tokeniserState25);
        tokeniser24.setTrackErrors(true);
        tokeniser24.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        tokeniser32.createDoctypePending();
        tokeniser32.createDoctypePending();
        org.jsoup.parser.Token.Comment comment35 = null;
        tokeniser32.commentPending = comment35;
        org.jsoup.parser.Token.Doctype doctype37 = tokeniser32.doctypePending;
        tokeniser24.emit((org.jsoup.parser.Token) doctype37);
        tokeniser10.doctypePending = doctype37;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit((org.jsoup.parser.Token) doctype37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNull(stringBuilder8);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNotNull(doctype37);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        tokeniser13.createDoctypePending();
        tokeniser13.createDoctypePending();
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser13.commentPending = comment16;
        boolean boolean18 = tokeniser13.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser13.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tokeniserState19);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token15 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser1.transition(tokeniserState9);
        boolean boolean11 = tokeniser1.isTrackErrors();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState16);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.emitDoctypePending();
        boolean boolean13 = tokeniser1.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.CdataSection;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        tokeniser1.transition(tokeniserState11);
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNull(tag13);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.TokeniserState tokeniserState6 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = tokeniser1.consumeCharacterReference((java.lang.Character) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState6);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedLessthanSign;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        tokeniser1.transition(tokeniserState11);
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.AfterDoctypePublicKeyword;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser1.transition(tokeniserState9);
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment12 = tokeniser1.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token13 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(comment12);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        boolean boolean12 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser1.getState();
        tokeniser1.setTrackErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char19 = tokeniser1.consumeCharacterReference((java.lang.Character) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser17.transition(tokeniserState18);
        org.jsoup.parser.Token.Comment comment20 = null;
        tokeniser17.commentPending = comment20;
        tokeniser17.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        org.jsoup.parser.TokeniserState tokeniserState26 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser25.transition(tokeniserState26);
        org.jsoup.parser.Token.Comment comment28 = null;
        tokeniser25.commentPending = comment28;
        tokeniser25.emit('\ufffd');
        tokeniser25.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder34 = tokeniser25.dataBuffer;
        tokeniser25.acknowledgeSelfClosingFlag();
        boolean boolean36 = tokeniser25.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag37 = tokeniser25.tagPending;
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        org.jsoup.parser.TokeniserState tokeniserState40 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser39.transition(tokeniserState40);
        org.jsoup.parser.Token.Comment comment42 = null;
        tokeniser39.commentPending = comment42;
        tokeniser39.emit('\ufffd');
        tokeniser39.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState47 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser39.transition(tokeniserState47);
        tokeniser39.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment50 = tokeniser39.commentPending;
        tokeniser25.emit((org.jsoup.parser.Token) comment50);
        tokeniser17.commentPending = comment50;
        tokeniser1.commentPending = comment50;
        org.jsoup.parser.Token.Tag tag55 = tokeniser1.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader56 = null;
        org.jsoup.parser.Tokeniser tokeniser57 = new org.jsoup.parser.Tokeniser(characterReader56);
        org.jsoup.parser.TokeniserState tokeniserState58 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser57.transition(tokeniserState58);
        org.jsoup.parser.Token.Comment comment60 = null;
        tokeniser57.commentPending = comment60;
        tokeniser57.emit('\ufffd');
        tokeniser57.setTrackErrors(false);
        tokeniser57.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState67 = tokeniser57.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNull(stringBuilder34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(tag37);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertNotNull(tokeniserState47);
        org.junit.Assert.assertNotNull(comment50);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNotNull(tokeniserState58);
        org.junit.Assert.assertNotNull(tokeniserState67);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        java.lang.StringBuilder stringBuilder11 = null;
        tokeniser1.dataBuffer = stringBuilder11;
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.createDoctypePending();
        tokeniser14.createDoctypePending();
        org.jsoup.parser.Token.Comment comment17 = null;
        tokeniser14.commentPending = comment17;
        org.jsoup.parser.Token.Tag tag19 = tokeniser14.tagPending;
        java.lang.StringBuilder stringBuilder20 = tokeniser14.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState21 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser14.transition(tokeniserState21);
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser24.transition(tokeniserState25);
        org.jsoup.parser.Token.Comment comment27 = null;
        tokeniser24.commentPending = comment27;
        tokeniser24.emit('\ufffd');
        tokeniser24.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState32 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser24.transition(tokeniserState32);
        tokeniser24.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment35 = tokeniser24.commentPending;
        tokeniser14.commentPending = comment35;
        tokeniser1.commentPending = comment35;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNull(tag19);
        org.junit.Assert.assertNull(stringBuilder20);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNotNull(tokeniserState32);
        org.junit.Assert.assertNotNull(comment35);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emitDoctypePending();
        tokeniser1.setTrackErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char12 = tokeniser1.consumeCharacterReference((java.lang.Character) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.AfterDoctypeName;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState5 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedLessthanSign;
        tokeniser1.transition(tokeniserState5);
        java.lang.Class<?> wildcardClass7 = tokeniserState5.getClass();
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertNotNull(tokeniserState5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token12 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser1.transition(tokeniserState12);
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        tokeniser1.emit("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        tokeniser1.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        org.jsoup.parser.TokeniserState tokeniserState15 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser14.transition(tokeniserState15);
        org.jsoup.parser.Token.Comment comment17 = null;
        tokeniser14.commentPending = comment17;
        tokeniser14.emit('\ufffd');
        tokeniser14.setTrackErrors(false);
        tokeniser14.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser14.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tokeniserState24);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        tokeniser12.createDoctypePending();
        tokeniser12.createDoctypePending();
        org.jsoup.parser.Token.Comment comment15 = null;
        tokeniser12.commentPending = comment15;
        org.jsoup.parser.Token.Doctype doctype17 = tokeniser12.doctypePending;
        tokeniser1.doctypePending = doctype17;
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype20 = null;
        tokeniser1.doctypePending = doctype20;
        java.lang.Class<?> wildcardClass22 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doctype17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        java.lang.StringBuilder stringBuilder6 = tokeniser1.dataBuffer;
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser9.transition(tokeniserState10);
        tokeniser9.emit("hi!");
        org.jsoup.parser.Token.Comment comment14 = null;
        tokeniser9.commentPending = comment14;
        tokeniser9.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser9.getState();
        tokeniser9.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype20 = tokeniser9.doctypePending;
        org.jsoup.parser.Token.Doctype doctype21 = tokeniser9.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser9.getState();
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser9.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNull(doctype20);
        org.junit.Assert.assertNull(doctype21);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNotNull(tokeniserState23);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.BetweenDoctypePublicAndSystemIdentifiers;
        tokeniser1.transition(tokeniserState13);
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        tokeniser16.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser16.getState();
        tokeniser16.createTempBuffer();
        tokeniser16.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        org.jsoup.parser.TokeniserState tokeniserState23 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser22.transition(tokeniserState23);
        org.jsoup.parser.Token.Comment comment25 = null;
        tokeniser22.commentPending = comment25;
        tokeniser22.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment29 = tokeniser22.commentPending;
        org.jsoup.parser.Token.Tag tag31 = tokeniser22.createTagPending(true);
        tokeniser16.tagPending = tag31;
        java.lang.StringBuilder stringBuilder33 = tokeniser16.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader34 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState13.read(tokeniser16, characterReader34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNull(comment29);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Comment comment7 = null;
        tokeniser1.commentPending = comment7;
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.BeforeDoctypeSystemIdentifier;
        tokeniser1.transition(tokeniserState11);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token14 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertNotNull(doctype12);
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser1.transition(tokeniserState4);
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser1.dataBuffer = stringBuilder6;
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(tag8);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        tokeniser1.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser12.transition(tokeniserState13);
        org.jsoup.parser.Token.Comment comment15 = null;
        tokeniser12.commentPending = comment15;
        tokeniser12.emit('\ufffd');
        tokeniser12.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder21 = tokeniser12.dataBuffer;
        tokeniser12.acknowledgeSelfClosingFlag();
        boolean boolean23 = tokeniser12.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag24 = tokeniser12.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState25 = tokeniser12.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNull(stringBuilder21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(tag24);
        org.junit.Assert.assertNotNull(tokeniserState25);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.Rawtext;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('a');
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag17 = tokeniser1.tagPending;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        org.jsoup.parser.TokeniserState tokeniserState21 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser20.transition(tokeniserState21);
        org.jsoup.parser.Token.Comment comment23 = null;
        tokeniser20.commentPending = comment23;
        tokeniser20.emit('\ufffd');
        tokeniser20.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser20.getState();
        boolean boolean29 = tokeniser20.currentNodeInHtmlNS();
        tokeniser20.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype31 = tokeniser20.doctypePending;
        tokeniser1.doctypePending = doctype31;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNull(tag17);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doctype31);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        java.lang.StringBuilder stringBuilder7 = tokeniser1.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser1.transition(tokeniserState8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char12 = tokeniser1.consumeCharacterReference((java.lang.Character) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNull(stringBuilder7);
        org.junit.Assert.assertNotNull(tokeniserState8);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        boolean boolean8 = tokeniser1.isTrackErrors();
        tokeniser1.emit("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.AfterAttributeValue_quoted;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(false);
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.CommentEnd;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        tokeniser1.emit("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = tokeniser1.consumeCharacterReference((java.lang.Character) '\ufffd', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('a');
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag17 = tokeniser1.tagPending;
        tokeniser1.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNull(tag17);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        boolean boolean12 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = tag13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(tag13);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        tokeniser15.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser15.getState();
        tokeniser15.createTempBuffer();
        tokeniser15.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        org.jsoup.parser.TokeniserState tokeniserState22 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser21.transition(tokeniserState22);
        org.jsoup.parser.Token.Comment comment24 = null;
        tokeniser21.commentPending = comment24;
        tokeniser21.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment28 = tokeniser21.commentPending;
        org.jsoup.parser.Token.Tag tag30 = tokeniser21.createTagPending(true);
        tokeniser15.tagPending = tag30;
        java.lang.StringBuilder stringBuilder32 = tokeniser15.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder32;
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        org.jsoup.parser.TokeniserState tokeniserState36 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser35.transition(tokeniserState36);
        org.jsoup.parser.Token.Comment comment38 = null;
        tokeniser35.commentPending = comment38;
        org.jsoup.parser.TokeniserState tokeniserState40 = tokeniser35.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNull(comment28);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNotNull(tokeniserState40);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser1.transition(tokeniserState12);
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemKeyword;
        tokeniser1.transition(tokeniserState14);
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser17.transition(tokeniserState18);
        org.jsoup.parser.CharacterReader characterReader20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState14.read(tokeniser17, characterReader20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(tokeniserState18);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.setTrackErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('a');
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser1.doctypePending;
        tokeniser1.emit("");
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser9.transition(tokeniserState10);
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser9.doctypePending;
        tokeniser9.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        org.jsoup.parser.TokeniserState tokeniserState17 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser16.transition(tokeniserState17);
        org.jsoup.parser.Token.Comment comment19 = null;
        tokeniser16.commentPending = comment19;
        tokeniser16.emit('\ufffd');
        tokeniser16.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser16.getState();
        boolean boolean25 = tokeniser16.currentNodeInHtmlNS();
        tokeniser16.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype27 = tokeniser16.doctypePending;
        tokeniser9.doctypePending = doctype27;
        tokeniser1.doctypePending = doctype27;
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser32.transition(tokeniserState33);
        org.jsoup.parser.Token.Comment comment35 = null;
        tokeniser32.commentPending = comment35;
        tokeniser32.emit('\ufffd');
        tokeniser32.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder41 = tokeniser32.dataBuffer;
        tokeniser32.acknowledgeSelfClosingFlag();
        boolean boolean43 = tokeniser32.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag44 = tokeniser32.tagPending;
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader45);
        org.jsoup.parser.TokeniserState tokeniserState47 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser46.transition(tokeniserState47);
        org.jsoup.parser.Token.Comment comment49 = null;
        tokeniser46.commentPending = comment49;
        tokeniser46.emit('\ufffd');
        tokeniser46.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState54 = tokeniser46.getState();
        boolean boolean55 = tokeniser46.currentNodeInHtmlNS();
        tokeniser46.emitDoctypePending();
        tokeniser46.emit("");
        org.jsoup.parser.CharacterReader characterReader59 = null;
        org.jsoup.parser.Tokeniser tokeniser60 = new org.jsoup.parser.Tokeniser(characterReader59);
        tokeniser60.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState62 = tokeniser60.getState();
        tokeniser60.createTempBuffer();
        tokeniser60.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader65 = null;
        org.jsoup.parser.Tokeniser tokeniser66 = new org.jsoup.parser.Tokeniser(characterReader65);
        org.jsoup.parser.TokeniserState tokeniserState67 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser66.transition(tokeniserState67);
        org.jsoup.parser.Token.Comment comment69 = null;
        tokeniser66.commentPending = comment69;
        tokeniser66.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment73 = tokeniser66.commentPending;
        org.jsoup.parser.Token.Tag tag75 = tokeniser66.createTagPending(true);
        tokeniser60.tagPending = tag75;
        java.lang.StringBuilder stringBuilder77 = tokeniser60.dataBuffer;
        tokeniser46.dataBuffer = stringBuilder77;
        tokeniser32.dataBuffer = stringBuilder77;
        tokeniser1.dataBuffer = stringBuilder77;
        org.jsoup.parser.Token.Tag tag81 = tokeniser1.tagPending;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doctype27);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNull(stringBuilder41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(tag44);
        org.junit.Assert.assertNotNull(tokeniserState47);
        org.junit.Assert.assertNotNull(tokeniserState54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(tokeniserState62);
        org.junit.Assert.assertNotNull(tokeniserState67);
        org.junit.Assert.assertNull(comment73);
        org.junit.Assert.assertNotNull(tag75);
        org.junit.Assert.assertNotNull(stringBuilder77);
        org.junit.Assert.assertEquals(stringBuilder77.toString(), "");
        org.junit.Assert.assertNull(tag81);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        tokeniser1.emit("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(tag6);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedLessthanSign;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState4);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        boolean boolean7 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser9.transition(tokeniserState10);
        org.jsoup.parser.Token.Comment comment12 = null;
        tokeniser9.commentPending = comment12;
        tokeniser9.emit('\ufffd');
        tokeniser9.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser18.getState();
        org.jsoup.parser.Token.Tag tag22 = tokeniser18.createTagPending(false);
        tokeniser9.tagPending = tag22;
        tokeniser1.tagPending = tag22;
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        org.jsoup.parser.TokeniserState tokeniserState27 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser26.transition(tokeniserState27);
        org.jsoup.parser.Token.Comment comment29 = null;
        tokeniser26.commentPending = comment29;
        tokeniser26.emit('\ufffd');
        tokeniser26.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState34 = tokeniser26.getState();
        boolean boolean35 = tokeniser26.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        tokeniser37.createDoctypePending();
        tokeniser37.createDoctypePending();
        org.jsoup.parser.Token.Comment comment40 = null;
        tokeniser37.commentPending = comment40;
        org.jsoup.parser.Token.Doctype doctype42 = tokeniser37.doctypePending;
        tokeniser26.doctypePending = doctype42;
        tokeniser1.doctypePending = doctype42;
        tokeniser1.emitTagPending();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tokeniserState34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doctype42);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser9.transition(tokeniserState10);
        org.jsoup.parser.Token.Comment comment12 = null;
        tokeniser9.commentPending = comment12;
        tokeniser9.emit('\ufffd');
        tokeniser9.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser9.getState();
        tokeniser9.emit("hi!");
        tokeniser9.emitDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser9.getState();
        java.lang.StringBuilder stringBuilder22 = null;
        tokeniser9.dataBuffer = stringBuilder22;
        org.jsoup.parser.Token.Tag tag25 = tokeniser9.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag25);
        org.jsoup.parser.Token.Comment comment27 = tokeniser1.commentPending;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNull(comment27);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser11.getState();
        tokeniser11.createTempBuffer();
        tokeniser11.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser17.transition(tokeniserState18);
        org.jsoup.parser.Token.Comment comment20 = null;
        tokeniser17.commentPending = comment20;
        tokeniser17.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment24 = tokeniser17.commentPending;
        org.jsoup.parser.Token.Tag tag26 = tokeniser17.createTagPending(true);
        tokeniser11.tagPending = tag26;
        java.lang.StringBuilder stringBuilder28 = tokeniser11.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder28;
        org.jsoup.parser.Token.Doctype doctype30 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState31 = org.jsoup.parser.TokeniserState.ScriptDataEscapedEndTagName;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNull(comment24);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(doctype30);
        org.junit.Assert.assertNotNull(tokeniserState31);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser10.transition(tokeniserState11);
        org.jsoup.parser.Token.Comment comment13 = null;
        tokeniser10.commentPending = comment13;
        tokeniser10.emit('\ufffd');
        tokeniser10.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder19 = tokeniser10.dataBuffer;
        tokeniser10.acknowledgeSelfClosingFlag();
        boolean boolean21 = tokeniser10.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag22 = tokeniser10.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser10.getState();
        org.jsoup.parser.CharacterReader characterReader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState8.read(tokeniser10, characterReader24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNull(stringBuilder19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(tag22);
        org.junit.Assert.assertNotNull(tokeniserState23);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag9 = null;
        tokeniser1.tagPending = tag9;
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char14 = tokeniser1.consumeCharacterReference((java.lang.Character) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser1.transition(tokeniserState9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(false);
        boolean boolean13 = tokeniser1.currentNodeInHtmlNS();
        java.lang.StringBuilder stringBuilder14 = tokeniser1.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token15 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(stringBuilder14);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.RCDATAEndTagOpen;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.createDoctypePending();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser2.commentPending = comment5;
        org.jsoup.parser.Token.Doctype doctype7 = tokeniser2.doctypePending;
        org.jsoup.parser.Token.Tag tag8 = tokeniser2.tagPending;
        boolean boolean9 = tokeniser2.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState10 = null;
        tokeniser2.transition(tokeniserState10);
        org.jsoup.parser.CharacterReader characterReader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CharacterReferenceInRcdata;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('a');
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag16 = tokeniser1.tagPending;
        java.lang.StringBuilder stringBuilder17 = null;
        tokeniser1.dataBuffer = stringBuilder17;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(tag16);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser10.transition(tokeniserState11);
        tokeniser10.emit("hi!");
        org.jsoup.parser.Token.Tag tag15 = tokeniser10.tagPending;
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        tokeniser17.createDoctypePending();
        tokeniser17.createDoctypePending();
        org.jsoup.parser.Token.Comment comment20 = null;
        tokeniser17.commentPending = comment20;
        tokeniser17.createDoctypePending();
        tokeniser17.emit("");
        tokeniser17.createDoctypePending();
        org.jsoup.parser.Token.Comment comment26 = null;
        tokeniser17.commentPending = comment26;
        org.jsoup.parser.TokeniserState tokeniserState28 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser17.transition(tokeniserState28);
        tokeniser10.transition(tokeniserState28);
        tokeniser1.transition(tokeniserState28);
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        tokeniser33.createDoctypePending();
        tokeniser33.createDoctypePending();
        org.jsoup.parser.Token.Comment comment36 = null;
        tokeniser33.commentPending = comment36;
        boolean boolean38 = tokeniser33.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader39 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState28.read(tokeniser33, characterReader39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNull(tag15);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char11 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        tokeniser1.createCommentPending();
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createDoctypePending();
        java.lang.Class<?> wildcardClass12 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        boolean boolean7 = tokeniser1.isTrackErrors();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser10.transition(tokeniserState11);
        org.jsoup.parser.Token.Tag tag13 = tokeniser10.tagPending;
        org.jsoup.parser.Token.Tag tag15 = tokeniser10.createTagPending(false);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit((org.jsoup.parser.Token) tag15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser1.transition(tokeniserState12);
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser18.transition(tokeniserState19);
        org.jsoup.parser.Token.Comment comment21 = null;
        tokeniser18.commentPending = comment21;
        tokeniser18.emit('\ufffd');
        tokeniser18.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder27 = tokeniser18.dataBuffer;
        tokeniser18.acknowledgeSelfClosingFlag();
        boolean boolean29 = tokeniser18.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag30 = tokeniser18.tagPending;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser32.transition(tokeniserState33);
        org.jsoup.parser.Token.Comment comment35 = null;
        tokeniser32.commentPending = comment35;
        tokeniser32.emit('\ufffd');
        tokeniser32.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState40 = tokeniser32.getState();
        boolean boolean41 = tokeniser32.currentNodeInHtmlNS();
        tokeniser32.emitDoctypePending();
        tokeniser32.emit("");
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader45);
        tokeniser46.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState48 = tokeniser46.getState();
        tokeniser46.createTempBuffer();
        tokeniser46.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader51);
        org.jsoup.parser.TokeniserState tokeniserState53 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser52.transition(tokeniserState53);
        org.jsoup.parser.Token.Comment comment55 = null;
        tokeniser52.commentPending = comment55;
        tokeniser52.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment59 = tokeniser52.commentPending;
        org.jsoup.parser.Token.Tag tag61 = tokeniser52.createTagPending(true);
        tokeniser46.tagPending = tag61;
        java.lang.StringBuilder stringBuilder63 = tokeniser46.dataBuffer;
        tokeniser32.dataBuffer = stringBuilder63;
        tokeniser18.dataBuffer = stringBuilder63;
        tokeniser1.dataBuffer = stringBuilder63;
        tokeniser1.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char70 = tokeniser1.consumeCharacterReference((java.lang.Character) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(stringBuilder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(tag30);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tokeniserState48);
        org.junit.Assert.assertNotNull(tokeniserState53);
        org.junit.Assert.assertNull(comment59);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(stringBuilder63);
        org.junit.Assert.assertEquals(stringBuilder63.toString(), "");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.setTrackErrors(true);
        org.junit.Assert.assertNotNull(tokeniserState3);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        java.lang.Class<?> wildcardClass4 = tokeniserState3.getClass();
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser1.doctypePending;
        java.lang.StringBuilder stringBuilder13 = tokeniser1.dataBuffer;
        java.lang.StringBuilder stringBuilder14 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        org.jsoup.parser.TokeniserState tokeniserState17 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser16.transition(tokeniserState17);
        tokeniser16.setTrackErrors(true);
        tokeniser16.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        tokeniser24.createDoctypePending();
        tokeniser24.createDoctypePending();
        org.jsoup.parser.Token.Comment comment27 = null;
        tokeniser24.commentPending = comment27;
        org.jsoup.parser.Token.Doctype doctype29 = tokeniser24.doctypePending;
        tokeniser16.emit((org.jsoup.parser.Token) doctype29);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit((org.jsoup.parser.Token) doctype29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doctype12);
        org.junit.Assert.assertNull(stringBuilder13);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(doctype29);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.Rawtext;
        org.jsoup.parser.Tokeniser tokeniser1 = null;
        org.jsoup.parser.CharacterReader characterReader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser1, characterReader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.setTrackErrors(true);
        java.lang.StringBuilder stringBuilder6 = tokeniser1.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder6);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.TokeniserState tokeniserState6 = tokeniser1.getState();
        java.lang.Class<?> wildcardClass7 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser1.doctypePending;
        java.lang.StringBuilder stringBuilder13 = tokeniser1.dataBuffer;
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char17 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doctype12);
        org.junit.Assert.assertNull(stringBuilder13);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('a');
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag17 = tokeniser1.tagPending;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        org.jsoup.parser.TokeniserState tokeniserState21 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser20.transition(tokeniserState21);
        org.jsoup.parser.Token.Comment comment23 = null;
        tokeniser20.commentPending = comment23;
        tokeniser20.emit('\ufffd');
        tokeniser20.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser20.getState();
        boolean boolean29 = tokeniser20.currentNodeInHtmlNS();
        tokeniser20.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype31 = tokeniser20.doctypePending;
        tokeniser1.doctypePending = doctype31;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token33 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNull(tag17);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doctype31);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token12 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.setTrackErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char11 = tokeniser1.consumeCharacterReference((java.lang.Character) '\ufffd', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AttributeName;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        org.jsoup.parser.TokeniserState tokeniserState3 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser2.transition(tokeniserState3);
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser2.commentPending = comment5;
        tokeniser2.emit('\ufffd');
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Tag tag10 = null;
        tokeniser2.tagPending = tag10;
        tokeniser2.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState3);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser1.transition(tokeniserState12);
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser18.transition(tokeniserState19);
        org.jsoup.parser.Token.Comment comment21 = null;
        tokeniser18.commentPending = comment21;
        tokeniser18.emit('\ufffd');
        tokeniser18.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder27 = tokeniser18.dataBuffer;
        tokeniser18.acknowledgeSelfClosingFlag();
        boolean boolean29 = tokeniser18.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag30 = tokeniser18.tagPending;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser32.transition(tokeniserState33);
        org.jsoup.parser.Token.Comment comment35 = null;
        tokeniser32.commentPending = comment35;
        tokeniser32.emit('\ufffd');
        tokeniser32.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState40 = tokeniser32.getState();
        boolean boolean41 = tokeniser32.currentNodeInHtmlNS();
        tokeniser32.emitDoctypePending();
        tokeniser32.emit("");
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader45);
        tokeniser46.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState48 = tokeniser46.getState();
        tokeniser46.createTempBuffer();
        tokeniser46.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader51);
        org.jsoup.parser.TokeniserState tokeniserState53 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser52.transition(tokeniserState53);
        org.jsoup.parser.Token.Comment comment55 = null;
        tokeniser52.commentPending = comment55;
        tokeniser52.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment59 = tokeniser52.commentPending;
        org.jsoup.parser.Token.Tag tag61 = tokeniser52.createTagPending(true);
        tokeniser46.tagPending = tag61;
        java.lang.StringBuilder stringBuilder63 = tokeniser46.dataBuffer;
        tokeniser32.dataBuffer = stringBuilder63;
        tokeniser18.dataBuffer = stringBuilder63;
        tokeniser1.dataBuffer = stringBuilder63;
        org.jsoup.parser.TokeniserState tokeniserState67 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader68 = null;
        org.jsoup.parser.Tokeniser tokeniser69 = new org.jsoup.parser.Tokeniser(characterReader68);
        org.jsoup.parser.TokeniserState tokeniserState70 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser69.transition(tokeniserState70);
        tokeniser69.emit("hi!");
        org.jsoup.parser.Token.Comment comment74 = null;
        tokeniser69.commentPending = comment74;
        tokeniser69.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState78 = tokeniser69.getState();
        org.jsoup.parser.Token.Tag tag80 = tokeniser69.createTagPending(false);
        tokeniser1.tagPending = tag80;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(stringBuilder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(tag30);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tokeniserState48);
        org.junit.Assert.assertNotNull(tokeniserState53);
        org.junit.Assert.assertNull(comment59);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(stringBuilder63);
        org.junit.Assert.assertEquals(stringBuilder63.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState67);
        org.junit.Assert.assertNotNull(tokeniserState70);
        org.junit.Assert.assertNotNull(tokeniserState78);
        org.junit.Assert.assertNotNull(tag80);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(false);
        org.jsoup.parser.TokeniserState tokeniserState13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser1.dataBuffer = stringBuilder7;
        tokeniser1.setTrackErrors(false);
        tokeniser1.emit(' ');
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser15.transition(tokeniserState16);
        org.jsoup.parser.Token.Comment comment18 = null;
        tokeniser15.commentPending = comment18;
        tokeniser15.emit('\ufffd');
        tokeniser15.createDoctypePending();
        boolean boolean23 = tokeniser15.currentNodeInHtmlNS();
        tokeniser15.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        org.jsoup.parser.TokeniserState tokeniserState27 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser26.transition(tokeniserState27);
        org.jsoup.parser.Token.Comment comment29 = null;
        tokeniser26.commentPending = comment29;
        tokeniser26.emit('\ufffd');
        tokeniser26.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState34 = tokeniser26.getState();
        boolean boolean35 = tokeniser26.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype36 = tokeniser26.doctypePending;
        org.jsoup.parser.Token.Doctype doctype37 = tokeniser26.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState38 = tokeniser26.getState();
        tokeniser15.transition(tokeniserState38);
        org.jsoup.parser.Token.Tag tag41 = tokeniser15.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag41);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tokeniserState34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doctype36);
        org.junit.Assert.assertNotNull(doctype37);
        org.junit.Assert.assertNotNull(tokeniserState38);
        org.junit.Assert.assertNotNull(tag41);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder11 = tokeniser1.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(stringBuilder11);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        tokeniser1.createCommentPending();
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char12 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNull(tag7);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment3 = tokeniser1.commentPending;
        tokeniser1.emitDoctypePending();
        boolean boolean5 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        tokeniser1.transition(tokeniserState11);
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(doctype13);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token7 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser1.transition(tokeniserState12);
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(doctype16);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.CdataSection;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Doctype doctype4 = tokeniser1.doctypePending;
        boolean boolean5 = tokeniser1.isTrackErrors();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(doctype4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser1.dataBuffer = stringBuilder7;
        tokeniser1.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment4 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.createTagPending(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = tokeniser1.consumeCharacterReference((java.lang.Character) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment4);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('a');
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag16 = tokeniser1.tagPending;
        java.lang.StringBuilder stringBuilder17 = null;
        tokeniser1.dataBuffer = stringBuilder17;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(tag16);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        org.jsoup.parser.Token.Tag tag5 = tokeniser1.createTagPending(false);
        tokeniser1.emit('a');
        tokeniser1.createDoctypePending();
        tokeniser1.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.MarkupDeclarationOpen;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.createDoctypePending();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser2.commentPending = comment5;
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        java.lang.Class<?> wildcardClass10 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.setTrackErrors(true);
        tokeniser1.emit("hi!");
        java.lang.StringBuilder stringBuilder8 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token token9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit(token9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder8);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        boolean boolean7 = tokeniser1.isTrackErrors();
        org.jsoup.parser.Token.Doctype doctype8 = tokeniser1.doctypePending;
        tokeniser1.emit("");
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doctype8);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser1.transition(tokeniserState12);
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser18.transition(tokeniserState19);
        org.jsoup.parser.Token.Comment comment21 = null;
        tokeniser18.commentPending = comment21;
        tokeniser18.emit('\ufffd');
        tokeniser18.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder27 = tokeniser18.dataBuffer;
        tokeniser18.acknowledgeSelfClosingFlag();
        boolean boolean29 = tokeniser18.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag30 = tokeniser18.tagPending;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser32.transition(tokeniserState33);
        org.jsoup.parser.Token.Comment comment35 = null;
        tokeniser32.commentPending = comment35;
        tokeniser32.emit('\ufffd');
        tokeniser32.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState40 = tokeniser32.getState();
        boolean boolean41 = tokeniser32.currentNodeInHtmlNS();
        tokeniser32.emitDoctypePending();
        tokeniser32.emit("");
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader45);
        tokeniser46.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState48 = tokeniser46.getState();
        tokeniser46.createTempBuffer();
        tokeniser46.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader51);
        org.jsoup.parser.TokeniserState tokeniserState53 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser52.transition(tokeniserState53);
        org.jsoup.parser.Token.Comment comment55 = null;
        tokeniser52.commentPending = comment55;
        tokeniser52.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment59 = tokeniser52.commentPending;
        org.jsoup.parser.Token.Tag tag61 = tokeniser52.createTagPending(true);
        tokeniser46.tagPending = tag61;
        java.lang.StringBuilder stringBuilder63 = tokeniser46.dataBuffer;
        tokeniser32.dataBuffer = stringBuilder63;
        tokeniser18.dataBuffer = stringBuilder63;
        tokeniser1.dataBuffer = stringBuilder63;
        tokeniser1.createCommentPending();
        java.lang.Class<?> wildcardClass68 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(stringBuilder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(tag30);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tokeniserState48);
        org.junit.Assert.assertNotNull(tokeniserState53);
        org.junit.Assert.assertNull(comment59);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(stringBuilder63);
        org.junit.Assert.assertEquals(stringBuilder63.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        boolean boolean7 = tokeniser1.isTrackErrors();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        tokeniser1.transition(tokeniserState9);
        tokeniser1.emit('a');
        tokeniser1.emit("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser17.transition(tokeniserState18);
        org.jsoup.parser.Token.Comment comment20 = null;
        tokeniser17.commentPending = comment20;
        tokeniser17.emit('\ufffd');
        tokeniser17.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder26 = tokeniser17.dataBuffer;
        tokeniser17.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader28 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState15.read(tokeniser17, characterReader28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNull(doctype13);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNull(stringBuilder26);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('a');
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        java.lang.StringBuilder stringBuilder3 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser5.getState();
        java.lang.StringBuilder stringBuilder8 = null;
        tokeniser5.dataBuffer = stringBuilder8;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.createDoctypePending();
        org.jsoup.parser.Token.Comment comment13 = tokeniser11.commentPending;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser15.transition(tokeniserState16);
        org.jsoup.parser.Token.Comment comment18 = null;
        tokeniser15.commentPending = comment18;
        tokeniser15.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment22 = tokeniser15.commentPending;
        org.jsoup.parser.Token.Tag tag24 = tokeniser15.createTagPending(true);
        tokeniser11.emit((org.jsoup.parser.Token) tag24);
        tokeniser5.tagPending = tag24;
        tokeniser1.emit((org.jsoup.parser.Token) tag24);
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        tokeniser29.createDoctypePending();
        tokeniser29.createDoctypePending();
        org.jsoup.parser.Token.Comment comment32 = null;
        tokeniser29.commentPending = comment32;
        tokeniser29.createDoctypePending();
        tokeniser29.emit("");
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader37);
        org.jsoup.parser.TokeniserState tokeniserState39 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser38.transition(tokeniserState39);
        tokeniser38.emit("hi!");
        org.jsoup.parser.Token.Tag tag43 = tokeniser38.tagPending;
        org.jsoup.parser.CharacterReader characterReader44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader44);
        tokeniser45.createDoctypePending();
        tokeniser45.createDoctypePending();
        org.jsoup.parser.Token.Comment comment48 = null;
        tokeniser45.commentPending = comment48;
        tokeniser45.createDoctypePending();
        tokeniser45.emit("");
        tokeniser45.createDoctypePending();
        org.jsoup.parser.Token.Comment comment54 = null;
        tokeniser45.commentPending = comment54;
        org.jsoup.parser.TokeniserState tokeniserState56 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser45.transition(tokeniserState56);
        tokeniser38.transition(tokeniserState56);
        tokeniser29.transition(tokeniserState56);
        org.jsoup.parser.TokeniserState tokeniserState60 = tokeniser29.getState();
        org.jsoup.parser.TokeniserState tokeniserState61 = tokeniser29.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringBuilder3);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNull(comment13);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNull(comment22);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tokeniserState39);
        org.junit.Assert.assertNull(tag43);
        org.junit.Assert.assertNotNull(tokeniserState56);
        org.junit.Assert.assertNotNull(tokeniserState60);
        org.junit.Assert.assertNotNull(tokeniserState61);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.acknowledgeSelfClosingFlag();
        java.lang.StringBuilder stringBuilder7 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        tokeniser9.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser9.getState();
        org.jsoup.parser.Token.Tag tag13 = tokeniser9.createTagPending(false);
        tokeniser1.emit((org.jsoup.parser.Token) tag13);
        tokeniser1.emit('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringBuilder7);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser9.transition(tokeniserState10);
        org.jsoup.parser.Token.Comment comment12 = null;
        tokeniser9.commentPending = comment12;
        tokeniser9.emit('\ufffd');
        tokeniser9.setTrackErrors(false);
        tokeniser9.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser9.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState19);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser1.dataBuffer = stringBuilder7;
        tokeniser1.setTrackErrors(false);
        tokeniser1.emit(' ');
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.emit('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser1.transition(tokeniserState9);
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment12 = tokeniser1.commentPending;
        tokeniser1.emitCommentPending();
        org.jsoup.parser.Token.Tag tag15 = tokeniser1.createTagPending(true);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(comment12);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.setTrackErrors(true);
        tokeniser1.emit("hi!");
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        java.lang.StringBuilder stringBuilder3 = tokeniser1.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDashDash;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringBuilder3);
        org.junit.Assert.assertNotNull(tokeniserState4);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char14 = tokeniser1.consumeCharacterReference((java.lang.Character) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser1.transition(tokeniserState12);
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        tokeniser1.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment3 = tokeniser1.commentPending;
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        org.jsoup.parser.TokeniserState tokeniserState7 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser6.transition(tokeniserState7);
        tokeniser6.emit("hi!");
        org.jsoup.parser.Token.Tag tag11 = tokeniser6.tagPending;
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        tokeniser13.createDoctypePending();
        tokeniser13.createDoctypePending();
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser13.commentPending = comment16;
        tokeniser13.createDoctypePending();
        tokeniser13.emit("");
        tokeniser13.createDoctypePending();
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser13.commentPending = comment22;
        org.jsoup.parser.TokeniserState tokeniserState24 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser13.transition(tokeniserState24);
        tokeniser6.transition(tokeniserState24);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment3);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState24);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertNotNull(doctype12);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.setTrackErrors(true);
        java.lang.StringBuilder stringBuilder6 = tokeniser1.dataBuffer;
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char10 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder6);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        org.jsoup.parser.TokeniserState tokeniserState7 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser6.transition(tokeniserState7);
        org.jsoup.parser.Token.Comment comment9 = null;
        tokeniser6.commentPending = comment9;
        tokeniser6.emit('\ufffd');
        tokeniser6.setTrackErrors(false);
        tokeniser6.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser6.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNotNull(tokeniserState16);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Comment comment7 = null;
        tokeniser1.commentPending = comment7;
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.BeforeDoctypeSystemIdentifier;
        tokeniser1.transition(tokeniserState11);
        org.jsoup.parser.Token.Tag tag14 = tokeniser1.createTagPending(true);
        org.jsoup.parser.Token.Comment comment15 = tokeniser1.commentPending;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNull(comment15);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('a');
        org.jsoup.parser.TokeniserState tokeniserState15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser1.dataBuffer = stringBuilder7;
        tokeniser1.createDoctypePending();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        tokeniser12.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment15 = tokeniser12.commentPending;
        org.jsoup.parser.Token.Tag tag16 = tokeniser12.tagPending;
        tokeniser12.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.ScriptDataEndTagOpen;
        tokeniser12.transition(tokeniserState18);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNull(comment15);
        org.junit.Assert.assertNull(tag16);
        org.junit.Assert.assertNotNull(tokeniserState18);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('a');
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag17 = tokeniser1.tagPending;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        org.jsoup.parser.TokeniserState tokeniserState21 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser20.transition(tokeniserState21);
        org.jsoup.parser.Token.Comment comment23 = null;
        tokeniser20.commentPending = comment23;
        tokeniser20.emit('\ufffd');
        tokeniser20.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser20.getState();
        boolean boolean29 = tokeniser20.currentNodeInHtmlNS();
        tokeniser20.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype31 = tokeniser20.doctypePending;
        tokeniser1.doctypePending = doctype31;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        org.jsoup.parser.TokeniserState tokeniserState35 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser34.transition(tokeniserState35);
        org.jsoup.parser.Token.Comment comment37 = null;
        tokeniser34.commentPending = comment37;
        tokeniser34.emit('\ufffd');
        tokeniser34.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder43 = tokeniser34.dataBuffer;
        tokeniser34.acknowledgeSelfClosingFlag();
        boolean boolean45 = tokeniser34.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag46 = tokeniser34.tagPending;
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader47);
        org.jsoup.parser.TokeniserState tokeniserState49 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser48.transition(tokeniserState49);
        org.jsoup.parser.Token.Comment comment51 = null;
        tokeniser48.commentPending = comment51;
        tokeniser48.emit('\ufffd');
        tokeniser48.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState56 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser48.transition(tokeniserState56);
        tokeniser48.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment59 = tokeniser48.commentPending;
        tokeniser34.emit((org.jsoup.parser.Token) comment59);
        tokeniser1.commentPending = comment59;
        java.lang.Class<?> wildcardClass62 = comment59.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNull(tag17);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doctype31);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNull(stringBuilder43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(tag46);
        org.junit.Assert.assertNotNull(tokeniserState49);
        org.junit.Assert.assertNotNull(tokeniserState56);
        org.junit.Assert.assertNotNull(comment59);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser1.dataBuffer = stringBuilder7;
        tokeniser1.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Doctype doctype4 = tokeniser1.doctypePending;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser8.transition(tokeniserState9);
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser8.commentPending = comment11;
        tokeniser8.emit('\ufffd');
        tokeniser8.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser8.getState();
        boolean boolean17 = tokeniser8.currentNodeInHtmlNS();
        tokeniser8.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype19 = tokeniser8.doctypePending;
        tokeniser1.doctypePending = doctype19;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(doctype4);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doctype19);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser1.getState();
        org.jsoup.parser.Token.Tag tag16 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser18.transition(tokeniserState19);
        org.jsoup.parser.Token.Comment comment21 = null;
        tokeniser18.commentPending = comment21;
        tokeniser18.emit('\ufffd');
        tokeniser18.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser18.getState();
        boolean boolean27 = tokeniser18.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype28 = tokeniser18.doctypePending;
        org.jsoup.parser.Token.Doctype doctype29 = tokeniser18.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState30 = tokeniser18.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNull(doctype13);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(doctype28);
        org.junit.Assert.assertNotNull(doctype29);
        org.junit.Assert.assertNotNull(tokeniserState30);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        java.lang.StringBuilder stringBuilder7 = tokeniser1.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser1.transition(tokeniserState8);
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser11.transition(tokeniserState12);
        org.jsoup.parser.Token.Comment comment14 = null;
        tokeniser11.commentPending = comment14;
        tokeniser11.emit('\ufffd');
        tokeniser11.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser11.transition(tokeniserState19);
        tokeniser11.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment22 = tokeniser11.commentPending;
        tokeniser1.commentPending = comment22;
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        org.jsoup.parser.TokeniserState tokeniserState26 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser25.transition(tokeniserState26);
        org.jsoup.parser.Token.Comment comment28 = null;
        tokeniser25.commentPending = comment28;
        tokeniser25.emit('\ufffd');
        tokeniser25.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        tokeniser34.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState36 = tokeniser34.getState();
        org.jsoup.parser.Token.Tag tag38 = tokeniser34.createTagPending(false);
        tokeniser25.tagPending = tag38;
        tokeniser1.emit((org.jsoup.parser.Token) tag38);
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader41);
        org.jsoup.parser.TokeniserState tokeniserState43 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser42.transition(tokeniserState43);
        org.jsoup.parser.Token.Comment comment45 = null;
        tokeniser42.commentPending = comment45;
        tokeniser42.emit('\ufffd');
        tokeniser42.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder51 = tokeniser42.dataBuffer;
        tokeniser42.acknowledgeSelfClosingFlag();
        tokeniser42.acknowledgeSelfClosingFlag();
        tokeniser42.emit('a');
        boolean boolean56 = tokeniser42.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype57 = tokeniser42.doctypePending;
        org.jsoup.parser.CharacterReader characterReader58 = null;
        org.jsoup.parser.Tokeniser tokeniser59 = new org.jsoup.parser.Tokeniser(characterReader58);
        org.jsoup.parser.TokeniserState tokeniserState60 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser59.transition(tokeniserState60);
        tokeniser59.setTrackErrors(true);
        tokeniser59.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader66 = null;
        org.jsoup.parser.Tokeniser tokeniser67 = new org.jsoup.parser.Tokeniser(characterReader66);
        tokeniser67.createDoctypePending();
        tokeniser67.createDoctypePending();
        org.jsoup.parser.Token.Comment comment70 = null;
        tokeniser67.commentPending = comment70;
        org.jsoup.parser.Token.Doctype doctype72 = tokeniser67.doctypePending;
        tokeniser59.emit((org.jsoup.parser.Token) doctype72);
        tokeniser42.doctypePending = doctype72;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit((org.jsoup.parser.Token) doctype72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNull(stringBuilder7);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(comment22);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(tokeniserState43);
        org.junit.Assert.assertNull(stringBuilder51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(doctype57);
        org.junit.Assert.assertNotNull(tokeniserState60);
        org.junit.Assert.assertNotNull(doctype72);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser17.transition(tokeniserState18);
        org.jsoup.parser.Token.Comment comment20 = null;
        tokeniser17.commentPending = comment20;
        tokeniser17.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        org.jsoup.parser.TokeniserState tokeniserState26 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser25.transition(tokeniserState26);
        org.jsoup.parser.Token.Comment comment28 = null;
        tokeniser25.commentPending = comment28;
        tokeniser25.emit('\ufffd');
        tokeniser25.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder34 = tokeniser25.dataBuffer;
        tokeniser25.acknowledgeSelfClosingFlag();
        boolean boolean36 = tokeniser25.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag37 = tokeniser25.tagPending;
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        org.jsoup.parser.TokeniserState tokeniserState40 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser39.transition(tokeniserState40);
        org.jsoup.parser.Token.Comment comment42 = null;
        tokeniser39.commentPending = comment42;
        tokeniser39.emit('\ufffd');
        tokeniser39.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState47 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser39.transition(tokeniserState47);
        tokeniser39.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment50 = tokeniser39.commentPending;
        tokeniser25.emit((org.jsoup.parser.Token) comment50);
        tokeniser17.commentPending = comment50;
        tokeniser1.commentPending = comment50;
        org.jsoup.parser.Token.Tag tag55 = tokeniser1.createTagPending(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNull(stringBuilder34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(tag37);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertNotNull(tokeniserState47);
        org.junit.Assert.assertNotNull(comment50);
        org.junit.Assert.assertNotNull(tag55);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.createTempBuffer();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser7.transition(tokeniserState8);
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser7.commentPending = comment10;
        tokeniser7.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment14 = tokeniser7.commentPending;
        org.jsoup.parser.Token.Tag tag16 = tokeniser7.createTagPending(true);
        tokeniser1.tagPending = tag16;
        org.jsoup.parser.Token.Tag tag18 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        tokeniser20.createDoctypePending();
        tokeniser20.createDoctypePending();
        tokeniser20.createDoctypePending();
        org.jsoup.parser.Token.Tag tag25 = tokeniser20.createTagPending(true);
        tokeniser1.tagPending = tag25;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag25);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        boolean boolean7 = tokeniser1.isTrackErrors();
        tokeniser1.createTempBuffer();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser11.transition(tokeniserState12);
        org.jsoup.parser.Token.Comment comment14 = null;
        tokeniser11.commentPending = comment14;
        tokeniser11.emit('\ufffd');
        tokeniser11.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser11.getState();
        tokeniser11.emitDoctypePending();
        java.lang.StringBuilder stringBuilder21 = null;
        tokeniser11.dataBuffer = stringBuilder21;
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        tokeniser24.createDoctypePending();
        tokeniser24.createDoctypePending();
        org.jsoup.parser.Token.Comment comment27 = null;
        tokeniser24.commentPending = comment27;
        org.jsoup.parser.Token.Tag tag29 = tokeniser24.tagPending;
        java.lang.StringBuilder stringBuilder30 = tokeniser24.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState31 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser24.transition(tokeniserState31);
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        org.jsoup.parser.TokeniserState tokeniserState35 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser34.transition(tokeniserState35);
        org.jsoup.parser.Token.Comment comment37 = null;
        tokeniser34.commentPending = comment37;
        tokeniser34.emit('\ufffd');
        tokeniser34.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState42 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser34.transition(tokeniserState42);
        tokeniser34.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment45 = tokeniser34.commentPending;
        tokeniser24.commentPending = comment45;
        tokeniser11.commentPending = comment45;
        tokeniser1.emit((org.jsoup.parser.Token) comment45);
        org.jsoup.parser.TokeniserState tokeniserState49 = org.jsoup.parser.TokeniserState.AfterDoctypePublicKeyword;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(tag29);
        org.junit.Assert.assertNull(stringBuilder30);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertNotNull(comment45);
        org.junit.Assert.assertNotNull(tokeniserState49);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder4 = null;
        tokeniser1.dataBuffer = stringBuilder4;
        org.jsoup.parser.TokeniserState tokeniserState6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.RCDATAEndTagName;
        tokeniser1.transition(tokeniserState12);
        org.jsoup.parser.Token.Comment comment14 = tokeniser1.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNull(comment14);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        org.jsoup.parser.TokeniserState tokeniserState15 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser14.transition(tokeniserState15);
        org.jsoup.parser.Token.Comment comment17 = null;
        tokeniser14.commentPending = comment17;
        tokeniser14.emit('\ufffd');
        tokeniser14.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser14.getState();
        tokeniser14.emitDoctypePending();
        tokeniser14.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.RawtextEndTagOpen;
        tokeniser14.transition(tokeniserState25);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNotNull(tokeniserState25);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser1.getState();
        tokeniser1.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char8 = tokeniser1.consumeCharacterReference((java.lang.Character) '\ufffd', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState4);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser8.transition(tokeniserState9);
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser8.commentPending = comment11;
        tokeniser8.emit('\ufffd');
        tokeniser8.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser8.getState();
        boolean boolean17 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        tokeniser19.createDoctypePending();
        tokeniser19.createDoctypePending();
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser19.commentPending = comment22;
        org.jsoup.parser.Token.Doctype doctype24 = tokeniser19.doctypePending;
        tokeniser8.doctypePending = doctype24;
        tokeniser1.doctypePending = doctype24;
        org.jsoup.parser.Token.Comment comment27 = tokeniser1.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token29 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doctype24);
        org.junit.Assert.assertNull(comment27);
        org.junit.Assert.assertNotNull(tokeniserState28);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token12 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.TokeniserState tokeniserState6 = org.jsoup.parser.TokeniserState.CommentEndBang;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState6);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        java.lang.StringBuilder stringBuilder3 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.createDoctypePending();
        tokeniser5.createDoctypePending();
        org.jsoup.parser.Token.Comment comment8 = null;
        tokeniser5.commentPending = comment8;
        tokeniser5.acknowledgeSelfClosingFlag();
        java.lang.StringBuilder stringBuilder11 = tokeniser5.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser13.transition(tokeniserState14);
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser13.commentPending = comment16;
        tokeniser13.emit('\ufffd');
        tokeniser13.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder22 = tokeniser13.dataBuffer;
        tokeniser13.acknowledgeSelfClosingFlag();
        tokeniser13.acknowledgeSelfClosingFlag();
        tokeniser13.emit('a');
        boolean boolean27 = tokeniser13.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype28 = tokeniser13.doctypePending;
        org.jsoup.parser.Token.Tag tag29 = tokeniser13.tagPending;
        tokeniser13.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser32.transition(tokeniserState33);
        org.jsoup.parser.Token.Comment comment35 = null;
        tokeniser32.commentPending = comment35;
        tokeniser32.emit('\ufffd');
        tokeniser32.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState40 = tokeniser32.getState();
        boolean boolean41 = tokeniser32.currentNodeInHtmlNS();
        tokeniser32.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype43 = tokeniser32.doctypePending;
        tokeniser13.doctypePending = doctype43;
        tokeniser5.doctypePending = doctype43;
        tokeniser1.emit((org.jsoup.parser.Token) doctype43);
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader48 = null;
        org.jsoup.parser.Tokeniser tokeniser49 = new org.jsoup.parser.Tokeniser(characterReader48);
        org.jsoup.parser.TokeniserState tokeniserState50 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser49.transition(tokeniserState50);
        org.jsoup.parser.TokeniserState tokeniserState52 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser49.transition(tokeniserState52);
        org.jsoup.parser.Token.Tag tag55 = tokeniser49.createTagPending(true);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit((org.jsoup.parser.Token) tag55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringBuilder3);
        org.junit.Assert.assertNull(stringBuilder11);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNull(stringBuilder22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(doctype28);
        org.junit.Assert.assertNull(tag29);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(doctype43);
        org.junit.Assert.assertNotNull(tokeniserState50);
        org.junit.Assert.assertNotNull(tokeniserState52);
        org.junit.Assert.assertNotNull(tag55);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser13.transition(tokeniserState14);
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser13.commentPending = comment16;
        org.jsoup.parser.Token.Tag tag18 = tokeniser13.tagPending;
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        org.jsoup.parser.TokeniserState tokeniserState21 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser20.transition(tokeniserState21);
        org.jsoup.parser.Token.Comment comment23 = null;
        tokeniser20.commentPending = comment23;
        tokeniser20.emit('\ufffd');
        tokeniser20.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser20.getState();
        boolean boolean29 = tokeniser20.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        tokeniser31.createDoctypePending();
        tokeniser31.createDoctypePending();
        org.jsoup.parser.Token.Comment comment34 = null;
        tokeniser31.commentPending = comment34;
        org.jsoup.parser.Token.Doctype doctype36 = tokeniser31.doctypePending;
        tokeniser20.doctypePending = doctype36;
        tokeniser13.doctypePending = doctype36;
        tokeniser1.doctypePending = doctype36;
        java.lang.Class<?> wildcardClass40 = doctype36.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNull(tag18);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doctype36);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        tokeniser1.emit("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token13 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser1.getState();
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapeStart;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment8 = tokeniser1.commentPending;
        java.lang.StringBuilder stringBuilder9 = tokeniser1.dataBuffer;
        tokeniser1.emit('a');
        java.lang.Class<?> wildcardClass12 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment8);
        org.junit.Assert.assertNull(stringBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment8 = tokeniser1.commentPending;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token token11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit(token11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNull(comment8);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.RCDATAEndTagName;
        tokeniser1.transition(tokeniserState12);
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        tokeniser15.emit('\ufffd');
        org.jsoup.parser.Token.Tag tag19 = tokeniser15.createTagPending(true);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit((org.jsoup.parser.Token) tag19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.ScriptDataEscapedEndTagOpen;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        boolean boolean8 = tokeniser1.isTrackErrors();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.createDoctypePending();
        tokeniser11.createDoctypePending();
        org.jsoup.parser.Token.Comment comment14 = null;
        tokeniser11.commentPending = comment14;
        boolean boolean16 = tokeniser11.isTrackErrors();
        boolean boolean17 = tokeniser11.isTrackErrors();
        tokeniser11.createTempBuffer();
        tokeniser11.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        org.jsoup.parser.TokeniserState tokeniserState22 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser21.transition(tokeniserState22);
        org.jsoup.parser.Token.Comment comment24 = null;
        tokeniser21.commentPending = comment24;
        tokeniser21.emit('\ufffd');
        tokeniser21.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser21.getState();
        tokeniser21.emitDoctypePending();
        java.lang.StringBuilder stringBuilder31 = null;
        tokeniser21.dataBuffer = stringBuilder31;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        tokeniser34.createDoctypePending();
        tokeniser34.createDoctypePending();
        org.jsoup.parser.Token.Comment comment37 = null;
        tokeniser34.commentPending = comment37;
        org.jsoup.parser.Token.Tag tag39 = tokeniser34.tagPending;
        java.lang.StringBuilder stringBuilder40 = tokeniser34.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState41 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser34.transition(tokeniserState41);
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader43);
        org.jsoup.parser.TokeniserState tokeniserState45 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser44.transition(tokeniserState45);
        org.jsoup.parser.Token.Comment comment47 = null;
        tokeniser44.commentPending = comment47;
        tokeniser44.emit('\ufffd');
        tokeniser44.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState52 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser44.transition(tokeniserState52);
        tokeniser44.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment55 = tokeniser44.commentPending;
        tokeniser34.commentPending = comment55;
        tokeniser21.commentPending = comment55;
        tokeniser11.emit((org.jsoup.parser.Token) comment55);
        tokeniser1.commentPending = comment55;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNull(tag39);
        org.junit.Assert.assertNull(stringBuilder40);
        org.junit.Assert.assertNotNull(tokeniserState41);
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertNotNull(tokeniserState52);
        org.junit.Assert.assertNotNull(comment55);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser10.transition(tokeniserState11);
        org.jsoup.parser.Token.Comment comment13 = null;
        tokeniser10.commentPending = comment13;
        tokeniser10.emit('\ufffd');
        tokeniser10.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser10.getState();
        boolean boolean19 = tokeniser10.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        tokeniser21.createDoctypePending();
        tokeniser21.createDoctypePending();
        org.jsoup.parser.Token.Comment comment24 = null;
        tokeniser21.commentPending = comment24;
        org.jsoup.parser.Token.Doctype doctype26 = tokeniser21.doctypePending;
        tokeniser10.doctypePending = doctype26;
        tokeniser1.emit((org.jsoup.parser.Token) doctype26);
        java.lang.Class<?> wildcardClass29 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(doctype26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser10.transition(tokeniserState11);
        tokeniser10.emit("hi!");
        org.jsoup.parser.Token.Tag tag15 = tokeniser10.tagPending;
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        tokeniser17.createDoctypePending();
        tokeniser17.createDoctypePending();
        org.jsoup.parser.Token.Comment comment20 = null;
        tokeniser17.commentPending = comment20;
        tokeniser17.createDoctypePending();
        tokeniser17.emit("");
        tokeniser17.createDoctypePending();
        org.jsoup.parser.Token.Comment comment26 = null;
        tokeniser17.commentPending = comment26;
        org.jsoup.parser.TokeniserState tokeniserState28 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser17.transition(tokeniserState28);
        tokeniser10.transition(tokeniserState28);
        tokeniser1.transition(tokeniserState28);
        org.jsoup.parser.TokeniserState tokeniserState32 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        org.jsoup.parser.TokeniserState tokeniserState35 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser34.transition(tokeniserState35);
        org.jsoup.parser.Token.Comment comment37 = null;
        tokeniser34.commentPending = comment37;
        tokeniser34.emit('\ufffd');
        tokeniser34.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState42 = tokeniser34.getState();
        tokeniser34.emitDoctypePending();
        java.lang.StringBuilder stringBuilder44 = null;
        tokeniser34.dataBuffer = stringBuilder44;
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader46);
        tokeniser47.createDoctypePending();
        tokeniser47.createDoctypePending();
        org.jsoup.parser.Token.Comment comment50 = null;
        tokeniser47.commentPending = comment50;
        org.jsoup.parser.Token.Tag tag52 = tokeniser47.tagPending;
        java.lang.StringBuilder stringBuilder53 = tokeniser47.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState54 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser47.transition(tokeniserState54);
        org.jsoup.parser.CharacterReader characterReader56 = null;
        org.jsoup.parser.Tokeniser tokeniser57 = new org.jsoup.parser.Tokeniser(characterReader56);
        org.jsoup.parser.TokeniserState tokeniserState58 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser57.transition(tokeniserState58);
        org.jsoup.parser.Token.Comment comment60 = null;
        tokeniser57.commentPending = comment60;
        tokeniser57.emit('\ufffd');
        tokeniser57.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState65 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser57.transition(tokeniserState65);
        tokeniser57.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment68 = tokeniser57.commentPending;
        tokeniser47.commentPending = comment68;
        tokeniser34.commentPending = comment68;
        org.jsoup.parser.Token.Tag tag71 = tokeniser34.tagPending;
        org.jsoup.parser.CharacterReader characterReader72 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState32.read(tokeniser34, characterReader72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNull(tag15);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertNotNull(tokeniserState32);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertNull(tag52);
        org.junit.Assert.assertNull(stringBuilder53);
        org.junit.Assert.assertNotNull(tokeniserState54);
        org.junit.Assert.assertNotNull(tokeniserState58);
        org.junit.Assert.assertNotNull(tokeniserState65);
        org.junit.Assert.assertNotNull(comment68);
        org.junit.Assert.assertNull(tag71);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment3 = tokeniser1.commentPending;
        tokeniser1.emitDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment3);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser1.transition(tokeniserState9);
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment12 = tokeniser1.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char15 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(comment12);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.createTempBuffer();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser7.transition(tokeniserState8);
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser7.commentPending = comment10;
        tokeniser7.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment14 = tokeniser7.commentPending;
        org.jsoup.parser.Token.Tag tag16 = tokeniser7.createTagPending(true);
        tokeniser1.tagPending = tag16;
        java.lang.StringBuilder stringBuilder18 = tokeniser1.dataBuffer;
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        org.jsoup.parser.TokeniserState tokeniserState22 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser21.transition(tokeniserState22);
        org.jsoup.parser.Token.Comment comment24 = null;
        tokeniser21.commentPending = comment24;
        tokeniser21.emit('\ufffd');
        tokeniser21.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser21.getState();
        boolean boolean30 = tokeniser21.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser21.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tokeniserState31);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser1.getState();
        tokeniser1.setTrackErrors(false);
        boolean boolean16 = tokeniser1.isTrackErrors();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token17 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        java.lang.StringBuilder stringBuilder6 = tokeniser1.dataBuffer;
        tokeniser1.emitDoctypePending();
        java.lang.StringBuilder stringBuilder8 = tokeniser1.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.setTrackErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNull(stringBuilder8);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        boolean boolean12 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser1.getState();
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.PLAINTEXT;
        tokeniser1.error(tokeniserState16);
        tokeniser1.emit(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char22 = tokeniser1.consumeCharacterReference((java.lang.Character) '\ufffd', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNotNull(tokeniserState16);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        tokeniser13.createDoctypePending();
        tokeniser13.createDoctypePending();
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser13.commentPending = comment16;
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser13.doctypePending;
        org.jsoup.parser.Token.Tag tag19 = tokeniser13.tagPending;
        boolean boolean20 = tokeniser13.isTrackErrors();
        tokeniser13.emit("hi!");
        org.jsoup.parser.Token.Tag tag24 = tokeniser13.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        tokeniser26.createDoctypePending();
        org.jsoup.parser.Token.Tag tag29 = tokeniser26.createTagPending(true);
        tokeniser13.emit((org.jsoup.parser.Token) tag29);
        tokeniser1.emit((org.jsoup.parser.Token) tag29);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(doctype18);
        org.junit.Assert.assertNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag29);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.MarkupDeclarationOpen;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        org.jsoup.parser.TokeniserState tokeniserState3 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser2.transition(tokeniserState3);
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser2.commentPending = comment5;
        tokeniser2.emit('\ufffd');
        tokeniser2.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser2.getState();
        tokeniser2.emitDoctypePending();
        java.lang.StringBuilder stringBuilder12 = null;
        tokeniser2.dataBuffer = stringBuilder12;
        tokeniser2.setTrackErrors(true);
        boolean boolean16 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser1.getState();
        tokeniser1.setTrackErrors(false);
        boolean boolean16 = tokeniser1.isTrackErrors();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.createDoctypePending();
        tokeniser8.createDoctypePending();
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser8.commentPending = comment11;
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser8.doctypePending;
        org.jsoup.parser.Token.Tag tag14 = tokeniser8.tagPending;
        tokeniser8.createCommentPending();
        tokeniser8.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser18.transition(tokeniserState19);
        tokeniser18.emit("hi!");
        org.jsoup.parser.Token.Comment comment23 = null;
        tokeniser18.commentPending = comment23;
        tokeniser18.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState27 = tokeniser18.getState();
        tokeniser18.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        org.jsoup.parser.TokeniserState tokeniserState31 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser30.transition(tokeniserState31);
        org.jsoup.parser.Token.Comment comment33 = null;
        tokeniser30.commentPending = comment33;
        org.jsoup.parser.Token.Tag tag35 = tokeniser30.tagPending;
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        org.jsoup.parser.TokeniserState tokeniserState38 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser37.transition(tokeniserState38);
        org.jsoup.parser.Token.Comment comment40 = null;
        tokeniser37.commentPending = comment40;
        tokeniser37.emit('\ufffd');
        tokeniser37.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState45 = tokeniser37.getState();
        boolean boolean46 = tokeniser37.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader47);
        tokeniser48.createDoctypePending();
        tokeniser48.createDoctypePending();
        org.jsoup.parser.Token.Comment comment51 = null;
        tokeniser48.commentPending = comment51;
        org.jsoup.parser.Token.Doctype doctype53 = tokeniser48.doctypePending;
        tokeniser37.doctypePending = doctype53;
        tokeniser30.doctypePending = doctype53;
        tokeniser18.doctypePending = doctype53;
        tokeniser8.doctypePending = doctype53;
        org.jsoup.parser.TokeniserState tokeniserState58 = tokeniser8.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNotNull(doctype13);
        org.junit.Assert.assertNull(tag14);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNull(tag35);
        org.junit.Assert.assertNotNull(tokeniserState38);
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(doctype53);
        org.junit.Assert.assertNotNull(tokeniserState58);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Doctype doctype4 = tokeniser1.doctypePending;
        boolean boolean5 = tokeniser1.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState6 = org.jsoup.parser.TokeniserState.RawtextLessthanSign;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(doctype4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tokeniserState6);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.createTagPending(true);
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Comment comment8 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser10.transition(tokeniserState11);
        org.jsoup.parser.Token.Comment comment13 = null;
        tokeniser10.commentPending = comment13;
        tokeniser10.emit('\ufffd');
        tokeniser10.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser10.getState();
        tokeniser10.emit("hi!");
        tokeniser10.emitDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser10.getState();
        java.lang.StringBuilder stringBuilder23 = null;
        tokeniser10.dataBuffer = stringBuilder23;
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        org.jsoup.parser.TokeniserState tokeniserState27 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser26.transition(tokeniserState27);
        org.jsoup.parser.Token.Comment comment29 = null;
        tokeniser26.commentPending = comment29;
        tokeniser26.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        org.jsoup.parser.TokeniserState tokeniserState35 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser34.transition(tokeniserState35);
        org.jsoup.parser.Token.Comment comment37 = null;
        tokeniser34.commentPending = comment37;
        tokeniser34.emit('\ufffd');
        tokeniser34.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder43 = tokeniser34.dataBuffer;
        tokeniser34.acknowledgeSelfClosingFlag();
        boolean boolean45 = tokeniser34.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag46 = tokeniser34.tagPending;
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader47);
        org.jsoup.parser.TokeniserState tokeniserState49 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser48.transition(tokeniserState49);
        org.jsoup.parser.Token.Comment comment51 = null;
        tokeniser48.commentPending = comment51;
        tokeniser48.emit('\ufffd');
        tokeniser48.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState56 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser48.transition(tokeniserState56);
        tokeniser48.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment59 = tokeniser48.commentPending;
        tokeniser34.emit((org.jsoup.parser.Token) comment59);
        tokeniser26.commentPending = comment59;
        tokeniser10.commentPending = comment59;
        tokeniser1.commentPending = comment59;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char66 = tokeniser1.consumeCharacterReference((java.lang.Character) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(comment8);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNull(stringBuilder43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(tag46);
        org.junit.Assert.assertNotNull(tokeniserState49);
        org.junit.Assert.assertNotNull(tokeniserState56);
        org.junit.Assert.assertNotNull(comment59);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        boolean boolean7 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser9.transition(tokeniserState10);
        org.jsoup.parser.Token.Comment comment12 = null;
        tokeniser9.commentPending = comment12;
        tokeniser9.emit('\ufffd');
        tokeniser9.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser18.getState();
        org.jsoup.parser.Token.Tag tag22 = tokeniser18.createTagPending(false);
        tokeniser9.tagPending = tag22;
        tokeniser1.tagPending = tag22;
        boolean boolean25 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        tokeniser27.createDoctypePending();
        tokeniser27.createDoctypePending();
        org.jsoup.parser.Token.Comment comment30 = null;
        tokeniser27.commentPending = comment30;
        tokeniser27.createDoctypePending();
        tokeniser27.emit("");
        tokeniser27.createDoctypePending();
        org.jsoup.parser.Token.Comment comment36 = null;
        tokeniser27.commentPending = comment36;
        org.jsoup.parser.TokeniserState tokeniserState38 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser27.transition(tokeniserState38);
        java.lang.StringBuilder stringBuilder40 = null;
        tokeniser27.dataBuffer = stringBuilder40;
        tokeniser27.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader43);
        org.jsoup.parser.TokeniserState tokeniserState45 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser44.transition(tokeniserState45);
        org.jsoup.parser.Token.Comment comment47 = null;
        tokeniser44.commentPending = comment47;
        tokeniser44.emit('\ufffd');
        tokeniser44.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder53 = tokeniser44.dataBuffer;
        tokeniser44.acknowledgeSelfClosingFlag();
        boolean boolean55 = tokeniser44.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag56 = tokeniser44.tagPending;
        org.jsoup.parser.CharacterReader characterReader57 = null;
        org.jsoup.parser.Tokeniser tokeniser58 = new org.jsoup.parser.Tokeniser(characterReader57);
        org.jsoup.parser.TokeniserState tokeniserState59 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser58.transition(tokeniserState59);
        org.jsoup.parser.Token.Comment comment61 = null;
        tokeniser58.commentPending = comment61;
        tokeniser58.emit('\ufffd');
        tokeniser58.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState66 = tokeniser58.getState();
        boolean boolean67 = tokeniser58.currentNodeInHtmlNS();
        tokeniser58.emitDoctypePending();
        tokeniser58.emit("");
        org.jsoup.parser.CharacterReader characterReader71 = null;
        org.jsoup.parser.Tokeniser tokeniser72 = new org.jsoup.parser.Tokeniser(characterReader71);
        tokeniser72.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState74 = tokeniser72.getState();
        tokeniser72.createTempBuffer();
        tokeniser72.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader77 = null;
        org.jsoup.parser.Tokeniser tokeniser78 = new org.jsoup.parser.Tokeniser(characterReader77);
        org.jsoup.parser.TokeniserState tokeniserState79 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser78.transition(tokeniserState79);
        org.jsoup.parser.Token.Comment comment81 = null;
        tokeniser78.commentPending = comment81;
        tokeniser78.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment85 = tokeniser78.commentPending;
        org.jsoup.parser.Token.Tag tag87 = tokeniser78.createTagPending(true);
        tokeniser72.tagPending = tag87;
        java.lang.StringBuilder stringBuilder89 = tokeniser72.dataBuffer;
        tokeniser58.dataBuffer = stringBuilder89;
        tokeniser44.dataBuffer = stringBuilder89;
        tokeniser27.dataBuffer = stringBuilder89;
        tokeniser1.dataBuffer = stringBuilder89;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token94 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tokeniserState38);
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertNull(stringBuilder53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(tag56);
        org.junit.Assert.assertNotNull(tokeniserState59);
        org.junit.Assert.assertNotNull(tokeniserState66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(tokeniserState74);
        org.junit.Assert.assertNotNull(tokeniserState79);
        org.junit.Assert.assertNull(comment85);
        org.junit.Assert.assertNotNull(tag87);
        org.junit.Assert.assertNotNull(stringBuilder89);
        org.junit.Assert.assertEquals(stringBuilder89.toString(), "");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState4 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        java.lang.StringBuilder stringBuilder11 = null;
        tokeniser1.dataBuffer = stringBuilder11;
        tokeniser1.setTrackErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        boolean boolean12 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser15.transition(tokeniserState16);
        org.jsoup.parser.Token.Comment comment18 = null;
        tokeniser15.commentPending = comment18;
        tokeniser15.emit('\ufffd');
        tokeniser15.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser15.getState();
        boolean boolean24 = tokeniser15.currentNodeInHtmlNS();
        tokeniser15.emitDoctypePending();
        tokeniser15.emit("");
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        tokeniser29.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser29.getState();
        tokeniser29.createTempBuffer();
        tokeniser29.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        org.jsoup.parser.TokeniserState tokeniserState36 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser35.transition(tokeniserState36);
        org.jsoup.parser.Token.Comment comment38 = null;
        tokeniser35.commentPending = comment38;
        tokeniser35.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment42 = tokeniser35.commentPending;
        org.jsoup.parser.Token.Tag tag44 = tokeniser35.createTagPending(true);
        tokeniser29.tagPending = tag44;
        java.lang.StringBuilder stringBuilder46 = tokeniser29.dataBuffer;
        tokeniser15.dataBuffer = stringBuilder46;
        tokeniser1.dataBuffer = stringBuilder46;
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader51);
        org.jsoup.parser.TokeniserState tokeniserState53 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser52.transition(tokeniserState53);
        org.jsoup.parser.Token.Comment comment55 = null;
        tokeniser52.commentPending = comment55;
        tokeniser52.emit('\ufffd');
        tokeniser52.createDoctypePending();
        org.jsoup.parser.Token.Tag tag60 = null;
        tokeniser52.tagPending = tag60;
        org.jsoup.parser.TokeniserState tokeniserState62 = tokeniser52.getState();
        org.jsoup.parser.CharacterReader characterReader63 = null;
        org.jsoup.parser.Tokeniser tokeniser64 = new org.jsoup.parser.Tokeniser(characterReader63);
        org.jsoup.parser.TokeniserState tokeniserState65 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser64.transition(tokeniserState65);
        org.jsoup.parser.Token.Comment comment67 = null;
        tokeniser64.commentPending = comment67;
        tokeniser64.emit('\ufffd');
        tokeniser64.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState72 = tokeniser64.getState();
        tokeniser64.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader75 = null;
        org.jsoup.parser.Tokeniser tokeniser76 = new org.jsoup.parser.Tokeniser(characterReader75);
        tokeniser76.createDoctypePending();
        tokeniser76.createDoctypePending();
        org.jsoup.parser.Token.Comment comment79 = null;
        tokeniser76.commentPending = comment79;
        org.jsoup.parser.Token.Doctype doctype81 = tokeniser76.doctypePending;
        org.jsoup.parser.Token.Tag tag82 = tokeniser76.tagPending;
        boolean boolean83 = tokeniser76.isTrackErrors();
        tokeniser76.emit("hi!");
        org.jsoup.parser.Token.Tag tag87 = tokeniser76.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader88 = null;
        org.jsoup.parser.Tokeniser tokeniser89 = new org.jsoup.parser.Tokeniser(characterReader88);
        tokeniser89.createDoctypePending();
        org.jsoup.parser.Token.Tag tag92 = tokeniser89.createTagPending(true);
        tokeniser76.emit((org.jsoup.parser.Token) tag92);
        tokeniser64.emit((org.jsoup.parser.Token) tag92);
        tokeniser52.tagPending = tag92;
        tokeniser1.tagPending = tag92;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNull(comment42);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(stringBuilder46);
        org.junit.Assert.assertEquals(stringBuilder46.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState53);
        org.junit.Assert.assertNotNull(tokeniserState62);
        org.junit.Assert.assertNotNull(tokeniserState65);
        org.junit.Assert.assertNotNull(tokeniserState72);
        org.junit.Assert.assertNotNull(doctype81);
        org.junit.Assert.assertNull(tag82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(tag87);
        org.junit.Assert.assertNotNull(tag92);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('\ufffd');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token4 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.createTagPending(true);
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char11 = tokeniser1.consumeCharacterReference((java.lang.Character) '\ufffd', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        tokeniser1.emitDoctypePending();
        boolean boolean5 = tokeniser1.isTrackErrors();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        boolean boolean7 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser9.transition(tokeniserState10);
        org.jsoup.parser.Token.Comment comment12 = null;
        tokeniser9.commentPending = comment12;
        tokeniser9.emit('\ufffd');
        tokeniser9.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser18.getState();
        org.jsoup.parser.Token.Tag tag22 = tokeniser18.createTagPending(false);
        tokeniser9.tagPending = tag22;
        tokeniser1.tagPending = tag22;
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        org.jsoup.parser.TokeniserState tokeniserState27 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser26.transition(tokeniserState27);
        org.jsoup.parser.Token.Comment comment29 = null;
        tokeniser26.commentPending = comment29;
        tokeniser26.emit('\ufffd');
        tokeniser26.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState34 = tokeniser26.getState();
        boolean boolean35 = tokeniser26.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        tokeniser37.createDoctypePending();
        tokeniser37.createDoctypePending();
        org.jsoup.parser.Token.Comment comment40 = null;
        tokeniser37.commentPending = comment40;
        org.jsoup.parser.Token.Doctype doctype42 = tokeniser37.doctypePending;
        tokeniser26.doctypePending = doctype42;
        tokeniser1.doctypePending = doctype42;
        org.jsoup.parser.Token token45 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit(token45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tokeniserState34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doctype42);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        boolean boolean12 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser15.transition(tokeniserState16);
        org.jsoup.parser.Token.Comment comment18 = null;
        tokeniser15.commentPending = comment18;
        tokeniser15.emit('\ufffd');
        tokeniser15.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser15.getState();
        boolean boolean24 = tokeniser15.currentNodeInHtmlNS();
        tokeniser15.emitDoctypePending();
        tokeniser15.emit("");
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        tokeniser29.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser29.getState();
        tokeniser29.createTempBuffer();
        tokeniser29.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        org.jsoup.parser.TokeniserState tokeniserState36 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser35.transition(tokeniserState36);
        org.jsoup.parser.Token.Comment comment38 = null;
        tokeniser35.commentPending = comment38;
        tokeniser35.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment42 = tokeniser35.commentPending;
        org.jsoup.parser.Token.Tag tag44 = tokeniser35.createTagPending(true);
        tokeniser29.tagPending = tag44;
        java.lang.StringBuilder stringBuilder46 = tokeniser29.dataBuffer;
        tokeniser15.dataBuffer = stringBuilder46;
        tokeniser1.dataBuffer = stringBuilder46;
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState50 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDash;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNull(comment42);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(stringBuilder46);
        org.junit.Assert.assertEquals(stringBuilder46.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState50);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.createTempBuffer();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser7.transition(tokeniserState8);
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser7.commentPending = comment10;
        tokeniser7.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment14 = tokeniser7.commentPending;
        org.jsoup.parser.Token.Tag tag16 = tokeniser7.createTagPending(true);
        tokeniser1.tagPending = tag16;
        org.jsoup.parser.Token.Tag tag18 = tokeniser1.tagPending;
        boolean boolean19 = tokeniser1.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        org.jsoup.parser.TokeniserState tokeniserState22 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser21.transition(tokeniserState22);
        org.jsoup.parser.Token.Comment comment24 = null;
        tokeniser21.commentPending = comment24;
        tokeniser21.emit('\ufffd');
        tokeniser21.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder30 = tokeniser21.dataBuffer;
        tokeniser21.acknowledgeSelfClosingFlag();
        tokeniser21.acknowledgeSelfClosingFlag();
        tokeniser21.emit('a');
        boolean boolean35 = tokeniser21.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype36 = tokeniser21.doctypePending;
        org.jsoup.parser.Token.Tag tag37 = tokeniser21.tagPending;
        tokeniser21.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader39);
        org.jsoup.parser.TokeniserState tokeniserState41 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser40.transition(tokeniserState41);
        org.jsoup.parser.Token.Comment comment43 = null;
        tokeniser40.commentPending = comment43;
        tokeniser40.emit('\ufffd');
        tokeniser40.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState48 = tokeniser40.getState();
        boolean boolean49 = tokeniser40.currentNodeInHtmlNS();
        tokeniser40.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype51 = tokeniser40.doctypePending;
        tokeniser21.doctypePending = doctype51;
        tokeniser1.doctypePending = doctype51;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNull(stringBuilder30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(doctype36);
        org.junit.Assert.assertNull(tag37);
        org.junit.Assert.assertNotNull(tokeniserState41);
        org.junit.Assert.assertNotNull(tokeniserState48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(doctype51);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        boolean boolean7 = tokeniser1.isTrackErrors();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        tokeniser1.transition(tokeniserState9);
        tokeniser1.emit('a');
        org.jsoup.parser.Token.Comment comment13 = tokeniser1.commentPending;
        java.lang.Class<?> wildcardClass14 = tokeniser1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNull(comment13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser11.getState();
        tokeniser11.createTempBuffer();
        tokeniser11.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser17.transition(tokeniserState18);
        org.jsoup.parser.Token.Comment comment20 = null;
        tokeniser17.commentPending = comment20;
        tokeniser17.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment24 = tokeniser17.commentPending;
        org.jsoup.parser.Token.Tag tag26 = tokeniser17.createTagPending(true);
        tokeniser11.tagPending = tag26;
        java.lang.StringBuilder stringBuilder28 = tokeniser11.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder28;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNull(comment24);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        org.jsoup.parser.TokeniserState tokeniserState3 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser2.transition(tokeniserState3);
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser2.commentPending = comment5;
        tokeniser2.emit('\ufffd');
        tokeniser2.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder11 = tokeniser2.dataBuffer;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.emit('a');
        boolean boolean16 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNull(stringBuilder11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        java.lang.StringBuilder stringBuilder11 = null;
        tokeniser1.dataBuffer = stringBuilder11;
        org.jsoup.parser.Token token13 = tokeniser1.read();
        org.jsoup.parser.TokeniserState tokeniserState14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(token13);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        boolean boolean7 = tokeniser1.isTrackErrors();
        tokeniser1.emitDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag9 = null;
        tokeniser1.tagPending = tag9;
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser13.transition(tokeniserState14);
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser13.commentPending = comment16;
        tokeniser13.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState11.read(tokeniser13, characterReader20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = tokeniser1.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedLessthanSign;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment9);
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapeStart;
        tokeniser1.transition(tokeniserState11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token13 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag9 = null;
        tokeniser1.tagPending = tag9;
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser13.transition(tokeniserState14);
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser13.commentPending = comment16;
        tokeniser13.emit('\ufffd');
        tokeniser13.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser13.getState();
        tokeniser13.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        tokeniser25.createDoctypePending();
        tokeniser25.createDoctypePending();
        org.jsoup.parser.Token.Comment comment28 = null;
        tokeniser25.commentPending = comment28;
        org.jsoup.parser.Token.Doctype doctype30 = tokeniser25.doctypePending;
        org.jsoup.parser.Token.Tag tag31 = tokeniser25.tagPending;
        boolean boolean32 = tokeniser25.isTrackErrors();
        tokeniser25.emit("hi!");
        org.jsoup.parser.Token.Tag tag36 = tokeniser25.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader37);
        tokeniser38.createDoctypePending();
        org.jsoup.parser.Token.Tag tag41 = tokeniser38.createTagPending(true);
        tokeniser25.emit((org.jsoup.parser.Token) tag41);
        tokeniser13.emit((org.jsoup.parser.Token) tag41);
        tokeniser1.tagPending = tag41;
        java.lang.Class<?> wildcardClass45 = tag41.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(doctype30);
        org.junit.Assert.assertNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser8.transition(tokeniserState9);
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser8.commentPending = comment11;
        tokeniser8.emit('\ufffd');
        tokeniser8.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser8.getState();
        boolean boolean17 = tokeniser8.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        tokeniser19.createDoctypePending();
        tokeniser19.createDoctypePending();
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser19.commentPending = comment22;
        org.jsoup.parser.Token.Doctype doctype24 = tokeniser19.doctypePending;
        tokeniser8.doctypePending = doctype24;
        tokeniser1.doctypePending = doctype24;
        org.jsoup.parser.Token.Comment comment27 = tokeniser1.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        org.jsoup.parser.TokeniserState tokeniserState31 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser30.transition(tokeniserState31);
        org.jsoup.parser.Token.Comment comment33 = null;
        tokeniser30.commentPending = comment33;
        tokeniser30.emit('\ufffd');
        tokeniser30.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder39 = tokeniser30.dataBuffer;
        tokeniser30.acknowledgeSelfClosingFlag();
        tokeniser30.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader42);
        tokeniser43.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState45 = tokeniser43.getState();
        tokeniser43.createTempBuffer();
        tokeniser43.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader48 = null;
        org.jsoup.parser.Tokeniser tokeniser49 = new org.jsoup.parser.Tokeniser(characterReader48);
        org.jsoup.parser.TokeniserState tokeniserState50 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser49.transition(tokeniserState50);
        org.jsoup.parser.Token.Comment comment52 = null;
        tokeniser49.commentPending = comment52;
        tokeniser49.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment56 = tokeniser49.commentPending;
        org.jsoup.parser.Token.Tag tag58 = tokeniser49.createTagPending(true);
        tokeniser43.tagPending = tag58;
        java.lang.StringBuilder stringBuilder60 = tokeniser43.dataBuffer;
        tokeniser30.dataBuffer = stringBuilder60;
        tokeniser30.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader64 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState28.read(tokeniser30, characterReader64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doctype24);
        org.junit.Assert.assertNull(comment27);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNull(stringBuilder39);
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertNotNull(tokeniserState50);
        org.junit.Assert.assertNull(comment56);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(stringBuilder60);
        org.junit.Assert.assertEquals(stringBuilder60.toString(), "");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Tag tag5 = tokeniser1.createTagPending(true);
        tokeniser1.emit('4');
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser1.getState();
        java.lang.Class<?> wildcardClass9 = tokeniserState8.getClass();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AttributeValue_doubleQuoted;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.createDoctypePending();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Tag tag5 = tokeniser2.tagPending;
        org.jsoup.parser.CharacterReader characterReader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNull(tag5);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment4 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Doctype doctype5 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char8 = tokeniser1.consumeCharacterReference((java.lang.Character) '\ufffd', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment4);
        org.junit.Assert.assertNull(doctype5);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser1.transition(tokeniserState9);
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment12 = tokeniser1.commentPending;
        tokeniser1.emitCommentPending();
        org.jsoup.parser.Token.Tag tag15 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser17.transition(tokeniserState18);
        tokeniser17.emit("hi!");
        org.jsoup.parser.Token.Comment comment22 = tokeniser17.commentPending;
        java.lang.StringBuilder stringBuilder23 = null;
        tokeniser17.dataBuffer = stringBuilder23;
        tokeniser17.setTrackErrors(false);
        tokeniser17.emit(' ');
        tokeniser17.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        org.jsoup.parser.TokeniserState tokeniserState32 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser31.transition(tokeniserState32);
        tokeniser31.emit("hi!");
        org.jsoup.parser.Token.Comment comment36 = null;
        tokeniser31.commentPending = comment36;
        tokeniser31.createCommentPending();
        org.jsoup.parser.Token.Comment comment39 = tokeniser31.commentPending;
        tokeniser17.commentPending = comment39;
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader41);
        org.jsoup.parser.TokeniserState tokeniserState43 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser42.transition(tokeniserState43);
        org.jsoup.parser.Token.Comment comment45 = null;
        tokeniser42.commentPending = comment45;
        tokeniser42.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader49 = null;
        org.jsoup.parser.Tokeniser tokeniser50 = new org.jsoup.parser.Tokeniser(characterReader49);
        org.jsoup.parser.TokeniserState tokeniserState51 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser50.transition(tokeniserState51);
        org.jsoup.parser.Token.Doctype doctype53 = tokeniser50.doctypePending;
        tokeniser50.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader56 = null;
        org.jsoup.parser.Tokeniser tokeniser57 = new org.jsoup.parser.Tokeniser(characterReader56);
        org.jsoup.parser.TokeniserState tokeniserState58 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser57.transition(tokeniserState58);
        org.jsoup.parser.Token.Comment comment60 = null;
        tokeniser57.commentPending = comment60;
        tokeniser57.emit('\ufffd');
        tokeniser57.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState65 = tokeniser57.getState();
        boolean boolean66 = tokeniser57.currentNodeInHtmlNS();
        tokeniser57.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype68 = tokeniser57.doctypePending;
        tokeniser50.doctypePending = doctype68;
        tokeniser42.doctypePending = doctype68;
        tokeniser17.emit((org.jsoup.parser.Token) doctype68);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit((org.jsoup.parser.Token) doctype68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(comment12);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNull(comment22);
        org.junit.Assert.assertNotNull(tokeniserState32);
        org.junit.Assert.assertNotNull(comment39);
        org.junit.Assert.assertNotNull(tokeniserState43);
        org.junit.Assert.assertNotNull(tokeniserState51);
        org.junit.Assert.assertNull(doctype53);
        org.junit.Assert.assertNotNull(tokeniserState58);
        org.junit.Assert.assertNotNull(tokeniserState65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(doctype68);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BeforeDoctypePublicIdentifier;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.createDoctypePending();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser2.commentPending = comment5;
        tokeniser2.acknowledgeSelfClosingFlag();
        java.lang.StringBuilder stringBuilder8 = tokeniser2.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        tokeniser10.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser10.getState();
        org.jsoup.parser.Token.Tag tag14 = tokeniser10.createTagPending(false);
        tokeniser2.emit((org.jsoup.parser.Token) tag14);
        tokeniser2.emit('4');
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        tokeniser19.createDoctypePending();
        tokeniser19.createDoctypePending();
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser19.commentPending = comment22;
        org.jsoup.parser.Token.Doctype doctype24 = tokeniser19.doctypePending;
        org.jsoup.parser.Token.Tag tag25 = tokeniser19.tagPending;
        tokeniser19.createCommentPending();
        tokeniser19.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        org.jsoup.parser.TokeniserState tokeniserState30 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser29.transition(tokeniserState30);
        org.jsoup.parser.Token.Tag tag32 = tokeniser29.tagPending;
        org.jsoup.parser.Token.Tag tag34 = tokeniser29.createTagPending(false);
        tokeniser19.tagPending = tag34;
        tokeniser2.tagPending = tag34;
        org.jsoup.parser.CharacterReader characterReader37 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNull(stringBuilder8);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(doctype24);
        org.junit.Assert.assertNull(tag25);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertNull(tag32);
        org.junit.Assert.assertNotNull(tag34);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.createDoctypePending();
        boolean boolean13 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        tokeniser15.createDoctypePending();
        org.jsoup.parser.Token.Comment comment17 = tokeniser15.commentPending;
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        org.jsoup.parser.TokeniserState tokeniserState20 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser19.transition(tokeniserState20);
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser19.commentPending = comment22;
        tokeniser19.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment26 = tokeniser19.commentPending;
        org.jsoup.parser.Token.Tag tag28 = tokeniser19.createTagPending(true);
        tokeniser15.emit((org.jsoup.parser.Token) tag28);
        tokeniser1.emit((org.jsoup.parser.Token) tag28);
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser32.transition(tokeniserState33);
        org.jsoup.parser.Token.Comment comment35 = null;
        tokeniser32.commentPending = comment35;
        tokeniser32.emit('\ufffd');
        tokeniser32.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState40 = tokeniser32.getState();
        boolean boolean41 = tokeniser32.currentNodeInHtmlNS();
        tokeniser32.emitDoctypePending();
        tokeniser32.emit("");
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader45);
        tokeniser46.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState48 = tokeniser46.getState();
        tokeniser46.createTempBuffer();
        tokeniser46.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader51);
        org.jsoup.parser.TokeniserState tokeniserState53 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser52.transition(tokeniserState53);
        org.jsoup.parser.Token.Comment comment55 = null;
        tokeniser52.commentPending = comment55;
        tokeniser52.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment59 = tokeniser52.commentPending;
        org.jsoup.parser.Token.Tag tag61 = tokeniser52.createTagPending(true);
        tokeniser46.tagPending = tag61;
        java.lang.StringBuilder stringBuilder63 = tokeniser46.dataBuffer;
        tokeniser32.dataBuffer = stringBuilder63;
        tokeniser1.dataBuffer = stringBuilder63;
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Tag tag69 = tokeniser1.createTagPending(false);
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(comment17);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNull(comment26);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tokeniserState48);
        org.junit.Assert.assertNotNull(tokeniserState53);
        org.junit.Assert.assertNull(comment59);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(stringBuilder63);
        org.junit.Assert.assertEquals(stringBuilder63.toString(), "");
        org.junit.Assert.assertNotNull(tag69);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char9 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser1.doctypePending;
        java.lang.StringBuilder stringBuilder13 = tokeniser1.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState15 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doctype12);
        org.junit.Assert.assertNull(stringBuilder13);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(tokeniserState15);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser1.getState();
        org.jsoup.parser.Token.Tag tag10 = tokeniser1.createTagPending(true);
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        tokeniser13.createTempBuffer();
        tokeniser13.createCommentPending();
        boolean boolean16 = tokeniser13.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser18.transition(tokeniserState19);
        tokeniser18.emit("hi!");
        org.jsoup.parser.Token.Comment comment23 = tokeniser18.commentPending;
        java.lang.StringBuilder stringBuilder24 = null;
        tokeniser18.dataBuffer = stringBuilder24;
        tokeniser18.setTrackErrors(false);
        tokeniser18.emit(' ');
        tokeniser18.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser32.transition(tokeniserState33);
        tokeniser32.emit("hi!");
        org.jsoup.parser.Token.Comment comment37 = null;
        tokeniser32.commentPending = comment37;
        tokeniser32.createCommentPending();
        org.jsoup.parser.Token.Comment comment40 = tokeniser32.commentPending;
        tokeniser18.commentPending = comment40;
        tokeniser13.commentPending = comment40;
        tokeniser1.commentPending = comment40;
        org.jsoup.parser.CharacterReader characterReader44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader44);
        tokeniser45.createDoctypePending();
        tokeniser45.createDoctypePending();
        org.jsoup.parser.Token.Comment comment48 = null;
        tokeniser45.commentPending = comment48;
        tokeniser45.createDoctypePending();
        tokeniser45.emit("");
        tokeniser45.emit('#');
        org.jsoup.parser.TokeniserState tokeniserState55 = tokeniser45.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(comment23);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(comment40);
        org.junit.Assert.assertNotNull(tokeniserState55);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser1.transition(tokeniserState12);
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState17 = org.jsoup.parser.TokeniserState.BeforeAttributeName;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tokeniserState17);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.RCDATAEndTagName;
        tokeniser1.transition(tokeniserState12);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doctype12);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        tokeniser13.createDoctypePending();
        tokeniser13.createDoctypePending();
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser13.commentPending = comment16;
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser13.doctypePending;
        org.jsoup.parser.Token.Tag tag19 = tokeniser13.tagPending;
        boolean boolean20 = tokeniser13.isTrackErrors();
        tokeniser13.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser24.transition(tokeniserState25);
        org.jsoup.parser.Token.Comment comment27 = null;
        tokeniser24.commentPending = comment27;
        tokeniser24.emit('\ufffd');
        tokeniser24.createDoctypePending();
        tokeniser24.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        tokeniser34.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState36 = tokeniser34.getState();
        tokeniser34.createTempBuffer();
        tokeniser34.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader39);
        org.jsoup.parser.TokeniserState tokeniserState41 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser40.transition(tokeniserState41);
        org.jsoup.parser.Token.Comment comment43 = null;
        tokeniser40.commentPending = comment43;
        tokeniser40.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment47 = tokeniser40.commentPending;
        org.jsoup.parser.Token.Tag tag49 = tokeniser40.createTagPending(true);
        tokeniser34.tagPending = tag49;
        java.lang.StringBuilder stringBuilder51 = tokeniser34.dataBuffer;
        tokeniser24.dataBuffer = stringBuilder51;
        org.jsoup.parser.Token.Doctype doctype53 = tokeniser24.doctypePending;
        tokeniser13.doctypePending = doctype53;
        tokeniser1.doctypePending = doctype53;
        org.jsoup.parser.Token.Tag tag56 = tokeniser1.tagPending;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(doctype18);
        org.junit.Assert.assertNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNotNull(tokeniserState41);
        org.junit.Assert.assertNull(comment47);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
        org.junit.Assert.assertNotNull(doctype53);
        org.junit.Assert.assertNull(tag56);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.emit('#');
        boolean boolean14 = tokeniser1.isTrackErrors();
        java.lang.StringBuilder stringBuilder15 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Tag tag17 = tokeniser1.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        org.jsoup.parser.TokeniserState tokeniserState20 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser19.transition(tokeniserState20);
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser19.commentPending = comment22;
        tokeniser19.emit('\ufffd');
        tokeniser19.setTrackErrors(false);
        tokeniser19.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser19.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(stringBuilder15);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(tokeniserState29);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser1.transition(tokeniserState12);
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        tokeniser17.createDoctypePending();
        tokeniser17.createDoctypePending();
        org.jsoup.parser.Token.Comment comment20 = null;
        tokeniser17.commentPending = comment20;
        org.jsoup.parser.Token.Tag tag22 = tokeniser17.tagPending;
        java.lang.StringBuilder stringBuilder23 = tokeniser17.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState24 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser17.transition(tokeniserState24);
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        org.jsoup.parser.TokeniserState tokeniserState28 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser27.transition(tokeniserState28);
        org.jsoup.parser.Token.Comment comment30 = null;
        tokeniser27.commentPending = comment30;
        tokeniser27.emit('\ufffd');
        tokeniser27.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState35 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser27.transition(tokeniserState35);
        tokeniser27.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment38 = tokeniser27.commentPending;
        tokeniser17.commentPending = comment38;
        tokeniser1.commentPending = comment38;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader42);
        org.jsoup.parser.TokeniserState tokeniserState44 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser43.transition(tokeniserState44);
        org.jsoup.parser.Token.Comment comment46 = null;
        tokeniser43.commentPending = comment46;
        tokeniser43.emit('\ufffd');
        tokeniser43.setTrackErrors(false);
        tokeniser43.createCommentPending();
        org.jsoup.parser.Token.Tag tag54 = tokeniser43.createTagPending(false);
        boolean boolean55 = tokeniser43.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState56 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_doubleQuoted;
        tokeniser43.eofError(tokeniserState56);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNull(tag22);
        org.junit.Assert.assertNull(stringBuilder23);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNotNull(comment38);
        org.junit.Assert.assertNotNull(tokeniserState44);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(tokeniserState56);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        tokeniser1.createCommentPending();
        tokeniser1.createCommentPending();
        java.lang.StringBuilder stringBuilder13 = tokeniser1.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNull(stringBuilder13);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.createDoctypePending();
        tokeniser5.createDoctypePending();
        org.jsoup.parser.Token.Comment comment8 = null;
        tokeniser5.commentPending = comment8;
        org.jsoup.parser.Token.Tag tag10 = tokeniser5.tagPending;
        java.lang.StringBuilder stringBuilder11 = tokeniser5.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser5.transition(tokeniserState12);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(tag10);
        org.junit.Assert.assertNull(stringBuilder11);
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Tag tag5 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        tokeniser7.createDoctypePending();
        tokeniser7.createDoctypePending();
        org.jsoup.parser.Token.Tag tag10 = tokeniser7.tagPending;
        java.lang.StringBuilder stringBuilder11 = null;
        tokeniser7.dataBuffer = stringBuilder11;
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        org.jsoup.parser.TokeniserState tokeniserState15 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser14.transition(tokeniserState15);
        org.jsoup.parser.Token.Comment comment17 = null;
        tokeniser14.commentPending = comment17;
        tokeniser14.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        org.jsoup.parser.TokeniserState tokeniserState23 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser22.transition(tokeniserState23);
        org.jsoup.parser.Token.Doctype doctype25 = tokeniser22.doctypePending;
        tokeniser22.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        org.jsoup.parser.TokeniserState tokeniserState30 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser29.transition(tokeniserState30);
        org.jsoup.parser.Token.Comment comment32 = null;
        tokeniser29.commentPending = comment32;
        tokeniser29.emit('\ufffd');
        tokeniser29.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser29.getState();
        boolean boolean38 = tokeniser29.currentNodeInHtmlNS();
        tokeniser29.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype40 = tokeniser29.doctypePending;
        tokeniser22.doctypePending = doctype40;
        tokeniser14.doctypePending = doctype40;
        tokeniser7.emit((org.jsoup.parser.Token) doctype40);
        org.jsoup.parser.Token token44 = tokeniser7.read();
        tokeniser1.emit(token44);
        org.jsoup.parser.Token.Doctype doctype46 = tokeniser1.doctypePending;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader48 = null;
        org.jsoup.parser.Tokeniser tokeniser49 = new org.jsoup.parser.Tokeniser(characterReader48);
        org.jsoup.parser.TokeniserState tokeniserState50 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser49.transition(tokeniserState50);
        org.jsoup.parser.Token.Comment comment52 = null;
        tokeniser49.commentPending = comment52;
        tokeniser49.emit('\ufffd');
        tokeniser49.setTrackErrors(false);
        tokeniser49.createCommentPending();
        org.jsoup.parser.Token.Tag tag60 = tokeniser49.createTagPending(false);
        boolean boolean61 = tokeniser49.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState62 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_doubleQuoted;
        tokeniser49.eofError(tokeniserState62);
        org.jsoup.parser.TokeniserState tokeniserState64 = org.jsoup.parser.TokeniserState.CharacterReferenceInRcdata;
        tokeniser49.eofError(tokeniserState64);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(tag10);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNull(doctype25);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doctype40);
        org.junit.Assert.assertNotNull(token44);
        org.junit.Assert.assertNull(doctype46);
        org.junit.Assert.assertNotNull(tokeniserState50);
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(tokeniserState62);
        org.junit.Assert.assertNotNull(tokeniserState64);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser1.doctypePending;
        java.lang.StringBuilder stringBuilder13 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        org.jsoup.parser.TokeniserState tokeniserState17 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser16.transition(tokeniserState17);
        tokeniser16.emit("hi!");
        org.jsoup.parser.Token.Comment comment21 = null;
        tokeniser16.commentPending = comment21;
        tokeniser16.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState25 = tokeniser16.getState();
        tokeniser16.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype27 = tokeniser16.doctypePending;
        org.jsoup.parser.Token.Doctype doctype28 = tokeniser16.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser16.getState();
        org.jsoup.parser.Token.Tag tag31 = tokeniser16.createTagPending(true);
        tokeniser1.tagPending = tag31;
        java.lang.Class<?> wildcardClass33 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doctype12);
        org.junit.Assert.assertNull(stringBuilder13);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNull(doctype27);
        org.junit.Assert.assertNull(doctype28);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment8 = tokeniser1.commentPending;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        tokeniser12.emit('\ufffd');
        tokeniser12.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser18.transition(tokeniserState19);
        org.jsoup.parser.Token.Comment comment21 = null;
        tokeniser18.commentPending = comment21;
        tokeniser18.emit('\ufffd');
        tokeniser18.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder27 = tokeniser18.dataBuffer;
        tokeniser18.acknowledgeSelfClosingFlag();
        boolean boolean29 = tokeniser18.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag30 = tokeniser18.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser18.getState();
        org.jsoup.parser.Token.Doctype doctype32 = tokeniser18.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.PLAINTEXT;
        tokeniser18.error(tokeniserState33);
        tokeniser12.eofError(tokeniserState33);
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        org.jsoup.parser.TokeniserState tokeniserState38 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser37.transition(tokeniserState38);
        org.jsoup.parser.Token.Comment comment40 = null;
        tokeniser37.commentPending = comment40;
        tokeniser37.emit('\ufffd');
        tokeniser37.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState45 = tokeniser37.getState();
        boolean boolean46 = tokeniser37.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState47 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapeStart;
        tokeniser37.transition(tokeniserState47);
        tokeniser12.eofError(tokeniserState47);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNull(comment8);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(stringBuilder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(tag30);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNull(doctype32);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(tokeniserState38);
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(tokeniserState47);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.emit('#');
        boolean boolean14 = tokeniser1.isTrackErrors();
        java.lang.StringBuilder stringBuilder15 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Tag tag17 = tokeniser1.createTagPending(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(stringBuilder15);
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        java.lang.StringBuilder stringBuilder11 = null;
        tokeniser1.dataBuffer = stringBuilder11;
        tokeniser1.setTrackErrors(true);
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        tokeniser17.createDoctypePending();
        tokeniser17.createDoctypePending();
        org.jsoup.parser.Token.Comment comment20 = null;
        tokeniser17.commentPending = comment20;
        tokeniser17.createDoctypePending();
        tokeniser17.emit("");
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        org.jsoup.parser.TokeniserState tokeniserState27 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser26.transition(tokeniserState27);
        tokeniser26.emit("hi!");
        org.jsoup.parser.Token.Tag tag31 = tokeniser26.tagPending;
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        tokeniser33.createDoctypePending();
        tokeniser33.createDoctypePending();
        org.jsoup.parser.Token.Comment comment36 = null;
        tokeniser33.commentPending = comment36;
        tokeniser33.createDoctypePending();
        tokeniser33.emit("");
        tokeniser33.createDoctypePending();
        org.jsoup.parser.Token.Comment comment42 = null;
        tokeniser33.commentPending = comment42;
        org.jsoup.parser.TokeniserState tokeniserState44 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser33.transition(tokeniserState44);
        tokeniser26.transition(tokeniserState44);
        tokeniser17.transition(tokeniserState44);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNull(tag31);
        org.junit.Assert.assertNotNull(tokeniserState44);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BeforeDoctypeSystemIdentifier;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.createDoctypePending();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser2.commentPending = comment5;
        boolean boolean7 = tokeniser2.isTrackErrors();
        boolean boolean8 = tokeniser2.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('a');
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag17 = tokeniser1.tagPending;
        tokeniser1.createDoctypePending();
        tokeniser1.emit('\ufffd');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token21 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNull(tag17);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser1.getState();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState6 = org.jsoup.parser.TokeniserState.BeforeAttributeValue;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tokeniserState6);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        boolean boolean7 = tokeniser1.isTrackErrors();
        org.jsoup.parser.Token.Doctype doctype8 = tokeniser1.doctypePending;
        java.lang.Class<?> wildcardClass9 = doctype8.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doctype8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        java.lang.StringBuilder stringBuilder3 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.createDoctypePending();
        tokeniser5.createDoctypePending();
        org.jsoup.parser.Token.Comment comment8 = null;
        tokeniser5.commentPending = comment8;
        tokeniser5.acknowledgeSelfClosingFlag();
        java.lang.StringBuilder stringBuilder11 = tokeniser5.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser13.transition(tokeniserState14);
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser13.commentPending = comment16;
        tokeniser13.emit('\ufffd');
        tokeniser13.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder22 = tokeniser13.dataBuffer;
        tokeniser13.acknowledgeSelfClosingFlag();
        tokeniser13.acknowledgeSelfClosingFlag();
        tokeniser13.emit('a');
        boolean boolean27 = tokeniser13.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype28 = tokeniser13.doctypePending;
        org.jsoup.parser.Token.Tag tag29 = tokeniser13.tagPending;
        tokeniser13.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser32.transition(tokeniserState33);
        org.jsoup.parser.Token.Comment comment35 = null;
        tokeniser32.commentPending = comment35;
        tokeniser32.emit('\ufffd');
        tokeniser32.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState40 = tokeniser32.getState();
        boolean boolean41 = tokeniser32.currentNodeInHtmlNS();
        tokeniser32.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype43 = tokeniser32.doctypePending;
        tokeniser13.doctypePending = doctype43;
        tokeniser5.doctypePending = doctype43;
        tokeniser1.emit((org.jsoup.parser.Token) doctype43);
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader48 = null;
        org.jsoup.parser.Tokeniser tokeniser49 = new org.jsoup.parser.Tokeniser(characterReader48);
        org.jsoup.parser.TokeniserState tokeniserState50 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser49.transition(tokeniserState50);
        tokeniser49.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader54 = null;
        org.jsoup.parser.Tokeniser tokeniser55 = new org.jsoup.parser.Tokeniser(characterReader54);
        org.jsoup.parser.TokeniserState tokeniserState56 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser55.transition(tokeniserState56);
        org.jsoup.parser.Token.Comment comment58 = null;
        tokeniser55.commentPending = comment58;
        tokeniser55.emit('\ufffd');
        tokeniser55.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader63 = null;
        org.jsoup.parser.Tokeniser tokeniser64 = new org.jsoup.parser.Tokeniser(characterReader63);
        tokeniser64.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState66 = tokeniser64.getState();
        org.jsoup.parser.Token.Tag tag68 = tokeniser64.createTagPending(false);
        tokeniser55.tagPending = tag68;
        tokeniser49.emit((org.jsoup.parser.Token) tag68);
        org.jsoup.parser.TokeniserState tokeniserState71 = tokeniser49.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringBuilder3);
        org.junit.Assert.assertNull(stringBuilder11);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNull(stringBuilder22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(doctype28);
        org.junit.Assert.assertNull(tag29);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(doctype43);
        org.junit.Assert.assertNotNull(tokeniserState50);
        org.junit.Assert.assertNotNull(tokeniserState56);
        org.junit.Assert.assertNotNull(tokeniserState66);
        org.junit.Assert.assertNotNull(tag68);
        org.junit.Assert.assertNotNull(tokeniserState71);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.createTempBuffer();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser7.transition(tokeniserState8);
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser7.commentPending = comment10;
        tokeniser7.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment14 = tokeniser7.commentPending;
        org.jsoup.parser.Token.Tag tag16 = tokeniser7.createTagPending(true);
        tokeniser1.tagPending = tag16;
        java.lang.StringBuilder stringBuilder18 = tokeniser1.dataBuffer;
        tokeniser1.emit('\ufffd');
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        tokeniser1.emit(' ');
        org.jsoup.parser.Token.Tag tag11 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token12 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(tag11);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser1.transition(tokeniserState9);
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment12 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        tokeniser1.createTempBuffer();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(comment12);
        org.junit.Assert.assertNull(tag13);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.createTagPending(true);
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Comment comment8 = tokeniser1.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(comment8);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.emit('#');
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser12.transition(tokeniserState13);
        org.jsoup.parser.Token.Comment comment15 = null;
        tokeniser12.commentPending = comment15;
        tokeniser12.emit('\ufffd');
        tokeniser12.createDoctypePending();
        org.jsoup.parser.Token.Tag tag20 = null;
        tokeniser12.tagPending = tag20;
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser12.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState22);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Comment comment7 = null;
        tokeniser1.commentPending = comment7;
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.BeforeDoctypeSystemIdentifier;
        tokeniser1.transition(tokeniserState11);
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscaped;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNull(doctype13);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        java.lang.StringBuilder stringBuilder3 = tokeniser1.dataBuffer;
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        tokeniser6.emit('\ufffd');
        tokeniser6.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser12.transition(tokeniserState13);
        org.jsoup.parser.Token.Comment comment15 = null;
        tokeniser12.commentPending = comment15;
        tokeniser12.emit('\ufffd');
        tokeniser12.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder21 = tokeniser12.dataBuffer;
        tokeniser12.acknowledgeSelfClosingFlag();
        boolean boolean23 = tokeniser12.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag24 = tokeniser12.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState25 = tokeniser12.getState();
        org.jsoup.parser.Token.Doctype doctype26 = tokeniser12.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState27 = org.jsoup.parser.TokeniserState.PLAINTEXT;
        tokeniser12.error(tokeniserState27);
        tokeniser6.eofError(tokeniserState27);
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        org.jsoup.parser.TokeniserState tokeniserState32 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser31.transition(tokeniserState32);
        org.jsoup.parser.Token.Comment comment34 = null;
        tokeniser31.commentPending = comment34;
        tokeniser31.emit('\ufffd');
        tokeniser31.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState39 = tokeniser31.getState();
        boolean boolean40 = tokeniser31.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState41 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapeStart;
        tokeniser31.transition(tokeniserState41);
        tokeniser6.eofError(tokeniserState41);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringBuilder3);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNull(stringBuilder21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(tag24);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNull(doctype26);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tokeniserState32);
        org.junit.Assert.assertNotNull(tokeniserState39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(tokeniserState41);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Tag tag5 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        tokeniser7.createDoctypePending();
        tokeniser7.createDoctypePending();
        org.jsoup.parser.Token.Tag tag10 = tokeniser7.tagPending;
        java.lang.StringBuilder stringBuilder11 = null;
        tokeniser7.dataBuffer = stringBuilder11;
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        org.jsoup.parser.TokeniserState tokeniserState15 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser14.transition(tokeniserState15);
        org.jsoup.parser.Token.Comment comment17 = null;
        tokeniser14.commentPending = comment17;
        tokeniser14.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        org.jsoup.parser.TokeniserState tokeniserState23 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser22.transition(tokeniserState23);
        org.jsoup.parser.Token.Doctype doctype25 = tokeniser22.doctypePending;
        tokeniser22.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        org.jsoup.parser.TokeniserState tokeniserState30 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser29.transition(tokeniserState30);
        org.jsoup.parser.Token.Comment comment32 = null;
        tokeniser29.commentPending = comment32;
        tokeniser29.emit('\ufffd');
        tokeniser29.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser29.getState();
        boolean boolean38 = tokeniser29.currentNodeInHtmlNS();
        tokeniser29.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype40 = tokeniser29.doctypePending;
        tokeniser22.doctypePending = doctype40;
        tokeniser14.doctypePending = doctype40;
        tokeniser7.emit((org.jsoup.parser.Token) doctype40);
        org.jsoup.parser.Token token44 = tokeniser7.read();
        tokeniser1.emit(token44);
        org.jsoup.parser.Token.Doctype doctype46 = tokeniser1.doctypePending;
        org.jsoup.parser.Token token47 = tokeniser1.read();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(tag10);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNull(doctype25);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doctype40);
        org.junit.Assert.assertNotNull(token44);
        org.junit.Assert.assertNull(doctype46);
        org.junit.Assert.assertNotNull(token47);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createTempBuffer();
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Tag tag5 = tokeniser1.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        tokeniser7.createDoctypePending();
        tokeniser7.createDoctypePending();
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser7.commentPending = comment10;
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser7.doctypePending;
        org.jsoup.parser.Token.Tag tag13 = tokeniser7.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser7.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(doctype12);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser1.doctypePending;
        java.lang.StringBuilder stringBuilder13 = tokeniser1.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doctype12);
        org.junit.Assert.assertNull(stringBuilder13);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser1.transition(tokeniserState9);
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment12 = tokeniser1.commentPending;
        tokeniser1.emitCommentPending();
        org.jsoup.parser.Token.Tag tag15 = tokeniser1.createTagPending(true);
        java.lang.Class<?> wildcardClass16 = tag15.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(comment12);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser11.transition(tokeniserState12);
        tokeniser11.emit("hi!");
        org.jsoup.parser.Token.Tag tag16 = tokeniser11.tagPending;
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.createDoctypePending();
        tokeniser18.createDoctypePending();
        org.jsoup.parser.Token.Comment comment21 = null;
        tokeniser18.commentPending = comment21;
        tokeniser18.createDoctypePending();
        tokeniser18.emit("");
        tokeniser18.createDoctypePending();
        org.jsoup.parser.Token.Comment comment27 = null;
        tokeniser18.commentPending = comment27;
        org.jsoup.parser.TokeniserState tokeniserState29 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser18.transition(tokeniserState29);
        tokeniser11.transition(tokeniserState29);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNull(tag16);
        org.junit.Assert.assertNotNull(tokeniserState29);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        boolean boolean7 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser9.transition(tokeniserState10);
        org.jsoup.parser.Token.Comment comment12 = null;
        tokeniser9.commentPending = comment12;
        tokeniser9.emit('\ufffd');
        tokeniser9.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser18.getState();
        org.jsoup.parser.Token.Tag tag22 = tokeniser18.createTagPending(false);
        tokeniser9.tagPending = tag22;
        tokeniser1.tagPending = tag22;
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.CharacterReferenceInRcdata;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(tokeniserState25);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        tokeniser1.emitDoctypePending();
        tokeniser1.emit("");
        org.jsoup.parser.TokeniserState tokeniserState7 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState7);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser1.transition(tokeniserState12);
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag17 = tokeniser1.tagPending;
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEnd;
        tokeniser1.transition(tokeniserState19);
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        tokeniser24.createDoctypePending();
        tokeniser24.createDoctypePending();
        org.jsoup.parser.Token.Comment comment27 = null;
        tokeniser24.commentPending = comment27;
        org.jsoup.parser.Token.Doctype doctype29 = tokeniser24.doctypePending;
        org.jsoup.parser.Token.Tag tag30 = tokeniser24.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser24.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNull(tag17);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(doctype29);
        org.junit.Assert.assertNull(tag30);
        org.junit.Assert.assertNotNull(tokeniserState31);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        boolean boolean12 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser1.getState();
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag16 = null;
        tokeniser1.tagPending = tag16;
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token.Doctype doctype20 = tokeniser1.doctypePending;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNull(doctype20);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('a');
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag17 = tokeniser1.tagPending;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype19 = tokeniser1.doctypePending;
        java.lang.Class<?> wildcardClass20 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNull(tag17);
        org.junit.Assert.assertNotNull(doctype19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag14 = tokeniser1.createTagPending(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        tokeniser1.emitDoctypePending();
        tokeniser1.emit("");
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser12.transition(tokeniserState13);
        org.jsoup.parser.Token.Comment comment15 = null;
        tokeniser12.commentPending = comment15;
        tokeniser12.emit('\ufffd');
        tokeniser12.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser12.getState();
        boolean boolean21 = tokeniser12.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype22 = tokeniser12.doctypePending;
        org.jsoup.parser.Token.Doctype doctype23 = tokeniser12.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser12.getState();
        tokeniser1.transition(tokeniserState24);
        java.lang.Class<?> wildcardClass26 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doctype22);
        org.junit.Assert.assertNotNull(doctype23);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        java.lang.Class<?> wildcardClass8 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDash;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.tagPending;
        java.lang.StringBuilder stringBuilder5 = null;
        tokeniser1.dataBuffer = stringBuilder5;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser8.transition(tokeniserState9);
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser8.commentPending = comment11;
        tokeniser8.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        org.jsoup.parser.TokeniserState tokeniserState17 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser16.transition(tokeniserState17);
        org.jsoup.parser.Token.Doctype doctype19 = tokeniser16.doctypePending;
        tokeniser16.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        org.jsoup.parser.TokeniserState tokeniserState24 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser23.transition(tokeniserState24);
        org.jsoup.parser.Token.Comment comment26 = null;
        tokeniser23.commentPending = comment26;
        tokeniser23.emit('\ufffd');
        tokeniser23.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser23.getState();
        boolean boolean32 = tokeniser23.currentNodeInHtmlNS();
        tokeniser23.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype34 = tokeniser23.doctypePending;
        tokeniser16.doctypePending = doctype34;
        tokeniser8.doctypePending = doctype34;
        tokeniser1.emit((org.jsoup.parser.Token) doctype34);
        org.jsoup.parser.Token token38 = tokeniser1.read();
        org.jsoup.parser.TokeniserState tokeniserState39 = org.jsoup.parser.TokeniserState.Rawtext;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNull(doctype19);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(doctype34);
        org.junit.Assert.assertNotNull(token38);
        org.junit.Assert.assertNotNull(tokeniserState39);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.createDoctypePending();
        tokeniser8.createDoctypePending();
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser8.commentPending = comment11;
        tokeniser8.createDoctypePending();
        tokeniser8.emit("");
        tokeniser8.createDoctypePending();
        org.jsoup.parser.Token.Comment comment17 = null;
        tokeniser8.commentPending = comment17;
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser8.transition(tokeniserState19);
        tokeniser1.transition(tokeniserState19);
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser1.getState();
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Tag tag24 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNull(tag24);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        java.lang.StringBuilder stringBuilder6 = tokeniser1.dataBuffer;
        tokeniser1.emitDoctypePending();
        java.lang.StringBuilder stringBuilder8 = tokeniser1.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNull(stringBuilder8);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser1.transition(tokeniserState9);
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment12 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser15.transition(tokeniserState16);
        tokeniser15.emit("hi!");
        org.jsoup.parser.Token.Comment comment20 = tokeniser15.commentPending;
        org.jsoup.parser.Token.Comment comment21 = null;
        tokeniser15.commentPending = comment21;
        tokeniser15.emit('\ufffd');
        org.jsoup.parser.Token.Tag tag25 = tokeniser15.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState26 = org.jsoup.parser.TokeniserState.CommentStartDash;
        tokeniser15.transition(tokeniserState26);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(comment12);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNull(comment20);
        org.junit.Assert.assertNull(tag25);
        org.junit.Assert.assertNotNull(tokeniserState26);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser1.getState();
        org.jsoup.parser.Token.Tag tag10 = tokeniser1.createTagPending(true);
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token12 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        boolean boolean7 = tokeniser1.isTrackErrors();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        tokeniser1.transition(tokeniserState9);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        tokeniser13.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser13.getState();
        tokeniser13.createTempBuffer();
        tokeniser13.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        org.jsoup.parser.TokeniserState tokeniserState20 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser19.transition(tokeniserState20);
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser19.commentPending = comment22;
        tokeniser19.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment26 = tokeniser19.commentPending;
        org.jsoup.parser.Token.Tag tag28 = tokeniser19.createTagPending(true);
        tokeniser13.tagPending = tag28;
        java.lang.StringBuilder stringBuilder30 = tokeniser13.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder30;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token32 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNull(comment26);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser1.dataBuffer = stringBuilder7;
        tokeniser1.setTrackErrors(false);
        tokeniser1.emit(' ');
        boolean boolean13 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.RawtextEndTagOpen;
        tokeniser1.error(tokeniserState14);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser1.transition(tokeniserState12);
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.createDoctypePending();
        tokeniser18.createDoctypePending();
        org.jsoup.parser.Token.Comment comment21 = null;
        tokeniser18.commentPending = comment21;
        tokeniser18.acknowledgeSelfClosingFlag();
        tokeniser18.emitDoctypePending();
        tokeniser18.emit('#');
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        org.jsoup.parser.TokeniserState tokeniserState29 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser28.transition(tokeniserState29);
        org.jsoup.parser.Token.Comment comment31 = null;
        tokeniser28.commentPending = comment31;
        tokeniser28.emit('\ufffd');
        tokeniser28.setTrackErrors(false);
        tokeniser28.createCommentPending();
        org.jsoup.parser.Token.Tag tag39 = tokeniser28.createTagPending(false);
        boolean boolean40 = tokeniser28.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState41 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_doubleQuoted;
        tokeniser28.eofError(tokeniserState41);
        tokeniser18.transition(tokeniserState41);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(tokeniserState41);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createTempBuffer();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        org.jsoup.parser.TokeniserState tokeniserState6 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser5.transition(tokeniserState6);
        org.jsoup.parser.Token.Comment comment8 = null;
        tokeniser5.commentPending = comment8;
        org.jsoup.parser.Token.Tag tag10 = tokeniser5.tagPending;
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser12.transition(tokeniserState13);
        org.jsoup.parser.Token.Comment comment15 = null;
        tokeniser12.commentPending = comment15;
        tokeniser12.emit('\ufffd');
        tokeniser12.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser12.getState();
        boolean boolean21 = tokeniser12.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.createDoctypePending();
        tokeniser23.createDoctypePending();
        org.jsoup.parser.Token.Comment comment26 = null;
        tokeniser23.commentPending = comment26;
        org.jsoup.parser.Token.Doctype doctype28 = tokeniser23.doctypePending;
        tokeniser12.doctypePending = doctype28;
        tokeniser5.doctypePending = doctype28;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        tokeniser32.createDoctypePending();
        tokeniser32.createDoctypePending();
        org.jsoup.parser.Token.Comment comment35 = null;
        tokeniser32.commentPending = comment35;
        java.lang.StringBuilder stringBuilder37 = tokeniser32.dataBuffer;
        tokeniser32.emitDoctypePending();
        java.lang.StringBuilder stringBuilder39 = tokeniser32.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState40 = tokeniser32.getState();
        tokeniser5.transition(tokeniserState40);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState6);
        org.junit.Assert.assertNull(tag10);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doctype28);
        org.junit.Assert.assertNull(stringBuilder37);
        org.junit.Assert.assertNull(stringBuilder39);
        org.junit.Assert.assertNotNull(tokeniserState40);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser1.getState();
        org.jsoup.parser.Token.Tag tag10 = tokeniser1.createTagPending(true);
        tokeniser1.createCommentPending();
        java.lang.StringBuilder stringBuilder12 = tokeniser1.dataBuffer;
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(stringBuilder12);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doctype12);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.setTrackErrors(true);
        java.lang.StringBuilder stringBuilder6 = tokeniser1.dataBuffer;
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token8 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder6);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        boolean boolean7 = tokeniser1.currentNodeInHtmlNS();
        java.lang.Class<?> wildcardClass8 = tokeniser1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        tokeniser1.createCommentPending();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.createDoctypePending();
        tokeniser14.createDoctypePending();
        org.jsoup.parser.Token.Comment comment17 = null;
        tokeniser14.commentPending = comment17;
        tokeniser14.createDoctypePending();
        boolean boolean20 = tokeniser14.isTrackErrors();
        org.jsoup.parser.Token.Doctype doctype21 = tokeniser14.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit((org.jsoup.parser.Token) doctype21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(doctype21);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        boolean boolean7 = tokeniser1.isTrackErrors();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        tokeniser1.transition(tokeniserState9);
        tokeniser1.emit('a');
        tokeniser1.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        org.jsoup.parser.TokeniserState tokeniserState17 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser16.transition(tokeniserState17);
        org.jsoup.parser.Token.Comment comment19 = null;
        tokeniser16.commentPending = comment19;
        tokeniser16.emit('\ufffd');
        tokeniser16.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder25 = tokeniser16.dataBuffer;
        tokeniser16.acknowledgeSelfClosingFlag();
        boolean boolean27 = tokeniser16.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag28 = tokeniser16.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser16.getState();
        org.jsoup.parser.Token.Doctype doctype30 = tokeniser16.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState31 = org.jsoup.parser.TokeniserState.PLAINTEXT;
        tokeniser16.error(tokeniserState31);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNull(stringBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(tag28);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNull(doctype30);
        org.junit.Assert.assertNotNull(tokeniserState31);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.setTrackErrors(true);
        java.lang.StringBuilder stringBuilder6 = tokeniser1.dataBuffer;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser9.transition(tokeniserState10);
        org.jsoup.parser.Token.Comment comment12 = null;
        tokeniser9.commentPending = comment12;
        tokeniser9.emit('\ufffd');
        tokeniser9.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder18 = tokeniser9.dataBuffer;
        tokeniser9.acknowledgeSelfClosingFlag();
        tokeniser9.acknowledgeSelfClosingFlag();
        tokeniser9.emit('a');
        boolean boolean23 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype24 = tokeniser9.doctypePending;
        org.jsoup.parser.Token.Tag tag25 = tokeniser9.tagPending;
        tokeniser9.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        org.jsoup.parser.TokeniserState tokeniserState29 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser28.transition(tokeniserState29);
        org.jsoup.parser.Token.Comment comment31 = null;
        tokeniser28.commentPending = comment31;
        tokeniser28.emit('\ufffd');
        tokeniser28.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState36 = tokeniser28.getState();
        boolean boolean37 = tokeniser28.currentNodeInHtmlNS();
        tokeniser28.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype39 = tokeniser28.doctypePending;
        tokeniser9.doctypePending = doctype39;
        tokeniser1.emit((org.jsoup.parser.Token) doctype39);
        boolean boolean42 = tokeniser1.isTrackErrors();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(stringBuilder18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(doctype24);
        org.junit.Assert.assertNull(tag25);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doctype39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.createTagPending(true);
        java.lang.Class<?> wildcardClass7 = tag6.getClass();
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment8 = tokeniser1.commentPending;
        java.lang.StringBuilder stringBuilder9 = tokeniser1.dataBuffer;
        boolean boolean10 = tokeniser1.isTrackErrors();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment8);
        org.junit.Assert.assertNull(stringBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(false);
        boolean boolean13 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_doubleQuoted;
        tokeniser1.eofError(tokeniserState14);
        tokeniser1.emitTagPending();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser18.transition(tokeniserState19);
        org.jsoup.parser.Token.Comment comment21 = null;
        tokeniser18.commentPending = comment21;
        tokeniser18.emit('\ufffd');
        tokeniser18.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder27 = tokeniser18.dataBuffer;
        tokeniser18.acknowledgeSelfClosingFlag();
        boolean boolean29 = tokeniser18.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag30 = tokeniser18.tagPending;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser32.transition(tokeniserState33);
        org.jsoup.parser.Token.Comment comment35 = null;
        tokeniser32.commentPending = comment35;
        tokeniser32.emit('\ufffd');
        tokeniser32.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState40 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser32.transition(tokeniserState40);
        tokeniser32.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment43 = tokeniser32.commentPending;
        tokeniser18.emit((org.jsoup.parser.Token) comment43);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit((org.jsoup.parser.Token) comment43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(stringBuilder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(tag30);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertNotNull(comment43);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser1.transition(tokeniserState12);
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser18.transition(tokeniserState19);
        org.jsoup.parser.Token.Comment comment21 = null;
        tokeniser18.commentPending = comment21;
        tokeniser18.emit('\ufffd');
        tokeniser18.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder27 = tokeniser18.dataBuffer;
        tokeniser18.acknowledgeSelfClosingFlag();
        boolean boolean29 = tokeniser18.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag30 = tokeniser18.tagPending;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser32.transition(tokeniserState33);
        org.jsoup.parser.Token.Comment comment35 = null;
        tokeniser32.commentPending = comment35;
        tokeniser32.emit('\ufffd');
        tokeniser32.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState40 = tokeniser32.getState();
        boolean boolean41 = tokeniser32.currentNodeInHtmlNS();
        tokeniser32.emitDoctypePending();
        tokeniser32.emit("");
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader45);
        tokeniser46.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState48 = tokeniser46.getState();
        tokeniser46.createTempBuffer();
        tokeniser46.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader51);
        org.jsoup.parser.TokeniserState tokeniserState53 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser52.transition(tokeniserState53);
        org.jsoup.parser.Token.Comment comment55 = null;
        tokeniser52.commentPending = comment55;
        tokeniser52.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment59 = tokeniser52.commentPending;
        org.jsoup.parser.Token.Tag tag61 = tokeniser52.createTagPending(true);
        tokeniser46.tagPending = tag61;
        java.lang.StringBuilder stringBuilder63 = tokeniser46.dataBuffer;
        tokeniser32.dataBuffer = stringBuilder63;
        tokeniser18.dataBuffer = stringBuilder63;
        tokeniser1.dataBuffer = stringBuilder63;
        org.jsoup.parser.TokeniserState tokeniserState67 = tokeniser1.getState();
        org.jsoup.parser.Token.Comment comment68 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader69 = null;
        org.jsoup.parser.Tokeniser tokeniser70 = new org.jsoup.parser.Tokeniser(characterReader69);
        org.jsoup.parser.TokeniserState tokeniserState71 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser70.transition(tokeniserState71);
        org.jsoup.parser.Token.Comment comment73 = null;
        tokeniser70.commentPending = comment73;
        org.jsoup.parser.Token.Tag tag75 = tokeniser70.tagPending;
        org.jsoup.parser.CharacterReader characterReader76 = null;
        org.jsoup.parser.Tokeniser tokeniser77 = new org.jsoup.parser.Tokeniser(characterReader76);
        org.jsoup.parser.TokeniserState tokeniserState78 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser77.transition(tokeniserState78);
        org.jsoup.parser.Token.Comment comment80 = null;
        tokeniser77.commentPending = comment80;
        tokeniser77.emit('\ufffd');
        tokeniser77.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState85 = tokeniser77.getState();
        boolean boolean86 = tokeniser77.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader87 = null;
        org.jsoup.parser.Tokeniser tokeniser88 = new org.jsoup.parser.Tokeniser(characterReader87);
        tokeniser88.createDoctypePending();
        tokeniser88.createDoctypePending();
        org.jsoup.parser.Token.Comment comment91 = null;
        tokeniser88.commentPending = comment91;
        org.jsoup.parser.Token.Doctype doctype93 = tokeniser88.doctypePending;
        tokeniser77.doctypePending = doctype93;
        tokeniser70.doctypePending = doctype93;
        org.jsoup.parser.Token.Comment comment96 = tokeniser70.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState97 = tokeniser70.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(stringBuilder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(tag30);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tokeniserState48);
        org.junit.Assert.assertNotNull(tokeniserState53);
        org.junit.Assert.assertNull(comment59);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(stringBuilder63);
        org.junit.Assert.assertEquals(stringBuilder63.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState67);
        org.junit.Assert.assertNull(comment68);
        org.junit.Assert.assertNotNull(tokeniserState71);
        org.junit.Assert.assertNull(tag75);
        org.junit.Assert.assertNotNull(tokeniserState78);
        org.junit.Assert.assertNotNull(tokeniserState85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(doctype93);
        org.junit.Assert.assertNull(comment96);
        org.junit.Assert.assertNotNull(tokeniserState97);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        boolean boolean12 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser1.getState();
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.PLAINTEXT;
        tokeniser1.error(tokeniserState16);
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        org.jsoup.parser.TokeniserState tokeniserState20 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser19.transition(tokeniserState20);
        tokeniser19.emit("hi!");
        org.jsoup.parser.Token.Comment comment24 = tokeniser19.commentPending;
        org.jsoup.parser.Token.Comment comment25 = null;
        tokeniser19.commentPending = comment25;
        tokeniser19.emit('\ufffd');
        org.jsoup.parser.TokeniserState tokeniserState29 = org.jsoup.parser.TokeniserState.BeforeDoctypeSystemIdentifier;
        tokeniser19.transition(tokeniserState29);
        org.jsoup.parser.Token.Doctype doctype31 = tokeniser19.doctypePending;
        org.jsoup.parser.CharacterReader characterReader32 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState16.read(tokeniser19, characterReader32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNull(comment24);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNull(doctype31);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser7.transition(tokeniserState8);
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser7.commentPending = comment10;
        tokeniser7.emit('\ufffd');
        tokeniser7.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        tokeniser16.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser16.getState();
        org.jsoup.parser.Token.Tag tag20 = tokeniser16.createTagPending(false);
        tokeniser7.tagPending = tag20;
        tokeniser1.emit((org.jsoup.parser.Token) tag20);
        tokeniser1.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        tokeniser26.createDoctypePending();
        tokeniser26.createDoctypePending();
        org.jsoup.parser.Token.Comment comment29 = null;
        tokeniser26.commentPending = comment29;
        tokeniser26.createDoctypePending();
        tokeniser26.emit("");
        tokeniser26.emit('#');
        org.jsoup.parser.TokeniserState tokeniserState36 = tokeniser26.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(tokeniserState36);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        tokeniser1.setTrackErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag7 = null;
        tokeniser1.tagPending = tag7;
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser10.transition(tokeniserState11);
        org.jsoup.parser.Token.Comment comment13 = null;
        tokeniser10.commentPending = comment13;
        tokeniser10.emit('\ufffd');
        tokeniser10.setTrackErrors(false);
        tokeniser10.createCommentPending();
        org.jsoup.parser.Token.Tag tag21 = tokeniser10.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype22 = tokeniser10.doctypePending;
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        tokeniser24.createDoctypePending();
        tokeniser24.createDoctypePending();
        org.jsoup.parser.Token.Comment comment27 = null;
        tokeniser24.commentPending = comment27;
        java.lang.StringBuilder stringBuilder29 = tokeniser24.dataBuffer;
        tokeniser24.emitDoctypePending();
        java.lang.StringBuilder stringBuilder31 = tokeniser24.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState32 = tokeniser24.getState();
        tokeniser10.transition(tokeniserState32);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNull(doctype22);
        org.junit.Assert.assertNull(stringBuilder29);
        org.junit.Assert.assertNull(stringBuilder31);
        org.junit.Assert.assertNotNull(tokeniserState32);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.BeforeDoctypeName;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        java.lang.StringBuilder stringBuilder11 = null;
        tokeniser1.dataBuffer = stringBuilder11;
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.createDoctypePending();
        tokeniser14.createDoctypePending();
        org.jsoup.parser.Token.Comment comment17 = null;
        tokeniser14.commentPending = comment17;
        org.jsoup.parser.Token.Tag tag19 = tokeniser14.tagPending;
        java.lang.StringBuilder stringBuilder20 = tokeniser14.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState21 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser14.transition(tokeniserState21);
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser24.transition(tokeniserState25);
        org.jsoup.parser.Token.Comment comment27 = null;
        tokeniser24.commentPending = comment27;
        tokeniser24.emit('\ufffd');
        tokeniser24.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState32 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser24.transition(tokeniserState32);
        tokeniser24.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment35 = tokeniser24.commentPending;
        tokeniser14.commentPending = comment35;
        tokeniser1.commentPending = comment35;
        org.jsoup.parser.Token.Tag tag38 = tokeniser1.tagPending;
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNull(tag19);
        org.junit.Assert.assertNull(stringBuilder20);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNotNull(tokeniserState32);
        org.junit.Assert.assertNotNull(comment35);
        org.junit.Assert.assertNull(tag38);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = tokeniser1.commentPending;
        tokeniser1.createTempBuffer();
        boolean boolean11 = tokeniser1.isTrackErrors();
        org.junit.Assert.assertNull(comment9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.createTempBuffer();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser7.transition(tokeniserState8);
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser7.commentPending = comment10;
        tokeniser7.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment14 = tokeniser7.commentPending;
        org.jsoup.parser.Token.Tag tag16 = tokeniser7.createTagPending(true);
        tokeniser1.tagPending = tag16;
        org.jsoup.parser.Token.Tag tag18 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        tokeniser20.createDoctypePending();
        tokeniser20.createDoctypePending();
        tokeniser20.createDoctypePending();
        org.jsoup.parser.Token.Tag tag25 = tokeniser20.createTagPending(true);
        tokeniser1.tagPending = tag25;
        org.jsoup.parser.TokeniserState tokeniserState27 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapeEnd;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(tokeniserState27);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.emitDoctypePending();
        boolean boolean13 = tokeniser1.isTrackErrors();
        boolean boolean14 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token token16 = tokeniser1.read();
        org.jsoup.parser.TokeniserState tokeniserState17 = org.jsoup.parser.TokeniserState.TagName;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertNotNull(tokeniserState17);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        boolean boolean12 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser15.transition(tokeniserState16);
        org.jsoup.parser.Token.Comment comment18 = null;
        tokeniser15.commentPending = comment18;
        tokeniser15.emit('\ufffd');
        tokeniser15.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser15.getState();
        boolean boolean24 = tokeniser15.currentNodeInHtmlNS();
        tokeniser15.emitDoctypePending();
        tokeniser15.emit("");
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        tokeniser29.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser29.getState();
        tokeniser29.createTempBuffer();
        tokeniser29.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        org.jsoup.parser.TokeniserState tokeniserState36 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser35.transition(tokeniserState36);
        org.jsoup.parser.Token.Comment comment38 = null;
        tokeniser35.commentPending = comment38;
        tokeniser35.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment42 = tokeniser35.commentPending;
        org.jsoup.parser.Token.Tag tag44 = tokeniser35.createTagPending(true);
        tokeniser29.tagPending = tag44;
        java.lang.StringBuilder stringBuilder46 = tokeniser29.dataBuffer;
        tokeniser15.dataBuffer = stringBuilder46;
        tokeniser1.dataBuffer = stringBuilder46;
        tokeniser1.createCommentPending();
        tokeniser1.setTrackErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char54 = tokeniser1.consumeCharacterReference((java.lang.Character) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNull(comment42);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(stringBuilder46);
        org.junit.Assert.assertEquals(stringBuilder46.toString(), "");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser1.transition(tokeniserState4);
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser1.dataBuffer = stringBuilder6;
        tokeniser1.createCommentPending();
        tokeniser1.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        tokeniser12.createDoctypePending();
        tokeniser12.createDoctypePending();
        org.jsoup.parser.Token.Comment comment15 = null;
        tokeniser12.commentPending = comment15;
        boolean boolean17 = tokeniser12.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser12.getState();
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser12.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState19);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AttributeValue_doubleQuoted;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        org.jsoup.parser.TokeniserState tokeniserState3 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser2.transition(tokeniserState3);
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser2.commentPending = comment5;
        tokeniser2.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment9 = tokeniser2.commentPending;
        java.lang.StringBuilder stringBuilder10 = tokeniser2.dataBuffer;
        tokeniser2.emit('a');
        tokeniser2.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNull(comment9);
        org.junit.Assert.assertNull(stringBuilder10);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        boolean boolean7 = tokeniser1.isTrackErrors();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        tokeniser1.transition(tokeniserState9);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        tokeniser13.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser13.getState();
        tokeniser13.createTempBuffer();
        tokeniser13.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        org.jsoup.parser.TokeniserState tokeniserState20 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser19.transition(tokeniserState20);
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser19.commentPending = comment22;
        tokeniser19.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment26 = tokeniser19.commentPending;
        org.jsoup.parser.Token.Tag tag28 = tokeniser19.createTagPending(true);
        tokeniser13.tagPending = tag28;
        java.lang.StringBuilder stringBuilder30 = tokeniser13.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder30;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char34 = tokeniser1.consumeCharacterReference((java.lang.Character) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNull(comment26);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser12.transition(tokeniserState13);
        org.jsoup.parser.Token.Comment comment15 = null;
        tokeniser12.commentPending = comment15;
        tokeniser12.emit('\ufffd');
        tokeniser12.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser12.getState();
        boolean boolean21 = tokeniser12.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype22 = tokeniser12.doctypePending;
        org.jsoup.parser.Token.Doctype doctype23 = tokeniser12.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser12.getState();
        tokeniser1.transition(tokeniserState24);
        org.jsoup.parser.Token.Tag tag27 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        org.jsoup.parser.TokeniserState tokeniserState30 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser29.transition(tokeniserState30);
        org.jsoup.parser.Token.Comment comment32 = null;
        tokeniser29.commentPending = comment32;
        tokeniser29.emit('\ufffd');
        tokeniser29.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser29.getState();
        boolean boolean38 = tokeniser29.currentNodeInHtmlNS();
        tokeniser29.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype40 = tokeniser29.doctypePending;
        java.lang.StringBuilder stringBuilder41 = tokeniser29.dataBuffer;
        tokeniser29.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader43);
        org.jsoup.parser.TokeniserState tokeniserState45 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser44.transition(tokeniserState45);
        org.jsoup.parser.Token.Comment comment47 = null;
        tokeniser44.commentPending = comment47;
        tokeniser44.emit('\ufffd');
        tokeniser44.setTrackErrors(false);
        tokeniser44.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState54 = tokeniser44.getState();
        tokeniser29.transition(tokeniserState54);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doctype22);
        org.junit.Assert.assertNotNull(doctype23);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doctype40);
        org.junit.Assert.assertNull(stringBuilder41);
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertNotNull(tokeniserState54);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.RCDATAEndTagName;
        tokeniser1.transition(tokeniserState12);
        org.jsoup.parser.Token token14 = tokeniser1.read();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(token14);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        org.jsoup.parser.TokeniserState tokeniserState17 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser16.transition(tokeniserState17);
        tokeniser1.transition(tokeniserState17);
        java.lang.Class<?> wildcardClass20 = tokeniserState17.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser1.doctypePending;
        java.lang.StringBuilder stringBuilder13 = tokeniser1.dataBuffer;
        tokeniser1.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        org.jsoup.parser.TokeniserState tokeniserState17 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser16.transition(tokeniserState17);
        org.jsoup.parser.Token.Comment comment19 = null;
        tokeniser16.commentPending = comment19;
        tokeniser16.emit('\ufffd');
        tokeniser16.setTrackErrors(false);
        tokeniser16.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser16.getState();
        tokeniser1.transition(tokeniserState26);
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        org.jsoup.parser.TokeniserState tokeniserState30 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser29.transition(tokeniserState30);
        tokeniser29.emit("hi!");
        org.jsoup.parser.Token.Comment comment34 = tokeniser29.commentPending;
        java.lang.StringBuilder stringBuilder35 = null;
        tokeniser29.dataBuffer = stringBuilder35;
        tokeniser29.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader39);
        tokeniser40.createDoctypePending();
        tokeniser40.createDoctypePending();
        tokeniser40.createDoctypePending();
        org.jsoup.parser.Token.Tag tag45 = tokeniser40.createTagPending(true);
        org.jsoup.parser.Token.Tag tag46 = tokeniser40.tagPending;
        tokeniser29.emit((org.jsoup.parser.Token) tag46);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit((org.jsoup.parser.Token) tag46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doctype12);
        org.junit.Assert.assertNull(stringBuilder13);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertNull(comment34);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(tag46);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Comment comment5 = tokeniser1.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char8 = tokeniser1.consumeCharacterReference((java.lang.Character) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertNull(comment5);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.emitDoctypePending();
        boolean boolean13 = tokeniser1.isTrackErrors();
        boolean boolean14 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag16 = tokeniser1.createTagPending(true);
        org.jsoup.parser.Token.Comment comment17 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        tokeniser19.createDoctypePending();
        tokeniser19.createDoctypePending();
        tokeniser19.emitDoctypePending();
        tokeniser19.emit("");
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        org.jsoup.parser.TokeniserState tokeniserState27 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser26.transition(tokeniserState27);
        org.jsoup.parser.Token.Comment comment29 = null;
        tokeniser26.commentPending = comment29;
        tokeniser26.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        org.jsoup.parser.TokeniserState tokeniserState35 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser34.transition(tokeniserState35);
        org.jsoup.parser.Token.Comment comment37 = null;
        tokeniser34.commentPending = comment37;
        tokeniser34.emit('\ufffd');
        tokeniser34.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder43 = tokeniser34.dataBuffer;
        tokeniser34.acknowledgeSelfClosingFlag();
        boolean boolean45 = tokeniser34.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag46 = tokeniser34.tagPending;
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader47);
        org.jsoup.parser.TokeniserState tokeniserState49 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser48.transition(tokeniserState49);
        org.jsoup.parser.Token.Comment comment51 = null;
        tokeniser48.commentPending = comment51;
        tokeniser48.emit('\ufffd');
        tokeniser48.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState56 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser48.transition(tokeniserState56);
        tokeniser48.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment59 = tokeniser48.commentPending;
        tokeniser34.emit((org.jsoup.parser.Token) comment59);
        tokeniser26.commentPending = comment59;
        tokeniser19.commentPending = comment59;
        tokeniser1.commentPending = comment59;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(comment17);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNull(stringBuilder43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(tag46);
        org.junit.Assert.assertNotNull(tokeniserState49);
        org.junit.Assert.assertNotNull(tokeniserState56);
        org.junit.Assert.assertNotNull(comment59);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Tag tag5 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        tokeniser7.createDoctypePending();
        tokeniser7.createDoctypePending();
        org.jsoup.parser.Token.Tag tag10 = tokeniser7.tagPending;
        java.lang.StringBuilder stringBuilder11 = null;
        tokeniser7.dataBuffer = stringBuilder11;
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        org.jsoup.parser.TokeniserState tokeniserState15 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser14.transition(tokeniserState15);
        org.jsoup.parser.Token.Comment comment17 = null;
        tokeniser14.commentPending = comment17;
        tokeniser14.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        org.jsoup.parser.TokeniserState tokeniserState23 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser22.transition(tokeniserState23);
        org.jsoup.parser.Token.Doctype doctype25 = tokeniser22.doctypePending;
        tokeniser22.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        org.jsoup.parser.TokeniserState tokeniserState30 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser29.transition(tokeniserState30);
        org.jsoup.parser.Token.Comment comment32 = null;
        tokeniser29.commentPending = comment32;
        tokeniser29.emit('\ufffd');
        tokeniser29.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser29.getState();
        boolean boolean38 = tokeniser29.currentNodeInHtmlNS();
        tokeniser29.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype40 = tokeniser29.doctypePending;
        tokeniser22.doctypePending = doctype40;
        tokeniser14.doctypePending = doctype40;
        tokeniser7.emit((org.jsoup.parser.Token) doctype40);
        org.jsoup.parser.Token token44 = tokeniser7.read();
        tokeniser1.emit(token44);
        org.jsoup.parser.Token.Doctype doctype46 = tokeniser1.doctypePending;
        tokeniser1.createDoctypePending();
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(tag10);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNull(doctype25);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doctype40);
        org.junit.Assert.assertNotNull(token44);
        org.junit.Assert.assertNull(doctype46);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment3 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser5.getState();
        org.jsoup.parser.Token.Tag tag9 = tokeniser5.createTagPending(false);
        tokeniser1.tagPending = tag9;
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser1.getState();
        java.lang.Class<?> wildcardClass12 = tokeniserState11.getClass();
        org.junit.Assert.assertNull(comment3);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder4 = null;
        tokeniser1.dataBuffer = stringBuilder4;
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        tokeniser7.createDoctypePending();
        org.jsoup.parser.Token.Comment comment9 = tokeniser7.commentPending;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser11.transition(tokeniserState12);
        org.jsoup.parser.Token.Comment comment14 = null;
        tokeniser11.commentPending = comment14;
        tokeniser11.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment18 = tokeniser11.commentPending;
        org.jsoup.parser.Token.Tag tag20 = tokeniser11.createTagPending(true);
        tokeniser7.emit((org.jsoup.parser.Token) tag20);
        tokeniser1.tagPending = tag20;
        tokeniser1.createTempBuffer();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.Doctype;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNull(comment9);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNull(comment18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(tokeniserState25);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.createDoctypePending();
        tokeniser8.createDoctypePending();
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser8.commentPending = comment11;
        tokeniser8.createDoctypePending();
        tokeniser8.emit("");
        tokeniser8.createDoctypePending();
        org.jsoup.parser.Token.Comment comment17 = null;
        tokeniser8.commentPending = comment17;
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser8.transition(tokeniserState19);
        tokeniser1.transition(tokeniserState19);
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser1.getState();
        tokeniser1.emit(' ');
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        tokeniser26.createDoctypePending();
        tokeniser26.createDoctypePending();
        tokeniser26.createDoctypePending();
        org.jsoup.parser.Token.Tag tag31 = tokeniser26.createTagPending(true);
        org.jsoup.parser.Token.Tag tag32 = tokeniser26.tagPending;
        org.jsoup.parser.Token.Comment comment33 = tokeniser26.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState34 = tokeniser26.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNull(comment33);
        org.junit.Assert.assertNotNull(tokeniserState34);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createTempBuffer();
        tokeniser1.createCommentPending();
        boolean boolean4 = tokeniser1.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState5 = org.jsoup.parser.TokeniserState.AfterAttributeName;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tokeniserState5);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.RCDATAEndTagName;
        tokeniser1.transition(tokeniserState12);
        org.jsoup.parser.Token.Comment comment14 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        tokeniser16.createDoctypePending();
        tokeniser16.createDoctypePending();
        org.jsoup.parser.Token.Comment comment19 = null;
        tokeniser16.commentPending = comment19;
        org.jsoup.parser.Token.Doctype doctype21 = tokeniser16.doctypePending;
        org.jsoup.parser.Token.Tag tag22 = tokeniser16.tagPending;
        tokeniser16.createCommentPending();
        tokeniser16.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        org.jsoup.parser.TokeniserState tokeniserState27 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser26.transition(tokeniserState27);
        tokeniser26.emit("hi!");
        org.jsoup.parser.Token.Comment comment31 = null;
        tokeniser26.commentPending = comment31;
        tokeniser26.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState35 = tokeniser26.getState();
        tokeniser26.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader37);
        org.jsoup.parser.TokeniserState tokeniserState39 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser38.transition(tokeniserState39);
        org.jsoup.parser.Token.Comment comment41 = null;
        tokeniser38.commentPending = comment41;
        org.jsoup.parser.Token.Tag tag43 = tokeniser38.tagPending;
        org.jsoup.parser.CharacterReader characterReader44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader44);
        org.jsoup.parser.TokeniserState tokeniserState46 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser45.transition(tokeniserState46);
        org.jsoup.parser.Token.Comment comment48 = null;
        tokeniser45.commentPending = comment48;
        tokeniser45.emit('\ufffd');
        tokeniser45.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState53 = tokeniser45.getState();
        boolean boolean54 = tokeniser45.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader55 = null;
        org.jsoup.parser.Tokeniser tokeniser56 = new org.jsoup.parser.Tokeniser(characterReader55);
        tokeniser56.createDoctypePending();
        tokeniser56.createDoctypePending();
        org.jsoup.parser.Token.Comment comment59 = null;
        tokeniser56.commentPending = comment59;
        org.jsoup.parser.Token.Doctype doctype61 = tokeniser56.doctypePending;
        tokeniser45.doctypePending = doctype61;
        tokeniser38.doctypePending = doctype61;
        tokeniser26.doctypePending = doctype61;
        tokeniser16.doctypePending = doctype61;
        tokeniser1.doctypePending = doctype61;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(doctype21);
        org.junit.Assert.assertNull(tag22);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNotNull(tokeniserState39);
        org.junit.Assert.assertNull(tag43);
        org.junit.Assert.assertNotNull(tokeniserState46);
        org.junit.Assert.assertNotNull(tokeniserState53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(doctype61);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        tokeniser1.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser12.transition(tokeniserState13);
        org.jsoup.parser.Token.Comment comment15 = null;
        tokeniser12.commentPending = comment15;
        tokeniser12.emit('\ufffd');
        tokeniser12.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser12.getState();
        tokeniser12.emit("hi!");
        tokeniser12.emitDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser12.getState();
        java.lang.StringBuilder stringBuilder25 = null;
        tokeniser12.dataBuffer = stringBuilder25;
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        org.jsoup.parser.TokeniserState tokeniserState29 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser28.transition(tokeniserState29);
        org.jsoup.parser.Token.Comment comment31 = null;
        tokeniser28.commentPending = comment31;
        tokeniser28.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        org.jsoup.parser.TokeniserState tokeniserState37 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser36.transition(tokeniserState37);
        org.jsoup.parser.Token.Comment comment39 = null;
        tokeniser36.commentPending = comment39;
        tokeniser36.emit('\ufffd');
        tokeniser36.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder45 = tokeniser36.dataBuffer;
        tokeniser36.acknowledgeSelfClosingFlag();
        boolean boolean47 = tokeniser36.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag48 = tokeniser36.tagPending;
        org.jsoup.parser.CharacterReader characterReader49 = null;
        org.jsoup.parser.Tokeniser tokeniser50 = new org.jsoup.parser.Tokeniser(characterReader49);
        org.jsoup.parser.TokeniserState tokeniserState51 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser50.transition(tokeniserState51);
        org.jsoup.parser.Token.Comment comment53 = null;
        tokeniser50.commentPending = comment53;
        tokeniser50.emit('\ufffd');
        tokeniser50.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState58 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser50.transition(tokeniserState58);
        tokeniser50.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment61 = tokeniser50.commentPending;
        tokeniser36.emit((org.jsoup.parser.Token) comment61);
        tokeniser28.commentPending = comment61;
        tokeniser12.commentPending = comment61;
        org.jsoup.parser.Token.Tag tag66 = tokeniser12.createTagPending(false);
        org.jsoup.parser.TokeniserState tokeniserState67 = tokeniser12.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertNull(stringBuilder45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(tag48);
        org.junit.Assert.assertNotNull(tokeniserState51);
        org.junit.Assert.assertNotNull(tokeniserState58);
        org.junit.Assert.assertNotNull(comment61);
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertNotNull(tokeniserState67);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser11.transition(tokeniserState12);
        org.jsoup.parser.Token.Comment comment14 = null;
        tokeniser11.commentPending = comment14;
        tokeniser11.emit('\ufffd');
        tokeniser11.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder20 = tokeniser11.dataBuffer;
        tokeniser11.acknowledgeSelfClosingFlag();
        boolean boolean22 = tokeniser11.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag23 = tokeniser11.tagPending;
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        org.jsoup.parser.TokeniserState tokeniserState26 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser25.transition(tokeniserState26);
        org.jsoup.parser.Token.Comment comment28 = null;
        tokeniser25.commentPending = comment28;
        tokeniser25.emit('\ufffd');
        tokeniser25.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState33 = tokeniser25.getState();
        boolean boolean34 = tokeniser25.currentNodeInHtmlNS();
        tokeniser25.emitDoctypePending();
        tokeniser25.emit("");
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        tokeniser39.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState41 = tokeniser39.getState();
        tokeniser39.createTempBuffer();
        tokeniser39.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader44);
        org.jsoup.parser.TokeniserState tokeniserState46 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser45.transition(tokeniserState46);
        org.jsoup.parser.Token.Comment comment48 = null;
        tokeniser45.commentPending = comment48;
        tokeniser45.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment52 = tokeniser45.commentPending;
        org.jsoup.parser.Token.Tag tag54 = tokeniser45.createTagPending(true);
        tokeniser39.tagPending = tag54;
        java.lang.StringBuilder stringBuilder56 = tokeniser39.dataBuffer;
        tokeniser25.dataBuffer = stringBuilder56;
        tokeniser11.dataBuffer = stringBuilder56;
        tokeniser1.dataBuffer = stringBuilder56;
        java.lang.Class<?> wildcardClass60 = stringBuilder56.getClass();
        org.junit.Assert.assertNull(comment9);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNull(stringBuilder20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(tag23);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tokeniserState41);
        org.junit.Assert.assertNotNull(tokeniserState46);
        org.junit.Assert.assertNull(comment52);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertNotNull(stringBuilder56);
        org.junit.Assert.assertEquals(stringBuilder56.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser1.doctypePending;
        java.lang.StringBuilder stringBuilder13 = tokeniser1.dataBuffer;
        java.lang.StringBuilder stringBuilder14 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token token15 = tokeniser1.read();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        tokeniser17.createDoctypePending();
        tokeniser17.createDoctypePending();
        org.jsoup.parser.Token.Comment comment20 = null;
        tokeniser17.commentPending = comment20;
        tokeniser17.createDoctypePending();
        tokeniser17.emit("");
        tokeniser17.emit('#');
        org.jsoup.parser.TokeniserState tokeniserState27 = tokeniser17.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doctype12);
        org.junit.Assert.assertNull(stringBuilder13);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNotNull(token15);
        org.junit.Assert.assertNotNull(tokeniserState27);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser1.transition(tokeniserState4);
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser1.dataBuffer = stringBuilder6;
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.tagPending;
        tokeniser1.emit("");
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(tag8);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.setTrackErrors(true);
        tokeniser1.setTrackErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.tagPending;
        tokeniser1.emit("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token7 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag4);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        java.lang.StringBuilder stringBuilder11 = null;
        tokeniser1.dataBuffer = stringBuilder11;
        org.jsoup.parser.Token token13 = tokeniser1.read();
        tokeniser1.emit("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(token13);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        tokeniser13.createDoctypePending();
        tokeniser13.createDoctypePending();
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser13.commentPending = comment16;
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser13.doctypePending;
        org.jsoup.parser.Token.Tag tag19 = tokeniser13.tagPending;
        boolean boolean20 = tokeniser13.isTrackErrors();
        tokeniser13.emit("hi!");
        org.jsoup.parser.Token.Tag tag24 = tokeniser13.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        tokeniser26.createDoctypePending();
        org.jsoup.parser.Token.Tag tag29 = tokeniser26.createTagPending(true);
        tokeniser13.emit((org.jsoup.parser.Token) tag29);
        tokeniser1.emit((org.jsoup.parser.Token) tag29);
        org.jsoup.parser.Token.Doctype doctype32 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(doctype18);
        org.junit.Assert.assertNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(doctype32);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment4 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Doctype doctype5 = tokeniser1.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = doctype5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment4);
        org.junit.Assert.assertNull(doctype5);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser1.dataBuffer = stringBuilder7;
        tokeniser1.setTrackErrors(false);
        tokeniser1.emit(' ');
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.acknowledgeSelfClosingFlag();
        java.lang.StringBuilder stringBuilder7 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        tokeniser9.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser9.getState();
        org.jsoup.parser.Token.Tag tag13 = tokeniser9.createTagPending(false);
        tokeniser1.emit((org.jsoup.parser.Token) tag13);
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser18.transition(tokeniserState19);
        org.jsoup.parser.Token.Comment comment21 = null;
        tokeniser18.commentPending = comment21;
        tokeniser18.emit('\ufffd');
        tokeniser18.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser18.getState();
        tokeniser18.emitDoctypePending();
        tokeniser18.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState29 = org.jsoup.parser.TokeniserState.RawtextEndTagOpen;
        tokeniser18.transition(tokeniserState29);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringBuilder7);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNotNull(tokeniserState29);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        boolean boolean7 = tokeniser1.isTrackErrors();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        tokeniser1.transition(tokeniserState9);
        tokeniser1.emit('a');
        org.jsoup.parser.Token.Comment comment13 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag15 = tokeniser1.createTagPending(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char18 = tokeniser1.consumeCharacterReference((java.lang.Character) '\ufffd', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNull(comment13);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser1.getState();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        org.jsoup.parser.TokeniserState tokeniserState17 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser16.transition(tokeniserState17);
        tokeniser1.transition(tokeniserState17);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState17);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(true);
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        tokeniser12.createDoctypePending();
        tokeniser12.createDoctypePending();
        org.jsoup.parser.Token.Comment comment15 = null;
        tokeniser12.commentPending = comment15;
        tokeniser12.createDoctypePending();
        tokeniser12.emit("");
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        org.jsoup.parser.TokeniserState tokeniserState22 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser21.transition(tokeniserState22);
        tokeniser21.emit("hi!");
        org.jsoup.parser.Token.Tag tag26 = tokeniser21.tagPending;
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        tokeniser28.createDoctypePending();
        tokeniser28.createDoctypePending();
        org.jsoup.parser.Token.Comment comment31 = null;
        tokeniser28.commentPending = comment31;
        tokeniser28.createDoctypePending();
        tokeniser28.emit("");
        tokeniser28.createDoctypePending();
        org.jsoup.parser.Token.Comment comment37 = null;
        tokeniser28.commentPending = comment37;
        org.jsoup.parser.TokeniserState tokeniserState39 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser28.transition(tokeniserState39);
        tokeniser21.transition(tokeniserState39);
        tokeniser12.transition(tokeniserState39);
        org.jsoup.parser.TokeniserState tokeniserState43 = tokeniser12.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNull(tag26);
        org.junit.Assert.assertNotNull(tokeniserState39);
        org.junit.Assert.assertNotNull(tokeniserState43);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        boolean boolean8 = tokeniser1.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState9 = null;
        tokeniser1.transition(tokeniserState9);
        tokeniser1.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char14 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemKeyword;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.createDoctypePending();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser2.commentPending = comment5;
        org.jsoup.parser.Token.Doctype doctype7 = tokeniser2.doctypePending;
        org.jsoup.parser.Token.Tag tag8 = tokeniser2.tagPending;
        boolean boolean9 = tokeniser2.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState10 = null;
        tokeniser2.transition(tokeniserState10);
        tokeniser2.emit("");
        org.jsoup.parser.CharacterReader characterReader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser1.transition(tokeniserState4);
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser1.dataBuffer = stringBuilder6;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState4);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(false);
        boolean boolean13 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_doubleQuoted;
        tokeniser1.eofError(tokeniserState14);
        tokeniser1.emitTagPending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char19 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        tokeniser1.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        boolean boolean12 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag13 = tokeniser1.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser1.getState();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.TokeniserState tokeniserState17 = org.jsoup.parser.TokeniserState.AttributeValue_doubleQuoted;
        tokeniser1.eofError(tokeniserState17);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(tokeniserState17);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        boolean boolean7 = tokeniser1.isTrackErrors();
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser1.dataBuffer = stringBuilder7;
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        tokeniser10.createDoctypePending();
        tokeniser10.createDoctypePending();
        org.jsoup.parser.Token.Comment comment13 = null;
        tokeniser10.commentPending = comment13;
        boolean boolean15 = tokeniser10.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser10.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tokeniserState16);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.RCDATAEndTagName;
        tokeniser1.transition(tokeniserState12);
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token token15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit(token15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.Rcdata;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.createDoctypePending();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser2.commentPending = comment5;
        tokeniser2.createDoctypePending();
        tokeniser2.emit("");
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser2.commentPending = comment11;
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser2.transition(tokeniserState13);
        java.lang.StringBuilder stringBuilder15 = null;
        tokeniser2.dataBuffer = stringBuilder15;
        org.jsoup.parser.Token.Tag tag17 = tokeniser2.tagPending;
        org.jsoup.parser.CharacterReader characterReader18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNull(tag17);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        tokeniser1.transition(tokeniserState11);
        tokeniser1.emit('#');
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        org.jsoup.parser.Token.Tag tag5 = tokeniser1.createTagPending(false);
        tokeniser1.emit('a');
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        tokeniser9.createDoctypePending();
        tokeniser9.createDoctypePending();
        org.jsoup.parser.Token.Comment comment12 = null;
        tokeniser9.commentPending = comment12;
        boolean boolean14 = tokeniser9.isTrackErrors();
        boolean boolean15 = tokeniser9.isTrackErrors();
        tokeniser9.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        tokeniser18.createDoctypePending();
        tokeniser18.createDoctypePending();
        org.jsoup.parser.Token.Comment comment21 = null;
        tokeniser18.commentPending = comment21;
        org.jsoup.parser.Token.Tag tag23 = tokeniser18.tagPending;
        java.lang.StringBuilder stringBuilder24 = tokeniser18.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser18.transition(tokeniserState25);
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        org.jsoup.parser.TokeniserState tokeniserState29 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser28.transition(tokeniserState29);
        org.jsoup.parser.Token.Comment comment31 = null;
        tokeniser28.commentPending = comment31;
        tokeniser28.emit('\ufffd');
        tokeniser28.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState36 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser28.transition(tokeniserState36);
        tokeniser28.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment39 = tokeniser28.commentPending;
        tokeniser18.commentPending = comment39;
        tokeniser9.commentPending = comment39;
        tokeniser1.commentPending = comment39;
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader43);
        org.jsoup.parser.TokeniserState tokeniserState45 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser44.transition(tokeniserState45);
        org.jsoup.parser.Token.Comment comment47 = null;
        tokeniser44.commentPending = comment47;
        tokeniser44.emit('\ufffd');
        tokeniser44.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder53 = tokeniser44.dataBuffer;
        tokeniser44.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState55 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStartDash;
        tokeniser44.transition(tokeniserState55);
        org.jsoup.parser.TokeniserState tokeniserState57 = tokeniser44.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(tag23);
        org.junit.Assert.assertNull(stringBuilder24);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNotNull(comment39);
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertNull(stringBuilder53);
        org.junit.Assert.assertNotNull(tokeniserState55);
        org.junit.Assert.assertNotNull(tokeniserState57);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(false);
        boolean boolean13 = tokeniser1.currentNodeInHtmlNS();
        java.lang.StringBuilder stringBuilder14 = tokeniser1.dataBuffer;
        tokeniser1.emitTagPending();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser17.transition(tokeniserState18);
        tokeniser17.setTrackErrors(true);
        tokeniser17.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        tokeniser25.createDoctypePending();
        tokeniser25.createDoctypePending();
        org.jsoup.parser.Token.Comment comment28 = null;
        tokeniser25.commentPending = comment28;
        org.jsoup.parser.Token.Doctype doctype30 = tokeniser25.doctypePending;
        tokeniser17.emit((org.jsoup.parser.Token) doctype30);
        tokeniser1.doctypePending = doctype30;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char35 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(doctype30);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('a');
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser18.transition(tokeniserState19);
        tokeniser18.setTrackErrors(true);
        tokeniser18.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        tokeniser26.createDoctypePending();
        tokeniser26.createDoctypePending();
        org.jsoup.parser.Token.Comment comment29 = null;
        tokeniser26.commentPending = comment29;
        org.jsoup.parser.Token.Doctype doctype31 = tokeniser26.doctypePending;
        tokeniser18.emit((org.jsoup.parser.Token) doctype31);
        tokeniser1.doctypePending = doctype31;
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.Token.Comment comment35 = tokeniser1.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(doctype31);
        org.junit.Assert.assertNull(comment35);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.RawtextEndTagName;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(tokeniserState4);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser1.transition(tokeniserState12);
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser18.transition(tokeniserState19);
        org.jsoup.parser.Token.Comment comment21 = null;
        tokeniser18.commentPending = comment21;
        tokeniser18.emit('\ufffd');
        tokeniser18.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder27 = tokeniser18.dataBuffer;
        tokeniser18.acknowledgeSelfClosingFlag();
        boolean boolean29 = tokeniser18.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag30 = tokeniser18.tagPending;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser32.transition(tokeniserState33);
        org.jsoup.parser.Token.Comment comment35 = null;
        tokeniser32.commentPending = comment35;
        tokeniser32.emit('\ufffd');
        tokeniser32.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState40 = tokeniser32.getState();
        boolean boolean41 = tokeniser32.currentNodeInHtmlNS();
        tokeniser32.emitDoctypePending();
        tokeniser32.emit("");
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader45);
        tokeniser46.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState48 = tokeniser46.getState();
        tokeniser46.createTempBuffer();
        tokeniser46.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader51);
        org.jsoup.parser.TokeniserState tokeniserState53 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser52.transition(tokeniserState53);
        org.jsoup.parser.Token.Comment comment55 = null;
        tokeniser52.commentPending = comment55;
        tokeniser52.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment59 = tokeniser52.commentPending;
        org.jsoup.parser.Token.Tag tag61 = tokeniser52.createTagPending(true);
        tokeniser46.tagPending = tag61;
        java.lang.StringBuilder stringBuilder63 = tokeniser46.dataBuffer;
        tokeniser32.dataBuffer = stringBuilder63;
        tokeniser18.dataBuffer = stringBuilder63;
        tokeniser1.dataBuffer = stringBuilder63;
        tokeniser1.createDoctypePending();
        boolean boolean68 = tokeniser1.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState69 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_doubleQuoted;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(stringBuilder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(tag30);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tokeniserState48);
        org.junit.Assert.assertNotNull(tokeniserState53);
        org.junit.Assert.assertNull(comment59);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(stringBuilder63);
        org.junit.Assert.assertEquals(stringBuilder63.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(tokeniserState69);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        tokeniser15.createDoctypePending();
        tokeniser15.createDoctypePending();
        org.jsoup.parser.Token.Comment comment18 = null;
        tokeniser15.commentPending = comment18;
        java.lang.StringBuilder stringBuilder20 = tokeniser15.dataBuffer;
        tokeniser15.emitDoctypePending();
        java.lang.StringBuilder stringBuilder22 = tokeniser15.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser15.getState();
        tokeniser1.transition(tokeniserState23);
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        org.jsoup.parser.TokeniserState tokeniserState27 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser26.transition(tokeniserState27);
        org.jsoup.parser.Token.Comment comment29 = null;
        tokeniser26.commentPending = comment29;
        tokeniser26.emit('\ufffd');
        tokeniser26.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState34 = tokeniser26.getState();
        tokeniser26.emit("hi!");
        tokeniser26.emitDoctypePending();
        boolean boolean38 = tokeniser26.isTrackErrors();
        boolean boolean39 = tokeniser26.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag41 = tokeniser26.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader42);
        org.jsoup.parser.TokeniserState tokeniserState44 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser43.transition(tokeniserState44);
        org.jsoup.parser.Token.Comment comment46 = null;
        tokeniser43.commentPending = comment46;
        tokeniser43.emit('\ufffd');
        tokeniser43.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState51 = tokeniser43.getState();
        boolean boolean52 = tokeniser43.currentNodeInHtmlNS();
        tokeniser43.emitDoctypePending();
        tokeniser43.emit("");
        org.jsoup.parser.CharacterReader characterReader56 = null;
        org.jsoup.parser.Tokeniser tokeniser57 = new org.jsoup.parser.Tokeniser(characterReader56);
        tokeniser57.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState59 = tokeniser57.getState();
        tokeniser57.createTempBuffer();
        tokeniser57.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader62 = null;
        org.jsoup.parser.Tokeniser tokeniser63 = new org.jsoup.parser.Tokeniser(characterReader62);
        org.jsoup.parser.TokeniserState tokeniserState64 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser63.transition(tokeniserState64);
        org.jsoup.parser.Token.Comment comment66 = null;
        tokeniser63.commentPending = comment66;
        tokeniser63.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment70 = tokeniser63.commentPending;
        org.jsoup.parser.Token.Tag tag72 = tokeniser63.createTagPending(true);
        tokeniser57.tagPending = tag72;
        java.lang.StringBuilder stringBuilder74 = tokeniser57.dataBuffer;
        tokeniser43.dataBuffer = stringBuilder74;
        tokeniser26.dataBuffer = stringBuilder74;
        org.jsoup.parser.CharacterReader characterReader77 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState23.read(tokeniser26, characterReader77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype13);
        org.junit.Assert.assertNull(stringBuilder20);
        org.junit.Assert.assertNull(stringBuilder22);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tokeniserState34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(tokeniserState44);
        org.junit.Assert.assertNotNull(tokeniserState51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(tokeniserState59);
        org.junit.Assert.assertNotNull(tokeniserState64);
        org.junit.Assert.assertNull(comment70);
        org.junit.Assert.assertNotNull(tag72);
        org.junit.Assert.assertNotNull(stringBuilder74);
        org.junit.Assert.assertEquals(stringBuilder74.toString(), "");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        org.jsoup.parser.Token.Tag tag17 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        org.jsoup.parser.TokeniserState tokeniserState20 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser19.transition(tokeniserState20);
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser19.commentPending = comment22;
        tokeniser19.emit('\ufffd');
        tokeniser19.setTrackErrors(false);
        tokeniser19.createCommentPending();
        org.jsoup.parser.Token.Tag tag30 = tokeniser19.createTagPending(false);
        boolean boolean31 = tokeniser19.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState32 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_doubleQuoted;
        tokeniser19.eofError(tokeniserState32);
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        org.jsoup.parser.TokeniserState tokeniserState36 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser35.transition(tokeniserState36);
        tokeniser35.emit("hi!");
        org.jsoup.parser.Token.Tag tag40 = tokeniser35.tagPending;
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader41);
        tokeniser42.createDoctypePending();
        tokeniser42.createDoctypePending();
        org.jsoup.parser.Token.Comment comment45 = null;
        tokeniser42.commentPending = comment45;
        tokeniser42.createDoctypePending();
        tokeniser42.emit("");
        tokeniser42.createDoctypePending();
        org.jsoup.parser.Token.Comment comment51 = null;
        tokeniser42.commentPending = comment51;
        org.jsoup.parser.TokeniserState tokeniserState53 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser42.transition(tokeniserState53);
        tokeniser35.transition(tokeniserState53);
        tokeniser19.error(tokeniserState53);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tokeniserState32);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNull(tag40);
        org.junit.Assert.assertNotNull(tokeniserState53);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char11 = tokeniser1.consumeCharacterReference((java.lang.Character) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNotNull(tokeniserState8);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.emitDoctypePending();
        boolean boolean13 = tokeniser1.isTrackErrors();
        boolean boolean14 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag16 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser18.transition(tokeniserState19);
        org.jsoup.parser.Token.Comment comment21 = null;
        tokeniser18.commentPending = comment21;
        tokeniser18.emit('\ufffd');
        tokeniser18.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder27 = tokeniser18.dataBuffer;
        tokeniser18.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState29 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStartDash;
        tokeniser18.transition(tokeniserState29);
        tokeniser1.transition(tokeniserState29);
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        tokeniser33.createDoctypePending();
        org.jsoup.parser.Token.Comment comment35 = tokeniser33.commentPending;
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        tokeniser37.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState39 = tokeniser37.getState();
        org.jsoup.parser.Token.Tag tag41 = tokeniser37.createTagPending(false);
        tokeniser33.tagPending = tag41;
        org.jsoup.parser.TokeniserState tokeniserState43 = tokeniser33.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(stringBuilder27);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNull(comment35);
        org.junit.Assert.assertNotNull(tokeniserState39);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(tokeniserState43);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('a');
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag17 = tokeniser1.tagPending;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        org.jsoup.parser.TokeniserState tokeniserState21 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser20.transition(tokeniserState21);
        org.jsoup.parser.Token.Comment comment23 = null;
        tokeniser20.commentPending = comment23;
        tokeniser20.emit('\ufffd');
        tokeniser20.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder29 = tokeniser20.dataBuffer;
        tokeniser20.acknowledgeSelfClosingFlag();
        tokeniser20.acknowledgeSelfClosingFlag();
        tokeniser20.emit('a');
        boolean boolean34 = tokeniser20.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype35 = tokeniser20.doctypePending;
        org.jsoup.parser.Token.Tag tag36 = tokeniser20.tagPending;
        tokeniser20.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        org.jsoup.parser.TokeniserState tokeniserState40 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser39.transition(tokeniserState40);
        org.jsoup.parser.Token.Comment comment42 = null;
        tokeniser39.commentPending = comment42;
        tokeniser39.emit('\ufffd');
        tokeniser39.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState47 = tokeniser39.getState();
        boolean boolean48 = tokeniser39.currentNodeInHtmlNS();
        tokeniser39.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype50 = tokeniser39.doctypePending;
        tokeniser20.doctypePending = doctype50;
        org.jsoup.parser.CharacterReader characterReader52 = null;
        org.jsoup.parser.Tokeniser tokeniser53 = new org.jsoup.parser.Tokeniser(characterReader52);
        org.jsoup.parser.TokeniserState tokeniserState54 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser53.transition(tokeniserState54);
        org.jsoup.parser.TokeniserState tokeniserState56 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser53.transition(tokeniserState56);
        java.lang.StringBuilder stringBuilder58 = null;
        tokeniser53.dataBuffer = stringBuilder58;
        org.jsoup.parser.Token.Tag tag60 = tokeniser53.tagPending;
        org.jsoup.parser.CharacterReader characterReader61 = null;
        org.jsoup.parser.Tokeniser tokeniser62 = new org.jsoup.parser.Tokeniser(characterReader61);
        org.jsoup.parser.TokeniserState tokeniserState63 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser62.transition(tokeniserState63);
        org.jsoup.parser.Token.Comment comment65 = null;
        tokeniser62.commentPending = comment65;
        tokeniser62.emit('\ufffd');
        tokeniser62.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState70 = tokeniser62.getState();
        boolean boolean71 = tokeniser62.currentNodeInHtmlNS();
        tokeniser62.emitDoctypePending();
        tokeniser62.emit("");
        org.jsoup.parser.CharacterReader characterReader75 = null;
        org.jsoup.parser.Tokeniser tokeniser76 = new org.jsoup.parser.Tokeniser(characterReader75);
        tokeniser76.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState78 = tokeniser76.getState();
        tokeniser76.createTempBuffer();
        tokeniser76.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader81 = null;
        org.jsoup.parser.Tokeniser tokeniser82 = new org.jsoup.parser.Tokeniser(characterReader81);
        org.jsoup.parser.TokeniserState tokeniserState83 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser82.transition(tokeniserState83);
        org.jsoup.parser.Token.Comment comment85 = null;
        tokeniser82.commentPending = comment85;
        tokeniser82.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment89 = tokeniser82.commentPending;
        org.jsoup.parser.Token.Tag tag91 = tokeniser82.createTagPending(true);
        tokeniser76.tagPending = tag91;
        java.lang.StringBuilder stringBuilder93 = tokeniser76.dataBuffer;
        tokeniser62.dataBuffer = stringBuilder93;
        tokeniser53.dataBuffer = stringBuilder93;
        tokeniser20.dataBuffer = stringBuilder93;
        tokeniser1.dataBuffer = stringBuilder93;
        boolean boolean98 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createTempBuffer();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNull(tag17);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNull(stringBuilder29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(doctype35);
        org.junit.Assert.assertNull(tag36);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertNotNull(tokeniserState47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(doctype50);
        org.junit.Assert.assertNotNull(tokeniserState54);
        org.junit.Assert.assertNotNull(tokeniserState56);
        org.junit.Assert.assertNull(tag60);
        org.junit.Assert.assertNotNull(tokeniserState63);
        org.junit.Assert.assertNotNull(tokeniserState70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(tokeniserState78);
        org.junit.Assert.assertNotNull(tokeniserState83);
        org.junit.Assert.assertNull(comment89);
        org.junit.Assert.assertNotNull(tag91);
        org.junit.Assert.assertNotNull(stringBuilder93);
        org.junit.Assert.assertEquals(stringBuilder93.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('a');
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag17 = tokeniser1.tagPending;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        org.jsoup.parser.TokeniserState tokeniserState21 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser20.transition(tokeniserState21);
        org.jsoup.parser.Token.Comment comment23 = null;
        tokeniser20.commentPending = comment23;
        tokeniser20.emit('\ufffd');
        tokeniser20.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser20.getState();
        boolean boolean29 = tokeniser20.currentNodeInHtmlNS();
        tokeniser20.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype31 = tokeniser20.doctypePending;
        tokeniser1.doctypePending = doctype31;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        org.jsoup.parser.TokeniserState tokeniserState35 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser34.transition(tokeniserState35);
        org.jsoup.parser.TokeniserState tokeniserState37 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser34.transition(tokeniserState37);
        java.lang.StringBuilder stringBuilder39 = null;
        tokeniser34.dataBuffer = stringBuilder39;
        org.jsoup.parser.Token.Tag tag41 = tokeniser34.tagPending;
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader42);
        org.jsoup.parser.TokeniserState tokeniserState44 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser43.transition(tokeniserState44);
        org.jsoup.parser.Token.Comment comment46 = null;
        tokeniser43.commentPending = comment46;
        tokeniser43.emit('\ufffd');
        tokeniser43.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState51 = tokeniser43.getState();
        boolean boolean52 = tokeniser43.currentNodeInHtmlNS();
        tokeniser43.emitDoctypePending();
        tokeniser43.emit("");
        org.jsoup.parser.CharacterReader characterReader56 = null;
        org.jsoup.parser.Tokeniser tokeniser57 = new org.jsoup.parser.Tokeniser(characterReader56);
        tokeniser57.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState59 = tokeniser57.getState();
        tokeniser57.createTempBuffer();
        tokeniser57.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader62 = null;
        org.jsoup.parser.Tokeniser tokeniser63 = new org.jsoup.parser.Tokeniser(characterReader62);
        org.jsoup.parser.TokeniserState tokeniserState64 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser63.transition(tokeniserState64);
        org.jsoup.parser.Token.Comment comment66 = null;
        tokeniser63.commentPending = comment66;
        tokeniser63.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment70 = tokeniser63.commentPending;
        org.jsoup.parser.Token.Tag tag72 = tokeniser63.createTagPending(true);
        tokeniser57.tagPending = tag72;
        java.lang.StringBuilder stringBuilder74 = tokeniser57.dataBuffer;
        tokeniser43.dataBuffer = stringBuilder74;
        tokeniser34.dataBuffer = stringBuilder74;
        tokeniser1.dataBuffer = stringBuilder74;
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState79 = org.jsoup.parser.TokeniserState.AfterDoctypePublicKeyword;
        tokeniser1.eofError(tokeniserState79);
        org.jsoup.parser.CharacterReader characterReader81 = null;
        org.jsoup.parser.Tokeniser tokeniser82 = new org.jsoup.parser.Tokeniser(characterReader81);
        tokeniser82.createDoctypePending();
        tokeniser82.createDoctypePending();
        org.jsoup.parser.Token.Comment comment85 = null;
        tokeniser82.commentPending = comment85;
        org.jsoup.parser.Token.Doctype doctype87 = tokeniser82.doctypePending;
        org.jsoup.parser.CharacterReader characterReader88 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState79.read(tokeniser82, characterReader88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNull(tag17);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doctype31);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertNull(tag41);
        org.junit.Assert.assertNotNull(tokeniserState44);
        org.junit.Assert.assertNotNull(tokeniserState51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(tokeniserState59);
        org.junit.Assert.assertNotNull(tokeniserState64);
        org.junit.Assert.assertNull(comment70);
        org.junit.Assert.assertNotNull(tag72);
        org.junit.Assert.assertNotNull(stringBuilder74);
        org.junit.Assert.assertEquals(stringBuilder74.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState79);
        org.junit.Assert.assertNotNull(doctype87);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        tokeniser6.createDoctypePending();
        tokeniser6.createDoctypePending();
        tokeniser6.emitDoctypePending();
        tokeniser6.emit("");
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser13.transition(tokeniserState14);
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser13.commentPending = comment16;
        tokeniser13.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        org.jsoup.parser.TokeniserState tokeniserState22 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser21.transition(tokeniserState22);
        org.jsoup.parser.Token.Comment comment24 = null;
        tokeniser21.commentPending = comment24;
        tokeniser21.emit('\ufffd');
        tokeniser21.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder30 = tokeniser21.dataBuffer;
        tokeniser21.acknowledgeSelfClosingFlag();
        boolean boolean32 = tokeniser21.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag33 = tokeniser21.tagPending;
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        org.jsoup.parser.TokeniserState tokeniserState36 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser35.transition(tokeniserState36);
        org.jsoup.parser.Token.Comment comment38 = null;
        tokeniser35.commentPending = comment38;
        tokeniser35.emit('\ufffd');
        tokeniser35.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState43 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser35.transition(tokeniserState43);
        tokeniser35.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment46 = tokeniser35.commentPending;
        tokeniser21.emit((org.jsoup.parser.Token) comment46);
        tokeniser13.commentPending = comment46;
        tokeniser6.commentPending = comment46;
        tokeniser1.commentPending = comment46;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNull(stringBuilder30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(tag33);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNotNull(tokeniserState43);
        org.junit.Assert.assertNotNull(comment46);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapeStart;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser1.transition(tokeniserState12);
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        tokeniser1.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token17 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Tag tag15 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Tag tag16 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertNull(tag15);
        org.junit.Assert.assertNull(tag16);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDashDash;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.TokeniserState tokeniserState6 = org.jsoup.parser.TokeniserState.Data;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState6);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser1.transition(tokeniserState9);
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser15.transition(tokeniserState16);
        tokeniser15.setTrackErrors(true);
        tokeniser15.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.createDoctypePending();
        tokeniser23.createDoctypePending();
        org.jsoup.parser.Token.Comment comment26 = null;
        tokeniser23.commentPending = comment26;
        org.jsoup.parser.Token.Doctype doctype28 = tokeniser23.doctypePending;
        tokeniser15.emit((org.jsoup.parser.Token) doctype28);
        tokeniser1.doctypePending = doctype28;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(doctype28);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.createDoctypePending();
        tokeniser11.createDoctypePending();
        org.jsoup.parser.Token.Comment comment14 = null;
        tokeniser11.commentPending = comment14;
        boolean boolean16 = tokeniser11.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser11.getState();
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser11.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tokeniserState18);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        java.lang.StringBuilder stringBuilder6 = tokeniser1.dataBuffer;
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser9.transition(tokeniserState10);
        tokeniser9.emit("hi!");
        org.jsoup.parser.Token.Comment comment14 = tokeniser9.commentPending;
        java.lang.StringBuilder stringBuilder15 = null;
        tokeniser9.dataBuffer = stringBuilder15;
        tokeniser9.setTrackErrors(false);
        tokeniser9.emit(' ');
        tokeniser9.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        org.jsoup.parser.TokeniserState tokeniserState24 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser23.transition(tokeniserState24);
        org.jsoup.parser.Token.Comment comment26 = null;
        tokeniser23.commentPending = comment26;
        tokeniser23.emit('\ufffd');
        tokeniser23.createDoctypePending();
        boolean boolean31 = tokeniser23.currentNodeInHtmlNS();
        tokeniser23.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        org.jsoup.parser.TokeniserState tokeniserState35 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser34.transition(tokeniserState35);
        org.jsoup.parser.Token.Comment comment37 = null;
        tokeniser34.commentPending = comment37;
        tokeniser34.emit('\ufffd');
        tokeniser34.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState42 = tokeniser34.getState();
        boolean boolean43 = tokeniser34.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype44 = tokeniser34.doctypePending;
        org.jsoup.parser.Token.Doctype doctype45 = tokeniser34.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState46 = tokeniser34.getState();
        tokeniser23.transition(tokeniserState46);
        org.jsoup.parser.Token.Tag tag49 = tokeniser23.createTagPending(true);
        tokeniser9.emit((org.jsoup.parser.Token) tag49);
        tokeniser1.tagPending = tag49;
        org.jsoup.parser.CharacterReader characterReader52 = null;
        org.jsoup.parser.Tokeniser tokeniser53 = new org.jsoup.parser.Tokeniser(characterReader52);
        tokeniser53.createDoctypePending();
        tokeniser53.createDoctypePending();
        org.jsoup.parser.Token.Comment comment56 = null;
        tokeniser53.commentPending = comment56;
        boolean boolean58 = tokeniser53.isTrackErrors();
        boolean boolean59 = tokeniser53.isTrackErrors();
        tokeniser53.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState61 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        tokeniser53.transition(tokeniserState61);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(doctype44);
        org.junit.Assert.assertNotNull(doctype45);
        org.junit.Assert.assertNotNull(tokeniserState46);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(tokeniserState61);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Comment comment7 = null;
        tokeniser1.commentPending = comment7;
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.BeforeDoctypeSystemIdentifier;
        tokeniser1.transition(tokeniserState11);
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser1.doctypePending;
        java.lang.StringBuilder stringBuilder14 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        tokeniser16.createDoctypePending();
        tokeniser16.createDoctypePending();
        org.jsoup.parser.Token.Comment comment19 = null;
        tokeniser16.commentPending = comment19;
        java.lang.StringBuilder stringBuilder21 = tokeniser16.dataBuffer;
        tokeniser16.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser24.transition(tokeniserState25);
        org.jsoup.parser.Token.Comment comment27 = null;
        tokeniser24.commentPending = comment27;
        tokeniser24.emit('\ufffd');
        tokeniser24.createDoctypePending();
        tokeniser24.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        tokeniser34.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState36 = tokeniser34.getState();
        tokeniser34.createTempBuffer();
        tokeniser34.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader39);
        org.jsoup.parser.TokeniserState tokeniserState41 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser40.transition(tokeniserState41);
        org.jsoup.parser.Token.Comment comment43 = null;
        tokeniser40.commentPending = comment43;
        tokeniser40.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment47 = tokeniser40.commentPending;
        org.jsoup.parser.Token.Tag tag49 = tokeniser40.createTagPending(true);
        tokeniser34.tagPending = tag49;
        java.lang.StringBuilder stringBuilder51 = tokeniser34.dataBuffer;
        tokeniser24.dataBuffer = stringBuilder51;
        org.jsoup.parser.Token.Doctype doctype53 = tokeniser24.doctypePending;
        tokeniser16.doctypePending = doctype53;
        org.jsoup.parser.Token.Tag tag55 = tokeniser16.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState56 = org.jsoup.parser.TokeniserState.AttributeName;
        tokeniser16.transition(tokeniserState56);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNull(doctype13);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNull(stringBuilder21);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNotNull(tokeniserState41);
        org.junit.Assert.assertNull(comment47);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
        org.junit.Assert.assertNotNull(doctype53);
        org.junit.Assert.assertNull(tag55);
        org.junit.Assert.assertNotNull(tokeniserState56);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser12.transition(tokeniserState13);
        org.jsoup.parser.Token.Comment comment15 = null;
        tokeniser12.commentPending = comment15;
        tokeniser12.emit('\ufffd');
        tokeniser12.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser12.getState();
        boolean boolean21 = tokeniser12.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype22 = tokeniser12.doctypePending;
        org.jsoup.parser.Token.Doctype doctype23 = tokeniser12.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser12.getState();
        tokeniser1.transition(tokeniserState24);
        org.jsoup.parser.Token.Tag tag27 = tokeniser1.createTagPending(true);
        org.jsoup.parser.Token token28 = tokeniser1.read();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doctype22);
        org.junit.Assert.assertNotNull(doctype23);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(token28);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.emit('#');
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser13.transition(tokeniserState14);
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser13.getState();
        tokeniser13.acknowledgeSelfClosingFlag();
        tokeniser13.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState11.read(tokeniser13, characterReader19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(tokeniserState16);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.createDoctypePending();
        tokeniser8.createDoctypePending();
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser8.commentPending = comment11;
        tokeniser8.createDoctypePending();
        tokeniser8.emit("");
        tokeniser8.createDoctypePending();
        org.jsoup.parser.Token.Comment comment17 = null;
        tokeniser8.commentPending = comment17;
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser8.transition(tokeniserState19);
        tokeniser1.transition(tokeniserState19);
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser1.getState();
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token24 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tokeniserState22);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser1.dataBuffer = stringBuilder7;
        tokeniser1.setTrackErrors(false);
        tokeniser1.emit(' ');
        tokeniser1.createCommentPending();
        java.lang.StringBuilder stringBuilder14 = tokeniser1.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token15 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNull(stringBuilder14);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        tokeniser15.createDoctypePending();
        tokeniser15.createDoctypePending();
        org.jsoup.parser.Token.Comment comment18 = null;
        tokeniser15.commentPending = comment18;
        java.lang.StringBuilder stringBuilder20 = tokeniser15.dataBuffer;
        tokeniser15.emitDoctypePending();
        java.lang.StringBuilder stringBuilder22 = tokeniser15.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser15.getState();
        tokeniser1.transition(tokeniserState23);
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        org.jsoup.parser.TokeniserState tokeniserState27 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser26.transition(tokeniserState27);
        tokeniser26.emit("hi!");
        org.jsoup.parser.Token.Comment comment31 = null;
        tokeniser26.commentPending = comment31;
        tokeniser26.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState35 = tokeniser26.getState();
        java.lang.StringBuilder stringBuilder36 = tokeniser26.dataBuffer;
        tokeniser26.createTempBuffer();
        org.jsoup.parser.Token.Comment comment38 = tokeniser26.commentPending;
        org.jsoup.parser.CharacterReader characterReader39 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState23.read(tokeniser26, characterReader39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(doctype13);
        org.junit.Assert.assertNull(stringBuilder20);
        org.junit.Assert.assertNull(stringBuilder22);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNull(stringBuilder36);
        org.junit.Assert.assertNull(comment38);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag7 = null;
        tokeniser1.tagPending = tag7;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
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
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser9.transition(tokeniserState10);
        org.jsoup.parser.Token.Comment comment12 = null;
        tokeniser9.commentPending = comment12;
        tokeniser9.emit('\ufffd');
        tokeniser9.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser9.getState();
        tokeniser9.emit("hi!");
        tokeniser9.emitDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState21 = tokeniser9.getState();
        java.lang.StringBuilder stringBuilder22 = null;
        tokeniser9.dataBuffer = stringBuilder22;
        org.jsoup.parser.Token.Tag tag25 = tokeniser9.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag25);
        org.jsoup.parser.TokeniserState tokeniserState27 = org.jsoup.parser.TokeniserState.MarkupDeclarationOpen;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(tokeniserState27);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser8.transition(tokeniserState9);
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser8.commentPending = comment11;
        tokeniser8.emit('\ufffd');
        tokeniser8.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser8.transition(tokeniserState16);
        tokeniser8.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment19 = tokeniser8.commentPending;
        tokeniser1.commentPending = comment19;
        tokeniser1.createCommentPending();
        tokeniser1.emit('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(comment19);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser1.dataBuffer = stringBuilder7;
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser12.transition(tokeniserState13);
        org.jsoup.parser.Token.Comment comment15 = null;
        tokeniser12.commentPending = comment15;
        tokeniser12.emit('\ufffd');
        tokeniser12.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser12.getState();
        boolean boolean21 = tokeniser12.currentNodeInHtmlNS();
        tokeniser12.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype23 = tokeniser12.doctypePending;
        java.lang.StringBuilder stringBuilder24 = tokeniser12.dataBuffer;
        tokeniser12.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        org.jsoup.parser.TokeniserState tokeniserState28 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser27.transition(tokeniserState28);
        org.jsoup.parser.Token.Comment comment30 = null;
        tokeniser27.commentPending = comment30;
        tokeniser27.emit('\ufffd');
        tokeniser27.setTrackErrors(false);
        tokeniser27.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser27.getState();
        tokeniser12.transition(tokeniserState37);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doctype23);
        org.junit.Assert.assertNull(stringBuilder24);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertNotNull(tokeniserState37);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emitDoctypePending();
        tokeniser1.emit('#');
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser11.transition(tokeniserState12);
        org.jsoup.parser.Token.Comment comment14 = null;
        tokeniser11.commentPending = comment14;
        tokeniser11.emit('\ufffd');
        tokeniser11.setTrackErrors(false);
        tokeniser11.createCommentPending();
        org.jsoup.parser.Token.Tag tag22 = tokeniser11.createTagPending(false);
        boolean boolean23 = tokeniser11.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState24 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_doubleQuoted;
        tokeniser11.eofError(tokeniserState24);
        tokeniser1.transition(tokeniserState24);
        java.lang.Class<?> wildcardClass27 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.createTagPending(true);
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Doctype doctype9 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser11.transition(tokeniserState12);
        org.jsoup.parser.Token.Comment comment14 = null;
        tokeniser11.commentPending = comment14;
        tokeniser11.emit('\ufffd');
        tokeniser11.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser11.getState();
        tokeniser11.emit("hi!");
        tokeniser11.emitDoctypePending();
        boolean boolean23 = tokeniser11.isTrackErrors();
        boolean boolean24 = tokeniser11.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag26 = tokeniser11.createTagPending(true);
        tokeniser11.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        tokeniser29.createDoctypePending();
        tokeniser29.createDoctypePending();
        org.jsoup.parser.Token.Comment comment32 = null;
        tokeniser29.commentPending = comment32;
        boolean boolean34 = tokeniser29.isTrackErrors();
        boolean boolean35 = tokeniser29.isTrackErrors();
        tokeniser29.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState37 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        tokeniser29.transition(tokeniserState37);
        tokeniser29.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        org.jsoup.parser.TokeniserState tokeniserState42 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser41.transition(tokeniserState42);
        tokeniser41.emit("hi!");
        org.jsoup.parser.Token.Comment comment46 = null;
        tokeniser41.commentPending = comment46;
        tokeniser41.createCommentPending();
        org.jsoup.parser.Token.Comment comment49 = tokeniser41.commentPending;
        tokeniser29.commentPending = comment49;
        tokeniser11.commentPending = comment49;
        tokeniser1.commentPending = comment49;
        boolean boolean53 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState54 = org.jsoup.parser.TokeniserState.RCDATAEndTagName;
        tokeniser1.transition(tokeniserState54);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token56 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(doctype9);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertNotNull(comment49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(tokeniserState54);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.createDoctypePending();
        boolean boolean13 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        tokeniser15.createDoctypePending();
        org.jsoup.parser.Token.Tag tag18 = tokeniser15.createTagPending(true);
        tokeniser1.tagPending = tag18;
        java.lang.Class<?> wildcardClass20 = tag18.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataLessthanSign;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        tokeniser1.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.RawtextEndTagOpen;
        tokeniser1.transition(tokeniserState12);
        org.jsoup.parser.Token.Comment comment14 = tokeniser1.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(comment14);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        boolean boolean10 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        tokeniser12.createDoctypePending();
        tokeniser12.createDoctypePending();
        org.jsoup.parser.Token.Comment comment15 = null;
        tokeniser12.commentPending = comment15;
        org.jsoup.parser.Token.Doctype doctype17 = tokeniser12.doctypePending;
        tokeniser1.doctypePending = doctype17;
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype20 = null;
        tokeniser1.doctypePending = doctype20;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doctype17);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment3 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser5.getState();
        org.jsoup.parser.Token.Tag tag9 = tokeniser5.createTagPending(false);
        tokeniser1.tagPending = tag9;
        java.lang.Class<?> wildcardClass11 = tokeniser1.getClass();
        org.junit.Assert.assertNull(comment3);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('a');
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag17 = tokeniser1.tagPending;
        tokeniser1.createDoctypePending();
        tokeniser1.emitDoctypePending();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNull(tag17);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser1.transition(tokeniserState12);
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        tokeniser17.createDoctypePending();
        tokeniser17.createDoctypePending();
        org.jsoup.parser.Token.Comment comment20 = null;
        tokeniser17.commentPending = comment20;
        org.jsoup.parser.Token.Tag tag22 = tokeniser17.tagPending;
        java.lang.StringBuilder stringBuilder23 = tokeniser17.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState24 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser17.transition(tokeniserState24);
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        org.jsoup.parser.TokeniserState tokeniserState28 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser27.transition(tokeniserState28);
        org.jsoup.parser.Token.Comment comment30 = null;
        tokeniser27.commentPending = comment30;
        tokeniser27.emit('\ufffd');
        tokeniser27.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState35 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser27.transition(tokeniserState35);
        tokeniser27.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment38 = tokeniser27.commentPending;
        tokeniser17.commentPending = comment38;
        tokeniser1.commentPending = comment38;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader42);
        tokeniser43.createDoctypePending();
        tokeniser43.createDoctypePending();
        org.jsoup.parser.Token.Comment comment46 = null;
        tokeniser43.commentPending = comment46;
        org.jsoup.parser.Token.Doctype doctype48 = tokeniser43.doctypePending;
        org.jsoup.parser.Token.Tag tag49 = tokeniser43.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState50 = tokeniser43.getState();
        org.jsoup.parser.Token.Tag tag52 = tokeniser43.createTagPending(true);
        tokeniser1.emit((org.jsoup.parser.Token) tag52);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNull(tag22);
        org.junit.Assert.assertNull(stringBuilder23);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNotNull(comment38);
        org.junit.Assert.assertNotNull(doctype48);
        org.junit.Assert.assertNull(tag49);
        org.junit.Assert.assertNotNull(tokeniserState50);
        org.junit.Assert.assertNotNull(tag52);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        tokeniser1.emit(' ');
        org.jsoup.parser.Token.Tag tag11 = tokeniser1.tagPending;
        java.lang.Class<?> wildcardClass12 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(tag11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser1.transition(tokeniserState12);
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser18.transition(tokeniserState19);
        org.jsoup.parser.Token.Comment comment21 = null;
        tokeniser18.commentPending = comment21;
        tokeniser18.emit('\ufffd');
        tokeniser18.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder27 = tokeniser18.dataBuffer;
        tokeniser18.acknowledgeSelfClosingFlag();
        boolean boolean29 = tokeniser18.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag30 = tokeniser18.tagPending;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser32.transition(tokeniserState33);
        org.jsoup.parser.Token.Comment comment35 = null;
        tokeniser32.commentPending = comment35;
        tokeniser32.emit('\ufffd');
        tokeniser32.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState40 = tokeniser32.getState();
        boolean boolean41 = tokeniser32.currentNodeInHtmlNS();
        tokeniser32.emitDoctypePending();
        tokeniser32.emit("");
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader45);
        tokeniser46.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState48 = tokeniser46.getState();
        tokeniser46.createTempBuffer();
        tokeniser46.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader51);
        org.jsoup.parser.TokeniserState tokeniserState53 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser52.transition(tokeniserState53);
        org.jsoup.parser.Token.Comment comment55 = null;
        tokeniser52.commentPending = comment55;
        tokeniser52.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment59 = tokeniser52.commentPending;
        org.jsoup.parser.Token.Tag tag61 = tokeniser52.createTagPending(true);
        tokeniser46.tagPending = tag61;
        java.lang.StringBuilder stringBuilder63 = tokeniser46.dataBuffer;
        tokeniser32.dataBuffer = stringBuilder63;
        tokeniser18.dataBuffer = stringBuilder63;
        tokeniser1.dataBuffer = stringBuilder63;
        tokeniser1.createDoctypePending();
        boolean boolean68 = tokeniser1.isTrackErrors();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char71 = tokeniser1.consumeCharacterReference((java.lang.Character) '\ufffd', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(stringBuilder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(tag30);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tokeniserState48);
        org.junit.Assert.assertNotNull(tokeniserState53);
        org.junit.Assert.assertNull(comment59);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(stringBuilder63);
        org.junit.Assert.assertEquals(stringBuilder63.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        java.lang.StringBuilder stringBuilder6 = tokeniser1.dataBuffer;
        tokeniser1.emitDoctypePending();
        java.lang.Class<?> wildcardClass8 = tokeniser1.getClass();
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.createTempBuffer();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser7.transition(tokeniserState8);
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser7.commentPending = comment10;
        tokeniser7.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment14 = tokeniser7.commentPending;
        org.jsoup.parser.Token.Tag tag16 = tokeniser7.createTagPending(true);
        tokeniser1.tagPending = tag16;
        org.jsoup.parser.Token.Tag tag18 = tokeniser1.tagPending;
        boolean boolean19 = tokeniser1.isTrackErrors();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        tokeniser10.createDoctypePending();
        java.lang.StringBuilder stringBuilder12 = tokeniser10.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser14.getState();
        java.lang.StringBuilder stringBuilder17 = null;
        tokeniser14.dataBuffer = stringBuilder17;
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        tokeniser20.createDoctypePending();
        org.jsoup.parser.Token.Comment comment22 = tokeniser20.commentPending;
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser24.transition(tokeniserState25);
        org.jsoup.parser.Token.Comment comment27 = null;
        tokeniser24.commentPending = comment27;
        tokeniser24.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment31 = tokeniser24.commentPending;
        org.jsoup.parser.Token.Tag tag33 = tokeniser24.createTagPending(true);
        tokeniser20.emit((org.jsoup.parser.Token) tag33);
        tokeniser14.tagPending = tag33;
        tokeniser10.emit((org.jsoup.parser.Token) tag33);
        tokeniser10.setTrackErrors(true);
        org.jsoup.parser.Token.Comment comment39 = tokeniser10.commentPending;
        org.jsoup.parser.CharacterReader characterReader40 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState8.read(tokeniser10, characterReader40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNull(stringBuilder12);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNull(comment22);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNull(comment31);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNull(comment39);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        java.lang.StringBuilder stringBuilder6 = tokeniser1.dataBuffer;
        tokeniser1.emitDoctypePending();
        java.lang.StringBuilder stringBuilder8 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Tag tag10 = tokeniser1.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser12.transition(tokeniserState13);
        org.jsoup.parser.TokeniserState tokeniserState15 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser12.transition(tokeniserState15);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNull(stringBuilder8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState15);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        boolean boolean11 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser1.doctypePending;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doctype12);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser1.transition(tokeniserState12);
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser18.transition(tokeniserState19);
        org.jsoup.parser.Token.Comment comment21 = null;
        tokeniser18.commentPending = comment21;
        tokeniser18.emit('\ufffd');
        tokeniser18.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder27 = tokeniser18.dataBuffer;
        tokeniser18.acknowledgeSelfClosingFlag();
        boolean boolean29 = tokeniser18.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag30 = tokeniser18.tagPending;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser32.transition(tokeniserState33);
        org.jsoup.parser.Token.Comment comment35 = null;
        tokeniser32.commentPending = comment35;
        tokeniser32.emit('\ufffd');
        tokeniser32.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState40 = tokeniser32.getState();
        boolean boolean41 = tokeniser32.currentNodeInHtmlNS();
        tokeniser32.emitDoctypePending();
        tokeniser32.emit("");
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader45);
        tokeniser46.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState48 = tokeniser46.getState();
        tokeniser46.createTempBuffer();
        tokeniser46.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader51);
        org.jsoup.parser.TokeniserState tokeniserState53 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser52.transition(tokeniserState53);
        org.jsoup.parser.Token.Comment comment55 = null;
        tokeniser52.commentPending = comment55;
        tokeniser52.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment59 = tokeniser52.commentPending;
        org.jsoup.parser.Token.Tag tag61 = tokeniser52.createTagPending(true);
        tokeniser46.tagPending = tag61;
        java.lang.StringBuilder stringBuilder63 = tokeniser46.dataBuffer;
        tokeniser32.dataBuffer = stringBuilder63;
        tokeniser18.dataBuffer = stringBuilder63;
        tokeniser1.dataBuffer = stringBuilder63;
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Comment comment68 = tokeniser1.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(stringBuilder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(tag30);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tokeniserState48);
        org.junit.Assert.assertNotNull(tokeniserState53);
        org.junit.Assert.assertNull(comment59);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(stringBuilder63);
        org.junit.Assert.assertEquals(stringBuilder63.toString(), "");
        org.junit.Assert.assertNull(comment68);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('a');
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag17 = tokeniser1.tagPending;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        org.jsoup.parser.TokeniserState tokeniserState21 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser20.transition(tokeniserState21);
        org.jsoup.parser.Token.Comment comment23 = null;
        tokeniser20.commentPending = comment23;
        tokeniser20.emit('\ufffd');
        tokeniser20.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser20.getState();
        boolean boolean29 = tokeniser20.currentNodeInHtmlNS();
        tokeniser20.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype31 = tokeniser20.doctypePending;
        tokeniser1.doctypePending = doctype31;
        boolean boolean33 = tokeniser1.isTrackErrors();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char36 = tokeniser1.consumeCharacterReference((java.lang.Character) '\ufffd', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNull(tag17);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doctype31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BogusDoctype;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        org.jsoup.parser.TokeniserState tokeniserState3 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser2.transition(tokeniserState3);
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser2.commentPending = comment5;
        tokeniser2.emit('\ufffd');
        tokeniser2.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser2.transition(tokeniserState10);
        boolean boolean12 = tokeniser2.isTrackErrors();
        java.lang.StringBuilder stringBuilder13 = tokeniser2.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(stringBuilder13);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment4 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag5 = tokeniser1.tagPending;
        tokeniser1.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(comment4);
        org.junit.Assert.assertNull(tag5);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        java.lang.StringBuilder stringBuilder3 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser5.getState();
        java.lang.StringBuilder stringBuilder8 = null;
        tokeniser5.dataBuffer = stringBuilder8;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.createDoctypePending();
        org.jsoup.parser.Token.Comment comment13 = tokeniser11.commentPending;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser15.transition(tokeniserState16);
        org.jsoup.parser.Token.Comment comment18 = null;
        tokeniser15.commentPending = comment18;
        tokeniser15.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment22 = tokeniser15.commentPending;
        org.jsoup.parser.Token.Tag tag24 = tokeniser15.createTagPending(true);
        tokeniser11.emit((org.jsoup.parser.Token) tag24);
        tokeniser5.tagPending = tag24;
        tokeniser1.emit((org.jsoup.parser.Token) tag24);
        java.lang.Class<?> wildcardClass28 = tokeniser1.getClass();
        org.junit.Assert.assertNull(stringBuilder3);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNull(comment13);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNull(comment22);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser1.doctypePending;
        tokeniser1.emit("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNull(doctype13);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.createTempBuffer();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser7.transition(tokeniserState8);
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser7.commentPending = comment10;
        tokeniser7.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment14 = tokeniser7.commentPending;
        org.jsoup.parser.Token.Tag tag16 = tokeniser7.createTagPending(true);
        tokeniser1.tagPending = tag16;
        org.jsoup.parser.Token.Tag tag18 = tokeniser1.tagPending;
        boolean boolean19 = tokeniser1.isTrackErrors();
        boolean boolean20 = tokeniser1.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState21 = org.jsoup.parser.TokeniserState.BeforeDoctypeName;
        tokeniser1.transition(tokeniserState21);
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        tokeniser24.createDoctypePending();
        tokeniser24.createDoctypePending();
        org.jsoup.parser.Token.Comment comment27 = null;
        tokeniser24.commentPending = comment27;
        boolean boolean29 = tokeniser24.isTrackErrors();
        boolean boolean30 = tokeniser24.isTrackErrors();
        tokeniser24.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState32 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        tokeniser24.transition(tokeniserState32);
        tokeniser24.emit('a');
        tokeniser24.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        org.jsoup.parser.TokeniserState tokeniserState40 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser39.transition(tokeniserState40);
        org.jsoup.parser.TokeniserState tokeniserState42 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser39.transition(tokeniserState42);
        org.jsoup.parser.Token.Tag tag45 = tokeniser39.createTagPending(true);
        tokeniser24.tagPending = tag45;
        tokeniser1.tagPending = tag45;
        tokeniser1.emitTagPending();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tokeniserState32);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertNotNull(tag45);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser17.transition(tokeniserState18);
        tokeniser17.emit("hi!");
        org.jsoup.parser.Token.Comment comment22 = tokeniser17.commentPending;
        java.lang.StringBuilder stringBuilder23 = null;
        tokeniser17.dataBuffer = stringBuilder23;
        tokeniser17.setTrackErrors(false);
        tokeniser17.emit(' ');
        tokeniser17.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        org.jsoup.parser.TokeniserState tokeniserState32 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser31.transition(tokeniserState32);
        tokeniser31.emit("hi!");
        org.jsoup.parser.Token.Comment comment36 = null;
        tokeniser31.commentPending = comment36;
        tokeniser31.createCommentPending();
        org.jsoup.parser.Token.Comment comment39 = tokeniser31.commentPending;
        tokeniser17.commentPending = comment39;
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader41);
        org.jsoup.parser.TokeniserState tokeniserState43 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser42.transition(tokeniserState43);
        org.jsoup.parser.Token.Comment comment45 = null;
        tokeniser42.commentPending = comment45;
        tokeniser42.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader49 = null;
        org.jsoup.parser.Tokeniser tokeniser50 = new org.jsoup.parser.Tokeniser(characterReader49);
        org.jsoup.parser.TokeniserState tokeniserState51 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser50.transition(tokeniserState51);
        org.jsoup.parser.Token.Doctype doctype53 = tokeniser50.doctypePending;
        tokeniser50.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader56 = null;
        org.jsoup.parser.Tokeniser tokeniser57 = new org.jsoup.parser.Tokeniser(characterReader56);
        org.jsoup.parser.TokeniserState tokeniserState58 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser57.transition(tokeniserState58);
        org.jsoup.parser.Token.Comment comment60 = null;
        tokeniser57.commentPending = comment60;
        tokeniser57.emit('\ufffd');
        tokeniser57.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState65 = tokeniser57.getState();
        boolean boolean66 = tokeniser57.currentNodeInHtmlNS();
        tokeniser57.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype68 = tokeniser57.doctypePending;
        tokeniser50.doctypePending = doctype68;
        tokeniser42.doctypePending = doctype68;
        tokeniser17.emit((org.jsoup.parser.Token) doctype68);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit((org.jsoup.parser.Token) doctype68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNull(comment22);
        org.junit.Assert.assertNotNull(tokeniserState32);
        org.junit.Assert.assertNotNull(comment39);
        org.junit.Assert.assertNotNull(tokeniserState43);
        org.junit.Assert.assertNotNull(tokeniserState51);
        org.junit.Assert.assertNull(doctype53);
        org.junit.Assert.assertNotNull(tokeniserState58);
        org.junit.Assert.assertNotNull(tokeniserState65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(doctype68);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser1.transition(tokeniserState12);
        java.lang.StringBuilder stringBuilder14 = tokeniser1.dataBuffer;
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNull(stringBuilder14);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNull(tag8);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser1.transition(tokeniserState12);
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag17 = tokeniser1.tagPending;
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Tag tag19 = tokeniser1.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState20 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapeStart;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNull(tag17);
        org.junit.Assert.assertNull(tag19);
        org.junit.Assert.assertNotNull(tokeniserState20);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        boolean boolean8 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser9.transition(tokeniserState10);
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser9.doctypePending;
        tokeniser9.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        org.jsoup.parser.TokeniserState tokeniserState17 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser16.transition(tokeniserState17);
        org.jsoup.parser.Token.Comment comment19 = null;
        tokeniser16.commentPending = comment19;
        tokeniser16.emit('\ufffd');
        tokeniser16.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser16.getState();
        boolean boolean25 = tokeniser16.currentNodeInHtmlNS();
        tokeniser16.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype27 = tokeniser16.doctypePending;
        tokeniser9.doctypePending = doctype27;
        tokeniser1.doctypePending = doctype27;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit(' ');
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        org.jsoup.parser.TokeniserState tokeniserState35 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser34.transition(tokeniserState35);
        org.jsoup.parser.Token.Comment comment37 = null;
        tokeniser34.commentPending = comment37;
        tokeniser34.emit('\ufffd');
        tokeniser34.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState42 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser34.transition(tokeniserState42);
        tokeniser34.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment45 = tokeniser34.commentPending;
        tokeniser34.emitCommentPending();
        org.jsoup.parser.Token.Tag tag48 = tokeniser34.createTagPending(true);
        tokeniser1.tagPending = tag48;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doctype27);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertNotNull(comment45);
        org.junit.Assert.assertNotNull(tag48);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser7.transition(tokeniserState8);
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser7.commentPending = comment10;
        tokeniser7.emit('\ufffd');
        tokeniser7.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState15 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser7.transition(tokeniserState15);
        tokeniser7.acknowledgeSelfClosingFlag();
        tokeniser7.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        org.jsoup.parser.TokeniserState tokeniserState22 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser21.transition(tokeniserState22);
        tokeniser21.setTrackErrors(true);
        tokeniser21.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        tokeniser29.createDoctypePending();
        tokeniser29.createDoctypePending();
        org.jsoup.parser.Token.Comment comment32 = null;
        tokeniser29.commentPending = comment32;
        org.jsoup.parser.Token.Doctype doctype34 = tokeniser29.doctypePending;
        tokeniser21.emit((org.jsoup.parser.Token) doctype34);
        tokeniser7.doctypePending = doctype34;
        tokeniser1.doctypePending = doctype34;
        org.jsoup.parser.Token token38 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit(token38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNotNull(doctype34);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.createTagPending(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token7 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser1.transition(tokeniserState4);
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.createTagPending(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char10 = tokeniser1.consumeCharacterReference((java.lang.Character) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        tokeniser10.createDoctypePending();
        tokeniser10.createDoctypePending();
        org.jsoup.parser.Token.Comment comment13 = null;
        tokeniser10.commentPending = comment13;
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser10.doctypePending;
        org.jsoup.parser.Token.Tag tag16 = tokeniser10.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser10.getState();
        org.jsoup.parser.Token.Tag tag19 = tokeniser10.createTagPending(true);
        tokeniser10.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        tokeniser22.createTempBuffer();
        tokeniser22.createCommentPending();
        boolean boolean25 = tokeniser22.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        org.jsoup.parser.TokeniserState tokeniserState28 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser27.transition(tokeniserState28);
        tokeniser27.emit("hi!");
        org.jsoup.parser.Token.Comment comment32 = tokeniser27.commentPending;
        java.lang.StringBuilder stringBuilder33 = null;
        tokeniser27.dataBuffer = stringBuilder33;
        tokeniser27.setTrackErrors(false);
        tokeniser27.emit(' ');
        tokeniser27.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        org.jsoup.parser.TokeniserState tokeniserState42 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser41.transition(tokeniserState42);
        tokeniser41.emit("hi!");
        org.jsoup.parser.Token.Comment comment46 = null;
        tokeniser41.commentPending = comment46;
        tokeniser41.createCommentPending();
        org.jsoup.parser.Token.Comment comment49 = tokeniser41.commentPending;
        tokeniser27.commentPending = comment49;
        tokeniser22.commentPending = comment49;
        tokeniser10.commentPending = comment49;
        tokeniser1.emit((org.jsoup.parser.Token) comment49);
        java.lang.Class<?> wildcardClass54 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(doctype15);
        org.junit.Assert.assertNull(tag16);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertNull(comment32);
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertNotNull(comment49);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.createTempBuffer();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser7.transition(tokeniserState8);
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser7.commentPending = comment10;
        tokeniser7.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment14 = tokeniser7.commentPending;
        org.jsoup.parser.Token.Tag tag16 = tokeniser7.createTagPending(true);
        tokeniser1.tagPending = tag16;
        org.jsoup.parser.Token.Tag tag18 = tokeniser1.tagPending;
        boolean boolean19 = tokeniser1.isTrackErrors();
        boolean boolean20 = tokeniser1.isTrackErrors();
        java.lang.StringBuilder stringBuilder21 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.createDoctypePending();
        tokeniser23.createDoctypePending();
        org.jsoup.parser.Token.Comment comment26 = null;
        tokeniser23.commentPending = comment26;
        boolean boolean28 = tokeniser23.isTrackErrors();
        boolean boolean29 = tokeniser23.isTrackErrors();
        tokeniser23.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState31 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        tokeniser23.transition(tokeniserState31);
        tokeniser23.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        org.jsoup.parser.TokeniserState tokeniserState36 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser35.transition(tokeniserState36);
        tokeniser35.emit("hi!");
        org.jsoup.parser.Token.Comment comment40 = null;
        tokeniser35.commentPending = comment40;
        tokeniser35.createCommentPending();
        org.jsoup.parser.Token.Comment comment43 = tokeniser35.commentPending;
        tokeniser23.commentPending = comment43;
        tokeniser1.commentPending = comment43;
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader46);
        org.jsoup.parser.TokeniserState tokeniserState48 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser47.transition(tokeniserState48);
        org.jsoup.parser.TokeniserState tokeniserState50 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser47.transition(tokeniserState50);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNotNull(comment43);
        org.junit.Assert.assertNotNull(tokeniserState48);
        org.junit.Assert.assertNotNull(tokeniserState50);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        org.jsoup.parser.TokeniserState tokeniserState15 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser14.transition(tokeniserState15);
        org.jsoup.parser.Token.Comment comment17 = null;
        tokeniser14.commentPending = comment17;
        tokeniser14.emit('\ufffd');
        tokeniser14.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser14.getState();
        tokeniser14.emit("hi!");
        tokeniser14.emitDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser14.getState();
        java.lang.StringBuilder stringBuilder27 = null;
        tokeniser14.dataBuffer = stringBuilder27;
        org.jsoup.parser.Token.Tag tag30 = tokeniser14.createTagPending(true);
        tokeniser1.tagPending = tag30;
        org.jsoup.parser.TokeniserState tokeniserState32 = tokeniser1.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char35 = tokeniser1.consumeCharacterReference((java.lang.Character) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(tokeniserState32);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.createTempBuffer();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser7.transition(tokeniserState8);
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser7.commentPending = comment10;
        tokeniser7.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment14 = tokeniser7.commentPending;
        org.jsoup.parser.Token.Tag tag16 = tokeniser7.createTagPending(true);
        tokeniser1.tagPending = tag16;
        org.jsoup.parser.Token.Tag tag18 = tokeniser1.tagPending;
        boolean boolean19 = tokeniser1.isTrackErrors();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token20 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emit("hi!");
        tokeniser1.createDoctypePending();
        boolean boolean13 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        tokeniser15.createDoctypePending();
        org.jsoup.parser.Token.Comment comment17 = tokeniser15.commentPending;
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        org.jsoup.parser.TokeniserState tokeniserState20 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser19.transition(tokeniserState20);
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser19.commentPending = comment22;
        tokeniser19.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment26 = tokeniser19.commentPending;
        org.jsoup.parser.Token.Tag tag28 = tokeniser19.createTagPending(true);
        tokeniser15.emit((org.jsoup.parser.Token) tag28);
        tokeniser1.emit((org.jsoup.parser.Token) tag28);
        java.lang.Class<?> wildcardClass31 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(comment17);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNull(comment26);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(false);
        boolean boolean13 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_doubleQuoted;
        tokeniser1.eofError(tokeniserState14);
        tokeniser1.emitTagPending();
        tokeniser1.setTrackErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        java.lang.StringBuilder stringBuilder3 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.Tokeniser tokeniser5 = new org.jsoup.parser.Tokeniser(characterReader4);
        tokeniser5.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser5.getState();
        java.lang.StringBuilder stringBuilder8 = null;
        tokeniser5.dataBuffer = stringBuilder8;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.createDoctypePending();
        org.jsoup.parser.Token.Comment comment13 = tokeniser11.commentPending;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser15.transition(tokeniserState16);
        org.jsoup.parser.Token.Comment comment18 = null;
        tokeniser15.commentPending = comment18;
        tokeniser15.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment22 = tokeniser15.commentPending;
        org.jsoup.parser.Token.Tag tag24 = tokeniser15.createTagPending(true);
        tokeniser11.emit((org.jsoup.parser.Token) tag24);
        tokeniser5.tagPending = tag24;
        tokeniser1.emit((org.jsoup.parser.Token) tag24);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringBuilder3);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNull(comment13);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNull(comment22);
        org.junit.Assert.assertNotNull(tag24);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser1.dataBuffer = stringBuilder7;
        tokeniser1.setTrackErrors(false);
        tokeniser1.emit(' ');
        tokeniser1.createCommentPending();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Tag tag15 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = tag15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNull(tag15);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser1.commentPending = comment10;
        org.jsoup.parser.TokeniserState tokeniserState12 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser1.transition(tokeniserState12);
        java.lang.StringBuilder stringBuilder14 = null;
        tokeniser1.dataBuffer = stringBuilder14;
        tokeniser1.createDoctypePending();
        tokeniser1.emitDoctypePending();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState12);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        boolean boolean8 = tokeniser1.currentNodeInHtmlNS();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        tokeniser1.createCommentPending();
        tokeniser1.createCommentPending();
        java.lang.StringBuilder stringBuilder13 = tokeniser1.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNull(stringBuilder13);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emit('a');
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.acknowledgeSelfClosingFlag();
        java.lang.Class<?> wildcardClass17 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.setTrackErrors(true);
        java.lang.StringBuilder stringBuilder6 = tokeniser1.dataBuffer;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser9.transition(tokeniserState10);
        org.jsoup.parser.Token.Comment comment12 = null;
        tokeniser9.commentPending = comment12;
        tokeniser9.emit('\ufffd');
        tokeniser9.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder18 = tokeniser9.dataBuffer;
        tokeniser9.acknowledgeSelfClosingFlag();
        tokeniser9.acknowledgeSelfClosingFlag();
        tokeniser9.emit('a');
        boolean boolean23 = tokeniser9.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype24 = tokeniser9.doctypePending;
        org.jsoup.parser.Token.Tag tag25 = tokeniser9.tagPending;
        tokeniser9.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        org.jsoup.parser.TokeniserState tokeniserState29 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser28.transition(tokeniserState29);
        org.jsoup.parser.Token.Comment comment31 = null;
        tokeniser28.commentPending = comment31;
        tokeniser28.emit('\ufffd');
        tokeniser28.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState36 = tokeniser28.getState();
        boolean boolean37 = tokeniser28.currentNodeInHtmlNS();
        tokeniser28.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype39 = tokeniser28.doctypePending;
        tokeniser9.doctypePending = doctype39;
        tokeniser1.emit((org.jsoup.parser.Token) doctype39);
        java.lang.Class<?> wildcardClass42 = doctype39.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(stringBuilder18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(doctype24);
        org.junit.Assert.assertNull(tag25);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doctype39);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }
}

