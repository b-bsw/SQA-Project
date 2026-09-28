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
        org.jsoup.parser.Token.TokenType tokenType0 = org.jsoup.parser.Token.TokenType.EndTag;
        java.lang.Class<?> wildcardClass1 = tokenType0.getClass();
        org.junit.Assert.assertTrue("'" + tokenType0 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType0.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_doubleQuoted;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag2 = eOF0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.RawtextEndTagOpen;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDashDash;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.Comment comment1 = new org.jsoup.parser.Token.Comment();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag1 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.Rcdata;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.DoctypeName;
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
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.Doctype doctype1 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str2 = doctype1.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Doctype" + "'", str2, "Doctype");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character2 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterDoctypePublicKeyword;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag5 = character1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
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
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        boolean boolean3 = character1.isDoctype();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = xmlTreeBuilder0.insert(startTag5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        boolean boolean6 = doctype5.forceQuirks;
        java.lang.StringBuilder stringBuilder7 = doctype5.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType2 = eOF0.type;
        java.lang.Class<?> wildcardClass3 = eOF0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag2 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        boolean boolean2 = eOF1.isStartTag();
        boolean boolean3 = eOF1.isDoctype();
        boolean boolean4 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str6 = doctype5.tokenType();
        doctype5.forceQuirks = true;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.selfClosing = true;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = startTag2.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType4 = endTag1.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character5 = endTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptData;
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
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.Class<?> wildcardClass2 = stringBuilder1.getClass();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CommentEnd;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        boolean boolean2 = eOF1.isStartTag();
        boolean boolean3 = eOF1.isDoctype();
        boolean boolean4 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.nodes.Attributes attributes1 = endTag0.attributes;
        org.junit.Assert.assertNull(attributes1);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isStartTag();
        java.lang.String str5 = character1.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = character1.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CdataSection;
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
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        tag2.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character4 = tag2.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        boolean boolean2 = eOF0.isComment();
        boolean boolean3 = eOF0.isEOF();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag4 = eOF0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        boolean boolean2 = eOF0.isComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype3 = eOF0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag4 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.Doctype doctype1 = new org.jsoup.parser.Token.Doctype();
        boolean boolean2 = doctype1.forceQuirks;
        java.lang.StringBuilder stringBuilder3 = doctype1.systemIdentifier;
        boolean boolean4 = doctype1.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        org.jsoup.parser.Token.TokenType tokenType5 = startTag2.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character6 = startTag2.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character2 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment2 = character1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        boolean boolean1 = startTag0.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag5 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BetweenDoctypePublicAndSystemIdentifiers;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character1 = comment0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder10 = comment9.data;
        java.lang.String str11 = comment9.toString();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag14.name("hi!");
        org.jsoup.nodes.Attributes attributes17 = tag16.attributes;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("", attributes17);
        boolean boolean19 = startTag18.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = xmlTreeBuilder0.insert(startTag18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        org.jsoup.parser.Token.TokenType tokenType5 = startTag2.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = startTag2.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.toString();
        java.lang.String str3 = character1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype4 = character1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isStartTag();
        java.lang.String str5 = character1.toString();
        java.lang.String str6 = character1.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.Comment;
        character1.type = tokenType7;
        java.lang.String str9 = character1.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag10 = character1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EOF" + "'", str9, "EOF");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType4 = endTag1.type;
        java.lang.Class<?> wildcardClass5 = tokenType4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder10 = comment9.data;
        java.lang.String str11 = comment9.toString();
        xmlTreeBuilder0.insert(comment9);
        java.lang.String str13 = comment9.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag14 = comment9.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag7.name("hi!");
        org.jsoup.nodes.Attributes attributes10 = tag9.attributes;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("", attributes10);
        startTag2.attributes = attributes10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = startTag2.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName('4');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment3 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("Doctype");
        startTag14.tagName = "";
        startTag14.selfClosing = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = xmlTreeBuilder0.insert(startTag14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterDoctypePublicIdentifier;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character4 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        boolean boolean2 = eOF1.isStartTag();
        boolean boolean3 = eOF1.isDoctype();
        boolean boolean4 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.Comment;
        comment5.type = tokenType7;
        java.lang.StringBuilder stringBuilder9 = comment5.data;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapeStart;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_doubleQuoted;
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
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        boolean boolean3 = character1.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Comment;
        comment4.type = tokenType6;
        character1.type = tokenType6;
        java.lang.String str9 = character1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = character1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EOF" + "'", str9, "EOF");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        java.lang.String str1 = eOF0.tokenType();
        java.lang.String str2 = eOF0.tokenType();
        boolean boolean3 = eOF0.isComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype4 = eOF0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EOF" + "'", str1, "EOF");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("Character", "Doctype", parseErrorList15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder18 = comment17.data;
        xmlTreeBuilder0.insert(comment17);
        org.jsoup.parser.Token.Character character20 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isStartTag();
        java.lang.String str5 = character1.toString();
        java.lang.String str6 = character1.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.Comment;
        character1.type = tokenType7;
        java.lang.String str9 = character1.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = character1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EOF" + "'", str9, "EOF");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag3 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        java.lang.String str13 = startTag9.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag14 = startTag9.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<4>" + "'", str13, "<4>");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character4 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        java.lang.String str1 = eOF0.tokenType();
        java.lang.String str2 = eOF0.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character3 = eOF0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EOF" + "'", str1, "EOF");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType2 = eOF0.type;
        java.lang.Class<?> wildcardClass3 = tokenType2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        boolean boolean2 = eOF1.isStartTag();
        boolean boolean3 = eOF1.isDoctype();
        boolean boolean4 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str6 = doctype5.tokenType();
        java.lang.String str7 = doctype5.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("", attributes14);
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag18 = startTag16.name("hi!");
        org.jsoup.nodes.Attributes attributes19 = tag18.attributes;
        startTag15.attributes = attributes19;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = xmlTreeBuilder0.insert(startTag15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        org.jsoup.parser.Token.TokenType tokenType2 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType2;
        doctype0.forceQuirks = false;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "Doctype", parseErrorList7);
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        boolean boolean10 = doctype9.forceQuirks;
        java.lang.StringBuilder stringBuilder11 = doctype9.systemIdentifier;
        boolean boolean12 = doctype9.forceQuirks;
        boolean boolean13 = doctype9.isForceQuirks();
        java.lang.StringBuilder stringBuilder14 = doctype9.publicIdentifier;
        java.lang.String str15 = doctype9.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder16 = doctype9.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.appendAttributeValue('a');
        boolean boolean7 = startTag2.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = startTag2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag5 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("<4>");
        java.lang.String str2 = character1.toString();
        boolean boolean3 = character1.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag4 = character1.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<4>" + "'", str2, "<4>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscaped;
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
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("Character", "Doctype", parseErrorList15);
        org.jsoup.parser.Token.Doctype doctype17 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str18 = doctype17.tokenType();
        doctype17.forceQuirks = true;
        java.lang.String str21 = doctype17.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder22 = doctype17.name;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        tag2.finaliseTag();
        tag2.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment5 = tag2.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterDoctypePublicIdentifier;
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
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag3 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        boolean boolean5 = startTag0.isComment();
        startTag0.tagName = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype8 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment5 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.appendAttributeName("<4>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag9 = endTag1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        org.jsoup.nodes.Attributes attributes8 = tag7.attributes;
        startTag4.attributes = attributes8;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("Doctype", attributes8);
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("", attributes8);
        startTag11.appendAttributeValue("</hi!>");
        java.lang.Class<?> wildcardClass14 = startTag11.getClass();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment3 = startTag2.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("Character", "Doctype", parseErrorList15);
        org.jsoup.parser.Token.Character character18 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str19 = character18.getData();
        boolean boolean20 = character18.isComment();
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder22 = comment21.data;
        org.jsoup.parser.Token.TokenType tokenType23 = org.jsoup.parser.Token.TokenType.Comment;
        comment21.type = tokenType23;
        character18.type = tokenType23;
        java.lang.String str26 = character18.toString();
        java.lang.String str27 = character18.toString();
        xmlTreeBuilder0.insert(character18);
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag("", attributes30);
        boolean boolean32 = startTag31.isDoctype();
        java.lang.String str33 = startTag31.tagName;
        startTag31.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element35 = xmlTreeBuilder0.insert(startTag31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.Comment;
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
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment7 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        java.lang.String str2 = eOF1.tokenType();
        boolean boolean3 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("", attributes5);
        startTag6.selfClosing = false;
        startTag6.newAttribute();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag12 = startTag10.name("hi!");
        tag12.finaliseTag();
        tag12.newAttribute();
        org.jsoup.nodes.Attributes attributes15 = tag12.attributes;
        startTag6.attributes = attributes15;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = xmlTreeBuilder0.insert(startTag6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder10 = comment9.data;
        java.lang.String str11 = comment9.toString();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("", attributes14);
        boolean boolean16 = startTag15.isDoctype();
        java.lang.String str17 = startTag15.tagName;
        startTag15.selfClosing = false;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CharacterReferenceInData;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        endTag1.tagName = "Doctype";
        boolean boolean8 = endTag1.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character9 = endTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.appendAttributeName("");
        startTag0.appendAttributeName("hi!a");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        org.jsoup.parser.Token.TokenType tokenType5 = startTag2.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = startTag2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "Doctype", parseErrorList7);
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str11 = endTag10.toString();
        java.lang.String str12 = endTag10.toString();
        boolean boolean13 = endTag10.isDoctype();
        java.lang.String str14 = endTag10.tagName;
        java.lang.String str15 = endTag10.name();
        boolean boolean16 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag10);
        org.jsoup.parser.Token.Doctype doctype17 = new org.jsoup.parser.Token.Doctype();
        boolean boolean18 = doctype17.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</hi!>" + "'", str11, "</hi!>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!>" + "'", str12, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("Character", "Doctype", parseErrorList15);
        org.jsoup.parser.Token.Character character18 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str19 = character18.getData();
        boolean boolean20 = character18.isComment();
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder22 = comment21.data;
        org.jsoup.parser.Token.TokenType tokenType23 = org.jsoup.parser.Token.TokenType.Comment;
        comment21.type = tokenType23;
        character18.type = tokenType23;
        java.lang.String str26 = character18.toString();
        java.lang.String str27 = character18.toString();
        xmlTreeBuilder0.insert(character18);
        org.jsoup.parser.Token.Doctype doctype29 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str30 = doctype29.tokenType();
        doctype29.forceQuirks = true;
        java.lang.String str33 = doctype29.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Doctype" + "'", str30, "Doctype");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.newAttribute();
        startTag2.appendTagName("</hi!>");
        startTag2.appendAttributeName("EOF");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = startTag2.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        org.jsoup.parser.Token.Tag tag7 = startTag2.name("</hi!>");
        startTag2.appendAttributeValue('#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype10 = startTag2.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder0.initialiseParse("Character", "<Doctype>", parseErrorList18);
        org.jsoup.parser.Token token20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = xmlTreeBuilder0.process(token20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType2 = eOF0.type;
        boolean boolean3 = eOF0.isDoctype();
        boolean boolean4 = eOF0.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        endTag1.appendAttributeValue("<4>");
        java.lang.String str7 = endTag1.toString();
        java.lang.String str8 = endTag1.tagName;
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("", attributes11);
        startTag12.selfClosing = false;
        startTag12.newAttribute();
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag19 = startTag17.name("hi!");
        org.jsoup.nodes.Attributes attributes20 = tag19.attributes;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("", attributes20);
        startTag12.attributes = attributes20;
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag("EndTag", attributes20);
        endTag1.attributes = attributes20;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        tag2.finaliseTag();
        java.lang.String str4 = tag2.tagName;
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        java.lang.String str5 = startTag0.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.Comment;
        comment5.type = tokenType7;
        java.lang.StringBuilder stringBuilder9 = comment5.data;
        boolean boolean10 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment5);
        org.jsoup.parser.Token.Doctype doctype11 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str12 = doctype11.tokenType();
        boolean boolean13 = doctype11.isForceQuirks();
        java.lang.String str14 = doctype11.getPublicIdentifier();
        boolean boolean15 = doctype11.isForceQuirks();
        doctype11.forceQuirks = true;
        boolean boolean18 = doctype11.forceQuirks;
        doctype11.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Doctype" + "'", str12, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        java.lang.Class<?> wildcardClass16 = startTag9.getClass();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag4 = startTag0.asStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment5 = startTag4.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(startTag4);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        endTag1.appendAttributeName("<!---->");
        java.lang.Class<?> wildcardClass8 = endTag1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "Doctype", parseErrorList7);
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("", attributes12);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag14.name("hi!");
        org.jsoup.nodes.Attributes attributes17 = tag16.attributes;
        startTag13.attributes = attributes17;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("Doctype", attributes17);
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("", attributes17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStartDash;
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
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        java.lang.Class<?> wildcardClass7 = endTag1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isStartTag();
        java.lang.String str5 = character1.toString();
        java.lang.String str6 = character1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype7 = character1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag8 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        java.lang.String str4 = character1.getData();
        java.lang.String str5 = character1.getData();
        java.lang.Class<?> wildcardClass6 = character1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EOF" + "'", str4, "EOF");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.toString();
        endTag1.selfClosing = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("hi!a", "</hi!>", parseErrorList7);
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        boolean boolean10 = doctype9.forceQuirks;
        java.lang.StringBuilder stringBuilder11 = doctype9.systemIdentifier;
        boolean boolean12 = doctype9.isCharacter();
        java.lang.String str13 = doctype9.getName();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendTagName('#');
        org.jsoup.parser.Token.Tag tag6 = endTag1.name("Doctype");
        tag6.appendAttributeValue("<hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        startTag5.appendAttributeName('a');
        java.lang.String str11 = startTag5.toString();
        java.lang.Class<?> wildcardClass12 = startTag5.getClass();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!>" + "'", str11, "<hi!>");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag1.appendAttributeValue("</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype4 = startTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "Doctype", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("", "<4>", parseErrorList11);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        xmlTreeBuilder13.initialiseParse("</hi!>", "EOF", parseErrorList16);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag20 = startTag18.name("hi!");
        boolean boolean21 = xmlTreeBuilder13.process((org.jsoup.parser.Token) startTag18);
        org.jsoup.parser.Token.Comment comment22 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder23 = comment22.data;
        java.lang.String str24 = comment22.toString();
        xmlTreeBuilder13.insert(comment22);
        java.lang.String str26 = comment22.toString();
        java.lang.String str27 = comment22.getData();
        xmlTreeBuilder0.insert(comment22);
        org.jsoup.parser.Token.Doctype doctype29 = new org.jsoup.parser.Token.Doctype();
        boolean boolean30 = doctype29.forceQuirks;
        java.lang.StringBuilder stringBuilder31 = doctype29.systemIdentifier;
        boolean boolean32 = doctype29.forceQuirks;
        boolean boolean33 = doctype29.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!---->" + "'", str24, "<!---->");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Doctype");
        startTag1.tagName = "";
        startTag1.appendAttributeName("</hi!>");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype5 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.appendAttributeValue('#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag5 = endTag1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendTagName(' ');
        java.lang.String str5 = endTag1.tokenType();
        boolean boolean6 = endTag1.isEndTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype4 = comment0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BogusDoctype;
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
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str2 = startTag1.name();
        org.jsoup.parser.Token.Tag tag4 = startTag1.name("hi!a");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag5 = startTag1.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Doctype" + "'", str2, "Doctype");
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        boolean boolean5 = doctype4.isCharacter();
        java.lang.Class<?> wildcardClass6 = doctype4.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_doubleQuoted;
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
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype7);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("Character", "Doctype", parseErrorList15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder18 = comment17.data;
        xmlTreeBuilder0.insert(comment17);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder21 = comment20.data;
        org.jsoup.parser.Token.TokenType tokenType22 = org.jsoup.parser.Token.TokenType.Comment;
        comment20.type = tokenType22;
        xmlTreeBuilder0.insert(comment20);
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag28 = startTag26.name("hi!");
        org.jsoup.nodes.Attributes attributes29 = tag28.attributes;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes29);
        org.jsoup.nodes.Element element31 = xmlTreeBuilder0.insert(startTag30);
        org.jsoup.parser.Token.Character character32 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder9.initialiseParse("Character", "hi!", parseErrorList12);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder15 = comment14.data;
        java.lang.String str16 = comment14.getData();
        xmlTreeBuilder9.insert(comment14);
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.Token.Doctype doctype19 = new org.jsoup.parser.Token.Doctype();
        boolean boolean20 = doctype19.forceQuirks;
        java.lang.StringBuilder stringBuilder21 = doctype19.systemIdentifier;
        boolean boolean22 = doctype19.isCharacter();
        doctype19.forceQuirks = false;
        java.lang.StringBuilder stringBuilder25 = doctype19.publicIdentifier;
        boolean boolean26 = doctype19.isForceQuirks();
        boolean boolean27 = doctype19.forceQuirks;
        java.lang.StringBuilder stringBuilder28 = doctype19.systemIdentifier;
        org.jsoup.parser.Token.TokenType tokenType29 = doctype19.type;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType29 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType29.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BeforeAttributeValue;
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
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder9.initialiseParse("Character", "hi!", parseErrorList12);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder15 = comment14.data;
        java.lang.String str16 = comment14.getData();
        xmlTreeBuilder9.insert(comment14);
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("", attributes20);
        boolean boolean22 = startTag21.isDoctype();
        java.lang.String str23 = startTag21.tagName;
        startTag21.selfClosing = false;
        org.jsoup.parser.Token.Tag tag27 = startTag21.name("</hi!>");
        java.lang.String str28 = tag27.name();
        tag27.selfClosing = false;
        org.jsoup.nodes.Attributes attributes31 = tag27.getAttributes();
        org.jsoup.parser.Token.StartTag startTag32 = tag27.asStartTag();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = xmlTreeBuilder0.process((org.jsoup.parser.Token) tag27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "</hi!>" + "'", str28, "</hi!>");
        org.junit.Assert.assertNull(attributes31);
        org.junit.Assert.assertNotNull(startTag32);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isStartTag();
        java.lang.String str5 = character1.getData();
        java.lang.String str6 = character1.toString();
        org.jsoup.parser.Token.Character character7 = character1.asCharacter();
        java.lang.String str8 = character1.toString();
        java.lang.String str9 = character1.toString();
        java.lang.Class<?> wildcardClass10 = character1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EOF" + "'", str8, "EOF");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EOF" + "'", str9, "EOF");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.Class<?> wildcardClass6 = doctype0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AttributeName;
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
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str18 = startTag17.name();
        boolean boolean19 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag17);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder21 = comment20.data;
        java.lang.String str22 = comment20.getData();
        java.lang.StringBuilder stringBuilder23 = comment20.data;
        xmlTreeBuilder0.insert(comment20);
        org.jsoup.parser.Token.Doctype doctype25 = new org.jsoup.parser.Token.Doctype();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment2 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        java.lang.String str2 = eOF0.tokenType();
        boolean boolean3 = eOF0.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>4", "StartTag", parseErrorList7);
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str10 = doctype9.tokenType();
        boolean boolean11 = doctype9.isForceQuirks();
        java.lang.String str12 = doctype9.getPublicIdentifier();
        boolean boolean13 = doctype9.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Doctype" + "'", str10, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag7 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isStartTag();
        boolean boolean8 = endTag1.isCharacter();
        java.lang.Class<?> wildcardClass9 = endTag1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str2 = startTag1.name();
        org.jsoup.parser.Token.Tag tag4 = startTag1.name("hi!a");
        startTag1.appendAttributeValue("EOF");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Doctype" + "'", str2, "Doctype");
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str18 = startTag17.name();
        boolean boolean19 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag17);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder21 = comment20.data;
        java.lang.String str22 = comment20.getData();
        java.lang.StringBuilder stringBuilder23 = comment20.data;
        xmlTreeBuilder0.insert(comment20);
        java.lang.String str25 = comment20.getData();
        java.lang.String str26 = comment20.toString();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("<4>");
        java.lang.String str11 = character10.toString();
        boolean boolean12 = character10.isEndTag();
        xmlTreeBuilder0.insert(character10);
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        boolean boolean15 = doctype14.forceQuirks;
        java.lang.StringBuilder stringBuilder16 = doctype14.systemIdentifier;
        boolean boolean17 = doctype14.forceQuirks;
        boolean boolean18 = doctype14.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<4>" + "'", str11, "<4>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.toString();
        java.lang.String str5 = endTag1.tokenType();
        java.lang.String str6 = endTag1.tokenType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EndTag" + "'", str6, "EndTag");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isStartTag();
        endTag1.tagName = "Character";
        java.lang.String str10 = endTag1.tagName;
        org.jsoup.parser.Token.TokenType tokenType11 = endTag1.type;
        endTag1.tagName = "<!---->";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Character" + "'", str10, "Character");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isStartTag();
        java.lang.String str5 = character1.toString();
        java.lang.String str6 = character1.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.Comment;
        character1.type = tokenType7;
        boolean boolean9 = character1.isEOF();
        boolean boolean10 = character1.isComment();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("<4>");
        java.lang.String str2 = character1.toString();
        java.lang.String str3 = character1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<4>" + "'", str2, "<4>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<4>" + "'", str3, "<4>");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        java.lang.String str6 = endTag1.name();
        endTag1.appendAttributeValue("Character");
        endTag1.finaliseTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isStartTag();
        java.lang.String str5 = character1.getData();
        java.lang.String str6 = character1.toString();
        org.jsoup.parser.Token.Character character7 = character1.asCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = character1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertNotNull(character7);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        org.jsoup.nodes.Attributes attributes8 = tag7.attributes;
        startTag4.attributes = attributes8;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("Doctype", attributes8);
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("", attributes8);
        startTag11.appendAttributeName("</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype14 = startTag11.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        java.lang.String str9 = tag8.name();
        tag8.selfClosing = false;
        org.jsoup.nodes.Attributes attributes12 = tag8.getAttributes();
        boolean boolean13 = tag8.isComment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment7 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType4 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag1.type = tokenType4;
        boolean boolean6 = endTag1.isStartTag();
        boolean boolean7 = endTag1.isSelfClosing();
        java.lang.String str8 = endTag1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment9 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</hi!>" + "'", str8, "</hi!>");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.nodes.Attributes attributes3 = tag2.attributes;
        java.lang.String str4 = tag2.tokenType();
        java.lang.String str5 = tag2.name();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "StartTag" + "'", str4, "StartTag");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.tokenType();
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.newAttribute();
        boolean boolean6 = startTag2.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isEOF();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype8 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.finaliseTag();
        startTag0.finaliseTag();
        startTag0.appendTagName(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment7 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isEOF();
        java.lang.String str7 = doctype0.tokenType();
        boolean boolean8 = doctype0.isForceQuirks();
        boolean boolean9 = doctype0.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag10 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isStartTag();
        java.lang.String str5 = character1.getData();
        java.lang.String str6 = character1.toString();
        org.jsoup.parser.Token.Character character7 = character1.asCharacter();
        java.lang.String str8 = character7.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EOF" + "'", str8, "EOF");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.Character character14 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str15 = character14.getData();
        java.lang.String str16 = character14.toString();
        boolean boolean17 = character14.isStartTag();
        java.lang.String str18 = character14.getData();
        java.lang.String str19 = character14.toString();
        org.jsoup.parser.Token.Character character20 = character14.asCharacter();
        java.lang.String str21 = character14.toString();
        java.lang.String str22 = character14.toString();
        xmlTreeBuilder0.insert(character14);
        org.jsoup.parser.Token.Character character25 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str26 = character25.getData();
        java.lang.String str27 = character25.toString();
        boolean boolean28 = character25.isStartTag();
        java.lang.String str29 = character25.getData();
        java.lang.String str30 = character25.toString();
        xmlTreeBuilder0.insert(character25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment32 = character25.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
        org.junit.Assert.assertNotNull(character20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EOF" + "'", str21, "EOF");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EOF" + "'", str29, "EOF");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EOF" + "'", str30, "EOF");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        org.jsoup.parser.Token.TokenType tokenType5 = startTag2.type;
        startTag2.appendTagName(' ');
        boolean boolean8 = startTag2.isDoctype();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag12 = startTag10.name("hi!");
        org.jsoup.nodes.Attributes attributes13 = tag12.attributes;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("", attributes13);
        startTag2.attributes = attributes13;
        startTag2.appendAttributeName("<hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character18 = startTag2.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("", attributes4);
        boolean boolean6 = startTag5.selfClosing;
        startTag5.appendAttributeValue(' ');
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag3.name("hi!");
        org.jsoup.nodes.Attributes attributes6 = tag5.attributes;
        startTag2.attributes = attributes6;
        org.jsoup.parser.Token.TokenType tokenType8 = startTag2.type;
        java.lang.String str9 = startTag2.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = startTag2.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("<4>");
        java.lang.String str11 = character10.toString();
        boolean boolean12 = character10.isEndTag();
        xmlTreeBuilder0.insert(character10);
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str15 = doctype14.tokenType();
        org.jsoup.parser.Token.Doctype doctype16 = doctype14.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<4>" + "'", str11, "<4>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Doctype" + "'", str15, "Doctype");
        org.junit.Assert.assertNotNull(doctype16);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.Comment;
        comment5.type = tokenType7;
        java.lang.StringBuilder stringBuilder9 = comment5.data;
        boolean boolean10 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment5);
        org.jsoup.parser.Token.Character character12 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str13 = character12.getData();
        java.lang.String str14 = character12.toString();
        boolean boolean15 = character12.isStartTag();
        java.lang.String str16 = character12.toString();
        java.lang.String str17 = character12.toString();
        boolean boolean18 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character12);
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag22 = startTag20.name("hi!");
        org.jsoup.nodes.Attributes attributes23 = tag22.attributes;
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("", attributes23);
        boolean boolean25 = startTag24.selfClosing;
        startTag24.appendAttributeName('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EOF" + "'", str13, "EOF");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EOF" + "'", str17, "EOF");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType4 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag1.type = tokenType4;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype2 = startTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("<</hi!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment2 = character1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isStartTag();
        boolean boolean8 = endTag1.isCharacter();
        boolean boolean9 = endTag1.selfClosing;
        java.lang.String str10 = endTag1.tokenType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EndTag" + "'", str10, "EndTag");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEndTagOpen;
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
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType11 = doctype0.type;
        java.lang.StringBuilder stringBuilder12 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character5 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder0.initialiseParse("", "StartTag", parseErrorList18);
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("</hi!>");
        org.jsoup.nodes.Element element22 = xmlTreeBuilder0.insert(startTag21);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder24 = comment23.data;
        java.lang.StringBuilder stringBuilder25 = comment23.data;
        xmlTreeBuilder0.insert(comment23);
        org.jsoup.parser.Token.Doctype doctype27 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str28 = doctype27.tokenType();
        java.lang.String str29 = doctype27.getSystemIdentifier();
        java.lang.String str30 = doctype27.tokenType();
        boolean boolean31 = doctype27.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Doctype" + "'", str28, "Doctype");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Doctype" + "'", str30, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        java.lang.String str3 = tag2.name();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Doctype");
        boolean boolean2 = startTag1.isEOF();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character3 = startTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        boolean boolean5 = startTag0.isComment();
        startTag0.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag7 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("hi!a", "</hi!>", parseErrorList7);
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("", attributes10);
        boolean boolean12 = startTag11.isDoctype();
        java.lang.String str13 = startTag11.tagName;
        startTag11.selfClosing = false;
        org.jsoup.parser.Token.Tag tag17 = startTag11.name("</hi!>");
        java.lang.String str18 = tag17.name();
        tag17.selfClosing = false;
        org.jsoup.nodes.Attributes attributes21 = tag17.getAttributes();
        org.jsoup.parser.Token.StartTag startTag22 = tag17.asStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = xmlTreeBuilder0.insert(startTag22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "</hi!>" + "'", str18, "</hi!>");
        org.junit.Assert.assertNull(attributes21);
        org.junit.Assert.assertNotNull(startTag22);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "Doctype", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("", "<4>", parseErrorList11);
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str14 = doctype13.tokenType();
        java.lang.StringBuilder stringBuilder15 = doctype13.systemIdentifier;
        doctype13.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Doctype" + "'", str14, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder10 = comment9.data;
        java.lang.String str11 = comment9.toString();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str15 = endTag14.toString();
        java.lang.String str16 = endTag14.toString();
        boolean boolean17 = endTag14.isDoctype();
        java.lang.String str18 = endTag14.tagName;
        endTag14.appendAttributeName("<!---->");
        org.jsoup.parser.Token.TokenType tokenType21 = endTag14.type;
        boolean boolean22 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag14);
        org.jsoup.parser.Token.Doctype doctype23 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str24 = doctype23.tokenType();
        java.lang.String str25 = doctype23.getSystemIdentifier();
        java.lang.String str26 = doctype23.tokenType();
        doctype23.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "</hi!>" + "'", str15, "</hi!>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "</hi!>" + "'", str16, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Doctype" + "'", str24, "Doctype");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Doctype" + "'", str26, "Doctype");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        boolean boolean4 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        doctype0.forceQuirks = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag4 = startTag0.asStartTag();
        startTag0.tagName = "hi!";
        java.lang.String str7 = startTag0.toString();
        java.lang.String str8 = startTag0.tagName;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(startTag4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<hi!>" + "'", str7, "<hi!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!a");
        boolean boolean9 = startTag0.isComment();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.selfClosing = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype9 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag9 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType4 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag1.type = tokenType4;
        endTag1.appendAttributeValue('a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.newAttribute();
        boolean boolean4 = startTag0.isDoctype();
        startTag0.finaliseTag();
        boolean boolean6 = startTag0.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str18 = startTag17.name();
        boolean boolean19 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag17);
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        xmlTreeBuilder0.initialiseParse("<hi!>", "<</hi!>>", parseErrorList22);
        org.jsoup.parser.Token.Doctype doctype24 = new org.jsoup.parser.Token.Doctype();
        boolean boolean25 = doctype24.forceQuirks;
        java.lang.StringBuilder stringBuilder26 = doctype24.systemIdentifier;
        boolean boolean27 = doctype24.isCharacter();
        doctype24.forceQuirks = false;
        boolean boolean30 = doctype24.isEOF();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        org.jsoup.parser.Token.Doctype doctype2 = doctype0.asDoctype();
        doctype2.forceQuirks = true;
        boolean boolean5 = doctype2.isDoctype();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isDoctype();
        endTag0.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character3 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        boolean boolean5 = endTag1.isEOF();
        endTag1.appendTagName(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.toString();
        java.lang.String str5 = endTag1.name();
        java.lang.String str6 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</hi!>" + "'", str6, "</hi!>");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        boolean boolean5 = startTag0.isComment();
        java.lang.String str6 = startTag0.tagName;
        startTag0.tagName = "4";
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str11 = character10.getData();
        java.lang.String str12 = character10.toString();
        boolean boolean13 = character10.isStartTag();
        java.lang.String str14 = character10.getData();
        java.lang.String str15 = character10.toString();
        org.jsoup.parser.Token.Character character16 = character10.asCharacter();
        xmlTreeBuilder0.insert(character16);
        java.lang.String str18 = character16.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype19 = character16.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EOF" + "'", str11, "EOF");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EOF" + "'", str12, "EOF");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("Doctype", attributes9);
        startTag10.selfClosing = true;
        org.jsoup.parser.Token.TokenType tokenType13 = startTag10.type;
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.Character character14 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str15 = character14.getData();
        java.lang.String str16 = character14.toString();
        boolean boolean17 = character14.isStartTag();
        java.lang.String str18 = character14.getData();
        java.lang.String str19 = character14.toString();
        org.jsoup.parser.Token.Character character20 = character14.asCharacter();
        java.lang.String str21 = character14.toString();
        java.lang.String str22 = character14.toString();
        xmlTreeBuilder0.insert(character14);
        org.jsoup.parser.Token.Doctype doctype24 = new org.jsoup.parser.Token.Doctype();
        boolean boolean25 = doctype24.forceQuirks;
        java.lang.StringBuilder stringBuilder26 = doctype24.systemIdentifier;
        boolean boolean27 = doctype24.isEndTag();
        java.lang.StringBuilder stringBuilder28 = doctype24.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype29 = doctype24.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
        org.junit.Assert.assertNotNull(character20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EOF" + "'", str21, "EOF");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(doctype29);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.parser.Token.TokenType tokenType3 = startTag0.type;
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        startTag0.appendAttributeValue('4');
        boolean boolean7 = startTag0.isStartTag();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        java.lang.String str4 = doctype0.getName();
        java.lang.Class<?> wildcardClass5 = doctype0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str2 = startTag1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character3 = startTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<Doctype>" + "'", str2, "<Doctype>");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.nodes.Attributes attributes3 = tag2.attributes;
        boolean boolean4 = tag2.isEndTag();
        boolean boolean5 = tag2.isCharacter();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterAttributeValue_quoted;
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
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag6 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag1.name("<4>");
        org.jsoup.parser.Token.TokenType tokenType8 = tag7.type;
        boolean boolean9 = tag7.isSelfClosing();
        tag7.appendAttributeName("</hi!>4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("hi!a", "</hi!>", parseErrorList7);
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        boolean boolean10 = doctype9.forceQuirks;
        java.lang.String str11 = doctype9.getName();
        boolean boolean12 = doctype9.forceQuirks;
        boolean boolean13 = doctype9.forceQuirks;
        java.lang.StringBuilder stringBuilder14 = doctype9.systemIdentifier;
        boolean boolean15 = doctype9.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<Doctype>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment2 = startTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.newAttribute();
        boolean boolean4 = startTag0.isDoctype();
        startTag0.finaliseTag();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        xmlTreeBuilder7.initialiseParse("</hi!>", "EOF", parseErrorList10);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag12.name("hi!");
        boolean boolean15 = xmlTreeBuilder7.process((org.jsoup.parser.Token) startTag12);
        boolean boolean16 = startTag12.isDoctype();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        xmlTreeBuilder17.initialiseParse("</hi!>", "EOF", parseErrorList20);
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag24 = startTag22.name("hi!");
        boolean boolean25 = xmlTreeBuilder17.process((org.jsoup.parser.Token) startTag22);
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        startTag26.appendTagName('4');
        org.jsoup.nodes.Element element29 = xmlTreeBuilder17.insert(startTag26);
        startTag26.newAttribute();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag34 = startTag32.name("hi!");
        org.jsoup.nodes.Attributes attributes35 = tag34.attributes;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("", attributes35);
        startTag26.attributes = attributes35;
        startTag12.attributes = attributes35;
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag("4", attributes35);
        startTag0.attributes = attributes35;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag41 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes35);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isEOF();
        org.jsoup.parser.Token.Tag tag9 = endTag1.name("4");
        org.jsoup.nodes.Attributes attributes10 = tag9.getAttributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str18 = startTag17.name();
        boolean boolean19 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag17);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder21 = comment20.data;
        java.lang.String str22 = comment20.getData();
        java.lang.StringBuilder stringBuilder23 = comment20.data;
        xmlTreeBuilder0.insert(comment20);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        xmlTreeBuilder0.initialiseParse("", "</hi!>", parseErrorList27);
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element31 = xmlTreeBuilder0.insert(startTag30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.TagOpen;
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
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        startTag10.selfClosing = false;
        startTag10.appendAttributeValue("EndTag");
        startTag10.appendAttributeName('#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag17 = startTag10.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        startTag2.finaliseTag();
        startTag2.newAttribute();
        startTag2.appendTagName("</hi!>");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.newAttribute();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag8.name("hi!");
        org.jsoup.nodes.Attributes attributes11 = tag10.attributes;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("", attributes11);
        startTag3.attributes = attributes11;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("EndTag", attributes11);
        boolean boolean15 = startTag14.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment16 = startTag14.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeName('a');
        boolean boolean3 = endTag0.isCharacter();
        org.jsoup.nodes.Attributes attributes4 = endTag0.attributes;
        org.jsoup.parser.Token.Tag tag6 = endTag0.name("Doctype");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName('4');
        java.lang.String str3 = startTag0.name();
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        startTag0.appendAttributeValue('#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment7 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.newAttribute();
        startTag2.appendTagName("</hi!>");
        org.jsoup.parser.Token.TokenType tokenType8 = startTag2.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character9 = startTag2.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        java.lang.String str6 = endTag1.name();
        endTag1.appendAttributeValue("Character");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character9 = endTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        boolean boolean6 = endTag1.isSelfClosing();
        java.lang.Class<?> wildcardClass7 = endTag1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        startTag9.newAttribute();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag17 = startTag15.name("hi!");
        org.jsoup.nodes.Attributes attributes18 = tag17.attributes;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("", attributes18);
        startTag9.attributes = attributes18;
        startTag9.appendAttributeName(' ');
        boolean boolean23 = startTag9.isComment();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.tokenType();
        boolean boolean6 = doctype0.forceQuirks;
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.Class<?> wildcardClass8 = doctype0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("4");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        boolean boolean3 = character1.isComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag4 = character1.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.newAttribute();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag8.name("hi!");
        org.jsoup.nodes.Attributes attributes11 = tag10.attributes;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("", attributes11);
        startTag3.attributes = attributes11;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("<hi!>", attributes11);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str18 = startTag17.name();
        boolean boolean19 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag17);
        org.jsoup.parser.Token.Doctype doctype20 = new org.jsoup.parser.Token.Doctype();
        boolean boolean21 = doctype20.forceQuirks;
        java.lang.StringBuilder stringBuilder22 = doctype20.systemIdentifier;
        boolean boolean23 = doctype20.isCharacter();
        boolean boolean24 = doctype20.forceQuirks;
        java.lang.StringBuilder stringBuilder25 = doctype20.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        startTag9.selfClosing = false;
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
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
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.newAttribute();
        boolean boolean4 = startTag0.isDoctype();
        boolean boolean5 = startTag0.selfClosing;
        startTag0.finaliseTag();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        java.lang.String str2 = eOF1.tokenType();
        boolean boolean3 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag4 = eOF1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag1.name("<4>");
        org.jsoup.nodes.Attributes attributes8 = endTag1.getAttributes();
        java.lang.String str9 = endTag1.tagName;
        java.lang.Class<?> wildcardClass10 = endTag1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<4>" + "'", str9, "<4>");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        xmlTreeBuilder16.initialiseParse("Character", "hi!", parseErrorList19);
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder22 = comment21.data;
        java.lang.String str23 = comment21.getData();
        xmlTreeBuilder16.insert(comment21);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag27 = startTag25.name("hi!");
        startTag25.appendAttributeName(' ');
        boolean boolean30 = startTag25.isComment();
        org.jsoup.nodes.Element element31 = xmlTreeBuilder16.insert(startTag25);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder16.initialiseParse("Character", "<Doctype>", parseErrorList34);
        org.jsoup.parser.Token.Character character37 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str38 = character37.getData();
        java.lang.String str39 = character37.toString();
        boolean boolean40 = character37.isStartTag();
        java.lang.String str41 = character37.toString();
        xmlTreeBuilder16.insert(character37);
        xmlTreeBuilder0.insert(character37);
        org.jsoup.parser.Token.Doctype doctype44 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str45 = doctype44.tokenType();
        boolean boolean46 = doctype44.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "EOF" + "'", str38, "EOF");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EOF" + "'", str39, "EOF");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "EOF" + "'", str41, "EOF");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Doctype" + "'", str45, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = endTag1.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BeforeDoctypeName;
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
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.finaliseTag();
        startTag0.appendAttributeValue("</hi!>");
        java.lang.String str6 = startTag0.toString();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!>" + "'", str6, "<hi!>");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str11 = character10.getData();
        java.lang.String str12 = character10.toString();
        boolean boolean13 = character10.isStartTag();
        java.lang.String str14 = character10.getData();
        java.lang.String str15 = character10.toString();
        org.jsoup.parser.Token.Character character16 = character10.asCharacter();
        xmlTreeBuilder0.insert(character16);
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("", attributes19);
        org.jsoup.parser.Token.Tag tag22 = startTag20.name("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = xmlTreeBuilder0.insert(startTag20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EOF" + "'", str11, "EOF");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EOF" + "'", str12, "EOF");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertNotNull(tag22);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        boolean boolean2 = eOF0.isComment();
        boolean boolean3 = eOF0.isEOF();
        java.lang.String str4 = eOF0.tokenType();
        boolean boolean5 = eOF0.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EOF" + "'", str4, "EOF");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<4>");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        boolean boolean5 = startTag4.isDoctype();
        java.lang.String str6 = startTag4.tagName;
        org.jsoup.parser.Token.TokenType tokenType7 = startTag4.type;
        startTag4.appendTagName(' ');
        boolean boolean10 = startTag4.isDoctype();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag12.name("hi!");
        org.jsoup.nodes.Attributes attributes15 = tag14.attributes;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("", attributes15);
        startTag4.attributes = attributes15;
        endTag1.attributes = attributes15;
        java.lang.Class<?> wildcardClass19 = endTag1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType4 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag1.type = tokenType4;
        boolean boolean6 = endTag1.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType7 = endTag1.type;
        endTag1.appendAttributeValue('a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "Doctype", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("", "<4>", parseErrorList11);
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("", attributes14);
        startTag15.selfClosing = false;
        startTag15.appendTagName("</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isEOF();
        boolean boolean4 = startTag2.selfClosing;
        startTag2.appendAttributeName("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!");
        org.jsoup.nodes.Attributes attributes5 = tag4.attributes;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes5);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("", attributes5);
        java.lang.String str8 = startTag7.tokenType();
        startTag7.finaliseTag();
        startTag7.appendTagName('4');
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("4");
        startTag1.appendAttributeValue('a');
        startTag1.appendTagName("</hi!>4");
        java.lang.Class<?> wildcardClass6 = startTag1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.String str8 = doctype0.getSystemIdentifier();
        boolean boolean9 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("4");
        startTag1.appendAttributeValue('a');
        startTag1.finaliseTag();
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>4", "StartTag", parseErrorList7);
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        boolean boolean10 = doctype9.forceQuirks;
        java.lang.StringBuilder stringBuilder11 = doctype9.systemIdentifier;
        boolean boolean12 = doctype9.forceQuirks;
        boolean boolean13 = doctype9.isStartTag();
        java.lang.StringBuilder stringBuilder14 = doctype9.systemIdentifier;
        java.lang.StringBuilder stringBuilder15 = doctype9.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag7 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder9.initialiseParse("Character", "hi!", parseErrorList12);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder15 = comment14.data;
        java.lang.String str16 = comment14.getData();
        xmlTreeBuilder9.insert(comment14);
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("4");
        startTag20.appendAttributeValue('a');
        startTag20.appendTagName("</hi!>4");
        org.jsoup.nodes.Element element25 = xmlTreeBuilder0.insert(startTag20);
        java.lang.Class<?> wildcardClass26 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.EndTag endTag4 = endTag1.asEndTag();
        org.jsoup.nodes.Attributes attributes5 = endTag4.getAttributes();
        java.lang.String str6 = endTag4.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertNotNull(endTag4);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</hi!>" + "'", str6, "</hi!>");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.nodes.Attributes attributes4 = null;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("", attributes4);
        startTag5.selfClosing = false;
        startTag5.appendTagName("</hi!>");
        startTag5.newAttribute();
        org.jsoup.nodes.Attributes attributes11 = startTag5.getAttributes();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("Doctype", attributes11);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes11);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("</hi!>4", attributes11);
        startTag14.selfClosing = false;
        startTag14.appendAttributeName("hi!");
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        java.lang.String str6 = startTag2.tagName;
        boolean boolean7 = startTag2.isSelfClosing();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        boolean boolean5 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        org.jsoup.nodes.Attributes attributes6 = endTag1.getAttributes();
        org.jsoup.parser.Token.EndTag endTag7 = endTag1.asEndTag();
        java.lang.String str8 = endTag7.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertNotNull(endTag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</hi!>" + "'", str8, "</hi!>");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder9.initialiseParse("Character", "hi!", parseErrorList12);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder15 = comment14.data;
        java.lang.String str16 = comment14.getData();
        xmlTreeBuilder9.insert(comment14);
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        xmlTreeBuilder19.initialiseParse("Character", "hi!", parseErrorList22);
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        xmlTreeBuilder19.initialiseParse("</hi!>", "Doctype", parseErrorList26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        xmlTreeBuilder19.initialiseParse("", "<4>", parseErrorList30);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        xmlTreeBuilder32.initialiseParse("</hi!>", "EOF", parseErrorList35);
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag39 = startTag37.name("hi!");
        boolean boolean40 = xmlTreeBuilder32.process((org.jsoup.parser.Token) startTag37);
        org.jsoup.parser.Token.Comment comment41 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder42 = comment41.data;
        java.lang.String str43 = comment41.toString();
        xmlTreeBuilder32.insert(comment41);
        java.lang.String str45 = comment41.toString();
        java.lang.String str46 = comment41.getData();
        xmlTreeBuilder19.insert(comment41);
        org.jsoup.parser.Token.TokenType tokenType48 = comment41.type;
        xmlTreeBuilder0.insert(comment41);
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "Doctype", parseErrorList52);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!---->" + "'", str43, "<!---->");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<!---->" + "'", str45, "<!---->");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + tokenType48 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType48.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        tag4.appendTagName("EOF");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character7 = tag4.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        org.jsoup.nodes.Attributes attributes6 = startTag2.getAttributes();
        boolean boolean7 = startTag2.isDoctype();
        java.lang.Class<?> wildcardClass8 = startTag2.getClass();
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeValue('#');
        startTag0.newAttribute();
        startTag0.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        boolean boolean12 = tag11.isComment();
        org.jsoup.parser.Token.TokenType tokenType13 = tag11.type;
        startTag0.type = tokenType13;
        java.lang.Class<?> wildcardClass15 = tokenType13.getClass();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.TagName;
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
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType4 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag1.type = tokenType4;
        boolean boolean6 = endTag1.isStartTag();
        boolean boolean7 = endTag1.isSelfClosing();
        java.lang.String str8 = endTag1.toString();
        endTag1.appendAttributeValue("StartTag");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</hi!>" + "'", str8, "</hi!>");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("<4>");
        java.lang.String str11 = character10.toString();
        boolean boolean12 = character10.isEndTag();
        xmlTreeBuilder0.insert(character10);
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        boolean boolean15 = doctype14.forceQuirks;
        java.lang.StringBuilder stringBuilder16 = doctype14.systemIdentifier;
        boolean boolean17 = doctype14.forceQuirks;
        boolean boolean18 = doctype14.isForceQuirks();
        boolean boolean19 = doctype14.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<4>" + "'", str11, "<4>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("Character", "Doctype", parseErrorList15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder18 = comment17.data;
        xmlTreeBuilder0.insert(comment17);
        java.lang.String str20 = comment17.toString();
        java.lang.String str21 = comment17.getData();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.appendAttributeValue('#');
        endTag1.tagName = "</hi!>";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder8 = doctype7.systemIdentifier;
        boolean boolean9 = doctype7.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag1.appendAttributeValue("</hi!>");
        org.jsoup.nodes.Attributes attributes4 = startTag1.attributes;
        java.lang.Class<?> wildcardClass5 = attributes4.getClass();
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.tokenType();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        boolean boolean7 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder0.initialiseParse("Character", "<Doctype>", parseErrorList18);
        org.jsoup.parser.Token.Character character21 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str22 = character21.getData();
        java.lang.String str23 = character21.toString();
        boolean boolean24 = character21.isStartTag();
        java.lang.String str25 = character21.toString();
        xmlTreeBuilder0.insert(character21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag27 = character21.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EOF" + "'", str23, "EOF");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EOF" + "'", str25, "EOF");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str2 = startTag1.name();
        org.jsoup.parser.Token.Tag tag4 = startTag1.name("hi!a");
        tag4.appendAttributeName('a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Doctype" + "'", str2, "Doctype");
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        boolean boolean9 = doctype0.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag10 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("Character", "Doctype", parseErrorList15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder18 = comment17.data;
        xmlTreeBuilder0.insert(comment17);
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag24 = startTag22.name("hi!");
        org.jsoup.nodes.Attributes attributes25 = tag24.attributes;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes25);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("", attributes25);
        startTag27.appendAttributeName('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes25);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment7 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        boolean boolean5 = endTag1.isEOF();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder7 = doctype6.name;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype6.type = tokenType8;
        endTag1.type = tokenType8;
        java.lang.String str11 = endTag1.name();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.parser.Token.TokenType tokenType3 = startTag0.type;
        java.lang.String str4 = startTag0.name();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.newAttribute();
        boolean boolean4 = startTag0.isDoctype();
        startTag0.finaliseTag();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        xmlTreeBuilder7.initialiseParse("</hi!>", "EOF", parseErrorList10);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag12.name("hi!");
        boolean boolean15 = xmlTreeBuilder7.process((org.jsoup.parser.Token) startTag12);
        boolean boolean16 = startTag12.isDoctype();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        xmlTreeBuilder17.initialiseParse("</hi!>", "EOF", parseErrorList20);
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag24 = startTag22.name("hi!");
        boolean boolean25 = xmlTreeBuilder17.process((org.jsoup.parser.Token) startTag22);
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        startTag26.appendTagName('4');
        org.jsoup.nodes.Element element29 = xmlTreeBuilder17.insert(startTag26);
        startTag26.newAttribute();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag34 = startTag32.name("hi!");
        org.jsoup.nodes.Attributes attributes35 = tag34.attributes;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("", attributes35);
        startTag26.attributes = attributes35;
        startTag12.attributes = attributes35;
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag("4", attributes35);
        startTag0.attributes = attributes35;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment41 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes35);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str18 = startTag17.name();
        boolean boolean19 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag17);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder21 = comment20.data;
        java.lang.String str22 = comment20.getData();
        java.lang.StringBuilder stringBuilder23 = comment20.data;
        xmlTreeBuilder0.insert(comment20);
        org.jsoup.parser.Token.Character character26 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str27 = character26.getData();
        boolean boolean28 = character26.isComment();
        java.lang.String str29 = character26.toString();
        xmlTreeBuilder0.insert(character26);
        org.jsoup.parser.Token.Doctype doctype31 = new org.jsoup.parser.Token.Doctype();
        boolean boolean32 = doctype31.forceQuirks;
        java.lang.StringBuilder stringBuilder33 = doctype31.systemIdentifier;
        boolean boolean34 = doctype31.isCharacter();
        doctype31.forceQuirks = false;
        java.lang.StringBuilder stringBuilder37 = doctype31.publicIdentifier;
        boolean boolean38 = doctype31.forceQuirks;
        doctype31.forceQuirks = true;
        java.lang.StringBuilder stringBuilder41 = doctype31.publicIdentifier;
        java.lang.String str42 = doctype31.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EOF" + "'", str29, "EOF");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder0.initialiseParse("Character", "<Doctype>", parseErrorList18);
        org.jsoup.parser.Token.EOF eOF20 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token.TokenType tokenType21 = eOF20.type;
        java.lang.String str22 = eOF20.tokenType();
        boolean boolean23 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF20);
        org.jsoup.parser.Token.Comment comment24 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder25 = comment24.data;
        java.lang.String str26 = comment24.getData();
        java.lang.StringBuilder stringBuilder27 = comment24.data;
        java.lang.String str28 = comment24.toString();
        java.lang.String str29 = comment24.getData();
        xmlTreeBuilder0.insert(comment24);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        xmlTreeBuilder0.initialiseParse("4", "Doctype", parseErrorList33);
        org.jsoup.parser.Token.Doctype doctype35 = new org.jsoup.parser.Token.Doctype();
        boolean boolean36 = doctype35.forceQuirks;
        java.lang.String str37 = doctype35.getName();
        boolean boolean38 = doctype35.forceQuirks;
        boolean boolean39 = doctype35.forceQuirks;
        java.lang.StringBuilder stringBuilder40 = doctype35.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(stringBuilder40);
        org.junit.Assert.assertEquals(stringBuilder40.toString(), "");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        boolean boolean5 = doctype0.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("Character", "Doctype", parseErrorList15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder18 = comment17.data;
        xmlTreeBuilder0.insert(comment17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag20 = comment17.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.newAttribute();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag8.name("hi!");
        org.jsoup.nodes.Attributes attributes11 = tag10.attributes;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("", attributes11);
        startTag3.attributes = attributes11;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("EndTag", attributes11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character15 = startTag14.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("4");
        startTag1.appendAttributeValue('a');
        startTag1.appendTagName("</hi!>4");
        java.lang.String str6 = startTag1.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<4</hi!>4>" + "'", str6, "<4</hi!>4>");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Doctype");
        startTag1.tagName = "";
        boolean boolean4 = startTag1.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = startTag1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder0.initialiseParse("Character", "<Doctype>", parseErrorList18);
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        xmlTreeBuilder0.initialiseParse("<hi!>", "</hi!>", parseErrorList22);
        org.jsoup.parser.Token.Doctype doctype24 = new org.jsoup.parser.Token.Doctype();
        boolean boolean25 = doctype24.forceQuirks;
        java.lang.String str26 = doctype24.getName();
        boolean boolean27 = doctype24.isEndTag();
        org.jsoup.parser.Token.Doctype doctype28 = doctype24.asDoctype();
        boolean boolean29 = doctype28.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doctype28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        boolean boolean6 = doctype0.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment7 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.appendAttributeValue('4');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment9 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        startTag5.appendTagName('a');
        startTag5.newAttribute();
        org.jsoup.nodes.Element element9 = xmlTreeBuilder0.insert(startTag5);
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("", attributes11);
        startTag12.selfClosing = false;
        startTag12.newAttribute();
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag19 = startTag17.name("hi!");
        org.jsoup.nodes.Attributes attributes20 = tag19.attributes;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("", attributes20);
        startTag12.attributes = attributes20;
        startTag12.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = xmlTreeBuilder0.insert(startTag12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        startTag10.selfClosing = false;
        org.jsoup.nodes.Attributes attributes13 = startTag10.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype14 = startTag10.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<4>");
        java.lang.Class<?> wildcardClass2 = endTag1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str18 = startTag17.name();
        boolean boolean19 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag17);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder21 = comment20.data;
        java.lang.String str22 = comment20.getData();
        java.lang.StringBuilder stringBuilder23 = comment20.data;
        xmlTreeBuilder0.insert(comment20);
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("4");
        java.lang.String str27 = startTag26.name();
        boolean boolean28 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag26);
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        startTag29.appendAttributeName('a');
        startTag29.newAttribute();
        boolean boolean33 = startTag29.isDoctype();
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        startTag35.appendTagName('4');
        java.lang.String str38 = startTag35.name();
        org.jsoup.nodes.Attributes attributes39 = startTag35.attributes;
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag("hi!", attributes39);
        startTag29.attributes = attributes39;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "4" + "'", str27, "4");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "4" + "'", str38, "4");
        org.junit.Assert.assertNotNull(attributes39);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        startTag2.appendAttributeName("Doctype");
        java.lang.Class<?> wildcardClass11 = startTag2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder0.initialiseParse("Character", "<Doctype>", parseErrorList18);
        org.jsoup.parser.Token.EOF eOF20 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token.TokenType tokenType21 = eOF20.type;
        java.lang.String str22 = eOF20.tokenType();
        boolean boolean23 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF20);
        org.jsoup.parser.Token.Doctype doctype24 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str25 = doctype24.tokenType();
        boolean boolean26 = doctype24.isForceQuirks();
        java.lang.String str27 = doctype24.getPublicIdentifier();
        boolean boolean28 = doctype24.isForceQuirks();
        doctype24.forceQuirks = true;
        doctype24.forceQuirks = false;
        doctype24.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Doctype" + "'", str25, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str18 = startTag17.name();
        boolean boolean19 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag17);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder21 = comment20.data;
        java.lang.String str22 = comment20.getData();
        java.lang.StringBuilder stringBuilder23 = comment20.data;
        xmlTreeBuilder0.insert(comment20);
        org.jsoup.parser.Token.Character character26 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str27 = character26.getData();
        boolean boolean28 = character26.isComment();
        java.lang.String str29 = character26.toString();
        xmlTreeBuilder0.insert(character26);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "Character", parseErrorList33);
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        startTag35.appendAttributeName('a');
        startTag35.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element39 = xmlTreeBuilder0.insert(startTag35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EOF" + "'", str29, "EOF");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        doctype0.forceQuirks = false;
        java.lang.Class<?> wildcardClass5 = doctype0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        endTag1.tagName = "Doctype";
        boolean boolean8 = endTag1.isEOF();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        java.lang.String str3 = startTag0.tagName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag4 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.finaliseTag();
        startTag0.appendAttributeValue("</hi!>");
        boolean boolean6 = startTag0.isDoctype();
        java.lang.Class<?> wildcardClass7 = startTag0.getClass();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        java.lang.String str9 = tag8.name();
        boolean boolean10 = tag8.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag6 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder0.initialiseParse("", "StartTag", parseErrorList18);
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("</hi!>");
        org.jsoup.nodes.Element element22 = xmlTreeBuilder0.insert(startTag21);
        java.lang.Class<?> wildcardClass23 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.Doctype doctype9 = doctype0.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(doctype9);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        org.jsoup.parser.Token.TokenType tokenType2 = org.jsoup.parser.Token.TokenType.Comment;
        comment0.type = tokenType2;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        boolean boolean6 = comment0.isStartTag();
        java.lang.Class<?> wildcardClass7 = comment0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.nodes.Attributes attributes4 = null;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("", attributes4);
        startTag5.selfClosing = false;
        startTag5.appendTagName("</hi!>");
        startTag5.newAttribute();
        org.jsoup.nodes.Attributes attributes11 = startTag5.getAttributes();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("Doctype", attributes11);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes11);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("</hi!>4", attributes11);
        startTag14.selfClosing = false;
        java.lang.Class<?> wildcardClass17 = startTag14.getClass();
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str18 = startTag17.name();
        boolean boolean19 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag17);
        startTag17.tagName = "</hi!>";
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        boolean boolean7 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.appendAttributeValue('a');
        java.lang.String str5 = endTag1.tagName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype6 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.RawtextEndTagOpen;
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
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!a");
        endTag1.finaliseTag();
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>4", "StartTag", parseErrorList7);
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("", attributes10);
        startTag11.selfClosing = false;
        startTag11.newAttribute();
        org.jsoup.parser.Token.Tag tag16 = startTag11.name("</hi!>");
        startTag11.appendAttributeValue('#');
        org.jsoup.nodes.Element element19 = xmlTreeBuilder0.insert(startTag11);
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("Doctype");
        startTag21.tagName = "";
        org.jsoup.parser.Token.Doctype doctype24 = new org.jsoup.parser.Token.Doctype();
        boolean boolean25 = doctype24.forceQuirks;
        java.lang.StringBuilder stringBuilder26 = doctype24.systemIdentifier;
        boolean boolean27 = doctype24.isCharacter();
        doctype24.forceQuirks = false;
        java.lang.StringBuilder stringBuilder30 = doctype24.publicIdentifier;
        boolean boolean31 = doctype24.forceQuirks;
        doctype24.forceQuirks = true;
        java.lang.StringBuilder stringBuilder34 = doctype24.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType35 = doctype24.type;
        startTag21.type = tokenType35;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element37 = xmlTreeBuilder0.insert(startTag21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        boolean boolean5 = startTag0.isComment();
        startTag0.finaliseTag();
        boolean boolean7 = startTag0.isDoctype();
        boolean boolean8 = startTag0.selfClosing;
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isForceQuirks();
        java.lang.String str7 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder8 = doctype7.name;
        org.jsoup.parser.Token.TokenType tokenType9 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype7.type = tokenType9;
        startTag2.type = tokenType9;
        java.lang.Class<?> wildcardClass12 = tokenType9.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        java.lang.String str2 = eOF1.tokenType();
        boolean boolean3 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        xmlTreeBuilder0.initialiseParse("", "EndTag", parseErrorList6);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character("<</hi!>>");
        boolean boolean10 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        xmlTreeBuilder0.initialiseParse("<hi!>", "StartTag", parseErrorList13);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag19 = startTag17.name("hi!");
        org.jsoup.nodes.Attributes attributes20 = tag19.attributes;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes20);
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("", attributes20);
        java.lang.String str23 = startTag22.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = xmlTreeBuilder0.insert(startTag22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "StartTag" + "'", str23, "StartTag");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        java.lang.String str5 = startTag0.tokenType();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("", attributes8);
        startTag9.selfClosing = false;
        startTag9.newAttribute();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag14.name("hi!");
        org.jsoup.nodes.Attributes attributes17 = tag16.attributes;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("", attributes17);
        startTag9.attributes = attributes17;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("<!---->", attributes17);
        startTag0.attributes = attributes17;
        boolean boolean22 = startTag0.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character23 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character5 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder10 = comment9.data;
        java.lang.String str11 = comment9.toString();
        xmlTreeBuilder0.insert(comment9);
        boolean boolean13 = comment9.isEndTag();
        java.lang.String str14 = comment9.toString();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        boolean boolean5 = endTag1.isEOF();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder7 = doctype6.name;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype6.type = tokenType8;
        endTag1.type = tokenType8;
        endTag1.appendAttributeValue('a');
        java.lang.String str13 = endTag1.name();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag2 = startTag1.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("</Doctype4>");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        org.jsoup.parser.Token.TokenType tokenType11 = startTag10.type;
        java.lang.String str12 = startTag10.toString();
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!>" + "'", str12, "<hi!>");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        java.lang.Class<?> wildcardClass10 = stringBuilder9.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType4 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag1.type = tokenType4;
        boolean boolean6 = endTag1.isStartTag();
        boolean boolean7 = endTag1.isCharacter();
        endTag1.finaliseTag();
        org.jsoup.nodes.Attributes attributes9 = endTag1.attributes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(attributes9);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        boolean boolean7 = startTag2.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character8 = startTag2.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder10 = comment9.data;
        java.lang.String str11 = comment9.toString();
        xmlTreeBuilder0.insert(comment9);
        java.lang.String str13 = comment9.toString();
        boolean boolean14 = comment9.isDoctype();
        java.lang.String str15 = comment9.getData();
        java.lang.String str16 = comment9.toString();
        java.lang.String str17 = comment9.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype18 = comment9.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "Doctype", parseErrorList7);
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str10 = doctype9.tokenType();
        org.jsoup.parser.Token.Doctype doctype11 = doctype9.asDoctype();
        java.lang.String str12 = doctype9.tokenType();
        java.lang.StringBuilder stringBuilder13 = doctype9.name;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Doctype" + "'", str10, "Doctype");
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Doctype" + "'", str12, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.appendAttributeValue("");
        boolean boolean9 = endTag1.isStartTag();
        endTag1.selfClosing = false;
        endTag1.appendTagName('a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.appendAttributeValue("");
        java.lang.String str9 = endTag1.tagName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        boolean boolean3 = endTag1.isEOF();
        endTag1.appendTagName('4');
        java.lang.Class<?> wildcardClass6 = endTag1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.Class<?> wildcardClass6 = doctype5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        java.lang.String str2 = eOF0.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character3 = eOF0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.Class<?> wildcardClass6 = doctype0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = startTag1.attributes;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("hi!a", attributes2);
        org.jsoup.parser.Token.Tag tag5 = startTag3.name("</hi!>4");
        tag5.appendAttributeName('#');
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.appendAttributeName("<4>");
        org.jsoup.nodes.Attributes attributes9 = endTag1.getAttributes();
        boolean boolean10 = endTag1.isSelfClosing();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        boolean boolean11 = startTag10.isComment();
        startTag10.appendAttributeName("StartTag");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character9 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        org.jsoup.nodes.Attributes attributes9 = tag8.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = tag8.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNull(attributes9);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CommentStart;
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
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character5 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        boolean boolean4 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = doctype5.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype5);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.newAttribute();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag8.name("hi!");
        org.jsoup.nodes.Attributes attributes11 = tag10.attributes;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("", attributes11);
        startTag3.attributes = attributes11;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("EndTag", attributes11);
        startTag14.appendAttributeValue("EndTag");
        org.jsoup.parser.Token.Tag tag18 = startTag14.name("<hi!>");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.Comment;
        comment5.type = tokenType7;
        java.lang.StringBuilder stringBuilder9 = comment5.data;
        boolean boolean10 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment5);
        org.jsoup.parser.Token.Doctype doctype11 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str12 = doctype11.tokenType();
        boolean boolean13 = doctype11.isForceQuirks();
        boolean boolean14 = doctype11.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Doctype" + "'", str12, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        java.lang.String str2 = eOF1.tokenType();
        boolean boolean3 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        xmlTreeBuilder0.initialiseParse("", "EndTag", parseErrorList6);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag12 = startTag10.name("hi!");
        org.jsoup.nodes.Attributes attributes13 = tag12.attributes;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes13);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("", attributes13);
        java.lang.String str16 = startTag15.tokenType();
        startTag15.appendAttributeName("<</hi!>>hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = xmlTreeBuilder0.insert(startTag15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StartTag" + "'", str16, "StartTag");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</hi!>");
        startTag1.newAttribute();
        java.lang.String str3 = startTag1.name();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.Character character14 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str15 = character14.getData();
        java.lang.String str16 = character14.toString();
        boolean boolean17 = character14.isStartTag();
        java.lang.String str18 = character14.getData();
        java.lang.String str19 = character14.toString();
        org.jsoup.parser.Token.Character character20 = character14.asCharacter();
        java.lang.String str21 = character14.toString();
        java.lang.String str22 = character14.toString();
        xmlTreeBuilder0.insert(character14);
        org.jsoup.parser.Token.Character character24 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
        org.junit.Assert.assertNotNull(character20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EOF" + "'", str21, "EOF");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.isStartTag();
        java.lang.String str3 = endTag1.name();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.Comment;
        comment5.type = tokenType7;
        java.lang.StringBuilder stringBuilder9 = comment5.data;
        boolean boolean10 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment5);
        org.jsoup.parser.Token.Character character12 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str13 = character12.getData();
        java.lang.String str14 = character12.toString();
        boolean boolean15 = character12.isStartTag();
        java.lang.String str16 = character12.toString();
        java.lang.String str17 = character12.toString();
        boolean boolean18 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character12);
        org.jsoup.parser.Token.Character character20 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str21 = character20.getData();
        java.lang.String str22 = character20.toString();
        boolean boolean23 = character20.isStartTag();
        java.lang.String str24 = character20.toString();
        java.lang.String str25 = character20.toString();
        java.lang.String str26 = character20.getData();
        java.lang.String str27 = character20.getData();
        java.lang.String str28 = character20.toString();
        xmlTreeBuilder0.insert(character20);
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag("", attributes31);
        boolean boolean33 = startTag32.isDoctype();
        java.lang.String str34 = startTag32.tagName;
        org.jsoup.parser.Token.TokenType tokenType35 = startTag32.type;
        startTag32.appendTagName(' ');
        boolean boolean38 = startTag32.isDoctype();
        startTag32.tagName = "Character";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element41 = xmlTreeBuilder0.insert(startTag32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EOF" + "'", str13, "EOF");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EOF" + "'", str17, "EOF");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EOF" + "'", str21, "EOF");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EOF" + "'", str24, "EOF");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EOF" + "'", str25, "EOF");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "EOF" + "'", str28, "EOF");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "<</hi!>>", parseErrorList3);
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("", attributes6);
        boolean boolean8 = startTag7.isDoctype();
        java.lang.String str9 = startTag7.tagName;
        org.jsoup.parser.Token.TokenType tokenType10 = startTag7.type;
        startTag7.appendTagName(' ');
        boolean boolean13 = startTag7.isDoctype();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag17 = startTag15.name("hi!");
        org.jsoup.nodes.Attributes attributes18 = tag17.attributes;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("", attributes18);
        startTag7.attributes = attributes18;
        org.jsoup.nodes.Attributes attributes22 = null;
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag("", attributes22);
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag26 = startTag24.name("hi!");
        org.jsoup.nodes.Attributes attributes27 = tag26.attributes;
        startTag23.attributes = attributes27;
        startTag7.attributes = attributes27;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(attributes27);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str18 = startTag17.name();
        boolean boolean19 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag17);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder21 = comment20.data;
        java.lang.String str22 = comment20.getData();
        java.lang.StringBuilder stringBuilder23 = comment20.data;
        xmlTreeBuilder0.insert(comment20);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        xmlTreeBuilder0.initialiseParse("", "</hi!>", parseErrorList27);
        org.jsoup.parser.Token.Doctype doctype29 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        endTag1.appendAttributeName("<!---->");
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        java.lang.String str9 = endTag1.tagName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        java.lang.String str9 = tag8.name();
        tag8.selfClosing = false;
        boolean boolean12 = tag8.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag13 = tag8.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CharacterReferenceInRcdata;
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
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "Doctype", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("", "<4>", parseErrorList11);
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        boolean boolean14 = doctype13.forceQuirks;
        java.lang.StringBuilder stringBuilder15 = doctype13.systemIdentifier;
        boolean boolean16 = doctype13.isCharacter();
        java.lang.String str17 = doctype13.getName();
        boolean boolean18 = doctype13.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
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
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        boolean boolean3 = endTag1.isEOF();
        endTag1.appendAttributeName("<Doctype>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype6 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str2 = startTag1.toString();
        boolean boolean3 = startTag1.isEndTag();
        java.lang.String str4 = startTag1.tagName;
        boolean boolean5 = startTag1.isEndTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<Doctype>" + "'", str2, "<Doctype>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Doctype" + "'", str4, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getName();
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.String str9 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag3.name("hi!");
        org.jsoup.nodes.Attributes attributes6 = tag5.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes6);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<hi!>", attributes6);
        java.lang.String str10 = startTag9.name();
        org.jsoup.parser.Token.StartTag startTag11 = startTag9.asStartTag();
        startTag9.tagName = "StartTag";
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
        org.junit.Assert.assertNotNull(startTag11);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.toString();
        java.lang.String str5 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</hi!>" + "'", str5, "</hi!>");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        boolean boolean6 = startTag2.selfClosing;
        java.lang.String str7 = startTag2.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = startTag2.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.appendAttributeValue('a');
        boolean boolean7 = startTag2.isSelfClosing();
        startTag2.appendTagName('#');
        org.jsoup.nodes.Attributes attributes10 = startTag2.getAttributes();
        startTag2.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<</hi!>>hi!");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedEndTagOpen;
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
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder0.initialiseParse("Character", "<Doctype>", parseErrorList18);
        org.jsoup.parser.Token.Character character21 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str22 = character21.getData();
        java.lang.String str23 = character21.toString();
        boolean boolean24 = character21.isStartTag();
        java.lang.String str25 = character21.toString();
        xmlTreeBuilder0.insert(character21);
        java.lang.String str27 = character21.toString();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EOF" + "'", str23, "EOF");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EOF" + "'", str25, "EOF");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        java.lang.String str4 = doctype0.getName();
        doctype0.forceQuirks = true;
        java.lang.String str7 = doctype0.getName();
        java.lang.String str8 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.Character character14 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str15 = character14.getData();
        java.lang.String str16 = character14.toString();
        boolean boolean17 = character14.isStartTag();
        java.lang.String str18 = character14.getData();
        java.lang.String str19 = character14.toString();
        org.jsoup.parser.Token.Character character20 = character14.asCharacter();
        java.lang.String str21 = character14.toString();
        java.lang.String str22 = character14.toString();
        xmlTreeBuilder0.insert(character14);
        org.jsoup.parser.Token.Character character25 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str26 = character25.getData();
        java.lang.String str27 = character25.toString();
        boolean boolean28 = character25.isStartTag();
        java.lang.String str29 = character25.getData();
        java.lang.String str30 = character25.toString();
        xmlTreeBuilder0.insert(character25);
        org.jsoup.parser.Token.Comment comment32 = new org.jsoup.parser.Token.Comment();
        xmlTreeBuilder0.insert(comment32);
        org.jsoup.parser.Token.Character character35 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str36 = character35.getData();
        java.lang.String str37 = character35.toString();
        boolean boolean38 = character35.isStartTag();
        java.lang.String str39 = character35.getData();
        xmlTreeBuilder0.insert(character35);
        org.jsoup.parser.Token.Doctype doctype41 = new org.jsoup.parser.Token.Doctype();
        boolean boolean42 = doctype41.forceQuirks;
        java.lang.StringBuilder stringBuilder43 = doctype41.systemIdentifier;
        boolean boolean44 = doctype41.isCharacter();
        java.lang.String str45 = doctype41.getName();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
        org.junit.Assert.assertNotNull(character20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EOF" + "'", str21, "EOF");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EOF" + "'", str29, "EOF");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EOF" + "'", str30, "EOF");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EOF" + "'", str36, "EOF");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "EOF" + "'", str37, "EOF");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EOF" + "'", str39, "EOF");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals(stringBuilder43.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CommentStartDash;
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
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isForceQuirks();
        boolean boolean8 = doctype0.forceQuirks;
        boolean boolean9 = doctype0.isEOF();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!");
        org.jsoup.nodes.Attributes attributes5 = tag4.attributes;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes5);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("", attributes5);
        startTag7.appendAttributeName('a');
        startTag7.appendAttributeName("<</hi!>>hi!");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder0.initialiseParse("Character", "<Doctype>", parseErrorList18);
        org.jsoup.parser.Token.EOF eOF20 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token.TokenType tokenType21 = eOF20.type;
        java.lang.String str22 = eOF20.tokenType();
        boolean boolean23 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF20);
        org.jsoup.parser.Token.Comment comment24 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder25 = comment24.data;
        java.lang.String str26 = comment24.getData();
        java.lang.StringBuilder stringBuilder27 = comment24.data;
        java.lang.String str28 = comment24.toString();
        java.lang.String str29 = comment24.getData();
        xmlTreeBuilder0.insert(comment24);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        xmlTreeBuilder0.initialiseParse("4", "Doctype", parseErrorList33);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        xmlTreeBuilder35.initialiseParse("</hi!>", "EOF", parseErrorList38);
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag42 = startTag40.name("hi!");
        boolean boolean43 = xmlTreeBuilder35.process((org.jsoup.parser.Token) startTag40);
        org.jsoup.parser.Token.Comment comment44 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder45 = comment44.data;
        java.lang.String str46 = comment44.toString();
        xmlTreeBuilder35.insert(comment44);
        xmlTreeBuilder0.insert(comment44);
        org.jsoup.parser.Token.Doctype doctype49 = new org.jsoup.parser.Token.Doctype();
        boolean boolean50 = doctype49.forceQuirks;
        java.lang.String str51 = doctype49.getName();
        boolean boolean52 = doctype49.forceQuirks;
        boolean boolean53 = doctype49.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype54 = doctype49.asDoctype();
        boolean boolean55 = doctype49.forceQuirks;
        java.lang.String str56 = doctype49.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!---->" + "'", str46, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doctype54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag4 = startTag0.asStartTag();
        startTag4.tagName = "Doctype";
        java.lang.String str7 = startTag4.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(startTag4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<Doctype>" + "'", str7, "<Doctype>");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag7.name("hi!");
        org.jsoup.nodes.Attributes attributes10 = tag9.attributes;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes10);
        endTag1.attributes = attributes10;
        org.jsoup.nodes.Attributes attributes13 = endTag1.attributes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        boolean boolean13 = startTag9.selfClosing;
        boolean boolean14 = startTag9.isCharacter();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.String str5 = doctype0.getName();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment7 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        xmlTreeBuilder16.initialiseParse("Character", "hi!", parseErrorList19);
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder22 = comment21.data;
        java.lang.String str23 = comment21.getData();
        xmlTreeBuilder16.insert(comment21);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag27 = startTag25.name("hi!");
        startTag25.appendAttributeName(' ');
        boolean boolean30 = startTag25.isComment();
        org.jsoup.nodes.Element element31 = xmlTreeBuilder16.insert(startTag25);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder16.initialiseParse("Character", "<Doctype>", parseErrorList34);
        org.jsoup.parser.Token.Character character37 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str38 = character37.getData();
        java.lang.String str39 = character37.toString();
        boolean boolean40 = character37.isStartTag();
        java.lang.String str41 = character37.toString();
        xmlTreeBuilder16.insert(character37);
        xmlTreeBuilder0.insert(character37);
        org.jsoup.parser.Token.Doctype doctype44 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str45 = doctype44.tokenType();
        org.jsoup.parser.Token.Doctype doctype46 = doctype44.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "EOF" + "'", str38, "EOF");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EOF" + "'", str39, "EOF");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "EOF" + "'", str41, "EOF");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Doctype" + "'", str45, "Doctype");
        org.junit.Assert.assertNotNull(doctype46);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag3.name("hi!");
        org.jsoup.nodes.Attributes attributes6 = tag5.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes6);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("hi!", attributes6);
        java.lang.Class<?> wildcardClass10 = attributes6.getClass();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendTagName('a');
        endTag1.appendAttributeName("hi!");
        boolean boolean8 = endTag1.isComment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        startTag5.appendTagName('a');
        startTag5.newAttribute();
        org.jsoup.nodes.Element element9 = xmlTreeBuilder0.insert(startTag5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        xmlTreeBuilder10.initialiseParse("Character", "hi!", parseErrorList13);
        org.jsoup.parser.Token.Comment comment15 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder16 = comment15.data;
        java.lang.String str17 = comment15.getData();
        xmlTreeBuilder10.insert(comment15);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag21 = startTag19.name("hi!");
        startTag19.appendAttributeName(' ');
        boolean boolean24 = startTag19.isComment();
        org.jsoup.nodes.Element element25 = xmlTreeBuilder10.insert(startTag19);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str28 = startTag27.name();
        boolean boolean29 = xmlTreeBuilder10.process((org.jsoup.parser.Token) startTag27);
        org.jsoup.parser.Token.Comment comment30 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder31 = comment30.data;
        java.lang.String str32 = comment30.getData();
        java.lang.StringBuilder stringBuilder33 = comment30.data;
        xmlTreeBuilder10.insert(comment30);
        xmlTreeBuilder0.insert(comment30);
        org.jsoup.parser.Token.TokenType tokenType36 = comment30.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype37 = comment30.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Doctype" + "'", str28, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        tag4.appendTagName("EOF");
        boolean boolean7 = tag4.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        org.jsoup.parser.Token.TokenType tokenType2 = org.jsoup.parser.Token.TokenType.Comment;
        comment0.type = tokenType2;
        java.lang.String str4 = comment0.toString();
        java.lang.String str5 = comment0.getData();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "Doctype", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("", "<4>", parseErrorList11);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        xmlTreeBuilder13.initialiseParse("</hi!>", "EOF", parseErrorList16);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag20 = startTag18.name("hi!");
        boolean boolean21 = xmlTreeBuilder13.process((org.jsoup.parser.Token) startTag18);
        org.jsoup.parser.Token.Comment comment22 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder23 = comment22.data;
        java.lang.String str24 = comment22.toString();
        xmlTreeBuilder13.insert(comment22);
        java.lang.String str26 = comment22.toString();
        java.lang.String str27 = comment22.getData();
        xmlTreeBuilder0.insert(comment22);
        java.lang.StringBuilder stringBuilder29 = comment22.data;
        java.lang.Class<?> wildcardClass30 = comment22.getClass();
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!---->" + "'", str24, "<!---->");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</hi!>");
        java.lang.String str2 = startTag1.toString();
        startTag1.appendAttributeName('#');
        startTag1.tagName = "</Doctype4>";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<</hi!>>" + "'", str2, "<</hi!>>");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</hi!>");
        java.lang.String str2 = startTag1.toString();
        startTag1.appendAttributeName('#');
        startTag1.appendAttributeValue('#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<</hi!>>" + "'", str2, "<</hi!>>");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        startTag2.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean9 = endTag8.selfClosing;
        org.jsoup.parser.Token.Tag tag11 = endTag8.name("");
        boolean boolean12 = endTag8.isEndTag();
        org.jsoup.parser.Token.Tag tag14 = endTag8.name("<4>");
        org.jsoup.parser.Token.TokenType tokenType15 = tag14.type;
        startTag2.type = tokenType15;
        startTag2.appendAttributeName("EOF");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment19 = startTag2.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isStartTag();
        boolean boolean8 = endTag1.isCharacter();
        java.lang.String str9 = endTag1.name();
        java.lang.String str10 = endTag1.tagName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag11 = endTag1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        tag2.finaliseTag();
        tag2.newAttribute();
        org.jsoup.nodes.Attributes attributes5 = tag2.attributes;
        tag2.tagName = "<Doctype>";
        org.jsoup.parser.Token.StartTag startTag8 = tag2.asStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment9 = tag2.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(startTag8);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeName("hi!");
        org.jsoup.nodes.Attributes attributes7 = startTag0.attributes;
        startTag0.finaliseTag();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("Character", "Doctype", parseErrorList15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder18 = comment17.data;
        xmlTreeBuilder0.insert(comment17);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder21 = comment20.data;
        org.jsoup.parser.Token.TokenType tokenType22 = org.jsoup.parser.Token.TokenType.Comment;
        comment20.type = tokenType22;
        xmlTreeBuilder0.insert(comment20);
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag28 = startTag26.name("hi!");
        org.jsoup.nodes.Attributes attributes29 = tag28.attributes;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes29);
        org.jsoup.nodes.Element element31 = xmlTreeBuilder0.insert(startTag30);
        org.jsoup.parser.Token.Tag tag33 = startTag30.name("");
        boolean boolean34 = startTag30.isSelfClosing();
        startTag30.appendAttributeName('a');
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        startTag10.selfClosing = false;
        startTag10.appendAttributeValue("EndTag");
        boolean boolean15 = startTag10.isDoctype();
        startTag10.appendAttributeName('a');
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment9 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype3 = doctype0.asDoctype();
        doctype3.forceQuirks = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(doctype3);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.newAttribute();
        boolean boolean4 = startTag0.isDoctype();
        startTag0.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        org.jsoup.parser.Token.TokenType tokenType5 = startTag2.type;
        startTag2.appendTagName(' ');
        boolean boolean8 = startTag2.isDoctype();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag12 = startTag10.name("hi!");
        org.jsoup.nodes.Attributes attributes13 = tag12.attributes;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("", attributes13);
        startTag2.attributes = attributes13;
        startTag2.appendAttributeName("<hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag18 = startTag2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag3.name("hi!");
        org.jsoup.nodes.Attributes attributes6 = tag5.attributes;
        startTag2.attributes = attributes6;
        org.jsoup.parser.Token.TokenType tokenType8 = startTag2.type;
        java.lang.String str9 = startTag2.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = startTag2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isForceQuirks();
        boolean boolean8 = doctype0.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.Comment;
        comment5.type = tokenType7;
        java.lang.StringBuilder stringBuilder9 = comment5.data;
        boolean boolean10 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment5);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        xmlTreeBuilder0.initialiseParse("<</hi!>>", "", parseErrorList13);
        java.lang.Class<?> wildcardClass15 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendTagName('a');
        endTag1.appendAttributeName("hi!");
        java.lang.String str8 = endTag1.tokenType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EndTag" + "'", str8, "EndTag");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.newAttribute();
        startTag0.selfClosing = false;
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType4 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag1.type = tokenType4;
        boolean boolean6 = endTag1.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype7 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag6 = startTag4.name("hi!");
        org.jsoup.nodes.Attributes attributes7 = tag6.attributes;
        startTag3.attributes = attributes7;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("Doctype", attributes7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character10 = startTag9.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        endTag1.selfClosing = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        java.lang.String str9 = tag8.name();
        tag8.selfClosing = false;
        boolean boolean12 = tag8.isSelfClosing();
        org.jsoup.nodes.Attributes attributes13 = tag8.getAttributes();
        tag8.tagName = "<!---->";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character16 = tag8.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(attributes13);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        org.jsoup.nodes.Attributes attributes8 = tag7.attributes;
        startTag4.attributes = attributes8;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("Doctype", attributes8);
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("", attributes8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype12 = startTag11.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.EndTagOpen;
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
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isStartTag();
        endTag1.tagName = "Character";
        java.lang.String str10 = endTag1.tagName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment11 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Character" + "'", str10, "Character");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<</hi!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment2 = startTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "Doctype", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("", "<4>", parseErrorList11);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        xmlTreeBuilder13.initialiseParse("</hi!>", "EOF", parseErrorList16);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag20 = startTag18.name("hi!");
        boolean boolean21 = xmlTreeBuilder13.process((org.jsoup.parser.Token) startTag18);
        org.jsoup.parser.Token.Comment comment22 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder23 = comment22.data;
        java.lang.String str24 = comment22.toString();
        xmlTreeBuilder13.insert(comment22);
        java.lang.String str26 = comment22.toString();
        java.lang.String str27 = comment22.getData();
        xmlTreeBuilder0.insert(comment22);
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("StartTag");
        org.jsoup.nodes.Element element31 = xmlTreeBuilder0.insert(startTag30);
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes34 = startTag33.attributes;
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag("<Doctype>", attributes34);
        org.jsoup.nodes.Element element36 = xmlTreeBuilder0.insert(startTag35);
        org.jsoup.nodes.Attributes attributes38 = null;
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag("", attributes38);
        startTag39.selfClosing = false;
        startTag39.newAttribute();
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag46 = startTag44.name("hi!");
        org.jsoup.nodes.Attributes attributes47 = tag46.attributes;
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag("", attributes47);
        startTag39.attributes = attributes47;
        org.jsoup.nodes.Attributes attributes50 = startTag39.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!---->" + "'", str24, "<!---->");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(attributes50);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDash;
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
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("Doctype", attributes9);
        startTag10.selfClosing = true;
        org.jsoup.parser.Token.Tag tag14 = startTag10.name("Character");
        tag14.appendAttributeName("<</hi!>>");
        tag14.appendAttributeValue('#');
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        startTag2.appendAttributeValue('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = startTag2.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag6 = startTag4.name("hi!");
        org.jsoup.nodes.Attributes attributes7 = tag6.attributes;
        startTag3.attributes = attributes7;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("Doctype", attributes7);
        java.lang.String str10 = startTag9.toString();
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<Doctype>" + "'", str10, "<Doctype>");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!");
        org.jsoup.nodes.Attributes attributes5 = tag4.attributes;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes5);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("", attributes5);
        java.lang.String str8 = startTag7.tokenType();
        org.jsoup.parser.Token.TokenType tokenType9 = startTag7.type;
        java.lang.String str10 = startTag7.tagName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment11 = startTag7.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "Doctype", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder10 = comment9.data;
        java.lang.String str11 = comment9.getData();
        java.lang.StringBuilder stringBuilder12 = comment9.data;
        java.lang.String str13 = comment9.toString();
        java.lang.StringBuilder stringBuilder14 = comment9.data;
        java.lang.String str15 = comment9.toString();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        xmlTreeBuilder17.initialiseParse("Character", "hi!", parseErrorList20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        xmlTreeBuilder17.initialiseParse("</hi!>", "Doctype", parseErrorList24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        xmlTreeBuilder17.initialiseParse("", "<4>", parseErrorList28);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        xmlTreeBuilder30.initialiseParse("</hi!>", "EOF", parseErrorList33);
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag37 = startTag35.name("hi!");
        boolean boolean38 = xmlTreeBuilder30.process((org.jsoup.parser.Token) startTag35);
        org.jsoup.parser.Token.Comment comment39 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder40 = comment39.data;
        java.lang.String str41 = comment39.toString();
        xmlTreeBuilder30.insert(comment39);
        java.lang.String str43 = comment39.toString();
        java.lang.String str44 = comment39.getData();
        xmlTreeBuilder17.insert(comment39);
        java.lang.String str46 = comment39.getData();
        boolean boolean47 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment39);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(stringBuilder40);
        org.junit.Assert.assertEquals(stringBuilder40.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!---->" + "'", str41, "<!---->");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!---->" + "'", str43, "<!---->");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedLessthanSign;
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
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<hi!>");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!");
        org.jsoup.nodes.Attributes attributes5 = tag4.attributes;
        startTag1.attributes = attributes5;
        boolean boolean7 = startTag1.isSelfClosing();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = startTag1.attributes;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("<Doctype>", attributes2);
        startTag3.appendAttributeValue("</hi!>");
        startTag3.selfClosing = false;
        startTag3.appendAttributeValue("StartTag");
        org.junit.Assert.assertNotNull(attributes2);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isEOF();
        org.jsoup.parser.Token.Tag tag9 = endTag1.name("4");
        org.jsoup.nodes.Attributes attributes10 = tag9.attributes;
        tag9.newAttribute();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character9 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        startTag2.finaliseTag();
        startTag2.newAttribute();
        boolean boolean8 = startTag2.isComment();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag3.name("hi!");
        org.jsoup.nodes.Attributes attributes6 = tag5.attributes;
        startTag2.attributes = attributes6;
        org.jsoup.parser.Token.TokenType tokenType8 = startTag2.type;
        java.lang.String str9 = startTag2.tokenType();
        boolean boolean10 = startTag2.selfClosing;
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag9 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.PLAINTEXT;
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
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder10 = comment9.data;
        java.lang.String str11 = comment9.toString();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str14 = doctype13.tokenType();
        java.lang.String str15 = doctype13.getSystemIdentifier();
        java.lang.String str16 = doctype13.tokenType();
        boolean boolean17 = doctype13.forceQuirks;
        java.lang.String str18 = doctype13.getName();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Doctype" + "'", str14, "Doctype");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Doctype" + "'", str16, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType11 = doctype0.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character12 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        boolean boolean6 = doctype0.forceQuirks;
        java.lang.String str7 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.newAttribute();
        startTag0.selfClosing = true;
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str3 = startTag2.toString();
        boolean boolean4 = startTag2.isEndTag();
        boolean boolean5 = startTag2.isSelfClosing();
        org.jsoup.nodes.Attributes attributes6 = startTag2.getAttributes();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("EndTag", attributes6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<Doctype>" + "'", str3, "<Doctype>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        boolean boolean2 = eOF0.isComment();
        boolean boolean3 = eOF0.isEOF();
        java.lang.Class<?> wildcardClass4 = eOF0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        org.jsoup.parser.Token.TokenType tokenType5 = startTag2.type;
        startTag2.appendTagName(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = startTag2.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName('4');
        java.lang.String str3 = startTag0.name();
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        startTag0.selfClosing = true;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName('4');
        startTag0.appendAttributeName('#');
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<</hi!>>hi!");
        boolean boolean2 = endTag1.isEOF();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        org.jsoup.parser.Token.TokenType tokenType2 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType2;
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.Class<?> wildcardClass5 = doctype0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.tokenType();
        boolean boolean4 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BeforeDoctypePublicIdentifier;
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
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        java.lang.String str9 = tag8.name();
        tag8.selfClosing = false;
        org.jsoup.nodes.Attributes attributes12 = tag8.getAttributes();
        org.jsoup.parser.Token.StartTag startTag13 = tag8.asStartTag();
        startTag13.finaliseTag();
        startTag13.selfClosing = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertNotNull(startTag13);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag2 = character1.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.String str3 = doctype0.getName();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        boolean boolean5 = doctype0.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!a");
        startTag0.tagName = "<</hi!>>";
        java.lang.String str11 = startTag0.toString();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<<</hi!>>>" + "'", str11, "<<</hi!>>>");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes4);
        java.lang.String str6 = startTag5.toString();
        startTag5.appendAttributeName('#');
        startTag5.finaliseTag();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<</hi!>>" + "'", str6, "<</hi!>>");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("Character", "Doctype", parseErrorList15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder18 = comment17.data;
        xmlTreeBuilder0.insert(comment17);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder21 = comment20.data;
        org.jsoup.parser.Token.TokenType tokenType22 = org.jsoup.parser.Token.TokenType.Comment;
        comment20.type = tokenType22;
        xmlTreeBuilder0.insert(comment20);
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag28 = startTag26.name("hi!");
        org.jsoup.nodes.Attributes attributes29 = tag28.attributes;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes29);
        org.jsoup.nodes.Element element31 = xmlTreeBuilder0.insert(startTag30);
        org.jsoup.parser.Token.Tag tag33 = startTag30.name("");
        boolean boolean34 = tag33.selfClosing;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        tag2.finaliseTag();
        tag2.newAttribute();
        java.lang.String str5 = tag2.tagName;
        tag2.tagName = "hi!a";
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder0.initialiseParse("", "StartTag", parseErrorList18);
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("", attributes21);
        startTag22.selfClosing = false;
        startTag22.appendAttributeValue('a');
        startTag22.appendAttributeName("</Doctype>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element29 = xmlTreeBuilder0.insert(startTag22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.selfClosing = true;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = startTag2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        xmlTreeBuilder1.initialiseParse("</hi!>", "EOF", parseErrorList4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag8 = startTag6.name("hi!");
        boolean boolean9 = xmlTreeBuilder1.process((org.jsoup.parser.Token) startTag6);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        startTag10.appendTagName('4');
        org.jsoup.nodes.Element element13 = xmlTreeBuilder1.insert(startTag10);
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        xmlTreeBuilder1.initialiseParse("Character", "Doctype", parseErrorList16);
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder19 = comment18.data;
        xmlTreeBuilder1.insert(comment18);
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder22 = comment21.data;
        org.jsoup.parser.Token.TokenType tokenType23 = org.jsoup.parser.Token.TokenType.Comment;
        comment21.type = tokenType23;
        xmlTreeBuilder1.insert(comment21);
        java.lang.String str26 = comment21.getData();
        java.lang.String str27 = comment21.toString();
        java.lang.String str28 = comment21.toString();
        java.lang.String str29 = comment21.getData();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        boolean boolean3 = endTag1.isEOF();
        endTag1.appendAttributeName("<Doctype>");
        org.jsoup.parser.Token.TokenType tokenType6 = endTag1.type;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        boolean boolean6 = endTag1.isStartTag();
        endTag1.appendAttributeName("<hi!>");
        boolean boolean9 = endTag1.isEOF();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        boolean boolean9 = startTag5.isDoctype();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        xmlTreeBuilder10.initialiseParse("</hi!>", "EOF", parseErrorList13);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag17 = startTag15.name("hi!");
        boolean boolean18 = xmlTreeBuilder10.process((org.jsoup.parser.Token) startTag15);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendTagName('4');
        org.jsoup.nodes.Element element22 = xmlTreeBuilder10.insert(startTag19);
        startTag19.newAttribute();
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag27 = startTag25.name("hi!");
        org.jsoup.nodes.Attributes attributes28 = tag27.attributes;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag("", attributes28);
        startTag19.attributes = attributes28;
        startTag5.attributes = attributes28;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment32 = startTag5.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(attributes28);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeName("hi!");
        boolean boolean7 = startTag0.isSelfClosing();
        boolean boolean8 = startTag0.isComment();
        startTag0.appendAttributeName("EndTag");
        boolean boolean11 = startTag0.isEOF();
        startTag0.appendAttributeValue("<4</hi!>4>");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag1.tagName = "EndTag";
        boolean boolean4 = startTag1.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype5 = startTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        boolean boolean5 = startTag0.isComment();
        startTag0.tagName = "hi!";
        startTag0.tagName = "<</hi!>>";
        java.lang.String str10 = startTag0.name();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<</hi!>>" + "'", str10, "<</hi!>>");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.parser.Token.TokenType tokenType3 = startTag0.type;
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        startTag0.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes7 = startTag0.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype8 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str11 = character10.getData();
        java.lang.String str12 = character10.toString();
        boolean boolean13 = character10.isStartTag();
        java.lang.String str14 = character10.getData();
        java.lang.String str15 = character10.toString();
        org.jsoup.parser.Token.Character character16 = character10.asCharacter();
        xmlTreeBuilder0.insert(character16);
        java.lang.String str18 = character16.getData();
        java.lang.String str19 = character16.toString();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EOF" + "'", str11, "EOF");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EOF" + "'", str12, "EOF");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.parser.Token.TokenType tokenType3 = startTag0.type;
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        startTag0.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes7 = startTag0.getAttributes();
        java.lang.String str8 = startTag0.toString();
        startTag0.appendAttributeValue("");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi!>" + "'", str8, "<hi!>");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character2 = endTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendTagName(' ');
        boolean boolean5 = endTag1.isComment();
        endTag1.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype7 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("hi!a");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag2 = character1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("</hi!>");
        java.lang.String str11 = startTag10.toString();
        startTag10.appendAttributeName('#');
        org.jsoup.nodes.Element element14 = xmlTreeBuilder0.insert(startTag10);
        org.jsoup.parser.Token.Doctype doctype15 = new org.jsoup.parser.Token.Doctype();
        boolean boolean16 = doctype15.forceQuirks;
        java.lang.StringBuilder stringBuilder17 = doctype15.systemIdentifier;
        boolean boolean18 = doctype15.isCharacter();
        doctype15.forceQuirks = false;
        java.lang.StringBuilder stringBuilder21 = doctype15.publicIdentifier;
        java.lang.StringBuilder stringBuilder22 = doctype15.systemIdentifier;
        doctype15.forceQuirks = false;
        doctype15.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<</hi!>>" + "'", str11, "<</hi!>>");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        startTag2.appendAttributeValue('a');
        org.jsoup.nodes.Attributes attributes9 = startTag2.getAttributes();
        org.jsoup.nodes.Attributes attributes10 = startTag2.attributes;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("Character", "Doctype", parseErrorList15);
        org.jsoup.parser.Token.Character character18 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str19 = character18.getData();
        boolean boolean20 = character18.isComment();
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder22 = comment21.data;
        org.jsoup.parser.Token.TokenType tokenType23 = org.jsoup.parser.Token.TokenType.Comment;
        comment21.type = tokenType23;
        character18.type = tokenType23;
        java.lang.String str26 = character18.toString();
        java.lang.String str27 = character18.toString();
        xmlTreeBuilder0.insert(character18);
        org.jsoup.parser.Token.Doctype doctype29 = new org.jsoup.parser.Token.Doctype();
        boolean boolean30 = doctype29.forceQuirks;
        java.lang.String str31 = doctype29.getName();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        boolean boolean9 = doctype0.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character10 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType4 = endTag1.type;
        org.jsoup.nodes.Attributes attributes5 = endTag1.getAttributes();
        endTag1.selfClosing = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag8 = endTag1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNull(attributes5);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!");
        org.jsoup.nodes.Attributes attributes5 = tag4.attributes;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes5);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("", attributes5);
        java.lang.String str8 = startTag7.tokenType();
        org.jsoup.parser.Token.TokenType tokenType9 = startTag7.type;
        java.lang.String str10 = startTag7.tagName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = startTag7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.toString();
        java.lang.String str3 = character1.toString();
        java.lang.String str4 = character1.toString();
        java.lang.String str5 = character1.getData();
        java.lang.String str6 = character1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EOF" + "'", str4, "EOF");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag1.name("<4>");
        org.jsoup.parser.Token.TokenType tokenType8 = tag7.type;
        java.lang.String str9 = tag7.name();
        tag7.appendAttributeValue("Character");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<4>" + "'", str9, "<4>");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.EndTag endTag4 = endTag1.asEndTag();
        endTag1.appendAttributeValue("Comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertNotNull(endTag4);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.nodes.Attributes attributes3 = tag2.attributes;
        boolean boolean4 = tag2.isEndTag();
        org.jsoup.parser.Token.Tag tag6 = tag2.name("");
        boolean boolean7 = tag2.isSelfClosing();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "Doctype", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("", "<4>", parseErrorList11);
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str14 = doctype13.tokenType();
        java.lang.String str15 = doctype13.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Doctype" + "'", str14, "Doctype");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("Character", "Doctype", parseErrorList15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder18 = comment17.data;
        xmlTreeBuilder0.insert(comment17);
        org.jsoup.parser.Token.Doctype doctype20 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str21 = doctype20.tokenType();
        boolean boolean22 = doctype20.isForceQuirks();
        java.lang.String str23 = doctype20.getPublicIdentifier();
        java.lang.String str24 = doctype20.getSystemIdentifier();
        java.lang.String str25 = doctype20.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Doctype" + "'", str21, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Doctype" + "'", str25, "Doctype");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("</hi!>");
        java.lang.String str11 = startTag10.toString();
        startTag10.appendAttributeName('#');
        org.jsoup.nodes.Element element14 = xmlTreeBuilder0.insert(startTag10);
        org.jsoup.parser.Token.Doctype doctype15 = new org.jsoup.parser.Token.Doctype();
        boolean boolean16 = doctype15.forceQuirks;
        java.lang.StringBuilder stringBuilder17 = doctype15.systemIdentifier;
        boolean boolean18 = doctype15.isCharacter();
        doctype15.forceQuirks = false;
        java.lang.String str21 = doctype15.getName();
        java.lang.String str22 = doctype15.getName();
        boolean boolean23 = doctype15.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<</hi!>>" + "'", str11, "<</hi!>>");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        boolean boolean6 = endTag1.isStartTag();
        endTag1.appendAttributeName("<hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype9 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.RCDATAEndTagName;
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
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.appendAttributeName(' ');
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.newAttribute();
        startTag2.appendTagName("</hi!>");
        org.jsoup.parser.Token.TokenType tokenType8 = startTag2.type;
        startTag2.appendAttributeName("hi!");
        boolean boolean11 = startTag2.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.getData();
        java.lang.Class<?> wildcardClass3 = comment0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        boolean boolean3 = character1.isComment();
        java.lang.String str4 = character1.toString();
        java.lang.String str5 = character1.getData();
        java.lang.String str6 = character1.getData();
        java.lang.String str7 = character1.getData();
        java.lang.String str8 = character1.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag9 = character1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EOF" + "'", str4, "EOF");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EOF" + "'", str7, "EOF");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EOF" + "'", str8, "EOF");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str11 = character10.getData();
        java.lang.String str12 = character10.toString();
        boolean boolean13 = character10.isStartTag();
        java.lang.String str14 = character10.getData();
        java.lang.String str15 = character10.toString();
        org.jsoup.parser.Token.Character character16 = character10.asCharacter();
        xmlTreeBuilder0.insert(character16);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag20 = startTag18.name("hi!");
        startTag18.finaliseTag();
        startTag18.finaliseTag();
        startTag18.appendTagName(' ');
        org.jsoup.nodes.Element element25 = xmlTreeBuilder0.insert(startTag18);
        org.jsoup.parser.Token.Doctype doctype26 = new org.jsoup.parser.Token.Doctype();
        boolean boolean27 = doctype26.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EOF" + "'", str11, "EOF");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EOF" + "'", str12, "EOF");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        boolean boolean5 = doctype0.isCharacter();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        org.jsoup.parser.Token.Doctype doctype2 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder3 = doctype2.name;
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getPublicIdentifier();
        java.lang.String str6 = doctype2.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType4 = endTag1.type;
        org.jsoup.nodes.Attributes attributes5 = endTag1.getAttributes();
        java.lang.String str6 = endTag1.toString();
        endTag1.appendAttributeName("<4>");
        endTag1.tagName = "hi!";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</hi!>" + "'", str6, "</hi!>");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeName("hi!");
        boolean boolean7 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName('4');
        java.lang.String str11 = startTag8.name();
        org.jsoup.nodes.Attributes attributes12 = startTag8.attributes;
        startTag0.attributes = attributes12;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag14 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeValue('#');
        startTag0.newAttribute();
        startTag0.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        boolean boolean12 = tag11.isComment();
        org.jsoup.parser.Token.TokenType tokenType13 = tag11.type;
        startTag0.type = tokenType13;
        boolean boolean15 = startTag0.selfClosing;
        startTag0.appendTagName('#');
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        tag2.finaliseTag();
        tag2.appendAttributeName('a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = tag2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder0.initialiseParse("", "StartTag", parseErrorList18);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        xmlTreeBuilder20.initialiseParse("</hi!>", "EOF", parseErrorList23);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag27 = startTag25.name("hi!");
        boolean boolean28 = xmlTreeBuilder20.process((org.jsoup.parser.Token) startTag25);
        org.jsoup.parser.Token.Comment comment29 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder30 = comment29.data;
        java.lang.String str31 = comment29.toString();
        xmlTreeBuilder20.insert(comment29);
        java.lang.String str33 = comment29.toString();
        java.lang.String str34 = comment29.getData();
        org.jsoup.parser.Token.Comment comment35 = comment29.asComment();
        xmlTreeBuilder0.insert(comment35);
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        xmlTreeBuilder0.initialiseParse("4", "<4>", parseErrorList39);
        org.jsoup.parser.Token.Character character42 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str43 = character42.getData();
        java.lang.String str44 = character42.toString();
        boolean boolean45 = character42.isStartTag();
        java.lang.String str46 = character42.toString();
        java.lang.String str47 = character42.getData();
        xmlTreeBuilder0.insert(character42);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!---->" + "'", str31, "<!---->");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!---->" + "'", str33, "<!---->");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(comment35);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "EOF" + "'", str43, "EOF");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "EOF" + "'", str44, "EOF");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "EOF" + "'", str46, "EOF");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "EOF" + "'", str47, "EOF");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.nodes.Attributes attributes3 = tag2.attributes;
        boolean boolean4 = tag2.isEndTag();
        org.jsoup.nodes.Attributes attributes5 = tag2.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = tag2.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.toString();
        java.lang.String str5 = endTag1.tokenType();
        endTag1.appendTagName('4');
        endTag1.appendAttributeValue('a');
        boolean boolean10 = endTag1.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("<4>");
        java.lang.String str2 = character1.toString();
        java.lang.String str3 = character1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<4>" + "'", str2, "<4>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<4>" + "'", str3, "<4>");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.EndTag endTag4 = endTag1.asEndTag();
        org.jsoup.nodes.Attributes attributes5 = endTag4.getAttributes();
        endTag4.appendAttributeValue("</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertNotNull(endTag4);
        org.junit.Assert.assertNull(attributes5);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeValue("<</hi!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment5 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("<hi!>");
        java.lang.String str2 = character1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<hi!>" + "'", str2, "<hi!>");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character5 = doctype4.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
    }
}

