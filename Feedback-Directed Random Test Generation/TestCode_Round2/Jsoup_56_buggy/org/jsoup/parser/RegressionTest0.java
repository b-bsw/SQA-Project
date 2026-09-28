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
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BogusDoctype;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedEndTagOpen;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.MarkupDeclarationOpen;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BeforeDoctypePublicIdentifier;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.Doctype;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.PLAINTEXT;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype1 = endTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterDoctypePublicIdentifier;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDash;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BeforeDoctypeName;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterAttributeName;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.parser.Token.TokenType tokenType0 = org.jsoup.parser.Token.TokenType.EndTag;
        org.junit.Assert.assertTrue("'" + tokenType0 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType0.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        int[] intArray3 = new int[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            endTag0.appendAttributeValue(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not a valid Unicode code point: 0xFFFFFFFF");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1) });
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.RCDATAEndTagOpen;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BeforeAttributeValue;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.String str0 = org.jsoup.nodes.DocumentType.PUBLIC_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PUBLIC" + "'", str0, "PUBLIC");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment1 = comment0.asComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character2 = comment0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comment1);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStart;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.String str0 = org.jsoup.nodes.DocumentType.SYSTEM_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SYSTEM" + "'", str0, "SYSTEM");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
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
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.Data;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedLessthanSign;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.EndTag endTag3 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType4 = endTag3.type;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CommentStartDash;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        char[] charArray6 = new char[] { 'a', '#', ' ' };
        endTag0.appendAttributeValue(charArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype8 = endTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', '#', ' ' });
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterDoctypeName;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.Initial;
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) character1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.parser.Token.TokenType tokenType0 = org.jsoup.parser.Token.TokenType.StartTag;
        org.junit.Assert.assertTrue("'" + tokenType0 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType0.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        int[] intArray9 = new int[] { (-1), (short) -1, 1, (byte) 10, (-1), (-1) };
        // The following exception was thrown during execution in test generation
        try {
            endTag0.appendAttributeValue(intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not a valid Unicode code point: 0xFFFFFFFF");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), (-1), 1, 10, (-1), (-1) });
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.BeforeHtml;
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InTable;
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag1 = startTag0.asStartTag();
        boolean boolean2 = startTag0.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.RawtextEndTagOpen;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
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
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        java.lang.String str2 = token1.tokenType();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Comment" + "'", str2, "Comment");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.finaliseTag();
        tag3.appendTagName('a');
        java.lang.String str7 = tag3.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character8 = tag3.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType2 = org.jsoup.parser.Token.TokenType.EOF;
        doctype0.type = tokenType2;
        org.jsoup.parser.Token token4 = doctype0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment5 = token4.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(token4);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType2 = org.jsoup.parser.Token.TokenType.EOF;
        doctype0.type = tokenType2;
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.Class<?> wildcardClass5 = token4.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.RawtextLessthanSign;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        char[] charArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            endTag0.appendAttributeValue(charArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(tag3);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataLessthanSign;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.newAttribute();
        boolean boolean3 = endTag0.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.tokenType();
        java.lang.String str3 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Doctype" + "'", str2, "Doctype");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_doubleQuoted;
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        startTag0.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDashDash;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node16 = documentType15.parent();
        org.jsoup.parser.Token.Doctype doctype17 = new org.jsoup.parser.Token.Doctype();
        boolean boolean18 = doctype17.forceQuirks;
        java.lang.String str19 = doctype17.tokenType();
        java.lang.StringBuilder stringBuilder20 = doctype17.systemIdentifier;
        boolean boolean21 = documentType15.equals((java.lang.Object) stringBuilder20);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Doctype" + "'", str19, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.after("SYSTEM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character6 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        boolean boolean3 = endTag0.isComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character4 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterFrameset;
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str12 = documentType11.outerHtml();
        org.jsoup.nodes.Attributes attributes13 = documentType11.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = xmlTreeBuilder0.processStartTag("", attributes13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        xmlTreeBuilder6.initialiseParse("", "SYSTEM", parseErrorList11, parseSettings13);
        org.jsoup.parser.Token.Comment comment15 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment16 = comment15.asComment();
        xmlTreeBuilder6.insert(comment15);
        xmlTreeBuilder0.insert(comment15);
        org.jsoup.parser.Token.Doctype doctype19 = new org.jsoup.parser.Token.Doctype();
        boolean boolean20 = doctype19.forceQuirks;
        java.lang.StringBuilder stringBuilder21 = doctype19.systemIdentifier;
        boolean boolean22 = doctype19.forceQuirks;
        doctype19.forceQuirks = false;
        java.lang.StringBuilder stringBuilder25 = doctype19.name;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(comment16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.AfterBody;
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        int[] intArray10 = new int[] { (short) -1, 'a', (byte) 1, 1, (short) 0, '#' };
        // The following exception was thrown during execution in test generation
        try {
            endTag0.appendAttributeValue(intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not a valid Unicode code point: 0xFFFFFFFF");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { (-1), 97, 1, 1, 0, 35 });
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.AfterFrameset;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder1.parseFragment("", "", parseErrorList4, parseSettings5);
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder10.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder10.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder16.defaultSettings();
        xmlTreeBuilder10.initialiseParse("", "SYSTEM", parseErrorList15, parseSettings17);
        xmlTreeBuilder1.initialiseParse("Doctype", "PUBLIC", parseErrorList9, parseSettings17);
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.ParseSettings parseSettings27 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlTreeBuilder23.parseFragment("", "", parseErrorList26, parseSettings27);
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder32.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder32.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder38 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings39 = xmlTreeBuilder38.defaultSettings();
        xmlTreeBuilder32.initialiseParse("", "SYSTEM", parseErrorList37, parseSettings39);
        xmlTreeBuilder23.initialiseParse("Doctype", "PUBLIC", parseErrorList31, parseSettings39);
        xmlTreeBuilder1.initialiseParse("EndTag", "<!---->", parseErrorList22, parseSettings39);
        org.jsoup.parser.Token.Doctype doctype43 = new org.jsoup.parser.Token.Doctype();
        xmlTreeBuilder1.insert(doctype43);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder45 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) doctype43, htmlTreeBuilder45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(parseSettings39);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isEndTag();
        java.lang.String str2 = endTag0.tagName;
        endTag0.appendAttributeValue("PUBLIC");
        endTag0.normalName = "";
        boolean boolean7 = endTag0.isComment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment1 = comment0.asComment();
        org.jsoup.parser.Token token2 = comment1.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag3 = token2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comment1);
        org.junit.Assert.assertNotNull(token2);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        int[] intArray7 = new int[] { 'a', (byte) -1, (short) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            endTag0.appendAttributeValue(intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not a valid Unicode code point: 0xFFFFFFFF");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 97, (-1), 100, 0 });
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str6 = documentType4.absUrl("EndTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDashDash;
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
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.before(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getSystemIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag4 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        java.lang.String str2 = comment0.toString();
        org.jsoup.parser.Token.Comment comment3 = comment0.asComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag4 = comment3.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(comment3);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str6 = documentType4.absUrl("EndTag");
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int12 = documentType11.childNodeSize();
        java.lang.String str13 = documentType11.outerHtml();
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        boolean boolean15 = doctype14.forceQuirks;
        doctype14.forceQuirks = false;
        java.lang.String str18 = doctype14.getName();
        java.lang.StringBuilder stringBuilder19 = doctype14.name;
        java.lang.StringBuilder stringBuilder20 = documentType11.html(stringBuilder19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.after((org.jsoup.nodes.Node) documentType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        xmlTreeBuilder0.initialiseParse("", "SYSTEM", parseErrorList5, parseSettings7);
        org.jsoup.parser.ParseSettings parseSettings9 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str16 = documentType15.outerHtml();
        org.jsoup.nodes.Attributes attributes17 = documentType15.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = xmlTreeBuilder0.processStartTag("", attributes17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.after("a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment3 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(endTag2);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType2 = doctype0.type;
        boolean boolean3 = doctype0.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment4 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        boolean boolean2 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag4 = startTag0.name("a");
        java.lang.String str5 = tag4.normalName;
        java.lang.String str6 = tag4.normalName;
        java.lang.Class<?> wildcardClass7 = tag4.getClass();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "PUBLIC", "#doctype", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("EndTag", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "SYSTEM");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str10 = documentType9.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        org.jsoup.parser.Token.Tag tag4 = tag3.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment5 = tag4.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.Object obj7 = null;
        boolean boolean8 = documentType4.hasSameValue(obj7);
        org.jsoup.nodes.Document document9 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = document9.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getSystemIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment5 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("PUBLIC", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = document6.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(document6);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        boolean boolean3 = endTag0.isComment();
        boolean boolean4 = endTag0.isEOF();
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("hi!");
        java.lang.String str3 = character2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment4 = character2.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!---->");
        // The following exception was thrown during execution in test generation
        try {
            node9.setBaseUri("SYSTEM");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes5 = null;
        startTag4.attributes = attributes5;
        org.jsoup.parser.Token.Tag tag7 = startTag4.reset();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = startTag4.nameAttr("SYSTEM", attributes9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = xmlTreeBuilder0.insert(startTag10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(startTag10);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        java.lang.String str2 = comment0.getData();
        org.jsoup.parser.Token token3 = comment0.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(token3);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        doctype6.forceQuirks = false;
        java.lang.String str10 = doctype6.getName();
        java.lang.StringBuilder stringBuilder11 = doctype6.name;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "PUBLIC", "#doctype", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            node7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment5 = tag3.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("PUBLIC", "hi!");
        org.jsoup.nodes.Document document9 = xmlTreeBuilder0.parse("hi!", "<!---->");
        org.jsoup.nodes.Attributes attributes11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xmlTreeBuilder0.processStartTag("<!---->", attributes11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document9);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str6 = documentType4.absUrl("EndTag");
        java.lang.Class<?> wildcardClass7 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        xmlTreeBuilder0.insert(doctype42);
        org.jsoup.nodes.DocumentType documentType48 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int49 = documentType48.childNodeSize();
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes52 = null;
        org.jsoup.parser.Token.StartTag startTag53 = startTag50.nameAttr("PUBLIC", attributes52);
        boolean boolean54 = documentType48.hasSameValue((java.lang.Object) startTag50);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element55 = xmlTreeBuilder0.insert(startTag50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(startTag53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("EndTag", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder4.initialiseParse("Comment", "Doctype", parseErrorList8, parseSettings16);
        org.jsoup.parser.Token.Character character19 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character21 = character19.data("hi!");
        java.lang.String str22 = character21.toString();
        java.lang.String str23 = character21.getData();
        xmlTreeBuilder4.insert(character21);
        java.lang.String str25 = character21.toString();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(character21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("PUBLIC", "hi!");
        org.jsoup.nodes.Node node8 = document6.removeAttr("PUBLIC");
        int int9 = document6.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = document6.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList8 = document7.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        int int11 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int17 = documentType16.childNodeSize();
        documentType16.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = documentType4.before((org.jsoup.nodes.Node) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.before("PUBLIC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        startTag0.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment3 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        java.lang.String str11 = documentType4.toString();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str13 = doctype12.getSystemIdentifier();
        boolean boolean14 = doctype12.forceQuirks;
        java.lang.String str15 = doctype12.getPublicIdentifier();
        java.lang.String str16 = doctype12.getSystemIdentifier();
        boolean boolean17 = documentType4.equals((java.lang.Object) doctype12);
        java.lang.String str18 = documentType4.outerHtml();
        org.jsoup.nodes.Node node19 = documentType4.nextSibling();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder20.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder20.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder20.defaultSettings();
        org.jsoup.nodes.Document document26 = xmlTreeBuilder20.parse("PUBLIC", "hi!");
        org.jsoup.nodes.Node node28 = document26.removeAttr("PUBLIC");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = documentType4.after((org.jsoup.nodes.Node) document26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        boolean boolean9 = documentType4.hasAttr("SYSTEM");
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.parser.Token.Doctype doctype8 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str9 = doctype8.getSystemIdentifier();
        boolean boolean10 = doctype8.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = document7.hasSameValue((java.lang.Object) doctype8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag1 = startTag0.asStartTag();
        boolean boolean2 = startTag0.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character3 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendTagName('4');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character3 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder1.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder1.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder7.defaultSettings();
        xmlTreeBuilder1.initialiseParse("", "SYSTEM", parseErrorList6, parseSettings8);
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder1.defaultSettings();
        org.jsoup.parser.Token.Character character11 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character13 = character11.data("hi!");
        java.lang.String str14 = character11.toString();
        org.jsoup.parser.Token.Character character16 = character11.data("");
        xmlTreeBuilder1.insert(character16);
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(character13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(character16);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InHead;
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str2 = startTag1.normalName;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) startTag1, htmlTreeBuilder3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.RCDATAEndTagName;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("a", "#doctype", "Comment", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node10 = documentType9.parent();
        org.jsoup.nodes.Node node11 = documentType9.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterAttributeValue_quoted;
        java.lang.Class<?> wildcardClass1 = tokeniserState0.getClass();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        xmlTreeBuilder0.initialiseParse("", "SYSTEM", parseErrorList5, parseSettings7);
        org.jsoup.parser.ParseSettings parseSettings9 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings9);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        startTag0.appendAttributeValue(' ');
        char[] charArray9 = new char[] { ' ', '4', '#' };
        startTag0.appendAttributeValue(charArray9);
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.asStartTag();
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType14 = endTag13.type;
        org.jsoup.parser.Token.EndTag endTag15 = endTag13.asEndTag();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str21 = documentType20.outerHtml();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        endTag15.attributes = attributes22;
        org.jsoup.nodes.Attributes attributes24 = endTag15.getAttributes();
        org.jsoup.parser.Token.StartTag startTag25 = startTag0.nameAttr("hi!", attributes24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character26 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '4', '#' });
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(startTag25);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InFrameset;
        org.jsoup.parser.Token.Doctype doctype1 = new org.jsoup.parser.Token.Doctype();
        boolean boolean2 = doctype1.forceQuirks;
        java.lang.StringBuilder stringBuilder3 = doctype1.systemIdentifier;
        java.lang.String str4 = doctype1.getSystemIdentifier();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) doctype1, htmlTreeBuilder5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str8 = documentType7.outerHtml();
        org.jsoup.nodes.Attributes attributes9 = documentType7.attributes();
        endTag2.attributes = attributes9;
        java.lang.Class<?> wildcardClass11 = endTag2.getClass();
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InSelect;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.RcdataLessthanSign;
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
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("PUBLIC", "hi!");
        org.jsoup.nodes.Node node8 = document6.removeAttr("PUBLIC");
        int int9 = document6.siblingIndex();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node15 = documentType14.parent();
        org.jsoup.parser.Token.Doctype doctype16 = new org.jsoup.parser.Token.Doctype();
        boolean boolean17 = doctype16.forceQuirks;
        java.lang.String str18 = doctype16.tokenType();
        java.lang.StringBuilder stringBuilder19 = doctype16.systemIdentifier;
        boolean boolean20 = documentType14.equals((java.lang.Object) stringBuilder19);
        java.lang.String str21 = documentType14.toString();
        org.jsoup.nodes.Node node22 = documentType14.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = document6.after(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("hi!");
        java.lang.String str3 = character2.toString();
        java.lang.String str4 = character2.getData();
        org.jsoup.parser.Token.Character character6 = character2.data("");
        java.lang.String str7 = character6.tokenType();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Character" + "'", str7, "Character");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("PUBLIC", "hi!");
        org.jsoup.nodes.Node node8 = document6.removeAttr("PUBLIC");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = document6.after("<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = node6.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        org.jsoup.parser.Token.Comment comment15 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment16 = comment15.asComment();
        java.lang.StringBuilder stringBuilder17 = comment16.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder18 = node14.html(stringBuilder17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(comment16);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue("EndTag");
        boolean boolean3 = endTag0.isEOF();
        int[] intArray10 = new int[] { 1, (short) 1, 1, (byte) 0, 1, 10 };
        endTag0.appendAttributeValue(intArray10);
        java.lang.Class<?> wildcardClass12 = endTag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 1, 1, 0, 1, 10 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Document document45 = document44.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = document44.traverse(nodeVisitor46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document45);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes2 = null;
        tag1.attributes = attributes2;
        org.jsoup.parser.Token token4 = tag1.reset();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        token4.type = tokenType5;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node12 = documentType11.parent();
        org.jsoup.nodes.Node node13 = documentType11.nextSibling();
        java.lang.String str14 = documentType11.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node6.before((org.jsoup.nodes.Node) documentType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = tag3.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parentNode();
        org.jsoup.nodes.Node node6 = documentType4.parentNode();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("a", "#doctype", "Comment", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = documentType11.parent();
        org.jsoup.nodes.Node node13 = documentType11.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node6.after(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node7.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        java.lang.String str11 = documentType4.toString();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str13 = doctype12.getSystemIdentifier();
        boolean boolean14 = doctype12.forceQuirks;
        java.lang.String str15 = doctype12.getPublicIdentifier();
        java.lang.String str16 = doctype12.getSystemIdentifier();
        boolean boolean17 = documentType4.equals((java.lang.Object) doctype12);
        java.lang.String str18 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int24 = documentType23.childNodeSize();
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes27 = null;
        org.jsoup.parser.Token.StartTag startTag28 = startTag25.nameAttr("PUBLIC", attributes27);
        boolean boolean29 = documentType23.hasSameValue((java.lang.Object) startTag25);
        int int30 = documentType23.siblingIndex();
        java.lang.String str32 = documentType23.attr("EndTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = documentType4.after((org.jsoup.nodes.Node) documentType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Document document45 = document44.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = document44.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document45);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        startTag0.appendAttributeValue(' ');
        char[] charArray9 = new char[] { ' ', '4', '#' };
        startTag0.appendAttributeValue(charArray9);
        org.jsoup.parser.Token.Tag tag12 = startTag0.name("<!---->");
        tag12.selfClosing = true;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '4', '#' });
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.DocumentType documentType8 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str9 = documentType8.outerHtml();
        org.jsoup.nodes.Attributes attributes10 = documentType8.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType8.childNodes();
        boolean boolean13 = documentType8.hasAttr("SYSTEM");
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment15 = comment14.asComment();
        org.jsoup.parser.Token token16 = comment15.reset();
        org.jsoup.parser.Token token17 = comment15.reset();
        boolean boolean18 = documentType8.hasSameValue((java.lang.Object) comment15);
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(comment15);
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertNotNull(token17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype3 = endTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag2);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        endTag0.appendAttributeName("hi!");
        endTag0.appendAttributeValue(' ');
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node8.setBaseUri("Doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("EndTag", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType19.siblingNodes();
        boolean boolean21 = documentType4.equals((java.lang.Object) documentType19);
        org.jsoup.nodes.Node node23 = documentType4.removeAttr("a");
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int29 = documentType28.childNodeSize();
        java.lang.String str31 = documentType28.absUrl("a");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = node23.before((org.jsoup.nodes.Node) documentType28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.newAttribute();
        boolean boolean3 = endTag0.selfClosing;
        endTag0.tagName = "SYSTEM";
        endTag0.tagName = "</SYSTEM>";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        int int6 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("SYSTEM", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int13 = documentType12.childNodeSize();
        java.lang.String str15 = documentType12.absUrl("a");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.after((org.jsoup.nodes.Node) documentType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("SYSTEM", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype9 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int13 = documentType12.childNodeSize();
        org.jsoup.nodes.Attributes attributes14 = documentType12.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.after((org.jsoup.nodes.Node) documentType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token6 = comment5.reset();
        java.lang.String str7 = comment5.getData();
        boolean boolean8 = documentType4.hasSameValue((java.lang.Object) str7);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.after("<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.normalName = "<!DOCTYPE hi! PUBLIC \"hi!\">";
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str13 = documentType12.outerHtml();
        org.jsoup.nodes.Attributes attributes14 = documentType12.attributes();
        org.jsoup.parser.Token.StartTag startTag15 = startTag3.nameAttr("<!DOCTYPE hi! PUBLIC \"hi!\">", attributes14);
        endTag0.attributes = attributes14;
        endTag0.appendTagName("#endtag");
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(startTag15);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.selfClosing = false;
        startTag0.appendTagName('#');
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        boolean boolean2 = endTag0.isCharacter();
        java.lang.String str3 = endTag0.tagName;
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        java.lang.String str3 = endTag0.normalName;
        endTag0.appendTagName("EndTag");
        boolean boolean6 = endTag0.isDoctype();
        org.jsoup.parser.Token token7 = endTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character8 = token7.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        endTag0.appendAttributeName("hi!");
        endTag0.appendTagName('#');
        endTag0.appendTagName("EndTag");
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType9 = endTag8.type;
        org.jsoup.parser.Token.EndTag endTag10 = endTag8.asEndTag();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str16 = documentType15.outerHtml();
        org.jsoup.nodes.Attributes attributes17 = documentType15.attributes();
        endTag10.attributes = attributes17;
        endTag0.attributes = attributes17;
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        startTag0.selfClosing = true;
        java.lang.String str6 = startTag0.toString();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<PUBLIC>" + "'", str6, "<PUBLIC>");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.tokenType();
        boolean boolean3 = doctype0.forceQuirks;
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Doctype" + "'", str2, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        xmlTreeBuilder0.initialiseParse("", "SYSTEM", parseErrorList5, parseSettings7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment10 = comment9.asComment();
        xmlTreeBuilder0.insert(comment9);
        boolean boolean12 = comment9.bogus;
        java.lang.StringBuilder stringBuilder13 = comment9.data;
        boolean boolean14 = comment9.bogus;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype15 = comment9.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.String str8 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.Class<?> wildcardClass7 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node13 = documentType12.parent();
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        boolean boolean15 = doctype14.forceQuirks;
        java.lang.String str16 = doctype14.tokenType();
        java.lang.StringBuilder stringBuilder17 = doctype14.systemIdentifier;
        boolean boolean18 = documentType12.equals((java.lang.Object) stringBuilder17);
        org.jsoup.nodes.Node node20 = documentType12.removeAttr("PUBLIC");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node7.before(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Doctype" + "'", str16, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag1 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        boolean boolean3 = startTag0.isDoctype();
        org.junit.Assert.assertNotNull(startTag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parentNode();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = null;
        startTag6.attributes = attributes7;
        org.jsoup.parser.Token.Tag tag9 = startTag6.reset();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = startTag6.nameAttr("SYSTEM", attributes11);
        org.jsoup.parser.Token.Tag tag14 = startTag6.name("");
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag15.reset();
        boolean boolean17 = startTag15.isSelfClosing();
        org.jsoup.parser.Token.Tag tag19 = startTag15.name("a");
        org.jsoup.parser.Token.EndTag endTag20 = new org.jsoup.parser.Token.EndTag();
        endTag20.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag22 = endTag20.asEndTag();
        char[] charArray26 = new char[] { 'a', '#', ' ' };
        endTag20.appendAttributeValue(charArray26);
        startTag15.appendAttributeValue(charArray26);
        startTag6.appendAttributeValue(charArray26);
        boolean boolean30 = documentType4.hasSameValue((java.lang.Object) charArray26);
        org.jsoup.select.NodeVisitor nodeVisitor31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = documentType4.traverse(nodeVisitor31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(endTag22);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { 'a', '#', ' ' });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Document document45 = document44.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = document44.childNodes();
        org.jsoup.parser.Token.Doctype doctype47 = new org.jsoup.parser.Token.Doctype();
        boolean boolean48 = doctype47.forceQuirks;
        java.lang.String str49 = doctype47.tokenType();
        java.lang.StringBuilder stringBuilder50 = doctype47.systemIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder50);
        java.lang.StringBuilder stringBuilder52 = document44.html(stringBuilder50);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder53.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder53.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder53.defaultSettings();
        org.jsoup.nodes.Document document59 = xmlTreeBuilder53.parse("PUBLIC", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node60 = document44.before((org.jsoup.nodes.Node) document59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Doctype" + "'", str49, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "\n<!---->");
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "\n<!---->");
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(document59);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        org.jsoup.parser.Token.reset(stringBuilder13);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("comment", "EndTag", "#doctype", "SYSTEM");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.before("SYSTEM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        boolean boolean2 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag4 = startTag0.name("a");
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        endTag5.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag7 = endTag5.asEndTag();
        char[] charArray11 = new char[] { 'a', '#', ' ' };
        endTag5.appendAttributeValue(charArray11);
        startTag0.appendAttributeValue(charArray11);
        startTag0.tagName = "";
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(endTag7);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', '#', ' ' });
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.parser.Token.TokenType tokenType4 = org.jsoup.parser.Token.TokenType.Character;
        tag3.type = tokenType4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = tag3.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        boolean boolean2 = startTag0.isSelfClosing();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("", "", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings14 = xmlTreeBuilder13.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder13.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        xmlTreeBuilder13.initialiseParse("", "SYSTEM", parseErrorList18, parseSettings20);
        xmlTreeBuilder4.initialiseParse("Doctype", "PUBLIC", parseErrorList12, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder26.parseFragment("", "", parseErrorList29, parseSettings30);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder35.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder41.defaultSettings();
        xmlTreeBuilder35.initialiseParse("", "SYSTEM", parseErrorList40, parseSettings42);
        xmlTreeBuilder26.initialiseParse("Doctype", "PUBLIC", parseErrorList34, parseSettings42);
        xmlTreeBuilder4.initialiseParse("EndTag", "<!---->", parseErrorList25, parseSettings42);
        org.jsoup.nodes.Document document48 = xmlTreeBuilder4.parse("<!---->", "SYSTEM");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder50.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder55.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder61 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings62 = xmlTreeBuilder61.defaultSettings();
        xmlTreeBuilder55.initialiseParse("", "SYSTEM", parseErrorList60, parseSettings62);
        xmlTreeBuilder50.initialiseParse("Comment", "Doctype", parseErrorList54, parseSettings62);
        org.jsoup.nodes.DocumentType documentType70 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str71 = documentType70.outerHtml();
        org.jsoup.nodes.Attributes attributes72 = documentType70.attributes();
        org.jsoup.nodes.Attributes attributes73 = documentType70.attributes();
        boolean boolean74 = xmlTreeBuilder50.processStartTag("EndTag", attributes73);
        boolean boolean75 = xmlTreeBuilder4.processStartTag("EndTag", attributes73);
        org.jsoup.parser.Token.StartTag startTag76 = startTag0.nameAttr("EndTag", attributes73);
        startTag76.normalName = "Comment";
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str71, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes72);
        org.junit.Assert.assertNotNull(attributes73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(startTag76);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag3 = endTag0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(endTag2);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes46 = null;
        startTag45.attributes = attributes46;
        org.jsoup.parser.Token.Tag tag48 = startTag45.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element49 = xmlTreeBuilder0.insert(startTag45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(tag48);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        java.lang.String str3 = endTag0.normalName;
        endTag0.appendTagName("EndTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag1 = startTag0.asStartTag();
        boolean boolean2 = startTag0.isEndTag();
        org.jsoup.parser.Token.Character character3 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character5 = character3.data("hi!");
        java.lang.String str6 = character5.getData();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType9 = doctype7.type;
        character5.type = tokenType9;
        startTag0.type = tokenType9;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype12 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        java.lang.String str3 = endTag0.normalName;
        endTag0.appendTagName("EndTag");
        boolean boolean6 = endTag0.isDoctype();
        org.jsoup.parser.Token token7 = endTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = token7.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        xmlTreeBuilder6.initialiseParse("", "SYSTEM", parseErrorList11, parseSettings13);
        org.jsoup.parser.Token.Comment comment15 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment16 = comment15.asComment();
        xmlTreeBuilder6.insert(comment15);
        xmlTreeBuilder0.insert(comment15);
        org.jsoup.parser.Token.Doctype doctype19 = new org.jsoup.parser.Token.Doctype();
        boolean boolean20 = doctype19.forceQuirks;
        java.lang.StringBuilder stringBuilder21 = doctype19.systemIdentifier;
        boolean boolean22 = doctype19.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(comment16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment1 = comment0.asComment();
        java.lang.String str2 = comment0.getData();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        boolean boolean5 = comment0.bogus;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag6 = comment0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comment1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType2 = org.jsoup.parser.Token.TokenType.EOF;
        doctype0.type = tokenType2;
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        xmlTreeBuilder0.insert(doctype42);
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder47 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder47.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder47.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder53.defaultSettings();
        xmlTreeBuilder47.initialiseParse("", "SYSTEM", parseErrorList52, parseSettings54);
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder0.parseFragment("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", parseErrorList46, parseSettings54);
        org.jsoup.nodes.Document document59 = xmlTreeBuilder0.parse("#doctype", "EndTag");
        boolean boolean61 = document59.hasAttr("<SYSTEM>");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.String str5 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(tag3);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterDoctypePublicKeyword;
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
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.Object obj7 = null;
        boolean boolean8 = documentType4.hasSameValue(obj7);
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Document document45 = document44.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = document44.childNodes();
        org.jsoup.parser.Token.Doctype doctype47 = new org.jsoup.parser.Token.Doctype();
        boolean boolean48 = doctype47.forceQuirks;
        java.lang.String str49 = doctype47.tokenType();
        java.lang.StringBuilder stringBuilder50 = doctype47.systemIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder50);
        java.lang.StringBuilder stringBuilder52 = document44.html(stringBuilder50);
        java.util.List<org.jsoup.nodes.Node> nodeList53 = document44.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node55 = document44.wrap("aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Doctype" + "'", str49, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "\n<!---->");
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "\n<!---->");
        org.junit.Assert.assertNotNull(nodeList53);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CommentEnd;
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
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = startTag6.nameAttr("PUBLIC", attributes8);
        boolean boolean10 = documentType4.hasSameValue((java.lang.Object) startTag6);
        int int11 = documentType4.siblingIndex();
        java.lang.String str13 = documentType4.attr("EndTag");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Document document45 = document44.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = document44.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = document44.siblingNodes();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder48 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.ParseSettings parseSettings52 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder48.parseFragment("", "", parseErrorList51, parseSettings52);
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings58 = xmlTreeBuilder57.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder57.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList62 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder63 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings64 = xmlTreeBuilder63.defaultSettings();
        xmlTreeBuilder57.initialiseParse("", "SYSTEM", parseErrorList62, parseSettings64);
        xmlTreeBuilder48.initialiseParse("Doctype", "PUBLIC", parseErrorList56, parseSettings64);
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder70 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList73 = null;
        org.jsoup.parser.ParseSettings parseSettings74 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList75 = xmlTreeBuilder70.parseFragment("", "", parseErrorList73, parseSettings74);
        org.jsoup.parser.ParseErrorList parseErrorList78 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder79 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings80 = xmlTreeBuilder79.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings81 = xmlTreeBuilder79.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList84 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder85 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings86 = xmlTreeBuilder85.defaultSettings();
        xmlTreeBuilder79.initialiseParse("", "SYSTEM", parseErrorList84, parseSettings86);
        xmlTreeBuilder70.initialiseParse("Doctype", "PUBLIC", parseErrorList78, parseSettings86);
        xmlTreeBuilder48.initialiseParse("EndTag", "<!---->", parseErrorList69, parseSettings86);
        org.jsoup.nodes.Document document92 = xmlTreeBuilder48.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Node node93 = document92.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node94 = document44.after(node93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(nodeList75);
        org.junit.Assert.assertNotNull(parseSettings80);
        org.junit.Assert.assertNotNull(parseSettings81);
        org.junit.Assert.assertNotNull(parseSettings86);
        org.junit.Assert.assertNotNull(document92);
        org.junit.Assert.assertNull(node93);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.finaliseTag();
        tag3.appendTagName('a');
        java.lang.String str7 = tag3.name();
        tag3.appendTagName('4');
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        java.lang.String str3 = endTag0.normalName;
        endTag0.appendTagName("EndTag");
        boolean boolean6 = endTag0.isDoctype();
        org.jsoup.parser.Token token7 = endTag0.reset();
        boolean boolean8 = token7.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment9 = token7.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        xmlTreeBuilder0.insert(doctype42);
        boolean boolean44 = doctype42.isStartTag();
        boolean boolean45 = doctype42.isComment();
        java.lang.Class<?> wildcardClass46 = doctype42.getClass();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = node5.equals(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemKeyword;
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
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parentNode();
        org.jsoup.nodes.Node node6 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("EndTag", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType19.siblingNodes();
        boolean boolean21 = documentType4.equals((java.lang.Object) documentType19);
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int27 = documentType26.childNodeSize();
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.parser.Token.StartTag startTag31 = startTag28.nameAttr("PUBLIC", attributes30);
        boolean boolean32 = documentType26.hasSameValue((java.lang.Object) startTag28);
        int int33 = documentType26.siblingIndex();
        java.lang.String str35 = documentType26.attr("EndTag");
        org.jsoup.parser.Token.Doctype doctype36 = new org.jsoup.parser.Token.Doctype();
        boolean boolean37 = doctype36.forceQuirks;
        java.lang.StringBuilder stringBuilder38 = doctype36.systemIdentifier;
        boolean boolean39 = doctype36.forceQuirks;
        doctype36.forceQuirks = false;
        java.lang.StringBuilder stringBuilder42 = doctype36.name;
        java.lang.Appendable appendable43 = documentType26.html((java.lang.Appendable) stringBuilder42);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = documentType19.before((org.jsoup.nodes.Node) documentType26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(startTag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(stringBuilder38);
        org.junit.Assert.assertEquals(stringBuilder38.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(appendable43);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        boolean boolean8 = documentType4.hasAttr("<<PUBLIC>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.before("<a>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parentNode();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = null;
        startTag6.attributes = attributes7;
        org.jsoup.parser.Token.Tag tag9 = startTag6.reset();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = startTag6.nameAttr("SYSTEM", attributes11);
        org.jsoup.parser.Token.Tag tag14 = startTag6.name("");
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag15.reset();
        boolean boolean17 = startTag15.isSelfClosing();
        org.jsoup.parser.Token.Tag tag19 = startTag15.name("a");
        org.jsoup.parser.Token.EndTag endTag20 = new org.jsoup.parser.Token.EndTag();
        endTag20.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag22 = endTag20.asEndTag();
        char[] charArray26 = new char[] { 'a', '#', ' ' };
        endTag20.appendAttributeValue(charArray26);
        startTag15.appendAttributeValue(charArray26);
        startTag6.appendAttributeValue(charArray26);
        boolean boolean30 = documentType4.hasSameValue((java.lang.Object) charArray26);
        org.jsoup.nodes.DocumentType documentType35 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node36 = documentType35.parent();
        org.jsoup.parser.Token.Doctype doctype37 = new org.jsoup.parser.Token.Doctype();
        boolean boolean38 = doctype37.forceQuirks;
        java.lang.String str39 = doctype37.tokenType();
        java.lang.StringBuilder stringBuilder40 = doctype37.systemIdentifier;
        boolean boolean41 = documentType35.equals((java.lang.Object) stringBuilder40);
        java.lang.String str42 = documentType35.toString();
        org.jsoup.nodes.Node node43 = documentType35.clone();
        org.jsoup.nodes.Node node44 = documentType35.clone();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(endTag22);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { 'a', '#', ' ' });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Doctype" + "'", str39, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder40);
        org.junit.Assert.assertEquals(stringBuilder40.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str42, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.Object obj7 = null;
        boolean boolean8 = documentType4.hasSameValue(obj7);
        org.jsoup.nodes.Document document9 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings14 = xmlTreeBuilder12.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder12.defaultSettings();
        org.jsoup.nodes.Document document18 = xmlTreeBuilder12.parse("PUBLIC", "hi!");
        org.jsoup.nodes.Node node20 = document18.removeAttr("PUBLIC");
        int int21 = document18.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.after((org.jsoup.nodes.Node) document18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        startTag0.appendAttributeValue(' ');
        char[] charArray9 = new char[] { ' ', '4', '#' };
        startTag0.appendAttributeValue(charArray9);
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.asStartTag();
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType14 = endTag13.type;
        org.jsoup.parser.Token.EndTag endTag15 = endTag13.asEndTag();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str21 = documentType20.outerHtml();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        endTag15.attributes = attributes22;
        org.jsoup.nodes.Attributes attributes24 = endTag15.getAttributes();
        org.jsoup.parser.Token.StartTag startTag25 = startTag0.nameAttr("hi!", attributes24);
        boolean boolean26 = startTag0.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment27 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '4', '#' });
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        java.lang.String str15 = documentType4.absUrl("PUBLIC");
        org.jsoup.nodes.Node node16 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node16.attr("<!---->", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Document document45 = document44.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = document44.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document45);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        xmlTreeBuilder0.initialiseParse("", "SYSTEM", parseErrorList5, parseSettings7);
        org.jsoup.parser.ParseSettings parseSettings9 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character12 = character10.data("hi!");
        java.lang.String str13 = character10.toString();
        org.jsoup.parser.Token.Character character15 = character10.data("");
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment18 = comment17.asComment();
        java.lang.String str19 = comment18.toString();
        java.lang.StringBuilder stringBuilder20 = comment18.data;
        xmlTreeBuilder0.insert(comment18);
        org.jsoup.nodes.Document document24 = xmlTreeBuilder0.parse("SYSTEM", "");
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node30 = documentType29.parent();
        org.jsoup.parser.Token.Doctype doctype31 = new org.jsoup.parser.Token.Doctype();
        boolean boolean32 = doctype31.forceQuirks;
        java.lang.String str33 = doctype31.tokenType();
        java.lang.StringBuilder stringBuilder34 = doctype31.systemIdentifier;
        boolean boolean35 = documentType29.equals((java.lang.Object) stringBuilder34);
        java.lang.String str36 = documentType29.toString();
        org.jsoup.parser.Token.Doctype doctype37 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str38 = doctype37.getSystemIdentifier();
        boolean boolean39 = doctype37.forceQuirks;
        java.lang.String str40 = doctype37.getPublicIdentifier();
        java.lang.String str41 = doctype37.getSystemIdentifier();
        boolean boolean42 = documentType29.equals((java.lang.Object) doctype37);
        java.lang.String str43 = documentType29.outerHtml();
        org.jsoup.nodes.Node node44 = documentType29.nextSibling();
        boolean boolean45 = document24.hasSameValue((java.lang.Object) documentType29);
        org.jsoup.nodes.Node node46 = documentType29.parentNode();
        org.jsoup.nodes.DocumentType documentType51 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int52 = documentType51.childNodeSize();
        java.lang.String str53 = documentType51.outerHtml();
        org.jsoup.parser.Token.Doctype doctype54 = new org.jsoup.parser.Token.Doctype();
        boolean boolean55 = doctype54.forceQuirks;
        doctype54.forceQuirks = false;
        java.lang.String str58 = doctype54.getName();
        java.lang.StringBuilder stringBuilder59 = doctype54.name;
        java.lang.StringBuilder stringBuilder60 = documentType51.html(stringBuilder59);
        org.jsoup.nodes.Node node61 = documentType51.nextSibling();
        org.jsoup.nodes.DocumentType documentType66 = new org.jsoup.nodes.DocumentType("EndTag", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList67 = documentType66.siblingNodes();
        boolean boolean68 = documentType51.equals((java.lang.Object) documentType66);
        int int69 = documentType51.siblingIndex();
        boolean boolean71 = documentType51.hasAttr("EndTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node72 = documentType29.before((org.jsoup.nodes.Node) documentType51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(character12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(character15);
        org.junit.Assert.assertNotNull(comment18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Doctype" + "'", str33, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str36, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str43, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str53, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(stringBuilder59);
        org.junit.Assert.assertEquals(stringBuilder59.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder60);
        org.junit.Assert.assertEquals(stringBuilder60.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNotNull(nodeList67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder11.defaultSettings();
        xmlTreeBuilder5.initialiseParse("", "SYSTEM", parseErrorList10, parseSettings12);
        xmlTreeBuilder0.initialiseParse("Comment", "Doctype", parseErrorList4, parseSettings12);
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str21 = documentType20.outerHtml();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        boolean boolean24 = xmlTreeBuilder0.processStartTag("EndTag", attributes23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder28.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder0.parseFragment("</SYSTEM>", "<PUBLIC>", parseErrorList27, parseSettings29);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder34.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder39.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder39.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder45.defaultSettings();
        xmlTreeBuilder39.initialiseParse("", "SYSTEM", parseErrorList44, parseSettings46);
        xmlTreeBuilder34.initialiseParse("Comment", "Doctype", parseErrorList38, parseSettings46);
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlTreeBuilder0.parseFragment("<!doctype hi! public \"hi!\">", "Character", parseErrorList33, parseSettings46);
        org.jsoup.parser.Token.Character character50 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(nodeList49);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Document document45 = document44.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = document44.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            document44.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(nodeList46);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        boolean boolean2 = startTag0.isSelfClosing();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("", "", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings14 = xmlTreeBuilder13.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder13.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        xmlTreeBuilder13.initialiseParse("", "SYSTEM", parseErrorList18, parseSettings20);
        xmlTreeBuilder4.initialiseParse("Doctype", "PUBLIC", parseErrorList12, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder26.parseFragment("", "", parseErrorList29, parseSettings30);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder35.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder41.defaultSettings();
        xmlTreeBuilder35.initialiseParse("", "SYSTEM", parseErrorList40, parseSettings42);
        xmlTreeBuilder26.initialiseParse("Doctype", "PUBLIC", parseErrorList34, parseSettings42);
        xmlTreeBuilder4.initialiseParse("EndTag", "<!---->", parseErrorList25, parseSettings42);
        org.jsoup.nodes.Document document48 = xmlTreeBuilder4.parse("<!---->", "SYSTEM");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder50.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder55.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder61 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings62 = xmlTreeBuilder61.defaultSettings();
        xmlTreeBuilder55.initialiseParse("", "SYSTEM", parseErrorList60, parseSettings62);
        xmlTreeBuilder50.initialiseParse("Comment", "Doctype", parseErrorList54, parseSettings62);
        org.jsoup.nodes.DocumentType documentType70 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str71 = documentType70.outerHtml();
        org.jsoup.nodes.Attributes attributes72 = documentType70.attributes();
        org.jsoup.nodes.Attributes attributes73 = documentType70.attributes();
        boolean boolean74 = xmlTreeBuilder50.processStartTag("EndTag", attributes73);
        boolean boolean75 = xmlTreeBuilder4.processStartTag("EndTag", attributes73);
        org.jsoup.parser.Token.StartTag startTag76 = startTag0.nameAttr("EndTag", attributes73);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment77 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str71, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes72);
        org.junit.Assert.assertNotNull(attributes73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(startTag76);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        java.lang.String str6 = documentType4.toString();
        boolean boolean8 = documentType4.hasAttr("Comment");
        java.lang.String str10 = documentType4.absUrl("EndTag");
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node16 = documentType15.parent();
        org.jsoup.parser.Token.Doctype doctype17 = new org.jsoup.parser.Token.Doctype();
        boolean boolean18 = doctype17.forceQuirks;
        java.lang.String str19 = doctype17.tokenType();
        java.lang.StringBuilder stringBuilder20 = doctype17.systemIdentifier;
        boolean boolean21 = documentType15.equals((java.lang.Object) stringBuilder20);
        int int22 = documentType15.siblingIndex();
        org.jsoup.nodes.Node node24 = documentType15.removeAttr("SYSTEM");
        org.jsoup.nodes.Node node26 = node24.removeAttr("a");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Doctype" + "'", str19, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.StartTag startTag6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = xmlTreeBuilder0.insert(startTag6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parentNode();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = null;
        startTag6.attributes = attributes7;
        org.jsoup.parser.Token.Tag tag9 = startTag6.reset();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = startTag6.nameAttr("SYSTEM", attributes11);
        org.jsoup.parser.Token.Tag tag14 = startTag6.name("");
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag15.reset();
        boolean boolean17 = startTag15.isSelfClosing();
        org.jsoup.parser.Token.Tag tag19 = startTag15.name("a");
        org.jsoup.parser.Token.EndTag endTag20 = new org.jsoup.parser.Token.EndTag();
        endTag20.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag22 = endTag20.asEndTag();
        char[] charArray26 = new char[] { 'a', '#', ' ' };
        endTag20.appendAttributeValue(charArray26);
        startTag15.appendAttributeValue(charArray26);
        startTag6.appendAttributeValue(charArray26);
        boolean boolean30 = documentType4.hasSameValue((java.lang.Object) charArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = documentType4.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(endTag22);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { 'a', '#', ' ' });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.isEOF();
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        comment4.bogus = true;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(comment4);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        boolean boolean2 = token1.isEndTag();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.parser.Token.Doctype doctype45 = new org.jsoup.parser.Token.Doctype();
        boolean boolean46 = doctype45.forceQuirks;
        java.lang.StringBuilder stringBuilder47 = doctype45.systemIdentifier;
        boolean boolean48 = doctype45.forceQuirks;
        org.jsoup.parser.Token token49 = doctype45.reset();
        xmlTreeBuilder0.insert(doctype45);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder51 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.ParseSettings parseSettings55 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder51.parseFragment("", "", parseErrorList54, parseSettings55);
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder60 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder60.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings62 = xmlTreeBuilder60.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList65 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder66 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings67 = xmlTreeBuilder66.defaultSettings();
        xmlTreeBuilder60.initialiseParse("", "SYSTEM", parseErrorList65, parseSettings67);
        xmlTreeBuilder51.initialiseParse("Doctype", "PUBLIC", parseErrorList59, parseSettings67);
        org.jsoup.parser.ParseErrorList parseErrorList72 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder73 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList76 = null;
        org.jsoup.parser.ParseSettings parseSettings77 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList78 = xmlTreeBuilder73.parseFragment("", "", parseErrorList76, parseSettings77);
        org.jsoup.parser.ParseErrorList parseErrorList81 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder82 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings83 = xmlTreeBuilder82.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings84 = xmlTreeBuilder82.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList87 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder88 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings89 = xmlTreeBuilder88.defaultSettings();
        xmlTreeBuilder82.initialiseParse("", "SYSTEM", parseErrorList87, parseSettings89);
        xmlTreeBuilder73.initialiseParse("Doctype", "PUBLIC", parseErrorList81, parseSettings89);
        xmlTreeBuilder51.initialiseParse("EndTag", "<!---->", parseErrorList72, parseSettings89);
        org.jsoup.parser.Token.Doctype doctype93 = new org.jsoup.parser.Token.Doctype();
        xmlTreeBuilder51.insert(doctype93);
        boolean boolean95 = doctype93.isStartTag();
        boolean boolean96 = doctype93.isComment();
        xmlTreeBuilder0.insert(doctype93);
        java.lang.StringBuilder stringBuilder98 = doctype93.systemIdentifier;
        boolean boolean99 = doctype93.isEndTag();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(token49);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(nodeList78);
        org.junit.Assert.assertNotNull(parseSettings83);
        org.junit.Assert.assertNotNull(parseSettings84);
        org.junit.Assert.assertNotNull(parseSettings89);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(stringBuilder98);
        org.junit.Assert.assertEquals(stringBuilder98.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes2 = null;
        tag1.attributes = attributes2;
        org.jsoup.parser.Token token4 = tag1.reset();
        tag1.finaliseTag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(token4);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.appendAttributeName("SYSTEM");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag4 = endTag0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = endTag2.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(endTag2);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        xmlTreeBuilder0.insert(doctype42);
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder47 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder47.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder47.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder53.defaultSettings();
        xmlTreeBuilder47.initialiseParse("", "SYSTEM", parseErrorList52, parseSettings54);
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder0.parseFragment("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", parseErrorList46, parseSettings54);
        org.jsoup.nodes.Document document59 = xmlTreeBuilder0.parse("#doctype", "EndTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node61 = document59.wrap("Character");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(document59);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder11.defaultSettings();
        xmlTreeBuilder5.initialiseParse("", "SYSTEM", parseErrorList10, parseSettings12);
        xmlTreeBuilder0.initialiseParse("Comment", "Doctype", parseErrorList4, parseSettings12);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character17 = character15.data("hi!");
        java.lang.String str18 = character17.toString();
        java.lang.String str19 = character17.getData();
        xmlTreeBuilder0.insert(character17);
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag23 = startTag22.reset();
        boolean boolean24 = startTag22.isSelfClosing();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder26.parseFragment("", "", parseErrorList29, parseSettings30);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder35.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder41.defaultSettings();
        xmlTreeBuilder35.initialiseParse("", "SYSTEM", parseErrorList40, parseSettings42);
        xmlTreeBuilder26.initialiseParse("Doctype", "PUBLIC", parseErrorList34, parseSettings42);
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder48 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.ParseSettings parseSettings52 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder48.parseFragment("", "", parseErrorList51, parseSettings52);
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings58 = xmlTreeBuilder57.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder57.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList62 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder63 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings64 = xmlTreeBuilder63.defaultSettings();
        xmlTreeBuilder57.initialiseParse("", "SYSTEM", parseErrorList62, parseSettings64);
        xmlTreeBuilder48.initialiseParse("Doctype", "PUBLIC", parseErrorList56, parseSettings64);
        xmlTreeBuilder26.initialiseParse("EndTag", "<!---->", parseErrorList47, parseSettings64);
        org.jsoup.nodes.Document document70 = xmlTreeBuilder26.parse("<!---->", "SYSTEM");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder72 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings73 = xmlTreeBuilder72.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList76 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder77 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings78 = xmlTreeBuilder77.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings79 = xmlTreeBuilder77.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList82 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder83 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings84 = xmlTreeBuilder83.defaultSettings();
        xmlTreeBuilder77.initialiseParse("", "SYSTEM", parseErrorList82, parseSettings84);
        xmlTreeBuilder72.initialiseParse("Comment", "Doctype", parseErrorList76, parseSettings84);
        org.jsoup.nodes.DocumentType documentType92 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str93 = documentType92.outerHtml();
        org.jsoup.nodes.Attributes attributes94 = documentType92.attributes();
        org.jsoup.nodes.Attributes attributes95 = documentType92.attributes();
        boolean boolean96 = xmlTreeBuilder72.processStartTag("EndTag", attributes95);
        boolean boolean97 = xmlTreeBuilder26.processStartTag("EndTag", attributes95);
        org.jsoup.parser.Token.StartTag startTag98 = startTag22.nameAttr("EndTag", attributes95);
        boolean boolean99 = xmlTreeBuilder0.processStartTag("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">", attributes95);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(character17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(document70);
        org.junit.Assert.assertNotNull(parseSettings73);
        org.junit.Assert.assertNotNull(parseSettings78);
        org.junit.Assert.assertNotNull(parseSettings79);
        org.junit.Assert.assertNotNull(parseSettings84);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str93, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes94);
        org.junit.Assert.assertNotNull(attributes95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertNotNull(startTag98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue("EndTag");
        endTag0.tagName = "<a>";
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.nodes.Attributes attributes1 = endTag0.getAttributes();
        boolean boolean2 = endTag0.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("a", "#doctype", "Comment", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str6 = documentType4.attr("#doctype");
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int12 = documentType11.childNodeSize();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = startTag13.nameAttr("PUBLIC", attributes15);
        boolean boolean17 = documentType11.hasSameValue((java.lang.Object) startTag13);
        int int18 = documentType11.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        java.lang.String str11 = documentType4.toString();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str13 = doctype12.getSystemIdentifier();
        boolean boolean14 = doctype12.forceQuirks;
        java.lang.String str15 = doctype12.getPublicIdentifier();
        java.lang.String str16 = doctype12.getSystemIdentifier();
        boolean boolean17 = documentType4.equals((java.lang.Object) doctype12);
        java.lang.String str18 = documentType4.outerHtml();
        boolean boolean20 = documentType4.hasAttr("a");
        org.jsoup.select.NodeVisitor nodeVisitor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.traverse(nodeVisitor21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.appendAttributeName("SYSTEM");
        endTag0.selfClosing = true;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node8 = node7.clone();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.clone();
        org.jsoup.nodes.Node node13 = documentType4.clone();
        java.lang.String str14 = documentType4.nodeName();
        int int15 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.after("<SYSTEM>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        java.lang.String str15 = documentType4.absUrl("PUBLIC");
        org.jsoup.nodes.Node node16 = documentType4.nextSibling();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder17.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder17.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings24 = xmlTreeBuilder23.defaultSettings();
        xmlTreeBuilder17.initialiseParse("", "SYSTEM", parseErrorList22, parseSettings24);
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder17.defaultSettings();
        org.jsoup.parser.Token.Character character27 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character29 = character27.data("hi!");
        java.lang.String str30 = character27.toString();
        org.jsoup.parser.Token.Character character32 = character27.data("");
        xmlTreeBuilder17.insert(character32);
        org.jsoup.parser.Token.Comment comment34 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment35 = comment34.asComment();
        java.lang.String str36 = comment35.toString();
        java.lang.StringBuilder stringBuilder37 = comment35.data;
        xmlTreeBuilder17.insert(comment35);
        org.jsoup.nodes.Document document41 = xmlTreeBuilder17.parse("SYSTEM", "");
        org.jsoup.nodes.DocumentType documentType46 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node47 = documentType46.parent();
        org.jsoup.parser.Token.Doctype doctype48 = new org.jsoup.parser.Token.Doctype();
        boolean boolean49 = doctype48.forceQuirks;
        java.lang.String str50 = doctype48.tokenType();
        java.lang.StringBuilder stringBuilder51 = doctype48.systemIdentifier;
        boolean boolean52 = documentType46.equals((java.lang.Object) stringBuilder51);
        java.lang.String str53 = documentType46.toString();
        org.jsoup.parser.Token.Doctype doctype54 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str55 = doctype54.getSystemIdentifier();
        boolean boolean56 = doctype54.forceQuirks;
        java.lang.String str57 = doctype54.getPublicIdentifier();
        java.lang.String str58 = doctype54.getSystemIdentifier();
        boolean boolean59 = documentType46.equals((java.lang.Object) doctype54);
        java.lang.String str60 = documentType46.outerHtml();
        org.jsoup.nodes.Node node61 = documentType46.nextSibling();
        boolean boolean62 = document41.hasSameValue((java.lang.Object) documentType46);
        org.jsoup.nodes.Node node63 = documentType46.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node64 = node16.before((org.jsoup.nodes.Node) documentType46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(character29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(character32);
        org.junit.Assert.assertNotNull(comment35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!---->" + "'", str36, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Doctype" + "'", str50, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str53, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str60, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(node63);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        java.lang.String str11 = documentType4.toString();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str13 = doctype12.getSystemIdentifier();
        boolean boolean14 = doctype12.forceQuirks;
        java.lang.String str15 = doctype12.getPublicIdentifier();
        java.lang.String str16 = doctype12.getSystemIdentifier();
        boolean boolean17 = documentType4.equals((java.lang.Object) doctype12);
        java.lang.String str18 = documentType4.outerHtml();
        boolean boolean20 = documentType4.hasAttr("a");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node22 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList23 = node22.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        java.lang.String str15 = documentType4.absUrl("PUBLIC");
        java.lang.String str16 = documentType4.outerHtml();
        int int17 = documentType4.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag1 = endTag0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType2 = org.jsoup.parser.Token.TokenType.EOF;
        doctype0.type = tokenType2;
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        boolean boolean7 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token8 = doctype0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment9 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        boolean boolean2 = token1.isComment();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        org.jsoup.nodes.Node node7 = documentType4.wrap("<!---->");
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("<EndTag  name=\"hi!\" publicId=\"hi!\" systemId=\"\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "StartTag", "<EndTag  name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
        java.lang.String str13 = documentType12.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        comment0.bogus = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag4 = comment0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        boolean boolean2 = startTag0.isSelfClosing();
        java.lang.Class<?> wildcardClass3 = startTag0.getClass();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("PUBLIC", "hi!");
        org.jsoup.nodes.Node node8 = document6.removeAttr("PUBLIC");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document6.siblingNodes();
        org.jsoup.nodes.Node node10 = document6.nextSibling();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node16 = documentType15.parent();
        org.jsoup.nodes.Node node17 = documentType15.nextSibling();
        java.lang.String str18 = documentType15.nodeName();
        org.jsoup.nodes.Document document19 = documentType15.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = document6.before((org.jsoup.nodes.Node) document19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#doctype" + "'", str18, "#doctype");
        org.junit.Assert.assertNull(document19);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        java.lang.String str15 = documentType4.absUrl("PUBLIC");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.siblingNodes();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node22 = documentType21.parent();
        org.jsoup.parser.Token.Doctype doctype23 = new org.jsoup.parser.Token.Doctype();
        boolean boolean24 = doctype23.forceQuirks;
        java.lang.String str25 = doctype23.tokenType();
        java.lang.StringBuilder stringBuilder26 = doctype23.systemIdentifier;
        boolean boolean27 = documentType21.equals((java.lang.Object) stringBuilder26);
        int int28 = documentType21.siblingIndex();
        org.jsoup.nodes.Node node30 = documentType21.removeAttr("SYSTEM");
        org.jsoup.nodes.Node node32 = node30.removeAttr("a");
        org.jsoup.nodes.Node node33 = node32.nextSibling();
        org.jsoup.nodes.Node node34 = node32.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = documentType4.after(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Doctype" + "'", str25, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.appendAttributeName("SYSTEM");
        boolean boolean4 = endTag0.isStartTag();
        endTag0.finaliseTag();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.appendAttributeName("SYSTEM");
        boolean boolean4 = endTag0.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str7 = documentType4.absUrl("a");
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int14 = documentType13.childNodeSize();
        java.lang.String str15 = documentType13.outerHtml();
        org.jsoup.parser.Token.Doctype doctype16 = new org.jsoup.parser.Token.Doctype();
        boolean boolean17 = doctype16.forceQuirks;
        doctype16.forceQuirks = false;
        java.lang.String str20 = doctype16.getName();
        java.lang.StringBuilder stringBuilder21 = doctype16.name;
        java.lang.StringBuilder stringBuilder22 = documentType13.html(stringBuilder21);
        java.lang.String str24 = documentType13.absUrl("PUBLIC");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType13.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.isEOF();
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        boolean boolean5 = comment0.bogus;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("hi!");
        java.lang.String str3 = character2.getData();
        org.jsoup.parser.Token token4 = character2.reset();
        boolean boolean5 = character2.isDoctype();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BogusComment;
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
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        boolean boolean2 = token1.isCharacter();
        boolean boolean3 = token1.isComment();
        org.jsoup.parser.Token.Comment comment4 = token1.asComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag5 = comment4.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(comment4);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.clone();
        org.jsoup.nodes.Node node13 = node12.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node12.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        xmlTreeBuilder0.insert(doctype42);
        boolean boolean44 = doctype42.isStartTag();
        boolean boolean45 = doctype42.isComment();
        boolean boolean46 = doctype42.forceQuirks;
        java.lang.StringBuilder stringBuilder47 = doctype42.name;
        boolean boolean48 = doctype42.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character49 = doctype42.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("SYSTEM", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("");
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag9.reset();
        boolean boolean11 = startTag9.isSelfClosing();
        org.jsoup.parser.Token.Tag tag13 = startTag9.name("a");
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        endTag14.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag16 = endTag14.asEndTag();
        char[] charArray20 = new char[] { 'a', '#', ' ' };
        endTag14.appendAttributeValue(charArray20);
        startTag9.appendAttributeValue(charArray20);
        startTag0.appendAttributeValue(charArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(endTag16);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'a', '#', ' ' });
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("comment", "EndTag", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        xmlTreeBuilder6.initialiseParse("", "SYSTEM", parseErrorList11, parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.Token.Character character16 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character18 = character16.data("hi!");
        java.lang.String str19 = character16.toString();
        org.jsoup.parser.Token.Character character21 = character16.data("");
        xmlTreeBuilder6.insert(character21);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment24 = comment23.asComment();
        java.lang.String str25 = comment24.toString();
        java.lang.StringBuilder stringBuilder26 = comment24.data;
        xmlTreeBuilder6.insert(comment24);
        org.jsoup.nodes.Document document30 = xmlTreeBuilder6.parse("SYSTEM", "");
        java.lang.String str31 = document30.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = documentType4.before((org.jsoup.nodes.Node) document30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(character18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(character21);
        org.junit.Assert.assertNotNull(comment24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "SYSTEM" + "'", str31, "SYSTEM");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.Token.Doctype doctype19 = new org.jsoup.parser.Token.Doctype();
        boolean boolean20 = doctype19.forceQuirks;
        doctype19.forceQuirks = false;
        java.lang.String str23 = doctype19.getName();
        java.lang.String str24 = doctype19.getName();
        boolean boolean25 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype19);
        org.jsoup.parser.Token token26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = xmlTreeBuilder0.process(token26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        java.lang.String str3 = endTag0.normalName;
        endTag0.appendTagName("EndTag");
        boolean boolean6 = endTag0.isDoctype();
        org.jsoup.nodes.Attributes attributes7 = endTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = startTag8.nameAttr("PUBLIC", attributes10);
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str18 = documentType17.outerHtml();
        org.jsoup.nodes.Attributes attributes19 = documentType17.attributes();
        org.jsoup.parser.Token.StartTag startTag20 = startTag8.nameAttr("Comment", attributes19);
        endTag0.attributes = attributes19;
        org.jsoup.parser.Token.EndTag endTag22 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType23 = endTag22.type;
        org.jsoup.parser.Token.EndTag endTag24 = endTag22.asEndTag();
        endTag24.tagName = "PUBLIC";
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag28 = startTag27.asStartTag();
        boolean boolean29 = startTag27.isEndTag();
        org.jsoup.parser.Token.Character character30 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character32 = character30.data("hi!");
        java.lang.String str33 = character32.getData();
        org.jsoup.parser.Token.Doctype doctype34 = new org.jsoup.parser.Token.Doctype();
        boolean boolean35 = doctype34.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType36 = doctype34.type;
        character32.type = tokenType36;
        startTag27.type = tokenType36;
        endTag24.type = tokenType36;
        endTag0.type = tokenType36;
        org.jsoup.nodes.Attributes attributes41 = endTag0.attributes;
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag24);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(character32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(attributes41);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "PUBLIC", "#doctype", "");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings9 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder6.parse("PUBLIC", "hi!");
        org.jsoup.nodes.Node node14 = document12.removeAttr("PUBLIC");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.after(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder10.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder10.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder16.defaultSettings();
        xmlTreeBuilder10.initialiseParse("", "SYSTEM", parseErrorList15, parseSettings17);
        xmlTreeBuilder5.initialiseParse("Comment", "Doctype", parseErrorList9, parseSettings17);
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str26 = documentType25.outerHtml();
        org.jsoup.nodes.Attributes attributes27 = documentType25.attributes();
        org.jsoup.nodes.Attributes attributes28 = documentType25.attributes();
        boolean boolean29 = xmlTreeBuilder5.processStartTag("EndTag", attributes28);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder5.parseFragment("Comment", "#doctype", parseErrorList32, parseSettings35);
        xmlTreeBuilder0.initialiseParse("Doctype", "EndTag", parseErrorList4, parseSettings35);
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.ParseSettings parseSettings45 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder41.parseFragment("", "", parseErrorList44, parseSettings45);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder50.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings52 = xmlTreeBuilder50.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder56.defaultSettings();
        xmlTreeBuilder50.initialiseParse("", "SYSTEM", parseErrorList55, parseSettings57);
        xmlTreeBuilder41.initialiseParse("Doctype", "PUBLIC", parseErrorList49, parseSettings57);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder0.parseFragment("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">", parseErrorList40, parseSettings57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(parseSettings57);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        endTag0.appendAttributeName("hi!");
        endTag0.appendTagName('#');
        endTag0.appendTagName("EndTag");
        java.lang.String str8 = endTag0.normalName;
        java.lang.String str9 = endTag0.name();
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#endtag" + "'", str8, "#endtag");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#EndTag" + "'", str9, "#EndTag");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        boolean boolean2 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag4 = startTag0.name("a");
        java.lang.String str5 = tag4.normalName;
        java.lang.String str6 = tag4.normalName;
        tag4.newAttribute();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document7.after("SYSTEM");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("a", "#doctype", "Comment", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        org.jsoup.nodes.Document document6 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document6.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str7 = documentType4.absUrl("PUBLIC");
        int int8 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.clone();
        org.jsoup.nodes.Node node13 = node12.clone();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder14.parseFragment("", "", parseErrorList17, parseSettings18);
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings24 = xmlTreeBuilder23.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings25 = xmlTreeBuilder23.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder29.defaultSettings();
        xmlTreeBuilder23.initialiseParse("", "SYSTEM", parseErrorList28, parseSettings30);
        xmlTreeBuilder14.initialiseParse("Doctype", "PUBLIC", parseErrorList22, parseSettings30);
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.ParseSettings parseSettings40 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder36.parseFragment("", "", parseErrorList39, parseSettings40);
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder45.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder45.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder51 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings52 = xmlTreeBuilder51.defaultSettings();
        xmlTreeBuilder45.initialiseParse("", "SYSTEM", parseErrorList50, parseSettings52);
        xmlTreeBuilder36.initialiseParse("Doctype", "PUBLIC", parseErrorList44, parseSettings52);
        xmlTreeBuilder14.initialiseParse("EndTag", "<!---->", parseErrorList35, parseSettings52);
        org.jsoup.nodes.Document document58 = xmlTreeBuilder14.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Node node59 = document58.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node60 = node12.after((org.jsoup.nodes.Node) document58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNull(node59);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str13 = documentType11.absUrl("#EndTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.after((org.jsoup.nodes.Node) documentType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str6 = documentType4.absUrl("#EndTag");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<PUBLIC>");
        org.jsoup.nodes.Document document7 = node6.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList8 = document7.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = startTag6.nameAttr("PUBLIC", attributes8);
        boolean boolean10 = documentType4.hasSameValue((java.lang.Object) startTag6);
        int int11 = documentType4.siblingIndex();
        java.lang.String str13 = documentType4.attr("EndTag");
        org.jsoup.nodes.Document document14 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = document14.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.nodes.Attributes attributes1 = endTag0.getAttributes();
        endTag0.newAttribute();
        org.junit.Assert.assertNull(attributes1);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("EndTag", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node7 = documentType4.wrap("<!doctype hi! public \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = node7.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.after("<Comment   name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        org.jsoup.nodes.Node node11 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = node11.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        int int11 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("SYSTEM");
        org.jsoup.nodes.Node node15 = node13.removeAttr("a");
        org.jsoup.nodes.Node node16 = node15.nextSibling();
        org.jsoup.nodes.Node node17 = node15.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node15.before("StartTag");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("PUBLIC", "hi!");
        org.jsoup.nodes.Node node8 = document6.removeAttr("PUBLIC");
        java.lang.String str9 = node8.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node8.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PUBLIC" + "'", str9, "PUBLIC");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "<a>", "<!---->", "EndTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.newAttribute();
        boolean boolean3 = endTag0.isCharacter();
        endTag0.selfClosing = true;
        boolean boolean6 = endTag0.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        boolean boolean2 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag4 = startTag0.name("a");
        java.lang.String str5 = tag4.normalName;
        tag4.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        xmlTreeBuilder0.initialiseParse("", "SYSTEM", parseErrorList5, parseSettings7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment10 = comment9.asComment();
        xmlTreeBuilder0.insert(comment9);
        boolean boolean12 = comment9.bogus;
        java.lang.StringBuilder stringBuilder13 = comment9.data;
        boolean boolean14 = comment9.isDoctype();
        java.lang.String str15 = comment9.toString();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendTagName('4');
        java.lang.Class<?> wildcardClass3 = endTag0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("PUBLIC", "hi!");
        org.jsoup.nodes.Node node8 = document6.removeAttr("PUBLIC");
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int14 = documentType13.childNodeSize();
        org.jsoup.nodes.Attributes attributes15 = documentType13.attributes();
        org.jsoup.nodes.Node node16 = documentType13.clone();
        org.jsoup.nodes.Node node17 = node16.clone();
        // The following exception was thrown during execution in test generation
        try {
            node8.replaceWith(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder11.defaultSettings();
        xmlTreeBuilder5.initialiseParse("", "SYSTEM", parseErrorList10, parseSettings12);
        xmlTreeBuilder0.initialiseParse("Comment", "Doctype", parseErrorList4, parseSettings12);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character17 = character15.data("hi!");
        java.lang.String str18 = character17.toString();
        java.lang.String str19 = character17.getData();
        xmlTreeBuilder0.insert(character17);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings25 = xmlTreeBuilder24.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        xmlTreeBuilder29.initialiseParse("", "SYSTEM", parseErrorList34, parseSettings36);
        xmlTreeBuilder24.initialiseParse("Comment", "Doctype", parseErrorList28, parseSettings36);
        xmlTreeBuilder0.initialiseParse("Doctype", "<!---->", parseErrorList23, parseSettings36);
        org.jsoup.nodes.Attributes attributes41 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = xmlTreeBuilder0.processStartTag("<EndTag  name=\"hi!\" publicId=\"hi!\" systemId=\"\">", attributes41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(character17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parseSettings36);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("a", "#doctype", "Comment", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.finaliseTag();
        tag3.appendTagName('a');
        tag3.appendAttributeValue("<!---->");
        tag3.newAttribute();
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(tag3);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node8 = node7.clone();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("", "", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder18.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder18.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings25 = xmlTreeBuilder24.defaultSettings();
        xmlTreeBuilder18.initialiseParse("", "SYSTEM", parseErrorList23, parseSettings25);
        xmlTreeBuilder9.initialiseParse("Doctype", "PUBLIC", parseErrorList17, parseSettings25);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.ParseSettings parseSettings35 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder31.parseFragment("", "", parseErrorList34, parseSettings35);
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder40.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder40.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder46.defaultSettings();
        xmlTreeBuilder40.initialiseParse("", "SYSTEM", parseErrorList45, parseSettings47);
        xmlTreeBuilder31.initialiseParse("Doctype", "PUBLIC", parseErrorList39, parseSettings47);
        xmlTreeBuilder9.initialiseParse("EndTag", "<!---->", parseErrorList30, parseSettings47);
        org.jsoup.nodes.Document document53 = xmlTreeBuilder9.parse("<!---->", "SYSTEM");
        org.jsoup.parser.Token.Doctype doctype54 = new org.jsoup.parser.Token.Doctype();
        boolean boolean55 = doctype54.forceQuirks;
        java.lang.StringBuilder stringBuilder56 = doctype54.systemIdentifier;
        boolean boolean57 = doctype54.forceQuirks;
        org.jsoup.parser.Token token58 = doctype54.reset();
        xmlTreeBuilder9.insert(doctype54);
        org.jsoup.nodes.Document document62 = xmlTreeBuilder9.parse("SYSTEM", "<a>");
        int int63 = document62.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            node8.replaceWith((org.jsoup.nodes.Node) document62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(stringBuilder56);
        org.junit.Assert.assertEquals(stringBuilder56.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(token58);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        startTag0.appendAttributeValue(' ');
        char[] charArray9 = new char[] { ' ', '4', '#' };
        startTag0.appendAttributeValue(charArray9);
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.asStartTag();
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType14 = endTag13.type;
        org.jsoup.parser.Token.EndTag endTag15 = endTag13.asEndTag();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str21 = documentType20.outerHtml();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        endTag15.attributes = attributes22;
        org.jsoup.nodes.Attributes attributes24 = endTag15.getAttributes();
        org.jsoup.parser.Token.StartTag startTag25 = startTag0.nameAttr("hi!", attributes24);
        org.jsoup.parser.Token.Tag tag26 = startTag25.reset();
        java.lang.String str27 = tag26.normalName();
        org.jsoup.nodes.DocumentType documentType32 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node33 = documentType32.parent();
        org.jsoup.parser.Token.Doctype doctype34 = new org.jsoup.parser.Token.Doctype();
        boolean boolean35 = doctype34.forceQuirks;
        java.lang.String str36 = doctype34.tokenType();
        java.lang.StringBuilder stringBuilder37 = doctype34.systemIdentifier;
        boolean boolean38 = documentType32.equals((java.lang.Object) stringBuilder37);
        java.lang.String str39 = documentType32.toString();
        org.jsoup.nodes.Node node40 = documentType32.clone();
        org.jsoup.nodes.Node node41 = documentType32.clone();
        org.jsoup.nodes.Document document42 = documentType32.ownerDocument();
        org.jsoup.nodes.Attributes attributes43 = documentType32.attributes();
        tag26.attributes = attributes43;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '4', '#' });
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Doctype" + "'", str36, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str39, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(document42);
        org.junit.Assert.assertNotNull(attributes43);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag1 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(tag3);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<PUBLIC>");
        org.jsoup.nodes.Document document7 = node6.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes8 = document7.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        startTag0.appendAttributeValue(' ');
        char[] charArray9 = new char[] { ' ', '4', '#' };
        startTag0.appendAttributeValue(charArray9);
        org.jsoup.parser.Token.Tag tag12 = startTag0.name("<!---->");
        boolean boolean13 = startTag0.isStartTag();
        startTag0.appendAttributeValue("<Comment   name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
        java.lang.String str16 = startTag0.tagName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '4', '#' });
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        boolean boolean2 = startTag0.isSelfClosing();
        boolean boolean3 = startTag0.isComment();
        boolean boolean4 = startTag0.isCharacter();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        java.lang.String str15 = documentType4.absUrl("PUBLIC");
        java.lang.String str16 = documentType4.outerHtml();
        int int17 = documentType4.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.before("PUBLIC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        org.jsoup.parser.Token.reset(stringBuilder6);
        org.jsoup.parser.Token.reset(stringBuilder6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("a", "#doctype", "Comment", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        org.jsoup.nodes.Document document6 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes7 = document6.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node7.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.nodes.Attributes attributes3 = endTag0.getAttributes();
        boolean boolean4 = endTag0.isComment();
        endTag0.selfClosing = true;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<PUBLIC>");
        node6.setBaseUri("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node6.after("#EndTag");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str11 = node9.absUrl("aa");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        java.lang.String str4 = startTag0.normalName;
        boolean boolean5 = startTag0.selfClosing;
        startTag0.setEmptyAttributeValue();
        boolean boolean7 = startTag0.selfClosing;
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("PUBLIC", "hi!");
        org.jsoup.nodes.Node node8 = document6.removeAttr("PUBLIC");
        int int9 = document6.siblingIndex();
        java.lang.String str10 = document6.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document6.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = document6.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PUBLIC" + "'", str10, "PUBLIC");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str7 = documentType4.absUrl("PUBLIC");
        int int8 = documentType4.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.after("<SYSTEM>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        org.jsoup.nodes.Attributes attributes4 = endTag0.attributes;
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "PUBLIC", "#doctype", "");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("SYSTEM");
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node12 = documentType11.parent();
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        boolean boolean14 = doctype13.forceQuirks;
        java.lang.String str15 = doctype13.tokenType();
        java.lang.StringBuilder stringBuilder16 = doctype13.systemIdentifier;
        boolean boolean17 = documentType11.equals((java.lang.Object) stringBuilder16);
        java.lang.String str18 = documentType11.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.after((org.jsoup.nodes.Node) documentType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Doctype" + "'", str15, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.normalName = "<!DOCTYPE hi! PUBLIC \"hi!\">";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CharacterReferenceInData;
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
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        boolean boolean2 = startTag0.isSelfClosing();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder4.parseFragment("", "", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings14 = xmlTreeBuilder13.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder13.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        xmlTreeBuilder13.initialiseParse("", "SYSTEM", parseErrorList18, parseSettings20);
        xmlTreeBuilder4.initialiseParse("Doctype", "PUBLIC", parseErrorList12, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder26.parseFragment("", "", parseErrorList29, parseSettings30);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder35.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder41.defaultSettings();
        xmlTreeBuilder35.initialiseParse("", "SYSTEM", parseErrorList40, parseSettings42);
        xmlTreeBuilder26.initialiseParse("Doctype", "PUBLIC", parseErrorList34, parseSettings42);
        xmlTreeBuilder4.initialiseParse("EndTag", "<!---->", parseErrorList25, parseSettings42);
        org.jsoup.nodes.Document document48 = xmlTreeBuilder4.parse("<!---->", "SYSTEM");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder50.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder55.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder61 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings62 = xmlTreeBuilder61.defaultSettings();
        xmlTreeBuilder55.initialiseParse("", "SYSTEM", parseErrorList60, parseSettings62);
        xmlTreeBuilder50.initialiseParse("Comment", "Doctype", parseErrorList54, parseSettings62);
        org.jsoup.nodes.DocumentType documentType70 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str71 = documentType70.outerHtml();
        org.jsoup.nodes.Attributes attributes72 = documentType70.attributes();
        org.jsoup.nodes.Attributes attributes73 = documentType70.attributes();
        boolean boolean74 = xmlTreeBuilder50.processStartTag("EndTag", attributes73);
        boolean boolean75 = xmlTreeBuilder4.processStartTag("EndTag", attributes73);
        org.jsoup.parser.Token.StartTag startTag76 = startTag0.nameAttr("EndTag", attributes73);
        java.lang.String str77 = startTag0.toString();
        int[] intArray84 = new int[] { (byte) 0, (short) -1, (short) 100, '4', (short) 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            startTag0.appendAttributeValue(intArray84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not a valid Unicode code point: 0xFFFFFFFF");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str71, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes72);
        org.junit.Assert.assertNotNull(attributes73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(startTag76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "<EndTag  name=\"hi!\" publicId=\"hi!\" systemId=\"\">" + "'", str77, "<EndTag  name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertArrayEquals(intArray84, new int[] { 0, (-1), 100, 52, 1, (-1) });
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node8 = node7.clone();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node7.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("comment", "EndTag", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes6 = node5.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType2 = org.jsoup.parser.Token.TokenType.EOF;
        doctype0.type = tokenType2;
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("EndTag", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType19.siblingNodes();
        boolean boolean21 = documentType4.equals((java.lang.Object) documentType19);
        int int22 = documentType4.siblingIndex();
        boolean boolean24 = documentType4.hasAttr("EndTag");
        java.lang.String str25 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int31 = documentType30.childNodeSize();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.parser.Token.StartTag startTag35 = startTag32.nameAttr("PUBLIC", attributes34);
        boolean boolean36 = documentType30.hasSameValue((java.lang.Object) startTag32);
        int int37 = documentType30.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str25, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str6 = documentType4.absUrl("#EndTag");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("EndTag", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType12.siblingNodes();
        int int14 = documentType12.siblingIndex();
        org.jsoup.nodes.Node node15 = documentType12.clone();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        xmlTreeBuilder0.initialiseParse("", "SYSTEM", parseErrorList5, parseSettings7);
        org.jsoup.parser.ParseSettings parseSettings9 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character12 = character10.data("hi!");
        java.lang.String str13 = character10.toString();
        org.jsoup.parser.Token.Character character15 = character10.data("");
        xmlTreeBuilder0.insert(character15);
        boolean boolean17 = character15.isComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment18 = character15.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(character12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(character15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Document document45 = document44.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = document44.childNodes();
        org.jsoup.nodes.Node node47 = document44.clone();
        org.jsoup.nodes.Node node50 = node47.attr("StartTag", "Doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node52 = node50.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        endTag0.appendAttributeName("hi!");
        endTag0.appendTagName('#');
        java.lang.String str6 = endTag0.toString();
        endTag0.appendTagName('#');
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</#>" + "'", str6, "</#>");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = startTag6.nameAttr("PUBLIC", attributes8);
        boolean boolean10 = documentType4.hasSameValue((java.lang.Object) startTag6);
        int int11 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "<!---->");
        org.jsoup.nodes.Document document15 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = document15.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        startTag0.appendAttributeValue(' ');
        char[] charArray9 = new char[] { ' ', '4', '#' };
        startTag0.appendAttributeValue(charArray9);
        org.jsoup.parser.Token.Tag tag12 = startTag0.name("<!---->");
        startTag0.appendAttributeValue("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">");
        startTag0.appendTagName('#');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '4', '#' });
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node6.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        java.lang.String str11 = documentType4.toString();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str13 = doctype12.getSystemIdentifier();
        boolean boolean14 = doctype12.forceQuirks;
        java.lang.String str15 = doctype12.getPublicIdentifier();
        java.lang.String str16 = doctype12.getSystemIdentifier();
        boolean boolean17 = documentType4.equals((java.lang.Object) doctype12);
        java.lang.String str18 = documentType4.outerHtml();
        boolean boolean20 = documentType4.hasAttr("a");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType4.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType4.before("PUBLIC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        int int11 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("SYSTEM");
        org.jsoup.nodes.Node node15 = node13.removeAttr("a");
        org.jsoup.nodes.Node node16 = node15.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = node16.attr("Character");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("EndTag", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.parser.Token.TokenType tokenType4 = tag3.type;
        org.jsoup.parser.Token.Tag tag6 = tag3.name("<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment7 = tag6.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag1 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        tag3.tagName = "</Character>";
        org.junit.Assert.assertNotNull(startTag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(tag3);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.isEOF();
        boolean boolean4 = comment0.isComment();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        boolean boolean2 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag4 = startTag0.name("a");
        java.lang.String str5 = tag4.tagName;
        java.lang.String str6 = tag4.tokenType();
        java.lang.Class<?> wildcardClass7 = tag4.getClass();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        org.jsoup.nodes.Node node14 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node14.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("comment", "EndTag", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        org.jsoup.nodes.Document document6 = documentType4.ownerDocument();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder11.defaultSettings();
        xmlTreeBuilder5.initialiseParse("", "SYSTEM", parseErrorList10, parseSettings12);
        xmlTreeBuilder0.initialiseParse("Comment", "Doctype", parseErrorList4, parseSettings12);
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str21 = documentType20.outerHtml();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        boolean boolean24 = xmlTreeBuilder0.processStartTag("EndTag", attributes23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder28.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder28.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder34.defaultSettings();
        xmlTreeBuilder28.initialiseParse("", "SYSTEM", parseErrorList33, parseSettings35);
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder40.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder45.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder45.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder51 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings52 = xmlTreeBuilder51.defaultSettings();
        xmlTreeBuilder45.initialiseParse("", "SYSTEM", parseErrorList50, parseSettings52);
        xmlTreeBuilder40.initialiseParse("Comment", "Doctype", parseErrorList44, parseSettings52);
        org.jsoup.parser.Token.Character character55 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character57 = character55.data("hi!");
        java.lang.String str58 = character57.toString();
        java.lang.String str59 = character57.getData();
        xmlTreeBuilder40.insert(character57);
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder64 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings65 = xmlTreeBuilder64.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings66 = xmlTreeBuilder64.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder70 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings71 = xmlTreeBuilder70.defaultSettings();
        xmlTreeBuilder64.initialiseParse("", "SYSTEM", parseErrorList69, parseSettings71);
        org.jsoup.parser.ParseSettings parseSettings73 = xmlTreeBuilder64.defaultSettings();
        org.jsoup.parser.Token.Character character74 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character76 = character74.data("hi!");
        java.lang.String str77 = character74.toString();
        org.jsoup.parser.Token.Character character79 = character74.data("");
        xmlTreeBuilder64.insert(character79);
        org.jsoup.parser.ParseErrorList parseErrorList83 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder84 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings85 = xmlTreeBuilder84.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings86 = xmlTreeBuilder84.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings87 = xmlTreeBuilder84.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList88 = xmlTreeBuilder64.parseFragment("<SYSTEM>", "<a>", parseErrorList83, parseSettings87);
        java.util.List<org.jsoup.nodes.Node> nodeList89 = xmlTreeBuilder40.parseFragment("<a>", "Character", parseErrorList63, parseSettings87);
        java.util.List<org.jsoup.nodes.Node> nodeList90 = xmlTreeBuilder28.parseFragment("StartTag", "Character", parseErrorList39, parseSettings87);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList91 = xmlTreeBuilder0.parseFragment("<!DOCTYPE EndTag PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!---->", parseErrorList27, parseSettings87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(character57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNotNull(parseSettings66);
        org.junit.Assert.assertNotNull(parseSettings71);
        org.junit.Assert.assertNotNull(parseSettings73);
        org.junit.Assert.assertNotNull(character76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertNotNull(character79);
        org.junit.Assert.assertNotNull(parseSettings85);
        org.junit.Assert.assertNotNull(parseSettings86);
        org.junit.Assert.assertNotNull(parseSettings87);
        org.junit.Assert.assertNotNull(nodeList88);
        org.junit.Assert.assertNotNull(nodeList89);
        org.junit.Assert.assertNotNull(nodeList90);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token token6 = doctype0.reset();
        boolean boolean7 = doctype0.isForceQuirks();
        boolean boolean8 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isEndTag();
        java.lang.String str2 = endTag0.tagName;
        endTag0.appendAttributeValue("PUBLIC");
        endTag0.normalName = "";
        java.lang.String str7 = endTag0.normalName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        endTag0.tagName = "";
        org.jsoup.parser.Token token5 = endTag0.reset();
        org.jsoup.parser.Token.EndTag endTag6 = token5.asEndTag();
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(endTag6);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag1 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        startTag0.appendTagName("hi!");
        startTag0.normalName = "SYSTEM";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment7 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag1);
        org.junit.Assert.assertNotNull(tag2);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        startTag0.appendAttributeValue(' ');
        char[] charArray9 = new char[] { ' ', '4', '#' };
        startTag0.appendAttributeValue(charArray9);
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.asStartTag();
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType14 = endTag13.type;
        org.jsoup.parser.Token.EndTag endTag15 = endTag13.asEndTag();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str21 = documentType20.outerHtml();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        endTag15.attributes = attributes22;
        org.jsoup.nodes.Attributes attributes24 = endTag15.getAttributes();
        org.jsoup.parser.Token.StartTag startTag25 = startTag0.nameAttr("hi!", attributes24);
        org.jsoup.parser.Token.Tag tag26 = startTag25.reset();
        java.lang.String str27 = tag26.normalName();
        tag26.normalName = "Comment";
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '4', '#' });
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("PUBLIC", "hi!");
        org.jsoup.nodes.Document document9 = xmlTreeBuilder0.parse("hi!", "<!---->");
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings14 = xmlTreeBuilder13.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder13.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        xmlTreeBuilder13.initialiseParse("", "SYSTEM", parseErrorList18, parseSettings20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlTreeBuilder0.parseFragment("<<PUBLIC>>", "<EndTag  name=\"hi!\" publicId=\"hi!\" systemId=\"\">", parseErrorList12, parseSettings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings20);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        xmlTreeBuilder0.initialiseParse("", "SYSTEM", parseErrorList5, parseSettings7);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character11 = character9.data("hi!");
        java.lang.String str12 = character9.getData();
        xmlTreeBuilder0.insert(character9);
        java.lang.String str14 = character9.toString();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        xmlTreeBuilder6.initialiseParse("", "SYSTEM", parseErrorList11, parseSettings13);
        org.jsoup.parser.Token.Comment comment15 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment16 = comment15.asComment();
        xmlTreeBuilder6.insert(comment15);
        xmlTreeBuilder0.insert(comment15);
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str21 = startTag20.normalName;
        startTag20.normalName = "<!DOCTYPE hi! PUBLIC \"hi!\">";
        org.jsoup.parser.Token.Tag tag24 = startTag20.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = xmlTreeBuilder0.insert(startTag20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(comment16);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(tag24);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("EndTag", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType19.siblingNodes();
        boolean boolean21 = documentType4.equals((java.lang.Object) documentType19);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType4.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = documentType4.after("<!DOCTYPE EndTag PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        boolean boolean4 = doctype0.isDoctype();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment1 = comment0.asComment();
        java.lang.StringBuilder stringBuilder2 = comment1.data;
        comment1.bogus = true;
        boolean boolean5 = comment1.bogus;
        java.lang.Class<?> wildcardClass6 = comment1.getClass();
        org.junit.Assert.assertNotNull(comment1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        boolean boolean9 = documentType4.hasAttr("SYSTEM");
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment11 = comment10.asComment();
        org.jsoup.parser.Token token12 = comment11.reset();
        org.jsoup.parser.Token token13 = comment11.reset();
        boolean boolean14 = documentType4.hasSameValue((java.lang.Object) comment11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(comment11);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        boolean boolean3 = endTag2.isComment();
        java.lang.String str4 = endTag2.normalName();
        endTag2.appendAttributeName("a");
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Document document45 = document44.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = document44.childNodes();
        org.jsoup.nodes.Node node47 = document44.clone();
        org.jsoup.nodes.Node node50 = node47.attr("StartTag", "Doctype");
        org.jsoup.nodes.DocumentType documentType55 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int56 = documentType55.childNodeSize();
        java.lang.String str57 = documentType55.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            node47.replaceWith((org.jsoup.nodes.Node) documentType55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str57, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        boolean boolean2 = startTag0.isSelfClosing();
        boolean boolean3 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        tag4.selfClosing = true;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder11.defaultSettings();
        xmlTreeBuilder5.initialiseParse("", "SYSTEM", parseErrorList10, parseSettings12);
        xmlTreeBuilder0.initialiseParse("Comment", "Doctype", parseErrorList4, parseSettings12);
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str21 = documentType20.outerHtml();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        boolean boolean24 = xmlTreeBuilder0.processStartTag("EndTag", attributes23);
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str30 = documentType29.outerHtml();
        org.jsoup.nodes.Attributes attributes31 = documentType29.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType29.childNodes();
        boolean boolean34 = documentType29.hasAttr("SYSTEM");
        org.jsoup.parser.Token.Comment comment35 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment36 = comment35.asComment();
        org.jsoup.parser.Token token37 = comment36.reset();
        org.jsoup.parser.Token token38 = comment36.reset();
        boolean boolean39 = documentType29.hasSameValue((java.lang.Object) comment36);
        xmlTreeBuilder0.insert(comment36);
        org.jsoup.parser.Token token41 = comment36.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag42 = token41.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str30, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(comment36);
        org.junit.Assert.assertNotNull(token37);
        org.junit.Assert.assertNotNull(token38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(token41);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.parser.Token.TokenType tokenType4 = tag3.type;
        tag3.appendAttributeValue('a');
        boolean boolean7 = tag3.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = tag3.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment1 = comment0.asComment();
        comment0.bogus = true;
        org.junit.Assert.assertNotNull(comment1);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str7 = documentType4.absUrl("a");
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("SYSTEM", "<a>", "<!---->", "EndTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.before((org.jsoup.nodes.Node) documentType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str9 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.AfterHead;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag1 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag1.reset();
        boolean boolean3 = startTag1.isComment();
        startTag1.newAttribute();
        org.junit.Assert.assertNotNull(startTag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment1 = comment0.asComment();
        java.lang.String str2 = comment1.toString();
        java.lang.StringBuilder stringBuilder3 = comment1.data;
        comment1.bogus = false;
        java.lang.String str6 = comment1.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag7 = comment1.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comment1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        boolean boolean2 = endTag0.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        xmlTreeBuilder0.initialiseParse("", "SYSTEM", parseErrorList5, parseSettings7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment10 = comment9.asComment();
        xmlTreeBuilder0.insert(comment9);
        boolean boolean12 = comment9.bogus;
        java.lang.StringBuilder stringBuilder13 = comment9.data;
        boolean boolean14 = comment9.bogus;
        java.lang.StringBuilder stringBuilder15 = comment9.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag16 = comment9.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes2 = null;
        tag1.attributes = attributes2;
        org.jsoup.nodes.DocumentType documentType8 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int9 = documentType8.childNodeSize();
        org.jsoup.nodes.Attributes attributes10 = documentType8.attributes();
        tag1.attributes = attributes10;
        boolean boolean12 = tag1.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment13 = tag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes6 = node5.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        startTag0.selfClosing = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype6 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str7 = documentType4.absUrl("PUBLIC");
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "PUBLIC", "#doctype", "");
        org.jsoup.nodes.Node node15 = documentType13.removeAttr("SYSTEM");
        org.jsoup.nodes.Node node18 = node15.attr("<a>", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.before(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int14 = documentType13.childNodeSize();
        java.lang.String str16 = documentType13.absUrl("PUBLIC");
        int int17 = documentType13.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node8.before((org.jsoup.nodes.Node) documentType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.normalName = "<!DOCTYPE hi! PUBLIC \"hi!\">";
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str10 = documentType9.outerHtml();
        org.jsoup.nodes.Attributes attributes11 = documentType9.attributes();
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.nameAttr("<!DOCTYPE hi! PUBLIC \"hi!\">", attributes11);
        java.lang.String str13 = startTag12.normalName;
        startTag12.setEmptyAttributeValue();
        startTag12.finaliseTag();
        org.jsoup.parser.Token.Tag tag16 = startTag12.reset();
        tag16.appendAttributeValue('4');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!doctype hi! public \"hi!\">" + "'", str13, "<!doctype hi! public \"hi!\">");
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.Token.Doctype doctype19 = new org.jsoup.parser.Token.Doctype();
        boolean boolean20 = doctype19.forceQuirks;
        doctype19.forceQuirks = false;
        java.lang.String str23 = doctype19.getName();
        java.lang.String str24 = doctype19.getName();
        boolean boolean25 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype19);
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = startTag26.nameAttr("PUBLIC", attributes28);
        startTag26.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag32 = startTag26.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element33 = xmlTreeBuilder0.insert(startTag26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertNotNull(tag32);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        startTag0.appendAttributeValue(' ');
        char[] charArray9 = new char[] { ' ', '4', '#' };
        startTag0.appendAttributeValue(charArray9);
        org.jsoup.parser.Token.Tag tag12 = startTag0.name("<!---->");
        org.jsoup.parser.Token.Tag tag13 = startTag0.reset();
        tag13.appendAttributeValue('#');
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag17 = startTag16.reset();
        startTag16.newAttribute();
        startTag16.appendTagName("SYSTEM");
        org.jsoup.parser.Token.TokenType tokenType21 = startTag16.type;
        tag13.type = tokenType21;
        boolean boolean23 = tag13.isStartTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '4', '#' });
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("comment", "EndTag", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlTreeBuilder6.parseFragment("", "", parseErrorList9, parseSettings10);
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder15.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder21.defaultSettings();
        xmlTreeBuilder15.initialiseParse("", "SYSTEM", parseErrorList20, parseSettings22);
        xmlTreeBuilder6.initialiseParse("Doctype", "PUBLIC", parseErrorList14, parseSettings22);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder28.parseFragment("", "", parseErrorList31, parseSettings32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings39 = xmlTreeBuilder37.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder43 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder43.defaultSettings();
        xmlTreeBuilder37.initialiseParse("", "SYSTEM", parseErrorList42, parseSettings44);
        xmlTreeBuilder28.initialiseParse("Doctype", "PUBLIC", parseErrorList36, parseSettings44);
        xmlTreeBuilder6.initialiseParse("EndTag", "<!---->", parseErrorList27, parseSettings44);
        org.jsoup.nodes.Document document50 = xmlTreeBuilder6.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Document document51 = document50.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = document50.childNodes();
        org.jsoup.parser.Token.Doctype doctype53 = new org.jsoup.parser.Token.Doctype();
        boolean boolean54 = doctype53.forceQuirks;
        java.lang.String str55 = doctype53.tokenType();
        java.lang.StringBuilder stringBuilder56 = doctype53.systemIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder56);
        java.lang.StringBuilder stringBuilder58 = document50.html(stringBuilder56);
        // The following exception was thrown during execution in test generation
        try {
            node5.replaceWith((org.jsoup.nodes.Node) document50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Doctype" + "'", str55, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder56);
        org.junit.Assert.assertEquals(stringBuilder56.toString(), "\n<!---->");
        org.junit.Assert.assertNotNull(stringBuilder58);
        org.junit.Assert.assertEquals(stringBuilder58.toString(), "\n<!---->");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.tokenType();
        doctype0.forceQuirks = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag7 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        int int11 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("SYSTEM");
        org.jsoup.nodes.Node node15 = node13.removeAttr("a");
        org.jsoup.nodes.Node node16 = node15.nextSibling();
        org.jsoup.nodes.Node node17 = node15.clone();
        int int18 = node17.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = document8.attr("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        startTag0.appendAttributeValue(' ');
        char[] charArray9 = new char[] { ' ', '4', '#' };
        startTag0.appendAttributeValue(charArray9);
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.asStartTag();
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType14 = endTag13.type;
        org.jsoup.parser.Token.EndTag endTag15 = endTag13.asEndTag();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str21 = documentType20.outerHtml();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        endTag15.attributes = attributes22;
        org.jsoup.nodes.Attributes attributes24 = endTag15.getAttributes();
        org.jsoup.parser.Token.StartTag startTag25 = startTag0.nameAttr("hi!", attributes24);
        boolean boolean26 = startTag0.isStartTag();
        org.jsoup.parser.Token token27 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character28 = token27.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '4', '#' });
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(token27);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "PUBLIC", "#doctype", "");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("SYSTEM");
        boolean boolean8 = node6.hasAttr("<a>");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("comment", "EndTag", "#doctype", "SYSTEM");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.Initial;
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag();
        endTag1.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag3 = endTag1.asEndTag();
        boolean boolean4 = endTag3.isComment();
        java.lang.String str5 = endTag3.normalName();
        endTag3.appendAttributeValue('4');
        org.jsoup.parser.Token.Tag tag9 = endTag3.name("#endtag");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) tag9, htmlTreeBuilder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(endTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("a", "#doctype", "Comment", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<a>", "", "#EndTag", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parentNode();
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node13 = documentType12.parent();
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        boolean boolean15 = doctype14.forceQuirks;
        java.lang.String str16 = doctype14.tokenType();
        java.lang.StringBuilder stringBuilder17 = doctype14.systemIdentifier;
        boolean boolean18 = documentType12.equals((java.lang.Object) stringBuilder17);
        java.lang.String str19 = documentType12.toString();
        org.jsoup.parser.Token.Doctype doctype20 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str21 = doctype20.getSystemIdentifier();
        boolean boolean22 = doctype20.forceQuirks;
        java.lang.String str23 = doctype20.getPublicIdentifier();
        java.lang.String str24 = doctype20.getSystemIdentifier();
        boolean boolean25 = documentType12.equals((java.lang.Object) doctype20);
        java.lang.String str26 = documentType12.outerHtml();
        boolean boolean28 = documentType12.hasAttr("a");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType12.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = document7.hasSameValue((java.lang.Object) documentType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Doctype" + "'", str16, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("PUBLIC", "hi!");
        org.jsoup.nodes.Node node8 = document6.removeAttr("PUBLIC");
        int int9 = document6.siblingIndex();
        java.lang.String str10 = document6.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document6.childNodes();
        org.jsoup.nodes.Node node12 = document6.clone();
        org.jsoup.nodes.Node node14 = node12.childNode(0);
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int20 = documentType19.childNodeSize();
        org.jsoup.nodes.Attributes attributes21 = documentType19.attributes();
        org.jsoup.nodes.Node node22 = documentType19.clone();
        // The following exception was thrown during execution in test generation
        try {
            node12.replaceWith((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PUBLIC" + "'", str10, "PUBLIC");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        xmlTreeBuilder6.initialiseParse("", "SYSTEM", parseErrorList11, parseSettings13);
        org.jsoup.parser.Token.Comment comment15 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment16 = comment15.asComment();
        xmlTreeBuilder6.insert(comment15);
        xmlTreeBuilder0.insert(comment15);
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Doctype doctype20 = new org.jsoup.parser.Token.Doctype();
        boolean boolean21 = doctype20.forceQuirks;
        java.lang.StringBuilder stringBuilder22 = doctype20.systemIdentifier;
        boolean boolean23 = doctype20.forceQuirks;
        doctype20.forceQuirks = false;
        doctype20.forceQuirks = true;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(comment16);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.parser.Token.Doctype doctype45 = new org.jsoup.parser.Token.Doctype();
        boolean boolean46 = doctype45.forceQuirks;
        java.lang.StringBuilder stringBuilder47 = doctype45.systemIdentifier;
        boolean boolean48 = doctype45.forceQuirks;
        org.jsoup.parser.Token token49 = doctype45.reset();
        xmlTreeBuilder0.insert(doctype45);
        boolean boolean51 = doctype45.isEOF();
        boolean boolean52 = doctype45.isForceQuirks();
        java.lang.String str53 = doctype45.getSystemIdentifier();
        java.lang.String str54 = doctype45.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType55 = doctype45.type;
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(token49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + tokenType55 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType55.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.clone();
        org.jsoup.nodes.Node node13 = node12.clone();
        org.jsoup.nodes.Node node14 = node13.nextSibling();
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        xmlTreeBuilder0.insert(doctype42);
        boolean boolean44 = doctype42.isStartTag();
        org.jsoup.parser.Token token45 = doctype42.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character46 = doctype42.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(token45);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        boolean boolean4 = doctype0.isDoctype();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPublicIdentifier();
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
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("a", "#doctype", "Comment", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node11 = documentType10.parentNode();
        org.jsoup.nodes.Node node12 = documentType10.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            node5.replaceWith((org.jsoup.nodes.Node) documentType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("EndTag", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node7 = documentType4.wrap("<!doctype hi! public \"hi!\">");
        int int8 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType2 = org.jsoup.parser.Token.TokenType.EOF;
        doctype0.type = tokenType2;
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag3 = startTag2.reset();
        boolean boolean4 = startTag2.isSelfClosing();
        org.jsoup.parser.Token.Tag tag6 = startTag2.name("a");
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag9 = endTag7.asEndTag();
        char[] charArray13 = new char[] { 'a', '#', ' ' };
        endTag7.appendAttributeValue(charArray13);
        startTag2.appendAttributeValue(charArray13);
        endTag0.appendAttributeValue(charArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = endTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(endTag9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { 'a', '#', ' ' });
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag1 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag1.reset();
        boolean boolean3 = startTag1.isComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = startTag1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.finaliseTag();
        tag3.appendTagName('a');
        tag3.selfClosing = false;
        tag3.appendAttributeName("<<PUBLIC>>");
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(tag3);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        endTag0.appendAttributeName("hi!");
        endTag0.appendTagName('#');
        java.lang.String str6 = endTag0.toString();
        endTag0.setEmptyAttributeValue();
        endTag0.tagName = "StartTag";
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</#>" + "'", str6, "</#>");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.newAttribute();
        boolean boolean3 = endTag0.isCharacter();
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag();
        endTag6.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag8 = endTag6.asEndTag();
        char[] charArray12 = new char[] { 'a', '#', ' ' };
        endTag6.appendAttributeValue(charArray12);
        endTag0.appendAttributeValue(charArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag15 = endTag0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(endTag8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { 'a', '#', ' ' });
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.newAttribute();
        endTag0.tagName = "PUBLIC";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment5 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder11.defaultSettings();
        xmlTreeBuilder5.initialiseParse("", "SYSTEM", parseErrorList10, parseSettings12);
        xmlTreeBuilder0.initialiseParse("Comment", "Doctype", parseErrorList4, parseSettings12);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character17 = character15.data("hi!");
        java.lang.String str18 = character17.toString();
        java.lang.String str19 = character17.getData();
        xmlTreeBuilder0.insert(character17);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings25 = xmlTreeBuilder24.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        xmlTreeBuilder29.initialiseParse("", "SYSTEM", parseErrorList34, parseSettings36);
        xmlTreeBuilder24.initialiseParse("Comment", "Doctype", parseErrorList28, parseSettings36);
        xmlTreeBuilder0.initialiseParse("Doctype", "<!---->", parseErrorList23, parseSettings36);
        org.jsoup.parser.Token.Comment comment40 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment41 = comment40.asComment();
        java.lang.String str42 = comment40.getData();
        java.lang.StringBuilder stringBuilder43 = comment40.data;
        xmlTreeBuilder0.insert(comment40);
        org.jsoup.parser.Token.Character character45 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character47 = character45.data("hi!");
        xmlTreeBuilder0.insert(character47);
        org.jsoup.parser.Token.Character character49 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character51 = character49.data("hi!");
        java.lang.String str52 = character51.getData();
        org.jsoup.parser.Token.Character character54 = character51.data("");
        org.jsoup.parser.Token.Character character56 = character51.data("<!doctype hi! public \"hi!\">");
        org.jsoup.parser.Token.Character character58 = character51.data("comment");
        xmlTreeBuilder0.insert(character58);
        org.jsoup.parser.Token.Comment comment60 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(character17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(comment41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals(stringBuilder43.toString(), "");
        org.junit.Assert.assertNotNull(character47);
        org.junit.Assert.assertNotNull(character51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(character54);
        org.junit.Assert.assertNotNull(character56);
        org.junit.Assert.assertNotNull(character58);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.ParseSettings parseSettings49 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder45.parseFragment("", "", parseErrorList48, parseSettings49);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder51 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings52 = xmlTreeBuilder51.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings53 = xmlTreeBuilder51.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings58 = xmlTreeBuilder57.defaultSettings();
        xmlTreeBuilder51.initialiseParse("", "SYSTEM", parseErrorList56, parseSettings58);
        org.jsoup.parser.Token.Comment comment60 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment61 = comment60.asComment();
        xmlTreeBuilder51.insert(comment60);
        xmlTreeBuilder45.insert(comment60);
        xmlTreeBuilder0.insert(comment60);
        org.jsoup.parser.Token.StartTag startTag65 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str66 = startTag65.normalName;
        startTag65.normalName = "<!DOCTYPE hi! PUBLIC \"hi!\">";
        org.jsoup.nodes.DocumentType documentType74 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str75 = documentType74.outerHtml();
        org.jsoup.nodes.Attributes attributes76 = documentType74.attributes();
        org.jsoup.parser.Token.StartTag startTag77 = startTag65.nameAttr("<!DOCTYPE hi! PUBLIC \"hi!\">", attributes76);
        org.jsoup.nodes.Element element78 = xmlTreeBuilder0.insert(startTag65);
        org.jsoup.parser.Token.Character character79 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character81 = character79.data("hi!");
        java.lang.String str82 = character81.toString();
        xmlTreeBuilder0.insert(character81);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(comment61);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str75, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes76);
        org.junit.Assert.assertNotNull(startTag77);
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertNotNull(character81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        java.lang.String str1 = endTag0.tagName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.Object obj7 = null;
        boolean boolean8 = documentType4.hasSameValue(obj7);
        org.jsoup.nodes.Document document9 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes11 = node10.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isEndTag();
        boolean boolean2 = endTag0.isComment();
        org.jsoup.parser.Token.EndTag endTag3 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType4 = endTag3.type;
        org.jsoup.parser.Token.EndTag endTag5 = endTag3.asEndTag();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str11 = documentType10.outerHtml();
        org.jsoup.nodes.Attributes attributes12 = documentType10.attributes();
        endTag5.attributes = attributes12;
        org.jsoup.nodes.Attributes attributes14 = endTag5.getAttributes();
        endTag0.attributes = attributes14;
        endTag0.appendAttributeValue("<!DOCTYPE hi! PUBLIC \"hi!\">");
        endTag0.setEmptyAttributeValue();
        boolean boolean19 = endTag0.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        boolean boolean2 = startTag0.isSelfClosing();
        startTag0.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment4 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("hi!");
        java.lang.String str3 = character2.toString();
        java.lang.String str4 = character2.getData();
        org.jsoup.parser.Token.Character character6 = character2.data("");
        org.jsoup.parser.Token token7 = character6.reset();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("PUBLIC");
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE EndTag PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CommentEndBang;
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
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("hi!");
        java.lang.String str3 = character2.getData();
        org.jsoup.parser.Token.Character character5 = character2.data("");
        org.jsoup.parser.Token.Character character7 = character2.data("<!doctype hi! public \"hi!\">");
        org.jsoup.parser.Token.Character character9 = character2.data("comment");
        org.jsoup.parser.Token.Character character11 = character2.data("</#>");
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertNotNull(character11);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        xmlTreeBuilder0.initialiseParse("", "SYSTEM", parseErrorList5, parseSettings7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment10 = comment9.asComment();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder15.parseFragment("", "", parseErrorList18, parseSettings19);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings25 = xmlTreeBuilder24.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder24.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder30.defaultSettings();
        xmlTreeBuilder24.initialiseParse("", "SYSTEM", parseErrorList29, parseSettings31);
        xmlTreeBuilder15.initialiseParse("Doctype", "PUBLIC", parseErrorList23, parseSettings31);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.ParseSettings parseSettings41 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlTreeBuilder37.parseFragment("", "", parseErrorList40, parseSettings41);
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder46.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder46.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder52 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings53 = xmlTreeBuilder52.defaultSettings();
        xmlTreeBuilder46.initialiseParse("", "SYSTEM", parseErrorList51, parseSettings53);
        xmlTreeBuilder37.initialiseParse("Doctype", "PUBLIC", parseErrorList45, parseSettings53);
        xmlTreeBuilder15.initialiseParse("EndTag", "<!---->", parseErrorList36, parseSettings53);
        org.jsoup.parser.Token.Doctype doctype57 = new org.jsoup.parser.Token.Doctype();
        xmlTreeBuilder15.insert(doctype57);
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder62 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings63 = xmlTreeBuilder62.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings64 = xmlTreeBuilder62.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList67 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder68 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings69 = xmlTreeBuilder68.defaultSettings();
        xmlTreeBuilder62.initialiseParse("", "SYSTEM", parseErrorList67, parseSettings69);
        java.util.List<org.jsoup.nodes.Node> nodeList71 = xmlTreeBuilder15.parseFragment("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", parseErrorList61, parseSettings69);
        org.jsoup.nodes.Document document74 = xmlTreeBuilder15.parse("#doctype", "EndTag");
        org.jsoup.parser.ParseErrorList parseErrorList77 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder78 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings79 = xmlTreeBuilder78.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings80 = xmlTreeBuilder78.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList83 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder84 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings85 = xmlTreeBuilder84.defaultSettings();
        xmlTreeBuilder78.initialiseParse("", "SYSTEM", parseErrorList83, parseSettings85);
        org.jsoup.parser.ParseSettings parseSettings87 = xmlTreeBuilder78.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList88 = xmlTreeBuilder15.parseFragment("comment", "", parseErrorList77, parseSettings87);
        xmlTreeBuilder0.initialiseParse("<!---->", "#endtag", parseErrorList14, parseSettings87);
        org.jsoup.parser.Token.StartTag startTag90 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag91 = startTag90.asStartTag();
        org.jsoup.parser.Token.Tag tag92 = startTag90.reset();
        org.jsoup.parser.Token.Tag tag93 = startTag90.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element94 = xmlTreeBuilder0.insert(startTag90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(nodeList71);
        org.junit.Assert.assertNotNull(document74);
        org.junit.Assert.assertNotNull(parseSettings79);
        org.junit.Assert.assertNotNull(parseSettings80);
        org.junit.Assert.assertNotNull(parseSettings85);
        org.junit.Assert.assertNotNull(parseSettings87);
        org.junit.Assert.assertNotNull(nodeList88);
        org.junit.Assert.assertNotNull(startTag91);
        org.junit.Assert.assertNotNull(tag92);
        org.junit.Assert.assertNotNull(tag93);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        java.lang.String str3 = endTag2.tokenType();
        org.jsoup.parser.Token.EndTag endTag4 = new org.jsoup.parser.Token.EndTag();
        endTag4.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag6 = endTag4.asEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag4.reset();
        tag7.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType10 = endTag9.type;
        org.jsoup.parser.Token.EndTag endTag11 = endTag9.asEndTag();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str17 = documentType16.outerHtml();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        endTag11.attributes = attributes18;
        tag7.attributes = attributes18;
        endTag2.attributes = attributes18;
        endTag2.finaliseTag();
        boolean boolean23 = endTag2.isSelfClosing();
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EndTag" + "'", str3, "EndTag");
        org.junit.Assert.assertNotNull(endTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        int int11 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("SYSTEM");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.parser.Token.EndTag endTag3 = endTag0.asEndTag();
        boolean boolean4 = endTag3.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = endTag3.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(endTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = startTag6.nameAttr("PUBLIC", attributes8);
        boolean boolean10 = documentType4.hasSameValue((java.lang.Object) startTag6);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.after("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.parser.Token.EndTag endTag3 = endTag0.asEndTag();
        boolean boolean4 = endTag3.isEndTag();
        endTag3.appendAttributeValue("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean7 = endTag3.isDoctype();
        java.lang.String str8 = endTag3.tagName;
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(endTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        xmlTreeBuilder0.insert(doctype42);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag44 = doctype42.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        int int11 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("SYSTEM");
        org.jsoup.nodes.Node node15 = node13.removeAttr("a");
        org.jsoup.nodes.Node node16 = node15.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = node16.hasSameValue((java.lang.Object) "<!DOCTYPE EndTag PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Node node45 = document44.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node46 = document44.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(node45);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        endTag0.tagName = "";
        org.jsoup.parser.Token token5 = endTag0.reset();
        boolean boolean6 = endTag0.isDoctype();
        endTag0.appendTagName('a');
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        int int11 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("SYSTEM");
        java.lang.String str15 = documentType4.absUrl("</SYSTEM>");
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.traverse(nodeVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.parser.Token.EndTag endTag3 = endTag0.asEndTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(endTag3);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes2 = null;
        tag1.attributes = attributes2;
        boolean boolean4 = tag1.isSelfClosing();
        boolean boolean5 = tag1.isComment();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        xmlTreeBuilder0.initialiseParse("", "SYSTEM", parseErrorList5, parseSettings7);
        org.jsoup.parser.ParseSettings parseSettings9 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character12 = character10.data("hi!");
        java.lang.String str13 = character10.toString();
        org.jsoup.parser.Token.Character character15 = character10.data("");
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment18 = comment17.asComment();
        java.lang.String str19 = comment18.toString();
        java.lang.StringBuilder stringBuilder20 = comment18.data;
        xmlTreeBuilder0.insert(comment18);
        org.jsoup.nodes.Document document24 = xmlTreeBuilder0.parse("SYSTEM", "");
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node30 = documentType29.parent();
        org.jsoup.parser.Token.Doctype doctype31 = new org.jsoup.parser.Token.Doctype();
        boolean boolean32 = doctype31.forceQuirks;
        java.lang.String str33 = doctype31.tokenType();
        java.lang.StringBuilder stringBuilder34 = doctype31.systemIdentifier;
        boolean boolean35 = documentType29.equals((java.lang.Object) stringBuilder34);
        java.lang.String str36 = documentType29.toString();
        org.jsoup.parser.Token.Doctype doctype37 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str38 = doctype37.getSystemIdentifier();
        boolean boolean39 = doctype37.forceQuirks;
        java.lang.String str40 = doctype37.getPublicIdentifier();
        java.lang.String str41 = doctype37.getSystemIdentifier();
        boolean boolean42 = documentType29.equals((java.lang.Object) doctype37);
        java.lang.String str43 = documentType29.outerHtml();
        org.jsoup.nodes.Node node44 = documentType29.nextSibling();
        boolean boolean45 = document24.hasSameValue((java.lang.Object) documentType29);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = document24.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(character12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(character15);
        org.junit.Assert.assertNotNull(comment18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Doctype" + "'", str33, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str36, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str43, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        xmlTreeBuilder0.insert(doctype42);
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes45 = null;
        startTag44.attributes = attributes45;
        org.jsoup.parser.Token.Tag tag47 = startTag44.reset();
        java.lang.String str48 = startTag44.normalName;
        boolean boolean49 = startTag44.selfClosing;
        startTag44.setEmptyAttributeValue();
        boolean boolean51 = startTag44.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element52 = xmlTreeBuilder0.insert(startTag44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        xmlTreeBuilder6.initialiseParse("", "SYSTEM", parseErrorList11, parseSettings13);
        org.jsoup.parser.Token.Comment comment15 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment16 = comment15.asComment();
        xmlTreeBuilder6.insert(comment15);
        xmlTreeBuilder0.insert(comment15);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder22.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings28 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        xmlTreeBuilder27.initialiseParse("", "SYSTEM", parseErrorList32, parseSettings34);
        xmlTreeBuilder22.initialiseParse("Comment", "Doctype", parseErrorList26, parseSettings34);
        org.jsoup.nodes.DocumentType documentType42 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str43 = documentType42.outerHtml();
        org.jsoup.nodes.Attributes attributes44 = documentType42.attributes();
        org.jsoup.nodes.Attributes attributes45 = documentType42.attributes();
        boolean boolean46 = xmlTreeBuilder22.processStartTag("EndTag", attributes45);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder50.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings52 = xmlTreeBuilder50.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder22.parseFragment("Comment", "#doctype", parseErrorList49, parseSettings52);
        xmlTreeBuilder0.initialiseParse("</Character>", "a", parseErrorList21, parseSettings52);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(comment16);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str43, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(nodeList53);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        java.lang.String str11 = documentType4.toString();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str13 = doctype12.getSystemIdentifier();
        boolean boolean14 = doctype12.forceQuirks;
        java.lang.String str15 = doctype12.getPublicIdentifier();
        java.lang.String str16 = doctype12.getSystemIdentifier();
        boolean boolean17 = documentType4.equals((java.lang.Object) doctype12);
        java.lang.String str18 = documentType4.outerHtml();
        boolean boolean20 = documentType4.hasAttr("a");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node22 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int28 = documentType27.childNodeSize();
        java.lang.String str29 = documentType27.outerHtml();
        org.jsoup.parser.Token.Doctype doctype30 = new org.jsoup.parser.Token.Doctype();
        boolean boolean31 = doctype30.forceQuirks;
        doctype30.forceQuirks = false;
        java.lang.String str34 = doctype30.getName();
        java.lang.StringBuilder stringBuilder35 = doctype30.name;
        java.lang.StringBuilder stringBuilder36 = documentType27.html(stringBuilder35);
        java.lang.String str38 = documentType27.absUrl("PUBLIC");
        java.lang.String str39 = documentType27.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = node22.equals((java.lang.Object) documentType27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str29, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str39, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InTableText;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.nodes.Attributes attributes3 = endTag0.getAttributes();
        endTag0.appendAttributeValue("aa");
        endTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNull(attributes3);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("PUBLIC", "hi!");
        org.jsoup.nodes.Node node8 = document6.removeAttr("PUBLIC");
        int int9 = document6.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = document6.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        org.jsoup.nodes.Node node11 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("comment", "EndTag", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node17 = documentType16.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node11.replaceWith(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedEndTagName;
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
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        boolean boolean3 = endTag0.isComment();
        char[] charArray9 = new char[] { '#', 'a', '4', '#', 'a' };
        endTag0.appendAttributeValue(charArray9);
        boolean boolean11 = endTag0.isEndTag();
        org.jsoup.parser.Token.Tag tag12 = endTag0.reset();
        tag12.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', 'a', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.normalName = "<!DOCTYPE hi! PUBLIC \"hi!\">";
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str10 = documentType9.outerHtml();
        org.jsoup.nodes.Attributes attributes11 = documentType9.attributes();
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.nameAttr("<!DOCTYPE hi! PUBLIC \"hi!\">", attributes11);
        java.lang.String str13 = startTag12.normalName;
        startTag12.setEmptyAttributeValue();
        org.jsoup.parser.Token.EndTag endTag15 = new org.jsoup.parser.Token.EndTag();
        endTag15.appendAttributeValue("EndTag");
        boolean boolean18 = endTag15.isEOF();
        int[] intArray25 = new int[] { 1, (short) 1, 1, (byte) 0, 1, 10 };
        endTag15.appendAttributeValue(intArray25);
        startTag12.appendAttributeValue(intArray25);
        java.lang.String str28 = startTag12.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!doctype hi! public \"hi!\">" + "'", str13, "<!doctype hi! public \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 1, 1, 1, 0, 1, 10 });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<<!DOCTYPE hi! PUBLIC \"hi!\">  name=\"hi!\" publicId=\"hi!\" systemId=\"\">" + "'", str28, "<<!DOCTYPE hi! PUBLIC \"hi!\">  name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder6.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder0.parseFragment("</SYSTEM>", "<a>", parseErrorList5, parseSettings8);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder10.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder15.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder21.defaultSettings();
        xmlTreeBuilder15.initialiseParse("", "SYSTEM", parseErrorList20, parseSettings22);
        xmlTreeBuilder10.initialiseParse("Comment", "Doctype", parseErrorList14, parseSettings22);
        org.jsoup.parser.Token.Character character25 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character27 = character25.data("hi!");
        java.lang.String str28 = character27.toString();
        java.lang.String str29 = character27.getData();
        xmlTreeBuilder10.insert(character27);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder34.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder39.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder39.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder45.defaultSettings();
        xmlTreeBuilder39.initialiseParse("", "SYSTEM", parseErrorList44, parseSettings46);
        xmlTreeBuilder34.initialiseParse("Comment", "Doctype", parseErrorList38, parseSettings46);
        xmlTreeBuilder10.initialiseParse("Doctype", "<!---->", parseErrorList33, parseSettings46);
        org.jsoup.parser.Token.Comment comment50 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment51 = comment50.asComment();
        java.lang.String str52 = comment50.getData();
        java.lang.StringBuilder stringBuilder53 = comment50.data;
        xmlTreeBuilder10.insert(comment50);
        org.jsoup.parser.Token.Character character55 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character57 = character55.data("hi!");
        xmlTreeBuilder10.insert(character57);
        xmlTreeBuilder0.insert(character57);
        org.jsoup.parser.Token.StartTag startTag60 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes61 = null;
        startTag60.attributes = attributes61;
        org.jsoup.parser.Token.Tag tag63 = startTag60.reset();
        java.lang.String str64 = startTag60.normalName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element65 = xmlTreeBuilder0.insert(startTag60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(character27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(comment51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(stringBuilder53);
        org.junit.Assert.assertEquals(stringBuilder53.toString(), "");
        org.junit.Assert.assertNotNull(character57);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.parser.Token.TokenType tokenType4 = org.jsoup.parser.Token.TokenType.Character;
        tag3.type = tokenType4;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype6 = tag3.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str7 = startTag6.normalName;
        startTag6.normalName = "<!DOCTYPE hi! PUBLIC \"hi!\">";
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str16 = documentType15.outerHtml();
        org.jsoup.nodes.Attributes attributes17 = documentType15.attributes();
        org.jsoup.parser.Token.StartTag startTag18 = startTag6.nameAttr("<!DOCTYPE hi! PUBLIC \"hi!\">", attributes17);
        org.jsoup.parser.Token.StartTag startTag19 = startTag0.nameAttr("#doctype", attributes17);
        java.lang.String str20 = startTag19.tagName;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#doctype" + "'", str20, "#doctype");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = startTag6.nameAttr("PUBLIC", attributes8);
        boolean boolean10 = documentType4.hasSameValue((java.lang.Object) startTag6);
        int int11 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "<!---->");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node21 = documentType19.removeAttr("<PUBLIC>");
        org.jsoup.nodes.Document document22 = node21.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node14.before(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(document22);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.parser.Token.Doctype doctype45 = new org.jsoup.parser.Token.Doctype();
        boolean boolean46 = doctype45.forceQuirks;
        java.lang.StringBuilder stringBuilder47 = doctype45.systemIdentifier;
        boolean boolean48 = doctype45.forceQuirks;
        org.jsoup.parser.Token token49 = doctype45.reset();
        xmlTreeBuilder0.insert(doctype45);
        java.lang.StringBuilder stringBuilder51 = doctype45.name;
        org.jsoup.parser.Token.reset(stringBuilder51);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(token49);
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("hi!");
        org.jsoup.parser.Token token3 = character2.reset();
        java.lang.String str4 = character2.getData();
        java.lang.String str5 = character2.toString();
        org.jsoup.parser.Token token6 = character2.reset();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.normalName = "<!DOCTYPE hi! PUBLIC \"hi!\">";
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str10 = documentType9.outerHtml();
        org.jsoup.nodes.Attributes attributes11 = documentType9.attributes();
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.nameAttr("<!DOCTYPE hi! PUBLIC \"hi!\">", attributes11);
        java.lang.String str13 = startTag12.normalName;
        startTag12.setEmptyAttributeValue();
        startTag12.finaliseTag();
        org.jsoup.parser.Token.Tag tag16 = startTag12.reset();
        boolean boolean17 = tag16.selfClosing;
        tag16.appendTagName('#');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!doctype hi! public \"hi!\">" + "'", str13, "<!doctype hi! public \"hi!\">");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList45 = document44.childNodes();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder46.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder46.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder52 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings53 = xmlTreeBuilder52.defaultSettings();
        xmlTreeBuilder46.initialiseParse("", "SYSTEM", parseErrorList51, parseSettings53);
        org.jsoup.parser.Token.Comment comment55 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment56 = comment55.asComment();
        xmlTreeBuilder46.insert(comment55);
        org.jsoup.parser.ParseSettings parseSettings58 = xmlTreeBuilder46.defaultSettings();
        org.jsoup.nodes.Document document61 = xmlTreeBuilder46.parse("EndTag", "</SYSTEM>");
        // The following exception was thrown during execution in test generation
        try {
            document44.replaceWith((org.jsoup.nodes.Node) document61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNotNull(comment56);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(document61);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        endTag0.appendAttributeName("hi!");
        endTag0.appendTagName('#');
        endTag0.appendTagName("EndTag");
        org.jsoup.nodes.Attributes attributes8 = endTag0.getAttributes();
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNull(attributes8);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Document document45 = document44.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = document44.childNodes();
        org.jsoup.nodes.Node node47 = document44.clone();
        org.jsoup.nodes.Node node48 = null;
        // The following exception was thrown during execution in test generation
        try {
            node47.replaceWith(node48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(node47);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        java.lang.String str3 = endTag2.tokenType();
        org.jsoup.parser.Token.EndTag endTag4 = new org.jsoup.parser.Token.EndTag();
        endTag4.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag6 = endTag4.asEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag4.reset();
        tag7.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType10 = endTag9.type;
        org.jsoup.parser.Token.EndTag endTag11 = endTag9.asEndTag();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str17 = documentType16.outerHtml();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        endTag11.attributes = attributes18;
        tag7.attributes = attributes18;
        endTag2.attributes = attributes18;
        endTag2.newAttribute();
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EndTag" + "'", str3, "EndTag");
        org.junit.Assert.assertNotNull(endTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        java.lang.String str6 = documentType4.toString();
        boolean boolean8 = documentType4.hasAttr("Comment");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder9.parseFragment("", "", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder18.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder18.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings25 = xmlTreeBuilder24.defaultSettings();
        xmlTreeBuilder18.initialiseParse("", "SYSTEM", parseErrorList23, parseSettings25);
        xmlTreeBuilder9.initialiseParse("Doctype", "PUBLIC", parseErrorList17, parseSettings25);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.ParseSettings parseSettings35 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder31.parseFragment("", "", parseErrorList34, parseSettings35);
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder40.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder40.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder46.defaultSettings();
        xmlTreeBuilder40.initialiseParse("", "SYSTEM", parseErrorList45, parseSettings47);
        xmlTreeBuilder31.initialiseParse("Doctype", "PUBLIC", parseErrorList39, parseSettings47);
        xmlTreeBuilder9.initialiseParse("EndTag", "<!---->", parseErrorList30, parseSettings47);
        org.jsoup.parser.Token.Doctype doctype51 = new org.jsoup.parser.Token.Doctype();
        xmlTreeBuilder9.insert(doctype51);
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder56.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings58 = xmlTreeBuilder56.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder62 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings63 = xmlTreeBuilder62.defaultSettings();
        xmlTreeBuilder56.initialiseParse("", "SYSTEM", parseErrorList61, parseSettings63);
        java.util.List<org.jsoup.nodes.Node> nodeList65 = xmlTreeBuilder9.parseFragment("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", parseErrorList55, parseSettings63);
        org.jsoup.nodes.Document document68 = xmlTreeBuilder9.parse("#doctype", "EndTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node69 = documentType4.before((org.jsoup.nodes.Node) document68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(nodeList65);
        org.junit.Assert.assertNotNull(document68);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("EndTag", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType19.siblingNodes();
        boolean boolean21 = documentType4.equals((java.lang.Object) documentType19);
        org.jsoup.nodes.Node node23 = documentType4.removeAttr("a");
        org.jsoup.nodes.Node node24 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType4.before("</SYSTEM>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        java.lang.String str15 = documentType4.absUrl("PUBLIC");
        org.jsoup.nodes.Node node17 = documentType4.removeAttr("<SYSTEM>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.before("#EndTag");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue("EndTag");
        endTag0.appendAttributeValue('a');
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.clone();
        org.jsoup.nodes.Node node13 = node12.clone();
        org.jsoup.nodes.Node node14 = node13.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node14.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        boolean boolean4 = startTag0.selfClosing;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        boolean boolean2 = endTag0.isCharacter();
        java.lang.String str3 = endTag0.normalName();
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        endTag0.tagName = "";
        org.jsoup.parser.Token token5 = endTag0.reset();
        endTag0.finaliseTag();
        java.lang.String str7 = endTag0.tagName;
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        java.lang.String str3 = endTag0.normalName;
        endTag0.appendTagName("EndTag");
        boolean boolean6 = endTag0.isDoctype();
        org.jsoup.parser.Token token7 = endTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character8 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.clone();
        org.jsoup.nodes.Node node13 = documentType4.clone();
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder15.parseFragment("", "", parseErrorList18, parseSettings19);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings25 = xmlTreeBuilder24.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder24.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder30.defaultSettings();
        xmlTreeBuilder24.initialiseParse("", "SYSTEM", parseErrorList29, parseSettings31);
        xmlTreeBuilder15.initialiseParse("Doctype", "PUBLIC", parseErrorList23, parseSettings31);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.ParseSettings parseSettings41 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlTreeBuilder37.parseFragment("", "", parseErrorList40, parseSettings41);
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder46.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder46.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder52 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings53 = xmlTreeBuilder52.defaultSettings();
        xmlTreeBuilder46.initialiseParse("", "SYSTEM", parseErrorList51, parseSettings53);
        xmlTreeBuilder37.initialiseParse("Doctype", "PUBLIC", parseErrorList45, parseSettings53);
        xmlTreeBuilder15.initialiseParse("EndTag", "<!---->", parseErrorList36, parseSettings53);
        org.jsoup.nodes.Document document59 = xmlTreeBuilder15.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Node node60 = document59.parentNode();
        java.lang.String str61 = document59.toString();
        org.jsoup.nodes.Node node62 = document59.clone();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "<!---->" + "'", str61, "<!---->");
        org.junit.Assert.assertNotNull(node62);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        int int11 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("SYSTEM");
        org.jsoup.nodes.Node node15 = node13.removeAttr("a");
        int int16 = node13.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node13.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment1 = comment0.asComment();
        java.lang.String str2 = comment1.toString();
        java.lang.StringBuilder stringBuilder3 = comment1.data;
        comment1.bogus = false;
        java.lang.StringBuilder stringBuilder6 = comment1.data;
        org.jsoup.parser.Token token7 = comment1.reset();
        java.lang.String str8 = comment1.getData();
        org.jsoup.parser.Token.Comment comment9 = comment1.asComment();
        org.jsoup.parser.Token token10 = comment9.reset();
        org.junit.Assert.assertNotNull(comment1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(comment9);
        org.junit.Assert.assertNotNull(token10);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        xmlTreeBuilder0.initialiseParse("", "SYSTEM", parseErrorList5, parseSettings7);
        org.jsoup.parser.ParseSettings parseSettings9 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character12 = character10.data("hi!");
        java.lang.String str13 = character10.toString();
        org.jsoup.parser.Token.Character character15 = character10.data("");
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment18 = comment17.asComment();
        java.lang.String str19 = comment18.toString();
        java.lang.StringBuilder stringBuilder20 = comment18.data;
        xmlTreeBuilder0.insert(comment18);
        org.jsoup.nodes.Document document24 = xmlTreeBuilder0.parse("SYSTEM", "");
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node30 = documentType29.parent();
        org.jsoup.parser.Token.Doctype doctype31 = new org.jsoup.parser.Token.Doctype();
        boolean boolean32 = doctype31.forceQuirks;
        java.lang.String str33 = doctype31.tokenType();
        java.lang.StringBuilder stringBuilder34 = doctype31.systemIdentifier;
        boolean boolean35 = documentType29.equals((java.lang.Object) stringBuilder34);
        java.lang.String str36 = documentType29.toString();
        org.jsoup.parser.Token.Doctype doctype37 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str38 = doctype37.getSystemIdentifier();
        boolean boolean39 = doctype37.forceQuirks;
        java.lang.String str40 = doctype37.getPublicIdentifier();
        java.lang.String str41 = doctype37.getSystemIdentifier();
        boolean boolean42 = documentType29.equals((java.lang.Object) doctype37);
        java.lang.String str43 = documentType29.outerHtml();
        org.jsoup.nodes.Node node44 = documentType29.nextSibling();
        boolean boolean45 = document24.hasSameValue((java.lang.Object) documentType29);
        org.jsoup.nodes.Node node46 = documentType29.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = node46.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(character12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(character15);
        org.junit.Assert.assertNotNull(comment18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Doctype" + "'", str33, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str36, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str43, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        java.lang.String str4 = startTag0.normalName;
        boolean boolean5 = startTag0.selfClosing;
        startTag0.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str8 = documentType7.outerHtml();
        org.jsoup.nodes.Attributes attributes9 = documentType7.attributes();
        endTag2.attributes = attributes9;
        org.jsoup.nodes.Attributes attributes11 = endTag2.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment12 = endTag2.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        int int11 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("SYSTEM");
        org.jsoup.nodes.Node node15 = node13.removeAttr("a");
        org.jsoup.nodes.Node node16 = node15.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        boolean boolean2 = endTag0.isCharacter();
        boolean boolean3 = endTag0.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character4 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Document document45 = document44.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = document44.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = document44.siblingNodes();
        java.lang.String str48 = document44.baseUri();
        org.jsoup.nodes.DocumentType documentType53 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str54 = documentType53.outerHtml();
        org.jsoup.nodes.Attributes attributes55 = documentType53.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList56 = documentType53.childNodes();
        boolean boolean58 = documentType53.hasAttr("SYSTEM");
        org.jsoup.nodes.Attributes attributes59 = documentType53.attributes();
        org.jsoup.nodes.Node node62 = documentType53.attr("aa", "comment");
        java.util.List<org.jsoup.nodes.Node> nodeList63 = node62.childNodesCopy();
        java.lang.String str65 = node62.attr("4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node66 = document44.after(node62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "SYSTEM" + "'", str48, "SYSTEM");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str54, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(attributes59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        int int11 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("SYSTEM");
        org.jsoup.nodes.Node node15 = node13.removeAttr("a");
        java.lang.Object obj16 = null;
        boolean boolean17 = node15.equals(obj16);
        org.jsoup.nodes.Document document18 = node15.ownerDocument();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("EndTag", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
        int int6 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.after("comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        java.lang.String str3 = endTag0.normalName;
        endTag0.appendTagName("EndTag");
        boolean boolean6 = endTag0.isDoctype();
        org.jsoup.nodes.Attributes attributes7 = endTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = startTag8.nameAttr("PUBLIC", attributes10);
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str18 = documentType17.outerHtml();
        org.jsoup.nodes.Attributes attributes19 = documentType17.attributes();
        org.jsoup.parser.Token.StartTag startTag20 = startTag8.nameAttr("Comment", attributes19);
        endTag0.attributes = attributes19;
        java.lang.String str22 = endTag0.name();
        java.lang.Class<?> wildcardClass23 = endTag0.getClass();
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EndTag" + "'", str22, "EndTag");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = document10.wrap("aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token token6 = doctype0.reset();
        org.jsoup.parser.Token token7 = token6.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.clone();
        org.jsoup.nodes.Node node13 = documentType4.clone();
        java.lang.String str14 = documentType4.nodeName();
        int int15 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node21 = documentType20.parent();
        org.jsoup.parser.Token.Doctype doctype22 = new org.jsoup.parser.Token.Doctype();
        boolean boolean23 = doctype22.forceQuirks;
        java.lang.String str24 = doctype22.tokenType();
        java.lang.StringBuilder stringBuilder25 = doctype22.systemIdentifier;
        boolean boolean26 = documentType20.equals((java.lang.Object) stringBuilder25);
        int int27 = documentType20.siblingIndex();
        org.jsoup.nodes.Node node29 = documentType20.removeAttr("SYSTEM");
        org.jsoup.nodes.Node node31 = node29.removeAttr("a");
        org.jsoup.nodes.Node node32 = node31.nextSibling();
        org.jsoup.nodes.Node node33 = node31.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = documentType4.after(node31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Doctype" + "'", str24, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InRow;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.parser.Token.Doctype doctype45 = new org.jsoup.parser.Token.Doctype();
        boolean boolean46 = doctype45.forceQuirks;
        java.lang.StringBuilder stringBuilder47 = doctype45.systemIdentifier;
        boolean boolean48 = doctype45.forceQuirks;
        org.jsoup.parser.Token token49 = doctype45.reset();
        xmlTreeBuilder0.insert(doctype45);
        org.jsoup.nodes.Document document53 = xmlTreeBuilder0.parse("SYSTEM", "<a>");
        int int54 = document53.siblingIndex();
        org.jsoup.nodes.Node node56 = document53.removeAttr("<SYSTEM>");
        java.lang.String str58 = document53.absUrl("comment");
        java.lang.String str59 = document53.toString();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(token49);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "SYSTEM" + "'", str59, "SYSTEM");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("<PUBLIC>", "hi!");
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node12 = documentType11.parent();
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        boolean boolean14 = doctype13.forceQuirks;
        java.lang.String str15 = doctype13.tokenType();
        java.lang.StringBuilder stringBuilder16 = doctype13.systemIdentifier;
        boolean boolean17 = documentType11.equals((java.lang.Object) stringBuilder16);
        java.lang.String str18 = documentType11.toString();
        org.jsoup.nodes.Node node19 = documentType11.clone();
        org.jsoup.nodes.Node node20 = documentType11.clone();
        // The following exception was thrown during execution in test generation
        try {
            document6.replaceWith((org.jsoup.nodes.Node) documentType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Doctype" + "'", str15, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Node node45 = document44.parentNode();
        java.lang.String str46 = document44.toString();
        org.jsoup.nodes.Node node47 = document44.clone();
        org.jsoup.parser.Token.EndTag endTag48 = new org.jsoup.parser.Token.EndTag();
        endTag48.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag50 = endTag48.asEndTag();
        endTag48.tagName = "";
        org.jsoup.parser.Token token53 = endTag48.reset();
        endTag48.finaliseTag();
        java.lang.String str55 = endTag48.normalName;
        boolean boolean56 = node47.hasSameValue((java.lang.Object) endTag48);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node58 = node47.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!---->" + "'", str46, "<!---->");
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(endTag50);
        org.junit.Assert.assertNotNull(token53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = node6.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("EndTag", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType19.siblingNodes();
        boolean boolean21 = documentType4.equals((java.lang.Object) documentType19);
        int int22 = documentType4.siblingIndex();
        boolean boolean24 = documentType4.hasAttr("EndTag");
        java.lang.String str25 = documentType4.toString();
        int int26 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node32 = documentType31.parentNode();
        java.lang.String str33 = documentType31.nodeName();
        org.jsoup.parser.Token.Doctype doctype34 = new org.jsoup.parser.Token.Doctype();
        boolean boolean35 = doctype34.forceQuirks;
        java.lang.String str36 = doctype34.tokenType();
        boolean boolean37 = doctype34.forceQuirks;
        java.lang.String str38 = doctype34.getName();
        java.lang.StringBuilder stringBuilder39 = doctype34.systemIdentifier;
        doctype34.forceQuirks = false;
        java.lang.StringBuilder stringBuilder42 = doctype34.systemIdentifier;
        boolean boolean43 = documentType31.equals((java.lang.Object) stringBuilder42);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str25, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#doctype" + "'", str33, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Doctype" + "'", str36, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        startTag0.appendAttributeValue(' ');
        char[] charArray9 = new char[] { ' ', '4', '#' };
        startTag0.appendAttributeValue(charArray9);
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.asStartTag();
        org.jsoup.nodes.Attributes attributes12 = startTag0.attributes;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '4', '#' });
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNull(attributes12);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InTableText;
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType2 = endTag1.type;
        endTag1.appendAttributeName("hi!");
        endTag1.appendTagName('#');
        endTag1.appendTagName("EndTag");
        java.lang.String str9 = endTag1.normalName;
        endTag1.appendAttributeValue('#');
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) endTag1, htmlTreeBuilder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#endtag" + "'", str9, "#endtag");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = startTag6.nameAttr("PUBLIC", attributes8);
        boolean boolean10 = documentType4.hasSameValue((java.lang.Object) startTag6);
        int int11 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int17 = documentType16.childNodeSize();
        java.lang.String str18 = documentType16.outerHtml();
        org.jsoup.parser.Token.Doctype doctype19 = new org.jsoup.parser.Token.Doctype();
        boolean boolean20 = doctype19.forceQuirks;
        doctype19.forceQuirks = false;
        java.lang.String str23 = doctype19.getName();
        java.lang.StringBuilder stringBuilder24 = doctype19.name;
        java.lang.StringBuilder stringBuilder25 = documentType16.html(stringBuilder24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType4.before((org.jsoup.nodes.Node) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        boolean boolean15 = doctype14.forceQuirks;
        doctype14.forceQuirks = false;
        java.lang.String str18 = doctype14.getName();
        java.lang.StringBuilder stringBuilder19 = doctype14.name;
        boolean boolean20 = doctype14.isForceQuirks();
        boolean boolean21 = documentType4.equals((java.lang.Object) doctype14);
        java.lang.String str22 = documentType4.outerHtml();
        java.lang.String str24 = documentType4.absUrl("Character");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str22, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        java.lang.String str4 = startTag0.normalName;
        boolean boolean5 = startTag0.selfClosing;
        startTag0.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes7 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = tag8.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.appendAttributeValue('4');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment4 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        java.lang.String str6 = documentType4.toString();
        boolean boolean8 = documentType4.hasAttr("Comment");
        java.lang.String str10 = documentType4.absUrl("EndTag");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("EndTag", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        java.lang.String str7 = documentType4.attr("<EndTag  name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
        boolean boolean9 = documentType4.hasAttr("</Character>");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int16 = documentType15.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag();
        endTag1.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag3 = endTag1.asEndTag();
        boolean boolean4 = endTag3.isComment();
        java.lang.String str5 = endTag3.normalName();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = null;
        boolean boolean7 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) endTag3, htmlTreeBuilder6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype8 = endTag3.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(endTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<PUBLIC>");
        org.jsoup.nodes.Document document7 = node6.ownerDocument();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node13 = documentType12.parent();
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        boolean boolean15 = doctype14.forceQuirks;
        java.lang.String str16 = doctype14.tokenType();
        java.lang.StringBuilder stringBuilder17 = doctype14.systemIdentifier;
        boolean boolean18 = documentType12.equals((java.lang.Object) stringBuilder17);
        org.jsoup.nodes.Node node20 = documentType12.removeAttr("PUBLIC");
        // The following exception was thrown during execution in test generation
        try {
            node6.replaceWith(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Doctype" + "'", str16, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Node node45 = document44.parentNode();
        java.lang.String str46 = document44.toString();
        org.jsoup.nodes.Node node47 = document44.clone();
        org.jsoup.select.NodeVisitor nodeVisitor48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node49 = document44.traverse(nodeVisitor48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!---->" + "'", str46, "<!---->");
        org.junit.Assert.assertNotNull(node47);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        xmlTreeBuilder0.initialiseParse("", "SYSTEM", parseErrorList5, parseSettings7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment10 = comment9.asComment();
        xmlTreeBuilder0.insert(comment9);
        boolean boolean12 = comment9.bogus;
        java.lang.StringBuilder stringBuilder13 = comment9.data;
        org.jsoup.parser.Token.reset(stringBuilder13);
        org.jsoup.parser.Token.reset(stringBuilder13);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        startTag0.appendAttributeValue(' ');
        char[] charArray9 = new char[] { ' ', '4', '#' };
        startTag0.appendAttributeValue(charArray9);
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.asStartTag();
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType14 = endTag13.type;
        org.jsoup.parser.Token.EndTag endTag15 = endTag13.asEndTag();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str21 = documentType20.outerHtml();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        endTag15.attributes = attributes22;
        org.jsoup.nodes.Attributes attributes24 = endTag15.getAttributes();
        org.jsoup.parser.Token.StartTag startTag25 = startTag0.nameAttr("hi!", attributes24);
        org.jsoup.parser.Token.Tag tag26 = startTag25.reset();
        java.lang.String str27 = tag26.normalName();
        java.lang.String str28 = tag26.tokenType();
        java.lang.Class<?> wildcardClass29 = tag26.getClass();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '4', '#' });
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "StartTag" + "'", str28, "StartTag");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("PUBLIC", "hi!");
        org.jsoup.nodes.Node node8 = document6.removeAttr("PUBLIC");
        int int9 = document6.siblingIndex();
        java.lang.String str10 = document6.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document6.childNodes();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings14 = xmlTreeBuilder12.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder12.defaultSettings();
        org.jsoup.nodes.Document document18 = xmlTreeBuilder12.parse("PUBLIC", "hi!");
        org.jsoup.nodes.Node node20 = document18.removeAttr("PUBLIC");
        int int21 = document18.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = document6.after((org.jsoup.nodes.Node) document18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PUBLIC" + "'", str10, "PUBLIC");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "PUBLIC", "#doctype", "");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("SYSTEM");
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.ParseSettings parseSettings12 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlTreeBuilder8.parseFragment("", "", parseErrorList11, parseSettings12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder20.defaultSettings();
        xmlTreeBuilder14.initialiseParse("", "SYSTEM", parseErrorList19, parseSettings21);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment24 = comment23.asComment();
        xmlTreeBuilder14.insert(comment23);
        xmlTreeBuilder8.insert(comment23);
        boolean boolean27 = documentType4.equals((java.lang.Object) xmlTreeBuilder8);
        org.jsoup.parser.TokeniserState tokeniserState28 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapeEnd;
        boolean boolean29 = documentType4.hasSameValue((java.lang.Object) tokeniserState28);
        java.lang.String str30 = documentType4.baseUri();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">" + "'", str7, "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(comment24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        java.lang.String str3 = endTag2.tokenType();
        boolean boolean4 = endTag2.isEOF();
        java.lang.Class<?> wildcardClass5 = endTag2.getClass();
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EndTag" + "'", str3, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("a", "#doctype", "Comment", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str6 = documentType4.attr("#doctype");
        java.lang.String str7 = documentType4.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE a PUBLIC \"#doctype\" \"Comment\">" + "'", str7, "<!DOCTYPE a PUBLIC \"#doctype\" \"Comment\">");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("PUBLIC", "hi!");
        org.jsoup.nodes.Node node8 = document6.removeAttr("PUBLIC");
        int int9 = document6.siblingIndex();
        java.lang.String str10 = document6.toString();
        org.jsoup.nodes.Node node11 = document6.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = document6.after("Comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PUBLIC" + "'", str10, "PUBLIC");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = node9.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        boolean boolean2 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag4 = startTag0.name("a");
        java.lang.String str5 = tag4.tagName;
        java.lang.String str6 = tag4.tokenType();
        java.lang.String str7 = tag4.name();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str7 = documentType4.absUrl("PUBLIC");
        int int8 = documentType4.childNodeSize();
        boolean boolean10 = documentType4.hasSameValue((java.lang.Object) (-1.0d));
        org.jsoup.parser.Token.Doctype doctype11 = new org.jsoup.parser.Token.Doctype();
        boolean boolean12 = doctype11.forceQuirks;
        doctype11.forceQuirks = false;
        java.lang.String str15 = doctype11.getName();
        java.lang.String str16 = doctype11.getName();
        boolean boolean17 = doctype11.isForceQuirks();
        org.jsoup.parser.Token token18 = doctype11.reset();
        boolean boolean19 = documentType4.equals((java.lang.Object) doctype11);
        org.jsoup.nodes.Node node20 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node20.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(token18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        boolean boolean3 = character0.isCharacter();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        xmlTreeBuilder0.initialiseParse("", "SYSTEM", parseErrorList5, parseSettings7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder17.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder17.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings24 = xmlTreeBuilder23.defaultSettings();
        xmlTreeBuilder17.initialiseParse("", "SYSTEM", parseErrorList22, parseSettings24);
        xmlTreeBuilder12.initialiseParse("Comment", "Doctype", parseErrorList16, parseSettings24);
        org.jsoup.parser.Token.Character character27 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character29 = character27.data("hi!");
        java.lang.String str30 = character29.toString();
        java.lang.String str31 = character29.getData();
        xmlTreeBuilder12.insert(character29);
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder36.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder36.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings43 = xmlTreeBuilder42.defaultSettings();
        xmlTreeBuilder36.initialiseParse("", "SYSTEM", parseErrorList41, parseSettings43);
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder36.defaultSettings();
        org.jsoup.parser.Token.Character character46 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character48 = character46.data("hi!");
        java.lang.String str49 = character46.toString();
        org.jsoup.parser.Token.Character character51 = character46.data("");
        xmlTreeBuilder36.insert(character51);
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder56.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings58 = xmlTreeBuilder56.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder56.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder36.parseFragment("<SYSTEM>", "<a>", parseErrorList55, parseSettings59);
        java.util.List<org.jsoup.nodes.Node> nodeList61 = xmlTreeBuilder12.parseFragment("<a>", "Character", parseErrorList35, parseSettings59);
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder0.parseFragment("StartTag", "Character", parseErrorList11, parseSettings59);
        org.jsoup.parser.Token.StartTag startTag63 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes64 = null;
        startTag63.attributes = attributes64;
        org.jsoup.parser.Token.Tag tag66 = startTag63.reset();
        startTag63.setEmptyAttributeValue();
        startTag63.tagName = "<PUBLIC>";
        java.lang.String str70 = startTag63.toString();
        org.jsoup.nodes.DocumentType documentType76 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str77 = documentType76.outerHtml();
        org.jsoup.nodes.Attributes attributes78 = documentType76.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList79 = documentType76.childNodes();
        boolean boolean81 = documentType76.hasAttr("SYSTEM");
        org.jsoup.nodes.Attributes attributes82 = documentType76.attributes();
        org.jsoup.parser.Token.StartTag startTag83 = startTag63.nameAttr("", attributes82);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element84 = xmlTreeBuilder0.insert(startTag63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(character29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(character48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(character51);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "<<PUBLIC>>" + "'", str70, "<<PUBLIC>>");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str77, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes78);
        org.junit.Assert.assertNotNull(nodeList79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(attributes82);
        org.junit.Assert.assertNotNull(startTag83);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder11.defaultSettings();
        xmlTreeBuilder5.initialiseParse("", "SYSTEM", parseErrorList10, parseSettings12);
        xmlTreeBuilder0.initialiseParse("Comment", "Doctype", parseErrorList4, parseSettings12);
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str21 = documentType20.outerHtml();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        boolean boolean24 = xmlTreeBuilder0.processStartTag("EndTag", attributes23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder28.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder28.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("Comment", "#doctype", parseErrorList27, parseSettings30);
        org.jsoup.parser.Token.Comment comment32 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment33 = comment32.asComment();
        org.jsoup.parser.Token token34 = comment33.reset();
        comment33.bogus = false;
        org.jsoup.parser.Token token37 = comment33.reset();
        xmlTreeBuilder0.insert(comment33);
        org.jsoup.nodes.Document document41 = xmlTreeBuilder0.parse("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder45.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder50.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings52 = xmlTreeBuilder50.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder56.defaultSettings();
        xmlTreeBuilder50.initialiseParse("", "SYSTEM", parseErrorList55, parseSettings57);
        xmlTreeBuilder45.initialiseParse("Comment", "Doctype", parseErrorList49, parseSettings57);
        org.jsoup.parser.Token.Character character60 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character62 = character60.data("hi!");
        java.lang.String str63 = character62.toString();
        java.lang.String str64 = character62.getData();
        xmlTreeBuilder45.insert(character62);
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder69 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings70 = xmlTreeBuilder69.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings71 = xmlTreeBuilder69.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList74 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder75 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings76 = xmlTreeBuilder75.defaultSettings();
        xmlTreeBuilder69.initialiseParse("", "SYSTEM", parseErrorList74, parseSettings76);
        org.jsoup.parser.ParseSettings parseSettings78 = xmlTreeBuilder69.defaultSettings();
        org.jsoup.parser.Token.Character character79 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character81 = character79.data("hi!");
        java.lang.String str82 = character79.toString();
        org.jsoup.parser.Token.Character character84 = character79.data("");
        xmlTreeBuilder69.insert(character84);
        org.jsoup.parser.ParseErrorList parseErrorList88 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder89 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings90 = xmlTreeBuilder89.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings91 = xmlTreeBuilder89.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings92 = xmlTreeBuilder89.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList93 = xmlTreeBuilder69.parseFragment("<SYSTEM>", "<a>", parseErrorList88, parseSettings92);
        java.util.List<org.jsoup.nodes.Node> nodeList94 = xmlTreeBuilder45.parseFragment("<a>", "Character", parseErrorList68, parseSettings92);
        xmlTreeBuilder0.initialiseParse("<Comment   name=\"hi!\" publicId=\"hi!\" systemId=\"\">", "</Character>", parseErrorList44, parseSettings92);
        org.jsoup.parser.Token.Comment comment96 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(comment33);
        org.junit.Assert.assertNotNull(token34);
        org.junit.Assert.assertNotNull(token37);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(character62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNotNull(parseSettings71);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(parseSettings78);
        org.junit.Assert.assertNotNull(character81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(character84);
        org.junit.Assert.assertNotNull(parseSettings90);
        org.junit.Assert.assertNotNull(parseSettings91);
        org.junit.Assert.assertNotNull(parseSettings92);
        org.junit.Assert.assertNotNull(nodeList93);
        org.junit.Assert.assertNotNull(nodeList94);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str6 = documentType4.absUrl("EndTag");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.ParseSettings parseSettings12 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlTreeBuilder8.parseFragment("", "", parseErrorList11, parseSettings12);
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder17.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder17.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings24 = xmlTreeBuilder23.defaultSettings();
        xmlTreeBuilder17.initialiseParse("", "SYSTEM", parseErrorList22, parseSettings24);
        xmlTreeBuilder8.initialiseParse("Doctype", "PUBLIC", parseErrorList16, parseSettings24);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder30.parseFragment("", "", parseErrorList33, parseSettings34);
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder39.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder39.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder45.defaultSettings();
        xmlTreeBuilder39.initialiseParse("", "SYSTEM", parseErrorList44, parseSettings46);
        xmlTreeBuilder30.initialiseParse("Doctype", "PUBLIC", parseErrorList38, parseSettings46);
        xmlTreeBuilder8.initialiseParse("EndTag", "<!---->", parseErrorList29, parseSettings46);
        org.jsoup.nodes.Document document52 = xmlTreeBuilder8.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Document document53 = document52.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList54 = document52.childNodes();
        org.jsoup.parser.Token.Doctype doctype55 = new org.jsoup.parser.Token.Doctype();
        boolean boolean56 = doctype55.forceQuirks;
        java.lang.String str57 = doctype55.tokenType();
        java.lang.StringBuilder stringBuilder58 = doctype55.systemIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder58);
        java.lang.StringBuilder stringBuilder60 = document52.html(stringBuilder58);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node61 = documentType4.before((org.jsoup.nodes.Node) document52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Doctype" + "'", str57, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder58);
        org.junit.Assert.assertEquals(stringBuilder58.toString(), "\n<!---->");
        org.junit.Assert.assertNotNull(stringBuilder60);
        org.junit.Assert.assertEquals(stringBuilder60.toString(), "\n<!---->");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("EndTag", "", "StartTag", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("</SYSTEM>");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node6.childNodes();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendTagName('4');
        boolean boolean3 = endTag0.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.nodes.Attributes attributes3 = endTag0.getAttributes();
        boolean boolean4 = endTag0.isStartTag();
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        xmlTreeBuilder0.insert(doctype42);
        boolean boolean44 = doctype42.isStartTag();
        boolean boolean45 = doctype42.isComment();
        boolean boolean46 = doctype42.forceQuirks;
        java.lang.StringBuilder stringBuilder47 = doctype42.name;
        boolean boolean48 = doctype42.isDoctype();
        boolean boolean49 = doctype42.isCharacter();
        doctype42.forceQuirks = false;
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder11.defaultSettings();
        xmlTreeBuilder5.initialiseParse("", "SYSTEM", parseErrorList10, parseSettings12);
        xmlTreeBuilder0.initialiseParse("Comment", "Doctype", parseErrorList4, parseSettings12);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character17 = character15.data("hi!");
        java.lang.String str18 = character17.toString();
        java.lang.String str19 = character17.getData();
        xmlTreeBuilder0.insert(character17);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings25 = xmlTreeBuilder24.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        xmlTreeBuilder29.initialiseParse("", "SYSTEM", parseErrorList34, parseSettings36);
        xmlTreeBuilder24.initialiseParse("Comment", "Doctype", parseErrorList28, parseSettings36);
        xmlTreeBuilder0.initialiseParse("Doctype", "<!---->", parseErrorList23, parseSettings36);
        org.jsoup.parser.Token.Comment comment40 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment41 = comment40.asComment();
        java.lang.String str42 = comment40.getData();
        java.lang.StringBuilder stringBuilder43 = comment40.data;
        xmlTreeBuilder0.insert(comment40);
        org.jsoup.parser.Token.Character character45 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character47 = character45.data("hi!");
        xmlTreeBuilder0.insert(character47);
        org.jsoup.parser.Token.Character character49 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character51 = character49.data("hi!");
        java.lang.String str52 = character51.getData();
        org.jsoup.parser.Token.Character character54 = character51.data("");
        org.jsoup.parser.Token.Character character56 = character51.data("<!doctype hi! public \"hi!\">");
        org.jsoup.parser.Token.Character character58 = character51.data("comment");
        xmlTreeBuilder0.insert(character58);
        org.jsoup.parser.ParseSettings parseSettings60 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(character17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(comment41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals(stringBuilder43.toString(), "");
        org.junit.Assert.assertNotNull(character47);
        org.junit.Assert.assertNotNull(character51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(character54);
        org.junit.Assert.assertNotNull(character56);
        org.junit.Assert.assertNotNull(character58);
        org.junit.Assert.assertNotNull(parseSettings60);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Document document45 = document44.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = document44.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = document44.siblingNodes();
        boolean boolean49 = document44.hasAttr("comment");
        java.lang.String str51 = document44.attr("<EndTag  name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
        org.jsoup.nodes.Node node52 = document44.parent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = node52.hasAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNull(node52);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag1 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        startTag0.appendTagName("hi!");
        startTag0.normalName = "SYSTEM";
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag9 = tag7.name("<!---->");
        org.junit.Assert.assertNotNull(startTag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        xmlTreeBuilder0.insert(doctype42);
        boolean boolean44 = doctype42.isStartTag();
        boolean boolean45 = doctype42.isComment();
        boolean boolean46 = doctype42.forceQuirks;
        java.lang.StringBuilder stringBuilder47 = doctype42.name;
        boolean boolean48 = doctype42.isDoctype();
        java.lang.StringBuilder stringBuilder49 = doctype42.name;
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(stringBuilder49);
        org.junit.Assert.assertEquals(stringBuilder49.toString(), "");
    }
}

