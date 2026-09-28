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
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        java.lang.StringBuilder stringBuilder6 = tokeniser1.dataBuffer;
        tokeniser1.emitDoctypePending();
        java.lang.StringBuilder stringBuilder8 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Tag tag10 = tokeniser1.createTagPending(true);
        org.jsoup.parser.Token.Comment comment11 = tokeniser1.commentPending;
        boolean boolean12 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createDoctypePending();
        boolean boolean14 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNull(stringBuilder8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(comment11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
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
        tokeniser1.emit("");
        java.lang.StringBuilder stringBuilder23 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Tag tag25 = tokeniser1.createTagPending(false);
        boolean boolean26 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emitDoctypePending();
        tokeniser1.createTempBuffer();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(comment19);
        org.junit.Assert.assertNull(stringBuilder23);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
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
        tokeniser1.setTrackErrors(false);
        tokeniser1.setTrackErrors(false);
        tokeniser1.emit("hi!");
        tokeniser1.emitDoctypePending();
        tokeniser1.createDoctypePending();
        boolean boolean37 = tokeniser1.isTrackErrors();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doctype24);
        org.junit.Assert.assertNull(comment27);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
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
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser1.doctypePending;
        java.lang.StringBuilder stringBuilder17 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        org.jsoup.parser.TokeniserState tokeniserState20 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser19.transition(tokeniserState20);
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser19.commentPending = comment22;
        tokeniser19.emit('\ufffd');
        tokeniser19.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder28 = tokeniser19.dataBuffer;
        tokeniser19.acknowledgeSelfClosingFlag();
        tokeniser19.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        tokeniser33.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment36 = tokeniser33.commentPending;
        org.jsoup.parser.Token.Tag tag37 = tokeniser33.tagPending;
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        org.jsoup.parser.TokeniserState tokeniserState40 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser39.transition(tokeniserState40);
        org.jsoup.parser.Token.Comment comment42 = null;
        tokeniser39.commentPending = comment42;
        tokeniser39.emit('\ufffd');
        tokeniser39.createDoctypePending();
        tokeniser39.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype48 = tokeniser39.doctypePending;
        tokeniser33.doctypePending = doctype48;
        tokeniser19.doctypePending = doctype48;
        tokeniser1.doctypePending = doctype48;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(doctype15);
        org.junit.Assert.assertNotNull(doctype16);
        org.junit.Assert.assertNull(stringBuilder17);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNull(stringBuilder28);
        org.junit.Assert.assertNull(comment36);
        org.junit.Assert.assertNull(tag37);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertNotNull(doctype48);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.tagPending;
        tokeniser1.emit("");
        java.lang.StringBuilder stringBuilder7 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Comment comment8 = null;
        tokeniser1.commentPending = comment8;
        tokeniser1.emit('\ufffd');
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertNull(stringBuilder7);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
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
        tokeniser1.createTempBuffer();
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader37);
        org.jsoup.parser.TokeniserState tokeniserState39 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser38.transition(tokeniserState39);
        org.jsoup.parser.TokeniserState tokeniserState41 = tokeniser38.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState41);
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
        org.junit.Assert.assertNotNull(doctype32);
        org.junit.Assert.assertNotNull(tokeniserState39);
        org.junit.Assert.assertNotNull(tokeniserState41);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag10 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Comment comment11 = tokeniser1.commentPending;
        tokeniser1.createCommentPending();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(tag10);
        org.junit.Assert.assertNull(comment11);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
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
        org.jsoup.parser.Token.Comment comment18 = null;
        tokeniser15.commentPending = comment18;
        tokeniser15.emit('\ufffd');
        tokeniser15.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder24 = tokeniser15.dataBuffer;
        tokeniser15.acknowledgeSelfClosingFlag();
        tokeniser15.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        tokeniser28.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState30 = tokeniser28.getState();
        tokeniser28.createTempBuffer();
        tokeniser28.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        org.jsoup.parser.TokeniserState tokeniserState35 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser34.transition(tokeniserState35);
        org.jsoup.parser.Token.Comment comment37 = null;
        tokeniser34.commentPending = comment37;
        tokeniser34.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment41 = tokeniser34.commentPending;
        org.jsoup.parser.Token.Tag tag43 = tokeniser34.createTagPending(true);
        tokeniser28.tagPending = tag43;
        java.lang.StringBuilder stringBuilder45 = tokeniser28.dataBuffer;
        tokeniser15.dataBuffer = stringBuilder45;
        tokeniser1.dataBuffer = stringBuilder45;
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Comment comment49 = tokeniser1.commentPending;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(comment12);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNull(stringBuilder24);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNull(comment41);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertNotNull(comment49);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
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
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        tokeniser12.createDoctypePending();
        java.lang.StringBuilder stringBuilder14 = tokeniser12.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        tokeniser16.createDoctypePending();
        tokeniser16.createDoctypePending();
        org.jsoup.parser.Token.Comment comment19 = null;
        tokeniser16.commentPending = comment19;
        tokeniser16.acknowledgeSelfClosingFlag();
        java.lang.StringBuilder stringBuilder22 = tokeniser16.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser24.transition(tokeniserState25);
        org.jsoup.parser.Token.Comment comment27 = null;
        tokeniser24.commentPending = comment27;
        tokeniser24.emit('\ufffd');
        tokeniser24.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder33 = tokeniser24.dataBuffer;
        tokeniser24.acknowledgeSelfClosingFlag();
        tokeniser24.acknowledgeSelfClosingFlag();
        tokeniser24.emit('a');
        boolean boolean38 = tokeniser24.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype39 = tokeniser24.doctypePending;
        org.jsoup.parser.Token.Tag tag40 = tokeniser24.tagPending;
        tokeniser24.createDoctypePending();
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
        org.jsoup.parser.Token.Doctype doctype54 = tokeniser43.doctypePending;
        tokeniser24.doctypePending = doctype54;
        tokeniser16.doctypePending = doctype54;
        tokeniser12.emit((org.jsoup.parser.Token) doctype54);
        tokeniser1.emit((org.jsoup.parser.Token) doctype54);
        boolean boolean59 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emit('\ufffd');
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNull(stringBuilder22);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNull(stringBuilder33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(doctype39);
        org.junit.Assert.assertNull(tag40);
        org.junit.Assert.assertNotNull(tokeniserState44);
        org.junit.Assert.assertNotNull(tokeniserState51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(doctype54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
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
        boolean boolean12 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag14 = tokeniser1.createTagPending(false);
        tokeniser1.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token16 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        boolean boolean7 = tokeniser1.isTrackErrors();
        tokeniser1.emitDoctypePending();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.createDoctypePending();
        tokeniser11.createDoctypePending();
        org.jsoup.parser.Token.Comment comment14 = null;
        tokeniser11.commentPending = comment14;
        boolean boolean16 = tokeniser11.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser18.transition(tokeniserState19);
        org.jsoup.parser.Token.Comment comment21 = null;
        tokeniser18.commentPending = comment21;
        tokeniser18.emit('\ufffd');
        tokeniser18.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState26 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser18.transition(tokeniserState26);
        tokeniser18.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment29 = tokeniser18.commentPending;
        tokeniser11.commentPending = comment29;
        tokeniser11.emit("");
        java.lang.StringBuilder stringBuilder33 = tokeniser11.dataBuffer;
        boolean boolean34 = tokeniser11.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        org.jsoup.parser.TokeniserState tokeniserState37 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser36.transition(tokeniserState37);
        org.jsoup.parser.Token.Comment comment39 = null;
        tokeniser36.commentPending = comment39;
        tokeniser36.emit('\ufffd');
        tokeniser36.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState44 = tokeniser36.getState();
        tokeniser36.emit("hi!");
        tokeniser36.emitDoctypePending();
        boolean boolean48 = tokeniser36.isTrackErrors();
        boolean boolean49 = tokeniser36.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag51 = tokeniser36.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader52 = null;
        org.jsoup.parser.Tokeniser tokeniser53 = new org.jsoup.parser.Tokeniser(characterReader52);
        org.jsoup.parser.TokeniserState tokeniserState54 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser53.transition(tokeniserState54);
        org.jsoup.parser.Token.Comment comment56 = null;
        tokeniser53.commentPending = comment56;
        tokeniser53.emit('\ufffd');
        tokeniser53.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState61 = tokeniser53.getState();
        boolean boolean62 = tokeniser53.currentNodeInHtmlNS();
        tokeniser53.emitDoctypePending();
        tokeniser53.emit("");
        org.jsoup.parser.CharacterReader characterReader66 = null;
        org.jsoup.parser.Tokeniser tokeniser67 = new org.jsoup.parser.Tokeniser(characterReader66);
        tokeniser67.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState69 = tokeniser67.getState();
        tokeniser67.createTempBuffer();
        tokeniser67.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader72 = null;
        org.jsoup.parser.Tokeniser tokeniser73 = new org.jsoup.parser.Tokeniser(characterReader72);
        org.jsoup.parser.TokeniserState tokeniserState74 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser73.transition(tokeniserState74);
        org.jsoup.parser.Token.Comment comment76 = null;
        tokeniser73.commentPending = comment76;
        tokeniser73.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment80 = tokeniser73.commentPending;
        org.jsoup.parser.Token.Tag tag82 = tokeniser73.createTagPending(true);
        tokeniser67.tagPending = tag82;
        java.lang.StringBuilder stringBuilder84 = tokeniser67.dataBuffer;
        tokeniser53.dataBuffer = stringBuilder84;
        tokeniser36.dataBuffer = stringBuilder84;
        tokeniser11.dataBuffer = stringBuilder84;
        tokeniser1.dataBuffer = stringBuilder84;
        org.jsoup.parser.Token.Tag tag90 = tokeniser1.createTagPending(true);
        org.jsoup.parser.Token.Comment comment91 = tokeniser1.commentPending;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNotNull(comment29);
        org.junit.Assert.assertNull(stringBuilder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertNotNull(tokeniserState44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(tokeniserState54);
        org.junit.Assert.assertNotNull(tokeniserState61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(tokeniserState69);
        org.junit.Assert.assertNotNull(tokeniserState74);
        org.junit.Assert.assertNull(comment80);
        org.junit.Assert.assertNotNull(tag82);
        org.junit.Assert.assertNotNull(stringBuilder84);
        org.junit.Assert.assertEquals(stringBuilder84.toString(), "");
        org.junit.Assert.assertNotNull(tag90);
        org.junit.Assert.assertNotNull(comment91);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
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
        org.jsoup.parser.TokeniserState tokeniserState20 = org.jsoup.parser.TokeniserState.BeforeDoctypeName;
        tokeniser1.eofError(tokeniserState20);
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.createDoctypePending();
        tokeniser23.createDoctypePending();
        org.jsoup.parser.Token.Comment comment26 = null;
        tokeniser23.commentPending = comment26;
        boolean boolean28 = tokeniser23.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        org.jsoup.parser.TokeniserState tokeniserState31 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser30.transition(tokeniserState31);
        org.jsoup.parser.Token.Comment comment33 = null;
        tokeniser30.commentPending = comment33;
        tokeniser30.emit('\ufffd');
        tokeniser30.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState38 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser30.transition(tokeniserState38);
        tokeniser30.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment41 = tokeniser30.commentPending;
        tokeniser23.commentPending = comment41;
        tokeniser23.emit("");
        java.lang.StringBuilder stringBuilder45 = tokeniser23.dataBuffer;
        org.jsoup.parser.Token.Tag tag47 = tokeniser23.createTagPending(false);
        tokeniser23.emitTagPending();
        org.jsoup.parser.TokeniserState tokeniserState49 = tokeniser23.getState();
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader50);
        tokeniser51.createDoctypePending();
        tokeniser51.createDoctypePending();
        org.jsoup.parser.Token.Comment comment54 = null;
        tokeniser51.commentPending = comment54;
        tokeniser51.createDoctypePending();
        tokeniser51.emit("");
        org.jsoup.parser.Token.Comment comment59 = tokeniser51.commentPending;
        tokeniser51.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader61 = null;
        org.jsoup.parser.Tokeniser tokeniser62 = new org.jsoup.parser.Tokeniser(characterReader61);
        org.jsoup.parser.TokeniserState tokeniserState63 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser62.transition(tokeniserState63);
        tokeniser62.emit("hi!");
        org.jsoup.parser.Token.Comment comment67 = tokeniser62.commentPending;
        java.lang.StringBuilder stringBuilder68 = null;
        tokeniser62.dataBuffer = stringBuilder68;
        tokeniser62.setTrackErrors(false);
        tokeniser62.emit(' ');
        tokeniser62.createCommentPending();
        tokeniser62.createTempBuffer();
        java.lang.StringBuilder stringBuilder76 = tokeniser62.dataBuffer;
        tokeniser51.dataBuffer = stringBuilder76;
        tokeniser23.dataBuffer = stringBuilder76;
        tokeniser1.dataBuffer = stringBuilder76;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNotNull(tokeniserState38);
        org.junit.Assert.assertNotNull(comment41);
        org.junit.Assert.assertNull(stringBuilder45);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(tokeniserState49);
        org.junit.Assert.assertNull(comment59);
        org.junit.Assert.assertNotNull(tokeniserState63);
        org.junit.Assert.assertNull(comment67);
        org.junit.Assert.assertNotNull(stringBuilder76);
        org.junit.Assert.assertEquals(stringBuilder76.toString(), "");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
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
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader27);
        tokeniser28.createDoctypePending();
        tokeniser28.createDoctypePending();
        org.jsoup.parser.Token.Comment comment31 = null;
        tokeniser28.commentPending = comment31;
        java.lang.StringBuilder stringBuilder33 = tokeniser28.dataBuffer;
        tokeniser28.emitDoctypePending();
        java.lang.StringBuilder stringBuilder35 = tokeniser28.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState36 = tokeniser28.getState();
        tokeniser1.transition(tokeniserState36);
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype39 = tokeniser1.doctypePending;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState41 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        tokeniser1.transition(tokeniserState41);
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader43);
        org.jsoup.parser.TokeniserState tokeniserState45 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser44.transition(tokeniserState45);
        org.jsoup.parser.Token.Comment comment47 = null;
        tokeniser44.commentPending = comment47;
        tokeniser44.emit('\ufffd');
        tokeniser44.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState52 = tokeniser44.getState();
        boolean boolean53 = tokeniser44.currentNodeInHtmlNS();
        tokeniser44.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype55 = tokeniser44.doctypePending;
        java.lang.StringBuilder stringBuilder56 = tokeniser44.dataBuffer;
        tokeniser44.createTempBuffer();
        boolean boolean58 = tokeniser44.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader59 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState41.read(tokeniser44, characterReader59);
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
        org.junit.Assert.assertNull(stringBuilder33);
        org.junit.Assert.assertNull(stringBuilder35);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNotNull(doctype39);
        org.junit.Assert.assertNotNull(tokeniserState41);
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertNotNull(tokeniserState52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(doctype55);
        org.junit.Assert.assertNull(stringBuilder56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
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
        org.jsoup.parser.Token.Comment comment13 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        tokeniser15.createDoctypePending();
        tokeniser15.createDoctypePending();
        org.jsoup.parser.Token.Comment comment18 = null;
        tokeniser15.commentPending = comment18;
        org.jsoup.parser.Token.Doctype doctype20 = tokeniser15.doctypePending;
        org.jsoup.parser.Token.Tag tag21 = tokeniser15.tagPending;
        boolean boolean22 = tokeniser15.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        tokeniser24.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser24.getState();
        tokeniser24.createTempBuffer();
        tokeniser24.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        org.jsoup.parser.TokeniserState tokeniserState31 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser30.transition(tokeniserState31);
        org.jsoup.parser.Token.Comment comment33 = null;
        tokeniser30.commentPending = comment33;
        tokeniser30.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment37 = tokeniser30.commentPending;
        org.jsoup.parser.Token.Tag tag39 = tokeniser30.createTagPending(true);
        tokeniser24.tagPending = tag39;
        org.jsoup.parser.Token.Tag tag41 = tokeniser24.tagPending;
        tokeniser15.tagPending = tag41;
        tokeniser1.tagPending = tag41;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char46 = tokeniser1.consumeCharacterReference((java.lang.Character) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(comment13);
        org.junit.Assert.assertNotNull(doctype20);
        org.junit.Assert.assertNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNull(comment37);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(tag41);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Comment comment11 = tokeniser1.commentPending;
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        org.jsoup.parser.TokeniserState tokeniserState15 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser14.transition(tokeniserState15);
        org.jsoup.parser.Token.Comment comment17 = null;
        tokeniser14.commentPending = comment17;
        tokeniser14.emit('\ufffd');
        tokeniser14.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder23 = tokeniser14.dataBuffer;
        tokeniser14.acknowledgeSelfClosingFlag();
        tokeniser14.acknowledgeSelfClosingFlag();
        tokeniser14.emit('a');
        boolean boolean28 = tokeniser14.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype29 = tokeniser14.doctypePending;
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        org.jsoup.parser.TokeniserState tokeniserState32 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser31.transition(tokeniserState32);
        tokeniser31.setTrackErrors(true);
        tokeniser31.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        tokeniser39.createDoctypePending();
        tokeniser39.createDoctypePending();
        org.jsoup.parser.Token.Comment comment42 = null;
        tokeniser39.commentPending = comment42;
        org.jsoup.parser.Token.Doctype doctype44 = tokeniser39.doctypePending;
        tokeniser31.emit((org.jsoup.parser.Token) doctype44);
        tokeniser14.doctypePending = doctype44;
        tokeniser14.emitDoctypePending();
        tokeniser14.createTempBuffer();
        tokeniser14.createTempBuffer();
        tokeniser14.createTempBuffer();
        java.lang.StringBuilder stringBuilder51 = tokeniser14.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder51;
        java.lang.StringBuilder stringBuilder53 = tokeniser1.dataBuffer;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertNull(comment11);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNull(stringBuilder23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(doctype29);
        org.junit.Assert.assertNotNull(tokeniserState32);
        org.junit.Assert.assertNotNull(doctype44);
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder53);
        org.junit.Assert.assertEquals(stringBuilder53.toString(), "");
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
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
        tokeniser1.acknowledgeSelfClosingFlag();
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
        org.jsoup.parser.Token.Doctype doctype30 = tokeniser20.doctypePending;
        org.jsoup.parser.Token.Doctype doctype31 = tokeniser20.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState32 = tokeniser20.getState();
        tokeniser1.eofError(tokeniserState32);
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
        tokeniser35.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader48 = null;
        org.jsoup.parser.Tokeniser tokeniser49 = new org.jsoup.parser.Tokeniser(characterReader48);
        org.jsoup.parser.TokeniserState tokeniserState50 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser49.transition(tokeniserState50);
        tokeniser49.setTrackErrors(true);
        tokeniser49.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader56 = null;
        org.jsoup.parser.Tokeniser tokeniser57 = new org.jsoup.parser.Tokeniser(characterReader56);
        tokeniser57.createDoctypePending();
        tokeniser57.createDoctypePending();
        org.jsoup.parser.Token.Comment comment60 = null;
        tokeniser57.commentPending = comment60;
        org.jsoup.parser.Token.Doctype doctype62 = tokeniser57.doctypePending;
        tokeniser49.emit((org.jsoup.parser.Token) doctype62);
        tokeniser35.doctypePending = doctype62;
        org.jsoup.parser.Token.Doctype doctype65 = tokeniser35.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState66 = tokeniser35.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState66);
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
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doctype30);
        org.junit.Assert.assertNotNull(doctype31);
        org.junit.Assert.assertNotNull(tokeniserState32);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNotNull(tokeniserState43);
        org.junit.Assert.assertNotNull(tokeniserState50);
        org.junit.Assert.assertNotNull(doctype62);
        org.junit.Assert.assertNotNull(doctype65);
        org.junit.Assert.assertNotNull(tokeniserState66);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        tokeniser1.emit('4');
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        org.jsoup.parser.TokeniserState tokeniserState15 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser14.transition(tokeniserState15);
        tokeniser14.setTrackErrors(true);
        tokeniser14.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        tokeniser22.createDoctypePending();
        tokeniser22.createDoctypePending();
        org.jsoup.parser.Token.Comment comment25 = null;
        tokeniser22.commentPending = comment25;
        org.jsoup.parser.Token.Doctype doctype27 = tokeniser22.doctypePending;
        tokeniser14.emit((org.jsoup.parser.Token) doctype27);
        tokeniser14.acknowledgeSelfClosingFlag();
        tokeniser14.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        tokeniser32.createDoctypePending();
        org.jsoup.parser.Token.Comment comment34 = tokeniser32.commentPending;
        tokeniser32.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype36 = tokeniser32.doctypePending;
        org.jsoup.parser.Token.Tag tag37 = tokeniser32.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState38 = tokeniser32.getState();
        tokeniser14.transition(tokeniserState38);
        org.jsoup.parser.Token token40 = tokeniser14.read();
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader41);
        org.jsoup.parser.TokeniserState tokeniserState43 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser42.transition(tokeniserState43);
        org.jsoup.parser.Token.Comment comment45 = null;
        tokeniser42.commentPending = comment45;
        tokeniser42.emit('\ufffd');
        tokeniser42.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader50);
        tokeniser51.createDoctypePending();
        tokeniser51.createDoctypePending();
        org.jsoup.parser.Token.Comment comment54 = null;
        tokeniser51.commentPending = comment54;
        org.jsoup.parser.Token.Doctype doctype56 = tokeniser51.doctypePending;
        org.jsoup.parser.Token.Tag tag57 = tokeniser51.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState58 = tokeniser51.getState();
        org.jsoup.parser.Token.Tag tag60 = tokeniser51.createTagPending(true);
        tokeniser51.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader62 = null;
        org.jsoup.parser.Tokeniser tokeniser63 = new org.jsoup.parser.Tokeniser(characterReader62);
        tokeniser63.createTempBuffer();
        tokeniser63.createCommentPending();
        boolean boolean66 = tokeniser63.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader67 = null;
        org.jsoup.parser.Tokeniser tokeniser68 = new org.jsoup.parser.Tokeniser(characterReader67);
        org.jsoup.parser.TokeniserState tokeniserState69 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser68.transition(tokeniserState69);
        tokeniser68.emit("hi!");
        org.jsoup.parser.Token.Comment comment73 = tokeniser68.commentPending;
        java.lang.StringBuilder stringBuilder74 = null;
        tokeniser68.dataBuffer = stringBuilder74;
        tokeniser68.setTrackErrors(false);
        tokeniser68.emit(' ');
        tokeniser68.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader81 = null;
        org.jsoup.parser.Tokeniser tokeniser82 = new org.jsoup.parser.Tokeniser(characterReader81);
        org.jsoup.parser.TokeniserState tokeniserState83 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser82.transition(tokeniserState83);
        tokeniser82.emit("hi!");
        org.jsoup.parser.Token.Comment comment87 = null;
        tokeniser82.commentPending = comment87;
        tokeniser82.createCommentPending();
        org.jsoup.parser.Token.Comment comment90 = tokeniser82.commentPending;
        tokeniser68.commentPending = comment90;
        tokeniser63.commentPending = comment90;
        tokeniser51.commentPending = comment90;
        tokeniser42.emit((org.jsoup.parser.Token) comment90);
        tokeniser14.commentPending = comment90;
        tokeniser1.emit((org.jsoup.parser.Token) comment90);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(doctype27);
        org.junit.Assert.assertNull(comment34);
        org.junit.Assert.assertNotNull(doctype36);
        org.junit.Assert.assertNull(tag37);
        org.junit.Assert.assertNotNull(tokeniserState38);
        org.junit.Assert.assertNotNull(token40);
        org.junit.Assert.assertNotNull(tokeniserState43);
        org.junit.Assert.assertNotNull(doctype56);
        org.junit.Assert.assertNull(tag57);
        org.junit.Assert.assertNotNull(tokeniserState58);
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(tokeniserState69);
        org.junit.Assert.assertNull(comment73);
        org.junit.Assert.assertNotNull(tokeniserState83);
        org.junit.Assert.assertNotNull(comment90);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
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
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser1.doctypePending;
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser1.doctypePending;
        tokeniser1.setTrackErrors(true);
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNull(comment12);
        org.junit.Assert.assertNotNull(doctype13);
        org.junit.Assert.assertNotNull(doctype15);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
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
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser16.transition(tokeniserState19);
        org.jsoup.parser.Token.Tag tag22 = tokeniser16.createTagPending(true);
        tokeniser1.tagPending = tag22;
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Tag tag27 = tokeniser1.createTagPending(false);
        tokeniser1.createCommentPending();
        tokeniser1.createDoctypePending();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(tag27);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
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
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.createDoctypePending();
        tokeniser23.createDoctypePending();
        org.jsoup.parser.Token.Comment comment26 = null;
        tokeniser23.commentPending = comment26;
        tokeniser23.createDoctypePending();
        tokeniser23.emit("");
        tokeniser23.createDoctypePending();
        org.jsoup.parser.Token.Comment comment32 = null;
        tokeniser23.commentPending = comment32;
        org.jsoup.parser.TokeniserState tokeniserState34 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser23.transition(tokeniserState34);
        java.lang.StringBuilder stringBuilder36 = null;
        tokeniser23.dataBuffer = stringBuilder36;
        org.jsoup.parser.Token.Doctype doctype38 = tokeniser23.doctypePending;
        tokeniser1.doctypePending = doctype38;
        boolean boolean40 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createTempBuffer();
        java.lang.StringBuilder stringBuilder42 = tokeniser1.dataBuffer;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doctype17);
        org.junit.Assert.assertNotNull(tokeniserState34);
        org.junit.Assert.assertNotNull(doctype38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
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
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.createDoctypePending();
        tokeniser23.createDoctypePending();
        org.jsoup.parser.Token.Comment comment26 = null;
        tokeniser23.commentPending = comment26;
        tokeniser23.createDoctypePending();
        tokeniser23.emit("");
        org.jsoup.parser.Token.Comment comment31 = tokeniser23.commentPending;
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        org.jsoup.parser.TokeniserState tokeniserState34 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser33.transition(tokeniserState34);
        org.jsoup.parser.Token.Comment comment36 = null;
        tokeniser33.commentPending = comment36;
        tokeniser33.emit('\ufffd');
        tokeniser33.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder42 = tokeniser33.dataBuffer;
        tokeniser33.acknowledgeSelfClosingFlag();
        boolean boolean44 = tokeniser33.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag45 = tokeniser33.tagPending;
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader46);
        org.jsoup.parser.TokeniserState tokeniserState48 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser47.transition(tokeniserState48);
        org.jsoup.parser.Token.Comment comment50 = null;
        tokeniser47.commentPending = comment50;
        tokeniser47.emit('\ufffd');
        tokeniser47.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState55 = tokeniser47.getState();
        boolean boolean56 = tokeniser47.currentNodeInHtmlNS();
        tokeniser47.emitDoctypePending();
        tokeniser47.emit("");
        org.jsoup.parser.CharacterReader characterReader60 = null;
        org.jsoup.parser.Tokeniser tokeniser61 = new org.jsoup.parser.Tokeniser(characterReader60);
        tokeniser61.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState63 = tokeniser61.getState();
        tokeniser61.createTempBuffer();
        tokeniser61.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader66 = null;
        org.jsoup.parser.Tokeniser tokeniser67 = new org.jsoup.parser.Tokeniser(characterReader66);
        org.jsoup.parser.TokeniserState tokeniserState68 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser67.transition(tokeniserState68);
        org.jsoup.parser.Token.Comment comment70 = null;
        tokeniser67.commentPending = comment70;
        tokeniser67.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment74 = tokeniser67.commentPending;
        org.jsoup.parser.Token.Tag tag76 = tokeniser67.createTagPending(true);
        tokeniser61.tagPending = tag76;
        java.lang.StringBuilder stringBuilder78 = tokeniser61.dataBuffer;
        tokeniser47.dataBuffer = stringBuilder78;
        tokeniser33.dataBuffer = stringBuilder78;
        tokeniser23.dataBuffer = stringBuilder78;
        tokeniser1.dataBuffer = stringBuilder78;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char85 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNull(comment31);
        org.junit.Assert.assertNotNull(tokeniserState34);
        org.junit.Assert.assertNull(stringBuilder42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(tag45);
        org.junit.Assert.assertNotNull(tokeniserState48);
        org.junit.Assert.assertNotNull(tokeniserState55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(tokeniserState63);
        org.junit.Assert.assertNotNull(tokeniserState68);
        org.junit.Assert.assertNull(comment74);
        org.junit.Assert.assertNotNull(tag76);
        org.junit.Assert.assertNotNull(stringBuilder78);
        org.junit.Assert.assertEquals(stringBuilder78.toString(), "");
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        tokeniser1.emit('#');
        org.jsoup.parser.Token.Tag tag11 = tokeniser1.tagPending;
        java.lang.StringBuilder stringBuilder12 = tokeniser1.dataBuffer;
        org.junit.Assert.assertNull(tag11);
        org.junit.Assert.assertNull(stringBuilder12);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
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
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        org.jsoup.parser.TokeniserState tokeniserState17 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser16.transition(tokeniserState17);
        org.jsoup.parser.Token.Comment comment19 = null;
        tokeniser16.commentPending = comment19;
        tokeniser16.emit('\ufffd');
        tokeniser16.createDoctypePending();
        tokeniser16.emit(' ');
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        tokeniser27.createDoctypePending();
        tokeniser27.createDoctypePending();
        org.jsoup.parser.Token.Comment comment30 = null;
        tokeniser27.commentPending = comment30;
        boolean boolean32 = tokeniser27.isTrackErrors();
        boolean boolean33 = tokeniser27.isTrackErrors();
        tokeniser27.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState35 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        tokeniser27.transition(tokeniserState35);
        tokeniser27.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader38);
        org.jsoup.parser.TokeniserState tokeniserState40 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser39.transition(tokeniserState40);
        org.jsoup.parser.Token.Comment comment42 = null;
        tokeniser39.commentPending = comment42;
        tokeniser39.emit('\ufffd');
        tokeniser39.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState47 = tokeniser39.getState();
        tokeniser39.emit("hi!");
        tokeniser39.emit('#');
        boolean boolean52 = tokeniser39.isTrackErrors();
        java.lang.StringBuilder stringBuilder53 = tokeniser39.dataBuffer;
        org.jsoup.parser.Token.Tag tag55 = tokeniser39.createTagPending(false);
        tokeniser27.tagPending = tag55;
        tokeniser16.emit((org.jsoup.parser.Token) tag55);
        boolean boolean58 = tokeniser16.isTrackErrors();
        tokeniser16.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader60 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState14.read(tokeniser16, characterReader60);
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
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertNotNull(tokeniserState47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(stringBuilder53);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
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
        java.lang.StringBuilder stringBuilder13 = tokeniser1.dataBuffer;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNull(stringBuilder13);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
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
        tokeniser1.createDoctypePending();
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
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
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
        tokeniser1.doctypePending = doctype23;
        tokeniser1.createCommentPending();
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        org.jsoup.parser.TokeniserState tokeniserState30 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser29.transition(tokeniserState30);
        tokeniser29.emit("hi!");
        org.jsoup.parser.Token.Comment comment34 = tokeniser29.commentPending;
        java.lang.StringBuilder stringBuilder35 = null;
        tokeniser29.dataBuffer = stringBuilder35;
        tokeniser29.createDoctypePending();
        tokeniser29.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Doctype doctype39 = tokeniser29.doctypePending;
        org.jsoup.parser.Token.Doctype doctype40 = tokeniser29.doctypePending;
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader41);
        tokeniser42.createDoctypePending();
        tokeniser42.createDoctypePending();
        org.jsoup.parser.Token.Comment comment45 = null;
        tokeniser42.commentPending = comment45;
        boolean boolean47 = tokeniser42.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader48 = null;
        org.jsoup.parser.Tokeniser tokeniser49 = new org.jsoup.parser.Tokeniser(characterReader48);
        org.jsoup.parser.TokeniserState tokeniserState50 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser49.transition(tokeniserState50);
        org.jsoup.parser.Token.Comment comment52 = null;
        tokeniser49.commentPending = comment52;
        tokeniser49.emit('\ufffd');
        tokeniser49.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState57 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser49.transition(tokeniserState57);
        tokeniser49.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment60 = tokeniser49.commentPending;
        tokeniser42.commentPending = comment60;
        tokeniser29.commentPending = comment60;
        tokeniser1.commentPending = comment60;
        org.jsoup.parser.Token token64 = tokeniser1.read();
        tokeniser1.createCommentPending();
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doctype22);
        org.junit.Assert.assertNotNull(doctype23);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertNull(comment34);
        org.junit.Assert.assertNotNull(doctype39);
        org.junit.Assert.assertNotNull(doctype40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tokeniserState50);
        org.junit.Assert.assertNotNull(tokeniserState57);
        org.junit.Assert.assertNotNull(comment60);
        org.junit.Assert.assertNotNull(token64);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser1.getState();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token.Tag tag9 = tokeniser1.createTagPending(false);
        tokeniser1.setTrackErrors(false);
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
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
        tokeniser1.emitCommentPending();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        org.jsoup.parser.TokeniserState tokeniserState17 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser16.transition(tokeniserState17);
        org.jsoup.parser.Token.Comment comment19 = null;
        tokeniser16.commentPending = comment19;
        tokeniser16.emit('\ufffd');
        tokeniser16.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser16.getState();
        tokeniser16.emit("hi!");
        tokeniser16.createDoctypePending();
        boolean boolean28 = tokeniser16.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment29 = tokeniser16.commentPending;
        org.jsoup.parser.Token.Tag tag31 = tokeniser16.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype32 = tokeniser16.doctypePending;
        tokeniser1.doctypePending = doctype32;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(comment29);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(doctype32);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Comment comment5 = tokeniser1.commentPending;
        boolean boolean6 = tokeniser1.isTrackErrors();
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        org.jsoup.parser.Token.Tag tag5 = tokeniser1.createTagPending(false);
        tokeniser1.emit('a');
        org.jsoup.parser.Token.Tag tag9 = tokeniser1.createTagPending(true);
        tokeniser1.setTrackErrors(false);
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
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
        tokeniser15.acknowledgeSelfClosingFlag();
        tokeniser15.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        tokeniser33.createDoctypePending();
        org.jsoup.parser.Token.Comment comment35 = tokeniser33.commentPending;
        tokeniser33.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype37 = tokeniser33.doctypePending;
        org.jsoup.parser.Token.Tag tag38 = tokeniser33.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState39 = tokeniser33.getState();
        tokeniser15.transition(tokeniserState39);
        tokeniser1.error(tokeniserState39);
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Doctype doctype43 = tokeniser1.doctypePending;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(doctype28);
        org.junit.Assert.assertNull(comment35);
        org.junit.Assert.assertNotNull(doctype37);
        org.junit.Assert.assertNull(tag38);
        org.junit.Assert.assertNotNull(tokeniserState39);
        org.junit.Assert.assertNull(doctype43);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
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
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token.Tag tag22 = tokeniser1.tagPending;
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(tag22);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
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
        org.jsoup.parser.Token.Comment comment15 = tokeniser1.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser1.getState();
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser1.getState();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNull(doctype13);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNull(comment15);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(tokeniserState17);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        boolean boolean7 = tokeniser1.isTrackErrors();
        tokeniser1.createCommentPending();
        boolean boolean9 = tokeniser1.currentNodeInHtmlNS();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
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
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        tokeniser26.createTempBuffer();
        tokeniser26.createCommentPending();
        boolean boolean29 = tokeniser26.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader30);
        org.jsoup.parser.TokeniserState tokeniserState32 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser31.transition(tokeniserState32);
        tokeniser31.emit("hi!");
        org.jsoup.parser.Token.Comment comment36 = tokeniser31.commentPending;
        java.lang.StringBuilder stringBuilder37 = null;
        tokeniser31.dataBuffer = stringBuilder37;
        tokeniser31.setTrackErrors(false);
        tokeniser31.emit(' ');
        tokeniser31.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader44);
        org.jsoup.parser.TokeniserState tokeniserState46 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser45.transition(tokeniserState46);
        tokeniser45.emit("hi!");
        org.jsoup.parser.Token.Comment comment50 = null;
        tokeniser45.commentPending = comment50;
        tokeniser45.createCommentPending();
        org.jsoup.parser.Token.Comment comment53 = tokeniser45.commentPending;
        tokeniser31.commentPending = comment53;
        tokeniser26.commentPending = comment53;
        org.jsoup.parser.Token.Tag tag57 = tokeniser26.createTagPending(false);
        tokeniser1.tagPending = tag57;
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNull(comment9);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNull(comment18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tokeniserState32);
        org.junit.Assert.assertNull(comment36);
        org.junit.Assert.assertNotNull(tokeniserState46);
        org.junit.Assert.assertNotNull(comment53);
        org.junit.Assert.assertNotNull(tag57);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
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
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        org.jsoup.parser.TokeniserState tokeniserState37 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser36.transition(tokeniserState37);
        org.jsoup.parser.Token.Comment comment39 = null;
        tokeniser36.commentPending = comment39;
        tokeniser36.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader43);
        org.jsoup.parser.TokeniserState tokeniserState45 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser44.transition(tokeniserState45);
        org.jsoup.parser.Token.Doctype doctype47 = tokeniser44.doctypePending;
        tokeniser44.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader50);
        org.jsoup.parser.TokeniserState tokeniserState52 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser51.transition(tokeniserState52);
        org.jsoup.parser.Token.Comment comment54 = null;
        tokeniser51.commentPending = comment54;
        tokeniser51.emit('\ufffd');
        tokeniser51.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState59 = tokeniser51.getState();
        boolean boolean60 = tokeniser51.currentNodeInHtmlNS();
        tokeniser51.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype62 = tokeniser51.doctypePending;
        tokeniser44.doctypePending = doctype62;
        tokeniser36.doctypePending = doctype62;
        tokeniser36.createTempBuffer();
        java.lang.StringBuilder stringBuilder66 = null;
        tokeniser36.dataBuffer = stringBuilder66;
        org.jsoup.parser.TokeniserState tokeniserState68 = tokeniser36.getState();
        tokeniser1.eofError(tokeniserState68);
        org.jsoup.parser.Token.Tag tag70 = tokeniser1.tagPending;
        boolean boolean71 = tokeniser1.isTrackErrors();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(doctype31);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertNull(doctype47);
        org.junit.Assert.assertNotNull(tokeniserState52);
        org.junit.Assert.assertNotNull(tokeniserState59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(doctype62);
        org.junit.Assert.assertNotNull(tokeniserState68);
        org.junit.Assert.assertNull(tag70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser1.transition(tokeniserState4);
        tokeniser1.createTempBuffer();
        tokeniser1.createDoctypePending();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState4);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype9 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        java.lang.Class<?> wildcardClass11 = tokeniser1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNotNull(doctype9);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
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
        org.jsoup.parser.Token.Tag tag43 = tokeniser1.createTagPending(false);
        java.lang.Class<?> wildcardClass44 = tokeniser1.getClass();
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
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
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
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Tag tag26 = tokeniser1.createTagPending(false);
        org.jsoup.parser.TokeniserState tokeniserState27 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        org.jsoup.parser.TokeniserState tokeniserState30 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser29.transition(tokeniserState30);
        tokeniser29.emit("hi!");
        org.jsoup.parser.Token.Comment comment34 = tokeniser29.commentPending;
        java.lang.StringBuilder stringBuilder35 = null;
        tokeniser29.dataBuffer = stringBuilder35;
        tokeniser29.setTrackErrors(false);
        tokeniser29.createDoctypePending();
        tokeniser29.emit("");
        java.lang.StringBuilder stringBuilder42 = tokeniser29.dataBuffer;
        boolean boolean43 = tokeniser29.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader44 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState27.read(tokeniser29, characterReader44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNull(comment9);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNull(comment18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertNull(comment34);
        org.junit.Assert.assertNull(stringBuilder42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser1.transition(tokeniserState4);
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser1.dataBuffer = stringBuilder6;
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.tagPending;
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
        tokeniser10.emitDoctypePending();
        tokeniser10.emit("");
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        tokeniser24.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser24.getState();
        tokeniser24.createTempBuffer();
        tokeniser24.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        org.jsoup.parser.TokeniserState tokeniserState31 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser30.transition(tokeniserState31);
        org.jsoup.parser.Token.Comment comment33 = null;
        tokeniser30.commentPending = comment33;
        tokeniser30.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment37 = tokeniser30.commentPending;
        org.jsoup.parser.Token.Tag tag39 = tokeniser30.createTagPending(true);
        tokeniser24.tagPending = tag39;
        java.lang.StringBuilder stringBuilder41 = tokeniser24.dataBuffer;
        tokeniser10.dataBuffer = stringBuilder41;
        tokeniser1.dataBuffer = stringBuilder41;
        org.jsoup.parser.Token.Doctype doctype44 = null;
        tokeniser1.doctypePending = doctype44;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader47);
        tokeniser48.createDoctypePending();
        tokeniser48.createDoctypePending();
        org.jsoup.parser.Token.Comment comment51 = null;
        tokeniser48.commentPending = comment51;
        org.jsoup.parser.Token.Doctype doctype53 = tokeniser48.doctypePending;
        org.jsoup.parser.Token.Tag tag54 = tokeniser48.tagPending;
        tokeniser48.createCommentPending();
        org.jsoup.parser.Token.Tag tag56 = tokeniser48.tagPending;
        org.jsoup.parser.Token.Tag tag57 = tokeniser48.tagPending;
        tokeniser48.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader59 = null;
        org.jsoup.parser.Tokeniser tokeniser60 = new org.jsoup.parser.Tokeniser(characterReader59);
        org.jsoup.parser.TokeniserState tokeniserState61 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser60.transition(tokeniserState61);
        tokeniser60.setTrackErrors(true);
        java.lang.StringBuilder stringBuilder65 = tokeniser60.dataBuffer;
        tokeniser60.createCommentPending();
        org.jsoup.parser.Token.Comment comment67 = tokeniser60.commentPending;
        tokeniser48.commentPending = comment67;
        java.lang.StringBuilder stringBuilder69 = tokeniser48.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder69;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(tag8);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNull(comment37);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "");
        org.junit.Assert.assertNotNull(doctype53);
        org.junit.Assert.assertNull(tag54);
        org.junit.Assert.assertNull(tag56);
        org.junit.Assert.assertNull(tag57);
        org.junit.Assert.assertNotNull(tokeniserState61);
        org.junit.Assert.assertNull(stringBuilder65);
        org.junit.Assert.assertNotNull(comment67);
        org.junit.Assert.assertNotNull(stringBuilder69);
        org.junit.Assert.assertEquals(stringBuilder69.toString(), "");
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
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
        org.jsoup.parser.Token.Comment comment18 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        org.jsoup.parser.TokeniserState tokeniserState21 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser20.transition(tokeniserState21);
        org.jsoup.parser.Token.Comment comment23 = null;
        tokeniser20.commentPending = comment23;
        tokeniser20.emit('\ufffd');
        tokeniser20.setTrackErrors(false);
        tokeniser20.createCommentPending();
        org.jsoup.parser.Token.Tag tag31 = tokeniser20.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype32 = tokeniser20.doctypePending;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        tokeniser34.createDoctypePending();
        tokeniser34.createDoctypePending();
        org.jsoup.parser.Token.Comment comment37 = null;
        tokeniser34.commentPending = comment37;
        java.lang.StringBuilder stringBuilder39 = tokeniser34.dataBuffer;
        tokeniser34.emitDoctypePending();
        java.lang.StringBuilder stringBuilder41 = tokeniser34.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState42 = tokeniser34.getState();
        tokeniser20.transition(tokeniserState42);
        tokeniser1.error(tokeniserState42);
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader45);
        org.jsoup.parser.TokeniserState tokeniserState47 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser46.transition(tokeniserState47);
        org.jsoup.parser.TokeniserState tokeniserState49 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser46.transition(tokeniserState49);
        tokeniser46.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader52 = null;
        org.jsoup.parser.Tokeniser tokeniser53 = new org.jsoup.parser.Tokeniser(characterReader52);
        org.jsoup.parser.TokeniserState tokeniserState54 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser53.transition(tokeniserState54);
        tokeniser53.emit("hi!");
        org.jsoup.parser.Token.Comment comment58 = tokeniser53.commentPending;
        java.lang.StringBuilder stringBuilder59 = null;
        tokeniser53.dataBuffer = stringBuilder59;
        tokeniser53.setTrackErrors(false);
        tokeniser53.emit(' ');
        tokeniser53.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader66 = null;
        org.jsoup.parser.Tokeniser tokeniser67 = new org.jsoup.parser.Tokeniser(characterReader66);
        org.jsoup.parser.TokeniserState tokeniserState68 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser67.transition(tokeniserState68);
        tokeniser67.emit("hi!");
        org.jsoup.parser.Token.Comment comment72 = null;
        tokeniser67.commentPending = comment72;
        tokeniser67.createCommentPending();
        org.jsoup.parser.Token.Comment comment75 = tokeniser67.commentPending;
        tokeniser53.commentPending = comment75;
        tokeniser46.commentPending = comment75;
        tokeniser1.emit((org.jsoup.parser.Token) comment75);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char81 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNull(tag17);
        org.junit.Assert.assertNull(comment18);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNull(doctype32);
        org.junit.Assert.assertNull(stringBuilder39);
        org.junit.Assert.assertNull(stringBuilder41);
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertNotNull(tokeniserState47);
        org.junit.Assert.assertNotNull(tokeniserState49);
        org.junit.Assert.assertNotNull(tokeniserState54);
        org.junit.Assert.assertNull(comment58);
        org.junit.Assert.assertNotNull(tokeniserState68);
        org.junit.Assert.assertNotNull(comment75);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
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
        org.jsoup.parser.Token.Comment comment12 = tokeniser1.commentPending;
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Tag tag14 = tokeniser1.tagPending;
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNull(comment12);
        org.junit.Assert.assertNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
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
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        tokeniser12.createDoctypePending();
        java.lang.StringBuilder stringBuilder14 = tokeniser12.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        tokeniser16.createDoctypePending();
        tokeniser16.createDoctypePending();
        org.jsoup.parser.Token.Comment comment19 = null;
        tokeniser16.commentPending = comment19;
        tokeniser16.acknowledgeSelfClosingFlag();
        java.lang.StringBuilder stringBuilder22 = tokeniser16.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser24.transition(tokeniserState25);
        org.jsoup.parser.Token.Comment comment27 = null;
        tokeniser24.commentPending = comment27;
        tokeniser24.emit('\ufffd');
        tokeniser24.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder33 = tokeniser24.dataBuffer;
        tokeniser24.acknowledgeSelfClosingFlag();
        tokeniser24.acknowledgeSelfClosingFlag();
        tokeniser24.emit('a');
        boolean boolean38 = tokeniser24.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype39 = tokeniser24.doctypePending;
        org.jsoup.parser.Token.Tag tag40 = tokeniser24.tagPending;
        tokeniser24.createDoctypePending();
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
        org.jsoup.parser.Token.Doctype doctype54 = tokeniser43.doctypePending;
        tokeniser24.doctypePending = doctype54;
        tokeniser16.doctypePending = doctype54;
        tokeniser12.emit((org.jsoup.parser.Token) doctype54);
        tokeniser1.emit((org.jsoup.parser.Token) doctype54);
        tokeniser1.setTrackErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char63 = tokeniser1.consumeCharacterReference((java.lang.Character) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNull(stringBuilder22);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNull(stringBuilder33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(doctype39);
        org.junit.Assert.assertNull(tag40);
        org.junit.Assert.assertNotNull(tokeniserState44);
        org.junit.Assert.assertNotNull(tokeniserState51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(doctype54);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Tag tag3 = tokeniser1.tagPending;
        boolean boolean4 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        tokeniser6.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser6.getState();
        org.jsoup.parser.Token.Tag tag10 = tokeniser6.createTagPending(false);
        tokeniser6.emit('a');
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.createDoctypePending();
        tokeniser14.createDoctypePending();
        org.jsoup.parser.Token.Comment comment17 = null;
        tokeniser14.commentPending = comment17;
        boolean boolean19 = tokeniser14.isTrackErrors();
        boolean boolean20 = tokeniser14.isTrackErrors();
        tokeniser14.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.createDoctypePending();
        tokeniser23.createDoctypePending();
        org.jsoup.parser.Token.Comment comment26 = null;
        tokeniser23.commentPending = comment26;
        org.jsoup.parser.Token.Tag tag28 = tokeniser23.tagPending;
        java.lang.StringBuilder stringBuilder29 = tokeniser23.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState30 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser23.transition(tokeniserState30);
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
        tokeniser33.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment44 = tokeniser33.commentPending;
        tokeniser23.commentPending = comment44;
        tokeniser14.commentPending = comment44;
        tokeniser6.commentPending = comment44;
        tokeniser1.commentPending = comment44;
        org.jsoup.parser.Token.Tag tag49 = tokeniser1.tagPending;
        java.lang.StringBuilder stringBuilder50 = tokeniser1.dataBuffer;
        tokeniser1.createCommentPending();
        org.junit.Assert.assertNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(tag28);
        org.junit.Assert.assertNull(stringBuilder29);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertNotNull(tokeniserState34);
        org.junit.Assert.assertNotNull(tokeniserState41);
        org.junit.Assert.assertNotNull(comment44);
        org.junit.Assert.assertNull(tag49);
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
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
        tokeniser1.emit("");
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser1.doctypePending;
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNull(stringBuilder8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(doctype15);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
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
        org.jsoup.parser.TokeniserState tokeniserState27 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser26.transition(tokeniserState27);
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser26.getState();
        tokeniser26.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Doctype doctype31 = tokeniser26.doctypePending;
        org.jsoup.parser.Token.Tag tag33 = tokeniser26.createTagPending(false);
        tokeniser26.createDoctypePending();
        org.jsoup.parser.Token.Tag tag35 = tokeniser26.tagPending;
        tokeniser1.tagPending = tag35;
        org.jsoup.parser.Token token37 = tokeniser1.read();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNull(doctype31);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(token37);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
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
        tokeniser1.emit('#');
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Doctype doctype14 = tokeniser1.doctypePending;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doctype14);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
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
        tokeniser1.emit(' ');
        tokeniser1.emit(' ');
        java.lang.Class<?> wildcardClass23 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(tag16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment4 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.createTagPending(true);
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
        java.lang.StringBuilder stringBuilder20 = tokeniser8.dataBuffer;
        java.lang.StringBuilder stringBuilder21 = tokeniser8.dataBuffer;
        org.jsoup.parser.Token token22 = tokeniser8.read();
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        tokeniser24.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser24.getState();
        tokeniser24.createTempBuffer();
        tokeniser24.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        org.jsoup.parser.TokeniserState tokeniserState31 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser30.transition(tokeniserState31);
        org.jsoup.parser.Token.Comment comment33 = null;
        tokeniser30.commentPending = comment33;
        tokeniser30.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment37 = tokeniser30.commentPending;
        org.jsoup.parser.Token.Tag tag39 = tokeniser30.createTagPending(true);
        tokeniser24.tagPending = tag39;
        java.lang.StringBuilder stringBuilder41 = tokeniser24.dataBuffer;
        tokeniser8.dataBuffer = stringBuilder41;
        tokeniser1.dataBuffer = stringBuilder41;
        tokeniser1.createDoctypePending();
        tokeniser1.setTrackErrors(true);
        org.junit.Assert.assertNull(comment4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doctype19);
        org.junit.Assert.assertNull(stringBuilder20);
        org.junit.Assert.assertNull(stringBuilder21);
        org.junit.Assert.assertNotNull(token22);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNull(comment37);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "");
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        tokeniser1.emitDoctypePending();
        tokeniser1.emit("");
        tokeniser1.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        org.jsoup.parser.TokeniserState tokeniserState11 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser10.transition(tokeniserState11);
        tokeniser10.emit("hi!");
        org.jsoup.parser.Token.Comment comment15 = null;
        tokeniser10.commentPending = comment15;
        tokeniser10.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser10.getState();
        tokeniser1.transition(tokeniserState19);
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        org.jsoup.parser.TokeniserState tokeniserState23 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser22.transition(tokeniserState23);
        org.jsoup.parser.Token.Comment comment25 = null;
        tokeniser22.commentPending = comment25;
        tokeniser22.emit('\ufffd');
        tokeniser22.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState30 = tokeniser22.getState();
        tokeniser22.emitDoctypePending();
        java.lang.StringBuilder stringBuilder32 = null;
        tokeniser22.dataBuffer = stringBuilder32;
        tokeniser22.setTrackErrors(true);
        boolean boolean36 = tokeniser22.isTrackErrors();
        tokeniser22.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader38 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState19.read(tokeniser22, characterReader38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
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
        org.jsoup.parser.Token.Comment comment81 = tokeniser1.commentPending;
        tokeniser1.emit('a');
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
        org.junit.Assert.assertNull(comment81);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
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
        tokeniser1.emit('#');
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        tokeniser17.createDoctypePending();
        tokeniser17.createDoctypePending();
        org.jsoup.parser.Token.Comment comment20 = null;
        tokeniser17.commentPending = comment20;
        boolean boolean22 = tokeniser17.isTrackErrors();
        boolean boolean23 = tokeniser17.isTrackErrors();
        tokeniser17.createCommentPending();
        tokeniser17.emit('4');
        org.jsoup.parser.Token.Comment comment27 = tokeniser17.commentPending;
        tokeniser1.commentPending = comment27;
        boolean boolean29 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createCommentPending();
        java.lang.StringBuilder stringBuilder31 = tokeniser1.dataBuffer;
        tokeniser1.emit("hi!");
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(comment27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(stringBuilder31);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.TokeniserState tokeniserState4 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser1.transition(tokeniserState4);
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser1.dataBuffer = stringBuilder6;
        boolean boolean8 = tokeniser1.currentNodeInHtmlNS();
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
        boolean boolean21 = tokeniser10.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag23 = tokeniser10.createTagPending(false);
        tokeniser1.tagPending = tag23;
        tokeniser1.createDoctypePending();
        tokeniser1.setTrackErrors(true);
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emitTagPending();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tag23);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
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
        tokeniser1.emitDoctypePending();
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNull(doctype19);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(doctype34);
        org.junit.Assert.assertNotNull(token38);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
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
        tokeniser1.createTempBuffer();
        tokeniser1.createTempBuffer();
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Tag tag38 = tokeniser1.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState39 = org.jsoup.parser.TokeniserState.ScriptDataEscapedEndTagOpen;
        tokeniser1.error(tokeniserState39);
        org.jsoup.parser.Token.Tag tag42 = tokeniser1.createTagPending(true);
        java.lang.StringBuilder stringBuilder43 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Doctype doctype44 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader45);
        tokeniser46.createDoctypePending();
        tokeniser46.createDoctypePending();
        tokeniser46.emitDoctypePending();
        tokeniser46.emit("");
        org.jsoup.parser.CharacterReader characterReader52 = null;
        org.jsoup.parser.Tokeniser tokeniser53 = new org.jsoup.parser.Tokeniser(characterReader52);
        org.jsoup.parser.TokeniserState tokeniserState54 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser53.transition(tokeniserState54);
        org.jsoup.parser.Token.Comment comment56 = null;
        tokeniser53.commentPending = comment56;
        tokeniser53.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader60 = null;
        org.jsoup.parser.Tokeniser tokeniser61 = new org.jsoup.parser.Tokeniser(characterReader60);
        org.jsoup.parser.TokeniserState tokeniserState62 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser61.transition(tokeniserState62);
        org.jsoup.parser.Token.Comment comment64 = null;
        tokeniser61.commentPending = comment64;
        tokeniser61.emit('\ufffd');
        tokeniser61.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder70 = tokeniser61.dataBuffer;
        tokeniser61.acknowledgeSelfClosingFlag();
        boolean boolean72 = tokeniser61.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag73 = tokeniser61.tagPending;
        org.jsoup.parser.CharacterReader characterReader74 = null;
        org.jsoup.parser.Tokeniser tokeniser75 = new org.jsoup.parser.Tokeniser(characterReader74);
        org.jsoup.parser.TokeniserState tokeniserState76 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser75.transition(tokeniserState76);
        org.jsoup.parser.Token.Comment comment78 = null;
        tokeniser75.commentPending = comment78;
        tokeniser75.emit('\ufffd');
        tokeniser75.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState83 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser75.transition(tokeniserState83);
        tokeniser75.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment86 = tokeniser75.commentPending;
        tokeniser61.emit((org.jsoup.parser.Token) comment86);
        tokeniser53.commentPending = comment86;
        tokeniser46.commentPending = comment86;
        org.jsoup.parser.Token.Tag tag91 = tokeniser46.createTagPending(true);
        tokeniser1.tagPending = tag91;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(doctype31);
        org.junit.Assert.assertNull(tag38);
        org.junit.Assert.assertNotNull(tokeniserState39);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals(stringBuilder43.toString(), "");
        org.junit.Assert.assertNotNull(doctype44);
        org.junit.Assert.assertNotNull(tokeniserState54);
        org.junit.Assert.assertNotNull(tokeniserState62);
        org.junit.Assert.assertNull(stringBuilder70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(tag73);
        org.junit.Assert.assertNotNull(tokeniserState76);
        org.junit.Assert.assertNotNull(tokeniserState83);
        org.junit.Assert.assertNotNull(comment86);
        org.junit.Assert.assertNotNull(tag91);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
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
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser17.transition(tokeniserState18);
        tokeniser17.emit("hi!");
        org.jsoup.parser.Token.Tag tag22 = tokeniser17.tagPending;
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        tokeniser24.createDoctypePending();
        tokeniser24.createDoctypePending();
        org.jsoup.parser.Token.Comment comment27 = null;
        tokeniser24.commentPending = comment27;
        tokeniser24.createDoctypePending();
        tokeniser24.emit("");
        tokeniser24.createDoctypePending();
        org.jsoup.parser.Token.Comment comment33 = null;
        tokeniser24.commentPending = comment33;
        org.jsoup.parser.TokeniserState tokeniserState35 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser24.transition(tokeniserState35);
        tokeniser17.transition(tokeniserState35);
        tokeniser1.error(tokeniserState35);
        tokeniser1.emit("hi!");
        boolean boolean41 = tokeniser1.isTrackErrors();
        tokeniser1.createTempBuffer();
        tokeniser1.createTempBuffer();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNull(tag22);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
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
        org.jsoup.parser.Token.Doctype doctype17 = tokeniser1.doctypePending;
        tokeniser1.setTrackErrors(false);
        tokeniser1.emit('#');
        org.jsoup.parser.Token.Tag tag23 = tokeniser1.createTagPending(true);
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertNull(tag15);
        org.junit.Assert.assertNull(tag16);
        org.junit.Assert.assertNull(doctype17);
        org.junit.Assert.assertNotNull(tag23);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
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
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser17.transition(tokeniserState18);
        org.jsoup.parser.Token.Comment comment20 = null;
        tokeniser17.commentPending = comment20;
        tokeniser17.emit('\ufffd');
        tokeniser17.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState25 = tokeniser17.getState();
        tokeniser17.emit("hi!");
        tokeniser17.emitDoctypePending();
        boolean boolean29 = tokeniser17.isTrackErrors();
        boolean boolean30 = tokeniser17.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag32 = tokeniser17.createTagPending(true);
        org.jsoup.parser.Token.Comment comment33 = tokeniser17.commentPending;
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        tokeniser35.createDoctypePending();
        tokeniser35.createDoctypePending();
        tokeniser35.emitDoctypePending();
        tokeniser35.emit("");
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader41);
        org.jsoup.parser.TokeniserState tokeniserState43 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser42.transition(tokeniserState43);
        org.jsoup.parser.Token.Comment comment45 = null;
        tokeniser42.commentPending = comment45;
        tokeniser42.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader49 = null;
        org.jsoup.parser.Tokeniser tokeniser50 = new org.jsoup.parser.Tokeniser(characterReader49);
        org.jsoup.parser.TokeniserState tokeniserState51 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser50.transition(tokeniserState51);
        org.jsoup.parser.Token.Comment comment53 = null;
        tokeniser50.commentPending = comment53;
        tokeniser50.emit('\ufffd');
        tokeniser50.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder59 = tokeniser50.dataBuffer;
        tokeniser50.acknowledgeSelfClosingFlag();
        boolean boolean61 = tokeniser50.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag62 = tokeniser50.tagPending;
        org.jsoup.parser.CharacterReader characterReader63 = null;
        org.jsoup.parser.Tokeniser tokeniser64 = new org.jsoup.parser.Tokeniser(characterReader63);
        org.jsoup.parser.TokeniserState tokeniserState65 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser64.transition(tokeniserState65);
        org.jsoup.parser.Token.Comment comment67 = null;
        tokeniser64.commentPending = comment67;
        tokeniser64.emit('\ufffd');
        tokeniser64.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState72 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser64.transition(tokeniserState72);
        tokeniser64.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment75 = tokeniser64.commentPending;
        tokeniser50.emit((org.jsoup.parser.Token) comment75);
        tokeniser42.commentPending = comment75;
        tokeniser35.commentPending = comment75;
        tokeniser17.commentPending = comment75;
        tokeniser1.commentPending = comment75;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.createTempBuffer();
        java.lang.StringBuilder stringBuilder83 = tokeniser1.dataBuffer;
        org.junit.Assert.assertNull(comment3);
        org.junit.Assert.assertNotNull(tokeniserState6);
        org.junit.Assert.assertNull(comment12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNull(comment33);
        org.junit.Assert.assertNotNull(tokeniserState43);
        org.junit.Assert.assertNotNull(tokeniserState51);
        org.junit.Assert.assertNull(stringBuilder59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(tag62);
        org.junit.Assert.assertNotNull(tokeniserState65);
        org.junit.Assert.assertNotNull(tokeniserState72);
        org.junit.Assert.assertNotNull(comment75);
        org.junit.Assert.assertNotNull(stringBuilder83);
        org.junit.Assert.assertEquals(stringBuilder83.toString(), "");
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        tokeniser1.createTempBuffer();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.Token token11 = tokeniser1.read();
        tokeniser1.createCommentPending();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = null;
        tokeniser1.commentPending = comment6;
        tokeniser1.createCommentPending();
        tokeniser1.emitCommentPending();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.createDoctypePending();
        tokeniser11.createDoctypePending();
        org.jsoup.parser.Token.Comment comment14 = null;
        tokeniser11.commentPending = comment14;
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser11.doctypePending;
        org.jsoup.parser.Token.Tag tag17 = tokeniser11.tagPending;
        tokeniser11.createCommentPending();
        tokeniser11.createCommentPending();
        tokeniser11.createCommentPending();
        boolean boolean21 = tokeniser11.currentNodeInHtmlNS();
        tokeniser11.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser24.transition(tokeniserState25);
        org.jsoup.parser.Token.Comment comment27 = null;
        tokeniser24.commentPending = comment27;
        tokeniser24.emit('\ufffd');
        tokeniser24.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState32 = tokeniser24.getState();
        tokeniser24.emit("hi!");
        tokeniser24.emitDoctypePending();
        boolean boolean36 = tokeniser24.isTrackErrors();
        boolean boolean37 = tokeniser24.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment38 = tokeniser24.commentPending;
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader39);
        tokeniser40.createDoctypePending();
        tokeniser40.createDoctypePending();
        org.jsoup.parser.Token.Comment comment43 = null;
        tokeniser40.commentPending = comment43;
        org.jsoup.parser.Token.Doctype doctype45 = tokeniser40.doctypePending;
        org.jsoup.parser.Token.Tag tag46 = tokeniser40.tagPending;
        tokeniser40.createCommentPending();
        tokeniser40.setTrackErrors(true);
        org.jsoup.parser.Token.Tag tag51 = tokeniser40.createTagPending(true);
        org.jsoup.parser.Token.Comment comment52 = tokeniser40.commentPending;
        tokeniser24.commentPending = comment52;
        tokeniser11.commentPending = comment52;
        tokeniser1.commentPending = comment52;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(doctype16);
        org.junit.Assert.assertNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNotNull(tokeniserState32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(comment38);
        org.junit.Assert.assertNotNull(doctype45);
        org.junit.Assert.assertNull(tag46);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(comment52);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
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
        org.jsoup.parser.Token.Comment comment14 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag16 = tokeniser1.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype17 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag18 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(doctype17);
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
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
        tokeniser1.emit("");
        java.lang.StringBuilder stringBuilder23 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Tag tag25 = tokeniser1.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        tokeniser27.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser27.getState();
        tokeniser27.createTempBuffer();
        tokeniser27.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        org.jsoup.parser.TokeniserState tokeniserState34 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser33.transition(tokeniserState34);
        org.jsoup.parser.Token.Comment comment36 = null;
        tokeniser33.commentPending = comment36;
        tokeniser33.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment40 = tokeniser33.commentPending;
        org.jsoup.parser.Token.Tag tag42 = tokeniser33.createTagPending(true);
        tokeniser27.tagPending = tag42;
        org.jsoup.parser.Token.Tag tag44 = tokeniser27.tagPending;
        tokeniser1.tagPending = tag44;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader47);
        tokeniser48.createDoctypePending();
        tokeniser48.createDoctypePending();
        org.jsoup.parser.Token.Comment comment51 = null;
        tokeniser48.commentPending = comment51;
        boolean boolean53 = tokeniser48.isTrackErrors();
        boolean boolean54 = tokeniser48.isTrackErrors();
        tokeniser48.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState56 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        tokeniser48.transition(tokeniserState56);
        tokeniser1.transition(tokeniserState56);
        tokeniser1.emitTagPending();
        org.jsoup.parser.Token.Doctype doctype60 = tokeniser1.doctypePending;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(comment19);
        org.junit.Assert.assertNull(stringBuilder23);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNotNull(tokeniserState34);
        org.junit.Assert.assertNull(comment40);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(tokeniserState56);
        org.junit.Assert.assertNotNull(doctype60);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState3 = tokeniser1.getState();
        tokeniser1.emit(' ');
        tokeniser1.createTempBuffer();
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
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
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
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag14 = tokeniser1.tagPending;
        boolean boolean15 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token token16 = tokeniser1.read();
        boolean boolean17 = tokeniser1.isTrackErrors();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doctype12);
        org.junit.Assert.assertNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
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
        org.jsoup.parser.Token.Comment comment11 = tokeniser1.commentPending;
        java.lang.StringBuilder stringBuilder12 = tokeniser1.dataBuffer;
        boolean boolean13 = tokeniser1.currentNodeInHtmlNS();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(comment11);
        org.junit.Assert.assertNull(stringBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.setTrackErrors(true);
        java.lang.StringBuilder stringBuilder6 = tokeniser1.dataBuffer;
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Comment comment8 = tokeniser1.commentPending;
        boolean boolean9 = tokeniser1.isTrackErrors();
        tokeniser1.createDoctypePending();
        boolean boolean11 = tokeniser1.currentNodeInHtmlNS();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNotNull(comment8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
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
        tokeniser20.createDoctypePending();
        tokeniser20.createDoctypePending();
        org.jsoup.parser.Token.Comment comment23 = null;
        tokeniser20.commentPending = comment23;
        org.jsoup.parser.Token.Doctype doctype25 = tokeniser20.doctypePending;
        org.jsoup.parser.Token.Tag tag26 = tokeniser20.tagPending;
        tokeniser20.createCommentPending();
        tokeniser20.setTrackErrors(true);
        org.jsoup.parser.Token.Tag tag31 = tokeniser20.createTagPending(true);
        org.jsoup.parser.Token.Comment comment32 = tokeniser20.commentPending;
        tokeniser1.commentPending = comment32;
        org.jsoup.parser.Token.Tag tag35 = tokeniser1.createTagPending(true);
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNull(tag17);
        org.junit.Assert.assertNotNull(doctype25);
        org.junit.Assert.assertNull(tag26);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(comment32);
        org.junit.Assert.assertNotNull(tag35);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        tokeniser1.emit('4');
        org.jsoup.parser.Token.Tag tag11 = tokeniser1.createTagPending(true);
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser1.getState();
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        tokeniser9.createDoctypePending();
        tokeniser9.createDoctypePending();
        org.jsoup.parser.Token.Comment comment12 = null;
        tokeniser9.commentPending = comment12;
        tokeniser9.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag16 = tokeniser9.createTagPending(true);
        org.jsoup.parser.Token.Comment comment17 = tokeniser9.commentPending;
        org.jsoup.parser.Token.Tag tag18 = tokeniser9.tagPending;
        tokeniser1.tagPending = tag18;
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
        tokeniser21.emit("");
        java.lang.StringBuilder stringBuilder39 = tokeniser21.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState40 = tokeniser21.getState();
        tokeniser21.setTrackErrors(false);
        org.jsoup.parser.Token.Tag tag44 = tokeniser21.createTagPending(true);
        tokeniser1.tagPending = tag44;
        tokeniser1.emit("hi!");
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(comment17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNull(stringBuilder30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(doctype36);
        org.junit.Assert.assertNull(stringBuilder39);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertNotNull(tag44);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.tagPending;
        tokeniser1.emit("");
        java.lang.StringBuilder stringBuilder7 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader8);
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser9.transition(tokeniserState10);
        org.jsoup.parser.Token.Comment comment12 = null;
        tokeniser9.commentPending = comment12;
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
        tokeniser15.acknowledgeSelfClosingFlag();
        tokeniser15.emit('a');
        boolean boolean29 = tokeniser15.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag30 = tokeniser15.tagPending;
        java.lang.StringBuilder stringBuilder31 = null;
        tokeniser15.dataBuffer = stringBuilder31;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        tokeniser34.createDoctypePending();
        tokeniser34.createDoctypePending();
        org.jsoup.parser.Token.Comment comment37 = null;
        tokeniser34.commentPending = comment37;
        boolean boolean39 = tokeniser34.isTrackErrors();
        boolean boolean40 = tokeniser34.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader41);
        org.jsoup.parser.TokeniserState tokeniserState43 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser42.transition(tokeniserState43);
        org.jsoup.parser.Token.Comment comment45 = null;
        tokeniser42.commentPending = comment45;
        tokeniser42.emit('\ufffd');
        tokeniser42.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader50);
        tokeniser51.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState53 = tokeniser51.getState();
        org.jsoup.parser.Token.Tag tag55 = tokeniser51.createTagPending(false);
        tokeniser42.tagPending = tag55;
        tokeniser34.tagPending = tag55;
        org.jsoup.parser.CharacterReader characterReader58 = null;
        org.jsoup.parser.Tokeniser tokeniser59 = new org.jsoup.parser.Tokeniser(characterReader58);
        org.jsoup.parser.TokeniserState tokeniserState60 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser59.transition(tokeniserState60);
        org.jsoup.parser.Token.Comment comment62 = null;
        tokeniser59.commentPending = comment62;
        tokeniser59.emit('\ufffd');
        tokeniser59.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState67 = tokeniser59.getState();
        boolean boolean68 = tokeniser59.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader69 = null;
        org.jsoup.parser.Tokeniser tokeniser70 = new org.jsoup.parser.Tokeniser(characterReader69);
        tokeniser70.createDoctypePending();
        tokeniser70.createDoctypePending();
        org.jsoup.parser.Token.Comment comment73 = null;
        tokeniser70.commentPending = comment73;
        org.jsoup.parser.Token.Doctype doctype75 = tokeniser70.doctypePending;
        tokeniser59.doctypePending = doctype75;
        tokeniser34.doctypePending = doctype75;
        tokeniser15.doctypePending = doctype75;
        tokeniser9.emit((org.jsoup.parser.Token) doctype75);
        org.jsoup.parser.TokeniserState tokeniserState80 = tokeniser9.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag4);
        org.junit.Assert.assertNull(stringBuilder7);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNull(stringBuilder24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(tag30);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(tokeniserState43);
        org.junit.Assert.assertNotNull(tokeniserState53);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNotNull(tokeniserState60);
        org.junit.Assert.assertNotNull(tokeniserState67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(doctype75);
        org.junit.Assert.assertNotNull(tokeniserState80);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
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
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser1.doctypePending;
        tokeniser1.createDoctypePending();
        boolean boolean13 = tokeniser1.isTrackErrors();
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
        org.jsoup.parser.Token.Tag tag32 = tokeniser15.tagPending;
        boolean boolean33 = tokeniser15.isTrackErrors();
        tokeniser15.setTrackErrors(false);
        tokeniser15.emit('a');
        org.jsoup.parser.TokeniserState tokeniserState38 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDashDash;
        tokeniser15.transition(tokeniserState38);
        java.lang.StringBuilder stringBuilder40 = tokeniser15.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder40;
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNull(comment28);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tokeniserState38);
        org.junit.Assert.assertNotNull(stringBuilder40);
        org.junit.Assert.assertEquals(stringBuilder40.toString(), "");
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        org.jsoup.parser.Token.Comment comment9 = tokeniser1.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState10 = org.jsoup.parser.TokeniserState.AfterDoctypeName;
        tokeniser1.transition(tokeniserState10);
        org.junit.Assert.assertNull(comment9);
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
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
        org.jsoup.parser.Token.Tag tag44 = tokeniser1.createTagPending(true);
        org.jsoup.parser.Token.Tag tag46 = tokeniser1.createTagPending(true);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState48 = org.jsoup.parser.TokeniserState.CharacterReferenceInData;
        tokeniser1.transition(tokeniserState48);
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
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(tokeniserState48);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
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
        org.jsoup.parser.Token.Tag tag24 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        tokeniser26.createDoctypePending();
        tokeniser26.createDoctypePending();
        org.jsoup.parser.Token.Comment comment29 = null;
        tokeniser26.commentPending = comment29;
        boolean boolean31 = tokeniser26.isTrackErrors();
        boolean boolean32 = tokeniser26.isTrackErrors();
        tokeniser26.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState34 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        tokeniser26.transition(tokeniserState34);
        tokeniser26.emit('a');
        org.jsoup.parser.Token.Comment comment38 = tokeniser26.commentPending;
        org.jsoup.parser.Token.Tag tag40 = tokeniser26.createTagPending(false);
        tokeniser1.tagPending = tag40;
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader42);
        tokeniser43.createDoctypePending();
        tokeniser43.createDoctypePending();
        org.jsoup.parser.Token.Comment comment46 = null;
        tokeniser43.commentPending = comment46;
        boolean boolean48 = tokeniser43.isTrackErrors();
        boolean boolean49 = tokeniser43.isTrackErrors();
        tokeniser43.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState51 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        tokeniser43.transition(tokeniserState51);
        tokeniser43.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader54 = null;
        org.jsoup.parser.Tokeniser tokeniser55 = new org.jsoup.parser.Tokeniser(characterReader54);
        org.jsoup.parser.TokeniserState tokeniserState56 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser55.transition(tokeniserState56);
        org.jsoup.parser.Token.Comment comment58 = null;
        tokeniser55.commentPending = comment58;
        tokeniser55.emit('\ufffd');
        tokeniser55.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState63 = tokeniser55.getState();
        tokeniser55.emit("hi!");
        tokeniser55.emit('#');
        boolean boolean68 = tokeniser55.isTrackErrors();
        java.lang.StringBuilder stringBuilder69 = tokeniser55.dataBuffer;
        org.jsoup.parser.Token.Tag tag71 = tokeniser55.createTagPending(false);
        tokeniser43.tagPending = tag71;
        org.jsoup.parser.Token.Comment comment73 = tokeniser43.commentPending;
        org.jsoup.parser.CharacterReader characterReader74 = null;
        org.jsoup.parser.Tokeniser tokeniser75 = new org.jsoup.parser.Tokeniser(characterReader74);
        org.jsoup.parser.TokeniserState tokeniserState76 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser75.transition(tokeniserState76);
        tokeniser43.transition(tokeniserState76);
        tokeniser1.transition(tokeniserState76);
        tokeniser1.emitTagPending();
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNull(stringBuilder7);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(comment22);
        org.junit.Assert.assertNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(tokeniserState34);
        org.junit.Assert.assertNull(comment38);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(tokeniserState51);
        org.junit.Assert.assertNotNull(tokeniserState56);
        org.junit.Assert.assertNotNull(tokeniserState63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNull(stringBuilder69);
        org.junit.Assert.assertNotNull(tag71);
        org.junit.Assert.assertNull(comment73);
        org.junit.Assert.assertNotNull(tokeniserState76);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
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
        org.jsoup.parser.Token.Comment comment17 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader18);
        tokeniser19.createDoctypePending();
        tokeniser19.createDoctypePending();
        org.jsoup.parser.Token.Comment comment22 = null;
        tokeniser19.commentPending = comment22;
        boolean boolean24 = tokeniser19.isTrackErrors();
        boolean boolean25 = tokeniser19.isTrackErrors();
        tokeniser19.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState27 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        tokeniser19.transition(tokeniserState27);
        tokeniser19.emit('a');
        tokeniser19.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        org.jsoup.parser.TokeniserState tokeniserState35 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser34.transition(tokeniserState35);
        org.jsoup.parser.TokeniserState tokeniserState37 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser34.transition(tokeniserState37);
        org.jsoup.parser.Token.Tag tag40 = tokeniser34.createTagPending(true);
        tokeniser19.tagPending = tag40;
        tokeniser19.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader44);
        org.jsoup.parser.TokeniserState tokeniserState46 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser45.transition(tokeniserState46);
        org.jsoup.parser.Token.Comment comment48 = null;
        tokeniser45.commentPending = comment48;
        tokeniser45.emit('\ufffd');
        tokeniser45.setTrackErrors(false);
        tokeniser45.createCommentPending();
        org.jsoup.parser.Token.Tag tag56 = tokeniser45.createTagPending(false);
        boolean boolean57 = tokeniser45.currentNodeInHtmlNS();
        java.lang.StringBuilder stringBuilder58 = tokeniser45.dataBuffer;
        tokeniser45.emitTagPending();
        org.jsoup.parser.CharacterReader characterReader60 = null;
        org.jsoup.parser.Tokeniser tokeniser61 = new org.jsoup.parser.Tokeniser(characterReader60);
        org.jsoup.parser.TokeniserState tokeniserState62 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser61.transition(tokeniserState62);
        tokeniser61.setTrackErrors(true);
        tokeniser61.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader68 = null;
        org.jsoup.parser.Tokeniser tokeniser69 = new org.jsoup.parser.Tokeniser(characterReader68);
        tokeniser69.createDoctypePending();
        tokeniser69.createDoctypePending();
        org.jsoup.parser.Token.Comment comment72 = null;
        tokeniser69.commentPending = comment72;
        org.jsoup.parser.Token.Doctype doctype74 = tokeniser69.doctypePending;
        tokeniser61.emit((org.jsoup.parser.Token) doctype74);
        tokeniser45.doctypePending = doctype74;
        org.jsoup.parser.Token.Comment comment77 = tokeniser45.commentPending;
        tokeniser19.commentPending = comment77;
        tokeniser1.emit((org.jsoup.parser.Token) comment77);
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNull(comment17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(tokeniserState46);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(stringBuilder58);
        org.junit.Assert.assertNotNull(tokeniserState62);
        org.junit.Assert.assertNotNull(doctype74);
        org.junit.Assert.assertNotNull(comment77);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
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
        boolean boolean68 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag70 = tokeniser1.createTagPending(false);
        org.jsoup.parser.Token token71 = tokeniser1.read();
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
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertNotNull(token71);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.Token.Tag tag10 = tokeniser1.createTagPending(false);
        java.lang.Class<?> wildcardClass11 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
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
        tokeniser1.createTempBuffer();
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
        org.jsoup.parser.TokeniserState tokeniserState38 = tokeniser26.getState();
        java.lang.StringBuilder stringBuilder39 = null;
        tokeniser26.dataBuffer = stringBuilder39;
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader41);
        org.jsoup.parser.TokeniserState tokeniserState43 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser42.transition(tokeniserState43);
        org.jsoup.parser.Token.Comment comment45 = null;
        tokeniser42.commentPending = comment45;
        tokeniser42.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader49 = null;
        org.jsoup.parser.Tokeniser tokeniser50 = new org.jsoup.parser.Tokeniser(characterReader49);
        org.jsoup.parser.TokeniserState tokeniserState51 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser50.transition(tokeniserState51);
        org.jsoup.parser.Token.Comment comment53 = null;
        tokeniser50.commentPending = comment53;
        tokeniser50.emit('\ufffd');
        tokeniser50.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder59 = tokeniser50.dataBuffer;
        tokeniser50.acknowledgeSelfClosingFlag();
        boolean boolean61 = tokeniser50.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag62 = tokeniser50.tagPending;
        org.jsoup.parser.CharacterReader characterReader63 = null;
        org.jsoup.parser.Tokeniser tokeniser64 = new org.jsoup.parser.Tokeniser(characterReader63);
        org.jsoup.parser.TokeniserState tokeniserState65 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser64.transition(tokeniserState65);
        org.jsoup.parser.Token.Comment comment67 = null;
        tokeniser64.commentPending = comment67;
        tokeniser64.emit('\ufffd');
        tokeniser64.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState72 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser64.transition(tokeniserState72);
        tokeniser64.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment75 = tokeniser64.commentPending;
        tokeniser50.emit((org.jsoup.parser.Token) comment75);
        tokeniser42.commentPending = comment75;
        tokeniser26.commentPending = comment75;
        tokeniser1.commentPending = comment75;
        java.lang.StringBuilder stringBuilder80 = tokeniser1.dataBuffer;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(comment19);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tokeniserState34);
        org.junit.Assert.assertNotNull(tokeniserState38);
        org.junit.Assert.assertNotNull(tokeniserState43);
        org.junit.Assert.assertNotNull(tokeniserState51);
        org.junit.Assert.assertNull(stringBuilder59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(tag62);
        org.junit.Assert.assertNotNull(tokeniserState65);
        org.junit.Assert.assertNotNull(tokeniserState72);
        org.junit.Assert.assertNotNull(comment75);
        org.junit.Assert.assertNotNull(stringBuilder80);
        org.junit.Assert.assertEquals(stringBuilder80.toString(), "");
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
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
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.createDoctypePending();
        tokeniser14.createDoctypePending();
        org.jsoup.parser.Token.Comment comment17 = null;
        tokeniser14.commentPending = comment17;
        org.jsoup.parser.Token.Doctype doctype19 = tokeniser14.doctypePending;
        org.jsoup.parser.Token.Tag tag20 = tokeniser14.tagPending;
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        tokeniser22.createDoctypePending();
        tokeniser22.createDoctypePending();
        org.jsoup.parser.Token.Comment comment25 = null;
        tokeniser22.commentPending = comment25;
        boolean boolean27 = tokeniser22.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        org.jsoup.parser.TokeniserState tokeniserState30 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser29.transition(tokeniserState30);
        org.jsoup.parser.Token.Comment comment32 = null;
        tokeniser29.commentPending = comment32;
        tokeniser29.emit('\ufffd');
        tokeniser29.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState37 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser29.transition(tokeniserState37);
        tokeniser29.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment40 = tokeniser29.commentPending;
        tokeniser22.commentPending = comment40;
        tokeniser14.commentPending = comment40;
        tokeniser1.commentPending = comment40;
        tokeniser1.setTrackErrors(false);
        tokeniser1.createTempBuffer();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(doctype19);
        org.junit.Assert.assertNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertNotNull(comment40);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
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
        java.lang.StringBuilder stringBuilder15 = tokeniser1.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser1.getState();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(comment14);
        org.junit.Assert.assertNull(stringBuilder15);
        org.junit.Assert.assertNotNull(tokeniserState16);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader1);
        tokeniser2.createDoctypePending();
        tokeniser2.createDoctypePending();
        org.jsoup.parser.Token.Comment comment5 = null;
        tokeniser2.commentPending = comment5;
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.emitDoctypePending();
        tokeniser2.emit('#');
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser2.getState();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser2.doctypePending;
        org.jsoup.parser.Token token13 = tokeniser2.read();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser2, characterReader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(doctype12);
        org.junit.Assert.assertNotNull(token13);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
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
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        tokeniser13.createDoctypePending();
        tokeniser13.createDoctypePending();
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser13.commentPending = comment16;
        java.lang.StringBuilder stringBuilder18 = tokeniser13.dataBuffer;
        tokeniser13.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        org.jsoup.parser.TokeniserState tokeniserState22 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser21.transition(tokeniserState22);
        tokeniser21.emit("hi!");
        org.jsoup.parser.Token.Comment comment26 = tokeniser21.commentPending;
        java.lang.StringBuilder stringBuilder27 = null;
        tokeniser21.dataBuffer = stringBuilder27;
        tokeniser21.setTrackErrors(false);
        tokeniser21.emit(' ');
        tokeniser21.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader34);
        org.jsoup.parser.TokeniserState tokeniserState36 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser35.transition(tokeniserState36);
        org.jsoup.parser.Token.Comment comment38 = null;
        tokeniser35.commentPending = comment38;
        tokeniser35.emit('\ufffd');
        tokeniser35.createDoctypePending();
        boolean boolean43 = tokeniser35.currentNodeInHtmlNS();
        tokeniser35.emitDoctypePending();
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
        org.jsoup.parser.Token.Doctype doctype56 = tokeniser46.doctypePending;
        org.jsoup.parser.Token.Doctype doctype57 = tokeniser46.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState58 = tokeniser46.getState();
        tokeniser35.transition(tokeniserState58);
        org.jsoup.parser.Token.Tag tag61 = tokeniser35.createTagPending(true);
        tokeniser21.emit((org.jsoup.parser.Token) tag61);
        tokeniser13.tagPending = tag61;
        tokeniser1.emit((org.jsoup.parser.Token) tag61);
        tokeniser1.emit("");
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(stringBuilder11);
        org.junit.Assert.assertNull(stringBuilder18);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNull(comment26);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(tokeniserState47);
        org.junit.Assert.assertNotNull(tokeniserState54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(doctype56);
        org.junit.Assert.assertNotNull(doctype57);
        org.junit.Assert.assertNotNull(tokeniserState58);
        org.junit.Assert.assertNotNull(tag61);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        tokeniser1.emitDoctypePending();
        tokeniser1.emit('4');
        java.lang.StringBuilder stringBuilder12 = tokeniser1.dataBuffer;
        tokeniser1.emit('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char17 = tokeniser1.consumeCharacterReference((java.lang.Character) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder12);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
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
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser32.transition(tokeniserState33);
        tokeniser32.emit("hi!");
        org.jsoup.parser.Token.Comment comment37 = null;
        tokeniser32.commentPending = comment37;
        tokeniser32.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState41 = tokeniser32.getState();
        tokeniser32.createTempBuffer();
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
        org.jsoup.parser.Token.Tag tag56 = tokeniser44.tagPending;
        tokeniser44.emitCommentPending();
        tokeniser44.createDoctypePending();
        org.jsoup.parser.Token.Comment comment59 = tokeniser44.commentPending;
        tokeniser32.commentPending = comment59;
        tokeniser1.commentPending = comment59;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNull(comment24);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(doctype30);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(tokeniserState41);
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertNotNull(tokeniserState52);
        org.junit.Assert.assertNotNull(comment55);
        org.junit.Assert.assertNull(tag56);
        org.junit.Assert.assertNotNull(comment59);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
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
        tokeniser1.emit("hi!");
        boolean boolean28 = tokeniser1.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser1.getState();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tokeniserState29);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
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
        org.jsoup.parser.Token.Comment comment18 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Doctype doctype19 = tokeniser1.doctypePending;
        org.junit.Assert.assertNotNull(tokeniserState6);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doctype16);
        org.junit.Assert.assertNull(comment18);
        org.junit.Assert.assertNotNull(doctype19);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Comment comment7 = null;
        tokeniser1.commentPending = comment7;
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        org.jsoup.parser.TokeniserState tokeniserState13 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser12.transition(tokeniserState13);
        org.jsoup.parser.Token.Comment comment15 = null;
        tokeniser12.commentPending = comment15;
        tokeniser12.emit('\ufffd');
        tokeniser12.createDoctypePending();
        tokeniser12.createTempBuffer();
        tokeniser12.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser24.transition(tokeniserState25);
        org.jsoup.parser.Token.Comment comment27 = null;
        tokeniser24.commentPending = comment27;
        tokeniser24.emit('\ufffd');
        tokeniser24.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState32 = tokeniser24.getState();
        tokeniser24.emit("hi!");
        tokeniser24.emitDoctypePending();
        boolean boolean36 = tokeniser24.isTrackErrors();
        boolean boolean37 = tokeniser24.currentNodeInHtmlNS();
        tokeniser24.createCommentPending();
        org.jsoup.parser.Token token39 = tokeniser24.read();
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        tokeniser41.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState43 = tokeniser41.getState();
        tokeniser41.createTempBuffer();
        tokeniser41.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader46);
        org.jsoup.parser.TokeniserState tokeniserState48 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser47.transition(tokeniserState48);
        org.jsoup.parser.Token.Comment comment50 = null;
        tokeniser47.commentPending = comment50;
        tokeniser47.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment54 = tokeniser47.commentPending;
        org.jsoup.parser.Token.Tag tag56 = tokeniser47.createTagPending(true);
        tokeniser41.tagPending = tag56;
        org.jsoup.parser.Token.Tag tag58 = tokeniser41.tagPending;
        boolean boolean59 = tokeniser41.isTrackErrors();
        boolean boolean60 = tokeniser41.isTrackErrors();
        java.lang.StringBuilder stringBuilder61 = tokeniser41.dataBuffer;
        tokeniser24.dataBuffer = stringBuilder61;
        tokeniser12.dataBuffer = stringBuilder61;
        tokeniser1.dataBuffer = stringBuilder61;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNotNull(tokeniserState32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(token39);
        org.junit.Assert.assertNotNull(tokeniserState43);
        org.junit.Assert.assertNotNull(tokeniserState48);
        org.junit.Assert.assertNull(comment54);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(stringBuilder61);
        org.junit.Assert.assertEquals(stringBuilder61.toString(), "");
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
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
        tokeniser14.setTrackErrors(false);
        tokeniser14.createCommentPending();
        org.jsoup.parser.Token.Tag tag25 = tokeniser14.createTagPending(false);
        boolean boolean26 = tokeniser14.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState27 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_doubleQuoted;
        tokeniser14.eofError(tokeniserState27);
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        org.jsoup.parser.TokeniserState tokeniserState31 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser30.transition(tokeniserState31);
        tokeniser30.emit("hi!");
        org.jsoup.parser.Token.Tag tag35 = tokeniser30.tagPending;
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        tokeniser37.createDoctypePending();
        tokeniser37.createDoctypePending();
        org.jsoup.parser.Token.Comment comment40 = null;
        tokeniser37.commentPending = comment40;
        tokeniser37.createDoctypePending();
        tokeniser37.emit("");
        tokeniser37.createDoctypePending();
        org.jsoup.parser.Token.Comment comment46 = null;
        tokeniser37.commentPending = comment46;
        org.jsoup.parser.TokeniserState tokeniserState48 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser37.transition(tokeniserState48);
        tokeniser30.transition(tokeniserState48);
        tokeniser14.error(tokeniserState48);
        tokeniser1.transition(tokeniserState48);
        tokeniser1.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNull(tag35);
        org.junit.Assert.assertNotNull(tokeniserState48);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
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
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.tagPending;
        tokeniser1.emit('4');
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        org.jsoup.parser.TokeniserState tokeniserState17 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser16.transition(tokeniserState17);
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser16.getState();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser16.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag12);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tokeniserState20);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
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
        org.jsoup.parser.Token token26 = tokeniser1.read();
        org.jsoup.parser.Token token27 = tokeniser1.read();
        tokeniser1.emitDoctypePending();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doctype22);
        org.junit.Assert.assertNotNull(doctype23);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNotNull(token26);
        org.junit.Assert.assertNotNull(token27);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
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
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.CharacterReferenceInRcdata;
        tokeniser1.transition(tokeniserState14);
        java.lang.Class<?> wildcardClass16 = tokeniser1.getClass();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
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
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.createDoctypePending();
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
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser7.transition(tokeniserState8);
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser7.commentPending = comment10;
        tokeniser7.emit('\ufffd');
        tokeniser7.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder16 = tokeniser7.dataBuffer;
        tokeniser7.acknowledgeSelfClosingFlag();
        boolean boolean18 = tokeniser7.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag19 = tokeniser7.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser7.getState();
        org.jsoup.parser.Token.Doctype doctype21 = tokeniser7.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState22 = org.jsoup.parser.TokeniserState.PLAINTEXT;
        tokeniser7.error(tokeniserState22);
        tokeniser1.eofError(tokeniserState22);
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment26 = tokeniser1.commentPending;
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNull(stringBuilder16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(tag19);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNull(doctype21);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNull(comment26);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
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
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        tokeniser15.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment18 = tokeniser15.commentPending;
        org.jsoup.parser.Token.Tag tag19 = tokeniser15.tagPending;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        org.jsoup.parser.TokeniserState tokeniserState22 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser21.transition(tokeniserState22);
        org.jsoup.parser.Token.Comment comment24 = null;
        tokeniser21.commentPending = comment24;
        tokeniser21.emit('\ufffd');
        tokeniser21.createDoctypePending();
        tokeniser21.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype30 = tokeniser21.doctypePending;
        tokeniser15.doctypePending = doctype30;
        tokeniser1.doctypePending = doctype30;
        java.lang.StringBuilder stringBuilder33 = tokeniser1.dataBuffer;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertNull(comment18);
        org.junit.Assert.assertNull(tag19);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNotNull(doctype30);
        org.junit.Assert.assertNull(stringBuilder33);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
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
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        tokeniser16.createDoctypePending();
        tokeniser16.createDoctypePending();
        org.jsoup.parser.Token.Comment comment19 = null;
        tokeniser16.commentPending = comment19;
        tokeniser16.createDoctypePending();
        tokeniser16.emit("");
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        org.jsoup.parser.TokeniserState tokeniserState26 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser25.transition(tokeniserState26);
        tokeniser25.emit("hi!");
        org.jsoup.parser.Token.Tag tag30 = tokeniser25.tagPending;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        tokeniser32.createDoctypePending();
        tokeniser32.createDoctypePending();
        org.jsoup.parser.Token.Comment comment35 = null;
        tokeniser32.commentPending = comment35;
        tokeniser32.createDoctypePending();
        tokeniser32.emit("");
        tokeniser32.createDoctypePending();
        org.jsoup.parser.Token.Comment comment41 = null;
        tokeniser32.commentPending = comment41;
        org.jsoup.parser.TokeniserState tokeniserState43 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser32.transition(tokeniserState43);
        tokeniser25.transition(tokeniserState43);
        tokeniser16.transition(tokeniserState43);
        tokeniser1.transition(tokeniserState43);
        org.jsoup.parser.CharacterReader characterReader48 = null;
        org.jsoup.parser.Tokeniser tokeniser49 = new org.jsoup.parser.Tokeniser(characterReader48);
        tokeniser49.createDoctypePending();
        tokeniser49.createDoctypePending();
        org.jsoup.parser.Token.Comment comment52 = null;
        tokeniser49.commentPending = comment52;
        tokeniser49.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag55 = tokeniser49.tagPending;
        tokeniser49.emit('4');
        org.jsoup.parser.TokeniserState tokeniserState58 = tokeniser49.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNull(tag30);
        org.junit.Assert.assertNotNull(tokeniserState43);
        org.junit.Assert.assertNull(tag55);
        org.junit.Assert.assertNotNull(tokeniserState58);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        boolean boolean7 = tokeniser1.isTrackErrors();
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        tokeniser10.createDoctypePending();
        tokeniser10.createDoctypePending();
        org.jsoup.parser.Token.Comment comment13 = null;
        tokeniser10.commentPending = comment13;
        org.jsoup.parser.Token.Tag tag15 = tokeniser10.tagPending;
        java.lang.StringBuilder stringBuilder16 = tokeniser10.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState17 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser10.transition(tokeniserState17);
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        org.jsoup.parser.TokeniserState tokeniserState21 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser20.transition(tokeniserState21);
        org.jsoup.parser.Token.Comment comment23 = null;
        tokeniser20.commentPending = comment23;
        tokeniser20.emit('\ufffd');
        tokeniser20.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState28 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser20.transition(tokeniserState28);
        tokeniser20.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment31 = tokeniser20.commentPending;
        tokeniser10.commentPending = comment31;
        tokeniser1.commentPending = comment31;
        tokeniser1.setTrackErrors(true);
        tokeniser1.createTempBuffer();
        java.lang.StringBuilder stringBuilder37 = tokeniser1.dataBuffer;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(tag15);
        org.junit.Assert.assertNull(stringBuilder16);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertNotNull(comment31);
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
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
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.createTempBuffer();
        tokeniser1.acknowledgeSelfClosingFlag();
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
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
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
        tokeniser1.emit("");
        java.lang.StringBuilder stringBuilder23 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Tag tag25 = tokeniser1.createTagPending(false);
        boolean boolean26 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag27 = tokeniser1.tagPending;
        tokeniser1.emitTagPending();
        boolean boolean29 = tokeniser1.isTrackErrors();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(comment19);
        org.junit.Assert.assertNull(stringBuilder23);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
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
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        org.jsoup.parser.TokeniserState tokeniserState15 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser14.transition(tokeniserState15);
        org.jsoup.parser.Token.Comment comment17 = null;
        tokeniser14.commentPending = comment17;
        tokeniser14.emit('\ufffd');
        tokeniser14.createDoctypePending();
        boolean boolean22 = tokeniser14.currentNodeInHtmlNS();
        tokeniser14.emitDoctypePending();
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
        org.jsoup.parser.Token.Doctype doctype35 = tokeniser25.doctypePending;
        org.jsoup.parser.Token.Doctype doctype36 = tokeniser25.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser25.getState();
        tokeniser14.transition(tokeniserState37);
        org.jsoup.parser.Token.Tag tag40 = tokeniser14.createTagPending(true);
        org.jsoup.parser.Token token41 = tokeniser14.read();
        org.jsoup.parser.Token.Doctype doctype42 = tokeniser14.doctypePending;
        tokeniser1.doctypePending = doctype42;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doctype35);
        org.junit.Assert.assertNotNull(doctype36);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(token41);
        org.junit.Assert.assertNotNull(doctype42);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
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
        org.jsoup.parser.Token.Comment comment13 = tokeniser1.commentPending;
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.TagName;
        tokeniser1.transition(tokeniserState14);
        tokeniser1.emit("hi!");
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNull(comment13);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
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
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader13);
        tokeniser14.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser14.getState();
        tokeniser14.createTempBuffer();
        tokeniser14.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        org.jsoup.parser.TokeniserState tokeniserState21 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser20.transition(tokeniserState21);
        org.jsoup.parser.Token.Comment comment23 = null;
        tokeniser20.commentPending = comment23;
        tokeniser20.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment27 = tokeniser20.commentPending;
        org.jsoup.parser.Token.Tag tag29 = tokeniser20.createTagPending(true);
        tokeniser14.tagPending = tag29;
        java.lang.StringBuilder stringBuilder31 = tokeniser14.dataBuffer;
        tokeniser1.dataBuffer = stringBuilder31;
        tokeniser1.emit("");
        java.lang.StringBuilder stringBuilder35 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Comment comment36 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader37);
        tokeniser38.createDoctypePending();
        tokeniser38.createDoctypePending();
        org.jsoup.parser.Token.Comment comment41 = null;
        tokeniser38.commentPending = comment41;
        org.jsoup.parser.Token.Tag tag43 = tokeniser38.tagPending;
        tokeniser38.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader45);
        tokeniser46.createDoctypePending();
        tokeniser46.createDoctypePending();
        org.jsoup.parser.Token.Comment comment49 = null;
        tokeniser46.commentPending = comment49;
        tokeniser46.createDoctypePending();
        boolean boolean52 = tokeniser46.isTrackErrors();
        tokeniser46.createCommentPending();
        tokeniser46.emit("hi!");
        org.jsoup.parser.TokeniserState tokeniserState56 = org.jsoup.parser.TokeniserState.BeforeAttributeValue;
        tokeniser46.transition(tokeniserState56);
        tokeniser38.transition(tokeniserState56);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNull(comment27);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "");
        org.junit.Assert.assertNull(comment36);
        org.junit.Assert.assertNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(tokeniserState56);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
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
        tokeniser1.emit("");
        tokeniser1.emit('a');
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.Token.Tag tag86 = tokeniser1.tagPending;
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
        org.junit.Assert.assertNull(tag86);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.setTrackErrors(true);
        java.lang.StringBuilder stringBuilder6 = tokeniser1.dataBuffer;
        tokeniser1.createDoctypePending();
        boolean boolean8 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createTempBuffer();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        boolean boolean7 = tokeniser1.isTrackErrors();
        tokeniser1.createCommentPending();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser13.transition(tokeniserState14);
        tokeniser13.emit("hi!");
        org.jsoup.parser.Token.Comment comment18 = tokeniser13.commentPending;
        java.lang.StringBuilder stringBuilder19 = null;
        tokeniser13.dataBuffer = stringBuilder19;
        boolean boolean21 = tokeniser13.isTrackErrors();
        org.jsoup.parser.Token.Tag tag23 = tokeniser13.createTagPending(true);
        tokeniser1.tagPending = tag23;
        java.lang.StringBuilder stringBuilder25 = tokeniser1.dataBuffer;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNull(comment18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNull(stringBuilder25);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
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
        java.lang.StringBuilder stringBuilder12 = tokeniser1.dataBuffer;
        boolean boolean13 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(stringBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
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
        java.lang.StringBuilder stringBuilder27 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token token28 = tokeniser1.read();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNull(stringBuilder27);
        org.junit.Assert.assertNotNull(token28);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
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
        tokeniser1.emit(' ');
        boolean boolean16 = tokeniser1.isTrackErrors();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(doctype13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
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
            boolean boolean16 = tokeniser1.isAppropriateEndTagToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNull(tag15);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
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
        org.jsoup.parser.Token.Tag tag15 = tokeniser1.createTagPending(true);
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
        java.lang.StringBuilder stringBuilder29 = tokeniser17.dataBuffer;
        boolean boolean30 = tokeniser17.currentNodeInHtmlNS();
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser17.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(doctype28);
        org.junit.Assert.assertNull(stringBuilder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tokeniserState31);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        tokeniser1.createCommentPending();
        tokeniser1.setTrackErrors(true);
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(true);
        org.jsoup.parser.Token.Comment comment13 = tokeniser1.commentPending;
        tokeniser1.emitTagPending();
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(comment13);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        tokeniser8.createDoctypePending();
        tokeniser8.createDoctypePending();
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser8.commentPending = comment11;
        org.jsoup.parser.Token.Tag tag13 = tokeniser8.tagPending;
        java.lang.StringBuilder stringBuilder14 = tokeniser8.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState15 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser8.transition(tokeniserState15);
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader17);
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser18.transition(tokeniserState19);
        org.jsoup.parser.Token.Comment comment21 = null;
        tokeniser18.commentPending = comment21;
        tokeniser18.emit('\ufffd');
        tokeniser18.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState26 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser18.transition(tokeniserState26);
        tokeniser18.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment29 = tokeniser18.commentPending;
        tokeniser8.commentPending = comment29;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader31);
        org.jsoup.parser.TokeniserState tokeniserState33 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser32.transition(tokeniserState33);
        org.jsoup.parser.Token.Comment comment35 = null;
        tokeniser32.commentPending = comment35;
        tokeniser32.emit('\ufffd');
        tokeniser32.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        tokeniser41.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState43 = tokeniser41.getState();
        org.jsoup.parser.Token.Tag tag45 = tokeniser41.createTagPending(false);
        tokeniser32.tagPending = tag45;
        tokeniser8.emit((org.jsoup.parser.Token) tag45);
        tokeniser1.tagPending = tag45;
        org.jsoup.parser.CharacterReader characterReader49 = null;
        org.jsoup.parser.Tokeniser tokeniser50 = new org.jsoup.parser.Tokeniser(characterReader49);
        org.jsoup.parser.TokeniserState tokeniserState51 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser50.transition(tokeniserState51);
        org.jsoup.parser.Token.Comment comment53 = null;
        tokeniser50.commentPending = comment53;
        tokeniser50.emit('\ufffd');
        tokeniser50.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder59 = tokeniser50.dataBuffer;
        tokeniser50.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState61 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStartDash;
        tokeniser50.transition(tokeniserState61);
        org.jsoup.parser.TokeniserState tokeniserState63 = tokeniser50.getState();
        org.jsoup.parser.TokeniserState tokeniserState64 = org.jsoup.parser.TokeniserState.RawtextLessthanSign;
        tokeniser50.error(tokeniserState64);
        tokeniser1.error(tokeniserState64);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char69 = tokeniser1.consumeCharacterReference((java.lang.Character) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tag6);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNotNull(comment29);
        org.junit.Assert.assertNotNull(tokeniserState33);
        org.junit.Assert.assertNotNull(tokeniserState43);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(tokeniserState51);
        org.junit.Assert.assertNull(stringBuilder59);
        org.junit.Assert.assertNotNull(tokeniserState61);
        org.junit.Assert.assertNotNull(tokeniserState63);
        org.junit.Assert.assertNotNull(tokeniserState64);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Doctype doctype3 = tokeniser1.doctypePending;
        java.lang.StringBuilder stringBuilder4 = tokeniser1.dataBuffer;
        org.junit.Assert.assertNull(doctype3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
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
        org.jsoup.parser.Token.Tag tag44 = tokeniser1.createTagPending(true);
        org.jsoup.parser.Token.Tag tag46 = tokeniser1.createTagPending(true);
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
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
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(tag46);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createTempBuffer();
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Tag tag5 = tokeniser1.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader6);
        org.jsoup.parser.TokeniserState tokeniserState8 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser7.transition(tokeniserState8);
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser7.commentPending = comment10;
        tokeniser7.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser15.transition(tokeniserState16);
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser15.doctypePending;
        tokeniser15.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        org.jsoup.parser.TokeniserState tokeniserState23 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser22.transition(tokeniserState23);
        org.jsoup.parser.Token.Comment comment25 = null;
        tokeniser22.commentPending = comment25;
        tokeniser22.emit('\ufffd');
        tokeniser22.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState30 = tokeniser22.getState();
        boolean boolean31 = tokeniser22.currentNodeInHtmlNS();
        tokeniser22.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype33 = tokeniser22.doctypePending;
        tokeniser15.doctypePending = doctype33;
        tokeniser7.doctypePending = doctype33;
        tokeniser7.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader37);
        org.jsoup.parser.TokeniserState tokeniserState39 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser38.transition(tokeniserState39);
        org.jsoup.parser.Token.Comment comment41 = null;
        tokeniser38.commentPending = comment41;
        tokeniser38.emit('\ufffd');
        tokeniser38.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder47 = tokeniser38.dataBuffer;
        tokeniser38.acknowledgeSelfClosingFlag();
        boolean boolean49 = tokeniser38.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag50 = tokeniser38.tagPending;
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader51);
        org.jsoup.parser.TokeniserState tokeniserState53 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser52.transition(tokeniserState53);
        org.jsoup.parser.Token.Comment comment55 = null;
        tokeniser52.commentPending = comment55;
        tokeniser52.emit('\ufffd');
        tokeniser52.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState60 = tokeniser52.getState();
        boolean boolean61 = tokeniser52.currentNodeInHtmlNS();
        tokeniser52.emitDoctypePending();
        tokeniser52.emit("");
        org.jsoup.parser.CharacterReader characterReader65 = null;
        org.jsoup.parser.Tokeniser tokeniser66 = new org.jsoup.parser.Tokeniser(characterReader65);
        tokeniser66.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState68 = tokeniser66.getState();
        tokeniser66.createTempBuffer();
        tokeniser66.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader71 = null;
        org.jsoup.parser.Tokeniser tokeniser72 = new org.jsoup.parser.Tokeniser(characterReader71);
        org.jsoup.parser.TokeniserState tokeniserState73 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser72.transition(tokeniserState73);
        org.jsoup.parser.Token.Comment comment75 = null;
        tokeniser72.commentPending = comment75;
        tokeniser72.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment79 = tokeniser72.commentPending;
        org.jsoup.parser.Token.Tag tag81 = tokeniser72.createTagPending(true);
        tokeniser66.tagPending = tag81;
        java.lang.StringBuilder stringBuilder83 = tokeniser66.dataBuffer;
        tokeniser52.dataBuffer = stringBuilder83;
        tokeniser38.dataBuffer = stringBuilder83;
        tokeniser7.dataBuffer = stringBuilder83;
        org.jsoup.parser.Token.Doctype doctype87 = tokeniser7.doctypePending;
        tokeniser1.doctypePending = doctype87;
        tokeniser1.setTrackErrors(false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNull(doctype18);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(doctype33);
        org.junit.Assert.assertNotNull(tokeniserState39);
        org.junit.Assert.assertNull(stringBuilder47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(tag50);
        org.junit.Assert.assertNotNull(tokeniserState53);
        org.junit.Assert.assertNotNull(tokeniserState60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(tokeniserState68);
        org.junit.Assert.assertNotNull(tokeniserState73);
        org.junit.Assert.assertNull(comment79);
        org.junit.Assert.assertNotNull(tag81);
        org.junit.Assert.assertNotNull(stringBuilder83);
        org.junit.Assert.assertEquals(stringBuilder83.toString(), "");
        org.junit.Assert.assertNotNull(doctype87);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
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
        org.jsoup.parser.TokeniserState tokeniserState56 = tokeniser1.getState();
        tokeniser1.emit('a');
        org.jsoup.parser.Token.Comment comment59 = tokeniser1.commentPending;
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
        org.junit.Assert.assertNotNull(tokeniserState56);
        org.junit.Assert.assertNotNull(comment59);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype9 = tokeniser1.doctypePending;
        tokeniser1.createCommentPending();
        boolean boolean11 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.Token token12 = tokeniser1.read();
        tokeniser1.emit(' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNotNull(doctype9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(token12);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
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
        tokeniser1.emit(' ');
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        tokeniser37.createDoctypePending();
        tokeniser37.createDoctypePending();
        tokeniser37.emitDoctypePending();
        boolean boolean41 = tokeniser37.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState42 = tokeniser37.getState();
        tokeniser1.eofError(tokeniserState42);
        tokeniser1.createTempBuffer();
        java.lang.StringBuilder stringBuilder45 = tokeniser1.dataBuffer;
        tokeniser1.createDoctypePending();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(doctype31);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
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
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser15.transition(tokeniserState16);
        org.jsoup.parser.Token.Comment comment18 = null;
        tokeniser15.commentPending = comment18;
        tokeniser15.emit('\ufffd');
        tokeniser15.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser15.getState();
        java.lang.StringBuilder stringBuilder24 = tokeniser15.dataBuffer;
        org.jsoup.parser.Token.Doctype doctype25 = tokeniser15.doctypePending;
        tokeniser1.doctypePending = doctype25;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNull(stringBuilder24);
        org.junit.Assert.assertNotNull(doctype25);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
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
        org.jsoup.parser.Token.Doctype doctype14 = tokeniser1.doctypePending;
        tokeniser1.emit(' ');
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(doctype14);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
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
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.Token.Tag tag36 = tokeniser1.tagPending;
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader37);
        org.jsoup.parser.TokeniserState tokeniserState39 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser38.transition(tokeniserState39);
        org.jsoup.parser.Token.Comment comment41 = null;
        tokeniser38.commentPending = comment41;
        tokeniser38.emit('\ufffd');
        tokeniser38.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState46 = tokeniser38.getState();
        tokeniser38.emitDoctypePending();
        tokeniser38.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState49 = org.jsoup.parser.TokeniserState.RawtextEndTagOpen;
        tokeniser38.transition(tokeniserState49);
        org.jsoup.parser.Token.Comment comment51 = tokeniser38.commentPending;
        org.jsoup.parser.CharacterReader characterReader52 = null;
        org.jsoup.parser.Tokeniser tokeniser53 = new org.jsoup.parser.Tokeniser(characterReader52);
        org.jsoup.parser.TokeniserState tokeniserState54 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser53.transition(tokeniserState54);
        org.jsoup.parser.Token.Comment comment56 = null;
        tokeniser53.commentPending = comment56;
        tokeniser53.emit('\ufffd');
        tokeniser53.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder62 = tokeniser53.dataBuffer;
        tokeniser53.acknowledgeSelfClosingFlag();
        boolean boolean64 = tokeniser53.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag65 = tokeniser53.tagPending;
        org.jsoup.parser.TokeniserState tokeniserState66 = tokeniser53.getState();
        org.jsoup.parser.Token.Doctype doctype67 = tokeniser53.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState68 = org.jsoup.parser.TokeniserState.PLAINTEXT;
        tokeniser53.error(tokeniserState68);
        tokeniser38.transition(tokeniserState68);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState68);
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
        org.junit.Assert.assertNull(tag36);
        org.junit.Assert.assertNotNull(tokeniserState39);
        org.junit.Assert.assertNotNull(tokeniserState46);
        org.junit.Assert.assertNotNull(tokeniserState49);
        org.junit.Assert.assertNotNull(comment51);
        org.junit.Assert.assertNotNull(tokeniserState54);
        org.junit.Assert.assertNull(stringBuilder62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(tag65);
        org.junit.Assert.assertNotNull(tokeniserState66);
        org.junit.Assert.assertNull(doctype67);
        org.junit.Assert.assertNotNull(tokeniserState68);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser1.dataBuffer = stringBuilder7;
        tokeniser1.emit(' ');
        tokeniser1.createDoctypePending();
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
        boolean boolean24 = tokeniser13.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Tag tag25 = tokeniser13.tagPending;
        tokeniser13.emit('#');
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader28);
        tokeniser29.createDoctypePending();
        tokeniser29.createDoctypePending();
        org.jsoup.parser.Token.Comment comment32 = null;
        tokeniser29.commentPending = comment32;
        boolean boolean34 = tokeniser29.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        org.jsoup.parser.TokeniserState tokeniserState37 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser36.transition(tokeniserState37);
        org.jsoup.parser.Token.Comment comment39 = null;
        tokeniser36.commentPending = comment39;
        tokeniser36.emit('\ufffd');
        tokeniser36.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState44 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser36.transition(tokeniserState44);
        tokeniser36.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment47 = tokeniser36.commentPending;
        tokeniser29.commentPending = comment47;
        org.jsoup.parser.CharacterReader characterReader49 = null;
        org.jsoup.parser.Tokeniser tokeniser50 = new org.jsoup.parser.Tokeniser(characterReader49);
        org.jsoup.parser.TokeniserState tokeniserState51 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser50.transition(tokeniserState51);
        org.jsoup.parser.Token.Comment comment53 = null;
        tokeniser50.commentPending = comment53;
        tokeniser50.emit('\ufffd');
        tokeniser50.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState58 = tokeniser50.getState();
        boolean boolean59 = tokeniser50.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader60 = null;
        org.jsoup.parser.Tokeniser tokeniser61 = new org.jsoup.parser.Tokeniser(characterReader60);
        tokeniser61.createDoctypePending();
        tokeniser61.createDoctypePending();
        org.jsoup.parser.Token.Comment comment64 = null;
        tokeniser61.commentPending = comment64;
        org.jsoup.parser.Token.Doctype doctype66 = tokeniser61.doctypePending;
        tokeniser50.doctypePending = doctype66;
        tokeniser29.emit((org.jsoup.parser.Token) doctype66);
        tokeniser13.doctypePending = doctype66;
        org.jsoup.parser.CharacterReader characterReader70 = null;
        org.jsoup.parser.Tokeniser tokeniser71 = new org.jsoup.parser.Tokeniser(characterReader70);
        tokeniser71.createDoctypePending();
        tokeniser71.createDoctypePending();
        org.jsoup.parser.Token.Comment comment74 = null;
        tokeniser71.commentPending = comment74;
        boolean boolean76 = tokeniser71.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader77 = null;
        org.jsoup.parser.Tokeniser tokeniser78 = new org.jsoup.parser.Tokeniser(characterReader77);
        org.jsoup.parser.TokeniserState tokeniserState79 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser78.transition(tokeniserState79);
        org.jsoup.parser.Token.Comment comment81 = null;
        tokeniser78.commentPending = comment81;
        tokeniser78.emit('\ufffd');
        tokeniser78.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState86 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser78.transition(tokeniserState86);
        tokeniser78.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment89 = tokeniser78.commentPending;
        tokeniser71.commentPending = comment89;
        tokeniser13.commentPending = comment89;
        org.jsoup.parser.Token.Comment comment92 = tokeniser13.commentPending;
        org.jsoup.parser.Token.Comment comment93 = tokeniser13.commentPending;
        tokeniser1.commentPending = comment93;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNull(stringBuilder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertNotNull(tokeniserState44);
        org.junit.Assert.assertNotNull(comment47);
        org.junit.Assert.assertNotNull(tokeniserState51);
        org.junit.Assert.assertNotNull(tokeniserState58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(doctype66);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(tokeniserState79);
        org.junit.Assert.assertNotNull(tokeniserState86);
        org.junit.Assert.assertNotNull(comment89);
        org.junit.Assert.assertNotNull(comment92);
        org.junit.Assert.assertNotNull(comment93);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Comment comment7 = null;
        tokeniser1.commentPending = comment7;
        org.jsoup.parser.Token.Doctype doctype9 = tokeniser1.doctypePending;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader10);
        tokeniser11.createDoctypePending();
        tokeniser11.createDoctypePending();
        org.jsoup.parser.Token.Comment comment14 = null;
        tokeniser11.commentPending = comment14;
        org.jsoup.parser.Token.Tag tag16 = tokeniser11.tagPending;
        java.lang.StringBuilder stringBuilder17 = tokeniser11.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.ScriptData;
        tokeniser11.transition(tokeniserState18);
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        org.jsoup.parser.TokeniserState tokeniserState22 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser21.transition(tokeniserState22);
        org.jsoup.parser.Token.Comment comment24 = null;
        tokeniser21.commentPending = comment24;
        tokeniser21.emit('\ufffd');
        tokeniser21.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState29 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        tokeniser21.transition(tokeniserState29);
        tokeniser21.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment32 = tokeniser21.commentPending;
        tokeniser11.commentPending = comment32;
        tokeniser1.commentPending = comment32;
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        tokeniser36.createDoctypePending();
        tokeniser36.createDoctypePending();
        tokeniser36.createDoctypePending();
        org.jsoup.parser.Token.Tag tag41 = tokeniser36.createTagPending(true);
        org.jsoup.parser.Token.Tag tag42 = tokeniser36.tagPending;
        org.jsoup.parser.Token.Tag tag43 = tokeniser36.tagPending;
        org.jsoup.parser.Token.Doctype doctype44 = tokeniser36.doctypePending;
        tokeniser1.doctypePending = doctype44;
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.Token.Tag tag48 = tokeniser1.createTagPending(true);
        tokeniser1.emit("hi!");
        tokeniser1.setTrackErrors(false);
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNull(doctype9);
        org.junit.Assert.assertNull(tag16);
        org.junit.Assert.assertNull(stringBuilder17);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNotNull(comment32);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(doctype44);
        org.junit.Assert.assertNotNull(tag48);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createTempBuffer();
        tokeniser1.createCommentPending();
        boolean boolean4 = tokeniser1.isTrackErrors();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader5);
        org.jsoup.parser.TokeniserState tokeniserState7 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser6.transition(tokeniserState7);
        tokeniser6.emit("hi!");
        org.jsoup.parser.Token.Comment comment11 = tokeniser6.commentPending;
        java.lang.StringBuilder stringBuilder12 = null;
        tokeniser6.dataBuffer = stringBuilder12;
        tokeniser6.setTrackErrors(false);
        tokeniser6.emit(' ');
        tokeniser6.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        org.jsoup.parser.TokeniserState tokeniserState21 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser20.transition(tokeniserState21);
        tokeniser20.emit("hi!");
        org.jsoup.parser.Token.Comment comment25 = null;
        tokeniser20.commentPending = comment25;
        tokeniser20.createCommentPending();
        org.jsoup.parser.Token.Comment comment28 = tokeniser20.commentPending;
        tokeniser6.commentPending = comment28;
        tokeniser1.commentPending = comment28;
        org.jsoup.parser.Token.Tag tag31 = tokeniser1.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNull(comment11);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(comment28);
        org.junit.Assert.assertNull(tag31);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
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
        tokeniser1.emit('a');
        tokeniser1.emitDoctypePending();
        tokeniser1.emit('4');
        org.junit.Assert.assertNotNull(tokeniserState3);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tokeniserState21);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        tokeniser1.createTempBuffer();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        tokeniser12.createDoctypePending();
        tokeniser12.createDoctypePending();
        org.jsoup.parser.Token.Comment comment15 = null;
        tokeniser12.commentPending = comment15;
        boolean boolean17 = tokeniser12.isTrackErrors();
        boolean boolean18 = tokeniser12.isTrackErrors();
        tokeniser12.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState20 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        tokeniser12.transition(tokeniserState20);
        tokeniser12.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader23);
        org.jsoup.parser.TokeniserState tokeniserState25 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser24.transition(tokeniserState25);
        tokeniser24.emit("hi!");
        org.jsoup.parser.Token.Comment comment29 = null;
        tokeniser24.commentPending = comment29;
        tokeniser24.createCommentPending();
        org.jsoup.parser.Token.Comment comment32 = tokeniser24.commentPending;
        tokeniser12.commentPending = comment32;
        tokeniser1.commentPending = comment32;
        org.jsoup.parser.TokeniserState tokeniserState35 = tokeniser1.getState();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNotNull(comment32);
        org.junit.Assert.assertNotNull(tokeniserState35);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
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
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader16);
        org.jsoup.parser.TokeniserState tokeniserState18 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser17.transition(tokeniserState18);
        org.jsoup.parser.Token.Comment comment20 = null;
        tokeniser17.commentPending = comment20;
        tokeniser17.emit('\ufffd');
        tokeniser17.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState25 = tokeniser17.getState();
        tokeniser17.emit("hi!");
        tokeniser17.emit('#');
        boolean boolean30 = tokeniser17.isTrackErrors();
        java.lang.StringBuilder stringBuilder31 = tokeniser17.dataBuffer;
        org.jsoup.parser.Token.Tag tag33 = tokeniser17.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype34 = tokeniser17.doctypePending;
        tokeniser1.doctypePending = doctype34;
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader36);
        org.jsoup.parser.TokeniserState tokeniserState38 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser37.transition(tokeniserState38);
        tokeniser37.emit("hi!");
        org.jsoup.parser.Token.Comment comment42 = tokeniser37.commentPending;
        org.jsoup.parser.Token.Comment comment43 = null;
        tokeniser37.commentPending = comment43;
        tokeniser37.emit('\ufffd');
        org.jsoup.parser.CharacterReader characterReader47 = null;
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader47);
        org.jsoup.parser.TokeniserState tokeniserState49 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser48.transition(tokeniserState49);
        tokeniser48.emit("hi!");
        org.jsoup.parser.Token.Comment comment53 = null;
        tokeniser48.commentPending = comment53;
        tokeniser48.setTrackErrors(true);
        org.jsoup.parser.TokeniserState tokeniserState57 = tokeniser48.getState();
        tokeniser48.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype59 = tokeniser48.doctypePending;
        org.jsoup.parser.Token.Doctype doctype60 = tokeniser48.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState61 = tokeniser48.getState();
        org.jsoup.parser.TokeniserState tokeniserState62 = tokeniser48.getState();
        tokeniser37.transition(tokeniserState62);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(stringBuilder31);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(doctype34);
        org.junit.Assert.assertNotNull(tokeniserState38);
        org.junit.Assert.assertNull(comment42);
        org.junit.Assert.assertNotNull(tokeniserState49);
        org.junit.Assert.assertNotNull(tokeniserState57);
        org.junit.Assert.assertNull(doctype59);
        org.junit.Assert.assertNull(doctype60);
        org.junit.Assert.assertNotNull(tokeniserState61);
        org.junit.Assert.assertNotNull(tokeniserState62);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
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
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag18 = tokeniser1.createTagPending(true);
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
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
        boolean boolean20 = tokeniser1.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader21);
        tokeniser22.createDoctypePending();
        org.jsoup.parser.Token.Comment comment24 = tokeniser22.commentPending;
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader25);
        tokeniser26.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser26.getState();
        org.jsoup.parser.Token.Tag tag30 = tokeniser26.createTagPending(false);
        tokeniser22.tagPending = tag30;
        org.jsoup.parser.TokeniserState tokeniserState32 = tokeniser22.getState();
        tokeniser22.emit('a');
        org.jsoup.parser.TokeniserState tokeniserState35 = tokeniser22.getState();
        org.jsoup.parser.Token.Doctype doctype36 = tokeniser22.doctypePending;
        tokeniser1.doctypePending = doctype36;
        org.jsoup.parser.TokeniserState tokeniserState38 = tokeniser1.getState();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(comment24);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(tokeniserState32);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNotNull(doctype36);
        org.junit.Assert.assertNotNull(tokeniserState38);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
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
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader82 = null;
        org.jsoup.parser.Tokeniser tokeniser83 = new org.jsoup.parser.Tokeniser(characterReader82);
        tokeniser83.createDoctypePending();
        tokeniser83.createDoctypePending();
        tokeniser83.createDoctypePending();
        org.jsoup.parser.Token.Tag tag88 = tokeniser83.createTagPending(true);
        org.jsoup.parser.Token.Tag tag89 = tokeniser83.tagPending;
        org.jsoup.parser.Token.Tag tag90 = tokeniser83.tagPending;
        tokeniser1.tagPending = tag90;
        org.jsoup.parser.TokeniserState tokeniserState92 = org.jsoup.parser.TokeniserState.BetweenDoctypePublicAndSystemIdentifiers;
        tokeniser1.error(tokeniserState92);
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
        org.junit.Assert.assertNotNull(tag88);
        org.junit.Assert.assertNotNull(tag89);
        org.junit.Assert.assertNotNull(tag90);
        org.junit.Assert.assertNotNull(tokeniserState92);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
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
        tokeniser1.setTrackErrors(true);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNull(tag17);
        org.junit.Assert.assertNotNull(tokeniserState19);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
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
        tokeniser10.createDoctypePending();
        tokeniser10.createDoctypePending();
        org.jsoup.parser.Token.Tag tag13 = tokeniser10.tagPending;
        tokeniser10.createCommentPending();
        org.jsoup.parser.Token.Comment comment15 = tokeniser10.commentPending;
        tokeniser1.commentPending = comment15;
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(comment15);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
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
        tokeniser1.createTempBuffer();
        org.jsoup.parser.Token.Comment comment55 = tokeniser1.commentPending;
        boolean boolean56 = tokeniser1.currentNodeInHtmlNS();
        boolean boolean57 = tokeniser1.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState58 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.error(tokeniserState58);
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
        org.junit.Assert.assertNotNull(doctype48);
        org.junit.Assert.assertNull(tag49);
        org.junit.Assert.assertNotNull(tokeniserState50);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(comment55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
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
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser13.transition(tokeniserState14);
        tokeniser13.emit("hi!");
        org.jsoup.parser.Token.Comment comment18 = null;
        tokeniser13.commentPending = comment18;
        tokeniser13.createCommentPending();
        org.jsoup.parser.Token.Comment comment21 = tokeniser13.commentPending;
        tokeniser1.commentPending = comment21;
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader24);
        tokeniser25.createDoctypePending();
        tokeniser25.createDoctypePending();
        org.jsoup.parser.Token.Comment comment28 = null;
        tokeniser25.commentPending = comment28;
        tokeniser25.createDoctypePending();
        tokeniser25.emit("");
        tokeniser25.createDoctypePending();
        org.jsoup.parser.Token.Comment comment34 = null;
        tokeniser25.commentPending = comment34;
        org.jsoup.parser.TokeniserState tokeniserState36 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        tokeniser25.transition(tokeniserState36);
        tokeniser1.transition(tokeniserState36);
        org.jsoup.parser.TokeniserState tokeniserState39 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.advanceTransition(tokeniserState39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(comment21);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNotNull(tokeniserState39);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
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
        tokeniser1.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader68 = null;
        org.jsoup.parser.Tokeniser tokeniser69 = new org.jsoup.parser.Tokeniser(characterReader68);
        tokeniser69.createDoctypePending();
        tokeniser69.createDoctypePending();
        org.jsoup.parser.Token.Comment comment72 = null;
        tokeniser69.commentPending = comment72;
        org.jsoup.parser.Token.Doctype doctype74 = tokeniser69.doctypePending;
        org.jsoup.parser.Token.Tag tag75 = tokeniser69.tagPending;
        tokeniser69.setTrackErrors(false);
        tokeniser69.createDoctypePending();
        org.jsoup.parser.Token.Tag tag80 = tokeniser69.createTagPending(true);
        tokeniser1.tagPending = tag80;
        org.jsoup.parser.Token token82 = tokeniser1.read();
        tokeniser1.createTempBuffer();
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
        org.junit.Assert.assertNotNull(doctype74);
        org.junit.Assert.assertNull(tag75);
        org.junit.Assert.assertNotNull(tag80);
        org.junit.Assert.assertNotNull(token82);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
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
        boolean boolean15 = tokeniser10.isTrackErrors();
        boolean boolean16 = tokeniser10.isTrackErrors();
        tokeniser10.createCommentPending();
        tokeniser10.emit("");
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        org.jsoup.parser.TokeniserState tokeniserState22 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser21.transition(tokeniserState22);
        org.jsoup.parser.Token.Comment comment24 = null;
        tokeniser21.commentPending = comment24;
        tokeniser21.emit('\ufffd');
        tokeniser21.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser21.getState();
        tokeniser21.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader32);
        tokeniser33.createDoctypePending();
        tokeniser33.createDoctypePending();
        org.jsoup.parser.Token.Comment comment36 = null;
        tokeniser33.commentPending = comment36;
        org.jsoup.parser.Token.Doctype doctype38 = tokeniser33.doctypePending;
        org.jsoup.parser.Token.Tag tag39 = tokeniser33.tagPending;
        boolean boolean40 = tokeniser33.isTrackErrors();
        tokeniser33.emit("hi!");
        org.jsoup.parser.Token.Tag tag44 = tokeniser33.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader45);
        tokeniser46.createDoctypePending();
        org.jsoup.parser.Token.Tag tag49 = tokeniser46.createTagPending(true);
        tokeniser33.emit((org.jsoup.parser.Token) tag49);
        tokeniser21.emit((org.jsoup.parser.Token) tag49);
        org.jsoup.parser.Token.Doctype doctype52 = tokeniser21.doctypePending;
        tokeniser10.doctypePending = doctype52;
        tokeniser1.emit((org.jsoup.parser.Token) doctype52);
        org.jsoup.parser.Token.Comment comment55 = tokeniser1.commentPending;
        tokeniser1.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char59 = tokeniser1.consumeCharacterReference((java.lang.Character) '\ufffd', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNotNull(doctype38);
        org.junit.Assert.assertNull(tag39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(doctype52);
        org.junit.Assert.assertNotNull(comment55);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.setTrackErrors(false);
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser1.doctypePending;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertNull(doctype11);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
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
        java.lang.StringBuilder stringBuilder29 = tokeniser1.dataBuffer;
        tokeniser1.setTrackErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(doctype26);
        org.junit.Assert.assertNull(stringBuilder29);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment3 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag4 = tokeniser1.tagPending;
        tokeniser1.createDoctypePending();
        org.junit.Assert.assertNull(comment3);
        org.junit.Assert.assertNull(tag4);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createCommentPending();
        boolean boolean9 = tokeniser1.isTrackErrors();
        tokeniser1.emitCommentPending();
        tokeniser1.setTrackErrors(false);
        boolean boolean13 = tokeniser1.isTrackErrors();
        org.jsoup.parser.Token token14 = tokeniser1.read();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(token14);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
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
        tokeniser1.emit(' ');
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader35);
        org.jsoup.parser.TokeniserState tokeniserState37 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser36.transition(tokeniserState37);
        org.jsoup.parser.Token.Comment comment39 = null;
        tokeniser36.commentPending = comment39;
        tokeniser36.emit('\ufffd');
        tokeniser36.createDoctypePending();
        boolean boolean44 = tokeniser36.currentNodeInHtmlNS();
        tokeniser36.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader46);
        org.jsoup.parser.TokeniserState tokeniserState48 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser47.transition(tokeniserState48);
        org.jsoup.parser.Token.Comment comment50 = null;
        tokeniser47.commentPending = comment50;
        tokeniser47.emit('\ufffd');
        tokeniser47.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState55 = tokeniser47.getState();
        boolean boolean56 = tokeniser47.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Doctype doctype57 = tokeniser47.doctypePending;
        org.jsoup.parser.Token.Doctype doctype58 = tokeniser47.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState59 = tokeniser47.getState();
        tokeniser36.transition(tokeniserState59);
        tokeniser1.eofError(tokeniserState59);
        org.jsoup.parser.CharacterReader characterReader62 = null;
        org.jsoup.parser.Tokeniser tokeniser63 = new org.jsoup.parser.Tokeniser(characterReader62);
        org.jsoup.parser.TokeniserState tokeniserState64 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser63.transition(tokeniserState64);
        org.jsoup.parser.Token.Comment comment66 = null;
        tokeniser63.commentPending = comment66;
        tokeniser63.emit('\ufffd');
        tokeniser63.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState71 = tokeniser63.getState();
        tokeniser63.emitDoctypePending();
        tokeniser63.createCommentPending();
        tokeniser63.createCommentPending();
        java.lang.StringBuilder stringBuilder75 = tokeniser63.dataBuffer;
        tokeniser63.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype77 = tokeniser63.doctypePending;
        tokeniser63.setTrackErrors(true);
        boolean boolean80 = tokeniser63.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader81 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState59.read(tokeniser63, characterReader81);
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
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tokeniserState48);
        org.junit.Assert.assertNotNull(tokeniserState55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(doctype57);
        org.junit.Assert.assertNotNull(doctype58);
        org.junit.Assert.assertNotNull(tokeniserState59);
        org.junit.Assert.assertNotNull(tokeniserState64);
        org.junit.Assert.assertNotNull(tokeniserState71);
        org.junit.Assert.assertNull(stringBuilder75);
        org.junit.Assert.assertNotNull(doctype77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
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
        tokeniser1.emit("");
        tokeniser1.createCommentPending();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
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
        java.lang.StringBuilder stringBuilder19 = tokeniser1.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser1.getState();
        tokeniser1.setTrackErrors(false);
        tokeniser1.createTempBuffer();
        java.lang.StringBuilder stringBuilder24 = tokeniser1.dataBuffer;
        boolean boolean25 = tokeniser1.currentNodeInHtmlNS();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNull(stringBuilder19);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        boolean boolean6 = tokeniser1.isTrackErrors();
        org.jsoup.parser.TokeniserState tokeniserState7 = tokeniser1.getState();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype9 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser1.getState();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.createDoctypePending();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tokeniserState7);
        org.junit.Assert.assertNotNull(doctype9);
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment4 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag5 = tokeniser1.tagPending;
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Comment comment7 = null;
        tokeniser1.commentPending = comment7;
        org.jsoup.parser.Token.Tag tag10 = tokeniser1.createTagPending(false);
        tokeniser1.createTempBuffer();
        org.junit.Assert.assertNull(comment4);
        org.junit.Assert.assertNull(tag5);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.setTrackErrors(true);
        tokeniser1.createCommentPending();
        tokeniser1.emit('a');
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader9);
        tokeniser10.emit('\ufffd');
        tokeniser10.setTrackErrors(false);
        org.jsoup.parser.Token.Tag tag15 = tokeniser10.tagPending;
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
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        org.jsoup.parser.TokeniserState tokeniserState42 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser41.transition(tokeniserState42);
        org.jsoup.parser.Token.Comment comment44 = null;
        tokeniser41.commentPending = comment44;
        tokeniser41.emit('\ufffd');
        tokeniser41.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader49 = null;
        org.jsoup.parser.Tokeniser tokeniser50 = new org.jsoup.parser.Tokeniser(characterReader49);
        tokeniser50.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState52 = tokeniser50.getState();
        org.jsoup.parser.Token.Tag tag54 = tokeniser50.createTagPending(false);
        tokeniser41.tagPending = tag54;
        tokeniser17.emit((org.jsoup.parser.Token) tag54);
        tokeniser10.tagPending = tag54;
        tokeniser1.tagPending = tag54;
        org.jsoup.parser.TokeniserState tokeniserState59 = tokeniser1.getState();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(tag15);
        org.junit.Assert.assertNull(tag22);
        org.junit.Assert.assertNull(stringBuilder23);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNotNull(comment38);
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertNotNull(tokeniserState52);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertNotNull(tokeniserState59);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.emit('\ufffd');
        tokeniser1.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser1.getState();
        java.lang.StringBuilder stringBuilder10 = tokeniser1.dataBuffer;
        org.jsoup.parser.Token.Tag tag12 = tokeniser1.createTagPending(false);
        tokeniser1.createCommentPending();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.setTrackErrors(true);
        tokeniser1.emit("hi!");
        tokeniser1.createTempBuffer();
        tokeniser1.createDoctypePending();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.junit.Assert.assertNotNull(tokeniserState2);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
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
        org.jsoup.parser.Token.Comment comment12 = tokeniser1.commentPending;
        tokeniser1.createCommentPending();
        tokeniser1.createCommentPending();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNull(comment12);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
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
        org.jsoup.parser.TokeniserState tokeniserState17 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser16.transition(tokeniserState17);
        tokeniser16.emit("hi!");
        org.jsoup.parser.Token.Comment comment21 = tokeniser16.commentPending;
        java.lang.StringBuilder stringBuilder22 = null;
        tokeniser16.dataBuffer = stringBuilder22;
        tokeniser16.setTrackErrors(false);
        tokeniser16.emit(' ');
        boolean boolean28 = tokeniser16.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        org.jsoup.parser.TokeniserState tokeniserState31 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser30.transition(tokeniserState31);
        org.jsoup.parser.Token.Comment comment33 = null;
        tokeniser30.commentPending = comment33;
        tokeniser30.emit('\ufffd');
        tokeniser30.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState38 = tokeniser30.getState();
        tokeniser30.emit("hi!");
        tokeniser30.emit('#');
        boolean boolean43 = tokeniser30.isTrackErrors();
        java.lang.StringBuilder stringBuilder44 = tokeniser30.dataBuffer;
        org.jsoup.parser.Token.Tag tag46 = tokeniser30.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype47 = tokeniser30.doctypePending;
        org.jsoup.parser.Token.Tag tag49 = tokeniser30.createTagPending(false);
        tokeniser16.tagPending = tag49;
        tokeniser1.emit((org.jsoup.parser.Token) tag49);
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNull(comment21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNotNull(tokeniserState38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(stringBuilder44);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(doctype47);
        org.junit.Assert.assertNotNull(tag49);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
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
        tokeniser1.createDoctypePending();
        boolean boolean17 = tokeniser1.isTrackErrors();
        org.jsoup.parser.Token.Comment comment18 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Doctype doctype19 = tokeniser1.doctypePending;
        tokeniser1.emit('4');
        tokeniser1.emitTagPending();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(comment18);
        org.junit.Assert.assertNotNull(doctype19);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Tag tag6 = tokeniser1.createTagPending(true);
        org.jsoup.parser.Token.Tag tag7 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Tag tag8 = tokeniser1.tagPending;
        org.jsoup.parser.Token.Comment comment9 = tokeniser1.commentPending;
        tokeniser1.emitDoctypePending();
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNull(comment9);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
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
        org.jsoup.parser.Token.Doctype doctype17 = tokeniser1.doctypePending;
        tokeniser1.setTrackErrors(false);
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
        org.junit.Assert.assertNull(doctype17);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
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
        tokeniser11.createDoctypePending();
        tokeniser11.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader20);
        tokeniser21.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser21.getState();
        tokeniser21.createTempBuffer();
        tokeniser21.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader26);
        org.jsoup.parser.TokeniserState tokeniserState28 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser27.transition(tokeniserState28);
        org.jsoup.parser.Token.Comment comment30 = null;
        tokeniser27.commentPending = comment30;
        tokeniser27.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment34 = tokeniser27.commentPending;
        org.jsoup.parser.Token.Tag tag36 = tokeniser27.createTagPending(true);
        tokeniser21.tagPending = tag36;
        java.lang.StringBuilder stringBuilder38 = tokeniser21.dataBuffer;
        tokeniser11.dataBuffer = stringBuilder38;
        tokeniser1.dataBuffer = stringBuilder38;
        tokeniser1.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader43);
        org.jsoup.parser.TokeniserState tokeniserState45 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser44.transition(tokeniserState45);
        org.jsoup.parser.Token.Comment comment47 = null;
        tokeniser44.commentPending = comment47;
        tokeniser44.emit('\ufffd');
        tokeniser44.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState52 = tokeniser44.getState();
        tokeniser44.emit("hi!");
        tokeniser44.createDoctypePending();
        boolean boolean56 = tokeniser44.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment57 = tokeniser44.commentPending;
        org.jsoup.parser.Token.Tag tag59 = tokeniser44.createTagPending(true);
        tokeniser1.tagPending = tag59;
        tokeniser1.setTrackErrors(true);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertNull(comment34);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(stringBuilder38);
        org.junit.Assert.assertEquals(stringBuilder38.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertNotNull(tokeniserState52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(comment57);
        org.junit.Assert.assertNotNull(tag59);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
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
        tokeniser1.emit("");
        tokeniser1.emitDoctypePending();
        tokeniser1.emit('#');
        org.jsoup.parser.Token.Doctype doctype22 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Tag tag24 = tokeniser1.createTagPending(true);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(doctype22);
        org.junit.Assert.assertNotNull(tag24);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader7);
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser8.transition(tokeniserState9);
        org.jsoup.parser.Token.Comment comment11 = null;
        tokeniser8.commentPending = comment11;
        tokeniser8.emit('\ufffd');
        tokeniser8.setTrackErrors(false);
        tokeniser8.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser8.getState();
        tokeniser8.setTrackErrors(true);
        boolean boolean21 = tokeniser8.isTrackErrors();
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
        tokeniser35.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser35.getState();
        tokeniser35.createTempBuffer();
        tokeniser35.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader40);
        org.jsoup.parser.TokeniserState tokeniserState42 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser41.transition(tokeniserState42);
        org.jsoup.parser.Token.Comment comment44 = null;
        tokeniser41.commentPending = comment44;
        tokeniser41.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment48 = tokeniser41.commentPending;
        org.jsoup.parser.Token.Tag tag50 = tokeniser41.createTagPending(true);
        tokeniser35.tagPending = tag50;
        java.lang.StringBuilder stringBuilder52 = tokeniser35.dataBuffer;
        tokeniser23.dataBuffer = stringBuilder52;
        tokeniser8.dataBuffer = stringBuilder52;
        tokeniser1.dataBuffer = stringBuilder52;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token56 = tokeniser1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNotNull(tokeniserState37);
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertNull(comment48);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
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
        java.lang.StringBuilder stringBuilder19 = tokeniser1.dataBuffer;
        tokeniser1.createDoctypePending();
        tokeniser1.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        org.jsoup.parser.TokeniserState tokeniserState24 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser23.transition(tokeniserState24);
        org.jsoup.parser.Token.Comment comment26 = null;
        tokeniser23.commentPending = comment26;
        org.jsoup.parser.Token.Tag tag28 = tokeniser23.tagPending;
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        org.jsoup.parser.TokeniserState tokeniserState31 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser30.transition(tokeniserState31);
        org.jsoup.parser.Token.Comment comment33 = null;
        tokeniser30.commentPending = comment33;
        tokeniser30.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader37);
        org.jsoup.parser.TokeniserState tokeniserState39 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser38.transition(tokeniserState39);
        org.jsoup.parser.Token.Doctype doctype41 = tokeniser38.doctypePending;
        tokeniser38.setTrackErrors(true);
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
        tokeniser45.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype56 = tokeniser45.doctypePending;
        tokeniser38.doctypePending = doctype56;
        tokeniser30.doctypePending = doctype56;
        org.jsoup.parser.CharacterReader characterReader59 = null;
        org.jsoup.parser.Tokeniser tokeniser60 = new org.jsoup.parser.Tokeniser(characterReader59);
        org.jsoup.parser.TokeniserState tokeniserState61 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser60.transition(tokeniserState61);
        org.jsoup.parser.Token.Comment comment63 = null;
        tokeniser60.commentPending = comment63;
        tokeniser60.setTrackErrors(false);
        org.jsoup.parser.CharacterReader characterReader67 = null;
        org.jsoup.parser.Tokeniser tokeniser68 = new org.jsoup.parser.Tokeniser(characterReader67);
        org.jsoup.parser.TokeniserState tokeniserState69 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser68.transition(tokeniserState69);
        org.jsoup.parser.Token.Doctype doctype71 = tokeniser68.doctypePending;
        tokeniser68.setTrackErrors(true);
        org.jsoup.parser.CharacterReader characterReader74 = null;
        org.jsoup.parser.Tokeniser tokeniser75 = new org.jsoup.parser.Tokeniser(characterReader74);
        org.jsoup.parser.TokeniserState tokeniserState76 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser75.transition(tokeniserState76);
        org.jsoup.parser.Token.Comment comment78 = null;
        tokeniser75.commentPending = comment78;
        tokeniser75.emit('\ufffd');
        tokeniser75.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState83 = tokeniser75.getState();
        boolean boolean84 = tokeniser75.currentNodeInHtmlNS();
        tokeniser75.emitDoctypePending();
        org.jsoup.parser.Token.Doctype doctype86 = tokeniser75.doctypePending;
        tokeniser68.doctypePending = doctype86;
        tokeniser60.doctypePending = doctype86;
        tokeniser30.doctypePending = doctype86;
        tokeniser30.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState91 = tokeniser30.getState();
        org.jsoup.parser.Token.Doctype doctype92 = tokeniser30.doctypePending;
        tokeniser23.doctypePending = doctype92;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emit((org.jsoup.parser.Token) doctype92);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNull(stringBuilder19);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNull(tag28);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNotNull(tokeniserState39);
        org.junit.Assert.assertNull(doctype41);
        org.junit.Assert.assertNotNull(tokeniserState46);
        org.junit.Assert.assertNotNull(tokeniserState53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(doctype56);
        org.junit.Assert.assertNotNull(tokeniserState61);
        org.junit.Assert.assertNotNull(tokeniserState69);
        org.junit.Assert.assertNull(doctype71);
        org.junit.Assert.assertNotNull(tokeniserState76);
        org.junit.Assert.assertNotNull(tokeniserState83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(doctype86);
        org.junit.Assert.assertNotNull(tokeniserState91);
        org.junit.Assert.assertNotNull(doctype92);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
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
        tokeniser1.setTrackErrors(false);
        boolean boolean17 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.createTempBuffer();
        boolean boolean19 = tokeniser1.isTrackErrors();
        tokeniser1.createDoctypePending();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        java.lang.StringBuilder stringBuilder2 = tokeniser1.dataBuffer;
        tokeniser1.createCommentPending();
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.setTrackErrors(false);
        org.junit.Assert.assertNull(stringBuilder2);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
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
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader14);
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser15.transition(tokeniserState16);
        org.jsoup.parser.Token.Comment comment18 = null;
        tokeniser15.commentPending = comment18;
        tokeniser15.emit('\ufffd');
        tokeniser15.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser15.getState();
        tokeniser15.emit("hi!");
        tokeniser15.emit('#');
        boolean boolean28 = tokeniser15.isTrackErrors();
        java.lang.StringBuilder stringBuilder29 = tokeniser15.dataBuffer;
        org.jsoup.parser.Token.Tag tag31 = tokeniser15.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype32 = tokeniser15.doctypePending;
        org.jsoup.parser.Token.Tag tag34 = tokeniser15.createTagPending(false);
        tokeniser1.tagPending = tag34;
        org.jsoup.parser.Token.Tag tag36 = tokeniser1.tagPending;
        tokeniser1.emit('a');
        org.jsoup.parser.TokeniserState tokeniserState39 = tokeniser1.getState();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(stringBuilder29);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(doctype32);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(tokeniserState39);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
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
        boolean boolean14 = tokeniser1.currentNodeInHtmlNS();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        tokeniser1.emit("hi!");
        org.jsoup.parser.Token.Comment comment6 = tokeniser1.commentPending;
        java.lang.StringBuilder stringBuilder7 = null;
        tokeniser1.dataBuffer = stringBuilder7;
        tokeniser1.setTrackErrors(false);
        tokeniser1.createDoctypePending();
        tokeniser1.emit("");
        java.lang.StringBuilder stringBuilder14 = tokeniser1.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader15);
        org.jsoup.parser.TokeniserState tokeniserState17 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser16.transition(tokeniserState17);
        org.jsoup.parser.Token.Comment comment19 = null;
        tokeniser16.commentPending = comment19;
        tokeniser16.emit('\ufffd');
        tokeniser16.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser16.getState();
        tokeniser16.emit("hi!");
        tokeniser16.emitDoctypePending();
        boolean boolean28 = tokeniser16.isTrackErrors();
        boolean boolean29 = tokeniser16.currentNodeInHtmlNS();
        org.jsoup.parser.Token.Comment comment30 = tokeniser16.commentPending;
        tokeniser16.emit('4');
        tokeniser16.acknowledgeSelfClosingFlag();
        tokeniser16.setTrackErrors(false);
        tokeniser16.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser16.getState();
        tokeniser1.transition(tokeniserState37);
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(comment30);
        org.junit.Assert.assertNotNull(tokeniserState37);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
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
        tokeniser1.createCommentPending();
        tokeniser1.setTrackErrors(true);
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag18 = tokeniser1.tagPending;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNull(stringBuilder13);
        org.junit.Assert.assertNull(tag18);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
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
        boolean boolean17 = tokeniser1.isTrackErrors();
        org.jsoup.parser.Token.Comment comment18 = tokeniser1.commentPending;
        org.jsoup.parser.Token.Tag tag20 = tokeniser1.createTagPending(true);
        tokeniser1.createDoctypePending();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(comment18);
        org.junit.Assert.assertNotNull(tag20);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        tokeniser1.acknowledgeSelfClosingFlag();
        tokeniser1.emitDoctypePending();
        tokeniser1.emit('#');
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser1.getState();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader12);
        tokeniser13.createDoctypePending();
        tokeniser13.createDoctypePending();
        org.jsoup.parser.Token.Comment comment16 = null;
        tokeniser13.commentPending = comment16;
        tokeniser13.createDoctypePending();
        tokeniser13.emit("");
        tokeniser13.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader22);
        tokeniser23.createTempBuffer();
        tokeniser23.createCommentPending();
        org.jsoup.parser.Token.Tag tag27 = tokeniser23.createTagPending(false);
        tokeniser13.tagPending = tag27;
        org.jsoup.parser.Token.Doctype doctype29 = tokeniser13.doctypePending;
        tokeniser1.doctypePending = doctype29;
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Comment comment32 = tokeniser1.commentPending;
        boolean boolean33 = tokeniser1.currentNodeInHtmlNS();
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(doctype29);
        org.junit.Assert.assertNotNull(comment32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
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
        org.jsoup.parser.Token.Comment comment17 = tokeniser1.commentPending;
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNull(comment17);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        org.jsoup.parser.TokeniserState tokeniserState2 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser1.transition(tokeniserState2);
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser1.getState();
        tokeniser1.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Doctype doctype6 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Comment comment7 = tokeniser1.commentPending;
        tokeniser1.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype9 = tokeniser1.doctypePending;
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser1.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser1.getState();
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(doctype6);
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertNull(doctype9);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
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
        org.jsoup.parser.Token.Comment comment18 = tokeniser1.commentPending;
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        org.jsoup.parser.TokeniserState tokeniserState21 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser20.transition(tokeniserState21);
        org.jsoup.parser.Token.Comment comment23 = null;
        tokeniser20.commentPending = comment23;
        tokeniser20.emit('\ufffd');
        tokeniser20.setTrackErrors(false);
        tokeniser20.createCommentPending();
        org.jsoup.parser.Token.Tag tag31 = tokeniser20.createTagPending(false);
        org.jsoup.parser.Token.Doctype doctype32 = tokeniser20.doctypePending;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader33);
        tokeniser34.createDoctypePending();
        tokeniser34.createDoctypePending();
        org.jsoup.parser.Token.Comment comment37 = null;
        tokeniser34.commentPending = comment37;
        java.lang.StringBuilder stringBuilder39 = tokeniser34.dataBuffer;
        tokeniser34.emitDoctypePending();
        java.lang.StringBuilder stringBuilder41 = tokeniser34.dataBuffer;
        org.jsoup.parser.TokeniserState tokeniserState42 = tokeniser34.getState();
        tokeniser20.transition(tokeniserState42);
        tokeniser1.error(tokeniserState42);
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader45);
        org.jsoup.parser.TokeniserState tokeniserState47 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser46.transition(tokeniserState47);
        org.jsoup.parser.TokeniserState tokeniserState49 = org.jsoup.parser.TokeniserState.Comment;
        tokeniser46.transition(tokeniserState49);
        tokeniser46.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader52 = null;
        org.jsoup.parser.Tokeniser tokeniser53 = new org.jsoup.parser.Tokeniser(characterReader52);
        org.jsoup.parser.TokeniserState tokeniserState54 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser53.transition(tokeniserState54);
        tokeniser53.emit("hi!");
        org.jsoup.parser.Token.Comment comment58 = tokeniser53.commentPending;
        java.lang.StringBuilder stringBuilder59 = null;
        tokeniser53.dataBuffer = stringBuilder59;
        tokeniser53.setTrackErrors(false);
        tokeniser53.emit(' ');
        tokeniser53.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader66 = null;
        org.jsoup.parser.Tokeniser tokeniser67 = new org.jsoup.parser.Tokeniser(characterReader66);
        org.jsoup.parser.TokeniserState tokeniserState68 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser67.transition(tokeniserState68);
        tokeniser67.emit("hi!");
        org.jsoup.parser.Token.Comment comment72 = null;
        tokeniser67.commentPending = comment72;
        tokeniser67.createCommentPending();
        org.jsoup.parser.Token.Comment comment75 = tokeniser67.commentPending;
        tokeniser53.commentPending = comment75;
        tokeniser46.commentPending = comment75;
        tokeniser1.emit((org.jsoup.parser.Token) comment75);
        boolean boolean79 = tokeniser1.currentNodeInHtmlNS();
        tokeniser1.emit("");
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(doctype16);
        org.junit.Assert.assertNull(tag17);
        org.junit.Assert.assertNull(comment18);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNull(doctype32);
        org.junit.Assert.assertNull(stringBuilder39);
        org.junit.Assert.assertNull(stringBuilder41);
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertNotNull(tokeniserState47);
        org.junit.Assert.assertNotNull(tokeniserState49);
        org.junit.Assert.assertNotNull(tokeniserState54);
        org.junit.Assert.assertNull(comment58);
        org.junit.Assert.assertNotNull(tokeniserState68);
        org.junit.Assert.assertNotNull(comment75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
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
        org.jsoup.parser.Token.Doctype doctype15 = tokeniser1.doctypePending;
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
        tokeniser17.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader29);
        org.jsoup.parser.TokeniserState tokeniserState31 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser30.transition(tokeniserState31);
        tokeniser30.setTrackErrors(true);
        tokeniser30.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader37);
        org.jsoup.parser.TokeniserState tokeniserState39 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser38.transition(tokeniserState39);
        org.jsoup.parser.Token.Comment comment41 = null;
        tokeniser38.commentPending = comment41;
        tokeniser38.emit('\ufffd');
        tokeniser38.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState46 = tokeniser38.getState();
        boolean boolean47 = tokeniser38.currentNodeInHtmlNS();
        tokeniser38.emitDoctypePending();
        tokeniser38.emit("");
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader51);
        tokeniser52.createDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState54 = tokeniser52.getState();
        tokeniser52.createTempBuffer();
        tokeniser52.createDoctypePending();
        org.jsoup.parser.CharacterReader characterReader57 = null;
        org.jsoup.parser.Tokeniser tokeniser58 = new org.jsoup.parser.Tokeniser(characterReader57);
        org.jsoup.parser.TokeniserState tokeniserState59 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser58.transition(tokeniserState59);
        org.jsoup.parser.Token.Comment comment61 = null;
        tokeniser58.commentPending = comment61;
        tokeniser58.emit('\ufffd');
        org.jsoup.parser.Token.Comment comment65 = tokeniser58.commentPending;
        org.jsoup.parser.Token.Tag tag67 = tokeniser58.createTagPending(true);
        tokeniser52.tagPending = tag67;
        java.lang.StringBuilder stringBuilder69 = tokeniser52.dataBuffer;
        tokeniser38.dataBuffer = stringBuilder69;
        tokeniser30.dataBuffer = stringBuilder69;
        tokeniser17.dataBuffer = stringBuilder69;
        tokeniser1.dataBuffer = stringBuilder69;
        org.jsoup.parser.Token.Doctype doctype74 = tokeniser1.doctypePending;
        org.junit.Assert.assertNotNull(tokeniserState2);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(stringBuilder14);
        org.junit.Assert.assertNull(doctype15);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNull(stringBuilder26);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNotNull(tokeniserState39);
        org.junit.Assert.assertNotNull(tokeniserState46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tokeniserState54);
        org.junit.Assert.assertNotNull(tokeniserState59);
        org.junit.Assert.assertNull(comment65);
        org.junit.Assert.assertNotNull(tag67);
        org.junit.Assert.assertNotNull(stringBuilder69);
        org.junit.Assert.assertEquals(stringBuilder69.toString(), "");
        org.junit.Assert.assertNull(doctype74);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.Tokeniser tokeniser1 = new org.jsoup.parser.Tokeniser(characterReader0);
        tokeniser1.createDoctypePending();
        tokeniser1.createDoctypePending();
        org.jsoup.parser.Token.Comment comment4 = null;
        tokeniser1.commentPending = comment4;
        java.lang.StringBuilder stringBuilder6 = tokeniser1.dataBuffer;
        tokeniser1.emitDoctypePending();
        java.lang.StringBuilder stringBuilder8 = tokeniser1.dataBuffer;
        java.lang.StringBuilder stringBuilder9 = null;
        tokeniser1.dataBuffer = stringBuilder9;
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader11);
        tokeniser12.createDoctypePending();
        tokeniser12.createDoctypePending();
        org.jsoup.parser.Token.Comment comment15 = null;
        tokeniser12.commentPending = comment15;
        org.jsoup.parser.Token.Doctype doctype17 = tokeniser12.doctypePending;
        tokeniser1.doctypePending = doctype17;
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader19);
        org.jsoup.parser.TokeniserState tokeniserState21 = org.jsoup.parser.TokeniserState.CommentEndBang;
        tokeniser20.transition(tokeniserState21);
        org.jsoup.parser.Token.Comment comment23 = null;
        tokeniser20.commentPending = comment23;
        tokeniser20.emit('\ufffd');
        tokeniser20.setTrackErrors(false);
        tokeniser20.createCommentPending();
        org.jsoup.parser.TokeniserState tokeniserState30 = tokeniser20.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser1.eofError(tokeniserState30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringBuilder6);
        org.junit.Assert.assertNull(stringBuilder8);
        org.junit.Assert.assertNotNull(doctype17);
        org.junit.Assert.assertNotNull(tokeniserState21);
        org.junit.Assert.assertNotNull(tokeniserState30);
    }
}

